package defpackage;

import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class UC implements VH, Closeable {
    public static final TreeMap o = new TreeMap();
    public volatile String a;
    public final long[] b;
    public final double[] c;
    public final String[] d;
    public final byte[][] e;
    public final int[] f;
    public final int m;
    public int n;

    public UC(int i) {
        this.m = i;
        int i2 = i + 1;
        this.f = new int[i2];
        this.b = new long[i2];
        this.c = new double[i2];
        this.d = new String[i2];
        this.e = new byte[i2][];
    }

    public static UC c(int i, String str) {
        TreeMap treeMap = o;
        synchronized (treeMap) {
            try {
                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
                if (entryCeilingEntry == null) {
                    UC uc = new UC(i);
                    uc.a = str;
                    uc.n = i;
                    return uc;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                UC uc2 = (UC) entryCeilingEntry.getValue();
                uc2.a = str;
                uc2.n = i;
                return uc2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.VH
    public final void a(C0399Wm c0399Wm) {
        for (int i = 1; i <= this.n; i++) {
            int i2 = this.f[i];
            if (i2 == 1) {
                c0399Wm.f(i);
            } else if (i2 == 2) {
                c0399Wm.e(i, this.b[i]);
            } else if (i2 == 3) {
                c0399Wm.c(i, this.c[i]);
            } else if (i2 == 4) {
                c0399Wm.g(i, this.d[i]);
            } else if (i2 == 5) {
                c0399Wm.b(i, this.e[i]);
            }
        }
    }

    @Override // defpackage.VH
    public final String b() {
        return this.a;
    }

    public final void e(int i, long j) {
        this.f[i] = 2;
        this.b[i] = j;
    }

    public final void f(int i) {
        this.f[i] = 1;
    }

    public final void g(int i, String str) {
        this.f[i] = 4;
        this.d[i] = str;
    }

    public final void release() {
        TreeMap treeMap = o;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.m), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
