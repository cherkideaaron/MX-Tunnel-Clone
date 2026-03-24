package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* renamed from: Do, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class AccessibilityManagerTouchExplorationStateChangeListenerC0078Do implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ AbstractC3763zc c;

    public /* synthetic */ AccessibilityManagerTouchExplorationStateChangeListenerC0078Do(AbstractC3763zc abstractC3763zc, View view, int i) {
        this.a = i;
        this.c = abstractC3763zc;
        this.b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        switch (this.a) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.c;
                if (!z) {
                    hideBottomViewOnScrollBehavior.getClass();
                    break;
                } else if (hideBottomViewOnScrollBehavior.j == 1) {
                    hideBottomViewOnScrollBehavior.s(this.b);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.c;
                if (hideViewOnScrollBehavior.d && z && hideViewOnScrollBehavior.k == 1) {
                    hideViewOnScrollBehavior.t(this.b);
                    break;
                }
                break;
        }
    }
}
