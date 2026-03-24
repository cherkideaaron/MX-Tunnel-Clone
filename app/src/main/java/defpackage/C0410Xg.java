package defpackage;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* renamed from: Xg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0410Xg extends FilterInputStream {
    public int a;

    public C0410Xg(BufferedInputStream bufferedInputStream) {
        super(bufferedInputStream);
        this.a = 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        if (i != -1) {
            this.a++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        if (i3 != -1) {
            this.a += i3;
        }
        return i3;
    }
}
