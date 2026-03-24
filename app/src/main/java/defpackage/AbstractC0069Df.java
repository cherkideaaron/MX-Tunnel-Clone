package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.achartengine.renderer.DefaultRenderer;

/* renamed from: Df, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0069Df implements InterfaceC0157Ii {
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final C3417t7 e = new C3417t7();
    public static final C3397so f = new C3397so(15);
    public static final C3337ri g = new C3337ri("NO_OWNER", 3);
    public static final C0335Sq h = new C0335Sq(2);
    public static final C0108Fk i = new C0108Fk(28);
    public static PF j;

    public AbstractC0069Df() {
        new ConcurrentHashMap();
    }

    public static void A(int i2, C0286Qb c0286Qb, C2566dc c2566dc, boolean z) {
        C0167Jb c0167Jb;
        C0167Jb c0167Jb2;
        C0167Jb c0167Jb3;
        C0167Jb c0167Jb4;
        C0167Jb c0167Jb5;
        if (c2566dc.l) {
            return;
        }
        if (!(c2566dc instanceof C2620ec) && c2566dc.w() && c(c2566dc)) {
            C2620ec.Q(c2566dc, c0286Qb, new C3417t7());
        }
        C0167Jb c0167JbI = c2566dc.i(2);
        C0167Jb c0167JbI2 = c2566dc.i(4);
        int iD = c0167JbI.d();
        int iD2 = c0167JbI2.d();
        HashSet hashSet = c0167JbI.a;
        char c2 = 0;
        if (hashSet != null && c0167JbI.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0167Jb c0167Jb6 = (C0167Jb) it.next();
                C2566dc c2566dc2 = c0167Jb6.d;
                int i3 = i2 + 1;
                boolean zC = c(c2566dc2);
                if (c2566dc2.w() && zC) {
                    C2620ec.Q(c2566dc2, c0286Qb, new C3417t7());
                }
                int i4 = c2566dc2.o0[c2];
                C0167Jb c0167Jb7 = c2566dc2.H;
                C0167Jb c0167Jb8 = c2566dc2.J;
                if (i4 != 3 || zC) {
                    if (!c2566dc2.w()) {
                        if (c0167Jb6 == c0167Jb7 && c0167Jb8.f == null) {
                            int iE = c0167Jb7.e() + iD;
                            c2566dc2.E(iE, c2566dc2.n() + iE);
                        } else if (c0167Jb6 == c0167Jb8 && c0167Jb7.f == null) {
                            int iE2 = iD - c0167Jb8.e();
                            c2566dc2.E(iE2 - c2566dc2.n(), iE2);
                        } else if (c0167Jb6 == c0167Jb7 && (c0167Jb3 = c0167Jb8.f) != null && c0167Jb3.c && !c2566dc2.u()) {
                            Z(i3, c0286Qb, c2566dc2, z);
                        }
                        A(i3, c0286Qb, c2566dc2, z);
                    }
                } else if (i4 == 3 && c2566dc2.u >= 0 && c2566dc2.t >= 0 && ((c2566dc2.f0 == 8 || (c2566dc2.q == 0 && c2566dc2.V == 0.0f)) && !c2566dc2.u() && !c2566dc2.E && (((c0167Jb6 == c0167Jb7 && (c0167Jb5 = c0167Jb8.f) != null && c0167Jb5.c) || (c0167Jb6 == c0167Jb8 && (c0167Jb4 = c0167Jb7.f) != null && c0167Jb4.c)) && !c2566dc2.u()))) {
                    a0(i3, c2566dc, c0286Qb, c2566dc2, z);
                }
                c2 = 0;
            }
        }
        if (c2566dc instanceof C2905jo) {
            return;
        }
        HashSet hashSet2 = c0167JbI2.a;
        if (hashSet2 != null && c0167JbI2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0167Jb c0167Jb9 = (C0167Jb) it2.next();
                C2566dc c2566dc3 = c0167Jb9.d;
                int i5 = i2 + 1;
                boolean zC2 = c(c2566dc3);
                if (c2566dc3.w() && zC2) {
                    C2620ec.Q(c2566dc3, c0286Qb, new C3417t7());
                }
                C0167Jb c0167Jb10 = c2566dc3.H;
                C0167Jb c0167Jb11 = c2566dc3.J;
                boolean z2 = (c0167Jb9 == c0167Jb10 && (c0167Jb2 = c0167Jb11.f) != null && c0167Jb2.c) || (c0167Jb9 == c0167Jb11 && (c0167Jb = c0167Jb10.f) != null && c0167Jb.c);
                int i6 = c2566dc3.o0[0];
                if (i6 != 3 || zC2) {
                    if (!c2566dc3.w()) {
                        if (c0167Jb9 == c0167Jb10 && c0167Jb11.f == null) {
                            int iE3 = c0167Jb10.e() + iD2;
                            c2566dc3.E(iE3, c2566dc3.n() + iE3);
                        } else if (c0167Jb9 == c0167Jb11 && c0167Jb10.f == null) {
                            int iE4 = iD2 - c0167Jb11.e();
                            c2566dc3.E(iE4 - c2566dc3.n(), iE4);
                        } else if (z2 && !c2566dc3.u()) {
                            Z(i5, c0286Qb, c2566dc3, z);
                        }
                        A(i5, c0286Qb, c2566dc3, z);
                    }
                } else if (i6 == 3 && c2566dc3.u >= 0 && c2566dc3.t >= 0) {
                    if (c2566dc3.f0 != 8) {
                        if (c2566dc3.q == 0) {
                            if (c2566dc3.V == 0.0f) {
                            }
                        }
                    }
                    if (!c2566dc3.u() && !c2566dc3.E && z2 && !c2566dc3.u()) {
                        a0(i5, c2566dc, c0286Qb, c2566dc3, z);
                    }
                }
            }
        }
        c2566dc.l = true;
    }

    public static int B(float f2) {
        if (f2 < 1.0f) {
            return DefaultRenderer.BACKGROUND_COLOR;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return AbstractC0013Aa.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static InterfaceC3493uc C(InterfaceC3493uc interfaceC3493uc) {
        InterfaceC3493uc interfaceC3493ucIntercepted;
        AbstractC0500aq.m(interfaceC3493uc, "<this>");
        AbstractC3547vc abstractC3547vc = interfaceC3493uc instanceof AbstractC3547vc ? (AbstractC3547vc) interfaceC3493uc : null;
        return (abstractC3547vc == null || (interfaceC3493ucIntercepted = abstractC3547vc.intercepted()) == null) ? interfaceC3493uc : interfaceC3493ucIntercepted;
    }

    public static final boolean D(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public static boolean E(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static InterfaceC3508ur F(InterfaceC0606cn interfaceC0606cn) {
        EnumC3670xr[] enumC3670xrArr = EnumC3670xr.a;
        C0360Uh c0360Uh = C0360Uh.n;
        C3585wD c3585wD = new C3585wD();
        c3585wD.a = interfaceC0606cn;
        c3585wD.b = c0360Uh;
        return c3585wD;
    }

    public static C0583cI G(InterfaceC0606cn interfaceC0606cn) {
        AbstractC0500aq.m(interfaceC0606cn, "initializer");
        return new C0583cI(interfaceC0606cn);
    }

    public static float H(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static final void I() {
        try {
            if (j == null) {
                PF pf = (PF) ((C3711ye) ((InterfaceC0448Zk) C3663xk.d().b(InterfaceC0448Zk.class))).o.get();
                AbstractC0500aq.m(pf, "<set-?>");
                j = pf;
            }
            PF pf2 = j;
            if (pf2 == null) {
                AbstractC0500aq.d0("sharedSessionRepository");
                throw null;
            }
            if (pf2.i) {
                if (pf2 != null) {
                    pf2.b();
                } else {
                    AbstractC0500aq.d0("sharedSessionRepository");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void J(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static TypedValue S(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean T(Context context, int i2, boolean z) {
        TypedValue typedValueS = S(context, i2);
        return (typedValueS == null || typedValueS.type != 18) ? z : typedValueS.data != 0;
    }

    public static int U(Context context, int i2, int i3) {
        TypedValue typedValueS = S(context, i2);
        return (typedValueS == null || typedValueS.type != 16) ? i3 : typedValueS.data;
    }

    public static TimeInterpolator V(Context context, int i2, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!E(strValueOf, "cubic-bezier") && !E(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!E(strValueOf, "cubic-bezier")) {
            if (E(strValueOf, "path")) {
                return new PathInterpolator(AbstractC0500aq.w(strValueOf.substring(5, strValueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
        if (strArrSplit.length == 4) {
            return new PathInterpolator(v(strArrSplit, 0), v(strArrSplit, 1), v(strArrSplit, 2), v(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    public static TypedValue W(Context context, int i2, String str) {
        TypedValue typedValueS = S(context, i2);
        if (typedValueS != null) {
            return typedValueS;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    public static final void X(AbstractC0546bh abstractC0546bh, InterfaceC3493uc interfaceC3493uc, boolean z) {
        Object objK = abstractC0546bh.k();
        Throwable thG = abstractC0546bh.g(objK);
        Object objN = thG != null ? AbstractC0115Ga.n(thG) : abstractC0546bh.h(objK);
        if (!z) {
            interfaceC3493uc.resumeWith(objN);
            return;
        }
        AbstractC0500aq.k(interfaceC3493uc, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C0444Zg c0444Zg = (C0444Zg) interfaceC3493uc;
        InterfaceC3493uc interfaceC3493uc2 = c0444Zg.e;
        InterfaceC0168Jc context = interfaceC3493uc2.getContext();
        Object objP = AbstractC0136He.P(context, c0444Zg.m);
        AK akQ = objP != AbstractC0136He.m ? MO.Q(interfaceC3493uc2, context, objP) : null;
        try {
            interfaceC3493uc2.resumeWith(objN);
        } finally {
            if (akQ == null || akQ.V()) {
                AbstractC0136He.H(context, objP);
            }
        }
    }

    public static int Y(int i2) {
        return (int) (Integer.rotateLeft((int) (i2 * (-862048943)), 15) * 461845907);
    }

    public static void Z(int i2, C0286Qb c0286Qb, C2566dc c2566dc, boolean z) {
        float f2 = c2566dc.c0;
        C0167Jb c0167Jb = c2566dc.H;
        int iD = c0167Jb.f.d();
        C0167Jb c0167Jb2 = c2566dc.J;
        int iD2 = c0167Jb2.f.d();
        int iE = c0167Jb.e() + iD;
        int iE2 = iD2 - c0167Jb2.e();
        if (iD == iD2) {
            f2 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iN = c2566dc.n();
        int i3 = (iD2 - iD) - iN;
        if (iD > iD2) {
            i3 = (iD - iD2) - iN;
        }
        int i4 = ((int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3)) + iD;
        int i5 = i4 + iN;
        if (iD > iD2) {
            i5 = i4 - iN;
        }
        c2566dc.E(i4, i5);
        A(i2 + 1, c0286Qb, c2566dc, z);
    }

    public static Vv a() {
        return new Vv(false);
    }

    public static void a0(int i2, C2566dc c2566dc, C0286Qb c0286Qb, C2566dc c2566dc2, boolean z) {
        float f2 = c2566dc2.c0;
        C0167Jb c0167Jb = c2566dc2.H;
        int iE = c0167Jb.e() + c0167Jb.f.d();
        C0167Jb c0167Jb2 = c2566dc2.J;
        int iD = c0167Jb2.f.d() - c0167Jb2.e();
        if (iD >= iE) {
            int iN = c2566dc2.n();
            if (c2566dc2.f0 != 8) {
                int i3 = c2566dc2.q;
                if (i3 == 2) {
                    if (!(c2566dc instanceof C2620ec)) {
                        c2566dc = c2566dc.S;
                    }
                    iN = (int) (c2566dc2.c0 * 0.5f * c2566dc.n());
                } else if (i3 == 0) {
                    iN = iD - iE;
                }
                iN = Math.max(c2566dc2.t, iN);
                int i4 = c2566dc2.u;
                if (i4 > 0) {
                    iN = Math.min(i4, iN);
                }
            }
            int i5 = iE + ((int) ((f2 * ((iD - iE) - iN)) + 0.5f));
            c2566dc2.E(i5, iN + i5);
            A(i2 + 1, c0286Qb, c2566dc2, z);
        }
    }

    public static final C3210pH b(C0284Pq c0284Pq, String str) {
        AbstractC0500aq.m(c0284Pq, "json");
        AbstractC0500aq.m(str, "source");
        return !c0284Pq.a.o ? new C3210pH(str) : new C3265qH(str);
    }

    public static void b0(int i2, C0286Qb c0286Qb, C2566dc c2566dc) {
        float f2 = c2566dc.d0;
        C0167Jb c0167Jb = c2566dc.I;
        int iD = c0167Jb.f.d();
        C0167Jb c0167Jb2 = c2566dc.K;
        int iD2 = c0167Jb2.f.d();
        int iE = c0167Jb.e() + iD;
        int iE2 = iD2 - c0167Jb2.e();
        if (iD == iD2) {
            f2 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iK = c2566dc.k();
        int i3 = (iD2 - iD) - iK;
        if (iD > iD2) {
            i3 = (iD - iD2) - iK;
        }
        int i4 = (int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3);
        int i5 = iD + i4;
        int i6 = i5 + iK;
        if (iD > iD2) {
            i5 = iD - i4;
            i6 = i5 - iK;
        }
        c2566dc.F(i5, i6);
        h0(i2 + 1, c0286Qb, c2566dc);
    }

    public static boolean c(C2566dc c2566dc) {
        int[] iArr = c2566dc.o0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        C2566dc c2566dc2 = c2566dc.S;
        C2620ec c2620ec = c2566dc2 != null ? (C2620ec) c2566dc2 : null;
        if (c2620ec != null) {
            int i4 = c2620ec.o0[0];
        }
        if (c2620ec != null) {
            int i5 = c2620ec.o0[1];
        }
        boolean z = i2 == 1 || c2566dc.x() || i2 == 2 || (i2 == 3 && c2566dc.q == 0 && c2566dc.V == 0.0f && c2566dc.q(0)) || (i2 == 3 && c2566dc.q == 1 && c2566dc.r(0, c2566dc.n()));
        boolean z2 = i3 == 1 || c2566dc.y() || i3 == 2 || (i3 == 3 && c2566dc.r == 0 && c2566dc.V == 0.0f && c2566dc.q(1)) || (i2 == 3 && c2566dc.r == 1 && c2566dc.r(1, c2566dc.k()));
        if (c2566dc.V <= 0.0f || !(z || z2)) {
            return z && z2;
        }
        return true;
    }

    public static void c0(int i2, C2566dc c2566dc, C0286Qb c0286Qb, C2566dc c2566dc2) {
        float f2 = c2566dc2.d0;
        C0167Jb c0167Jb = c2566dc2.I;
        int iE = c0167Jb.e() + c0167Jb.f.d();
        C0167Jb c0167Jb2 = c2566dc2.K;
        int iD = c0167Jb2.f.d() - c0167Jb2.e();
        if (iD >= iE) {
            int iK = c2566dc2.k();
            if (c2566dc2.f0 != 8) {
                int i3 = c2566dc2.r;
                if (i3 == 2) {
                    if (!(c2566dc instanceof C2620ec)) {
                        c2566dc = c2566dc.S;
                    }
                    iK = (int) (f2 * 0.5f * c2566dc.k());
                } else if (i3 == 0) {
                    iK = iD - iE;
                }
                iK = Math.max(c2566dc2.w, iK);
                int i4 = c2566dc2.x;
                if (i4 > 0) {
                    iK = Math.min(i4, iK);
                }
            }
            int i5 = iE + ((int) ((f2 * ((iD - iE) - iK)) + 0.5f));
            c2566dc2.F(i5, iK + i5);
            h0(i2 + 1, c0286Qb, c2566dc2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.io.Serializable d(defpackage.InterfaceC3067ml r4, defpackage.InterfaceC3177ol r5, defpackage.InterfaceC3493uc r6) {
        /*
            boolean r0 = r6 instanceof defpackage.C3610wl
            if (r0 == 0) goto L13
            r0 = r6
            wl r0 = (defpackage.C3610wl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wl r0 = new wl
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            OB r4 = r0.a
            defpackage.AbstractC0115Ga.U(r6)     // Catch: java.lang.Throwable -> L29
            goto L4c
        L29:
            r5 = move-exception
            r1 = r5
            goto L51
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            defpackage.AbstractC0115Ga.U(r6)
            OB r6 = new OB
            r6.<init>()
            yl r2 = new yl     // Catch: java.lang.Throwable -> L4e
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4e
            r0.a = r6     // Catch: java.lang.Throwable -> L4e
            r0.c = r3     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r4 = r4.b(r2, r0)     // Catch: java.lang.Throwable -> L4e
            if (r4 != r1) goto L4c
            goto L82
        L4c:
            r1 = 0
            goto L82
        L4e:
            r4 = move-exception
            r1 = r4
            r4 = r6
        L51:
            java.lang.Object r4 = r4.a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L5d
            boolean r5 = defpackage.AbstractC0500aq.b(r4, r1)
            if (r5 != 0) goto L7f
        L5d:
            Jc r5 = r0.getContext()
            Fk r6 = defpackage.C0108Fk.e
            Hc r5 = r5.get(r6)
            Aq r5 = (defpackage.InterfaceC0029Aq) r5
            if (r5 == 0) goto L80
            boolean r6 = r5.isCancelled()
            if (r6 != 0) goto L72
            goto L80
        L72:
            java.util.concurrent.CancellationException r5 = r5.getCancellationException()
            if (r5 == 0) goto L80
            boolean r5 = defpackage.AbstractC0500aq.b(r5, r1)
            if (r5 != 0) goto L7f
            goto L80
        L7f:
            throw r1
        L80:
            if (r4 != 0) goto L83
        L82:
            return r1
        L83:
            boolean r5 = r1 instanceof java.util.concurrent.CancellationException
            if (r5 == 0) goto L8b
            defpackage.MO.a(r4, r1)
            throw r4
        L8b:
            defpackage.MO.a(r1, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0069Df.d(ml, ol, uc):java.io.Serializable");
    }

    public static final C3081mz d0(String str) {
        AbstractC0500aq.m(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return new C3081mz(str);
    }

    public static void e(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 > i3) {
                throw new IllegalArgumentException(AbstractC3264qG.e(i2, i3, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
    }

    public static final String e0(InterfaceC3493uc interfaceC3493uc) {
        Object objN;
        if (interfaceC3493uc instanceof C0444Zg) {
            return ((C0444Zg) interfaceC3493uc).toString();
        }
        try {
            objN = interfaceC3493uc + '@' + u(interfaceC3493uc);
        } catch (Throwable th) {
            objN = AbstractC0115Ga.n(th);
        }
        if (IC.a(objN) != null) {
            objN = interfaceC3493uc.getClass().getName() + '@' + u(interfaceC3493uc);
        }
        return (String) objN;
    }

    public static C0283Pp g0(int i2, int i3) {
        if (i3 > Integer.MIN_VALUE) {
            return new C0283Pp(i2, i3 - 1, 1);
        }
        C0283Pp c0283Pp = C0283Pp.d;
        return C0283Pp.d;
    }

    public static long h(long j2) {
        if (j2 < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j2 > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j2;
    }

    public static void h0(int i2, C0286Qb c0286Qb, C2566dc c2566dc) {
        C0167Jb c0167Jb;
        C0167Jb c0167Jb2;
        C0167Jb c0167Jb3;
        C0167Jb c0167Jb4;
        C0167Jb c0167Jb5;
        C0167Jb c0167Jb6;
        if (c2566dc.m) {
            return;
        }
        if (!(c2566dc instanceof C2620ec) && c2566dc.w() && c(c2566dc)) {
            C2620ec.Q(c2566dc, c0286Qb, new C3417t7());
        }
        C0167Jb c0167JbI = c2566dc.i(3);
        C0167Jb c0167JbI2 = c2566dc.i(5);
        int iD = c0167JbI.d();
        int iD2 = c0167JbI2.d();
        HashSet hashSet = c0167JbI.a;
        char c2 = 1;
        if (hashSet != null && c0167JbI.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0167Jb c0167Jb7 = (C0167Jb) it.next();
                C2566dc c2566dc2 = c0167Jb7.d;
                int i3 = i2 + 1;
                boolean zC = c(c2566dc2);
                if (c2566dc2.w() && zC) {
                    C2620ec.Q(c2566dc2, c0286Qb, new C3417t7());
                }
                int i4 = c2566dc2.o0[c2];
                C0167Jb c0167Jb8 = c2566dc2.I;
                C0167Jb c0167Jb9 = c2566dc2.K;
                if (i4 != 3 || zC) {
                    if (!c2566dc2.w()) {
                        if (c0167Jb7 == c0167Jb8 && c0167Jb9.f == null) {
                            int iE = c0167Jb8.e() + iD;
                            c2566dc2.F(iE, c2566dc2.k() + iE);
                        } else if (c0167Jb7 == c0167Jb9 && c0167Jb9.f == null) {
                            int iE2 = iD - c0167Jb9.e();
                            c2566dc2.F(iE2 - c2566dc2.k(), iE2);
                        } else if (c0167Jb7 == c0167Jb8 && (c0167Jb4 = c0167Jb9.f) != null && c0167Jb4.c) {
                            b0(i3, c0286Qb, c2566dc2);
                        }
                        h0(i3, c0286Qb, c2566dc2);
                    }
                } else if (i4 == 3 && c2566dc2.x >= 0 && c2566dc2.w >= 0 && ((c2566dc2.f0 == 8 || (c2566dc2.r == 0 && c2566dc2.V == 0.0f)) && !c2566dc2.v() && !c2566dc2.E && (((c0167Jb7 == c0167Jb8 && (c0167Jb6 = c0167Jb9.f) != null && c0167Jb6.c) || (c0167Jb7 == c0167Jb9 && (c0167Jb5 = c0167Jb8.f) != null && c0167Jb5.c)) && !c2566dc2.v()))) {
                    c0(i3, c2566dc, c0286Qb, c2566dc2);
                }
                c2 = 1;
            }
        }
        if (c2566dc instanceof C2905jo) {
            return;
        }
        HashSet hashSet2 = c0167JbI2.a;
        if (hashSet2 != null && c0167JbI2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0167Jb c0167Jb10 = (C0167Jb) it2.next();
                C2566dc c2566dc3 = c0167Jb10.d;
                int i5 = i2 + 1;
                boolean zC2 = c(c2566dc3);
                if (c2566dc3.w() && zC2) {
                    C2620ec.Q(c2566dc3, c0286Qb, new C3417t7());
                }
                C0167Jb c0167Jb11 = c2566dc3.I;
                C0167Jb c0167Jb12 = c2566dc3.K;
                boolean z = (c0167Jb10 == c0167Jb11 && (c0167Jb3 = c0167Jb12.f) != null && c0167Jb3.c) || (c0167Jb10 == c0167Jb12 && (c0167Jb2 = c0167Jb11.f) != null && c0167Jb2.c);
                int i6 = c2566dc3.o0[1];
                if (i6 != 3 || zC2) {
                    if (!c2566dc3.w()) {
                        if (c0167Jb10 == c0167Jb11 && c0167Jb12.f == null) {
                            int iE3 = c0167Jb11.e() + iD2;
                            c2566dc3.F(iE3, c2566dc3.k() + iE3);
                        } else if (c0167Jb10 == c0167Jb12 && c0167Jb11.f == null) {
                            int iE4 = iD2 - c0167Jb12.e();
                            c2566dc3.F(iE4 - c2566dc3.k(), iE4);
                        } else if (z && !c2566dc3.v()) {
                            b0(i5, c0286Qb, c2566dc3);
                        }
                        h0(i5, c0286Qb, c2566dc3);
                    }
                } else if (i6 == 3 && c2566dc3.x >= 0 && c2566dc3.w >= 0 && (c2566dc3.f0 == 8 || (c2566dc3.r == 0 && c2566dc3.V == 0.0f))) {
                    if (!c2566dc3.v() && !c2566dc3.E && z && !c2566dc3.v()) {
                        c0(i5, c2566dc, c0286Qb, c2566dc3);
                    }
                }
            }
        }
        C0167Jb c0167JbI3 = c2566dc.i(6);
        if (c0167JbI3.a != null && c0167JbI3.c) {
            int iD3 = c0167JbI3.d();
            Iterator it3 = c0167JbI3.a.iterator();
            while (it3.hasNext()) {
                C0167Jb c0167Jb13 = (C0167Jb) it3.next();
                C2566dc c2566dc4 = c0167Jb13.d;
                int i7 = i2 + 1;
                boolean zC3 = c(c2566dc4);
                if (c2566dc4.w() && zC3) {
                    C2620ec.Q(c2566dc4, c0286Qb, new C3417t7());
                }
                if (c2566dc4.o0[1] != 3 || zC3) {
                    if (!c2566dc4.w() && c0167Jb13 == (c0167Jb = c2566dc4.L)) {
                        int iE5 = c0167Jb13.e() + iD3;
                        if (c2566dc4.D) {
                            int i8 = iE5 - c2566dc4.Z;
                            int i9 = c2566dc4.U + i8;
                            c2566dc4.Y = i8;
                            c2566dc4.I.l(i8);
                            c2566dc4.K.l(i9);
                            c0167Jb.l(iE5);
                            c2566dc4.k = true;
                        }
                        h0(i7, c0286Qb, c2566dc4);
                    }
                }
            }
        }
        c2566dc.m = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC3493uc i(InterfaceC3493uc interfaceC3493uc, InterfaceC3396sn interfaceC3396sn, Object obj) {
        AbstractC0500aq.m(interfaceC3396sn, "<this>");
        AbstractC0500aq.m(interfaceC3493uc, "completion");
        if (interfaceC3396sn instanceof AbstractC2543d7) {
            return ((AbstractC2543d7) interfaceC3396sn).create(obj, interfaceC3493uc);
        }
        InterfaceC0168Jc context = interfaceC3493uc.getContext();
        return context == C0021Ai.a ? new C0555bq(interfaceC3493uc, interfaceC3396sn, obj) : new C2525cq(interfaceC3493uc, context, interfaceC3396sn, obj);
    }

    public static final Object i0(InterfaceC0168Jc interfaceC0168Jc, Object obj, Object obj2, InterfaceC3396sn interfaceC3396sn, InterfaceC3493uc interfaceC3493uc) {
        Object objInvoke;
        Object objP = AbstractC0136He.P(interfaceC0168Jc, obj2);
        try {
            HG hg = new HG(interfaceC3493uc, interfaceC0168Jc);
            if (interfaceC3396sn instanceof AbstractC2543d7) {
                AbstractC2883jK.j(2, interfaceC3396sn);
                objInvoke = interfaceC3396sn.invoke(obj, hg);
            } else {
                objInvoke = j0(hg, interfaceC3396sn, obj);
            }
            AbstractC0136He.H(interfaceC0168Jc, objP);
            if (objInvoke == EnumC0321Sc.a) {
                AbstractC0500aq.m(interfaceC3493uc, "frame");
            }
            return objInvoke;
        } catch (Throwable th) {
            AbstractC0136He.H(interfaceC0168Jc, objP);
            throw th;
        }
    }

    public static Object j0(InterfaceC3493uc interfaceC3493uc, InterfaceC3396sn interfaceC3396sn, Object obj) {
        AbstractC0500aq.m(interfaceC3396sn, "<this>");
        InterfaceC0168Jc context = interfaceC3493uc.getContext();
        Object c2579dq = context == C0021Ai.a ? new C2579dq(interfaceC3493uc) : new C2634eq(interfaceC3493uc, context);
        AbstractC2883jK.j(2, interfaceC3396sn);
        return interfaceC3396sn.invoke(obj, c2579dq);
    }

    public static float k0() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public static Object o(Object[] objArr, int i2, C0108Fk c0108Fk) {
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z = (i2 & 2) != 0;
        Object obj = null;
        int i4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (Object obj2 : objArr) {
            int iAbs = (Math.abs(c0108Fk.k(obj2) - i3) * 2) + (c0108Fk.l(obj2) == z ? 0 : 1);
            if (obj == null || i4 > iAbs) {
                obj = obj2;
                i4 = iAbs;
            }
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object q(defpackage.InterfaceC3067ml r6, defpackage.InterfaceC3493uc r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C0092El
            if (r0 == 0) goto L13
            r0 = r7
            El r0 = (defpackage.C0092El) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            El r0 = new El
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.c
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.d
            ri r3 = defpackage.AbstractC0500aq.e
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            Dl r6 = r0.b
            OB r0 = r0.a
            defpackage.AbstractC0115Ga.U(r7)     // Catch: defpackage.C0455a -> L2d
            goto L5e
        L2d:
            r7 = move-exception
            goto L5a
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            defpackage.AbstractC0115Ga.U(r7)
            OB r7 = new OB
            r7.<init>()
            r7.a = r3
            Dl r2 = new Dl
            r5 = 0
            r2.<init>(r7, r5)
            r0.a = r7     // Catch: defpackage.C0455a -> L56
            r0.b = r2     // Catch: defpackage.C0455a -> L56
            r0.d = r4     // Catch: defpackage.C0455a -> L56
            java.lang.Object r6 = r6.b(r2, r0)     // Catch: defpackage.C0455a -> L56
            if (r6 != r1) goto L54
            goto L62
        L54:
            r0 = r7
            goto L5e
        L56:
            r6 = move-exception
            r0 = r7
            r7 = r6
            r6 = r2
        L5a:
            java.lang.Object r1 = r7.a
            if (r1 != r6) goto L6b
        L5e:
            java.lang.Object r1 = r0.a
            if (r1 == r3) goto L63
        L62:
            return r1
        L63:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Expected at least one element"
            r6.<init>(r7)
            throw r6
        L6b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0069Df.q(ml, uc):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object r(defpackage.InterfaceC3067ml r5, defpackage.InterfaceC3493uc r6) {
        /*
            boolean r0 = r6 instanceof defpackage.C0109Fl
            if (r0 == 0) goto L13
            r0 = r6
            Fl r0 = (defpackage.C0109Fl) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            Fl r0 = new Fl
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.c
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            Dl r5 = r0.b
            OB r0 = r0.a
            defpackage.AbstractC0115Ga.U(r6)     // Catch: defpackage.C0455a -> L2b
            goto L5a
        L2b:
            r6 = move-exception
            goto L56
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.AbstractC0115Ga.U(r6)
            OB r6 = new OB
            r6.<init>()
            Dl r2 = new Dl
            r4 = 1
            r2.<init>(r6, r4)
            r0.a = r6     // Catch: defpackage.C0455a -> L52
            r0.b = r2     // Catch: defpackage.C0455a -> L52
            r0.d = r3     // Catch: defpackage.C0455a -> L52
            java.lang.Object r5 = r5.b(r2, r0)     // Catch: defpackage.C0455a -> L52
            if (r5 != r1) goto L50
            goto L5c
        L50:
            r0 = r6
            goto L5a
        L52:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L56:
            java.lang.Object r1 = r6.a
            if (r1 != r5) goto L5d
        L5a:
            java.lang.Object r1 = r0.a
        L5c:
            return r1
        L5d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0069Df.r(ml, uc):java.lang.Object");
    }

    public static final InterfaceC2690fr s(InterfaceC3207pE interfaceC3207pE) {
        AbstractC0500aq.m(interfaceC3207pE, "<this>");
        if (interfaceC3207pE instanceof C3262qE) {
            return s(((C3262qE) interfaceC3207pE).a);
        }
        return null;
    }

    public static Set t() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.emptySet();
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public static final String u(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static float v(String[] strArr, int i2) throws NumberFormatException {
        float f2 = Float.parseFloat(strArr[i2]);
        if (f2 >= 0.0f && f2 <= 1.0f) {
            return f2;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f2);
    }

    public static final InterfaceC2963kr w(InterfaceC2963kr interfaceC2963kr) {
        AbstractC0500aq.m(interfaceC2963kr, "<this>");
        return interfaceC2963kr.d().c() ? interfaceC2963kr : new Lw(interfaceC2963kr);
    }

    public static final Bundle x(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        throw new IllegalArgumentException(AbstractC3264qG.x("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public abstract void M(int i2);

    public abstract void N(Typeface typeface, boolean z);

    public abstract void P(int i2);

    public abstract void Q(View view, int i2, int i3);

    public abstract void R(View view, float f2, float f3);

    public abstract int f(View view, int i2);

    public abstract boolean f0(View view, int i2);

    public abstract int g(View view, int i2);

    public abstract Typeface j(Context context, C0330Sl c0330Sl, Resources resources, int i2);

    public abstract Typeface k(Context context, C0381Vl[] c0381VlArr, int i2);

    public Typeface l(int i2, Context context, List list) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface m(Context context, InputStream inputStream) {
        File fileJ = AbstractC0500aq.J(context);
        if (fileJ == null) {
            return null;
        }
        try {
            if (AbstractC0500aq.u(fileJ, inputStream)) {
                return Typeface.createFromFile(fileJ.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileJ.delete();
        }
    }

    public Typeface n(Context context, Resources resources, int i2, String str, int i3) {
        File fileJ = AbstractC0500aq.J(context);
        if (fileJ == null) {
            return null;
        }
        try {
            if (AbstractC0500aq.t(fileJ, resources, i2)) {
                return Typeface.createFromFile(fileJ.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileJ.delete();
        }
    }

    public C0381Vl p(C0381Vl[] c0381VlArr, int i2) {
        return (C0381Vl) o(c0381VlArr, i2, new C0108Fk(29));
    }

    public int y(View view) {
        return 0;
    }

    public int z() {
        return 0;
    }

    public void L() {
    }

    public void K(int i2, int i3) {
    }

    public void O(View view, int i2) {
    }
}
