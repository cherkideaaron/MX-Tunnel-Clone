package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: rs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3347rs implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ C3725ys a;

    public C3347rs(C3725ys c3725ys) {
        this.a = c3725ys;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C0054Ch c0054Ch;
        if (i == -1 || (c0054Ch = this.a.c) == null) {
            return;
        }
        c0054Ch.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
