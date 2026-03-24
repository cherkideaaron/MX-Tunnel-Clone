package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class MJ extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public MJ(PJ pj, Z3 z3) {
        this.a = 0;
        this.c = pj;
        this.b = z3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ((InterfaceC2940kM) this.b).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((Z3) this.b).remove(animator);
                ((PJ) this.c).t.remove(animator);
                break;
            case 1:
                ((InterfaceC2940kM) this.b).c();
                break;
            default:
                ((C3106nN) this.b).a.d(1.0f);
                C2833iN.e((View) this.c);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((PJ) this.c).t.add(animator);
                break;
            case 1:
                ((InterfaceC2940kM) this.b).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ MJ(Object obj, View view, int i) {
        this.a = i;
        this.b = obj;
        this.c = view;
    }
}
