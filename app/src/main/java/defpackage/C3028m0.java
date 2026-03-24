package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.ArrayList;

/* renamed from: m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3028m0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C3028m0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.C = null;
                actionBarOverlayLayout.p = false;
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
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.C = null;
                actionBarOverlayLayout.p = false;
                break;
            case 1:
                O1 o1 = (O1) this.b;
                ArrayList arrayList = new ArrayList(o1.e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((Vt) arrayList.get(i)).b.u;
                    if (colorStateList != null) {
                        o1.setTintList(colorStateList);
                    }
                }
                break;
            case 2:
                C0122Gh c0122Gh = (C0122Gh) this.b;
                c0122Gh.q();
                c0122Gh.r.start();
                break;
            case 3:
                ((HideBottomViewOnScrollBehavior) this.b).k = null;
                break;
            case 4:
                ((HideViewOnScrollBehavior) this.b).l = null;
                break;
            default:
                ((PJ) this.b).n();
                animator.removeListener(this);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                O1 o1 = (O1) this.b;
                ArrayList arrayList = new ArrayList(o1.e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Xt xt = ((Vt) arrayList.get(i)).b;
                    ColorStateList colorStateList = xt.u;
                    if (colorStateList != null) {
                        o1.setTint(colorStateList.getColorForState(xt.y, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
