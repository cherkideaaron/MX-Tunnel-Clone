package defpackage;

import android.database.DataSetObserver;

/* renamed from: vs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3563vs extends DataSetObserver {
    public final /* synthetic */ C3725ys a;

    public C3563vs(C3725ys c3725ys) {
        this.a = c3725ys;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C3725ys c3725ys = this.a;
        if (c3725ys.F.isShowing()) {
            c3725ys.show();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.dismiss();
    }
}
