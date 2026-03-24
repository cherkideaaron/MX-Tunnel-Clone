package defpackage;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class MK extends OK {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MK(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.OK
    public final boolean c(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (!PK.g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!PK.g) {
                    break;
                } else {
                    break;
                }
        }
        return PK.c(j, obj);
    }

    @Override // defpackage.OK
    public final double d(long j, Object obj) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(g(j, obj));
    }

    @Override // defpackage.OK
    public final float e(long j, Object obj) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(f(j, obj));
    }

    @Override // defpackage.OK
    public final void j(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!PK.g) {
                    PK.l(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    PK.k(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!PK.g) {
                    PK.l(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    PK.k(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // defpackage.OK
    public final void k(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!PK.g) {
                    PK.l(obj, j, b);
                    break;
                } else {
                    PK.k(obj, j, b);
                    break;
                }
            default:
                if (!PK.g) {
                    PK.l(obj, j, b);
                    break;
                } else {
                    PK.k(obj, j, b);
                    break;
                }
        }
    }

    @Override // defpackage.OK
    public final void l(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                o(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                o(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // defpackage.OK
    public final void m(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                n(obj, j, Float.floatToIntBits(f));
                break;
            default:
                n(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // defpackage.OK
    public final boolean r() {
        switch (this.b) {
        }
        return false;
    }
}
