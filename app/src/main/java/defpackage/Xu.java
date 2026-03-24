package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class Xu implements PD {
    public static final int[] n = new int[0];
    public static final Unsafe o = PK.i();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final AbstractC3733z e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final C3351rw j;
    public final C3129ns k;
    public final FK l;
    public final Et m;

    public Xu(int[] iArr, Object[] objArr, int i, int i2, AbstractC3733z abstractC3733z, int[] iArr2, int i3, int i4, C3351rw c3351rw, C3129ns c3129ns, FK fk, C3554vj c3554vj, Et et) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = abstractC3733z instanceof AbstractC0247Nn;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = c3351rw;
        this.k = c3129ns;
        this.l = fk;
        this.e = abstractC3733z;
        this.m = et;
    }

    public static long A(long j, Object obj) {
        return ((Long) PK.c.h(j, obj)).longValue();
    }

    public static Field G(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbO = AbstractC3264qG.o("Field ", str, " for ");
            sbO.append(cls.getName());
            sbO.append(" not found. Known fields are ");
            sbO.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbO.toString());
        }
    }

    public static int L(int i) {
        return (i & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0247Nn) {
            return ((AbstractC0247Nn) obj).j();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.Xu x(defpackage.C2821iB r33, defpackage.C3351rw r34, defpackage.C3129ns r35, defpackage.FK r36, defpackage.C3554vj r37, defpackage.Et r38) {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Xu.x(iB, rw, ns, FK, vj, Et):Xu");
    }

    public static long y(int i) {
        return i & 1048575;
    }

    public static int z(long j, Object obj) {
        return ((Integer) PK.c.h(j, obj)).intValue();
    }

    public final int B(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final void C(Object obj, long j, C0463a7 c0463a7, PD pd, C3500uj c3500uj) throws C2689fq {
        int iA;
        this.k.getClass();
        InterfaceC0351Tp interfaceC0351TpB = C3129ns.b(j, obj);
        int i = c0463a7.a;
        if ((i & 7) != 3) {
            throw C2744gq.b();
        }
        do {
            AbstractC0247Nn abstractC0247NnH = pd.h();
            c0463a7.e(abstractC0247NnH, pd, c3500uj);
            pd.c(abstractC0247NnH);
            ((C2983lA) interfaceC0351TpB).add(abstractC0247NnH);
            AbstractC3111na abstractC3111na = (AbstractC3111na) c0463a7.d;
            if (abstractC3111na.i() || c0463a7.c != 0) {
                return;
            } else {
                iA = abstractC3111na.A();
            }
        } while (iA == i);
        c0463a7.c = iA;
    }

    public final void D(Object obj, int i, C0463a7 c0463a7, PD pd, C3500uj c3500uj) throws C2744gq {
        int iA;
        this.k.getClass();
        InterfaceC0351Tp interfaceC0351TpB = C3129ns.b(i & 1048575, obj);
        int i2 = c0463a7.a;
        if ((i2 & 7) != 2) {
            throw C2744gq.b();
        }
        do {
            AbstractC0247Nn abstractC0247NnH = pd.h();
            c0463a7.f(abstractC0247NnH, pd, c3500uj);
            pd.c(abstractC0247NnH);
            ((C2983lA) interfaceC0351TpB).add(abstractC0247NnH);
            AbstractC3111na abstractC3111na = (AbstractC3111na) c0463a7.d;
            if (abstractC3111na.i() || c0463a7.c != 0) {
                return;
            } else {
                iA = abstractC3111na.A();
            }
        } while (iA == i2);
        c0463a7.c = iA;
    }

    public final void E(int i, C0463a7 c0463a7, Object obj) throws C2689fq {
        long j;
        String strY;
        if ((536870912 & i) != 0) {
            j = i & 1048575;
            c0463a7.z(2);
            strY = ((AbstractC3111na) c0463a7.d).z();
        } else if (!this.f) {
            PK.o(obj, i & 1048575, c0463a7.h());
            return;
        } else {
            j = i & 1048575;
            c0463a7.z(2);
            strY = ((AbstractC3111na) c0463a7.d).y();
        }
        PK.o(obj, j, strY);
    }

    public final void F(int i, C0463a7 c0463a7, Object obj) throws C2689fq {
        boolean z = (536870912 & i) != 0;
        C3129ns c3129ns = this.k;
        if (z) {
            c3129ns.getClass();
            c0463a7.v(C3129ns.b(i & 1048575, obj), true);
        } else {
            c3129ns.getClass();
            c0463a7.v(C3129ns.b(i & 1048575, obj), false);
        }
    }

    public final void H(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        PK.m(obj, j, (1 << (i2 >>> 20)) | PK.c.f(j, obj));
    }

    public final void I(int i, int i2, Object obj) {
        PK.m(obj, this.a[i2 + 2] & 1048575, i);
    }

    public final void J(Object obj, int i, AbstractC3733z abstractC3733z) {
        o.putObject(obj, M(i) & 1048575, abstractC3733z);
        H(i, obj);
    }

    public final void K(Object obj, int i, int i2, AbstractC3733z abstractC3733z) {
        o.putObject(obj, M(i2) & 1048575, abstractC3733z);
        I(i, i2, obj);
    }

    public final int M(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void N(Object obj, C2524cp c2524cp) throws IOException {
        int i;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        boolean z;
        boolean z2;
        int[] iArr2 = this.a;
        int length = iArr2.length;
        Unsafe unsafe = o;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i7 < length) {
            int iM = M(i7);
            int i8 = iArr2[i7];
            int iL = L(iM);
            if (iL <= 17) {
                int i9 = iArr2[i7 + 2];
                int i10 = i9 & 1048575;
                if (i10 != i5) {
                    i6 = i10 == 1048575 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                i = i5;
                i2 = i6;
                i3 = 1 << (i9 >>> 20);
            } else {
                i = i5;
                i2 = i6;
                i3 = 0;
            }
            long j = iM & 1048575;
            switch (iL) {
                case 0:
                    iArr = iArr2;
                    i4 = length;
                    if (o(obj, i7, i, i2, i3)) {
                        c2524cp.z(i8, PK.c.d(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    iArr = iArr2;
                    i4 = length;
                    if (o(obj, i7, i, i2, i3)) {
                        c2524cp.D(i8, PK.c.e(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    iArr = iArr2;
                    i4 = length;
                    if (o(obj, i7, i, i2, i3)) {
                        c2524cp.G(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    iArr = iArr2;
                    i4 = length;
                    if (o(obj, i7, i, i2, i3)) {
                        c2524cp.N(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    iArr = iArr2;
                    i4 = length;
                    if (o(obj, i7, i, i2, i3)) {
                        c2524cp.F(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    iArr = iArr2;
                    i4 = length;
                    if (o(obj, i7, i, i2, i3)) {
                        c2524cp.C(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    iArr = iArr2;
                    i4 = length;
                    if (o(obj, i7, i, i2, i3)) {
                        c2524cp.B(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    iArr = iArr2;
                    i4 = length;
                    if (o(obj, i7, i, i2, i3)) {
                        c2524cp.x(i8, PK.c.c(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    iArr = iArr2;
                    i4 = length;
                    if (o(obj, i7, i, i2, i3)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((C3221pa) c2524cp.b).S0(i8, (String) object);
                            break;
                        } else {
                            c2524cp.y(i8, (C0519b8) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    iArr = iArr2;
                    i4 = length;
                    if (o(obj, i7, i, i2, i3)) {
                        c2524cp.H(i8, unsafe.getObject(obj, j), m(i7));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    iArr = iArr2;
                    i4 = length;
                    if (o(obj, i7, i, i2, i3)) {
                        c2524cp.y(i8, (C0519b8) unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    iArr = iArr2;
                    i4 = length;
                    if (o(obj, i7, i, i2, i3)) {
                        c2524cp.M(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    iArr = iArr2;
                    i4 = length;
                    if (o(obj, i7, i, i2, i3)) {
                        c2524cp.A(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    iArr = iArr2;
                    i4 = length;
                    if (o(obj, i7, i, i2, i3)) {
                        c2524cp.I(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    iArr = iArr2;
                    i4 = length;
                    if (o(obj, i7, i, i2, i3)) {
                        c2524cp.J(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    iArr = iArr2;
                    i4 = length;
                    if (o(obj, i7, i, i2, i3)) {
                        c2524cp.K(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    iArr = iArr2;
                    i4 = length;
                    if (o(obj, i7, i, i2, i3)) {
                        c2524cp.L(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    iArr = iArr2;
                    i4 = length;
                    if (o(obj, i7, i, i2, i3)) {
                        c2524cp.E(i8, unsafe.getObject(obj, j), m(i7));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    z = false;
                    SD.E(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp, false);
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 19:
                    z = false;
                    SD.I(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp, false);
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 20:
                    z = false;
                    SD.L(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp, false);
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 21:
                    z = false;
                    SD.T(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp, false);
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 22:
                    z = false;
                    SD.K(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp, false);
                    iArr = iArr2;
                    i4 = length;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    z = false;
                    SD.H(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp, false);
                    iArr = iArr2;
                    i4 = length;
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    z = false;
                    SD.G(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp, false);
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 25:
                    z = false;
                    SD.C(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp, false);
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 26:
                    SD.R(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp);
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 27:
                    SD.M(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp, m(i7));
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 28:
                    SD.D(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp);
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 29:
                    z2 = false;
                    SD.S(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp, false);
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 30:
                    z2 = false;
                    SD.F(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp, false);
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 31:
                    z2 = false;
                    SD.N(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp, false);
                    iArr = iArr2;
                    i4 = length;
                    break;
                case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                    z2 = false;
                    SD.O(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp, false);
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 33:
                    z2 = false;
                    SD.P(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp, false);
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 34:
                    z2 = false;
                    SD.Q(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp, false);
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 35:
                    SD.E(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp, true);
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 36:
                    SD.I(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp, true);
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 37:
                    SD.L(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp, true);
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 38:
                    SD.T(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp, true);
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 39:
                    SD.K(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp, true);
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 40:
                    SD.H(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp, true);
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 41:
                    SD.G(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp, true);
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 42:
                    SD.C(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp, true);
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 43:
                    SD.S(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp, true);
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 44:
                    SD.F(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp, true);
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 45:
                    SD.N(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp, true);
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 46:
                    SD.O(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp, true);
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 47:
                    SD.P(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp, true);
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 48:
                    SD.Q(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp, true);
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 49:
                    SD.J(iArr2[i7], (List) unsafe.getObject(obj, j), c2524cp, m(i7));
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        int i11 = 2;
                        Object obj2 = this.b[(i7 / 3) * 2];
                        this.m.getClass();
                        KJ kj = ((Ct) obj2).a;
                        C3221pa c3221pa = (C3221pa) c2524cp.b;
                        c3221pa.getClass();
                        for (Map.Entry entry : ((Dt) object2).entrySet()) {
                            c3221pa.U0(i8, i11);
                            c3221pa.W0(Ct.a(kj, entry.getKey(), entry.getValue()));
                            Ct.b(c3221pa, kj, entry.getKey(), entry.getValue());
                            i11 = 2;
                        }
                    }
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 51:
                    if (q(i8, i7, obj)) {
                        c2524cp.z(i8, ((Double) PK.c.h(j, obj)).doubleValue());
                    }
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 52:
                    if (q(i8, i7, obj)) {
                        c2524cp.D(i8, ((Float) PK.c.h(j, obj)).floatValue());
                    }
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 53:
                    if (q(i8, i7, obj)) {
                        c2524cp.G(i8, A(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 54:
                    if (q(i8, i7, obj)) {
                        c2524cp.N(i8, A(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 55:
                    if (q(i8, i7, obj)) {
                        c2524cp.F(i8, z(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 56:
                    if (q(i8, i7, obj)) {
                        c2524cp.C(i8, A(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 57:
                    if (q(i8, i7, obj)) {
                        c2524cp.B(i8, z(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 58:
                    if (q(i8, i7, obj)) {
                        c2524cp.x(i8, ((Boolean) PK.c.h(j, obj)).booleanValue());
                    }
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 59:
                    if (q(i8, i7, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            ((C3221pa) c2524cp.b).S0(i8, (String) object3);
                        } else {
                            c2524cp.y(i8, (C0519b8) object3);
                        }
                    }
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 60:
                    if (q(i8, i7, obj)) {
                        c2524cp.H(i8, unsafe.getObject(obj, j), m(i7));
                    }
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 61:
                    if (q(i8, i7, obj)) {
                        c2524cp.y(i8, (C0519b8) unsafe.getObject(obj, j));
                    }
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 62:
                    if (q(i8, i7, obj)) {
                        c2524cp.M(i8, z(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 63:
                    if (q(i8, i7, obj)) {
                        c2524cp.A(i8, z(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (q(i8, i7, obj)) {
                        c2524cp.I(i8, z(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (q(i8, i7, obj)) {
                        c2524cp.J(i8, A(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 66:
                    if (q(i8, i7, obj)) {
                        c2524cp.K(i8, z(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 67:
                    if (q(i8, i7, obj)) {
                        c2524cp.L(i8, A(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 68:
                    if (q(i8, i7, obj)) {
                        c2524cp.E(i8, unsafe.getObject(obj, j), m(i7));
                    }
                    iArr = iArr2;
                    i4 = length;
                    break;
                default:
                    iArr = iArr2;
                    i4 = length;
                    break;
            }
            i7 += 3;
            i5 = i;
            iArr2 = iArr;
            i6 = i2;
            length = i4;
        }
        this.l.getClass();
        ((AbstractC0247Nn) obj).unknownFields.d(c2524cp);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    @Override // defpackage.PD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Xu.a(java.lang.Object, java.lang.Object):void");
    }

    @Override // defpackage.PD
    public final void b(Object obj, C2524cp c2524cp) throws IOException {
        c2524cp.getClass();
        N(obj, c2524cp);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    @Override // defpackage.PD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = p(r9)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r9 instanceof defpackage.AbstractC0247Nn
            if (r0 == 0) goto L17
            r0 = r9
            Nn r0 = (defpackage.AbstractC0247Nn) r0
            r0.e()
            r0.d()
            r0.k()
        L17:
            int[] r0 = r8.a
            int r1 = r0.length
            r2 = 0
        L1b:
            if (r2 >= r1) goto L77
            int r3 = r8.M(r2)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r4 = (long) r4
            int r3 = L(r3)
            r6 = 9
            if (r3 == r6) goto L6d
            r6 = 60
            if (r3 == r6) goto L57
            r6 = 68
            if (r3 == r6) goto L57
            switch(r3) {
                case 17: goto L6d;
                case 18: goto L4e;
                case 19: goto L4e;
                case 20: goto L4e;
                case 21: goto L4e;
                case 22: goto L4e;
                case 23: goto L4e;
                case 24: goto L4e;
                case 25: goto L4e;
                case 26: goto L4e;
                case 27: goto L4e;
                case 28: goto L4e;
                case 29: goto L4e;
                case 30: goto L4e;
                case 31: goto L4e;
                case 32: goto L4e;
                case 33: goto L4e;
                case 34: goto L4e;
                case 35: goto L4e;
                case 36: goto L4e;
                case 37: goto L4e;
                case 38: goto L4e;
                case 39: goto L4e;
                case 40: goto L4e;
                case 41: goto L4e;
                case 42: goto L4e;
                case 43: goto L4e;
                case 44: goto L4e;
                case 45: goto L4e;
                case 46: goto L4e;
                case 47: goto L4e;
                case 48: goto L4e;
                case 49: goto L4e;
                case 50: goto L3a;
                default: goto L39;
            }
        L39:
            goto L74
        L3a:
            sun.misc.Unsafe r3 = defpackage.Xu.o
            java.lang.Object r6 = r3.getObject(r9, r4)
            if (r6 == 0) goto L74
            Et r7 = r8.m
            r7.getClass()
            defpackage.Et.c(r6)
            r3.putObject(r9, r4, r6)
            goto L74
        L4e:
            ns r3 = r8.k
            r3.getClass()
            defpackage.C3129ns.a(r4, r9)
            goto L74
        L57:
            r3 = r0[r2]
            boolean r3 = r8.q(r3, r2, r9)
            if (r3 == 0) goto L74
        L5f:
            PD r3 = r8.m(r2)
            sun.misc.Unsafe r6 = defpackage.Xu.o
            java.lang.Object r4 = r6.getObject(r9, r4)
            r3.c(r4)
            goto L74
        L6d:
            boolean r3 = r8.n(r2, r9)
            if (r3 == 0) goto L74
            goto L5f
        L74:
            int r2 = r2 + 3
            goto L1b
        L77:
            FK r0 = r8.l
            r0.getClass()
            defpackage.FK.b(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Xu.c(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00df  */
    @Override // defpackage.PD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Xu.d(java.lang.Object):boolean");
    }

    @Override // defpackage.PD
    public final void e(Object obj, C0463a7 c0463a7, C3500uj c3500uj) throws Throwable {
        c3500uj.getClass();
        if (p(obj)) {
            r(this.l, obj, c0463a7, c3500uj);
        } else {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // defpackage.PD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(java.lang.Object r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Xu.f(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00f0 A[PHI: r0
      0x00f0: PHI (r0v172 java.lang.Object) = (r0v32 java.lang.Object), (r0v176 java.lang.Object) binds: [B:175:0x03ba, B:57:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fa A[PHI: r0
      0x00fa: PHI (r0v167 java.lang.Object) = (r0v32 java.lang.Object), (r0v176 java.lang.Object) binds: [B:175:0x03ba, B:57:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a0 A[PHI: r0
      0x01a0: PHI (r0v136 int) = 
      (r0v99 int)
      (r0v102 int)
      (r0v105 int)
      (r0v108 int)
      (r0v111 int)
      (r0v114 int)
      (r0v117 int)
      (r0v120 int)
      (r0v123 int)
      (r0v126 int)
      (r0v129 int)
      (r0v132 int)
      (r0v135 int)
      (r0v139 int)
     binds: [B:130:0x0257, B:127:0x0249, B:124:0x023b, B:121:0x022d, B:118:0x021f, B:115:0x0212, B:112:0x0205, B:109:0x01f8, B:106:0x01eb, B:103:0x01de, B:100:0x01d1, B:97:0x01c4, B:94:0x01b7, B:91:0x019e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.PD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 1260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Xu.g(java.lang.Object):int");
    }

    @Override // defpackage.PD
    public final AbstractC0247Nn h() {
        this.j.getClass();
        return ((AbstractC0247Nn) this.e).l();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4 A[PHI: r3
      0x00b4: PHI (r3v31 int) = (r3v10 int), (r3v32 int) binds: [B:91:0x0168, B:45:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0124 A[PHI: r4
      0x0124: PHI (r4v14 java.lang.Object) = (r4v9 java.lang.Object), (r4v16 java.lang.Object) binds: [B:87:0x0157, B:74:0x0122] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.PD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Xu.i(java.lang.Object):int");
    }

    public final boolean j(int i, Object obj, Object obj2) {
        return n(i, obj) == n(i, obj2);
    }

    public final void k(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (PK.c.h(M(i) & 1048575, obj) == null) {
            return;
        }
        l(i);
    }

    public final void l(int i) {
        Vs.u(this.b[((i / 3) * 2) + 1]);
    }

    public final PD m(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        PD pd = (PD) objArr[i2];
        if (pd != null) {
            return pd;
        }
        PD pdA = C2928kA.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = pdA;
        return pdA;
    }

    public final boolean n(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & PK.c.f(j, obj)) != 0;
        }
        int iM = M(i);
        long j2 = iM & 1048575;
        switch (L(iM)) {
            case 0:
                return Double.doubleToRawLongBits(PK.c.d(j2, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(PK.c.e(j2, obj)) != 0;
            case 2:
                return PK.c.g(j2, obj) != 0;
            case 3:
                return PK.c.g(j2, obj) != 0;
            case 4:
                return PK.c.f(j2, obj) != 0;
            case 5:
                return PK.c.g(j2, obj) != 0;
            case 6:
                return PK.c.f(j2, obj) != 0;
            case 7:
                return PK.c.c(j2, obj);
            case 8:
                Object objH = PK.c.h(j2, obj);
                if (objH instanceof String) {
                    return !((String) objH).isEmpty();
                }
                if (objH instanceof C0519b8) {
                    return !C0519b8.c.equals(objH);
                }
                throw new IllegalArgumentException();
            case 9:
                return PK.c.h(j2, obj) != null;
            case 10:
                return !C0519b8.c.equals(PK.c.h(j2, obj));
            case 11:
                return PK.c.f(j2, obj) != 0;
            case 12:
                return PK.c.f(j2, obj) != 0;
            case 13:
                return PK.c.f(j2, obj) != 0;
            case 14:
                return PK.c.g(j2, obj) != 0;
            case 15:
                return PK.c.f(j2, obj) != 0;
            case 16:
                return PK.c.g(j2, obj) != 0;
            case 17:
                return PK.c.h(j2, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean o(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? n(i, obj) : (i3 & i4) != 0;
    }

    public final boolean q(int i, int i2, Object obj) {
        return PK.c.f((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x05bf A[Catch: all -> 0x0230, TryCatch #1 {all -> 0x0230, blocks: (B:139:0x05ba, B:141:0x05bf, B:142:0x05c4, B:70:0x022b, B:73:0x0233, B:74:0x0241, B:75:0x0246, B:76:0x0254, B:77:0x0259, B:78:0x0267, B:79:0x026c, B:80:0x027a, B:81:0x027f, B:82:0x0293, B:83:0x0298, B:84:0x02a6, B:85:0x02ab, B:86:0x02b9, B:87:0x02be, B:88:0x02cc, B:89:0x02d1, B:90:0x02df, B:91:0x02e4, B:92:0x02f2, B:93:0x02f7, B:94:0x0305, B:95:0x030a, B:96:0x0318, B:97:0x031d, B:98:0x032b, B:99:0x0330, B:100:0x033e, B:101:0x0343, B:102:0x0353, B:103:0x0363, B:104:0x0373, B:105:0x0383, B:106:0x0399, B:107:0x03a9, B:108:0x03bc, B:109:0x03d0, B:110:0x03d8, B:111:0x03e8, B:112:0x03f8, B:113:0x0408, B:114:0x0418, B:115:0x0428, B:116:0x0438, B:117:0x0448, B:118:0x0458, B:119:0x046c, B:120:0x0471, B:121:0x0482, B:122:0x0487, B:123:0x0499, B:124:0x04ac, B:125:0x04bf, B:126:0x04d4, B:127:0x04e6, B:128:0x04f5, B:129:0x050b, B:130:0x0513, B:131:0x0528, B:132:0x053c, B:133:0x0550, B:134:0x0563, B:135:0x0576, B:136:0x0589, B:137:0x059f), top: B:161:0x05ba }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05ca A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(defpackage.FK r20, java.lang.Object r21, defpackage.C0463a7 r22, defpackage.C3500uj r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Xu.r(FK, java.lang.Object, a7, uj):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
    
        r11.put(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
    
        r0.j(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a3, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(java.lang.Object r10, int r11, java.lang.Object r12, defpackage.C3500uj r13, defpackage.C0463a7 r14) throws defpackage.C2689fq {
        /*
            r9 = this;
            int r11 = r9.M(r11)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r11 & r0
            long r0 = (long) r11
            OK r11 = defpackage.PK.c
            java.lang.Object r11 = r11.h(r0, r10)
            r2 = 1
            Et r3 = r9.m
            r3.getClass()
            if (r11 != 0) goto L21
            Dt r11 = defpackage.Dt.b
            Dt r11 = r11.c()
            defpackage.PK.o(r10, r0, r11)
            goto L36
        L21:
            r4 = r11
            Dt r4 = (defpackage.Dt) r4
            boolean r4 = r4.a
            r4 = r4 ^ r2
            if (r4 == 0) goto L36
            Dt r4 = defpackage.Dt.b
            Dt r4 = r4.c()
            defpackage.Et.b(r4, r11)
            defpackage.PK.o(r10, r0, r4)
            r11 = r4
        L36:
            r3.getClass()
            Dt r11 = (defpackage.Dt) r11
            Ct r12 = (defpackage.Ct) r12
            KJ r10 = r12.a
            r12 = 2
            r14.z(r12)
            java.lang.Object r0 = r14.d
            na r0 = (defpackage.AbstractC3111na) r0
            int r1 = r0.B()
            int r1 = r0.k(r1)
            java.lang.Object r3 = r10.b
            java.lang.Object r4 = r10.d
            r5 = r4
        L54:
            int r6 = r14.d()     // Catch: java.lang.Throwable -> L77
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L9d
            boolean r7 = r0.i()     // Catch: java.lang.Throwable -> L77
            if (r7 == 0) goto L64
            goto L9d
        L64:
            java.lang.String r7 = "Unable to parse map entry."
            if (r6 == r2) goto L86
            if (r6 == r12) goto L79
            boolean r6 = r14.B()     // Catch: java.lang.Throwable -> L77 defpackage.C2689fq -> L90
            if (r6 == 0) goto L71
            goto L54
        L71:
            gq r6 = new gq     // Catch: java.lang.Throwable -> L77 defpackage.C2689fq -> L90
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L77 defpackage.C2689fq -> L90
            throw r6     // Catch: java.lang.Throwable -> L77 defpackage.C2689fq -> L90
        L77:
            r10 = move-exception
            goto La4
        L79:
            java.lang.Object r6 = r10.c     // Catch: java.lang.Throwable -> L77 defpackage.C2689fq -> L90
            KN r6 = (defpackage.KN) r6     // Catch: java.lang.Throwable -> L77 defpackage.C2689fq -> L90
            java.lang.Class r8 = r4.getClass()     // Catch: java.lang.Throwable -> L77 defpackage.C2689fq -> L90
            java.lang.Object r5 = r14.l(r6, r8, r13)     // Catch: java.lang.Throwable -> L77 defpackage.C2689fq -> L90
            goto L54
        L86:
            java.lang.Object r6 = r10.a     // Catch: java.lang.Throwable -> L77 defpackage.C2689fq -> L90
            KN r6 = (defpackage.KN) r6     // Catch: java.lang.Throwable -> L77 defpackage.C2689fq -> L90
            r8 = 0
            java.lang.Object r3 = r14.l(r6, r8, r8)     // Catch: java.lang.Throwable -> L77 defpackage.C2689fq -> L90
            goto L54
        L90:
            boolean r6 = r14.B()     // Catch: java.lang.Throwable -> L77
            if (r6 == 0) goto L97
            goto L54
        L97:
            gq r10 = new gq     // Catch: java.lang.Throwable -> L77
            r10.<init>(r7)     // Catch: java.lang.Throwable -> L77
            throw r10     // Catch: java.lang.Throwable -> L77
        L9d:
            r11.put(r3, r5)     // Catch: java.lang.Throwable -> L77
            r0.j(r1)
            return
        La4:
            r0.j(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Xu.s(java.lang.Object, int, java.lang.Object, uj, a7):void");
    }

    public final void t(int i, Object obj, Object obj2) {
        if (n(i, obj2)) {
            long jM = M(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, jM);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2);
            }
            PD pdM = m(i);
            if (!n(i, obj)) {
                if (p(object)) {
                    AbstractC0247Nn abstractC0247NnH = pdM.h();
                    pdM.a(abstractC0247NnH, object);
                    unsafe.putObject(obj, jM, abstractC0247NnH);
                } else {
                    unsafe.putObject(obj, jM, object);
                }
                H(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM);
            if (!p(object2)) {
                AbstractC0247Nn abstractC0247NnH2 = pdM.h();
                pdM.a(abstractC0247NnH2, object2);
                unsafe.putObject(obj, jM, abstractC0247NnH2);
                object2 = abstractC0247NnH2;
            }
            pdM.a(object2, object);
        }
    }

    public final void u(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (q(i2, i, obj2)) {
            long jM = M(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, jM);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            PD pdM = m(i);
            if (!q(i2, i, obj)) {
                if (p(object)) {
                    AbstractC0247Nn abstractC0247NnH = pdM.h();
                    pdM.a(abstractC0247NnH, object);
                    unsafe.putObject(obj, jM, abstractC0247NnH);
                } else {
                    unsafe.putObject(obj, jM, object);
                }
                I(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM);
            if (!p(object2)) {
                AbstractC0247Nn abstractC0247NnH2 = pdM.h();
                pdM.a(abstractC0247NnH2, object2);
                unsafe.putObject(obj, jM, abstractC0247NnH2);
                object2 = abstractC0247NnH2;
            }
            pdM.a(object2, object);
        }
    }

    public final Object v(int i, Object obj) {
        PD pdM = m(i);
        long jM = M(i) & 1048575;
        if (!n(i, obj)) {
            return pdM.h();
        }
        Object object = o.getObject(obj, jM);
        if (p(object)) {
            return object;
        }
        AbstractC0247Nn abstractC0247NnH = pdM.h();
        if (object != null) {
            pdM.a(abstractC0247NnH, object);
        }
        return abstractC0247NnH;
    }

    public final Object w(int i, int i2, Object obj) {
        PD pdM = m(i2);
        if (!q(i, i2, obj)) {
            return pdM.h();
        }
        Object object = o.getObject(obj, M(i2) & 1048575);
        if (p(object)) {
            return object;
        }
        AbstractC0247Nn abstractC0247NnH = pdM.h();
        if (object != null) {
            pdM.a(abstractC0247NnH, object);
        }
        return abstractC0247NnH;
    }
}
