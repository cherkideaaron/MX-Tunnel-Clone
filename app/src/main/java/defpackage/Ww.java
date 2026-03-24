package defpackage;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class Ww extends AbstractC3400sr implements InterfaceC0606cn {
    public final /* synthetic */ int a;
    public final /* synthetic */ C2532cx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Ww(C2532cx c2532cx, int i) {
        super(0);
        this.a = i;
        this.b = c2532cx;
    }

    @Override // defpackage.InterfaceC0606cn
    public final Object invoke() {
        Object objPrevious;
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            case 1:
                C2532cx c2532cx = this.b;
                T3 t3 = c2532cx.b;
                ListIterator listIterator = t3.listIterator(t3.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (((C3288qm) objPrevious).a) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                c2532cx.c = null;
                break;
            default:
                this.b.a();
                break;
        }
        return DK.a;
    }
}
