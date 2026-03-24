package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.mxtunnel.pro.R;

/* loaded from: classes2.dex */
public final class Pt {
    public final MaterialButton a;
    public C2878jF b;
    public C0473aH c;
    public C3696yG d;
    public C0285Qa e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public PorterDuff.Mode l;
    public ColorStateList m;
    public ColorStateList n;
    public ColorStateList o;
    public C2638eu p;
    public boolean t;
    public RippleDrawable v;
    public int w;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean u = true;

    public Pt(MaterialButton materialButton, C2878jF c2878jF) {
        this.a = materialButton;
        this.b = c2878jF;
    }

    public final C2638eu a(boolean z) {
        RippleDrawable rippleDrawable = this.v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C2638eu) ((LayerDrawable) ((InsetDrawable) this.v.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void b(int i, int i2) {
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.h;
        int i4 = this.i;
        this.i = i2;
        this.h = i;
        if (!this.r) {
            c();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void c() {
        C2638eu c2638eu = new C2638eu(this.b);
        C0473aH c0473aH = this.c;
        if (c0473aH != null) {
            c2638eu.p(c0473aH);
        }
        C3696yG c3696yG = this.d;
        if (c3696yG != null) {
            c2638eu.m(c3696yG);
        }
        C0285Qa c0285Qa = this.e;
        if (c0285Qa != null) {
            c2638eu.K = c0285Qa;
        }
        MaterialButton materialButton = this.a;
        c2638eu.l(materialButton.getContext());
        c2638eu.setTintList(this.m);
        PorterDuff.Mode mode = this.l;
        if (mode != null) {
            c2638eu.setTintMode(mode);
        }
        float f = this.k;
        ColorStateList colorStateList = this.n;
        c2638eu.b.l = f;
        c2638eu.invalidateSelf();
        C2529cu c2529cu = c2638eu.b;
        if (c2529cu.e != colorStateList) {
            c2529cu.e = colorStateList;
            c2638eu.onStateChange(c2638eu.getState());
        }
        C2638eu c2638eu2 = new C2638eu(this.b);
        C0473aH c0473aH2 = this.c;
        if (c0473aH2 != null) {
            c2638eu2.p(c0473aH2);
        }
        C3696yG c3696yG2 = this.d;
        if (c3696yG2 != null) {
            c2638eu2.m(c3696yG2);
        }
        c2638eu2.setTint(0);
        float f2 = this.k;
        int iC = this.q ? AbstractC0500aq.C(materialButton, R.attr.colorSurface) : 0;
        c2638eu2.b.l = f2;
        c2638eu2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iC);
        C2529cu c2529cu2 = c2638eu2.b;
        if (c2529cu2.e != colorStateListValueOf) {
            c2529cu2.e = colorStateListValueOf;
            c2638eu2.onStateChange(c2638eu2.getState());
        }
        C2638eu c2638eu3 = new C2638eu(this.b);
        this.p = c2638eu3;
        C0473aH c0473aH3 = this.c;
        if (c0473aH3 != null) {
            c2638eu3.p(c0473aH3);
        }
        C3696yG c3696yG3 = this.d;
        if (c3696yG3 != null) {
            this.p.m(c3696yG3);
        }
        this.p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(QC.a(this.o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c2638eu2, c2638eu}), this.f, this.h, this.g, this.i), this.p);
        this.v = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        C2638eu c2638euA = a(false);
        if (c2638euA != null) {
            c2638euA.n(this.w);
            c2638euA.setState(materialButton.getDrawableState());
        }
    }

    public final void d() {
        InterfaceC3533vF interfaceC3533vF;
        C2638eu c2638euA = a(false);
        if (c2638euA != null) {
            C0473aH c0473aH = this.c;
            if (c0473aH != null) {
                c2638euA.p(c0473aH);
            } else {
                c2638euA.setShapeAppearanceModel(this.b);
            }
            C3696yG c3696yG = this.d;
            if (c3696yG != null) {
                c2638euA.m(c3696yG);
            }
        }
        C2638eu c2638euA2 = a(true);
        if (c2638euA2 != null) {
            C0473aH c0473aH2 = this.c;
            if (c0473aH2 != null) {
                c2638euA2.p(c0473aH2);
            } else {
                c2638euA2.setShapeAppearanceModel(this.b);
            }
            C3696yG c3696yG2 = this.d;
            if (c3696yG2 != null) {
                c2638euA2.m(c3696yG2);
            }
        }
        RippleDrawable rippleDrawable = this.v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            interfaceC3533vF = null;
        } else {
            interfaceC3533vF = (InterfaceC3533vF) (this.v.getNumberOfLayers() > 2 ? this.v.getDrawable(2) : this.v.getDrawable(1));
        }
        if (interfaceC3533vF != null) {
            interfaceC3533vF.setShapeAppearanceModel(this.b);
            if (interfaceC3533vF instanceof C2638eu) {
                C2638eu c2638eu = (C2638eu) interfaceC3533vF;
                C0473aH c0473aH3 = this.c;
                if (c0473aH3 != null) {
                    c2638eu.p(c0473aH3);
                }
                C3696yG c3696yG3 = this.d;
                if (c3696yG3 != null) {
                    c2638eu.m(c3696yG3);
                }
            }
        }
    }

    public final void e() {
        C2638eu c2638euA = a(false);
        C2638eu c2638euA2 = a(true);
        if (c2638euA != null) {
            float f = this.k;
            ColorStateList colorStateList = this.n;
            c2638euA.b.l = f;
            c2638euA.invalidateSelf();
            C2529cu c2529cu = c2638euA.b;
            if (c2529cu.e != colorStateList) {
                c2529cu.e = colorStateList;
                c2638euA.onStateChange(c2638euA.getState());
            }
            if (c2638euA2 != null) {
                float f2 = this.k;
                int iC = this.q ? AbstractC0500aq.C(this.a, R.attr.colorSurface) : 0;
                c2638euA2.b.l = f2;
                c2638euA2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iC);
                C2529cu c2529cu2 = c2638euA2.b;
                if (c2529cu2.e != colorStateListValueOf) {
                    c2529cu2.e = colorStateListValueOf;
                    c2638euA2.onStateChange(c2638euA2.getState());
                }
            }
        }
    }
}
