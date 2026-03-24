package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.Arrays;
import java.util.WeakHashMap;

/* renamed from: g2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2702g2 {
    public int a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;

    public C2702g2(C0284Pq c0284Pq, EnumC3596wO enumC3596wO, C3210pH c3210pH, InterfaceC3207pE interfaceC3207pE, Ew ew) {
        AbstractC0500aq.m(c0284Pq, "json");
        AbstractC0500aq.m(c3210pH, "lexer");
        AbstractC0500aq.m(interfaceC3207pE, "descriptor");
        this.b = c0284Pq;
        this.c = enumC3596wO;
        this.d = c3210pH;
        this.a = -1;
        C0318Rq c0318Rq = c0284Pq.a;
        this.e = c0318Rq;
        this.f = c0318Rq.f ? null : new C0437Yq(interfaceC3207pE);
    }

    public void a() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((C2609eJ) this.d) != null) {
                if (((C2609eJ) this.f) == null) {
                    this.f = new C2609eJ();
                }
                C2609eJ c2609eJ = (C2609eJ) this.f;
                c2609eJ.a = null;
                c2609eJ.d = false;
                c2609eJ.b = null;
                c2609eJ.c = false;
                WeakHashMap weakHashMap = UL.a;
                ColorStateList colorStateListC = ML.c(view);
                if (colorStateListC != null) {
                    c2609eJ.d = true;
                    c2609eJ.a = colorStateListC;
                }
                PorterDuff.Mode modeD = ML.d(view);
                if (modeD != null) {
                    c2609eJ.c = true;
                    c2609eJ.b = modeD;
                }
                if (c2609eJ.d || c2609eJ.c) {
                    I2.e(background, c2609eJ, view.getDrawableState());
                    return;
                }
            }
            C2609eJ c2609eJ2 = (C2609eJ) this.e;
            if (c2609eJ2 != null) {
                I2.e(background, c2609eJ2, view.getDrawableState());
                return;
            }
            C2609eJ c2609eJ3 = (C2609eJ) this.d;
            if (c2609eJ3 != null) {
                I2.e(background, c2609eJ3, view.getDrawableState());
            }
        }
    }

    public C2702g2 b(InterfaceC3207pE interfaceC3207pE) {
        AbstractC0500aq.m(interfaceC3207pE, "descriptor");
        C0284Pq c0284Pq = (C0284Pq) this.b;
        EnumC3596wO enumC3596wOC = AbstractC3650xO.c(c0284Pq, interfaceC3207pE);
        C3210pH c3210pH = (C3210pH) this.d;
        N2 n2 = c3210pH.b;
        n2.getClass();
        int i = n2.b + 1;
        n2.b = i;
        Object[] objArr = (Object[]) n2.c;
        if (i == objArr.length) {
            int i2 = i * 2;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i2);
            AbstractC0500aq.l(objArrCopyOf, "copyOf(...)");
            n2.c = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf((int[]) n2.d, i2);
            AbstractC0500aq.l(iArrCopyOf, "copyOf(...)");
            n2.d = iArrCopyOf;
        }
        ((Object[]) n2.c)[i] = interfaceC3207pE;
        c3210pH.f(enumC3596wOC.a);
        if (c3210pH.p() != 4) {
            int iOrdinal = enumC3596wOC.ordinal();
            return (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) ? new C2702g2((C0284Pq) this.b, enumC3596wOC, (C3210pH) this.d, interfaceC3207pE, null) : (((EnumC3596wO) this.c) == enumC3596wOC && c0284Pq.a.f) ? this : new C2702g2((C0284Pq) this.b, enumC3596wOC, (C3210pH) this.d, interfaceC3207pE, null);
        }
        C3210pH.m(c3210pH, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    public boolean c() {
        boolean z;
        boolean z2;
        C3210pH c3210pH = (C3210pH) this.d;
        int iS = c3210pH.s();
        String str = c3210pH.e;
        if (iS == str.length()) {
            C3210pH.m(c3210pH, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iS) == '\"') {
            iS++;
            z = true;
        } else {
            z = false;
        }
        int iR = c3210pH.r(iS);
        if (iR >= str.length() || iR == -1) {
            C3210pH.m(c3210pH, "EOF", 0, null, 6);
            throw null;
        }
        int i = iR + 1;
        int iCharAt = str.charAt(iR) | ' ';
        if (iCharAt == 102) {
            c3210pH.c(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                C3210pH.m(c3210pH, "Expected valid boolean literal prefix, but had '" + c3210pH.i() + '\'', 0, null, 6);
                throw null;
            }
            c3210pH.c(i, "rue");
            z2 = true;
        }
        if (z) {
            if (c3210pH.a == str.length()) {
                C3210pH.m(c3210pH, "EOF", 0, null, 6);
                throw null;
            }
            if (str.charAt(c3210pH.a) != '\"') {
                C3210pH.m(c3210pH, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            c3210pH.a++;
        }
        return z2;
    }

    public double d() throws NumberFormatException {
        C3210pH c3210pH = (C3210pH) this.d;
        String strI = c3210pH.i();
        try {
            double d = Double.parseDouble(strI);
            if (((C0284Pq) this.b).a.k || !(Double.isInfinite(d) || Double.isNaN(d))) {
                return d;
            }
            AbstractC2883jK.N(c3210pH, Double.valueOf(d));
            throw null;
        } catch (IllegalArgumentException unused) {
            C3210pH.m(c3210pH, "Failed to parse type 'double' for input '" + strI + '\'', 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x012e, code lost:
    
        if (r12 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0130, code lost:
    
        r1 = r12.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0134, code lost:
    
        if (r10 >= 64) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0136, code lost:
    
        r1.c |= 1 << r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x013f, code lost:
    
        r3 = (r10 >>> 6) - 1;
        r1 = r1.d;
        r1[r3] = (1 << (r10 & 63)) | r1[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x014f, code lost:
    
        r12 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:201:0x021a A[EDGE_INSN: B:201:0x021a->B:147:0x021a BREAK  A[LOOP:1: B:106:0x0173->B:203:0x0173], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0173 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int e(defpackage.InterfaceC3207pE r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 736
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2702g2.e(pE):int");
    }

    public int f() {
        C3210pH c3210pH = (C3210pH) this.d;
        long jG = c3210pH.g();
        int i = (int) jG;
        if (jG == i) {
            return i;
        }
        C3210pH.m(c3210pH, "Failed to parse int for input '" + jG + '\'', 0, null, 6);
        throw null;
    }

    public int g(InterfaceC3207pE interfaceC3207pE, int i) {
        AbstractC0500aq.m(interfaceC3207pE, "descriptor");
        return f();
    }

    public long h() {
        return ((C3210pH) this.d).g();
    }

    public long i(InterfaceC3207pE interfaceC3207pE, int i) {
        AbstractC0500aq.m(interfaceC3207pE, "descriptor");
        return h();
    }

    public boolean j() {
        C0437Yq c0437Yq = (C0437Yq) this.f;
        return ((c0437Yq != null ? c0437Yq.b : false) || ((C3210pH) this.d).u(true)) ? false : true;
    }

    public Object k(InterfaceC3207pE interfaceC3207pE, int i, InterfaceC2963kr interfaceC2963kr, Object obj) {
        AbstractC0500aq.m(interfaceC3207pE, "descriptor");
        AbstractC0500aq.m(interfaceC2963kr, "deserializer");
        if (interfaceC2963kr.d().c() || j()) {
            return n(interfaceC2963kr);
        }
        return null;
    }

    public Object l(InterfaceC3207pE interfaceC3207pE, int i, InterfaceC2963kr interfaceC2963kr, Object obj) {
        AbstractC0500aq.m(interfaceC3207pE, "descriptor");
        AbstractC0500aq.m(interfaceC2963kr, "deserializer");
        boolean z = ((EnumC3596wO) this.c) == EnumC3596wO.e && (i & 1) == 0;
        C3210pH c3210pH = (C3210pH) this.d;
        if (z) {
            N2 n2 = c3210pH.b;
            int[] iArr = (int[]) n2.d;
            int i2 = n2.b;
            if (iArr[i2] == -2) {
                ((Object[]) n2.c)[i2] = C3397so.d;
            }
        }
        Object objM = m(interfaceC3207pE, i, interfaceC2963kr, obj);
        if (z) {
            N2 n22 = c3210pH.b;
            int[] iArr2 = (int[]) n22.d;
            int i3 = n22.b;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                n22.b = i4;
                Object[] objArr = (Object[]) n22.c;
                if (i4 == objArr.length) {
                    int i5 = i4 * 2;
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, i5);
                    AbstractC0500aq.l(objArrCopyOf, "copyOf(...)");
                    n22.c = objArrCopyOf;
                    int[] iArrCopyOf = Arrays.copyOf((int[]) n22.d, i5);
                    AbstractC0500aq.l(iArrCopyOf, "copyOf(...)");
                    n22.d = iArrCopyOf;
                }
            }
            Object[] objArr2 = (Object[]) n22.c;
            int i6 = n22.b;
            objArr2[i6] = objM;
            ((int[]) n22.d)[i6] = -2;
        }
        return objM;
    }

    public Object m(InterfaceC3207pE interfaceC3207pE, int i, InterfaceC2963kr interfaceC2963kr, Object obj) {
        AbstractC0500aq.m(interfaceC3207pE, "descriptor");
        AbstractC0500aq.m(interfaceC2963kr, "deserializer");
        return n(interfaceC2963kr);
    }

    public Object n(InterfaceC2963kr interfaceC2963kr) {
        AbstractC0500aq.m(interfaceC2963kr, "deserializer");
        try {
            return interfaceC2963kr.a(this);
        } catch (C3242pv e) {
            String message = e.getMessage();
            AbstractC0500aq.j(message);
            if (AbstractC3481uH.b0(message, "at path")) {
                throw e;
            }
            throw new C3242pv(e.a, e.getMessage() + " at path: " + ((C3210pH) this.d).b.e(), e);
        }
    }

    public String o() {
        boolean z = ((C0318Rq) this.e).c;
        C3210pH c3210pH = (C3210pH) this.d;
        return z ? c3210pH.j() : c3210pH.h();
    }

    public String p(InterfaceC3207pE interfaceC3207pE, int i) {
        AbstractC0500aq.m(interfaceC3207pE, "descriptor");
        return o();
    }

    public void q(InterfaceC3207pE interfaceC3207pE) {
        AbstractC0500aq.m(interfaceC3207pE, "descriptor");
        C0284Pq c0284Pq = (C0284Pq) this.b;
        if (c0284Pq.a.b && interfaceC3207pE.f() == 0) {
            while (e(interfaceC3207pE) != -1) {
            }
        }
        C3210pH c3210pH = (C3210pH) this.d;
        if (c3210pH.t() && !c0284Pq.a.n) {
            AbstractC2883jK.A(c3210pH, "");
            throw null;
        }
        c3210pH.f(((EnumC3596wO) this.c).b);
        N2 n2 = c3210pH.b;
        int i = n2.b;
        int[] iArr = (int[]) n2.d;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            n2.b = i - 1;
        }
        int i2 = n2.b;
        if (i2 != -1) {
            n2.b = i2 - 1;
        }
    }

    public ColorStateList r() {
        C2609eJ c2609eJ = (C2609eJ) this.e;
        if (c2609eJ != null) {
            return c2609eJ.a;
        }
        return null;
    }

    public PorterDuff.Mode s() {
        C2609eJ c2609eJ = (C2609eJ) this.e;
        if (c2609eJ != null) {
            return c2609eJ.b;
        }
        return null;
    }

    public void t(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListI;
        View view = (View) this.b;
        Context context = view.getContext();
        int[] iArr = AbstractC2547dB.z;
        D3 d3L = D3.L(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) d3L.b;
        View view2 = (View) this.b;
        UL.k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) d3L.b, i);
        try {
            if (typedArray.hasValue(0)) {
                this.a = typedArray.getResourceId(0, -1);
                I2 i2 = (I2) this.c;
                Context context2 = view.getContext();
                int i3 = this.a;
                synchronized (i2) {
                    colorStateListI = i2.a.i(context2, i3);
                }
                if (colorStateListI != null) {
                    w(colorStateListI);
                }
            }
            if (typedArray.hasValue(1)) {
                ML.h(view, d3L.w(1));
            }
            if (typedArray.hasValue(2)) {
                ML.i(view, AbstractC3228ph.c(typedArray.getInt(2, -1), null));
            }
            d3L.P();
        } catch (Throwable th) {
            d3L.P();
            throw th;
        }
    }

    public void u() {
        this.a = -1;
        w(null);
        a();
    }

    public void v(int i) {
        ColorStateList colorStateListI;
        this.a = i;
        I2 i2 = (I2) this.c;
        if (i2 != null) {
            Context context = ((View) this.b).getContext();
            synchronized (i2) {
                colorStateListI = i2.a.i(context, i);
            }
        } else {
            colorStateListI = null;
        }
        w(colorStateListI);
        a();
    }

    public void w(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((C2609eJ) this.d) == null) {
                this.d = new C2609eJ();
            }
            C2609eJ c2609eJ = (C2609eJ) this.d;
            c2609eJ.a = colorStateList;
            c2609eJ.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    public void x(ColorStateList colorStateList) {
        if (((C2609eJ) this.e) == null) {
            this.e = new C2609eJ();
        }
        C2609eJ c2609eJ = (C2609eJ) this.e;
        c2609eJ.a = colorStateList;
        c2609eJ.d = true;
        a();
    }

    public void y(PorterDuff.Mode mode) {
        if (((C2609eJ) this.e) == null) {
            this.e = new C2609eJ();
        }
        C2609eJ c2609eJ = (C2609eJ) this.e;
        c2609eJ.b = mode;
        c2609eJ.c = true;
        a();
    }

    public C2702g2(View view) {
        this.a = -1;
        this.b = view;
        this.c = I2.a();
    }
}
