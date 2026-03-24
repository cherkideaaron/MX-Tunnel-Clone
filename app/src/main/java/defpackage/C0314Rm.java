package defpackage;

import java.util.ArrayList;

/* renamed from: Rm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0314Rm extends QJ {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Object c = null;
    public final /* synthetic */ ArrayList d = null;
    public final /* synthetic */ Object e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ C0348Tm g;

    public C0314Rm(C0348Tm c0348Tm, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.g = c0348Tm;
        this.a = obj;
        this.b = arrayList;
        this.e = obj2;
        this.f = arrayList2;
    }

    @Override // defpackage.QJ, defpackage.OJ
    public final void a(PJ pj) {
        C0348Tm c0348Tm = this.g;
        Object obj = this.a;
        if (obj != null) {
            c0348Tm.s(obj, this.b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            c0348Tm.s(obj2, this.d, null);
        }
        Object obj3 = this.e;
        if (obj3 != null) {
            c0348Tm.s(obj3, this.f, null);
        }
    }

    @Override // defpackage.OJ
    public final void c(PJ pj) {
        pj.y(this);
    }
}
