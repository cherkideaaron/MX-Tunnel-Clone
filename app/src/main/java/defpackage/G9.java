package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* loaded from: classes2.dex */
public final class G9 extends AbstractC0069Df {
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    public /* synthetic */ G9(Object obj, int i) {
        this.k = i;
        this.l = obj;
    }

    @Override // defpackage.AbstractC0069Df
    public final void M(int i) {
        switch (this.k) {
            case 0:
                break;
            default:
                HI hi = (HI) this.l;
                hi.d = true;
                GI gi = (GI) hi.e.get();
                if (gi != null) {
                    K9 k9 = (K9) gi;
                    k9.B();
                    k9.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.AbstractC0069Df
    public final void N(Typeface typeface, boolean z) {
        switch (this.k) {
            case 0:
                Chip chip = (Chip) this.l;
                K9 k9 = chip.e;
                chip.setText(k9.T0 ? k9.U : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    HI hi = (HI) this.l;
                    hi.d = true;
                    GI gi = (GI) hi.e.get();
                    if (gi != null) {
                        K9 k92 = (K9) gi;
                        k92.B();
                        k92.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }

    private final void l0(int i) {
    }
}
