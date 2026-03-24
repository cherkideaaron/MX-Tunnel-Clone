package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class J8 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ J8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        Object obj = this.b;
        switch (this.a) {
            case 1:
                C0259Oi c0259Oi = (C0259Oi) obj;
                if (c0259Oi.A != null && (accessibilityManager = c0259Oi.z) != null && c0259Oi.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(c0259Oi.A);
                    break;
                }
                break;
            case 2:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = UL.a;
                KL.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        switch (this.a) {
            case 0:
                M8 m8 = (M8) this.b;
                ViewTreeObserver viewTreeObserver = m8.E;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        m8.E = view.getViewTreeObserver();
                    }
                    m8.E.removeGlobalOnLayoutListener(m8.p);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                C0259Oi c0259Oi = (C0259Oi) this.b;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = c0259Oi.A;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = c0259Oi.z) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.b;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener2 = hideBottomViewOnScrollBehavior.h;
                if (touchExplorationStateChangeListener2 != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.g) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener2);
                    hideBottomViewOnScrollBehavior.h = null;
                    break;
                }
                break;
            case 4:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.b;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener3 = hideViewOnScrollBehavior.c;
                if (touchExplorationStateChangeListener3 != null && (accessibilityManager3 = hideViewOnScrollBehavior.b) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener3);
                    hideViewOnScrollBehavior.c = null;
                    break;
                }
                break;
            default:
                RG rg = (RG) this.b;
                ViewTreeObserver viewTreeObserver2 = rg.v;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        rg.v = view.getViewTreeObserver();
                    }
                    rg.v.removeGlobalOnLayoutListener(rg.p);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }
}
