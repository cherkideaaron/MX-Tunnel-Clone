package defpackage;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class AB {
    public SparseArray a;
    public int b;

    public final C3745zB a(int i) {
        SparseArray sparseArray = this.a;
        C3745zB c3745zB = (C3745zB) sparseArray.get(i);
        if (c3745zB != null) {
            return c3745zB;
        }
        C3745zB c3745zB2 = new C3745zB();
        sparseArray.put(i, c3745zB2);
        return c3745zB2;
    }
}
