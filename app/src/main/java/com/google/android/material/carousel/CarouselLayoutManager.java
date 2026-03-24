package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.mxtunnel.pro.R;
import defpackage.AbstractC3238pr;
import defpackage.AbstractC3529vB;
import defpackage.BB;
import defpackage.C0207Lh;
import defpackage.C0360Uh;
import defpackage.C3583wB;
import defpackage.FB;
import defpackage.G8;
import defpackage.GB;
import defpackage.H8;
import defpackage.I8;
import defpackage.RA;
import defpackage.Vs;
import java.util.List;

/* loaded from: classes2.dex */
public class CarouselLayoutManager extends AbstractC3529vB implements FB {
    public final C0207Lh p;
    public I8 q;
    public final View.OnLayoutChangeListener r;

    public CarouselLayoutManager() {
        C0207Lh c0207Lh = new C0207Lh();
        new H8();
        this.r = new View.OnLayoutChangeListener() { // from class: F8
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                CarouselLayoutManager carouselLayoutManager = this.a;
                carouselLayoutManager.getClass();
                if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
                    return;
                }
                view.post(new H0(carouselLayoutManager, 2));
            }
        };
        this.p = c0207Lh;
        n0();
        I0(0);
    }

    public static C0360Uh F0(List list, float f, boolean z) {
        float f2 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f3 = -3.4028235E38f;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((AbstractC3238pr) list.get(i5)).getClass();
            float fAbs = Math.abs(0.0f - f);
            if (0.0f <= f && fAbs <= f2) {
                i = i5;
                f2 = fAbs;
            }
            if (0.0f > f && fAbs <= f4) {
                i3 = i5;
                f4 = fAbs;
            }
            if (0.0f <= f5) {
                f5 = 0.0f;
                i2 = i5;
            }
            if (0.0f > f3) {
                f3 = 0.0f;
                i4 = i5;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new C0360Uh((AbstractC3238pr) list.get(i), (AbstractC3238pr) list.get(i3));
    }

    public final float C0(float f, float f2) {
        return H0() ? f - f2 : f + f2;
    }

    public final float D0(int i) {
        this.q.d();
        throw null;
    }

    public final int E0() {
        return G0() ? this.n : this.o;
    }

    public final boolean G0() {
        return this.q.a == 0;
    }

    public final boolean H0() {
        return G0() && C() == 1;
    }

    public final void I0(int i) {
        I8 i8;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(Vs.k(i, "invalid orientation:"));
        }
        c(null);
        I8 i82 = this.q;
        if (i82 == null || i != i82.a) {
            if (i == 0) {
                i8 = new I8(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                i8 = new I8(this, 0);
            }
            this.q = i8;
            n0();
        }
    }

    @Override // defpackage.AbstractC3529vB
    public final boolean L() {
        return true;
    }

    @Override // defpackage.AbstractC3529vB
    public final void R(RecyclerView recyclerView) throws Resources.NotFoundException {
        C0207Lh c0207Lh = this.p;
        Context context = recyclerView.getContext();
        float dimension = c0207Lh.a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        c0207Lh.a = dimension;
        float dimension2 = c0207Lh.b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        c0207Lh.b = dimension2;
        h0();
        recyclerView.addOnLayoutChangeListener(this.r);
    }

    @Override // defpackage.AbstractC3529vB
    public final void S(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.r);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    @Override // defpackage.AbstractC3529vB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View T(android.view.View r6, int r7, defpackage.BB r8, defpackage.GB r9) {
        /*
            r5 = this;
            int r9 = r5.v()
            r0 = 0
            if (r9 != 0) goto L8
            return r0
        L8:
            I8 r9 = r5.q
            int r9 = r9.a
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            if (r7 == r3) goto L53
            r4 = 2
            if (r7 == r4) goto L51
            r4 = 17
            if (r7 == r4) goto L49
            r4 = 33
            if (r7 == r4) goto L46
            r4 = 66
            if (r7 == r4) goto L3d
            r4 = 130(0x82, float:1.82E-43)
            if (r7 == r4) goto L3a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r4 = "Unknown focus request:"
            r9.<init>(r4)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            java.lang.String r9 = "CarouselLayoutManager"
            android.util.Log.d(r9, r7)
        L38:
            r7 = r1
            goto L54
        L3a:
            if (r9 != r3) goto L38
            goto L51
        L3d:
            if (r9 != 0) goto L38
            boolean r7 = r5.H0()
            if (r7 == 0) goto L51
            goto L53
        L46:
            if (r9 != r3) goto L38
            goto L53
        L49:
            if (r9 != 0) goto L38
            boolean r7 = r5.H0()
            if (r7 == 0) goto L53
        L51:
            r7 = r3
            goto L54
        L53:
            r7 = r2
        L54:
            if (r7 != r1) goto L57
            return r0
        L57:
            java.lang.String r9 = "All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup."
            r1 = 0
            int r6 = defpackage.AbstractC3529vB.H(r6)
            if (r7 != r2) goto L92
            if (r6 != 0) goto L63
            return r0
        L63:
            android.view.View r6 = r5.u(r1)
            int r6 = defpackage.AbstractC3529vB.H(r6)
            int r6 = r6 - r3
            if (r6 < 0) goto L81
            int r7 = r5.B()
            if (r6 < r7) goto L75
            goto L81
        L75:
            r5.D0(r6)
            r8.d(r6)
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r9)
            throw r6
        L81:
            boolean r6 = r5.H0()
            if (r6 == 0) goto L8d
            int r6 = r5.v()
            int r1 = r6 + (-1)
        L8d:
            android.view.View r6 = r5.u(r1)
            goto Lce
        L92:
            int r7 = r5.B()
            int r7 = r7 - r3
            if (r6 != r7) goto L9a
            return r0
        L9a:
            int r6 = r5.v()
            int r6 = r6 - r3
            android.view.View r6 = r5.u(r6)
            int r6 = defpackage.AbstractC3529vB.H(r6)
            int r6 = r6 + r3
            if (r6 < 0) goto Lbd
            int r7 = r5.B()
            if (r6 < r7) goto Lb1
            goto Lbd
        Lb1:
            r5.D0(r6)
            r8.d(r6)
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r9)
            throw r6
        Lbd:
            boolean r6 = r5.H0()
            if (r6 == 0) goto Lc4
            goto Lca
        Lc4:
            int r6 = r5.v()
            int r1 = r6 + (-1)
        Lca:
            android.view.View r6 = r5.u(r1)
        Lce:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.T(android.view.View, int, BB, GB):android.view.View");
    }

    @Override // defpackage.AbstractC3529vB
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(AbstractC3529vB.H(u(0)));
            accessibilityEvent.setToIndex(AbstractC3529vB.H(u(v() - 1)));
        }
    }

    @Override // defpackage.AbstractC3529vB
    public final void X(int i, int i2) {
        B();
    }

    @Override // defpackage.AbstractC3529vB
    public final void Y() {
        B();
    }

    @Override // defpackage.FB
    public final PointF a(int i) {
        return null;
    }

    @Override // defpackage.AbstractC3529vB
    public final void a0(int i, int i2) {
        B();
    }

    @Override // defpackage.AbstractC3529vB
    public final void c0(BB bb, GB gb) {
        if (gb.b() <= 0 || E0() <= 0.0f) {
            i0(bb);
        } else {
            H0();
            bb.d(0);
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
    }

    @Override // defpackage.AbstractC3529vB
    public final boolean d() {
        return G0();
    }

    @Override // defpackage.AbstractC3529vB
    public final void d0(GB gb) {
        if (v() == 0) {
            return;
        }
        AbstractC3529vB.H(u(0));
    }

    @Override // defpackage.AbstractC3529vB
    public final boolean e() {
        return !G0();
    }

    @Override // defpackage.AbstractC3529vB
    public final int j(GB gb) {
        v();
        return 0;
    }

    @Override // defpackage.AbstractC3529vB
    public final int k(GB gb) {
        return 0;
    }

    @Override // defpackage.AbstractC3529vB
    public final int l(GB gb) {
        return 0;
    }

    @Override // defpackage.AbstractC3529vB
    public final int m(GB gb) {
        v();
        return 0;
    }

    @Override // defpackage.AbstractC3529vB
    public final boolean m0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // defpackage.AbstractC3529vB
    public final int n(GB gb) {
        return 0;
    }

    @Override // defpackage.AbstractC3529vB
    public final int o(GB gb) {
        return 0;
    }

    @Override // defpackage.AbstractC3529vB
    public final int o0(int i, BB bb, GB gb) {
        if (!G0() || v() == 0 || i == 0) {
            return 0;
        }
        bb.d(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // defpackage.AbstractC3529vB
    public final void p0(int i) {
    }

    @Override // defpackage.AbstractC3529vB
    public final int q0(int i, BB bb, GB gb) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        bb.d(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // defpackage.AbstractC3529vB
    public final C3583wB r() {
        return new C3583wB(-2, -2);
    }

    @Override // defpackage.AbstractC3529vB
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (G0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // defpackage.AbstractC3529vB
    public final void z0(RecyclerView recyclerView, int i) {
        G8 g8 = new G8(0, recyclerView.getContext(), this);
        g8.a = i;
        A0(g8);
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new H8();
        this.r = new View.OnLayoutChangeListener() { // from class: F8
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i22, int i32, int i4, int i5, int i6, int i7, int i8) {
                CarouselLayoutManager carouselLayoutManager = this.a;
                carouselLayoutManager.getClass();
                if (i32 - i3 == i7 - i5 && i4 - i22 == i8 - i6) {
                    return;
                }
                view.post(new H0(carouselLayoutManager, 2));
            }
        };
        this.p = new C0207Lh();
        n0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RA.d);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            n0();
            I0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
