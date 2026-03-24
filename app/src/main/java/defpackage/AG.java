package defpackage;

/* loaded from: classes.dex */
public final class AG extends AbstractC2957kl {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AG(String str, int i) {
        super(str, 1);
        this.b = i;
    }

    @Override // defpackage.AbstractC2957kl
    public final void a(int i, Object obj) {
        BG bg = (BG) obj;
        switch (this.b) {
            case 0:
                bg.setAlpha(i);
                break;
            case 1:
                bg.m = i;
                break;
            case 2:
                bg.q = i;
                break;
            case 3:
                bg.n = i;
                break;
            case 4:
                bg.o = i;
                break;
            default:
                bg.p = i;
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        BG bg = (BG) obj;
        switch (this.b) {
            case 0:
                return Integer.valueOf(bg.u);
            case 1:
                return Integer.valueOf(bg.m);
            case 2:
                return Integer.valueOf(bg.q);
            case 3:
                return Integer.valueOf(bg.n);
            case 4:
                return Integer.valueOf(bg.o);
            default:
                return Integer.valueOf(bg.p);
        }
    }
}
