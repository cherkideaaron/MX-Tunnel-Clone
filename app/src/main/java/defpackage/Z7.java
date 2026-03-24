package defpackage;

/* loaded from: classes.dex */
public final class Z7 extends C0519b8 {
    public final int e;
    public final int f;

    public Z7(byte[] bArr, int i, int i2) {
        super(bArr);
        C0519b8.b(i, i + i2, bArr.length);
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.C0519b8
    public final byte a(int i) {
        int i2 = this.f;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.b[this.e + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(Vs.k(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC3264qG.e(i, i2, "Index > length: ", ", "));
    }

    @Override // defpackage.C0519b8
    public final void d(int i, byte[] bArr) {
        System.arraycopy(this.b, this.e, bArr, 0, i);
    }

    @Override // defpackage.C0519b8
    public final int e() {
        return this.e;
    }

    @Override // defpackage.C0519b8
    public final byte f(int i) {
        return this.b[this.e + i];
    }

    @Override // defpackage.C0519b8
    public final int size() {
        return this.f;
    }
}
