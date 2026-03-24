package defpackage;

import com.google.android.material.button.MaterialButton;

/* renamed from: du, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2583du extends AbstractC0136He {
    public final int w;

    public C2583du(int i) {
        this.w = i;
    }

    @Override // defpackage.AbstractC0136He
    public final void J(Object obj, float f) {
        C2638eu c2638eu = (C2638eu) obj;
        float[] fArr = c2638eu.I;
        if (fArr != null) {
            int i = this.w;
            if (fArr[i] != f) {
                fArr[i] = f;
                C0285Qa c0285Qa = c2638eu.K;
                if (c0285Qa != null) {
                    int i2 = (int) (c2638eu.i() * 0.11f);
                    MaterialButton materialButton = (MaterialButton) c0285Qa.b;
                    if (materialButton.D != i2) {
                        materialButton.D = i2;
                        materialButton.k();
                        materialButton.invalidate();
                    }
                }
                c2638eu.invalidateSelf();
            }
        }
    }

    @Override // defpackage.AbstractC0136He
    public final float u(Object obj) {
        float[] fArr = ((C2638eu) obj).I;
        if (fArr != null) {
            return fArr[this.w];
        }
        return 0.0f;
    }
}
