package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.AbstractC3264qG;
import defpackage.AbstractC3763zc;
import defpackage.C0049Cc;
import defpackage.RA;

/* loaded from: classes2.dex */
public class FloatingActionButton$BaseBehavior<T> extends AbstractC3763zc {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // defpackage.AbstractC3763zc
    public final boolean a(View view) {
        AbstractC3264qG.u(view);
        throw null;
    }

    @Override // defpackage.AbstractC3763zc
    public final void c(C0049Cc c0049Cc) {
        if (c0049Cc.h == 0) {
            c0049Cc.h = 80;
        }
    }

    @Override // defpackage.AbstractC3763zc
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC3264qG.u(view);
        throw null;
    }

    @Override // defpackage.AbstractC3763zc
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        AbstractC3264qG.u(view);
        throw null;
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RA.i);
        typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
