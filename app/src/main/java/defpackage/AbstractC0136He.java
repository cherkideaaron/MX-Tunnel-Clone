package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import com.mxtunnel.pro.R;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import org.xmlpull.v1.XmlPullParser;
import rased.vpn.app.service.OpenVPNService;

/* renamed from: He, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0136He {
    public static final C0360Uh b;
    public static final D3 d;
    public static D3 e = null;
    public static boolean q = false;
    public static Method r = null;
    public static boolean s = false;
    public static Field t;
    public static InterfaceC2994lL u;
    public static OpenVPNService v;
    public static final Object a = new Object();
    public static final C0108Fk c = new C0108Fk(15);
    public static final byte[] f = {48, 49, 53, 0};
    public static final byte[] g = {48, 49, 48, 0};
    public static final byte[] h = {48, 48, 57, 0};
    public static final byte[] i = {48, 48, 53, 0};
    public static final byte[] j = {48, 48, 49, 0};
    public static final byte[] k = {48, 48, 49, 0};
    public static final byte[] l = {48, 48, 50, 0};
    public static final C3337ri m = new C3337ri("NO_THREAD_ELEMENTS", 3);
    public static final C0030Ba n = new C0030Ba(6);
    public static final C0030Ba o = new C0030Ba(7);
    public static final C0030Ba p = new C0030Ba(8);

    static {
        int i2 = 12;
        b = new C0360Uh(i2);
        Object obj = null;
        d = new D3(obj, obj, obj, i2);
    }

    public static TypedArray A(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r5 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r5 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void D(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.Object r0 = defpackage.AbstractC0136He.a
            monitor-enter(r0)
            java.lang.String r1 = ""
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L14
            java.lang.String r6 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r5.deleteFile(r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r5 = move-exception
            goto L60
        L14:
            java.lang.String r1 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r2 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r1, r2)     // Catch: java.lang.Throwable -> L12 java.io.FileNotFoundException -> L57
            org.xmlpull.v1.XmlSerializer r1 = android.util.Xml.newSerializer()     // Catch: java.lang.Throwable -> L12
            r2 = 0
            r1.setOutput(r5, r2)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "UTF-8"
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r1.startDocument(r3, r4)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "locales"
            r1.startTag(r2, r3)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "application_locales"
            r1.attribute(r2, r3, r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r6 = "locales"
            r1.endTag(r2, r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r1.endDocument()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            if (r5 == 0) goto L4f
        L3e:
            r5.close()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L4f
            goto L4f
        L42:
            r6 = move-exception
            goto L51
        L44:
            r6 = move-exception
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = "Storing App Locales : Failed to persist app-locales in storage "
            android.util.Log.w(r1, r2, r6)     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L4f
            goto L3e
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L51:
            if (r5 == 0) goto L56
            r5.close()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L56
        L56:
            throw r6     // Catch: java.lang.Throwable -> L12
        L57:
            java.lang.String r5 = "AppLocalesStorageHelper"
            java.lang.String r6 = "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing "
            android.util.Log.w(r5, r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L60:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0136He.D(android.content.Context, java.lang.String):void");
    }

    public static void E(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = (Animator) arrayList.get(i2);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String F(android.content.Context r8) {
        /*
            java.lang.Object r0 = defpackage.AbstractC0136He.a
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L6a
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
        L18:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            r6 = 1
            if (r5 == r6) goto L44
            r6 = 3
            if (r5 != r6) goto L2b
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            if (r7 <= r4) goto L44
            goto L2b
        L29:
            r8 = move-exception
            goto L64
        L2b:
            if (r5 == r6) goto L18
            r6 = 4
            if (r5 != r6) goto L31
            goto L18
        L31:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            if (r5 == 0) goto L18
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
        L44:
            if (r2 == 0) goto L56
        L46:
            r2.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L56
            goto L56
        L4a:
            r8 = move-exception
            goto L6c
        L4c:
            java.lang.String r3 = "AppLocalesStorageHelper"
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r3, r4)     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L56
            goto L46
        L56:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L5d
            goto L62
        L5d:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r2)     // Catch: java.lang.Throwable -> L4a
        L62:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L64:
            if (r2 == 0) goto L69
            r2.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L69
        L69:
            throw r8     // Catch: java.lang.Throwable -> L4a
        L6a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L6c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0136He.F(android.content.Context):java.lang.String");
    }

    public static final Object G(Object obj) {
        return obj instanceof C0217Ma ? AbstractC0115Ga.n(((C0217Ma) obj).a) : obj;
    }

    public static final void H(InterfaceC0168Jc interfaceC0168Jc, Object obj) {
        if (obj == m) {
            return;
        }
        if (!(obj instanceof TI)) {
            Object objFold = interfaceC0168Jc.fold(null, o);
            AbstractC0500aq.k(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            Vs.u(objFold);
            throw null;
        }
        TI ti = (TI) obj;
        QI[] qiArr = ti.b;
        int length = qiArr.length - 1;
        if (length < 0) {
            return;
        }
        QI qi = qiArr[length];
        AbstractC0500aq.j(null);
        Object obj2 = ti.a[length];
        throw null;
    }

    public static Object I(InterfaceC3396sn interfaceC3396sn) throws Throwable {
        C0021Ai c0021Ai = C0021Ai.a;
        Thread threadCurrentThread = Thread.currentThread();
        C3397so c3397so = C3397so.b;
        AbstractC2627ej abstractC2627ejA = RI.a();
        InterfaceC0168Jc interfaceC0168JcP = MO.p(c0021Ai, abstractC2627ejA, true);
        C0545bg c0545bg = AbstractC0600ch.a;
        if (interfaceC0168JcP != c0545bg && interfaceC0168JcP.get(c3397so) == null) {
            interfaceC0168JcP = interfaceC0168JcP.plus(c0545bg);
        }
        C7 c7 = new C7(interfaceC0168JcP, threadCurrentThread, abstractC2627ejA);
        c7.U(EnumC0355Uc.a, c7, interfaceC3396sn);
        AbstractC2627ej abstractC2627ej = c7.e;
        if (abstractC2627ej != null) {
            int i2 = AbstractC2627ej.f;
            abstractC2627ej.j(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jK = abstractC2627ej != null ? abstractC2627ej.k() : Long.MAX_VALUE;
                if (c7.isCompleted()) {
                    if (abstractC2627ej != null) {
                        int i3 = AbstractC2627ej.f;
                        abstractC2627ej.h(false);
                    }
                    Object objS = AbstractC2883jK.S(C0267Oq.a.get(c7));
                    C0217Ma c0217Ma = objS instanceof C0217Ma ? (C0217Ma) objS : null;
                    if (c0217Ma == null) {
                        return objS;
                    }
                    throw c0217Ma.a;
                }
                LockSupport.parkNanos(c7, jK);
            } catch (Throwable th) {
                if (abstractC2627ej != null) {
                    int i4 = AbstractC2627ej.f;
                    abstractC2627ej.h(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c7.m(interruptedException);
        throw interruptedException;
    }

    public static void K(Spinner spinner, String str) {
        String str2 = (String) spinner.getSelectedItem();
        if (str2 == null || !str.equals(str2)) {
            ArrayAdapter arrayAdapter = (ArrayAdapter) spinner.getAdapter();
            int count = arrayAdapter.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                if (str.equals(arrayAdapter.getItem(i2))) {
                    try {
                        spinner.setSelection(i2);
                    } catch (IndexOutOfBoundsException unused) {
                        spinner.setSelection(0);
                    }
                }
            }
        }
    }

    public static void L(Spinner spinner, String[] strArr) {
        ArrayAdapter arrayAdapter;
        if (strArr == null || (arrayAdapter = (ArrayAdapter) spinner.getAdapter()) == null) {
            return;
        }
        int count = arrayAdapter.getCount();
        String[] strArr2 = new String[count];
        for (int i2 = 0; i2 < count; i2++) {
            strArr2[i2] = (String) arrayAdapter.getItem(i2);
        }
    }

    public static final Object M(InterfaceC0168Jc interfaceC0168Jc) {
        Object objFold = interfaceC0168Jc.fold(0, n);
        AbstractC0500aq.j(objFold);
        return objFold;
    }

    public static D3 N(Object obj) {
        return new D3(obj.getClass().getSimpleName());
    }

    public static final String O(byte b2) {
        return b2 == 1 ? "quotation mark '\"'" : b2 == 2 ? "string escape sequence '\\'" : b2 == 4 ? "comma ','" : b2 == 5 ? "colon ':'" : b2 == 6 ? "start of the object '{'" : b2 == 7 ? "end of the object '}'" : b2 == 8 ? "start of the array '['" : b2 == 9 ? "end of the array ']'" : b2 == 10 ? "end of the input" : b2 == 127 ? "invalid token" : "valid token";
    }

    public static final Object P(InterfaceC0168Jc interfaceC0168Jc, Object obj) {
        if (obj == null) {
            obj = M(interfaceC0168Jc);
        }
        if (obj == 0) {
            return m;
        }
        if (obj instanceof Integer) {
            return interfaceC0168Jc.fold(new TI(((Number) obj).intValue(), interfaceC0168Jc), p);
        }
        Vs.u(obj);
        throw null;
    }

    public static void Q(String str) {
        Log.v("RootBeer", t() + String.valueOf(str));
    }

    public static boolean R(int i2, int i3, int i4, int i5) {
        return (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2)) || (i5 == 1 || i5 == 2 || (i5 == 4 && i3 != 2));
    }

    public static final Object S(InterfaceC0168Jc interfaceC0168Jc, InterfaceC3396sn interfaceC3396sn, InterfaceC3493uc interfaceC3493uc) throws Throwable {
        Object objS;
        InterfaceC0168Jc context = interfaceC3493uc.getContext();
        InterfaceC0168Jc interfaceC0168JcPlus = !((Boolean) interfaceC0168Jc.fold(Boolean.FALSE, new C0030Ba(2))).booleanValue() ? context.plus(interfaceC0168Jc) : MO.p(context, interfaceC0168Jc, false);
        AbstractC3296qu.q(interfaceC0168JcPlus);
        if (interfaceC0168JcPlus == context) {
            TD td = new TD(interfaceC3493uc, interfaceC0168JcPlus);
            objS = AbstractC2883jK.M(td, td, interfaceC3396sn);
        } else {
            C3397so c3397so = C3397so.b;
            if (AbstractC0500aq.b(interfaceC0168JcPlus.get(c3397so), context.get(c3397so))) {
                AK ak = new AK(interfaceC3493uc, interfaceC0168JcPlus);
                InterfaceC0168Jc interfaceC0168Jc2 = ak.c;
                Object objP = P(interfaceC0168Jc2, null);
                try {
                    Object objM = AbstractC2883jK.M(ak, ak, interfaceC3396sn);
                    H(interfaceC0168Jc2, objP);
                    objS = objM;
                } catch (Throwable th) {
                    H(interfaceC0168Jc2, objP);
                    throw th;
                }
            } else {
                C0491ah c0491ah = new C0491ah(interfaceC3493uc, interfaceC0168JcPlus);
                try {
                    AbstractC0500aq.V(AbstractC0069Df.C(AbstractC0069Df.i(c0491ah, interfaceC3396sn, c0491ah)), DK.a);
                    while (true) {
                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0491ah.e;
                        int i2 = atomicIntegerFieldUpdater.get(c0491ah);
                        if (i2 != 0) {
                            if (i2 != 2) {
                                throw new IllegalStateException("Already suspended".toString());
                            }
                            objS = AbstractC2883jK.S(C0267Oq.a.get(c0491ah));
                            if (objS instanceof C0217Ma) {
                                throw ((C0217Ma) objS).a;
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(c0491ah, 0, 1)) {
                            objS = EnumC0321Sc.a;
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    c0491ah.resumeWith(AbstractC0115Ga.n(th2));
                    throw th2;
                }
            }
        }
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        return objS;
    }

    public static final C3385sc a(InterfaceC0168Jc interfaceC0168Jc) {
        if (interfaceC0168Jc.get(C0108Fk.e) == null) {
            interfaceC0168Jc = interfaceC0168Jc.plus(new C0063Cq(null));
        }
        return new C3385sc(interfaceC0168Jc);
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0535 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0695 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x06e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x06fd A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(defpackage.C2620ec r36, defpackage.C2855is r37, java.util.ArrayList r38, int r39) {
        /*
            Method dump skipped, instructions count: 1803
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0136He.b(ec, is, java.util.ArrayList, int):void");
    }

    public static C3172og c(InterfaceC0304Rc interfaceC0304Rc, InterfaceC3396sn interfaceC3396sn) {
        C0021Ai c0021Ai = C0021Ai.a;
        EnumC0355Uc enumC0355Uc = EnumC0355Uc.a;
        InterfaceC0168Jc interfaceC0168JcZ = MO.z(interfaceC0304Rc, c0021Ai);
        EnumC0355Uc enumC0355Uc2 = EnumC0355Uc.a;
        C3172og c3172og = new C3172og(interfaceC0168JcZ, true);
        c3172og.U(enumC0355Uc, c3172og, interfaceC3396sn);
        return c3172og;
    }

    public static final byte d(char c2) {
        if (c2 < '~') {
            return C2982l9.b[c2];
        }
        return (byte) 0;
    }

    public static void e(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void f(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final Object h(InterfaceC3396sn interfaceC3396sn, InterfaceC3493uc interfaceC3493uc) throws Throwable {
        TD td = new TD(interfaceC3493uc, interfaceC3493uc.getContext());
        Object objM = AbstractC2883jK.M(td, td, interfaceC3396sn);
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        return objM;
    }

    public static C3639xD i(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            C3639xD c3639xD = new C3639xD();
            new LinkedHashMap();
            c3639xD.a = new C2811i1(C0072Di.a);
            return c3639xD;
        }
        ClassLoader classLoader = C3639xD.class.getClassLoader();
        AbstractC0500aq.j(classLoader);
        bundle.setClassLoader(classLoader);
        C3780zt c3780zt = new C3780zt(bundle.size());
        for (String str : bundle.keySet()) {
            AbstractC0500aq.j(str);
            c3780zt.put(str, bundle.get(str));
        }
        c3780zt.c();
        c3780zt.s = true;
        if (c3780zt.o <= 0) {
            c3780zt = C3780zt.t;
            AbstractC0500aq.k(c3780zt, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        }
        C3639xD c3639xD2 = new C3639xD();
        new LinkedHashMap();
        c3639xD2.a = new C2811i1(c3780zt);
        return c3639xD2;
    }

    public static final byte[] j(String str) {
        int i2;
        byte b2;
        int i3;
        byte b3;
        int i4;
        byte b4;
        int i5;
        byte b5;
        int i6 = 0;
        byte[] bArr = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        while (i6 < length) {
            while (true) {
                i2 = i6 + 1;
                b2 = bArr[bytes[i6]];
                if (i2 >= length || b2 != -1) {
                    break;
                }
                i6 = i2;
            }
            if (b2 == -1) {
                break;
            }
            while (true) {
                i3 = i2 + 1;
                b3 = bArr[bytes[i2]];
                if (i3 >= length || b3 != -1) {
                    break;
                }
                i2 = i3;
            }
            if (b3 == -1) {
                break;
            }
            byteArrayOutputStream.write((b2 << 2) | ((b3 & 48) >>> 4));
            while (true) {
                i4 = i3 + 1;
                byte b6 = bytes[i3];
                if (b6 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                b4 = bArr[b6];
                if (i4 >= length || b4 != -1) {
                    break;
                }
                i3 = i4;
            }
            if (b4 == -1) {
                break;
            }
            byteArrayOutputStream.write(((b3 & 15) << 4) | ((b4 & 60) >>> 2));
            while (true) {
                i5 = i4 + 1;
                byte b7 = bytes[i4];
                if (b7 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                b5 = bArr[b7];
                if (i5 >= length || b5 != -1) {
                    break;
                }
                i4 = i5;
            }
            if (b5 == -1) {
                break;
            }
            byteArrayOutputStream.write(b5 | ((b4 & 3) << 6));
            i6 = i5;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static final Object k(long j2, InterfaceC3493uc interfaceC3493uc) {
        DK dk = DK.a;
        if (j2 <= 0) {
            return dk;
        }
        B8 b8 = new B8(1, AbstractC0069Df.C(interfaceC3493uc));
        b8.s();
        if (j2 < Long.MAX_VALUE) {
            q(b8.e).b(j2, b8);
        }
        Object objR = b8.r();
        return objR == EnumC0321Sc.a ? objR : dk;
    }

    public static boolean l(View view, KeyEvent keyEvent) {
        WeakReference weakReference;
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = UL.a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = TL.d;
        TL tl = (TL) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (tl == null) {
            tl = new TL();
            tl.a = null;
            tl.b = null;
            tl.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, tl);
        }
        WeakReference weakReference2 = tl.c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        tl.c = new WeakReference(keyEvent);
        if (tl.b == null) {
            tl.b = new SparseArray();
        }
        SparseArray sparseArray = tl.b;
        if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) < 0) {
            weakReference = null;
        } else {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        Vs.u(arrayList.get(size));
        throw null;
    }

    public static boolean m(InterfaceC3128nr interfaceC3128nr, View view, Window.Callback callback, KeyEvent keyEvent) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (interfaceC3128nr == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return interfaceC3128nr.superDispatchKeyEvent(keyEvent);
        }
        if (!(callback instanceof Activity)) {
            if (!(callback instanceof Dialog)) {
                return (view != null && UL.b(view, keyEvent)) || interfaceC3128nr.superDispatchKeyEvent(keyEvent);
            }
            Dialog dialog = (Dialog) callback;
            if (!s) {
                try {
                    Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                    t = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                s = true;
            }
            Field field = t;
            if (field != null) {
                try {
                    onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                } catch (IllegalAccessException unused2) {
                }
            } else {
                onKeyListener = null;
            }
            if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            Window window = dialog.getWindow();
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (UL.b(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
        }
        Activity activity = (Activity) callback;
        activity.onUserInteraction();
        Window window2 = activity.getWindow();
        if (window2.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                if (!q) {
                    try {
                        r = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused3) {
                    }
                    q = true;
                }
                Method method = r;
                if (method != null) {
                    try {
                        Object objInvoke = method.invoke(actionBar, keyEvent);
                        if (objInvoke != null) {
                            zBooleanValue = ((Boolean) objInvoke).booleanValue();
                        }
                    } catch (IllegalAccessException | InvocationTargetException unused4) {
                    }
                }
                if (zBooleanValue) {
                    return true;
                }
            }
        }
        if (window2.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window2.getDecorView();
        if (UL.b(decorView2, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView2 != null ? decorView2.getKeyDispatcherState() : null, activity);
    }

    public static void n(Serializable serializable) {
        Log.e("RootBeer", t() + String.valueOf(serializable));
        Log.e("QLog", t() + String.valueOf(serializable));
    }

    public static String o(String str) {
        try {
            return URLEncoder.encode(str, Deobfuscator$MHRTUNNELVPN$app.getString(-74474085118906L)) + Deobfuscator$MHRTUNNELVPN$app.getString(-74499854922682L);
        } catch (UnsupportedEncodingException e2) {
            Log.e(Deobfuscator$MHRTUNNELVPN$app.getString(-74525624726458L), Deobfuscator$MHRTUNNELVPN$app.getString(-74590049235898L), e2);
            return null;
        }
    }

    public static YM p(C2566dc c2566dc, int i2, ArrayList arrayList, YM ym) {
        C0167Jb c0167Jb;
        int i3;
        int i4 = i2 == 0 ? c2566dc.m0 : c2566dc.n0;
        if (i4 != -1 && (ym == null || i4 != ym.b)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                YM ym2 = (YM) arrayList.get(i5);
                if (ym2.b == i4) {
                    if (ym != null) {
                        ym.c(i2, ym2);
                        arrayList.remove(ym);
                    }
                    ym = ym2;
                } else {
                    i5++;
                }
            }
        } else if (i4 != -1) {
            return ym;
        }
        if (ym == null) {
            if (c2566dc instanceof AbstractC3775zo) {
                AbstractC3775zo abstractC3775zo = (AbstractC3775zo) c2566dc;
                int i6 = 0;
                while (true) {
                    if (i6 >= abstractC3775zo.q0) {
                        i3 = -1;
                        break;
                    }
                    C2566dc c2566dc2 = abstractC3775zo.p0[i6];
                    if ((i2 == 0 && (i3 = c2566dc2.m0) != -1) || (i2 == 1 && (i3 = c2566dc2.n0) != -1)) {
                        break;
                    }
                    i6++;
                }
                if (i3 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        YM ym3 = (YM) arrayList.get(i7);
                        if (ym3.b == i3) {
                            ym = ym3;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (ym == null) {
                ym = new YM();
                ym.a = new ArrayList();
                ym.d = null;
                ym.e = -1;
                int i8 = YM.f;
                YM.f = i8 + 1;
                ym.b = i8;
                ym.c = i2;
            }
            arrayList.add(ym);
        }
        ArrayList arrayList2 = ym.a;
        if (!arrayList2.contains(c2566dc)) {
            arrayList2.add(c2566dc);
            if (c2566dc instanceof C2905jo) {
                C2905jo c2905jo = (C2905jo) c2566dc;
                c2905jo.s0.c(c2905jo.t0 == 0 ? 1 : 0, ym, arrayList);
            }
            int i9 = ym.b;
            if (i2 == 0) {
                c2566dc.m0 = i9;
                c2566dc.H.c(i2, ym, arrayList);
                c0167Jb = c2566dc.J;
            } else {
                c2566dc.n0 = i9;
                c2566dc.I.c(i2, ym, arrayList);
                c2566dc.L.c(i2, ym, arrayList);
                c0167Jb = c2566dc.K;
            }
            c0167Jb.c(i2, ym, arrayList);
            c2566dc.O.c(i2, ym, arrayList);
        }
        return ym;
    }

    public static final InterfaceC3227pg q(InterfaceC0168Jc interfaceC0168Jc) {
        InterfaceC0134Hc interfaceC0134Hc = interfaceC0168Jc.get(C3397so.b);
        InterfaceC3227pg interfaceC3227pg = interfaceC0134Hc instanceof InterfaceC3227pg ? (InterfaceC3227pg) interfaceC0134Hc : null;
        return interfaceC3227pg == null ? AbstractC0188Kf.a : interfaceC3227pg;
    }

    public static N2 r(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i2) {
        N2 n2C;
        if (v(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i2, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return new N2(null, null, typedValue.data);
            }
            try {
                n2C = N2.c(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme);
            } catch (Exception e2) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
                n2C = null;
            }
            if (n2C != null) {
                return n2C;
            }
        }
        return new N2(null, null, 0);
    }

    public static String s(TypedArray typedArray, XmlResourceParser xmlResourceParser, String str, int i2) {
        if (v(xmlResourceParser, str)) {
            return typedArray.getString(i2);
        }
        return null;
    }

    public static String t() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[2].getMethodName();
        String className = stackTrace[2].getClassName();
        int lineNumber = stackTrace[2].getLineNumber();
        return className.substring(className.lastIndexOf(46) + 1) + ": " + methodName + "() [" + lineNumber + "] - ";
    }

    public static boolean v(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static boolean w(String str) {
        if (str == null) {
            return false;
        }
        return str.endsWith(Deobfuscator$MHRTUNNELVPN$app.getString(-74422545511354L)) || str.endsWith(Deobfuscator$MHRTUNNELVPN$app.getString(-74448315315130L));
    }

    public static void x(File file) throws Exception {
        int i2;
        String[] strArr;
        int i3;
        int i4;
        int i5 = 0;
        do {
            String name = file.getName();
            String[] strArr2 = {"ps -ef", "ps -A", "toolbox ps"};
            int i6 = 0;
            while (true) {
                if (i6 >= 3) {
                    i2 = -1;
                    break;
                }
                Process processExec = Runtime.getRuntime().exec(strArr2[i6]);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        if (!line.contains("PID") && line.contains(name)) {
                            String[] strArrSplit = line.split("\\s+");
                            try {
                                try {
                                    i2 = Integer.parseInt(strArrSplit[1]);
                                } finally {
                                    try {
                                        processExec.destroy();
                                    } catch (Exception unused) {
                                    }
                                }
                            } catch (NumberFormatException unused2) {
                                i2 = Integer.parseInt(strArrSplit[0]);
                            }
                            try {
                                break;
                            } catch (Exception unused3) {
                            }
                        }
                    }
                }
                i6++;
            }
        } while (i5 <= 4);
        throw new Exception("Cannot kill: " + file.getAbsolutePath());
        try {
            Runtime.getRuntime().exec(strArr[i3] + "killall -9 " + file.getCanonicalPath());
        } catch (IOException unused4) {
        }
        if (i2 == -1) {
            return;
        }
        i5++;
        String strValueOf = String.valueOf(i2);
        strArr = new String[]{"", "busybox ", "toolbox "};
        for (i3 = 0; i3 < 3; i3++) {
            try {
                Runtime.getRuntime().exec(strArr[i3] + "killall -9 " + file.getName());
            } catch (IOException unused5) {
            }
            Runtime.getRuntime().exec(strArr[i3] + "killall -9 " + file.getCanonicalPath());
        }
        String[] strArr3 = {"", "toolbox ", "busybox "};
        for (i4 = 0; i4 < 3; i4++) {
            try {
                Runtime.getRuntime().exec(strArr3[i4] + "kill -9 " + strValueOf);
            } catch (IOException unused6) {
            }
        }
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException unused7) {
        }
    }

    public static QG y(InterfaceC0304Rc interfaceC0304Rc, InterfaceC3396sn interfaceC3396sn) {
        C0021Ai c0021Ai = C0021Ai.a;
        EnumC0355Uc enumC0355Uc = EnumC0355Uc.a;
        InterfaceC0168Jc interfaceC0168JcZ = MO.z(interfaceC0304Rc, c0021Ai);
        EnumC0355Uc enumC0355Uc2 = EnumC0355Uc.a;
        QG qg = new QG(interfaceC0168JcZ, true);
        qg.U(enumC0355Uc, qg, interfaceC3396sn);
        return qg;
    }

    public static int z(int i2, RoundingMode roundingMode) {
        if (i2 <= 0) {
            throw new IllegalArgumentException(Vs.l(i2, "x (", ") must be > 0"));
        }
        switch (AbstractC0232Mp.a[roundingMode.ordinal()]) {
            case 1:
                if (!((i2 > 0) & (((i2 + (-1)) & i2) == 0))) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i2 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i2);
                return (31 - iNumberOfLeadingZeros) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros) - i2))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i2);
    }

    public abstract void B(Throwable th);

    public abstract void C(C3532vE c3532vE);

    public abstract void J(Object obj, float f2);

    public abstract float u(Object obj);
}
