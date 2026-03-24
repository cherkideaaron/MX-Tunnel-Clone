package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.mxtunnel.pro.R;
import defpackage.AbstractC0069Df;
import defpackage.AbstractC3279qd;
import defpackage.AbstractC3296qu;
import defpackage.B3;
import defpackage.C0559bu;
import defpackage.C2647f2;
import defpackage.C2748gu;
import defpackage.C2757h2;
import defpackage.C2865j2;
import defpackage.C3413t3;
import defpackage.Jt;
import defpackage.RA;
import defpackage.S2;
import defpackage.Xt;

/* loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends B3 {
    @Override // defpackage.B3
    public final C2647f2 a(Context context, AttributeSet attributeSet) {
        return new Jt(context, attributeSet);
    }

    @Override // defpackage.B3
    public final C2757h2 b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // defpackage.B3
    public final C2865j2 c(Context context, AttributeSet attributeSet) {
        return new Xt(context, attributeSet);
    }

    @Override // defpackage.B3
    public final S2 d(Context context, AttributeSet attributeSet) {
        C0559bu c0559bu = new C0559bu(AbstractC3279qd.n0(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = c0559bu.getContext();
        TypedArray typedArrayS = AbstractC3279qd.S(context2, attributeSet, RA.s, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayS.hasValue(0)) {
            c0559bu.setButtonTintList(AbstractC3296qu.x(context2, typedArrayS, 0));
        }
        c0559bu.f = typedArrayS.getBoolean(1, false);
        typedArrayS.recycle();
        return c0559bu;
    }

    @Override // defpackage.B3
    public final C3413t3 e(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        C2748gu c2748gu = new C2748gu(AbstractC3279qd.n0(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = c2748gu.getContext();
        if (AbstractC0069Df.T(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = RA.w;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int iN = C2748gu.n(context2, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iN == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, RA.v);
                    int iN2 = C2748gu.n(c2748gu.getContext(), typedArrayObtainStyledAttributes3, 2, 4);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iN2 >= 0) {
                        c2748gu.setLineHeight(iN2);
                    }
                }
            }
        }
        return c2748gu;
    }
}
