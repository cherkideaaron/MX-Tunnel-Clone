package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.mxtunnel.pro.R;

/* renamed from: e3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2593e3 extends C3725ys implements InterfaceC2703g3 {
    public CharSequence J;
    public ListAdapter K;
    public final Rect L;
    public int M;
    public final /* synthetic */ C2758h3 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2593e3(C2758h3 c2758h3, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.N = c2758h3;
        this.L = new Rect();
        this.u = c2758h3;
        this.E = true;
        this.F.setFocusable(true);
        this.v = new C0568c3(this, 0);
    }

    @Override // defpackage.InterfaceC2703g3
    public final CharSequence f() {
        return this.J;
    }

    @Override // defpackage.InterfaceC2703g3
    public final void h(CharSequence charSequence) {
        this.J = charSequence;
    }

    @Override // defpackage.InterfaceC2703g3
    public final void l(int i) {
        this.M = i;
    }

    @Override // defpackage.InterfaceC2703g3
    public final void m(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        Q2 q2 = this.F;
        boolean zIsShowing = q2.isShowing();
        r();
        this.F.setInputMethodMode(2);
        show();
        C0054Ch c0054Ch = this.c;
        c0054Ch.setChoiceMode(1);
        c0054Ch.setTextDirection(i);
        c0054Ch.setTextAlignment(i2);
        C2758h3 c2758h3 = this.N;
        int selectedItemPosition = c2758h3.getSelectedItemPosition();
        C0054Ch c0054Ch2 = this.c;
        if (q2.isShowing() && c0054Ch2 != null) {
            c0054Ch2.setListSelectionHidden(false);
            c0054Ch2.setSelection(selectedItemPosition);
            if (c0054Ch2.getChoiceMode() != 0) {
                c0054Ch2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = c2758h3.getViewTreeObserver()) == null) {
            return;
        }
        Y2 y2 = new Y2(this, 1);
        viewTreeObserver.addOnGlobalLayoutListener(y2);
        this.F.setOnDismissListener(new C2539d3(this, y2));
    }

    @Override // defpackage.C3725ys, defpackage.InterfaceC2703g3
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.K = listAdapter;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r() {
        /*
            r10 = this;
            Q2 r0 = r10.F
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            r2 = 1
            h3 r3 = r10.N
            if (r1 == 0) goto L21
            android.graphics.Rect r4 = r3.n
            r1.getPadding(r4)
            boolean r1 = defpackage.AbstractC3270qM.a
            int r1 = r3.getLayoutDirection()
            android.graphics.Rect r4 = r3.n
            if (r1 != r2) goto L1d
            int r1 = r4.right
            goto L29
        L1d:
            int r1 = r4.left
            int r1 = -r1
            goto L29
        L21:
            android.graphics.Rect r1 = r3.n
            r4 = 0
            r1.right = r4
            r1.left = r4
            r1 = r4
        L29:
            int r4 = r3.getPaddingLeft()
            int r5 = r3.getPaddingRight()
            int r6 = r3.getWidth()
            int r7 = r3.m
            r8 = -2
            if (r7 != r8) goto L6a
            android.widget.ListAdapter r7 = r10.K
            android.widget.SpinnerAdapter r7 = (android.widget.SpinnerAdapter) r7
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            int r0 = r3.a(r7, r0)
            android.content.Context r7 = r3.getContext()
            android.content.res.Resources r7 = r7.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            int r7 = r7.widthPixels
            android.graphics.Rect r8 = r3.n
            int r9 = r8.left
            int r7 = r7 - r9
            int r8 = r8.right
            int r7 = r7 - r8
            if (r0 <= r7) goto L5f
            r0 = r7
        L5f:
            int r7 = r6 - r4
            int r7 = r7 - r5
            int r0 = java.lang.Math.max(r0, r7)
        L66:
            r10.q(r0)
            goto L74
        L6a:
            r0 = -1
            if (r7 != r0) goto L71
            int r0 = r6 - r4
            int r0 = r0 - r5
            goto L66
        L71:
            r10.q(r7)
        L74:
            boolean r0 = defpackage.AbstractC3270qM.a
            int r0 = r3.getLayoutDirection()
            if (r0 != r2) goto L85
            int r6 = r6 - r5
            int r0 = r10.e
            int r6 = r6 - r0
            int r0 = r10.M
            int r6 = r6 - r0
            int r6 = r6 + r1
            goto L8a
        L85:
            int r0 = r10.M
            int r4 = r4 + r0
            int r6 = r4 + r1
        L8a:
            r10.f = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2593e3.r():void");
    }
}
