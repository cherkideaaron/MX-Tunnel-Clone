package defpackage;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class Vw extends AbstractC3400sr implements InterfaceC2631en {
    public final /* synthetic */ int a;
    public final /* synthetic */ C2532cx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Vw(C2532cx c2532cx, int i) {
        super(1);
        this.a = i;
        this.b = c2532cx;
    }

    @Override // defpackage.InterfaceC2631en
    public final Object invoke(Object obj) {
        Object objPrevious;
        Object objPrevious2;
        R6 r6 = (R6) obj;
        switch (this.a) {
            case 0:
                AbstractC0500aq.m(r6, "backEvent");
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
                c2532cx.c = (C3288qm) objPrevious;
                break;
            default:
                AbstractC0500aq.m(r6, "backEvent");
                T3 t32 = this.b.b;
                ListIterator listIterator2 = t32.listIterator(t32.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        objPrevious2 = listIterator2.previous();
                        if (((C3288qm) objPrevious2).a) {
                        }
                    } else {
                        objPrevious2 = null;
                    }
                }
                break;
        }
        return DK.a;
    }
}
