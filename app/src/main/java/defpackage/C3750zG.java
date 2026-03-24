package defpackage;

/* renamed from: zG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3750zG extends AbstractC2957kl {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3750zG(String str, int i) {
        super(str, 0);
        this.b = i;
    }

    @Override // defpackage.AbstractC2957kl
    public final void b(Object obj, float f) {
        BG bg = (BG) obj;
        switch (this.b) {
            case 0:
                bg.g(f);
                break;
            case 1:
                bg.r = f;
                break;
            case 2:
                bg.s = f;
                break;
            case 3:
                bg.b = f;
                break;
            default:
                bg.c = f;
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        BG bg = (BG) obj;
        switch (this.b) {
            case 0:
                return Float.valueOf(bg.a);
            case 1:
                return Float.valueOf(bg.r);
            case 2:
                return Float.valueOf(bg.s);
            case 3:
                return Float.valueOf(bg.b);
            default:
                return Float.valueOf(bg.c);
        }
    }
}
