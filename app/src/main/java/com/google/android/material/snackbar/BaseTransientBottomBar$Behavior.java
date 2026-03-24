package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import defpackage.AbstractC3255q7;
import defpackage.C0607co;
import defpackage.C3145o7;
import defpackage.C3532vE;

/* loaded from: classes2.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final C0607co j;

    public BaseTransientBottomBar$Behavior() {
        C0607co c0607co = new C0607co();
        this.g = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.h = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.e = 0;
        this.j = c0607co;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.AbstractC3763zc
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C0607co c0607co = this.j;
        c0607co.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                C3532vE.d().k((C3145o7) c0607co.a);
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            C3532vE.d().j((C3145o7) c0607co.a);
        }
        return super.g(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean s(View view) {
        this.j.getClass();
        return view instanceof AbstractC3255q7;
    }
}
