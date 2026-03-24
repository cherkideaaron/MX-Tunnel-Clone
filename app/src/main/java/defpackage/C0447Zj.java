package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: Zj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0447Zj {
    public static final /* synthetic */ int c = 0;
    public final C2552dG a = C2552dG.g();
    public boolean b;

    static {
        new C0447Zj(0);
    }

    public C0447Zj() {
    }

    public static void b(C3221pa c3221pa, KN kn, int i, Object obj) throws IOException {
        if (kn == KN.d) {
            c3221pa.U0(i, 3);
            ((AbstractC3733z) obj).c(c3221pa);
            c3221pa.U0(i, 4);
            return;
        }
        c3221pa.U0(i, kn.b);
        switch (kn.ordinal()) {
            case 0:
                c3221pa.N0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                c3221pa.L0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                c3221pa.Y0(((Long) obj).longValue());
                return;
            case 3:
                c3221pa.Y0(((Long) obj).longValue());
                return;
            case 4:
                c3221pa.P0(((Integer) obj).intValue());
                return;
            case 5:
                c3221pa.N0(((Long) obj).longValue());
                return;
            case 6:
                c3221pa.L0(((Integer) obj).intValue());
                return;
            case 7:
                c3221pa.E0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (!(obj instanceof C0519b8)) {
                    c3221pa.T0((String) obj);
                    return;
                }
                break;
            case 9:
                ((AbstractC3733z) obj).c(c3221pa);
                return;
            case 10:
                c3221pa.R0((AbstractC3733z) obj);
                return;
            case 11:
                if (!(obj instanceof C0519b8)) {
                    byte[] bArr = (byte[]) obj;
                    c3221pa.H0(bArr.length, bArr);
                    return;
                }
                break;
            case 12:
                c3221pa.W0(((Integer) obj).intValue());
                return;
            case 13:
                c3221pa.P0(((Integer) obj).intValue());
                return;
            case 14:
                c3221pa.L0(((Integer) obj).intValue());
                return;
            case 15:
                c3221pa.N0(((Long) obj).longValue());
                return;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c3221pa.W0((iIntValue >> 31) ^ (iIntValue << 1));
                return;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                c3221pa.Y0((jLongValue >> 63) ^ (jLongValue << 1));
                return;
            default:
                return;
        }
        c3221pa.J0((C0519b8) obj);
    }

    public final void a() {
        if (this.b) {
            return;
        }
        C2552dG c2552dG = this.a;
        int size = c2552dG.a.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entryD = c2552dG.d(i);
            if (entryD.getValue() instanceof AbstractC0247Nn) {
                AbstractC0247Nn abstractC0247Nn = (AbstractC0247Nn) entryD.getValue();
                abstractC0247Nn.getClass();
                C2928kA c2928kA = C2928kA.c;
                c2928kA.getClass();
                c2928kA.a(abstractC0247Nn.getClass()).c(abstractC0247Nn);
                abstractC0247Nn.k();
            }
        }
        if (!c2552dG.c) {
            if (c2552dG.a.size() > 0) {
                Vs.u(c2552dG.d(0).getKey());
                throw null;
            }
            Iterator it = c2552dG.e().iterator();
            if (it.hasNext()) {
                Vs.u(((Map.Entry) it.next()).getKey());
                throw null;
            }
        }
        if (!c2552dG.c) {
            c2552dG.b = c2552dG.b.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c2552dG.b);
            c2552dG.e = c2552dG.e.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c2552dG.e);
            c2552dG.c = true;
        }
        this.b = true;
    }

    public final Object clone() {
        C0447Zj c0447Zj = new C0447Zj();
        C2552dG c2552dG = this.a;
        if (c2552dG.a.size() > 0) {
            Map.Entry entryD = c2552dG.d(0);
            Vs.u(entryD.getKey());
            entryD.getValue();
            throw null;
        }
        Iterator it = c2552dG.e().iterator();
        if (!it.hasNext()) {
            return c0447Zj;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Vs.u(entry.getKey());
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0447Zj) {
            return this.a.equals(((C0447Zj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public C0447Zj(int i) {
        a();
        a();
    }
}
