package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.mxtunnel.pro.R;
import defpackage.AbstractC0115Ga;
import defpackage.AbstractC2601eB;
import defpackage.AbstractC3296qu;
import defpackage.C0388Wb;
import defpackage.C0405Xb;
import defpackage.C0541bc;
import defpackage.InterfaceC2728ga;
import defpackage.RA;
import defpackage.UL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
class ClockFaceView extends AbstractC2601eB implements InterfaceC2728ga {
    public final ClockHandView B;
    public final Rect C;
    public final RectF D;
    public final Rect E;
    public final SparseArray F;
    public final c G;
    public final int[] H;
    public final float[] I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final String[] N;
    public float O;
    public final ColorStateList P;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = new Rect();
        this.D = new RectF();
        this.E = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.F = sparseArray;
        this.I = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RA.f, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListX = AbstractC3296qu.x(context, typedArrayObtainStyledAttributes, 1);
        this.P = colorStateListX;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.B = clockHandView;
        this.J = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListX.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListX.getDefaultColor());
        this.H = new int[]{colorForState, colorForState, colorStateListX.getDefaultColor()};
        clockHandView.c.add(this);
        int defaultColor = AbstractC0115Ga.u(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListX2 = AbstractC3296qu.x(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListX2 != null ? colorStateListX2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(false);
        typedArrayObtainStyledAttributes.recycle();
        this.G = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.N = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i = 0; i < Math.max(this.N.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.N.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.N[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i2 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i2));
                z = i2 > 1 ? true : z;
                UL.l(textView, this.G);
                textView.setTextColor(this.P);
            }
        }
        ClockHandView clockHandView2 = this.B;
        if (clockHandView2.b && !z) {
            clockHandView2.s = 1;
        }
        clockHandView2.b = z;
        clockHandView2.invalidate();
        this.K = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.L = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.M = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // defpackage.AbstractC2601eB
    public final void m() {
        C0541bc c0541bc = new C0541bc();
        c0541bc.b(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!map.containsKey(i2)) {
                    map.put(i2, new ArrayList());
                }
                ((List) map.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.z * 0.66f) : this.z;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap map2 = c0541bc.c;
                if (!map2.containsKey(Integer.valueOf(id))) {
                    map2.put(Integer.valueOf(id), new C0388Wb());
                }
                C0405Xb c0405Xb = ((C0388Wb) map2.get(Integer.valueOf(id))).d;
                c0405Xb.y = R.id.circle_center;
                c0405Xb.z = iRound;
                c0405Xb.A = size;
                size += 360.0f / list.size();
            }
        }
        c0541bc.a(this);
        setConstraintSet(null);
        requestLayout();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.F;
            if (i3 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i3)).setVisibility(0);
            i3++;
        }
    }

    public final void n() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.B.m;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.F;
            int size = sparseArray.size();
            rectF = this.D;
            rect = this.C;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f) {
                    textView = textView2;
                    f = fHeight;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.E);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.H, this.I, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.N.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) throws Resources.NotFoundException, NumberFormatException {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.M / Math.max(Math.max(this.K / displayMetrics.heightPixels, this.L / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
