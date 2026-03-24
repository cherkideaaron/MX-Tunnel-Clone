package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* renamed from: Lg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0206Lg {
    public boolean a;
    public String b;
    public final Object c;
    public final Object d;
    public final Serializable e;
    public Object f;
    public final Object g;
    public Serializable h;

    public C0206Lg(H7 h7, C0284Pq c0284Pq, EnumC3596wO enumC3596wO, C0206Lg[] c0206LgArr) {
        AbstractC0500aq.m(h7, "composer");
        AbstractC0500aq.m(c0284Pq, "json");
        AbstractC0500aq.m(enumC3596wO, "mode");
        this.c = h7;
        this.d = c0284Pq;
        this.e = enumC3596wO;
        this.f = c0206LgArr;
        this.g = c0284Pq.a;
        int iOrdinal = enumC3596wO.ordinal();
        if (c0206LgArr != null) {
            C0206Lg c0206Lg = c0206LgArr[iOrdinal];
            if (c0206Lg == null && c0206Lg == this) {
                return;
            }
            c0206LgArr[iOrdinal] = this;
        }
    }

    public C0206Lg a(InterfaceC3207pE interfaceC3207pE) {
        C0206Lg c0206Lg;
        AbstractC0500aq.m(interfaceC3207pE, "descriptor");
        C0284Pq c0284Pq = (C0284Pq) this.d;
        EnumC3596wO enumC3596wOC = AbstractC3650xO.c(c0284Pq, interfaceC3207pE);
        char c = enumC3596wOC.a;
        H7 h7 = (H7) this.c;
        h7.g(c);
        h7.c();
        String str = this.b;
        if (str != null) {
            String strA = (String) this.h;
            if (strA == null) {
                strA = interfaceC3207pE.a();
            }
            h7.e();
            m(str);
            h7.g(':');
            h7.l();
            m(strA);
            this.b = null;
            this.h = null;
        }
        if (((EnumC3596wO) this.e) == enumC3596wOC) {
            return this;
        }
        C0206Lg[] c0206LgArr = (C0206Lg[]) this.f;
        return (c0206LgArr == null || (c0206Lg = c0206LgArr[enumC3596wOC.ordinal()]) == null) ? new C0206Lg(h7, c0284Pq, enumC3596wOC, c0206LgArr) : c0206Lg;
    }

    public void b(boolean z) {
        if (this.a) {
            m(String.valueOf(z));
        } else {
            ((C3249q1) ((H7) this.c).b).j(String.valueOf(z));
        }
    }

    public void c(double d) {
        boolean z = this.a;
        H7 h7 = (H7) this.c;
        if (z) {
            m(String.valueOf(d));
        } else {
            ((C3249q1) h7.b).j(String.valueOf(d));
        }
        if (((C0318Rq) this.g).k) {
            return;
        }
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw AbstractC2883jK.a(Double.valueOf(d), ((C3249q1) h7.b).toString());
        }
    }

    public void d(InterfaceC3207pE interfaceC3207pE, int i) {
        AbstractC0500aq.m(interfaceC3207pE, "descriptor");
        int iOrdinal = ((EnumC3596wO) this.e).ordinal();
        boolean z = true;
        H7 h7 = (H7) this.c;
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    if (i == 0) {
                        this.a = true;
                    }
                    if (i == 1) {
                        h7.g(',');
                        h7.l();
                        this.a = false;
                        return;
                    }
                    return;
                }
                if (!h7.a) {
                    h7.g(',');
                }
                h7.e();
                C0284Pq c0284Pq = (C0284Pq) this.d;
                AbstractC0500aq.m(c0284Pq, "json");
                MO.y(c0284Pq, interfaceC3207pE);
                m(interfaceC3207pE.g(i));
                h7.g(':');
                h7.l();
                return;
            }
            if (!h7.a) {
                if (i % 2 == 0) {
                    h7.g(',');
                    h7.e();
                } else {
                    h7.g(':');
                    h7.l();
                    z = false;
                }
                this.a = z;
                return;
            }
            this.a = true;
        } else if (!h7.a) {
            h7.g(',');
        }
        h7.e();
    }

    public void e(int i) {
        if (this.a) {
            m(String.valueOf(i));
        } else {
            ((H7) this.c).h(i);
        }
    }

    public void f(long j) {
        if (this.a) {
            m(String.valueOf(j));
        } else {
            ((H7) this.c).i(j);
        }
    }

    public void g(InterfaceC3207pE interfaceC3207pE, int i, long j) {
        AbstractC0500aq.m(interfaceC3207pE, "descriptor");
        d(interfaceC3207pE, i);
        f(j);
    }

    public void h() {
        ((H7) this.c).j("null");
    }

    public void i(InterfaceC3207pE interfaceC3207pE, int i, InterfaceC2963kr interfaceC2963kr, Object obj) {
        AbstractC0500aq.m(interfaceC3207pE, "descriptor");
        AbstractC0500aq.m(interfaceC2963kr, "serializer");
        if (obj != null || ((C0318Rq) this.g).f) {
            j(interfaceC3207pE, i, interfaceC2963kr, obj);
        }
    }

    public void j(InterfaceC3207pE interfaceC3207pE, int i, InterfaceC2963kr interfaceC2963kr, Object obj) {
        AbstractC0500aq.m(interfaceC3207pE, "descriptor");
        AbstractC0500aq.m(interfaceC2963kr, "serializer");
        d(interfaceC3207pE, i);
        if (!interfaceC2963kr.d().c() && obj == null) {
            h();
        } else {
            l(interfaceC2963kr, obj);
        }
    }

    public void k(InterfaceC3207pE interfaceC3207pE, int i, InterfaceC2963kr interfaceC2963kr, Object obj) {
        AbstractC0500aq.m(interfaceC3207pE, "descriptor");
        AbstractC0500aq.m(interfaceC2963kr, "serializer");
        d(interfaceC3207pE, i);
        l(interfaceC2963kr, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(defpackage.InterfaceC2963kr r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.String r0 = "serializer"
            defpackage.AbstractC0500aq.m(r5, r0)
            java.lang.Object r0 = r4.d
            Pq r0 = (defpackage.C0284Pq) r0
            Rq r1 = r0.a
            boolean r2 = r1.i
            if (r2 == 0) goto L13
        Lf:
            r5.b(r4, r6)
            goto L7d
        L13:
            Q9 r1 = r1.p
            int r1 = r1.ordinal()
            if (r1 == 0) goto L6d
            r2 = 1
            if (r1 == r2) goto L28
            r0 = 2
            if (r1 != r0) goto L22
            goto L6d
        L22:
            Na r5 = new Na
            r5.<init>()
            throw r5
        L28:
            pE r1 = r5.d()
            MO r1 = r1.e()
            DH r2 = defpackage.DH.w
            boolean r2 = defpackage.AbstractC0500aq.b(r1, r2)
            if (r2 != 0) goto L40
            DH r2 = defpackage.DH.z
            boolean r1 = defpackage.AbstractC0500aq.b(r1, r2)
            if (r1 == 0) goto L6d
        L40:
            pE r1 = r5.d()
            java.lang.String r2 = "<this>"
            defpackage.AbstractC0500aq.m(r1, r2)
            java.util.List r1 = r1.getAnnotations()
            java.util.Iterator r1 = r1.iterator()
        L51:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L68
            java.lang.Object r2 = r1.next()
            java.lang.annotation.Annotation r2 = (java.lang.annotation.Annotation) r2
            boolean r3 = r2 instanceof defpackage.InterfaceC0301Qq
            if (r3 == 0) goto L51
            Qq r2 = (defpackage.InterfaceC0301Qq) r2
            java.lang.String r0 = r2.discriminator()
            goto L6e
        L68:
            Rq r0 = r0.a
            java.lang.String r0 = r0.j
            goto L6e
        L6d:
            r0 = 0
        L6e:
            if (r0 == 0) goto Lf
            pE r1 = r5.d()
            java.lang.String r1 = r1.a()
            r4.b = r0
            r4.h = r1
            goto Lf
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0206Lg.l(kr, java.lang.Object):void");
    }

    public void m(String str) {
        AbstractC0500aq.m(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        ((H7) this.c).k(str);
    }

    public void n(InterfaceC3207pE interfaceC3207pE, int i, String str) {
        AbstractC0500aq.m(interfaceC3207pE, "descriptor");
        AbstractC0500aq.m(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        d(interfaceC3207pE, i);
        m(str);
    }

    public void o(InterfaceC3207pE interfaceC3207pE) {
        AbstractC0500aq.m(interfaceC3207pE, "descriptor");
        EnumC3596wO enumC3596wO = (EnumC3596wO) this.e;
        char c = enumC3596wO.b;
        H7 h7 = (H7) this.c;
        h7.m();
        h7.f();
        h7.g(enumC3596wO.b);
    }

    public FileInputStream p(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                ((Uz) this.d).i();
            }
            return null;
        }
    }

    public void q(final int i, final Serializable serializable) {
        ((Executor) this.c).execute(new Runnable() { // from class: Kg
            @Override // java.lang.Runnable
            public final void run() {
                ((Uz) this.a.d).j(i, serializable);
            }
        });
    }

    public boolean r(InterfaceC3207pE interfaceC3207pE) {
        return ((C0318Rq) this.g).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0206Lg(AssetManager assetManager, Executor executor, Uz uz, String str, File file) {
        this.a = false;
        this.c = executor;
        this.d = uz;
        this.b = str;
        this.g = file;
        int i = Build.VERSION.SDK_INT;
        Serializable serializable = null;
        serializable = null;
        if (i >= 24) {
            if (i < 31) {
                switch (i) {
                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    case 25:
                        serializable = AbstractC0136He.j;
                        break;
                    case 26:
                        serializable = AbstractC0136He.i;
                        break;
                    case 27:
                        serializable = AbstractC0136He.h;
                        break;
                    case 28:
                    case 29:
                    case 30:
                        serializable = AbstractC0136He.g;
                        break;
                }
            } else {
                serializable = AbstractC0136He.f;
            }
        }
        this.e = serializable;
    }
}
