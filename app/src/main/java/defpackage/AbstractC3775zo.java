package defpackage;

import java.util.ArrayList;

/* renamed from: zo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3775zo extends C2566dc {
    public C2566dc[] p0 = new C2566dc[4];
    public int q0 = 0;

    public final void M(int i, YM ym, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.q0; i2++) {
            C2566dc c2566dc = this.p0[i2];
            ArrayList arrayList2 = ym.a;
            if (!arrayList2.contains(c2566dc)) {
                arrayList2.add(c2566dc);
            }
        }
        for (int i3 = 0; i3 < this.q0; i3++) {
            AbstractC0136He.p(this.p0[i3], i, arrayList, ym);
        }
    }

    public void N() {
    }
}
