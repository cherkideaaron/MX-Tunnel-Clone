package defpackage;

import android.view.View;
import java.util.ArrayList;

/* renamed from: Qm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0297Qm implements OJ {
    public final /* synthetic */ View a;
    public final /* synthetic */ ArrayList b;

    public C0297Qm(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    @Override // defpackage.OJ
    public final void a(PJ pj) {
        pj.y(this);
        pj.a(this);
    }

    @Override // defpackage.OJ
    public final void c(PJ pj) {
        pj.y(this);
        this.a.setVisibility(8);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // defpackage.OJ
    public final void d(PJ pj) {
        a(pj);
    }

    @Override // defpackage.OJ
    public final void e(PJ pj) {
        c(pj);
    }

    @Override // defpackage.OJ
    public final void g(PJ pj) {
    }

    @Override // defpackage.OJ
    public final void b() {
    }

    @Override // defpackage.OJ
    public final void f() {
    }
}
