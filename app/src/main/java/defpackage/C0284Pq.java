package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* renamed from: Pq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0284Pq {
    public static final C0284Pq d = new C0284Pq();
    public final C0318Rq a = new C0318Rq();
    public final C0108Fk b = AbstractC2883jK.k;
    public final C2524cp c = new C2524cp(12);

    public final Object a(InterfaceC2963kr interfaceC2963kr, String str) {
        AbstractC0500aq.m(interfaceC2963kr, "deserializer");
        C3210pH c3210pHB = AbstractC0069Df.b(this, str);
        Object objN = new C2702g2(this, EnumC3596wO.c, c3210pHB, interfaceC2963kr.d(), null).n(interfaceC2963kr);
        if (c3210pHB.e() == 10) {
            return objN;
        }
        C3210pH.m(c3210pHB, "Expected EOF after parsing, but had " + c3210pHB.e.charAt(c3210pHB.a - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final String b(InterfaceC2963kr interfaceC2963kr, Object obj) {
        char[] cArr;
        AbstractC0500aq.m(interfaceC2963kr, "serializer");
        C3249q1 c3249q1 = new C3249q1(3);
        C2872j9 c2872j9 = C2872j9.c;
        synchronized (c2872j9) {
            T3 t3 = c2872j9.a;
            cArr = null;
            char[] cArr2 = (char[]) (t3.isEmpty() ? null : t3.removeLast());
            if (cArr2 != null) {
                c2872j9.b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[UserVerificationMethods.USER_VERIFY_PATTERN];
        }
        c3249q1.c = cArr;
        try {
            MO.m(this, c3249q1, interfaceC2963kr, obj);
            return c3249q1.toString();
        } finally {
            c3249q1.e();
        }
    }
}
