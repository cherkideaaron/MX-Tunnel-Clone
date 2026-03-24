package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mxtunnel.pro.R;

/* renamed from: eB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2601eB extends ConstraintLayout {
    public final C2638eu A;
    public final H0 y;
    public int z;

    public AbstractC2601eB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C2638eu c2638eu = new C2638eu();
        this.A = c2638eu;
        ZB zb = new ZB(0.5f);
        C2825iF c2825iFF = c2638eu.b.a.f();
        c2825iFF.e = zb;
        c2825iFF.f = zb;
        c2825iFF.g = zb;
        c2825iFF.h = zb;
        c2638eu.setShapeAppearanceModel(c2825iFF.a());
        this.A.o(ColorStateList.valueOf(-1));
        setBackground(this.A);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RA.y, R.attr.materialClockStyle, 0);
        this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.y = new H0(this, 12);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            H0 h0 = this.y;
            handler.removeCallbacks(h0);
            handler.post(h0);
        }
    }

    public abstract void m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            H0 h0 = this.y;
            handler.removeCallbacks(h0);
            handler.post(h0);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.A.o(ColorStateList.valueOf(i));
    }
}
