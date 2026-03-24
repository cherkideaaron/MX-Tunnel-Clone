package defpackage;

import android.os.SystemClock;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: Yg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0427Yg {
    public final File c;
    public final LinkedHashMap a = new LinkedHashMap(16, 0.75f, true);
    public long b = 0;
    public final int d = 5242880;

    public C0427Yg(File file) {
        this.c = file;
    }

    public static String b(String str) {
        int length = str.length() / 2;
        StringBuilder sbN = AbstractC3264qG.n(String.valueOf(str.substring(0, length).hashCode()));
        sbN.append(String.valueOf(str.substring(length).hashCode()));
        return sbN.toString();
    }

    public static int f(FilterInputStream filterInputStream) throws IOException {
        int i = filterInputStream.read();
        if (i != -1) {
            return i;
        }
        throw new EOFException();
    }

    public static int g(FilterInputStream filterInputStream) {
        return (f(filterInputStream) << 24) | f(filterInputStream) | (f(filterInputStream) << 8) | (f(filterInputStream) << 16);
    }

    public static long h(FilterInputStream filterInputStream) {
        return (f(filterInputStream) & 255) | ((f(filterInputStream) & 255) << 8) | ((f(filterInputStream) & 255) << 16) | ((f(filterInputStream) & 255) << 24) | ((f(filterInputStream) & 255) << 32) | ((f(filterInputStream) & 255) << 40) | ((f(filterInputStream) & 255) << 48) | ((255 & f(filterInputStream)) << 56);
    }

    public static String i(FilterInputStream filterInputStream) {
        return new String(k(filterInputStream, (int) h(filterInputStream)), "UTF-8");
    }

    public static byte[] k(FilterInputStream filterInputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = filterInputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                break;
            }
            i2 += i3;
        }
        if (i2 == i) {
            return bArr;
        }
        throw new IOException("Expected " + i + " bytes, read " + i2 + " bytes");
    }

    public static void l(BufferedOutputStream bufferedOutputStream, int i) {
        bufferedOutputStream.write(i & 255);
        bufferedOutputStream.write((i >> 8) & 255);
        bufferedOutputStream.write((i >> 16) & 255);
        bufferedOutputStream.write((i >> 24) & 255);
    }

    public static void m(BufferedOutputStream bufferedOutputStream, long j) {
        bufferedOutputStream.write((byte) j);
        bufferedOutputStream.write((byte) (j >>> 8));
        bufferedOutputStream.write((byte) (j >>> 16));
        bufferedOutputStream.write((byte) (j >>> 24));
        bufferedOutputStream.write((byte) (j >>> 32));
        bufferedOutputStream.write((byte) (j >>> 40));
        bufferedOutputStream.write((byte) (j >>> 48));
        bufferedOutputStream.write((byte) (j >>> 56));
    }

    public static void n(BufferedOutputStream bufferedOutputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        m(bufferedOutputStream, bytes.length);
        bufferedOutputStream.write(bytes, 0, bytes.length);
    }

    public final synchronized C2653f8 a(String str) {
        C0410Xg c0410Xg;
        C0393Wg c0393Wg = (C0393Wg) this.a.get(str);
        InputStream inputStream = null;
        if (c0393Wg == null) {
            return null;
        }
        try {
            File file = new File(this.c, b(str));
            try {
                c0410Xg = new C0410Xg(new BufferedInputStream(new FileInputStream(file)));
            } catch (IOException e) {
                e = e;
                c0410Xg = null;
            } catch (NegativeArraySizeException e2) {
                e = e2;
                c0410Xg = null;
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        return null;
                    }
                }
                throw th;
            }
            try {
                C0393Wg.a(c0410Xg);
                C2653f8 c2653f8B = c0393Wg.b(k(c0410Xg, (int) (file.length() - c0410Xg.a)));
                try {
                    c0410Xg.close();
                    return c2653f8B;
                } catch (IOException unused2) {
                    return null;
                }
            } catch (IOException e3) {
                e = e3;
                HM.b("%s: %s", file.getAbsolutePath(), e.toString());
                j(str);
                if (c0410Xg != null) {
                    try {
                        c0410Xg.close();
                    } catch (IOException unused3) {
                        return null;
                    }
                }
                return null;
            } catch (NegativeArraySizeException e4) {
                e = e4;
                HM.b("%s: %s", file.getAbsolutePath(), e.toString());
                j(str);
                if (c0410Xg != null) {
                    try {
                        c0410Xg.close();
                    } catch (IOException unused4) {
                        return null;
                    }
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void c(int i) {
        long j;
        int i2;
        long j2 = this.b + i;
        int i3 = this.d;
        if (j2 < i3) {
            return;
        }
        if (HM.a) {
            HM.d("Pruning old cache entries.", new Object[0]);
        }
        long j3 = this.b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = this.a.entrySet().iterator();
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                j = j3;
                break;
            }
            C0393Wg c0393Wg = (C0393Wg) ((Map.Entry) it.next()).getValue();
            if (new File(this.c, b(c0393Wg.b)).delete()) {
                j = j3;
                this.b -= c0393Wg.a;
                i2 = 1;
            } else {
                j = j3;
                String str = c0393Wg.b;
                String strB = b(str);
                i2 = 1;
                HM.b("Could not delete cache entry for key=%s, filename=%s", str, strB);
            }
            it.remove();
            i4 += i2;
            if (this.b + r6 < i3 * 0.9f) {
                break;
            } else {
                j3 = j;
            }
        }
        if (HM.a) {
            HM.d("pruned %d files, %d bytes, %d ms", Integer.valueOf(i4), Long.valueOf(this.b - j), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        }
    }

    public final synchronized void d(String str, C2653f8 c2653f8) {
        c(c2653f8.a.length);
        File file = new File(this.c, b(str));
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            C0393Wg c0393Wg = new C0393Wg(str, c2653f8);
            if (!c0393Wg.c(bufferedOutputStream)) {
                bufferedOutputStream.close();
                HM.b("Failed to write header for %s", file.getAbsolutePath());
                throw new IOException();
            }
            bufferedOutputStream.write(c2653f8.a);
            bufferedOutputStream.close();
            e(str, c0393Wg);
        } catch (IOException unused) {
            if (file.delete()) {
                return;
            }
            HM.b("Could not clean up file %s", file.getAbsolutePath());
        }
    }

    public final void e(String str, C0393Wg c0393Wg) {
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap.containsKey(str)) {
            this.b = (c0393Wg.a - ((C0393Wg) linkedHashMap.get(str)).a) + this.b;
        } else {
            this.b += c0393Wg.a;
        }
        linkedHashMap.put(str, c0393Wg);
    }

    public final synchronized void j(String str) {
        boolean zDelete = new File(this.c, b(str)).delete();
        LinkedHashMap linkedHashMap = this.a;
        C0393Wg c0393Wg = (C0393Wg) linkedHashMap.get(str);
        if (c0393Wg != null) {
            this.b -= c0393Wg.a;
            linkedHashMap.remove(str);
        }
        if (!zDelete) {
            HM.b("Could not delete cache entry for key=%s, filename=%s", str, b(str));
        }
    }
}
