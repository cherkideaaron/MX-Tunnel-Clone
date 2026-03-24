package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: az, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0509az implements InterfaceC3207pE, InterfaceC2763h8 {
    public final String a;
    public final InterfaceC0264On b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final InterfaceC3508ur i;
    public final InterfaceC3508ur j;
    public final InterfaceC3508ur k;

    public C0509az(String str, InterfaceC0264On interfaceC0264On, int i) {
        final int i2 = 1;
        this.a = str;
        this.b = interfaceC0264On;
        this.c = i;
        String[] strArr = new String[i];
        final int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            strArr[i4] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i5 = this.c;
        this.f = new List[i5];
        this.g = new boolean[i5];
        this.h = C0072Di.a;
        EnumC3670xr[] enumC3670xrArr = EnumC3670xr.a;
        this.i = AbstractC0069Df.F(new InterfaceC0606cn(this) { // from class: Zy
            public final /* synthetic */ C0509az b;

            {
                this.b = this;
            }

            @Override // defpackage.InterfaceC0606cn
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        InterfaceC0264On interfaceC0264On2 = this.b.b;
                        return interfaceC0264On2 != null ? interfaceC0264On2.c() : MO.i;
                    case 1:
                        return AbstractC2883jK.o(this.b.b != null ? new ArrayList(0) : null);
                    default:
                        C0509az c0509az = this.b;
                        return Integer.valueOf(MO.u(c0509az, (InterfaceC3207pE[]) c0509az.j.getValue()));
                }
            }
        });
        this.j = AbstractC0069Df.F(new InterfaceC0606cn(this) { // from class: Zy
            public final /* synthetic */ C0509az b;

            {
                this.b = this;
            }

            @Override // defpackage.InterfaceC0606cn
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        InterfaceC0264On interfaceC0264On2 = this.b.b;
                        return interfaceC0264On2 != null ? interfaceC0264On2.c() : MO.i;
                    case 1:
                        return AbstractC2883jK.o(this.b.b != null ? new ArrayList(0) : null);
                    default:
                        C0509az c0509az = this.b;
                        return Integer.valueOf(MO.u(c0509az, (InterfaceC3207pE[]) c0509az.j.getValue()));
                }
            }
        });
        final int i6 = 2;
        this.k = AbstractC0069Df.F(new InterfaceC0606cn(this) { // from class: Zy
            public final /* synthetic */ C0509az b;

            {
                this.b = this;
            }

            @Override // defpackage.InterfaceC0606cn
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        InterfaceC0264On interfaceC0264On2 = this.b.b;
                        return interfaceC0264On2 != null ? interfaceC0264On2.c() : MO.i;
                    case 1:
                        return AbstractC2883jK.o(this.b.b != null ? new ArrayList(0) : null);
                    default:
                        C0509az c0509az = this.b;
                        return Integer.valueOf(MO.u(c0509az, (InterfaceC3207pE[]) c0509az.j.getValue()));
                }
            }
        });
    }

    @Override // defpackage.InterfaceC3207pE
    public final String a() {
        return this.a;
    }

    @Override // defpackage.InterfaceC2763h8
    public final Set b() {
        return this.h.keySet();
    }

    @Override // defpackage.InterfaceC3207pE
    public final boolean c() {
        return false;
    }

    @Override // defpackage.InterfaceC3207pE
    public final int d(String str) {
        AbstractC0500aq.m(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        Integer num = (Integer) this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.InterfaceC3207pE
    public final MO e() {
        return DH.w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0509az) {
            InterfaceC3207pE interfaceC3207pE = (InterfaceC3207pE) obj;
            if (AbstractC0500aq.b(this.a, interfaceC3207pE.a()) && Arrays.equals((InterfaceC3207pE[]) this.j.getValue(), (InterfaceC3207pE[]) ((C0509az) obj).j.getValue())) {
                int iF = interfaceC3207pE.f();
                int i = this.c;
                if (i == iF) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (AbstractC0500aq.b(i(i2).a(), interfaceC3207pE.i(i2).a()) && AbstractC0500aq.b(i(i2).e(), interfaceC3207pE.i(i2).e())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC3207pE
    public final int f() {
        return this.c;
    }

    @Override // defpackage.InterfaceC3207pE
    public final String g(int i) {
        return this.e[i];
    }

    @Override // defpackage.InterfaceC3207pE
    public final List getAnnotations() {
        return C0055Ci.a;
    }

    @Override // defpackage.InterfaceC3207pE
    public final List h(int i) {
        List list = this.f[i];
        return list == null ? C0055Ci.a : list;
    }

    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // defpackage.InterfaceC3207pE
    public final InterfaceC3207pE i(int i) {
        return ((InterfaceC2963kr[]) this.i.getValue())[i].d();
    }

    @Override // defpackage.InterfaceC3207pE
    public boolean isInline() {
        return false;
    }

    @Override // defpackage.InterfaceC3207pE
    public final boolean j(int i) {
        return this.g[i];
    }

    public final void k(String str, boolean z) {
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.g[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = map;
        }
    }

    public final String toString() {
        return AbstractC3383sa.c0(AbstractC0069Df.g0(0, this.c), ", ", this.a + '(', ")", new C2809i(this, 3), 24);
    }
}
