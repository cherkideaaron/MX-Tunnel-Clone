package defpackage;

import android.R;
import android.content.res.ColorStateList;

/* renamed from: bu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0559bu extends S2 {
    public static final int[][] m = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList e;
    public boolean f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e == null) {
            int iC = AbstractC0500aq.C(this, com.mxtunnel.pro.R.attr.colorControlActivated);
            int iC2 = AbstractC0500aq.C(this, com.mxtunnel.pro.R.attr.colorOnSurface);
            int iC3 = AbstractC0500aq.C(this, com.mxtunnel.pro.R.attr.colorSurface);
            this.e = new ColorStateList(m, new int[]{AbstractC0500aq.P(iC3, iC, 1.0f), AbstractC0500aq.P(iC3, iC2, 0.54f), AbstractC0500aq.P(iC3, iC2, 0.38f), AbstractC0500aq.P(iC3, iC2, 0.38f)});
        }
        return this.e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f = z;
        setButtonTintList(z ? getMaterialThemeColorsTintList() : null);
    }
}
