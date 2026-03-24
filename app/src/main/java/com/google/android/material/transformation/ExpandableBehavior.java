package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.AbstractC3763zc;
import defpackage.Vs;
import java.util.ArrayList;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableBehavior extends AbstractC3763zc {
    public ExpandableBehavior() {
    }

    @Override // defpackage.AbstractC3763zc
    public abstract boolean b(View view, View view2);

    @Override // defpackage.AbstractC3763zc
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Vs.u(view2);
        throw null;
    }

    @Override // defpackage.AbstractC3763zc
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (!view.isLaidOut()) {
            ArrayList arrayListJ = coordinatorLayout.j(view);
            int size = arrayListJ.size();
            for (int i2 = 0; i2 < size; i2++) {
                b(view, (View) arrayListJ.get(i2));
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
