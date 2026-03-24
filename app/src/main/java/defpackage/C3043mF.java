package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: mF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3043mF extends AbstractC3371sF {
    public final /* synthetic */ List c;
    public final /* synthetic */ Matrix d;

    public C3043mF(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // defpackage.AbstractC3371sF
    public final void a(Matrix matrix, C2770hF c2770hF, int i, Canvas canvas) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((AbstractC3371sF) it.next()).a(this.d, c2770hF, i, canvas);
        }
    }
}
