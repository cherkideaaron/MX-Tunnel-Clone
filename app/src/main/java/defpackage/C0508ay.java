package defpackage;

import android.widget.SearchView;

/* renamed from: ay, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0508ay implements SearchView.OnQueryTextListener {
    public final /* synthetic */ C2646f1 a;

    public C0508ay(C2646f1 c2646f1) {
        this.a = c2646f1;
    }

    @Override // android.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextChange(String str) {
        C2646f1 c2646f1 = this.a;
        c2646f1.getClass();
        new C2591e1(c2646f1).filter(str);
        return true;
    }

    @Override // android.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextSubmit(String str) {
        return false;
    }
}
