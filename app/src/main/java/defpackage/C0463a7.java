package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: a7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0463a7 {
    public int a;
    public int b;
    public int c;
    public Object d;

    public C0463a7(AbstractC3111na abstractC3111na) {
        this.c = 0;
        Charset charset = AbstractC0368Up.a;
        this.d = abstractC3111na;
        abstractC3111na.d = this;
    }

    public void A(Zr zr, C0502as c0502as) {
        ((Xr) this.d).b.getClass();
        float fMax = Math.max(0.0f, Math.min(1.0f, 1.0f));
        float lowestVisibleX = zr.getLowestVisibleX();
        float highestVisibleX = zr.getHighestVisibleX();
        C0327Si c0327SiC = c0502as.c(lowestVisibleX, Float.NaN, 2);
        C0327Si c0327SiC2 = c0502as.c(highestVisibleX, Float.NaN, 1);
        List list = c0502as.m;
        this.a = c0327SiC == null ? 0 : list.indexOf(c0327SiC);
        this.b = c0327SiC2 != null ? list.indexOf(c0327SiC2) : 0;
        this.c = (int) ((r2 - this.a) * fMax);
    }

    public boolean B() {
        int i;
        AbstractC3111na abstractC3111na = (AbstractC3111na) this.d;
        if (abstractC3111na.i() || (i = this.a) == this.b) {
            return false;
        }
        return abstractC3111na.F(i);
    }

    public void a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.c;
        int i4 = i3 * 2;
        int[] iArr = (int[]) this.d;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.d = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.d = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.d;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.c++;
    }

    public void b() {
        int i = this.c;
        View view = (View) this.d;
        int top = i - (view.getTop() - this.a);
        WeakHashMap weakHashMap = UL.a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.b));
    }

    public void c(RecyclerView recyclerView, boolean z) {
        this.c = 0;
        int[] iArr = (int[]) this.d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC3529vB abstractC3529vB = recyclerView.r;
        if (recyclerView.q == null || abstractC3529vB == null || !abstractC3529vB.i) {
            return;
        }
        if (z) {
            if (!recyclerView.d.s()) {
                abstractC3529vB.i(recyclerView.q.a(), this);
            }
        } else if (!recyclerView.K()) {
            abstractC3529vB.h(this.a, this.b, recyclerView.j0, this);
        }
        int i = this.c;
        if (i > abstractC3529vB.j) {
            abstractC3529vB.j = i;
            abstractC3529vB.k = z;
            recyclerView.b.l();
        }
    }

    public int d() {
        int i = this.c;
        if (i != 0) {
            this.a = i;
            this.c = 0;
        } else {
            this.a = ((AbstractC3111na) this.d).A();
        }
        int i2 = this.a;
        return (i2 == 0 || i2 == this.b) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i2 >>> 3;
    }

    public void e(Object obj, PD pd, C3500uj c3500uj) {
        int i = this.b;
        this.b = ((this.a >>> 3) << 3) | 4;
        try {
            pd.e(obj, this, c3500uj);
            if (this.a == this.b) {
            } else {
                throw new C2744gq("Failed to parse the message.");
            }
        } finally {
            this.b = i;
        }
    }

    public void f(Object obj, PD pd, C3500uj c3500uj) throws C2744gq {
        AbstractC3111na abstractC3111na = (AbstractC3111na) this.d;
        int iB = abstractC3111na.B();
        if (abstractC3111na.a >= abstractC3111na.b) {
            throw new C2744gq("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iK = abstractC3111na.k(iB);
        abstractC3111na.a++;
        pd.e(obj, this, c3500uj);
        abstractC3111na.c(0);
        abstractC3111na.a--;
        abstractC3111na.j(iK);
    }

    public void g(InterfaceC0351Tp interfaceC0351Tp) throws C2744gq {
        int iA;
        int i = this.a & 7;
        AbstractC3111na abstractC3111na = (AbstractC3111na) this.d;
        if (i == 0) {
            do {
                ((C2983lA) interfaceC0351Tp).add(Boolean.valueOf(abstractC3111na.l()));
                if (abstractC3111na.i()) {
                    return;
                } else {
                    iA = abstractC3111na.A();
                }
            } while (iA == this.a);
            this.c = iA;
            return;
        }
        if (i != 2) {
            throw C2744gq.b();
        }
        int iG = abstractC3111na.g() + abstractC3111na.B();
        do {
            ((C2983lA) interfaceC0351Tp).add(Boolean.valueOf(abstractC3111na.l()));
        } while (abstractC3111na.g() < iG);
        y(iG);
    }

    public C0519b8 h() throws C2689fq {
        z(2);
        return ((AbstractC3111na) this.d).m();
    }

    public void i(InterfaceC0351Tp interfaceC0351Tp) throws C2689fq {
        int iA;
        if ((this.a & 7) != 2) {
            throw C2744gq.b();
        }
        do {
            ((C2983lA) interfaceC0351Tp).add(h());
            AbstractC3111na abstractC3111na = (AbstractC3111na) this.d;
            if (abstractC3111na.i()) {
                return;
            } else {
                iA = abstractC3111na.A();
            }
        } while (iA == this.a);
        this.c = iA;
    }

    public void j(InterfaceC0351Tp interfaceC0351Tp) throws C2744gq {
        int iA;
        int i = this.a & 7;
        AbstractC3111na abstractC3111na = (AbstractC3111na) this.d;
        if (i == 1) {
            do {
                ((C2983lA) interfaceC0351Tp).add(Double.valueOf(abstractC3111na.n()));
                if (abstractC3111na.i()) {
                    return;
                } else {
                    iA = abstractC3111na.A();
                }
            } while (iA == this.a);
            this.c = iA;
            return;
        }
        if (i != 2) {
            throw C2744gq.b();
        }
        int iB = abstractC3111na.B();
        if ((iB & 7) != 0) {
            throw new C2744gq("Failed to parse the message.");
        }
        int iG = abstractC3111na.g() + iB;
        do {
            ((C2983lA) interfaceC0351Tp).add(Double.valueOf(abstractC3111na.n()));
        } while (abstractC3111na.g() < iG);
    }

    public void k(InterfaceC0351Tp interfaceC0351Tp) throws C2744gq {
        int iA;
        int i = this.a & 7;
        AbstractC3111na abstractC3111na = (AbstractC3111na) this.d;
        if (i == 0) {
            do {
                ((C2983lA) interfaceC0351Tp).add(Integer.valueOf(abstractC3111na.o()));
                if (abstractC3111na.i()) {
                    return;
                } else {
                    iA = abstractC3111na.A();
                }
            } while (iA == this.a);
            this.c = iA;
            return;
        }
        if (i != 2) {
            throw C2744gq.b();
        }
        int iG = abstractC3111na.g() + abstractC3111na.B();
        do {
            ((C2983lA) interfaceC0351Tp).add(Integer.valueOf(abstractC3111na.o()));
        } while (abstractC3111na.g() < iG);
        y(iG);
    }

    public Object l(KN kn, Class cls, C3500uj c3500uj) throws C2744gq {
        int iOrdinal = kn.ordinal();
        AbstractC3111na abstractC3111na = (AbstractC3111na) this.d;
        switch (iOrdinal) {
            case 0:
                z(1);
                return Double.valueOf(abstractC3111na.n());
            case 1:
                z(5);
                return Float.valueOf(abstractC3111na.r());
            case 2:
                z(0);
                return Long.valueOf(abstractC3111na.t());
            case 3:
                z(0);
                return Long.valueOf(abstractC3111na.C());
            case 4:
                z(0);
                return Integer.valueOf(abstractC3111na.s());
            case 5:
                z(1);
                return Long.valueOf(abstractC3111na.q());
            case 6:
                z(5);
                return Integer.valueOf(abstractC3111na.p());
            case 7:
                z(0);
                return Boolean.valueOf(abstractC3111na.l());
            case 8:
                z(2);
                return abstractC3111na.z();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                z(2);
                PD pdA = C2928kA.c.a(cls);
                AbstractC0247Nn abstractC0247NnH = pdA.h();
                f(abstractC0247NnH, pdA, c3500uj);
                pdA.c(abstractC0247NnH);
                return abstractC0247NnH;
            case 11:
                return h();
            case 12:
                z(0);
                return Integer.valueOf(abstractC3111na.B());
            case 13:
                z(0);
                return Integer.valueOf(abstractC3111na.o());
            case 14:
                z(5);
                return Integer.valueOf(abstractC3111na.u());
            case 15:
                z(1);
                return Long.valueOf(abstractC3111na.v());
            case 16:
                z(0);
                return Integer.valueOf(abstractC3111na.w());
            case 17:
                z(0);
                return Long.valueOf(abstractC3111na.x());
        }
    }

    public void m(InterfaceC0351Tp interfaceC0351Tp) throws C2744gq {
        int iA;
        int i = this.a & 7;
        AbstractC3111na abstractC3111na = (AbstractC3111na) this.d;
        if (i == 2) {
            int iB = abstractC3111na.B();
            if ((iB & 3) != 0) {
                throw new C2744gq("Failed to parse the message.");
            }
            int iG = abstractC3111na.g() + iB;
            do {
                ((C2983lA) interfaceC0351Tp).add(Integer.valueOf(abstractC3111na.p()));
            } while (abstractC3111na.g() < iG);
            return;
        }
        if (i != 5) {
            throw C2744gq.b();
        }
        do {
            ((C2983lA) interfaceC0351Tp).add(Integer.valueOf(abstractC3111na.p()));
            if (abstractC3111na.i()) {
                return;
            } else {
                iA = abstractC3111na.A();
            }
        } while (iA == this.a);
        this.c = iA;
    }

    public void n(InterfaceC0351Tp interfaceC0351Tp) throws C2744gq {
        int iA;
        int i = this.a & 7;
        AbstractC3111na abstractC3111na = (AbstractC3111na) this.d;
        if (i == 1) {
            do {
                ((C2983lA) interfaceC0351Tp).add(Long.valueOf(abstractC3111na.q()));
                if (abstractC3111na.i()) {
                    return;
                } else {
                    iA = abstractC3111na.A();
                }
            } while (iA == this.a);
            this.c = iA;
            return;
        }
        if (i != 2) {
            throw C2744gq.b();
        }
        int iB = abstractC3111na.B();
        if ((iB & 7) != 0) {
            throw new C2744gq("Failed to parse the message.");
        }
        int iG = abstractC3111na.g() + iB;
        do {
            ((C2983lA) interfaceC0351Tp).add(Long.valueOf(abstractC3111na.q()));
        } while (abstractC3111na.g() < iG);
    }

    public void o(InterfaceC0351Tp interfaceC0351Tp) throws C2744gq {
        int iA;
        int i = this.a & 7;
        AbstractC3111na abstractC3111na = (AbstractC3111na) this.d;
        if (i == 2) {
            int iB = abstractC3111na.B();
            if ((iB & 3) != 0) {
                throw new C2744gq("Failed to parse the message.");
            }
            int iG = abstractC3111na.g() + iB;
            do {
                ((C2983lA) interfaceC0351Tp).add(Float.valueOf(abstractC3111na.r()));
            } while (abstractC3111na.g() < iG);
            return;
        }
        if (i != 5) {
            throw C2744gq.b();
        }
        do {
            ((C2983lA) interfaceC0351Tp).add(Float.valueOf(abstractC3111na.r()));
            if (abstractC3111na.i()) {
                return;
            } else {
                iA = abstractC3111na.A();
            }
        } while (iA == this.a);
        this.c = iA;
    }

    public void p(InterfaceC0351Tp interfaceC0351Tp) throws C2744gq {
        int iA;
        int i = this.a & 7;
        AbstractC3111na abstractC3111na = (AbstractC3111na) this.d;
        if (i == 0) {
            do {
                ((C2983lA) interfaceC0351Tp).add(Integer.valueOf(abstractC3111na.s()));
                if (abstractC3111na.i()) {
                    return;
                } else {
                    iA = abstractC3111na.A();
                }
            } while (iA == this.a);
            this.c = iA;
            return;
        }
        if (i != 2) {
            throw C2744gq.b();
        }
        int iG = abstractC3111na.g() + abstractC3111na.B();
        do {
            ((C2983lA) interfaceC0351Tp).add(Integer.valueOf(abstractC3111na.s()));
        } while (abstractC3111na.g() < iG);
        y(iG);
    }

    public void q(InterfaceC0351Tp interfaceC0351Tp) throws C2744gq {
        int iA;
        int i = this.a & 7;
        AbstractC3111na abstractC3111na = (AbstractC3111na) this.d;
        if (i == 0) {
            do {
                ((C2983lA) interfaceC0351Tp).add(Long.valueOf(abstractC3111na.t()));
                if (abstractC3111na.i()) {
                    return;
                } else {
                    iA = abstractC3111na.A();
                }
            } while (iA == this.a);
            this.c = iA;
            return;
        }
        if (i != 2) {
            throw C2744gq.b();
        }
        int iG = abstractC3111na.g() + abstractC3111na.B();
        do {
            ((C2983lA) interfaceC0351Tp).add(Long.valueOf(abstractC3111na.t()));
        } while (abstractC3111na.g() < iG);
        y(iG);
    }

    public void r(InterfaceC0351Tp interfaceC0351Tp) throws C2744gq {
        int iA;
        int i = this.a & 7;
        AbstractC3111na abstractC3111na = (AbstractC3111na) this.d;
        if (i == 2) {
            int iB = abstractC3111na.B();
            if ((iB & 3) != 0) {
                throw new C2744gq("Failed to parse the message.");
            }
            int iG = abstractC3111na.g() + iB;
            do {
                ((C2983lA) interfaceC0351Tp).add(Integer.valueOf(abstractC3111na.u()));
            } while (abstractC3111na.g() < iG);
            return;
        }
        if (i != 5) {
            throw C2744gq.b();
        }
        do {
            ((C2983lA) interfaceC0351Tp).add(Integer.valueOf(abstractC3111na.u()));
            if (abstractC3111na.i()) {
                return;
            } else {
                iA = abstractC3111na.A();
            }
        } while (iA == this.a);
        this.c = iA;
    }

    public void s(InterfaceC0351Tp interfaceC0351Tp) throws C2744gq {
        int iA;
        int i = this.a & 7;
        AbstractC3111na abstractC3111na = (AbstractC3111na) this.d;
        if (i == 1) {
            do {
                ((C2983lA) interfaceC0351Tp).add(Long.valueOf(abstractC3111na.v()));
                if (abstractC3111na.i()) {
                    return;
                } else {
                    iA = abstractC3111na.A();
                }
            } while (iA == this.a);
            this.c = iA;
            return;
        }
        if (i != 2) {
            throw C2744gq.b();
        }
        int iB = abstractC3111na.B();
        if ((iB & 7) != 0) {
            throw new C2744gq("Failed to parse the message.");
        }
        int iG = abstractC3111na.g() + iB;
        do {
            ((C2983lA) interfaceC0351Tp).add(Long.valueOf(abstractC3111na.v()));
        } while (abstractC3111na.g() < iG);
    }

    public void t(InterfaceC0351Tp interfaceC0351Tp) throws C2744gq {
        int iA;
        int i = this.a & 7;
        AbstractC3111na abstractC3111na = (AbstractC3111na) this.d;
        if (i == 0) {
            do {
                ((C2983lA) interfaceC0351Tp).add(Integer.valueOf(abstractC3111na.w()));
                if (abstractC3111na.i()) {
                    return;
                } else {
                    iA = abstractC3111na.A();
                }
            } while (iA == this.a);
            this.c = iA;
            return;
        }
        if (i != 2) {
            throw C2744gq.b();
        }
        int iG = abstractC3111na.g() + abstractC3111na.B();
        do {
            ((C2983lA) interfaceC0351Tp).add(Integer.valueOf(abstractC3111na.w()));
        } while (abstractC3111na.g() < iG);
        y(iG);
    }

    public void u(InterfaceC0351Tp interfaceC0351Tp) throws C2744gq {
        int iA;
        int i = this.a & 7;
        AbstractC3111na abstractC3111na = (AbstractC3111na) this.d;
        if (i == 0) {
            do {
                ((C2983lA) interfaceC0351Tp).add(Long.valueOf(abstractC3111na.x()));
                if (abstractC3111na.i()) {
                    return;
                } else {
                    iA = abstractC3111na.A();
                }
            } while (iA == this.a);
            this.c = iA;
            return;
        }
        if (i != 2) {
            throw C2744gq.b();
        }
        int iG = abstractC3111na.g() + abstractC3111na.B();
        do {
            ((C2983lA) interfaceC0351Tp).add(Long.valueOf(abstractC3111na.x()));
        } while (abstractC3111na.g() < iG);
        y(iG);
    }

    public void v(InterfaceC0351Tp interfaceC0351Tp, boolean z) throws C2689fq {
        String strY;
        int iA;
        if ((this.a & 7) != 2) {
            throw C2744gq.b();
        }
        do {
            AbstractC3111na abstractC3111na = (AbstractC3111na) this.d;
            if (z) {
                z(2);
                strY = abstractC3111na.z();
            } else {
                z(2);
                strY = abstractC3111na.y();
            }
            ((C2983lA) interfaceC0351Tp).add(strY);
            if (abstractC3111na.i()) {
                return;
            } else {
                iA = abstractC3111na.A();
            }
        } while (iA == this.a);
        this.c = iA;
    }

    public void w(InterfaceC0351Tp interfaceC0351Tp) throws C2744gq {
        int iA;
        int i = this.a & 7;
        AbstractC3111na abstractC3111na = (AbstractC3111na) this.d;
        if (i == 0) {
            do {
                ((C2983lA) interfaceC0351Tp).add(Integer.valueOf(abstractC3111na.B()));
                if (abstractC3111na.i()) {
                    return;
                } else {
                    iA = abstractC3111na.A();
                }
            } while (iA == this.a);
            this.c = iA;
            return;
        }
        if (i != 2) {
            throw C2744gq.b();
        }
        int iG = abstractC3111na.g() + abstractC3111na.B();
        do {
            ((C2983lA) interfaceC0351Tp).add(Integer.valueOf(abstractC3111na.B()));
        } while (abstractC3111na.g() < iG);
        y(iG);
    }

    public void x(InterfaceC0351Tp interfaceC0351Tp) throws C2744gq {
        int iA;
        int i = this.a & 7;
        AbstractC3111na abstractC3111na = (AbstractC3111na) this.d;
        if (i == 0) {
            do {
                ((C2983lA) interfaceC0351Tp).add(Long.valueOf(abstractC3111na.C()));
                if (abstractC3111na.i()) {
                    return;
                } else {
                    iA = abstractC3111na.A();
                }
            } while (iA == this.a);
            this.c = iA;
            return;
        }
        if (i != 2) {
            throw C2744gq.b();
        }
        int iG = abstractC3111na.g() + abstractC3111na.B();
        do {
            ((C2983lA) interfaceC0351Tp).add(Long.valueOf(abstractC3111na.C()));
        } while (abstractC3111na.g() < iG);
        y(iG);
    }

    public void y(int i) throws C2744gq {
        if (((AbstractC3111na) this.d).g() != i) {
            throw C2744gq.e();
        }
    }

    public void z(int i) throws C2689fq {
        if ((this.a & 7) != i) {
            throw C2744gq.b();
        }
    }
}
