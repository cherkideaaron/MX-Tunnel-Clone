package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import defpackage.AM;
import defpackage.C2566dc;
import defpackage.C3122nl;
import defpackage.C3417t7;
import defpackage.WA;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class Flow extends AM {
    public C3122nl p;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new int[32];
        this.m = new HashMap();
        this.c = context;
        g(attributeSet);
    }

    @Override // defpackage.AM, defpackage.AbstractC0235Nb
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        C3122nl c3122nl = new C3122nl();
        c3122nl.r0 = 0;
        c3122nl.s0 = 0;
        c3122nl.t0 = 0;
        c3122nl.u0 = 0;
        c3122nl.v0 = 0;
        c3122nl.w0 = 0;
        c3122nl.x0 = false;
        c3122nl.y0 = 0;
        c3122nl.z0 = 0;
        c3122nl.A0 = new C3417t7();
        c3122nl.B0 = null;
        c3122nl.C0 = -1;
        c3122nl.D0 = -1;
        c3122nl.E0 = -1;
        c3122nl.F0 = -1;
        c3122nl.G0 = -1;
        c3122nl.H0 = -1;
        c3122nl.I0 = 0.5f;
        c3122nl.J0 = 0.5f;
        c3122nl.K0 = 0.5f;
        c3122nl.L0 = 0.5f;
        c3122nl.M0 = 0.5f;
        c3122nl.N0 = 0.5f;
        c3122nl.O0 = 0;
        c3122nl.P0 = 0;
        c3122nl.Q0 = 2;
        c3122nl.R0 = 2;
        c3122nl.S0 = 0;
        c3122nl.T0 = -1;
        c3122nl.U0 = 0;
        c3122nl.V0 = new ArrayList();
        c3122nl.W0 = null;
        c3122nl.X0 = null;
        c3122nl.Y0 = null;
        c3122nl.a1 = 0;
        this.p = c3122nl;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, WA.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.p.U0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C3122nl c3122nl2 = this.p;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c3122nl2.r0 = dimensionPixelSize;
                    c3122nl2.s0 = dimensionPixelSize;
                    c3122nl2.t0 = dimensionPixelSize;
                    c3122nl2.u0 = dimensionPixelSize;
                } else if (index == 18) {
                    C3122nl c3122nl3 = this.p;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c3122nl3.t0 = dimensionPixelSize2;
                    c3122nl3.v0 = dimensionPixelSize2;
                    c3122nl3.w0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.p.u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.p.v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.p.r0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.p.w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.p.s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.p.S0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.p.C0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.p.D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.p.E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.p.G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.p.F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.p.H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.p.I0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.p.K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.p.M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.p.L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.p.N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.p.J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.p.Q0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.p.R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.p.O0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.p.P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.p.T0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.d = this.p;
        i();
    }

    @Override // defpackage.AbstractC0235Nb
    public final void h(C2566dc c2566dc, boolean z) {
        C3122nl c3122nl = this.p;
        int i = c3122nl.t0;
        if (i > 0 || c3122nl.u0 > 0) {
            if (z) {
                c3122nl.v0 = c3122nl.u0;
                c3122nl.w0 = i;
            } else {
                c3122nl.v0 = i;
                c3122nl.w0 = c3122nl.u0;
            }
        }
    }

    @Override // defpackage.AM
    public final void j(C3122nl c3122nl, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (c3122nl == null) {
            setMeasuredDimension(0, 0);
        } else {
            c3122nl.Q(mode, size, mode2, size2);
            setMeasuredDimension(c3122nl.y0, c3122nl.z0);
        }
    }

    @Override // defpackage.AbstractC0235Nb, android.view.View
    public final void onMeasure(int i, int i2) {
        j(this.p, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.p.K0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.p.E0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.p.L0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.p.F0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.p.Q0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.p.I0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.p.O0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.p.C0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.p.T0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.p.U0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        C3122nl c3122nl = this.p;
        c3122nl.r0 = i;
        c3122nl.s0 = i;
        c3122nl.t0 = i;
        c3122nl.u0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.p.s0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.p.v0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.p.w0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.p.r0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.p.R0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.p.J0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.p.P0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.p.D0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.p.S0 = i;
        requestLayout();
    }
}
