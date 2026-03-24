package defpackage;

import java.util.HashMap;

/* renamed from: Rj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311Rj extends C3423tD {
    public final HashMap e = new HashMap();

    @Override // defpackage.C3423tD
    public final C3261qD a(Object obj) {
        return (C3261qD) this.e.get(obj);
    }

    @Override // defpackage.C3423tD
    public final Object b(Object obj) {
        Object objB = super.b(obj);
        this.e.remove(obj);
        return objB;
    }

    public final Object c(Object obj, Object obj2) {
        C3261qD c3261qDA = a(obj);
        if (c3261qDA != null) {
            return c3261qDA.b;
        }
        HashMap map = this.e;
        C3261qD c3261qD = new C3261qD(obj, obj2);
        this.d++;
        C3261qD c3261qD2 = this.b;
        if (c3261qD2 == null) {
            this.a = c3261qD;
        } else {
            c3261qD2.c = c3261qD;
            c3261qD.d = c3261qD2;
        }
        this.b = c3261qD;
        map.put(obj, c3261qD);
        return null;
    }
}
