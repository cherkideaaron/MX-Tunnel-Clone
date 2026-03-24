package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.mxtunnel.pro.R;
import defpackage.AbstractC0115Ga;
import defpackage.R2;

/* loaded from: classes.dex */
public final class d extends e {
    public boolean c;
    public boolean d;
    public R2 e;

    public final R2 c(Context context) throws Resources.NotFoundException {
        Animation animationLoadAnimation;
        R2 r2;
        int iV;
        int i;
        if (this.d) {
            return this.e;
        }
        z zVar = this.a;
        l lVar = zVar.c;
        boolean z = zVar.a == 2;
        int nextTransition = lVar.getNextTransition();
        int popEnterAnim = this.c ? z ? lVar.getPopEnterAnim() : lVar.getPopExitAnim() : z ? lVar.getEnterAnim() : lVar.getExitAnim();
        lVar.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = lVar.mContainer;
        R2 r22 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            lVar.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = lVar.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation animationOnCreateAnimation = lVar.onCreateAnimation(nextTransition, z, popEnterAnim);
            if (animationOnCreateAnimation != null) {
                r22 = new R2((Object) animationOnCreateAnimation, 29, false);
            } else {
                Animator animatorOnCreateAnimator = lVar.onCreateAnimator(nextTransition, z, popEnterAnim);
                if (animatorOnCreateAnimator != null) {
                    r22 = new R2(animatorOnCreateAnimator);
                } else {
                    if (popEnterAnim == 0 && nextTransition != 0) {
                        if (nextTransition == 4097) {
                            iV = z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                        } else if (nextTransition != 8194) {
                            if (nextTransition == 8197) {
                                i = z ? android.R.attr.activityCloseEnterAnimation : android.R.attr.activityCloseExitAnimation;
                            } else if (nextTransition == 4099) {
                                iV = z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                            } else if (nextTransition != 4100) {
                                iV = -1;
                            } else {
                                i = z ? android.R.attr.activityOpenEnterAnimation : android.R.attr.activityOpenExitAnimation;
                            }
                            iV = AbstractC0115Ga.V(context, i);
                        } else {
                            iV = z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                        }
                        popEnterAnim = iV;
                    }
                    if (popEnterAnim != 0) {
                        boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(popEnterAnim));
                        if (zEquals) {
                            try {
                                animationLoadAnimation = AnimationUtils.loadAnimation(context, popEnterAnim);
                            } catch (Resources.NotFoundException e) {
                                throw e;
                            } catch (RuntimeException unused) {
                            }
                            if (animationLoadAnimation != null) {
                                r2 = new R2((Object) animationLoadAnimation, 29, false);
                                r22 = r2;
                            }
                        } else {
                            try {
                                Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, popEnterAnim);
                                if (animatorLoadAnimator != null) {
                                    r2 = new R2(animatorLoadAnimator);
                                    r22 = r2;
                                }
                            } catch (RuntimeException e2) {
                                if (zEquals) {
                                    throw e2;
                                }
                                Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, popEnterAnim);
                                if (animationLoadAnimation2 != null) {
                                    r22 = new R2((Object) animationLoadAnimation2, 29, false);
                                }
                            }
                        }
                    }
                }
            }
        }
        this.e = r22;
        this.d = true;
        return r22;
    }
}
