package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import defpackage.A0;
import defpackage.C2524cp;
import defpackage.C2885jM;
import defpackage.C3212pJ;
import defpackage.C3572w0;
import defpackage.F2;
import defpackage.InterfaceC0086Ef;
import defpackage.InterfaceC2893jc;
import defpackage.MenuC3511uu;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue a;
    public TypedValue b;
    public TypedValue c;
    public TypedValue d;
    public TypedValue e;
    public TypedValue f;
    public final Rect m;
    public InterfaceC2893jc n;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.m = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        return this.e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f == null) {
            this.f = new TypedValue();
        }
        return this.f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.c == null) {
            this.c = new TypedValue();
        }
        return this.c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.d == null) {
            this.d = new TypedValue();
        }
        return this.d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.a == null) {
            this.a = new TypedValue();
        }
        return this.a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.b == null) {
            this.b = new TypedValue();
        }
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC2893jc interfaceC2893jc = this.n;
        if (interfaceC2893jc != null) {
            interfaceC2893jc.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        A0 a0;
        super.onDetachedFromWindow();
        InterfaceC2893jc interfaceC2893jc = this.n;
        if (interfaceC2893jc != null) {
            F2 f2 = (F2) ((C2524cp) interfaceC2893jc).b;
            InterfaceC0086Ef interfaceC0086Ef = f2.x;
            if (interfaceC0086Ef != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0086Ef;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((C3212pJ) actionBarOverlayLayout.e).a.a;
                if (actionMenuView != null && (a0 = actionMenuView.z) != null) {
                    a0.i();
                    C3572w0 c3572w0 = a0.z;
                    if (c3572w0 != null && c3572w0.b()) {
                        c3572w0.j.dismiss();
                    }
                }
            }
            if (f2.C != null) {
                f2.r.getDecorView().removeCallbacks(f2.D);
                if (f2.C.isShowing()) {
                    try {
                        f2.C.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                f2.C = null;
            }
            C2885jM c2885jM = f2.E;
            if (c2885jM != null) {
                c2885jM.b();
            }
            MenuC3511uu menuC3511uu = f2.A(0).h;
            if (menuC3511uu != null) {
                menuC3511uu.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC2893jc interfaceC2893jc) {
        this.n = interfaceC2893jc;
    }
}
