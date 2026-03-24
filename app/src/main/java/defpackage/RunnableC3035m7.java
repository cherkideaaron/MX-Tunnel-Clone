package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;

/* renamed from: m7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3035m7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractC3309r7 b;

    public /* synthetic */ RunnableC3035m7(AbstractC3309r7 abstractC3309r7, int i) {
        this.a = i;
        this.b = abstractC3309r7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        Rect rect;
        AbstractC3309r7 abstractC3309r7 = this.b;
        switch (this.a) {
            case 0:
                if (abstractC3309r7.i != null && (context = abstractC3309r7.h) != null) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (Build.VERSION.SDK_INT >= 30) {
                        rect = windowManager.getCurrentWindowMetrics().getBounds();
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    int iHeight = rect.height();
                    int[] iArr = new int[2];
                    AbstractC3255q7 abstractC3255q7 = abstractC3309r7.i;
                    abstractC3255q7.getLocationInWindow(iArr);
                    int height = (iHeight - (abstractC3255q7.getHeight() + iArr[1])) + ((int) abstractC3309r7.i.getTranslationY());
                    int i = abstractC3309r7.p;
                    if (height < i) {
                        ViewGroup.LayoutParams layoutParams = abstractC3309r7.i.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            Log.w(AbstractC3309r7.z, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                            break;
                        } else {
                            int i2 = abstractC3309r7.p;
                            abstractC3309r7.q = i2;
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = (i2 - height) + marginLayoutParams.bottomMargin;
                            abstractC3309r7.i.requestLayout();
                            break;
                        }
                    } else {
                        abstractC3309r7.q = i;
                        break;
                    }
                }
                break;
            case 1:
                abstractC3309r7.c();
                break;
            default:
                AbstractC3255q7 abstractC3255q72 = abstractC3309r7.i;
                if (abstractC3255q72 != null) {
                    ViewParent parent = abstractC3255q72.getParent();
                    AbstractC3255q7 abstractC3255q73 = abstractC3309r7.i;
                    if (parent != null) {
                        abstractC3255q73.setVisibility(0);
                    }
                    if (abstractC3255q73.getAnimationMode() != 1) {
                        int height2 = abstractC3255q73.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = abstractC3255q73.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height2 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        abstractC3255q73.setTranslationY(height2);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(height2, 0);
                        valueAnimator.setInterpolator(abstractC3309r7.e);
                        valueAnimator.setDuration(abstractC3309r7.c);
                        valueAnimator.addListener(new C2870j7(abstractC3309r7, 1));
                        valueAnimator.addUpdateListener(new C2925k7(abstractC3309r7, 2));
                        valueAnimator.start();
                        break;
                    } else {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setInterpolator(abstractC3309r7.d);
                        valueAnimatorOfFloat.addUpdateListener(new C2925k7(abstractC3309r7, 0));
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        valueAnimatorOfFloat2.setInterpolator(abstractC3309r7.f);
                        valueAnimatorOfFloat2.addUpdateListener(new C2925k7(abstractC3309r7, 1));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                        animatorSet.setDuration(abstractC3309r7.a);
                        animatorSet.addListener(new C2870j7(abstractC3309r7, 3));
                        animatorSet.start();
                        break;
                    }
                }
                break;
        }
    }
}
