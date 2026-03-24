package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: jK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2883jK {
    public static final C3337ri c;
    public static final C3337ri d;
    public static final C3337ri e;
    public static final C3337ri f;
    public static final C3337ri g;
    public static final C3337ri a = new C3337ri("CLOSED", 3);
    public static final String[] b = new String[0];
    public static final C3715yi h = new C3715yi(false);
    public static final C3715yi i = new C3715yi(true);
    public static final InterfaceC3207pE[] j = new InterfaceC3207pE[0];
    public static final C0108Fk k = new C0108Fk(26);
    public static final G3 l = new G3(6);

    static {
        int i2 = 3;
        c = new C3337ri("COMPLETING_ALREADY", i2);
        d = new C3337ri("COMPLETING_WAITING_CHILDREN", i2);
        e = new C3337ri("COMPLETING_RETRY", i2);
        f = new C3337ri("TOO_LATE_TO_CANCEL", i2);
        g = new C3337ri("SEALED", i2);
    }

    public static final void A(C3210pH c3210pH, String str) {
        AbstractC0500aq.m(c3210pH, "<this>");
        AbstractC0500aq.m(str, "entity");
        c3210pH.l(c3210pH.a - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static boolean B(int i2, Rect rect, Rect rect2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            return (i3 > i4 || rect.left >= i4) && rect.left > rect2.left;
        }
        if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            return (i5 > i6 || rect.top >= i6) && rect.top > rect2.top;
        }
        if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            return (i7 < i8 || rect.right <= i8) && rect.right < rect2.right;
        }
        if (i2 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        return (i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom;
    }

    public static boolean C(int i2, Object obj) {
        if (obj instanceof InterfaceC3450tn) {
            return (obj instanceof InterfaceC0060Cn ? ((InterfaceC0060Cn) obj).getArity() : obj instanceof InterfaceC0606cn ? 0 : obj instanceof InterfaceC2631en ? 1 : obj instanceof InterfaceC3396sn ? 2 : obj instanceof InterfaceC3504un ? 3 : -1) == i2;
        }
        return false;
    }

    public static int D(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else {
            if (i2 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i3 = rect2.top;
            i4 = rect.bottom;
        }
        return Math.max(0, i3 - i4);
    }

    public static final CharSequence E(CharSequence charSequence, int i2) {
        AbstractC0500aq.m(charSequence, "<this>");
        if (charSequence.length() < 200) {
            return charSequence;
        }
        if (i2 == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i3 = i2 - 30;
        int i4 = i2 + 30;
        String str = i3 <= 0 ? "" : ".....";
        String str2 = i4 >= charSequence.length() ? "" : ".....";
        StringBuilder sbN = AbstractC3264qG.n(str);
        if (i3 < 0) {
            i3 = 0;
        }
        int length2 = charSequence.length();
        if (i4 > length2) {
            i4 = length2;
        }
        sbN.append(charSequence.subSequence(i3, i4).toString());
        sbN.append(str2);
        return sbN.toString();
    }

    public static int F(int i2, Rect rect, Rect rect2) {
        int iHeight;
        int i3;
        int iHeight2;
        if (i2 == 17) {
            iHeight = (rect.height() / 2) + rect.top;
            i3 = rect2.top;
            iHeight2 = rect2.height();
        } else {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
                iHeight = (rect.height() / 2) + rect.top;
                i3 = rect2.top;
                iHeight2 = rect2.height();
            }
            iHeight = (rect.width() / 2) + rect.left;
            i3 = rect2.left;
            iHeight2 = rect2.width();
        }
        return Math.abs(iHeight - ((iHeight2 / 2) + i3));
    }

    public static InterfaceC0168Jc G(InterfaceC0134Hc interfaceC0134Hc, InterfaceC0151Ic interfaceC0151Ic) {
        AbstractC0500aq.m(interfaceC0151Ic, "key");
        return AbstractC0500aq.b(interfaceC0134Hc.getKey(), interfaceC0151Ic) ? C0021Ai.a : interfaceC0134Hc;
    }

    public static PorterDuff.Mode H(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static InterfaceC0168Jc I(InterfaceC0134Hc interfaceC0134Hc, InterfaceC0168Jc interfaceC0168Jc) {
        AbstractC0500aq.m(interfaceC0168Jc, "context");
        return interfaceC0168Jc == C0021Ai.a ? interfaceC0134Hc : (InterfaceC0168Jc) interfaceC0168Jc.fold(interfaceC0134Hc, new C0030Ba(1));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void J(android.content.res.Resources.Theme r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto La
            defpackage.N3.c(r6)
            goto L42
        La:
            java.lang.Object r0 = defpackage.AbstractC0500aq.f
            monitor-enter(r0)
            boolean r1 = defpackage.AbstractC0500aq.h     // Catch: java.lang.Throwable -> L21
            r2 = 0
            if (r1 != 0) goto L2d
            r1 = 1
            java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
            java.lang.String r4 = "rebase"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r2)     // Catch: java.lang.Throwable -> L21 java.lang.NoSuchMethodException -> L23
            defpackage.AbstractC0500aq.g = r3     // Catch: java.lang.Throwable -> L21 java.lang.NoSuchMethodException -> L23
            r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L21 java.lang.NoSuchMethodException -> L23
            goto L2b
        L21:
            r6 = move-exception
            goto L43
        L23:
            r3 = move-exception
            java.lang.String r4 = "ResourcesCompat"
            java.lang.String r5 = "Failed to retrieve rebase() method"
            android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L21
        L2b:
            defpackage.AbstractC0500aq.h = r1     // Catch: java.lang.Throwable -> L21
        L2d:
            java.lang.reflect.Method r1 = defpackage.AbstractC0500aq.g     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L41
            r1.invoke(r6, r2)     // Catch: java.lang.Throwable -> L21 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalAccessException -> L37
            goto L41
        L35:
            r6 = move-exception
            goto L38
        L37:
            r6 = move-exception
        L38:
            java.lang.String r1 = "ResourcesCompat"
            java.lang.String r3 = "Failed to invoke rebase() method via reflection"
            android.util.Log.i(r1, r3, r6)     // Catch: java.lang.Throwable -> L21
            defpackage.AbstractC0500aq.g = r2     // Catch: java.lang.Throwable -> L21
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
        L42:
            return
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2883jK.J(android.content.res.Resources$Theme):void");
    }

    public static void K(View view, C2638eu c2638eu) {
        C0411Xh c0411Xh = c2638eu.b.c;
        if (c0411Xh == null || !c0411Xh.a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        C2529cu c2529cu = c2638eu.b;
        if (c2529cu.n != elevation) {
            c2529cu.n = elevation;
            c2638eu.t();
        }
    }

    public static void L(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i3);
    }

    public static final Object M(TD td, TD td2, InterfaceC3396sn interfaceC3396sn) throws Throwable {
        Object c0217Ma;
        Object objF;
        try {
            j(2, interfaceC3396sn);
            c0217Ma = interfaceC3396sn.invoke(td2, td);
        } catch (Throwable th) {
            c0217Ma = new C0217Ma(false, th);
        }
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        if (c0217Ma == enumC0321Sc || (objF = td.F(c0217Ma)) == d) {
            return enumC0321Sc;
        }
        if (objF instanceof C0217Ma) {
            throw ((C0217Ma) objF).a;
        }
        return S(objF);
    }

    public static final void N(C3210pH c3210pH, Number number) {
        AbstractC0500aq.m(c3210pH, "<this>");
        C3210pH.m(c3210pH, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final void O(int i2, int i3, InterfaceC3207pE interfaceC3207pE) {
        AbstractC0500aq.m(interfaceC3207pE, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i4 = (~i2) & i3;
        for (int i5 = 0; i5 < 32; i5++) {
            if ((i4 & 1) != 0) {
                arrayList.add(interfaceC3207pE.g(i5));
            }
            i4 >>>= 1;
        }
        String strA = interfaceC3207pE.a();
        AbstractC0500aq.m(strA, "serialName");
        throw new C3242pv(arrayList, arrayList.size() == 1 ? AbstractC3264qG.m(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", strA, "', but it was missing") : "Fields " + arrayList + " are required for type with serial name '" + strA + "', but they were missing", null);
    }

    public static byte[] P(X7 x7) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(UserVerificationMethods.USER_VERIFY_PATTERN, Integer.highestOneBit(0) * 2));
        int i2 = 0;
        while (i2 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i2);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < iMin2) {
                int i4 = x7.read(bArr, i3, iMin2 - i3);
                if (i4 == -1) {
                    return n(i2, arrayDeque);
                }
                i3 += i4;
                i2 += i4;
            }
            long j2 = iMin * (iMin < 4096 ? 4 : 2);
            iMin = j2 > 2147483647L ? Api.BaseClientBuilder.API_PRIORITY_OTHER : j2 < -2147483648L ? Integer.MIN_VALUE : (int) j2;
        }
        if (x7.read() == -1) {
            return n(2147483639, arrayDeque);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static final long Q(int i2, EnumC0173Jh enumC0173Jh) {
        AbstractC0500aq.m(enumC0173Jh, "unit");
        return enumC0173Jh.compareTo(EnumC0173Jh.d) <= 0 ? s(MO.i(i2, enumC0173Jh, EnumC0173Jh.b)) : R(i2, enumC0173Jh);
    }

    public static final long R(long j2, EnumC0173Jh enumC0173Jh) {
        AbstractC0500aq.m(enumC0173Jh, "unit");
        EnumC0173Jh enumC0173Jh2 = EnumC0173Jh.b;
        long jI = MO.i(4611686018426999999L, enumC0173Jh2, enumC0173Jh);
        if ((-jI) <= j2 && j2 <= jI) {
            return s(MO.i(j2, enumC0173Jh, enumC0173Jh2));
        }
        EnumC0173Jh enumC0173Jh3 = EnumC0173Jh.c;
        AbstractC0500aq.m(enumC0173Jh3, "targetUnit");
        return r(AbstractC0069Df.h(enumC0173Jh3.a.convert(j2, enumC0173Jh.a)));
    }

    public static final Object S(Object obj) {
        InterfaceC3344rp interfaceC3344rp;
        C3398sp c3398sp = obj instanceof C3398sp ? (C3398sp) obj : null;
        return (c3398sp == null || (interfaceC3344rp = c3398sp.a) == null) ? obj : interfaceC3344rp;
    }

    public static final Object T(long j2, InterfaceC3396sn interfaceC3396sn, InterfaceC3493uc interfaceC3493uc) throws Throwable {
        Object c0217Ma;
        Object objF;
        if (j2 <= 0) {
            throw new C0530bJ("Timed out immediately", null);
        }
        RunnableC0584cJ runnableC0584cJ = new RunnableC0584cJ(j2, interfaceC3493uc);
        AbstractC3296qu.F(runnableC0584cJ, true, new C2735gh(AbstractC0136He.q(runnableC0584cJ.d.getContext()).a(runnableC0584cJ.e, runnableC0584cJ, runnableC0584cJ.c), 0));
        try {
            j(2, interfaceC3396sn);
            c0217Ma = interfaceC3396sn.invoke(runnableC0584cJ, runnableC0584cJ);
        } catch (Throwable th) {
            c0217Ma = new C0217Ma(false, th);
        }
        Object obj = EnumC0321Sc.a;
        if (c0217Ma == obj || (objF = runnableC0584cJ.F(c0217Ma)) == d) {
            return obj;
        }
        if (objF instanceof C0217Ma) {
            Throwable th2 = ((C0217Ma) objF).a;
            if (!(th2 instanceof C0530bJ) || ((C0530bJ) th2).a != runnableC0584cJ) {
                throw th2;
            }
            if (c0217Ma instanceof C0217Ma) {
                throw ((C0217Ma) c0217Ma).a;
            }
        } else {
            c0217Ma = S(objF);
        }
        return c0217Ma;
    }

    public static final C0403Wq a(Number number, String str) {
        return new C0403Wq("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) E(str, -1)), 1);
    }

    public static final C0403Wq b(InterfaceC3207pE interfaceC3207pE) {
        return new C0403Wq("Value of type '" + interfaceC3207pE.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + interfaceC3207pE.e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.", 1);
    }

    public static final C0403Wq c(int i2, String str) {
        AbstractC0500aq.m(str, "message");
        if (i2 >= 0) {
            str = "Unexpected JSON token at offset " + i2 + ": " + str;
        }
        return new C0403Wq(str, 0);
    }

    public static final C0403Wq d(int i2, String str, String str2) {
        AbstractC0500aq.m(str, "message");
        AbstractC0500aq.m(str2, "input");
        return c(i2, str + "\nJSON input: " + ((Object) E(str2, i2)));
    }

    public static void e(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void f(StringBuilder sb, Object obj, InterfaceC2631en interfaceC2631en) {
        CharSequence string;
        if (interfaceC2631en == null) {
            if (!(obj == null ? true : obj instanceof CharSequence)) {
                if (obj instanceof Character) {
                    sb.append(((Character) obj).charValue());
                    return;
                }
                string = obj.toString();
            }
            sb.append(string);
        }
        obj = interfaceC2631en.invoke(obj);
        string = (CharSequence) obj;
        sb.append(string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v6, types: [cn] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(defpackage.Sz r4, defpackage.C2793hk r5, defpackage.InterfaceC3493uc r6) {
        /*
            boolean r0 = r6 instanceof defpackage.Pz
            if (r0 == 0) goto L13
            r0 = r6
            Pz r0 = (defpackage.Pz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            Pz r0 = new Pz
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            cn r5 = r0.a
            defpackage.AbstractC0115Ga.U(r6)     // Catch: java.lang.Throwable -> L29
            goto L66
        L29:
            r4 = move-exception
            goto L6c
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.AbstractC0115Ga.U(r6)
            Jc r6 = r0.getContext()
            Fk r2 = defpackage.C0108Fk.e
            Hc r6 = r6.get(r2)
            if (r6 != r4) goto L70
            r0.getClass()     // Catch: java.lang.Throwable -> L29
            r0.a = r5     // Catch: java.lang.Throwable -> L29
            r0.c = r3     // Catch: java.lang.Throwable -> L29
            B8 r6 = new B8     // Catch: java.lang.Throwable -> L29
            uc r0 = defpackage.AbstractC0069Df.C(r0)     // Catch: java.lang.Throwable -> L29
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L29
            r6.s()     // Catch: java.lang.Throwable -> L29
            Qz r0 = new Qz     // Catch: java.lang.Throwable -> L29
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L29
            Rz r4 = (defpackage.Rz) r4     // Catch: java.lang.Throwable -> L29
            r4.b(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r6.r()     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L66
            return r1
        L66:
            r5.invoke()
            DK r4 = defpackage.DK.a
            return r4
        L6c:
            r5.invoke()
            throw r4
        L70:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2883jK.g(Sz, hk, uc):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean h(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = i(r9, r10, r11)
            boolean r1 = i(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L78
            if (r0 != 0) goto Lf
            goto L78
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3d
            if (r9 == r3) goto L36
            if (r9 == r4) goto L2f
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L77
            goto L43
        L29:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L2f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L77
            goto L43
        L36:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L77
            goto L43
        L3d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L77
        L43:
            if (r9 == r5) goto L77
            if (r9 != r4) goto L48
            goto L77
        L48:
            int r11 = D(r9, r10, r11)
            if (r9 == r5) goto L6a
            if (r9 == r3) goto L65
            if (r9 == r4) goto L60
            if (r9 != r1) goto L5a
            int r9 = r12.bottom
            int r10 = r10.bottom
        L58:
            int r9 = r9 - r10
            goto L6f
        L5a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L60:
            int r9 = r12.right
            int r10 = r10.right
            goto L58
        L65:
            int r9 = r10.top
            int r10 = r12.top
            goto L58
        L6a:
            int r9 = r10.left
            int r10 = r12.left
            goto L58
        L6f:
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L76
            r2 = r6
        L76:
            return r2
        L77:
            return r6
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2883jK.h(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean i(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static void j(int i2, Object obj) {
        if (obj == null || C(i2, obj)) {
            return;
        }
        ClassCastException classCastException = new ClassCastException(AbstractC3264qG.h(obj.getClass().getName(), " cannot be cast to ", Vs.k(i2, "kotlin.jvm.functions.Function")));
        AbstractC0500aq.W(classCastException, AbstractC2883jK.class.getName());
        throw classCastException;
    }

    public static final Set k(InterfaceC3207pE interfaceC3207pE) {
        AbstractC0500aq.m(interfaceC3207pE, "<this>");
        if (interfaceC3207pE instanceof InterfaceC2763h8) {
            return ((InterfaceC2763h8) interfaceC3207pE).b();
        }
        HashSet hashSet = new HashSet(interfaceC3207pE.f());
        int iF = interfaceC3207pE.f();
        for (int i2 = 0; i2 < iF; i2++) {
            hashSet.add(interfaceC3207pE.g(i2));
        }
        return hashSet;
    }

    public static final void l(int i2) {
        if (i2 < 1) {
            throw new IllegalArgumentException(Vs.k(i2, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final void m(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                MO.a(th, th2);
            }
        }
    }

    public static byte[] n(int i2, ArrayDeque arrayDeque) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i2) {
            return bArr;
        }
        int length = i2 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i2 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static final InterfaceC3207pE[] o(List list) {
        InterfaceC3207pE[] interfaceC3207pEArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (interfaceC3207pEArr = (InterfaceC3207pE[]) list.toArray(new InterfaceC3207pE[0])) == null) ? j : interfaceC3207pEArr;
    }

    public static C3658xf p(InterfaceC3478uE interfaceC3478uE, C2827iH c2827iH, List list, InterfaceC0304Rc interfaceC0304Rc, InterfaceC0606cn interfaceC0606cn) {
        AbstractC0500aq.m(interfaceC3478uE, "serializer");
        AbstractC0500aq.m(list, "migrations");
        AbstractC0500aq.m(interfaceC0304Rc, "scope");
        C2847ik c2847ik = new C2847ik(interfaceC3478uE, C2738gk.b, interfaceC0606cn);
        InterfaceC0406Xc c3397so = c2827iH;
        if (c2827iH == null) {
            c3397so = new C3397so(21);
        }
        return new C3658xf(c2847ik, AbstractC0115Ga.I(new C0187Ke(list, null)), c3397so, interfaceC0304Rc);
    }

    public static AbstractC0500aq q(int i2) {
        return i2 != 0 ? i2 != 1 ? new XC() : new C3441te() : new XC();
    }

    public static final long r(long j2) {
        long j3 = (j2 << 1) + 1;
        int i2 = C0139Hh.d;
        int i3 = AbstractC0156Ih.a;
        return j3;
    }

    public static final long s(long j2) {
        long j3 = j2 << 1;
        int i2 = C0139Hh.d;
        int i3 = AbstractC0156Ih.a;
        return j3;
    }

    public static final C0361Ui t(Enum[] enumArr) {
        AbstractC0500aq.m(enumArr, "entries");
        return new C0361Ui(enumArr);
    }

    public static final Object u(ZD zd, long j2, InterfaceC3396sn interfaceC3396sn) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (zd.c >= j2 && !zd.d()) {
                return zd;
            }
            Object obj = AbstractC3330rb.a.get(zd);
            C3337ri c3337ri = a;
            if (obj == c3337ri) {
                return c3337ri;
            }
            ZD zd2 = (ZD) ((AbstractC3330rb) obj);
            if (zd2 == null) {
                zd2 = (ZD) interfaceC3396sn.invoke(Long.valueOf(zd.c + 1), zd);
                do {
                    atomicReferenceFieldUpdater = AbstractC3330rb.a;
                    if (atomicReferenceFieldUpdater.compareAndSet(zd, null, zd2)) {
                        if (zd.d()) {
                            zd.e();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(zd) == null);
            }
            zd = zd2;
        }
    }

    public static InterfaceC0134Hc v(InterfaceC0134Hc interfaceC0134Hc, InterfaceC0151Ic interfaceC0151Ic) {
        AbstractC0500aq.m(interfaceC0151Ic, "key");
        if (AbstractC0500aq.b(interfaceC0134Hc.getKey(), interfaceC0151Ic)) {
            return interfaceC0134Hc;
        }
        return null;
    }

    public static Intent w(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strY = y(activity, activity.getComponentName());
            if (strY == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, strY);
            try {
                return y(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strY + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static Intent x(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strY = y(context, componentName);
        if (strY == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strY);
        return y(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String y(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i2 = Build.VERSION.SDK_INT;
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i2 >= 29 ? 269222528 : i2 >= 24 ? 787072 : 640);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static ArrayList z(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < toolbar.getChildCount(); i2++) {
            View childAt = toolbar.getChildAt(i2);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }
}
