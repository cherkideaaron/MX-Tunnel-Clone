package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Set;

/* renamed from: aq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0500aq {
    public static final C3337ri b;
    public static final C3337ri c;
    public static Method g = null;
    public static boolean h = false;
    public static boolean j = true;
    public static final C3337ri a = new C3337ri("RESUME_TOKEN", 3);
    public static final C3397so d = new C3397so(16);
    public static final C3337ri e = new C3337ri("NULL", 3);
    public static final Object f = new Object();
    public static final C3397so i = new C3397so(28);

    static {
        int i2 = 3;
        b = new C3337ri("UNDEFINED", i2);
        c = new C3337ri("REUSABLE_CLAIMED", i2);
    }

    public static String A(C0519b8 c0519b8) {
        String str;
        StringBuilder sb = new StringBuilder(c0519b8.size());
        for (int i2 = 0; i2 < c0519b8.size(); i2++) {
            int iA = c0519b8.a(i2);
            if (iA == 34) {
                str = "\\\"";
            } else if (iA == 39) {
                str = "\\'";
            } else if (iA != 92) {
                switch (iA) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (iA < 32 || iA > 126) {
                            sb.append('\\');
                            sb.append((char) (((iA >>> 6) & 3) + 48));
                            sb.append((char) (((iA >>> 3) & 7) + 48));
                            iA = (iA & 7) + 48;
                        }
                        sb.append((char) iA);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static int B(Context context, int i2, int i3) {
        Integer numValueOf;
        TypedValue typedValueS = AbstractC0069Df.S(context, i2);
        if (typedValueS != null) {
            int i4 = typedValueS.resourceId;
            numValueOf = Integer.valueOf(i4 != 0 ? context.getColor(i4) : typedValueS.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i3;
    }

    public static int C(View view, int i2) {
        Context context = view.getContext();
        TypedValue typedValueW = AbstractC0069Df.W(view.getContext(), i2, view.getClass().getCanonicalName());
        int i3 = typedValueW.resourceId;
        return i3 != 0 ? context.getColor(i3) : typedValueW.data;
    }

    public static int D(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }

    public static Drawable F(Context context, int i2) {
        return C3584wC.d().f(context, i2);
    }

    public static final Object H(Rv rv, C3081mz c3081mz, Serializable serializable) {
        m(rv, "<this>");
        m(c3081mz, "key");
        Object objCopyOf = rv.a.get(c3081mz);
        if (objCopyOf instanceof byte[]) {
            byte[] bArr = (byte[]) objCopyOf;
            objCopyOf = Arrays.copyOf(bArr, bArr.length);
            l(objCopyOf, "copyOf(this, size)");
        }
        return objCopyOf == null ? serializable : objCopyOf;
    }

    public static File J(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, str + i2);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static void M(Activity activity) {
        m(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            C2875jC.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new C2875jC());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC2930kC(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static boolean N(int i2) {
        boolean z;
        if (i2 != 0) {
            ThreadLocal threadLocal = AbstractC0013Aa.a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int iRed = Color.red(i2);
            int iGreen = Color.green(i2);
            int iBlue = Color.blue(i2);
            if (dArr.length != 3) {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
            double d2 = iRed / 255.0d;
            double dPow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            double d3 = iGreen / 255.0d;
            double dPow2 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            double d4 = iBlue / 255.0d;
            double dPow3 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
            z = false;
            dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
            double d5 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
            dArr[1] = d5;
            dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
            if (d5 / 100.0d > 0.5d) {
                return true;
            }
        } else {
            z = false;
        }
        return z;
    }

    public static int P(int i2, int i3, float f2) {
        return AbstractC0013Aa.b(AbstractC0013Aa.d(i3, Math.round(Color.alpha(i3) * f2)), i2);
    }

    public static String Q(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            sb.append(str.charAt(i2));
            if (str2.length() > i2) {
                sb.append(str2.charAt(i2));
            }
        }
        return sb.toString();
    }

    public static MappedByteBuffer R(Context context, Uri uri) throws IOException {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0096 A[Catch: all -> 0x0075, DONT_GENERATE, TryCatch #2 {all -> 0x0075, blocks: (B:18:0x0055, B:20:0x0063, B:22:0x0069, B:35:0x0099, B:25:0x0077, B:27:0x0085, B:32:0x0090, B:34:0x0096, B:40:0x00a6, B:43:0x00af, B:42:0x00ac, B:30:0x008b), top: B:55:0x0055, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void V(defpackage.InterfaceC3493uc r9, java.lang.Object r10) {
        /*
            boolean r0 = r9 instanceof defpackage.C0444Zg
            if (r0 == 0) goto Lb9
            Zg r9 = (defpackage.C0444Zg) r9
            java.lang.Throwable r0 = defpackage.IC.a(r10)
            if (r0 != 0) goto Le
            r1 = r10
            goto L14
        Le:
            Ma r1 = new Ma
            r2 = 0
            r1.<init>(r2, r0)
        L14:
            uc r0 = r9.e
            Jc r2 = r0.getContext()
            Mc r3 = r9.d
            boolean r2 = r3.f(r2)
            r4 = 1
            if (r2 == 0) goto L30
            r9.f = r1
            r9.c = r4
            Jc r10 = r0.getContext()
            r3.e(r10, r9)
            goto Lbc
        L30:
            ej r2 = defpackage.RI.a()
            long r5 = r2.c
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L52
            r9.f = r1
            r9.c = r4
            T3 r10 = r2.e
            if (r10 != 0) goto L4e
            T3 r10 = new T3
            r10.<init>()
            r2.e = r10
        L4e:
            r10.addLast(r9)
            goto Lbc
        L52:
            r2.j(r4)
            Jc r1 = r0.getContext()     // Catch: java.lang.Throwable -> L75
            Fk r3 = defpackage.C0108Fk.e     // Catch: java.lang.Throwable -> L75
            Hc r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L75
            Aq r1 = (defpackage.InterfaceC0029Aq) r1     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L77
            boolean r3 = r1.isActive()     // Catch: java.lang.Throwable -> L75
            if (r3 != 0) goto L77
            java.util.concurrent.CancellationException r10 = r1.getCancellationException()     // Catch: java.lang.Throwable -> L75
            HC r10 = defpackage.AbstractC0115Ga.n(r10)     // Catch: java.lang.Throwable -> L75
            r9.resumeWith(r10)     // Catch: java.lang.Throwable -> L75
            goto L99
        L75:
            r10 = move-exception
            goto Lb0
        L77:
            java.lang.Object r1 = r9.m     // Catch: java.lang.Throwable -> L75
            Jc r3 = r0.getContext()     // Catch: java.lang.Throwable -> L75
            java.lang.Object r1 = defpackage.AbstractC0136He.P(r3, r1)     // Catch: java.lang.Throwable -> L75
            ri r5 = defpackage.AbstractC0136He.m     // Catch: java.lang.Throwable -> L75
            if (r1 == r5) goto L8a
            AK r5 = defpackage.MO.Q(r0, r3, r1)     // Catch: java.lang.Throwable -> L75
            goto L8b
        L8a:
            r5 = 0
        L8b:
            r0.resumeWith(r10)     // Catch: java.lang.Throwable -> La3
            if (r5 == 0) goto L96
            boolean r10 = r5.V()     // Catch: java.lang.Throwable -> L75
            if (r10 == 0) goto L99
        L96:
            defpackage.AbstractC0136He.H(r3, r1)     // Catch: java.lang.Throwable -> L75
        L99:
            boolean r10 = r2.l()     // Catch: java.lang.Throwable -> L75
            if (r10 != 0) goto L99
        L9f:
            r2.h(r4)
            goto Lbc
        La3:
            r10 = move-exception
            if (r5 == 0) goto Lac
            boolean r0 = r5.V()     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto Laf
        Lac:
            defpackage.AbstractC0136He.H(r3, r1)     // Catch: java.lang.Throwable -> L75
        Laf:
            throw r10     // Catch: java.lang.Throwable -> L75
        Lb0:
            r9.j(r10)     // Catch: java.lang.Throwable -> Lb4
            goto L9f
        Lb4:
            r9 = move-exception
            r2.h(r4)
            throw r9
        Lb9:
            r9.resumeWith(r10)
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0500aq.V(uc, java.lang.Object):void");
    }

    public static void W(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static void Z(Drawable drawable, int i2) {
        drawable.setTint(i2);
    }

    public static R7 a(int i2, N7 n7, int i3) {
        R7 c3654xb;
        if ((i3 & 2) != 0) {
            n7 = N7.a;
        }
        if (i2 != -2) {
            if (i2 == -1) {
                if (n7 == N7.a) {
                    return new C3654xb(1, N7.b, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            if (i2 != 0) {
                return i2 != Integer.MAX_VALUE ? n7 == N7.a ? new R7(i2, null) : new C3654xb(i2, n7, null) : new R7(Api.BaseClientBuilder.API_PRIORITY_OTHER, null);
            }
            c3654xb = n7 == N7.a ? new R7(0, null) : new C3654xb(1, n7, null);
        } else if (n7 == N7.a) {
            Y8.g.getClass();
            c3654xb = new R7(W8.b, null);
        } else {
            c3654xb = new C3654xb(1, n7, null);
        }
        return c3654xb;
    }

    public static void a0(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b0(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    public static final void c(AbstractC0478aM abstractC0478aM, DD dd, Jr jr) {
        AutoCloseable autoCloseable;
        m(dd, "registry");
        m(jr, "lifecycle");
        C0533bM c0533bM = abstractC0478aM.a;
        if (c0533bM != null) {
            synchronized (c0533bM.a) {
                autoCloseable = (AutoCloseable) c0533bM.b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        C3693yD c3693yD = (C3693yD) autoCloseable;
        if (c3693yD == null || c3693yD.c) {
            return;
        }
        c3693yD.i(jr, dd);
        Ir ir = ((Qr) jr).c;
        if (ir == Ir.b || ir.compareTo(Ir.d) >= 0) {
            dd.d();
        } else {
            jr.a(new C0443Zf(jr, dd));
        }
    }

    public static void c0(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            XL.b(viewGroup, z);
        } else if (j) {
            try {
                XL.b(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                j = false;
            }
        }
    }

    public static final Bundle d(Jy... jyArr) {
        Bundle bundle = new Bundle(jyArr.length);
        for (Jy jy : jyArr) {
            String str = (String) jy.a;
            Object obj = jy.b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                j(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static void d0(String str) {
        C0234Na c0234Na = new C0234Na(AbstractC3264qG.x("lateinit property ", str, " has not been initialized"));
        W(c0234Na, AbstractC0500aq.class.getName());
        throw c0234Na;
    }

    public static boolean e(Oy[] oyArr, Oy[] oyArr2) {
        if (oyArr == null || oyArr2 == null || oyArr.length != oyArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < oyArr.length; i2++) {
            Oy oy = oyArr[i2];
            char c2 = oy.a;
            Oy oy2 = oyArr2[i2];
            if (c2 != oy2.a || oy.b.length != oy2.b.length) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i(android.content.Context r5) {
        /*
            java.lang.String r0 = r5.getPackageName()
            r1 = 2131951660(0x7f13002c, float:1.953974E38)
            java.lang.String r1 = r5.getString(r1)
            r2 = -174409384162234(0xffff6160269c8c46, double:NaN)
            java.lang.String r2 = org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app.getString(r2)
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L1d
            rased.vpn.app.utils.PUtils.killProcess()
        L1d:
            r1 = -174469513704378(0xffff6152269c8c46, double:NaN)
            java.lang.String r1 = org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app.getString(r1)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2f
            rased.vpn.app.utils.PUtils.killProcess()
        L2f:
            int r0 = defpackage.AbstractC2783ha.a
            java.io.File r0 = r5.getFilesDir()
            java.lang.String r0 = r0.getPath()
            r1 = -164904621536186(0xffff6a05269c8c46, double:NaN)
            java.lang.String r1 = org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app.getString(r1)
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L4c
        L48:
            rased.vpn.app.utils.PUtils.killProcess()
            goto L68
        L4c:
            r1 = 0
            r2 = r1
        L4e:
            int r3 = r0.length()
            r4 = 3
            if (r1 >= r3) goto L65
            if (r2 <= r4) goto L58
            goto L65
        L58:
            char r3 = r0.charAt(r1)
            r4 = 46
            if (r3 != r4) goto L62
            int r2 = r2 + 1
        L62:
            int r1 = r1 + 1
            goto L4e
        L65:
            if (r2 <= r4) goto L68
            goto L48
        L68:
            r0 = -174701441938362(0xffff611c269c8c46, double:NaN)
            java.lang.String r0 = org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app.getString(r0)     // Catch: java.lang.Exception -> L8f
            r1 = -174877535597498(0xffff60f3269c8c46, double:NaN)
            java.lang.String r1 = org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app.getString(r1)     // Catch: java.lang.Exception -> L8f
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}     // Catch: java.lang.Exception -> L8f
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Exception -> L8f
            java.lang.String r1 = defpackage.AbstractC3279qd.w(r5)     // Catch: java.lang.Exception -> L8f
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Exception -> L8f
            if (r0 != 0) goto L8f
            rased.vpn.app.utils.PUtils.killProcess()     // Catch: java.lang.Exception -> L8f
        L8f:
            rased.vpn.app.utils.PUtils.checkSignature(r5)
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
            int r5 = r5.flags
            r5 = r5 & 2
            if (r5 == 0) goto L9f
            rased.vpn.app.utils.PUtils.killProcess()
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0500aq.i(android.content.Context):void");
    }

    public static void j(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        W(nullPointerException, AbstractC0500aq.class.getName());
        throw nullPointerException;
    }

    public static void k(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        W(nullPointerException, AbstractC0500aq.class.getName());
        throw nullPointerException;
    }

    public static void l(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        W(nullPointerException, AbstractC0500aq.class.getName());
        throw nullPointerException;
    }

    public static void m(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = AbstractC0500aq.class.getName();
            int i2 = 0;
            while (!stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            while (stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            StackTraceElement stackTraceElement = stackTrace[i2];
            StringBuilder sbP = AbstractC3264qG.p("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
            sbP.append(str);
            NullPointerException nullPointerException = new NullPointerException(sbP.toString());
            W(nullPointerException, AbstractC0500aq.class.getName());
            throw nullPointerException;
        }
    }

    public static void n(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int o(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static int p(GB gb, AbstractC0492ai abstractC0492ai, View view, View view2, AbstractC3529vB abstractC3529vB, boolean z) {
        if (abstractC3529vB.v() == 0 || gb.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(AbstractC3529vB.H(view) - AbstractC3529vB.H(view2)) + 1;
        }
        return Math.min(abstractC0492ai.l(), abstractC0492ai.b(view2) - abstractC0492ai.e(view));
    }

    public static int q(GB gb, AbstractC0492ai abstractC0492ai, View view, View view2, AbstractC3529vB abstractC3529vB, boolean z, boolean z2) {
        if (abstractC3529vB.v() == 0 || gb.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (gb.b() - Math.max(AbstractC3529vB.H(view), AbstractC3529vB.H(view2))) - 1) : Math.max(0, Math.min(AbstractC3529vB.H(view), AbstractC3529vB.H(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(abstractC0492ai.b(view2) - abstractC0492ai.e(view)) / (Math.abs(AbstractC3529vB.H(view) - AbstractC3529vB.H(view2)) + 1))) + (abstractC0492ai.k() - abstractC0492ai.e(view)));
        }
        return iMax;
    }

    public static int r(GB gb, AbstractC0492ai abstractC0492ai, View view, View view2, AbstractC3529vB abstractC3529vB, boolean z) {
        if (abstractC3529vB.v() == 0 || gb.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return gb.b();
        }
        return (int) (((abstractC0492ai.b(view2) - abstractC0492ai.e(view)) / (Math.abs(AbstractC3529vB.H(view) - AbstractC3529vB.H(view2)) + 1)) * gb.b());
    }

    public static float[] s(float[] fArr, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i2, length);
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static boolean t(File file, Resources resources, int i2) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i2);
        } catch (Throwable th) {
            th = th;
            inputStreamOpenRawResource = null;
        }
        try {
            boolean zU = u(file, inputStreamOpenRawResource);
            n(inputStreamOpenRawResource);
            return zU;
        } catch (Throwable th2) {
            th = th2;
            n(inputStreamOpenRawResource);
            throw th;
        }
    }

    public static boolean u(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
                    while (true) {
                        int i2 = inputStream.read(bArr);
                        if (i2 == -1) {
                            n(fileOutputStream2);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i2);
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    n(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    n(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.Oy[] v(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0500aq.v(java.lang.String):Oy[]");
    }

    public static Path w(String str) {
        Path path = new Path();
        try {
            Oy.b(v(str), path);
            return path;
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing ".concat(str), e2);
        }
    }

    public static Oy[] x(Oy[] oyArr) {
        Oy[] oyArr2 = new Oy[oyArr.length];
        for (int i2 = 0; i2 < oyArr.length; i2++) {
            oyArr2[i2] = new Oy(oyArr[i2]);
        }
        return oyArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void y(Activity activity, Hr hr) {
        m(activity, "activity");
        m(hr, "event");
        if (activity instanceof Or) {
            Jr lifecycle = ((Or) activity).getLifecycle();
            if (lifecycle instanceof Qr) {
                ((Qr) lifecycle).e(hr);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0059, B:29:0x006e, B:31:0x0076, B:33:0x007c, B:35:0x0082, B:38:0x0093, B:39:0x009b, B:40:0x009c, B:41:0x00a7, B:20:0x0048, B:24:0x0053), top: B:60:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v4, types: [kB] */
    /* JADX WARN: Type inference failed for: r9v6, types: [kB] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0090 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object z(defpackage.InterfaceC3177ol r8, defpackage.Rz r9, boolean r10, defpackage.InterfaceC3493uc r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0500aq.z(ol, Rz, boolean, uc):java.lang.Object");
    }

    public abstract void E(C3425tF c3425tF, float f2, float f3);

    public abstract InputFilter[] G(InputFilter[] inputFilterArr);

    public abstract int I(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int K();

    public abstract ViewPropertyAnimator L(View view, int i2);

    public abstract boolean O();

    public abstract void S(Set set);

    public abstract void T(H h2, H h3);

    public abstract void U(H h2, Thread thread);

    public abstract void X(boolean z);

    public abstract void Y(boolean z);

    public abstract TransformationMethod e0(TransformationMethod transformationMethod);

    public abstract boolean f(I i2, E e2, E e3);

    public abstract boolean g(I i2, Object obj, Object obj2);

    public abstract boolean h(I i2, H h2, H h3);
}
