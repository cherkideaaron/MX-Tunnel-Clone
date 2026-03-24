package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;

/* renamed from: ks, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2964ks implements InterfaceC3207pE {
    public final InterfaceC3207pE a;
    public final InterfaceC3207pE b;

    public C2964ks(InterfaceC3207pE interfaceC3207pE, InterfaceC3207pE interfaceC3207pE2) {
        AbstractC0500aq.m(interfaceC3207pE, "keyDesc");
        AbstractC0500aq.m(interfaceC3207pE2, "valueDesc");
        this.a = interfaceC3207pE;
        this.b = interfaceC3207pE2;
    }

    @Override // defpackage.InterfaceC3207pE
    public final String a() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // defpackage.InterfaceC3207pE
    public final boolean c() {
        return false;
    }

    @Override // defpackage.InterfaceC3207pE
    public final int d(String str) {
        AbstractC0500aq.m(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        Integer numV = BH.V(str);
        if (numV != null) {
            return numV.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid map index"));
    }

    @Override // defpackage.InterfaceC3207pE
    public final MO e() {
        return DH.y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2964ks)) {
            return false;
        }
        C2964ks c2964ks = (C2964ks) obj;
        c2964ks.getClass();
        return AbstractC0500aq.b("kotlin.collections.LinkedHashMap", "kotlin.collections.LinkedHashMap") && AbstractC0500aq.b(this.a, c2964ks.a) && AbstractC0500aq.b(this.b, c2964ks.b);
    }

    @Override // defpackage.InterfaceC3207pE
    public final int f() {
        return 2;
    }

    @Override // defpackage.InterfaceC3207pE
    public final String g(int i) {
        return String.valueOf(i);
    }

    @Override // defpackage.InterfaceC3207pE
    public final List getAnnotations() {
        return C0055Ci.a;
    }

    @Override // defpackage.InterfaceC3207pE
    public final List h(int i) {
        if (i >= 0) {
            return C0055Ci.a;
        }
        throw new IllegalArgumentException(Vs.l(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 710441009) * 31);
    }

    @Override // defpackage.InterfaceC3207pE
    public final InterfaceC3207pE i(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(Vs.l(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.a;
        }
        if (i2 == 1) {
            return this.b;
        }
        throw new IllegalStateException("Unreached".toString());
    }

    @Override // defpackage.InterfaceC3207pE
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.InterfaceC3207pE
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(Vs.l(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.a + ", " + this.b + ')';
    }
}
