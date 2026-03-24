package defpackage;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.app.Application;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.view.ActionMode;
import android.widget.TextView;
import com.google.android.gms.common.util.ProcessUtils;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* renamed from: qu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3296qu implements InterfaceC2940kM {
    public static final Object[] a = new Object[0];
    public static final String[] b = {"standard", "accelerate", "decelerate", "linear"};
    public static final C0360Uh c = new C0360Uh(17);
    public static final boolean[] d = new boolean[3];
    public static final C0108Fk e = new C0108Fk(25);
    public static final C3397so f = new C3397so(25);
    public static final C0360Uh g = new C0360Uh(26);
    public static final Object h = new Object();
    public static char[] i = new char[24];

    public static Jz A(Context context) {
        Object next;
        String myProcessName;
        AbstractC0500aq.m(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = v(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Jz) next).b == iMyPid) {
                break;
            }
        }
        Jz jz = (Jz) next;
        if (jz == null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 > 33) {
                myProcessName = Process.myProcessName();
                AbstractC0500aq.l(myProcessName, "myProcessName(...)");
            } else if ((i2 < 28 || (myProcessName = Application.getProcessName()) == null) && (myProcessName = ProcessUtils.getMyProcessName()) == null) {
                myProcessName = "";
            }
            jz = new Jz(myProcessName, iMyPid, 0, false);
        }
        return jz;
    }

    public static final AD B(InterfaceC2722gM interfaceC2722gM) {
        AbstractC0500aq.m(interfaceC2722gM, "<this>");
        C0360Uh c0360Uh = new C0360Uh(25);
        AbstractC0424Yd defaultViewModelCreationExtras = interfaceC2722gM instanceof InterfaceC3235po ? ((InterfaceC3235po) interfaceC2722gM).getDefaultViewModelCreationExtras() : C0407Xd.b;
        AbstractC0500aq.m(defaultViewModelCreationExtras, "extras");
        C2667fM viewModelStore = interfaceC2722gM.getViewModelStore();
        AbstractC0500aq.m(viewModelStore, "store");
        return (AD) new C3532vE(viewModelStore, c0360Uh, defaultViewModelCreationExtras).e(PB.a(AD.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final ZD C(Object obj) {
        if (obj != AbstractC2883jK.a) {
            return (ZD) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C2698fz D(android.widget.TextView r7) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L10
            fz r0 = new fz
            android.text.PrecomputedText$Params r7 = defpackage.AbstractC2897jg.k(r7)
            r0.<init>(r7)
            return r0
        L10:
            android.text.TextPaint r2 = new android.text.TextPaint
            android.text.TextPaint r3 = r7.getPaint()
            r2.<init>(r3)
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            int r3 = r7.getBreakStrategy()
            int r4 = r7.getHyphenationFrequency()
            android.text.method.TransformationMethod r5 = r7.getTransformationMethod()
            boolean r5 = r5 instanceof android.text.method.PasswordTransformationMethod
            if (r5 == 0) goto L2e
        L2b:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.LTR
            goto L75
        L2e:
            r5 = 1
            r6 = 0
            if (r0 < r1) goto L59
            int r0 = r7.getInputType()
            r0 = r0 & 15
            r1 = 3
            if (r0 != r1) goto L59
            java.util.Locale r7 = r7.getTextLocale()
            android.icu.text.DecimalFormatSymbols r7 = defpackage.AbstractC3600wb.e(r7)
            java.lang.String[] r7 = defpackage.AbstractC2897jg.c(r7)
            r7 = r7[r6]
            int r7 = r7.codePointAt(r6)
            byte r7 = java.lang.Character.getDirectionality(r7)
            if (r7 == r5) goto L56
            r0 = 2
            if (r7 != r0) goto L2b
        L56:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.RTL
            goto L75
        L59:
            int r0 = r7.getLayoutDirection()
            if (r0 != r5) goto L60
            goto L61
        L60:
            r5 = r6
        L61:
            int r7 = r7.getTextDirection()
            switch(r7) {
                case 2: goto L73;
                case 3: goto L2b;
                case 4: goto L56;
                case 5: goto L70;
                case 6: goto L6d;
                case 7: goto L6a;
                default: goto L68;
            }
        L68:
            if (r5 == 0) goto L6d
        L6a:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L75
        L6d:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            goto L75
        L70:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.LOCALE
            goto L75
        L73:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.ANYRTL_LTR
        L75:
            fz r0 = new fz
            r0.<init>(r2, r7, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3296qu.D(android.widget.TextView):fz");
    }

    public static final int E(C0569c4 c0569c4, Object obj, int i2) {
        AbstractC0500aq.m(c0569c4, "<this>");
        int i3 = c0569c4.c;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iD = AbstractC0115Ga.d(c0569c4.a, c0569c4.c, i2);
            if (iD < 0 || AbstractC0500aq.b(obj, c0569c4.b[iD])) {
                return iD;
            }
            int i4 = iD + 1;
            while (i4 < i3 && c0569c4.a[i4] == i2) {
                if (AbstractC0500aq.b(obj, c0569c4.b[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iD - 1; i5 >= 0 && c0569c4.a[i5] == i2; i5--) {
                if (AbstractC0500aq.b(obj, c0569c4.b[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final InterfaceC2680fh F(InterfaceC0029Aq interfaceC0029Aq, boolean z, AbstractC0114Fq abstractC0114Fq) {
        return interfaceC0029Aq instanceof C0267Oq ? ((C0267Oq) interfaceC0029Aq).C(z, abstractC0114Fq) : interfaceC0029Aq.invokeOnCompletion(abstractC0114Fq.j(), z, new C0097Eq(1, abstractC0114Fq, AbstractC0114Fq.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    public static final boolean G(Object obj) {
        return obj == AbstractC2883jK.a;
    }

    public static boolean H(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static String I(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i2 = 0;
        for (int i3 = 0; i3 < objArr.length; i3++) {
            Object obj = objArr[i3];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e2) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e2);
                    StringBuilder sbO = AbstractC3264qG.o("<", str2, " threw ");
                    sbO.append(e2.getClass().getName());
                    sbO.append(">");
                    string = sbO.toString();
                }
            }
            objArr[i3] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i4 = 0;
        while (i2 < objArr.length && (iIndexOf = str.indexOf("%s", i4)) != -1) {
            sb.append((CharSequence) str, i4, iIndexOf);
            sb.append(objArr[i2]);
            i4 = iIndexOf + 2;
            i2++;
        }
        sb.append((CharSequence) str, i4, str.length());
        if (i2 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i2]);
            for (int i5 = i2 + 1; i5 < objArr.length; i5++) {
                sb.append(", ");
                sb.append(objArr[i5]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static Typeface J(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, MO.h(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    public static int M(char[] cArr, int i2, char c2, int i3, boolean z, int i4) {
        int i5;
        if (!z && i2 <= 0) {
            return i3;
        }
        if ((!z || i4 < 3) && i2 <= 99) {
            i5 = i3;
        } else {
            int i6 = i2 / 100;
            cArr[i3] = (char) (i6 + 48);
            i5 = i3 + 1;
            i2 -= i6 * 100;
        }
        if ((z && i4 >= 2) || i2 > 9 || i3 != i5) {
            int i7 = i2 / 10;
            cArr[i5] = (char) (i7 + 48);
            i5++;
            i2 -= i7 * 10;
        }
        cArr[i5] = (char) (i2 + 48);
        cArr[i5 + 1] = c2;
        return i5 + 2;
    }

    public static byte[] N(InputStream inputStream, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i3, i2 - i3);
            if (i4 < 0) {
                throw new IllegalStateException(Vs.k(i2, "Not enough bytes to read: "));
            }
            i3 += i4;
        }
        return bArr;
    }

    public static byte[] O(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int i5 = fileInputStream.read(bArr2);
                if (i5 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, i5);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i3 - iInflate);
                    i4 += i5;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            if (i4 == i2) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } finally {
            inflater.end();
        }
    }

    public static long P(InputStream inputStream, int i2) {
        byte[] bArrN = N(inputStream, i2);
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j += (bArrN[i3] & 255) << (i3 * 8);
        }
        return j;
    }

    public static void Q(TextView textView, int i2) {
        AbstractC0136He.f(i2);
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC2897jg.n(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void R(TextView textView, int i2) {
        AbstractC0136He.f(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static void S(TextView textView, int i2) {
        AbstractC0136He.f(i2);
        if (i2 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i2 - r0, 1.0f);
        }
    }

    public static final Object[] T(Collection collection) {
        AbstractC0500aq.m(collection, "collection");
        int size = collection.size();
        Object[] objArr = a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArrCopyOf[i2] = it.next();
            if (i3 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            } else if (!it.hasNext()) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i3);
                AbstractC0500aq.l(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
            i2 = i3;
        }
    }

    public static final Object[] U(Collection collection, Object[] objArr) throws NegativeArraySizeException {
        Object[] objArrCopyOf;
        AbstractC0500aq.m(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArrCopyOf = objArr;
        } else {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            AbstractC0500aq.k(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf = (Object[]) objNewInstance;
        }
        while (true) {
            int i3 = i2 + 1;
            objArrCopyOf[i2] = it.next();
            if (i3 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            } else if (!it.hasNext()) {
                if (objArrCopyOf == objArr) {
                    objArr[i3] = null;
                    return objArr;
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i3);
                AbstractC0500aq.l(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
            i2 = i3;
        }
    }

    public static ActionMode.Callback W(ActionMode.Callback callback) {
        return (!(callback instanceof MI) || Build.VERSION.SDK_INT < 26) ? callback : ((MI) callback).a;
    }

    public static ActionMode.Callback X(ActionMode.Callback callback, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof MI) || callback == null) ? callback : new MI(callback, textView);
    }

    public static void Z(ByteArrayOutputStream byteArrayOutputStream, long j, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void a0(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        Z(byteArrayOutputStream, i2, 2);
    }

    public static Object d(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(defpackage.UI r4, defpackage.InterfaceC3504un r5, java.lang.Throwable r6, defpackage.InterfaceC3493uc r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C3287ql
            if (r0 == 0) goto L13
            r0 = r7
            ql r0 = (defpackage.C3287ql) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ql r0 = new ql
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Throwable r6 = r0.a
            defpackage.AbstractC0115Ga.U(r7)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r4 = move-exception
            goto L44
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.AbstractC0115Ga.U(r7)
            r0.a = r6     // Catch: java.lang.Throwable -> L29
            r0.c = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r5.b(r4, r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L41
            goto L43
        L41:
            DK r1 = defpackage.DK.a
        L43:
            return r1
        L44:
            if (r6 == 0) goto L4b
            if (r6 == r4) goto L4b
            defpackage.MO.a(r4, r6)
        L4b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3296qu.e(UI, un, java.lang.Throwable, uc):java.lang.Object");
    }

    public static final void f(C0569c4 c0569c4, int i2) {
        AbstractC0500aq.m(c0569c4, "<this>");
        c0569c4.a = new int[i2];
        c0569c4.b = new Object[i2];
    }

    public static C3201p8 g(C3172og c3172og) {
        return AbstractC0115Ga.x(new C2947kb(1, c3172og, "Deferred.asListenableFuture"));
    }

    public static void i(C2620ec c2620ec, C2855is c2855is, C2566dc c2566dc) {
        c2566dc.n = -1;
        c2566dc.o = -1;
        int i2 = c2620ec.o0[0];
        int[] iArr = c2566dc.o0;
        if (i2 != 2 && iArr[0] == 4) {
            C0167Jb c0167Jb = c2566dc.H;
            int i3 = c0167Jb.g;
            int iN = c2620ec.n();
            C0167Jb c0167Jb2 = c2566dc.J;
            int i4 = iN - c0167Jb2.g;
            c0167Jb.i = c2855is.k(c0167Jb);
            c0167Jb2.i = c2855is.k(c0167Jb2);
            c2855is.d(c0167Jb.i, i3);
            c2855is.d(c0167Jb2.i, i4);
            c2566dc.n = 2;
            c2566dc.X = i3;
            int i5 = i4 - i3;
            c2566dc.T = i5;
            int i6 = c2566dc.a0;
            if (i5 < i6) {
                c2566dc.T = i6;
            }
        }
        if (c2620ec.o0[1] == 2 || iArr[1] != 4) {
            return;
        }
        C0167Jb c0167Jb3 = c2566dc.I;
        int i7 = c0167Jb3.g;
        int iK = c2620ec.k();
        C0167Jb c0167Jb4 = c2566dc.K;
        int i8 = iK - c0167Jb4.g;
        c0167Jb3.i = c2855is.k(c0167Jb3);
        c0167Jb4.i = c2855is.k(c0167Jb4);
        c2855is.d(c0167Jb3.i, i7);
        c2855is.d(c0167Jb4.i, i8);
        if (c2566dc.Z > 0 || c2566dc.f0 == 8) {
            C0167Jb c0167Jb5 = c2566dc.L;
            C3318rG c3318rGK = c2855is.k(c0167Jb5);
            c0167Jb5.i = c3318rGK;
            c2855is.d(c3318rGK, c2566dc.Z + i7);
        }
        c2566dc.o = 2;
        c2566dc.Y = i7;
        int i9 = i8 - i7;
        c2566dc.U = i9;
        int i10 = c2566dc.b0;
        if (i9 < i10) {
            c2566dc.U = i10;
        }
    }

    public static int j(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        String strPermissionToOp = AppOpsManager.permissionToOp(str);
        if (strPermissionToOp != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int iMyUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                if (iNoteProxyOpNoThrow == 0) {
                    iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, N3.a(context)) : 1;
                }
            } else {
                iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
            }
            if (iNoteProxyOpNoThrow != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static byte[] k(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static C0319Sa l(String str, String str2) {
        C3254q6 c3254q6 = new C3254q6(str, str2);
        C0302Ra c0302RaB = C0319Sa.b(C3254q6.class);
        c0302RaB.e = 1;
        c0302RaB.f = new C0285Qa(c3254q6, 0);
        return c0302RaB.b();
    }

    public static final C3639xD m(Pv pv) {
        C0108Fk c0108Fk = e;
        LinkedHashMap linkedHashMap = pv.a;
        HD hd = (HD) linkedHashMap.get(c0108Fk);
        if (hd == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        InterfaceC2722gM interfaceC2722gM = (InterfaceC2722gM) linkedHashMap.get(f);
        if (interfaceC2722gM == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(g);
        String str = (String) linkedHashMap.get(C2524cp.c);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        CD cdB = hd.getSavedStateRegistry().b();
        Bundle bundle2 = null;
        C3747zD c3747zD = cdB instanceof C3747zD ? (C3747zD) cdB : null;
        if (c3747zD == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = B(interfaceC2722gM).b;
        C3639xD c3639xD = (C3639xD) linkedHashMap2.get(str);
        if (c3639xD != null) {
            return c3639xD;
        }
        c3747zD.b();
        Bundle bundle3 = c3747zD.c;
        if (bundle3 != null && !(!bundle3.containsKey(str))) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = AbstractC0500aq.d((Jy[]) Arrays.copyOf(new Jy[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                c3747zD.c = null;
            }
            bundle2 = bundle4;
        }
        C3639xD c3639xDI = AbstractC0136He.i(bundle2, bundle);
        linkedHashMap2.put(str, c3639xDI);
        return c3639xDI;
    }

    public static void n(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (C3603we c3603we : (Set) it2.next()) {
                        for (C0036Bg c0036Bg : c3603we.a.c) {
                            if (c0036Bg.c == 0) {
                                Set<C3603we> set = (Set) map.get(new C3657xe(c0036Bg.a, c0036Bg.b == 2));
                                if (set != null) {
                                    for (C3603we c3603we2 : set) {
                                        c3603we.b.add(c3603we2);
                                        c3603we2.c.add(c3603we);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    C3603we c3603we3 = (C3603we) it4.next();
                    if (c3603we3.c.isEmpty()) {
                        hashSet2.add(c3603we3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    C3603we c3603we4 = (C3603we) hashSet2.iterator().next();
                    hashSet2.remove(c3603we4);
                    i2++;
                    Iterator it5 = c3603we4.b.iterator();
                    while (it5.hasNext()) {
                        C3603we c3603we5 = (C3603we) it5.next();
                        c3603we5.c.remove(c3603we4);
                        if (c3603we5.c.isEmpty()) {
                            hashSet2.add(c3603we5);
                        }
                    }
                }
                if (i2 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    C3603we c3603we6 = (C3603we) it6.next();
                    if (!c3603we6.c.isEmpty() && !c3603we6.b.isEmpty()) {
                        arrayList2.add(c3603we6.a);
                    }
                }
                throw new C0070Dg(arrayList2);
            }
            C0319Sa c0319Sa = (C0319Sa) it.next();
            C3603we c3603we7 = new C3603we(c0319Sa);
            for (KA ka : c0319Sa.b) {
                boolean z = !(c0319Sa.e == 0);
                C3657xe c3657xe = new C3657xe(ka, z);
                if (!map.containsKey(c3657xe)) {
                    map.put(c3657xe, new HashSet());
                }
                Set set2 = (Set) map.get(c3657xe);
                if (!set2.isEmpty() && !z) {
                    throw new IllegalArgumentException("Multiple components provide " + ka + ".");
                }
                set2.add(c3603we7);
            }
        }
    }

    public static final void o(HD hd) {
        AbstractC0500aq.m(hd, "<this>");
        Ir ir = ((Qr) hd.getLifecycle()).c;
        if (ir != Ir.b && ir != Ir.c) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (hd.getSavedStateRegistry().b() == null) {
            C3747zD c3747zD = new C3747zD(hd.getSavedStateRegistry(), (InterfaceC2722gM) hd);
            hd.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", c3747zD);
            hd.getLifecycle().a(new C2984lB(c3747zD, 3));
        }
    }

    public static final boolean p(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    public static final void q(InterfaceC0168Jc interfaceC0168Jc) {
        InterfaceC0029Aq interfaceC0029Aq = (InterfaceC0029Aq) interfaceC0168Jc.get(C0108Fk.e);
        if (interfaceC0029Aq != null && !interfaceC0029Aq.isActive()) {
            throw interfaceC0029Aq.getCancellationException();
        }
    }

    public static final boolean r(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static void s(long j, PrintWriter printWriter) {
        synchronized (h) {
            printWriter.print(new String(i, 0, t(j)));
        }
    }

    public static int t(long j) {
        char c2;
        int i2;
        int i3;
        int i4;
        int i5;
        if (i.length < 0) {
            i = new char[0];
        }
        char[] cArr = i;
        if (j == 0) {
            cArr[0] = '0';
            return 1;
        }
        if (j > 0) {
            c2 = '+';
        } else {
            j = -j;
            c2 = '-';
        }
        int i6 = (int) (j % 1000);
        int iFloor = (int) Math.floor(j / 1000);
        if (iFloor > 86400) {
            i2 = iFloor / 86400;
            iFloor -= 86400 * i2;
        } else {
            i2 = 0;
        }
        if (iFloor > 3600) {
            i3 = iFloor / 3600;
            iFloor -= i3 * 3600;
        } else {
            i3 = 0;
        }
        if (iFloor > 60) {
            int i7 = iFloor / 60;
            i4 = iFloor - (i7 * 60);
            i5 = i7;
        } else {
            i4 = iFloor;
            i5 = 0;
        }
        cArr[0] = c2;
        int iM = M(cArr, i2, 'd', 1, false, 0);
        int iM2 = M(cArr, i3, 'h', iM, iM != 1, 0);
        int iM3 = M(cArr, i5, 'm', iM2, iM2 != 1, 0);
        int iM4 = M(cArr, i6, 'm', M(cArr, i4, 's', iM3, iM3 != 1, 0), true, 0);
        cArr[iM4] = 's';
        return iM4 + 1;
    }

    public static C0319Sa u(String str, C0220Md c0220Md) {
        C0302Ra c0302RaB = C0319Sa.b(C3254q6.class);
        c0302RaB.e = 1;
        c0302RaB.a(C0036Bg.c(Context.class));
        c0302RaB.f = new C2947kb(3, str, c0220Md);
        return c0302RaB.b();
    }

    public static ArrayList v(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        AbstractC0500aq.m(context, "context");
        int i2 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = C0055Ci.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : runningAppProcesses) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ActivityManager.RunningAppProcessInfo) next).uid == i2) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC3491ua.Z(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it2.next();
            String str2 = runningAppProcessInfo.processName;
            AbstractC0500aq.l(str2, "processName");
            arrayList3.add(new Jz(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, AbstractC0500aq.b(runningAppProcessInfo.processName, str)));
        }
        return arrayList3;
    }

    public static ColorStateList w(Context context, D3 d3, int i2) {
        int resourceId;
        ColorStateList colorStateListU;
        TypedArray typedArray = (TypedArray) d3.b;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListU = AbstractC0115Ga.u(context, resourceId)) == null) ? d3.w(i2) : colorStateListU;
    }

    public static ColorStateList x(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList colorStateListU;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListU = AbstractC0115Ga.u(context, resourceId)) == null) ? typedArray.getColorStateList(i2) : colorStateListU;
    }

    public static ColorStateList y(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !Q.w(drawable)) {
            return null;
        }
        return Q.e(drawable).getColorStateList();
    }

    public static Drawable z(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable drawableF;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (drawableF = AbstractC0500aq.F(context, resourceId)) == null) ? typedArray.getDrawable(i2) : drawableF;
    }

    public abstract void K(int i2);

    public abstract void L(Typeface typeface);

    public abstract void Y(int i2, byte[] bArr, int i3);

    public void h(int i2) {
        new Handler(Looper.getMainLooper()).post(new RunnableC3746zC(i2, 0, this));
    }

    @Override // defpackage.InterfaceC2940kM
    public void a() {
    }

    @Override // defpackage.InterfaceC2940kM
    public void b() {
    }
}
