package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class KB extends M {
    public final LB d;
    public final WeakHashMap e = new WeakHashMap();

    public KB(LB lb) {
        this.d = lb;
    }

    @Override // defpackage.M
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        M m = (M) this.e.get(view);
        return m != null ? m.a(view, accessibilityEvent) : this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.M
    public final C0565c0 b(View view) {
        M m = (M) this.e.get(view);
        return m != null ? m.b(view) : super.b(view);
    }

    @Override // defpackage.M
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        M m = (M) this.e.get(view);
        if (m != null) {
            m.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // defpackage.M
    public final void d(View view, Z z) {
        LB lb = this.d;
        boolean zK = lb.d.K();
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = z.a;
        if (!zK) {
            RecyclerView recyclerView = lb.d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().W(view, z);
                M m = (M) this.e.get(view);
                if (m != null) {
                    m.d(view, z);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // defpackage.M
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        M m = (M) this.e.get(view);
        if (m != null) {
            m.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // defpackage.M
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        M m = (M) this.e.get(viewGroup);
        return m != null ? m.f(viewGroup, view, accessibilityEvent) : this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.M
    public final boolean g(View view, int i, Bundle bundle) {
        LB lb = this.d;
        if (!lb.d.K()) {
            RecyclerView recyclerView = lb.d;
            if (recyclerView.getLayoutManager() != null) {
                M m = (M) this.e.get(view);
                if (m != null) {
                    if (m.g(view, i, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i, bundle)) {
                    return true;
                }
                BB bb = recyclerView.getLayoutManager().b.b;
                return false;
            }
        }
        return super.g(view, i, bundle);
    }

    @Override // defpackage.M
    public final void h(View view, int i) {
        M m = (M) this.e.get(view);
        if (m != null) {
            m.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // defpackage.M
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        M m = (M) this.e.get(view);
        if (m != null) {
            m.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
