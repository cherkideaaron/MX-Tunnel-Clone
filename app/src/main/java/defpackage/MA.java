package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class MA extends InputStream {
    public int a;
    public int b;
    public final /* synthetic */ OA c;

    public MA(OA oa, LA la) {
        this.c = oa;
        this.a = oa.m(la.b + 4);
        this.b = la.c;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.b == 0) {
            return -1;
        }
        OA oa = this.c;
        oa.a.seek(this.a);
        int i = oa.a.read();
        this.a = oa.m(this.a + 1);
        this.b--;
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (bArr != null) {
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.b;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            int i4 = this.a;
            OA oa = this.c;
            oa.j(i4, bArr, i, i2);
            this.a = oa.m(this.a + i2);
            this.b -= i2;
            return i2;
        }
        throw new NullPointerException("buffer");
    }
}
