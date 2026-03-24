package defpackage;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class BE {

    @NotNull
    public static final AE Companion = new AE();
    public static final InterfaceC2963kr[] d;
    public final FE a;
    public final XI b;
    public final Map c;

    static {
        C3427tH c3427tH = C3427tH.a;
        d = new InterfaceC2963kr[]{null, null, new C3019ls(Ez.a)};
    }

    public /* synthetic */ BE(int i, FE fe, XI xi, Map map) {
        if (1 != (i & 1)) {
            AbstractC2883jK.O(i, 1, C3748zE.a.d());
            throw null;
        }
        this.a = fe;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = xi;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
    }

    public static BE a(BE be, FE fe, XI xi, Map map, int i) {
        if ((i & 1) != 0) {
            fe = be.a;
        }
        if ((i & 2) != 0) {
            xi = be.b;
        }
        if ((i & 4) != 0) {
            map = be.c;
        }
        be.getClass();
        AbstractC0500aq.m(fe, "sessionDetails");
        return new BE(fe, xi, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BE)) {
            return false;
        }
        BE be = (BE) obj;
        return AbstractC0500aq.b(this.a, be.a) && AbstractC0500aq.b(this.b, be.b) && AbstractC0500aq.b(this.c, be.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        XI xi = this.b;
        int iHashCode2 = (iHashCode + (xi == null ? 0 : xi.hashCode())) * 31;
        Map map = this.c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.a + ", backgroundTime=" + this.b + ", processDataMap=" + this.c + ')';
    }

    public BE(FE fe, XI xi, Map map) {
        AbstractC0500aq.m(fe, "sessionDetails");
        this.a = fe;
        this.b = xi;
        this.c = map;
    }
}
