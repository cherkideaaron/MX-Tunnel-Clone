package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: ls, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3019ls implements InterfaceC2963kr {
    public final InterfaceC2963kr a = C3427tH.a;
    public final InterfaceC2963kr b;
    public final C2964ks c;

    public C3019ls(InterfaceC2963kr interfaceC2963kr) {
        this.b = interfaceC2963kr;
        this.c = new C2964ks(C3427tH.b, interfaceC2963kr.d());
    }

    @Override // defpackage.InterfaceC2963kr
    public Object a(C2702g2 c2702g2) {
        AbstractC0500aq.m(c2702g2, "decoder");
        return i(c2702g2);
    }

    @Override // defpackage.InterfaceC2963kr
    public final void b(C0206Lg c0206Lg, Object obj) {
        AbstractC0500aq.m(c0206Lg, "encoder");
        h(obj);
        C2964ks c2964ks = this.c;
        AbstractC0500aq.m(c2964ks, "descriptor");
        C0206Lg c0206LgA = c0206Lg.a(c2964ks);
        Iterator itG = g(obj);
        int i = 0;
        while (itG.hasNext()) {
            Map.Entry entry = (Map.Entry) itG.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            c0206LgA.k(c2964ks, i, this.a, key);
            i += 2;
            c0206LgA.k(c2964ks, i2, this.b, value);
        }
        c0206LgA.o(c2964ks);
    }

    @Override // defpackage.InterfaceC2963kr
    public final InterfaceC3207pE d() {
        return this.c;
    }

    public final Object e() {
        return new LinkedHashMap();
    }

    public final int f(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        AbstractC0500aq.m(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    public final Iterator g(Object obj) {
        Map map = (Map) obj;
        AbstractC0500aq.m(map, "<this>");
        return map.entrySet().iterator();
    }

    public final int h(Object obj) {
        Map map = (Map) obj;
        AbstractC0500aq.m(map, "<this>");
        return map.size();
    }

    public final Object i(C2702g2 c2702g2) throws Throwable {
        AbstractC0500aq.m(c2702g2, "decoder");
        Object objE = e();
        int iF = f(objE);
        C2702g2 c2702g2B = c2702g2.b(d());
        while (true) {
            int iE = c2702g2B.e(d());
            if (iE == -1) {
                c2702g2B.q(d());
                return l(objE);
            }
            j(c2702g2B, iE + iF, objE, true);
        }
    }

    public final /* bridge */ void j(C2702g2 c2702g2, int i, Object obj, boolean z) throws Throwable {
        k(c2702g2, i, (Map) obj, z);
    }

    public final void k(C2702g2 c2702g2, int i, Map map, boolean z) throws Throwable {
        int iE;
        AbstractC0500aq.m(map, "builder");
        C2964ks c2964ks = this.c;
        Object objL = c2702g2.l(c2964ks, i, this.a, null);
        if (z) {
            iE = c2702g2.e(c2964ks);
            if (iE != i + 1) {
                throw new IllegalArgumentException(AbstractC3264qG.e(i, iE, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
            }
        } else {
            iE = i + 1;
        }
        boolean zContainsKey = map.containsKey(objL);
        InterfaceC2963kr interfaceC2963kr = this.b;
        map.put(objL, (!zContainsKey || (interfaceC2963kr.d().e() instanceof AbstractC3786zz)) ? c2702g2.l(c2964ks, iE, interfaceC2963kr, null) : c2702g2.l(c2964ks, iE, interfaceC2963kr, Ht.T(map, objL)));
    }

    public final Object l(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        AbstractC0500aq.m(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
