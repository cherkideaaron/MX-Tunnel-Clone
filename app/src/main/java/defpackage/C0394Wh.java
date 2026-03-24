package defpackage;

/* renamed from: Wh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0394Wh {
    public static final long[] e = new long[0];
    public final InterfaceC3207pE a;
    public final InterfaceC3396sn b;
    public long c;
    public final long[] d;

    public C0394Wh(InterfaceC3207pE interfaceC3207pE, C0420Xq c0420Xq) {
        AbstractC0500aq.m(interfaceC3207pE, "descriptor");
        this.a = interfaceC3207pE;
        this.b = c0420Xq;
        int iF = interfaceC3207pE.f();
        if (iF <= 64) {
            this.c = iF != 64 ? (-1) << iF : 0L;
            this.d = e;
            return;
        }
        this.c = 0L;
        int i = (iF - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iF & 63) != 0) {
            jArr[i - 1] = (-1) << iF;
        }
        this.d = jArr;
    }
}
