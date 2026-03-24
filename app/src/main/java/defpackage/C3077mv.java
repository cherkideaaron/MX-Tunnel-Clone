package defpackage;

import android.util.SparseArray;

/* renamed from: mv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3077mv {
    public final SparseArray a;
    public C3268qK b;

    public C3077mv(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(C3268qK c3268qK, int i, int i2) {
        int iA = c3268qK.a(i);
        SparseArray sparseArray = this.a;
        C3077mv c3077mv = sparseArray == null ? null : (C3077mv) sparseArray.get(iA);
        if (c3077mv == null) {
            c3077mv = new C3077mv(1);
            sparseArray.put(c3268qK.a(i), c3077mv);
        }
        if (i2 > i) {
            c3077mv.a(c3268qK, i + 1, i2);
        } else {
            c3077mv.b = c3268qK;
        }
    }
}
