package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* renamed from: u2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3466u2 extends AbstractC3296qu {
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    public /* synthetic */ C3466u2(Object obj, int i) {
        this.j = i;
        this.k = obj;
    }

    @Override // defpackage.AbstractC3296qu, defpackage.InterfaceC2940kM
    public void b() {
        Object obj = this.k;
        switch (this.j) {
            case 0:
                ((RunnableC3358s2) obj).b.B.setVisibility(0);
                break;
            case 1:
                F2 f2 = (F2) obj;
                f2.B.setVisibility(0);
                if (f2.B.getParent() instanceof View) {
                    View view = (View) f2.B.getParent();
                    WeakHashMap weakHashMap = UL.a;
                    KL.c(view);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC2940kM
    public final void c() {
        Object obj = this.k;
        switch (this.j) {
            case 0:
                RunnableC3358s2 runnableC3358s2 = (RunnableC3358s2) obj;
                runnableC3358s2.b.B.setAlpha(1.0f);
                F2 f2 = runnableC3358s2.b;
                f2.E.d(null);
                f2.E = null;
                break;
            case 1:
                F2 f22 = (F2) obj;
                f22.B.setAlpha(1.0f);
                f22.E.d(null);
                f22.E = null;
                break;
            default:
                R2 r2 = (R2) obj;
                ((F2) r2.c).B.setVisibility(8);
                F2 f23 = (F2) r2.c;
                PopupWindow popupWindow = f23.C;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (f23.B.getParent() instanceof View) {
                    View view = (View) f23.B.getParent();
                    WeakHashMap weakHashMap = UL.a;
                    KL.c(view);
                }
                f23.B.e();
                f23.E.d(null);
                f23.E = null;
                ViewGroup viewGroup = f23.G;
                WeakHashMap weakHashMap2 = UL.a;
                KL.c(viewGroup);
                break;
        }
    }
}
