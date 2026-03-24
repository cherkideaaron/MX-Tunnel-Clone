package defpackage;

import org.jetbrains.annotations.NotNull;

/* renamed from: yE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3694yE {

    @NotNull
    public static final C3640xE Companion = new C3640xE();
    public final Boolean a;
    public final Double b;
    public final Integer c;
    public final Integer d;
    public final Long e;

    public /* synthetic */ C3694yE(int i, Boolean bool, Double d, Integer num, Integer num2, Long l) {
        if (31 != (i & 31)) {
            AbstractC2883jK.O(i, 31, C3586wE.a.d());
            throw null;
        }
        this.a = bool;
        this.b = d;
        this.c = num;
        this.d = num2;
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3694yE)) {
            return false;
        }
        C3694yE c3694yE = (C3694yE) obj;
        return AbstractC0500aq.b(this.a, c3694yE.a) && AbstractC0500aq.b(this.b, c3694yE.b) && AbstractC0500aq.b(this.c, c3694yE.c) && AbstractC0500aq.b(this.d, c3694yE.d) && AbstractC0500aq.b(this.e, c3694yE.e);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.e;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.a + ", sessionSamplingRate=" + this.b + ", sessionTimeoutSeconds=" + this.c + ", cacheDurationSeconds=" + this.d + ", cacheUpdatedTimeSeconds=" + this.e + ')';
    }

    public C3694yE(Boolean bool, Double d, Integer num, Integer num2, Long l) {
        this.a = bool;
        this.b = d;
        this.c = num;
        this.d = num2;
        this.e = l;
    }
}
