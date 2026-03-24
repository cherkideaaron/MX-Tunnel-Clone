package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class OA implements Closeable {
    public static final Logger m = Logger.getLogger(OA.class.getName());
    public final RandomAccessFile a;
    public int b;
    public int c;
    public LA d;
    public LA e;
    public final byte[] f;

    public OA(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    o(i, bArr2, iArr[i2]);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iH = h(0, bArr);
        this.b = iH;
        if (iH > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.b + ", Actual length: " + randomAccessFile2.length());
        }
        this.c = h(4, bArr);
        int iH2 = h(8, bArr);
        int iH3 = h(12, bArr);
        this.d = g(iH2);
        this.e = g(iH3);
    }

    public static int h(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public static void o(int i, byte[] bArr, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public final void a(byte[] bArr) {
        int iM;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    c(length);
                    boolean zF = f();
                    if (zF) {
                        iM = 16;
                    } else {
                        LA la = this.e;
                        iM = m(la.b + 4 + la.c);
                    }
                    LA la2 = new LA(iM, length);
                    o(0, this.f, length);
                    k(iM, this.f, 4);
                    k(iM + 4, bArr, length);
                    n(this.b, this.c + 1, zF ? iM : this.d.b, iM);
                    this.e = la2;
                    this.c++;
                    if (zF) {
                        this.d = la2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final synchronized void b() {
        n(4096, 0, 0, 0);
        this.c = 0;
        LA la = LA.d;
        this.d = la;
        this.e = la;
        if (this.b > 4096) {
            RandomAccessFile randomAccessFile = this.a;
            randomAccessFile.setLength(4096);
            randomAccessFile.getChannel().force(true);
        }
        this.b = 4096;
    }

    public final void c(int i) throws IOException {
        int i2 = i + 4;
        int iL = this.b - l();
        if (iL >= i2) {
            return;
        }
        int i3 = this.b;
        do {
            iL += i3;
            i3 <<= 1;
        } while (iL < i2);
        RandomAccessFile randomAccessFile = this.a;
        randomAccessFile.setLength(i3);
        randomAccessFile.getChannel().force(true);
        LA la = this.e;
        int iM = m(la.b + 4 + la.c);
        if (iM < this.d.b) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.b);
            long j = iM - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.e.b;
        int i5 = this.d.b;
        if (i4 < i5) {
            int i6 = (this.b + i4) - 16;
            n(i3, this.c, i5, i6);
            this.e = new LA(i6, this.e.c);
        } else {
            n(i3, this.c, i5, i4);
        }
        this.b = i3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a.close();
    }

    public final synchronized void e(NA na) {
        int iM = this.d.b;
        for (int i = 0; i < this.c; i++) {
            LA laG = g(iM);
            na.a(new MA(this, laG), laG.c);
            iM = m(laG.b + 4 + laG.c);
        }
    }

    public final synchronized boolean f() {
        return this.c == 0;
    }

    public final LA g(int i) throws IOException {
        if (i == 0) {
            return LA.d;
        }
        RandomAccessFile randomAccessFile = this.a;
        randomAccessFile.seek(i);
        return new LA(i, randomAccessFile.readInt());
    }

    public final synchronized void i() {
        try {
            if (f()) {
                throw new NoSuchElementException();
            }
            if (this.c == 1) {
                b();
            } else {
                LA la = this.d;
                int iM = m(la.b + 4 + la.c);
                j(iM, this.f, 0, 4);
                int iH = h(0, this.f);
                n(this.b, this.c - 1, iM, this.e.b);
                this.c--;
                this.d = new LA(iM, iH);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void j(int i, byte[] bArr, int i2, int i3) throws IOException {
        int iM = m(i);
        int i4 = iM + i3;
        int i5 = this.b;
        RandomAccessFile randomAccessFile = this.a;
        if (i4 <= i5) {
            randomAccessFile.seek(iM);
        } else {
            int i6 = i5 - iM;
            randomAccessFile.seek(iM);
            randomAccessFile.readFully(bArr, i2, i6);
            randomAccessFile.seek(16L);
            i2 += i6;
            i3 -= i6;
        }
        randomAccessFile.readFully(bArr, i2, i3);
    }

    public final void k(int i, byte[] bArr, int i2) throws IOException {
        int iM = m(i);
        int i3 = iM + i2;
        int i4 = this.b;
        RandomAccessFile randomAccessFile = this.a;
        if (i3 <= i4) {
            randomAccessFile.seek(iM);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - iM;
        randomAccessFile.seek(iM);
        randomAccessFile.write(bArr, 0, i5);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i5, i2 - i5);
    }

    public final int l() {
        if (this.c == 0) {
            return 16;
        }
        LA la = this.e;
        int i = la.b;
        int i2 = this.d.b;
        return i >= i2 ? (i - i2) + 4 + la.c + 16 : (((i + 4) + la.c) + this.b) - i2;
    }

    public final int m(int i) {
        int i2 = this.b;
        return i < i2 ? i : (i + 16) - i2;
    }

    public final void n(int i, int i2, int i3, int i4) throws IOException {
        int[] iArr = {i, i2, i3, i4};
        int i5 = 0;
        int i6 = 0;
        while (true) {
            byte[] bArr = this.f;
            if (i5 >= 4) {
                RandomAccessFile randomAccessFile = this.a;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                o(i6, bArr, iArr[i5]);
                i6 += 4;
                i5++;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OA.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append(", first=");
        sb.append(this.d);
        sb.append(", last=");
        sb.append(this.e);
        sb.append(", element lengths=[");
        try {
            e(new H7(sb));
        } catch (IOException e) {
            m.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }
}
