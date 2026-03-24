package defpackage;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.drawerlayout.widget.DrawerLayout;
import java.util.WeakHashMap;

/* renamed from: rh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3336rh extends M {
    public final Rect d = new Rect();
    public final /* synthetic */ DrawerLayout e;

    public C3336rh(DrawerLayout drawerLayout) {
        this.e = drawerLayout;
    }

    @Override // defpackage.M
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        accessibilityEvent.getText();
        DrawerLayout drawerLayout = this.e;
        View viewF = drawerLayout.f();
        if (viewF == null) {
            return true;
        }
        int iH = drawerLayout.h(viewF);
        drawerLayout.getClass();
        WeakHashMap weakHashMap = UL.a;
        Gravity.getAbsoluteGravity(iH, drawerLayout.getLayoutDirection());
        return true;
    }

    @Override // defpackage.M
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
    }

    @Override // defpackage.M
    public final void d(View view, Z z) {
        boolean z2 = DrawerLayout.K;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = z.a;
        if (z2) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        } else {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoObtain);
            z.c = -1;
            accessibilityNodeInfo.setSource(view);
            WeakHashMap weakHashMap = UL.a;
            Object parentForAccessibility = view.getParentForAccessibility();
            if (parentForAccessibility instanceof View) {
                z.b = -1;
                accessibilityNodeInfo.setParent((View) parentForAccessibility);
            }
            Rect rect = this.d;
            accessibilityNodeInfoObtain.getBoundsInScreen(rect);
            accessibilityNodeInfo.setBoundsInScreen(rect);
            accessibilityNodeInfo.setVisibleToUser(accessibilityNodeInfoObtain.isVisibleToUser());
            accessibilityNodeInfo.setPackageName(accessibilityNodeInfoObtain.getPackageName());
            z.i(accessibilityNodeInfoObtain.getClassName());
            accessibilityNodeInfo.setContentDescription(accessibilityNodeInfoObtain.getContentDescription());
            accessibilityNodeInfo.setEnabled(accessibilityNodeInfoObtain.isEnabled());
            accessibilityNodeInfo.setFocused(accessibilityNodeInfoObtain.isFocused());
            accessibilityNodeInfo.setAccessibilityFocused(accessibilityNodeInfoObtain.isAccessibilityFocused());
            accessibilityNodeInfo.setSelected(accessibilityNodeInfoObtain.isSelected());
            z.a(accessibilityNodeInfoObtain.getActions());
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.i(childAt)) {
                    accessibilityNodeInfo.addChild(childAt);
                }
            }
        }
        z.i("androidx.drawerlayout.widget.DrawerLayout");
        accessibilityNodeInfo.setFocusable(false);
        accessibilityNodeInfo.setFocused(false);
        accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) V.e.a);
        accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) V.f.a);
    }

    @Override // defpackage.M
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (DrawerLayout.K || DrawerLayout.i(view)) {
            return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
        return false;
    }
}
