package defpackage;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.OpenVPNApplication;

/* renamed from: qd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3279qd {
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] e = {R.attr.drawable};
    public static final int[] f = {R.attr.name, R.attr.animation};
    public static final int[] g = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};
    public static final int[] h = {R.attr.ordering};
    public static final int[] i = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};
    public static final int[] j = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};
    public static final int[] k = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};
    public static final P3 l = new P3(1);
    public static final C0360Uh m = new C0360Uh(15);
    public static final int[] n = {R.attr.theme, com.mxtunnel.pro.R.attr.theme};
    public static final int[] o = {com.mxtunnel.pro.R.attr.materialThemeOverlay};
    public static final byte[] p = {112, 114, 111, 0};
    public static final byte[] q = {112, 114, 109, 0};
    public static final int[] r = {com.mxtunnel.pro.R.attr.colorPrimary};
    public static final int[] s = {com.mxtunnel.pro.R.attr.colorPrimaryVariant};
    public static long t;
    public static long u;

    public static final B8 C(InterfaceC3493uc interfaceC3493uc) {
        B8 b8;
        B8 b82;
        if (!(interfaceC3493uc instanceof C0444Zg)) {
            return new B8(1, interfaceC3493uc);
        }
        C0444Zg c0444Zg = (C0444Zg) interfaceC3493uc;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0444Zg.n;
            Object obj = atomicReferenceFieldUpdater.get(c0444Zg);
            C3337ri c3337ri = AbstractC0500aq.c;
            b8 = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(c0444Zg, c3337ri);
                b82 = null;
                break;
            }
            if (obj instanceof B8) {
                while (!atomicReferenceFieldUpdater.compareAndSet(c0444Zg, obj, c3337ri)) {
                    if (atomicReferenceFieldUpdater.get(c0444Zg) != obj) {
                        break;
                    }
                }
                b82 = (B8) obj;
                break loop0;
            }
            if (obj != c3337ri && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (b82 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = B8.m;
            Object obj2 = atomicReferenceFieldUpdater2.get(b82);
            if (!(obj2 instanceof C0183Ka) || ((C0183Ka) obj2).d == null) {
                B8.f.set(b82, 536870911);
                atomicReferenceFieldUpdater2.set(b82, G0.a);
                b8 = b82;
            } else {
                b82.o();
            }
            if (b8 != null) {
                return b8;
            }
        }
        return new B8(2, interfaceC3493uc);
    }

    public static PropertyValuesHolder E(TypedArray typedArray, int i2, int i3, int i4, String str) {
        PropertyValuesHolder propertyValuesHolderOfFloat;
        PropertyValuesHolder propertyValuesHolderOfObject;
        TypedValue typedValuePeekValue = typedArray.peekValue(i3);
        boolean z = typedValuePeekValue != null;
        int i5 = z ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i4);
        boolean z2 = typedValuePeekValue2 != null;
        int i6 = z2 ? typedValuePeekValue2.type : 0;
        if (i2 == 4) {
            i2 = ((z && L(i5)) || (z2 && L(i6))) ? 3 : 0;
        }
        boolean z3 = i2 == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i2 != 2) {
            R3 r3 = i2 == 3 ? R3.a : null;
            if (z3) {
                if (z) {
                    float dimension = i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f);
                    if (z2) {
                        propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i6 == 5 ? typedArray.getDimension(i4, 0.0f) : typedArray.getFloat(i4, 0.0f));
                    } else {
                        propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i6 == 5 ? typedArray.getDimension(i4, 0.0f) : typedArray.getFloat(i4, 0.0f));
                }
                propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
            } else if (z) {
                int dimension2 = i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : L(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
                if (z2) {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2, i6 == 5 ? (int) typedArray.getDimension(i4, 0.0f) : L(i6) ? typedArray.getColor(i4, 0) : typedArray.getInt(i4, 0));
                } else {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z2) {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i6 == 5 ? (int) typedArray.getDimension(i4, 0.0f) : L(i6) ? typedArray.getColor(i4, 0) : typedArray.getInt(i4, 0));
            }
            if (propertyValuesHolderOfInt == null || r3 == null) {
                return propertyValuesHolderOfInt;
            }
            propertyValuesHolderOfInt.setEvaluator(r3);
            return propertyValuesHolderOfInt;
        }
        String string = typedArray.getString(i3);
        String string2 = typedArray.getString(i4);
        Oy[] oyArrV = AbstractC0500aq.v(string);
        Oy[] oyArrV2 = AbstractC0500aq.v(string2);
        if (oyArrV == null && oyArrV2 == null) {
            return null;
        }
        if (oyArrV == null) {
            if (oyArrV2 != null) {
                return PropertyValuesHolder.ofObject(str, new T1(), oyArrV2);
            }
            return null;
        }
        T1 t1 = new T1();
        if (oyArrV2 == null) {
            propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, t1, oyArrV);
        } else {
            if (!AbstractC0500aq.e(oyArrV, oyArrV2)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, t1, oyArrV, oyArrV2);
        }
        return propertyValuesHolderOfObject;
    }

    public static SharedPreferences G(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static String I(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public static final void J(InterfaceC0168Jc interfaceC0168Jc, Throwable th) {
        try {
            D1 d1 = (D1) interfaceC0168Jc.get(C0360Uh.c);
            if (d1 != null) {
                d1.e(interfaceC0168Jc, th);
            } else {
                AbstractC0115Ga.B(interfaceC0168Jc, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                MO.a(runtimeException, th);
                th = runtimeException;
            }
            AbstractC0115Ga.B(interfaceC0168Jc, th);
        }
    }

    public static final void K(InterfaceC3742z8 interfaceC3742z8, InterfaceC3418t8 interfaceC3418t8) {
        if (!(interfaceC3742z8 instanceof B8)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((B8) interfaceC3742z8).v(interfaceC3418t8);
    }

    public static boolean L(int i2) {
        return i2 >= 28 && i2 <= 31;
    }

    public static boolean M(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static ValueAnimator Q(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator2;
        int resourceId = 0;
        TypedArray typedArrayA = AbstractC0136He.A(resources, theme, attributeSet, g);
        TypedArray typedArrayA2 = AbstractC0136He.A(resources, theme, attributeSet, k);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long j2 = AbstractC0136He.v(xmlResourceParser, "duration") ? typedArrayA.getInt(1, 300) : 300;
        long j3 = !AbstractC0136He.v(xmlResourceParser, "startOffset") ? 0 : typedArrayA.getInt(2, 0);
        int i2 = !AbstractC0136He.v(xmlResourceParser, "valueType") ? 4 : typedArrayA.getInt(7, 4);
        if (AbstractC0136He.v(xmlResourceParser, "valueFrom") && AbstractC0136He.v(xmlResourceParser, "valueTo")) {
            if (i2 == 4) {
                TypedValue typedValuePeekValue = typedArrayA.peekValue(5);
                boolean z = typedValuePeekValue != null;
                int i3 = z ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayA.peekValue(6);
                boolean z2 = typedValuePeekValue2 != null;
                i2 = ((z && L(i3)) || (z2 && L(z2 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderE = E(typedArrayA, i2, 5, 6, "");
            if (propertyValuesHolderE != null) {
                valueAnimator3.setValues(propertyValuesHolderE);
            }
        }
        valueAnimator3.setDuration(j2);
        valueAnimator3.setStartDelay(j3);
        valueAnimator3.setRepeatCount(!AbstractC0136He.v(xmlResourceParser, "repeatCount") ? 0 : typedArrayA.getInt(3, 0));
        valueAnimator3.setRepeatMode(!AbstractC0136He.v(xmlResourceParser, "repeatMode") ? 1 : typedArrayA.getInt(4, 1));
        if (typedArrayA2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String strS = AbstractC0136He.s(typedArrayA2, xmlResourceParser, "pathData", 1);
            if (strS != null) {
                String strS2 = AbstractC0136He.s(typedArrayA2, xmlResourceParser, "propertyXName", 2);
                String strS3 = AbstractC0136He.s(typedArrayA2, xmlResourceParser, "propertyYName", 3);
                if (strS2 == null && strS3 == null) {
                    throw new InflateException(typedArrayA2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path pathW = AbstractC0500aq.w(strS);
                PathMeasure pathMeasure = new PathMeasure(pathW, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float length = 0.0f;
                while (true) {
                    length += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(length));
                    if (!pathMeasure.nextContour()) {
                        break;
                    }
                    valueAnimator3 = valueAnimator3;
                }
                PathMeasure pathMeasure2 = new PathMeasure(pathW, false);
                int iMin = Math.min(100, ((int) (length / 0.5f)) + 1);
                float[] fArr = new float[iMin];
                float[] fArr2 = new float[iMin];
                float[] fArr3 = new float[2];
                float f2 = length / (iMin - 1);
                valueAnimator = valueAnimator3;
                typedArray = typedArrayA;
                int i4 = 0;
                int i5 = 0;
                float f3 = 0.0f;
                while (true) {
                    if (i5 >= iMin) {
                        break;
                    }
                    int i6 = iMin;
                    pathMeasure2.getPosTan(f3 - ((Float) arrayList.get(i4)).floatValue(), fArr3, null);
                    fArr[i5] = fArr3[0];
                    fArr2[i5] = fArr3[1];
                    f3 += f2;
                    int i7 = i4 + 1;
                    if (i7 < arrayList.size() && f3 > ((Float) arrayList.get(i7)).floatValue()) {
                        pathMeasure2.nextContour();
                        i4 = i7;
                    }
                    i5++;
                    iMin = i6;
                }
                PropertyValuesHolder propertyValuesHolderOfFloat = strS2 != null ? PropertyValuesHolder.ofFloat(strS2, fArr) : null;
                PropertyValuesHolder propertyValuesHolderOfFloat2 = strS3 != null ? PropertyValuesHolder.ofFloat(strS3, fArr2) : null;
                if (propertyValuesHolderOfFloat == null) {
                    resourceId = 0;
                    objectAnimator2.setValues(propertyValuesHolderOfFloat2);
                } else {
                    resourceId = 0;
                    if (propertyValuesHolderOfFloat2 == null) {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat);
                    } else {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                    }
                }
            } else {
                valueAnimator = valueAnimator3;
                typedArray = typedArrayA;
                objectAnimator2.setPropertyName(AbstractC0136He.s(typedArrayA2, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator = valueAnimator3;
            typedArray = typedArrayA;
        }
        if (AbstractC0136He.v(xmlResourceParser, "interpolator")) {
            typedArray2 = typedArray;
            resourceId = typedArray2.getResourceId(resourceId, resourceId);
        } else {
            typedArray2 = typedArray;
        }
        if (resourceId > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator2 = valueAnimator;
        }
        typedArray2.recycle();
        if (typedArrayA2 != null) {
            typedArrayA2.recycle();
        }
        return valueAnimator2;
    }

    public static int R(int i2, int i3, int i4) {
        if (i2 == 1) {
            throw new IllegalStateException("HOT methods are not stored in the bitmap");
        }
        if (i2 == 2) {
            return i3;
        }
        if (i2 == 4) {
            return i3 + i4;
        }
        throw new IllegalStateException(Vs.k(i2, "Unexpected flag: "));
    }

    public static TypedArray S(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        k(context, attributeSet, i2, i3);
        m(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    public static final Object T(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static Task W(Task task, Task task2) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        C0271Pd c0271Pd = new C0271Pd(taskCompletionSource, new AtomicBoolean(false), cancellationTokenSource, 0);
        P3 p3 = l;
        task.continueWithTask(p3, c0271Pd);
        task2.continueWithTask(p3, c0271Pd);
        return taskCompletionSource.getTask();
    }

    public static C3022lv X(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j2;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i2 = byteBufferDuplicate.getShort() & 65535;
        if (i2 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j2 = -1;
                break;
            }
            int i4 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j2 = byteBufferDuplicate.getInt() & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j2 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j2 - byteBufferDuplicate.position())));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j3 = byteBufferDuplicate.getInt() & 4294967295L;
            for (int i5 = 0; i5 < j3; i5++) {
                int i6 = byteBufferDuplicate.getInt();
                long j4 = byteBufferDuplicate.getInt() & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i6 || 1701669481 == i6) {
                    byteBufferDuplicate.position((int) (j4 + j2));
                    C3022lv c3022lv = new C3022lv(2);
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    c3022lv.d = byteBufferDuplicate;
                    c3022lv.a = iPosition;
                    int i7 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    c3022lv.b = i7;
                    c3022lv.c = ((ByteBuffer) c3022lv.d).getShort(i7);
                    return c3022lv;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static String Y(Context context, String str) {
        return f0(context.getResources().getAssets().open(str), str);
    }

    public static int[] Z(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int iP = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iP += (int) AbstractC3296qu.P(byteArrayInputStream, 2);
            iArr[i3] = iP;
        }
        return iArr;
    }

    public static C0166Ja a() {
        C0166Ja c0166Ja = new C0166Ja(true);
        c0166Ja.B(null);
        return c0166Ja;
    }

    public static byte[] a0(String str) throws IOException {
        int i2 = 0;
        File file = new File(str);
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 262144 || length > 2147483647L) {
                throw new C3166oa(String.format(OpenVPNApplication.e.getString(com.mxtunnel.pro.R.string.file_too_large), str, 262144L));
            }
            int i3 = (int) length;
            byte[] bArr = new byte[i3];
            while (i2 < i3) {
                int i4 = fileInputStream.read(bArr, i2, i3 - i2);
                if (i4 < 0) {
                    break;
                }
                i2 += i4;
            }
            if (i2 >= i3) {
                return bArr;
            }
            throw new IOException("Could not completely read file: " + str);
        } finally {
            fileInputStream.close();
        }
    }

    public static final Object b(Task task, C0181Jp c0181Jp) throws Exception {
        if (!task.isComplete()) {
            B8 b8 = new B8(1, AbstractC0069Df.C(c0181Jp));
            b8.s();
            task.addOnCompleteListener(ExecutorC0342Tg.b, new C2524cp(b8, 26));
            Object objR = b8.r();
            EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
            return objR;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    public static C0240Ng[] b0(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C0240Ng[] c0240NgArr) throws IOException {
        byte[] bArr3 = AbstractC0136He.k;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, AbstractC0136He.l)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iP = (int) AbstractC3296qu.P(fileInputStream, 2);
            byte[] bArrO = AbstractC3296qu.O(fileInputStream, (int) AbstractC3296qu.P(fileInputStream, 4), (int) AbstractC3296qu.P(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrO);
            try {
                C0240Ng[] c0240NgArrD0 = d0(byteArrayInputStream, bArr2, iP, c0240NgArr);
                byteArrayInputStream.close();
                return c0240NgArrD0;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(AbstractC0136He.f, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iP2 = (int) AbstractC3296qu.P(fileInputStream, 1);
        byte[] bArrO2 = AbstractC3296qu.O(fileInputStream, (int) AbstractC3296qu.P(fileInputStream, 4), (int) AbstractC3296qu.P(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrO2);
        try {
            C0240Ng[] c0240NgArrC0 = c0(byteArrayInputStream2, iP2, c0240NgArr);
            byteArrayInputStream2.close();
            return c0240NgArrC0;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static final void c(int i2) {
        new Integer(i2);
    }

    public static C0240Ng[] c0(ByteArrayInputStream byteArrayInputStream, int i2, C0240Ng[] c0240NgArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0240Ng[0];
        }
        if (i2 != c0240NgArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iP = (int) AbstractC3296qu.P(byteArrayInputStream, 2);
            iArr[i3] = (int) AbstractC3296qu.P(byteArrayInputStream, 2);
            strArr[i3] = new String(AbstractC3296qu.N(byteArrayInputStream, iP), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            C0240Ng c0240Ng = c0240NgArr[i4];
            if (!c0240Ng.b.equals(strArr[i4])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i5 = iArr[i4];
            c0240Ng.e = i5;
            c0240Ng.h = Z(byteArrayInputStream, i5);
        }
        return c0240NgArr;
    }

    public static C0240Ng[] d0(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, C0240Ng[] c0240NgArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0240Ng[0];
        }
        if (i2 != c0240NgArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            AbstractC3296qu.P(byteArrayInputStream, 2);
            String str = new String(AbstractC3296qu.N(byteArrayInputStream, (int) AbstractC3296qu.P(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jP = AbstractC3296qu.P(byteArrayInputStream, 4);
            int iP = (int) AbstractC3296qu.P(byteArrayInputStream, 2);
            C0240Ng c0240Ng = null;
            if (c0240NgArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i4 = 0;
                while (true) {
                    if (i4 >= c0240NgArr.length) {
                        break;
                    }
                    if (c0240NgArr[i4].b.equals(strSubstring)) {
                        c0240Ng = c0240NgArr[i4];
                        break;
                    }
                    i4++;
                }
            }
            if (c0240Ng == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c0240Ng.d = jP;
            int[] iArrZ = Z(byteArrayInputStream, iP);
            if (Arrays.equals(bArr, AbstractC0136He.j)) {
                c0240Ng.e = iP;
                c0240Ng.h = iArrZ;
            }
        }
        return c0240NgArr;
    }

    public static C0240Ng[] e0(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, AbstractC0136He.g)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iP = (int) AbstractC3296qu.P(fileInputStream, 1);
        byte[] bArrO = AbstractC3296qu.O(fileInputStream, (int) AbstractC3296qu.P(fileInputStream, 4), (int) AbstractC3296qu.P(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrO);
        try {
            C0240Ng[] c0240NgArrG0 = g0(byteArrayInputStream, str, iP);
            byteArrayInputStream.close();
            return c0240NgArrG0;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static final void f(InterfaceC2631en interfaceC2631en, Object obj, InterfaceC0168Jc interfaceC0168Jc) {
        C0234Na c0234NaG = g(interfaceC2631en, obj, null);
        if (c0234NaG != null) {
            J(interfaceC0168Jc, c0234NaG);
        }
    }

    public static String f0(InputStream inputStream, String str) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb = new StringBuilder();
            char[] cArr = new char[4096];
            while (true) {
                int i2 = bufferedReader.read(cArr, 0, 4096);
                if (i2 <= 0) {
                    return sb.toString();
                }
                sb.append(cArr, 0, i2);
            }
        } finally {
            inputStream.close();
        }
    }

    public static final C0234Na g(InterfaceC2631en interfaceC2631en, Object obj, C0234Na c0234Na) {
        try {
            interfaceC2631en.invoke(obj);
        } catch (Throwable th) {
            if (c0234Na == null || c0234Na.getCause() == th) {
                return new C0234Na("Exception in undelivered element handler for " + obj, th);
            }
            MO.a(c0234Na, th);
        }
        return c0234Na;
    }

    public static C0240Ng[] g0(ByteArrayInputStream byteArrayInputStream, String str, int i2) throws IOException {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C0240Ng[0];
        }
        C0240Ng[] c0240NgArr = new C0240Ng[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iP = (int) AbstractC3296qu.P(byteArrayInputStream, 2);
            int iP2 = (int) AbstractC3296qu.P(byteArrayInputStream, 2);
            c0240NgArr[i3] = new C0240Ng(str, new String(AbstractC3296qu.N(byteArrayInputStream, iP), StandardCharsets.UTF_8), AbstractC3296qu.P(byteArrayInputStream, 4), iP2, (int) AbstractC3296qu.P(byteArrayInputStream, 4), (int) AbstractC3296qu.P(byteArrayInputStream, 4), new int[iP2], new TreeMap());
        }
        for (int i4 = 0; i4 < i2; i4++) {
            C0240Ng c0240Ng = c0240NgArr[i4];
            int iAvailable = byteArrayInputStream.available() - c0240Ng.f;
            int iP3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = c0240Ng.i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iP3 += (int) AbstractC3296qu.P(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iP3), 1);
                for (int iP4 = (int) AbstractC3296qu.P(byteArrayInputStream, 2); iP4 > 0; iP4--) {
                    AbstractC3296qu.P(byteArrayInputStream, 2);
                    int iP5 = (int) AbstractC3296qu.P(byteArrayInputStream, 1);
                    if (iP5 != 6 && iP5 != 7) {
                        while (iP5 > 0) {
                            AbstractC3296qu.P(byteArrayInputStream, 1);
                            for (int iP6 = (int) AbstractC3296qu.P(byteArrayInputStream, 1); iP6 > 0; iP6--) {
                                AbstractC3296qu.P(byteArrayInputStream, 2);
                            }
                            iP5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c0240Ng.h = Z(byteArrayInputStream, c0240Ng.e);
            int i5 = c0240Ng.g;
            BitSet bitSetValueOf = BitSet.valueOf(AbstractC3296qu.N(byteArrayInputStream, (((i5 * 2) + 7) & (-8)) / 8));
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = bitSetValueOf.get(R(2, i6, i5)) ? 2 : 0;
                if (bitSetValueOf.get(R(4, i6, i5))) {
                    i7 |= 4;
                }
                if (i7 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i6));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i6), Integer.valueOf(i7 | num.intValue()));
                }
            }
        }
        return c0240NgArr;
    }

    public static void i0(Context context, String str) {
        new Handler(Looper.getMainLooper()).post(new RunnableC2666fL(context, str, 0));
    }

    public static void j0(Context context, String str) {
        new Handler(Looper.getMainLooper()).post(new RunnableC2666fL(context, str, 2));
    }

    public static void k(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RA.G, i2, i3);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(com.mxtunnel.pro.R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                n(context, s, "Theme.MaterialComponents");
            }
        }
        n(context, r, "Theme.AppCompat");
    }

    /* JADX WARN: Finally extract failed */
    public static boolean k0(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C0240Ng[] c0240NgArr) throws IOException {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = AbstractC0136He.f;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = AbstractC0136He.g;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrQ = q(c0240NgArr, bArr3);
                AbstractC3296qu.Z(byteArrayOutputStream, c0240NgArr.length, 1);
                AbstractC3296qu.Z(byteArrayOutputStream, bArrQ.length, 4);
                byte[] bArrK = AbstractC3296qu.k(bArrQ);
                AbstractC3296qu.Z(byteArrayOutputStream, bArrK.length, 4);
                byteArrayOutputStream.write(bArrK);
                return true;
            }
            byte[] bArr4 = AbstractC0136He.i;
            if (Arrays.equals(bArr, bArr4)) {
                AbstractC3296qu.Z(byteArrayOutputStream, c0240NgArr.length, 1);
                for (C0240Ng c0240Ng : c0240NgArr) {
                    int size = c0240Ng.i.size() * 4;
                    String strV = v(c0240Ng.a, c0240Ng.b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    AbstractC3296qu.a0(byteArrayOutputStream, strV.getBytes(charset).length);
                    AbstractC3296qu.a0(byteArrayOutputStream, c0240Ng.h.length);
                    AbstractC3296qu.Z(byteArrayOutputStream, size, 4);
                    AbstractC3296qu.Z(byteArrayOutputStream, c0240Ng.c, 4);
                    byteArrayOutputStream.write(strV.getBytes(charset));
                    Iterator it = c0240Ng.i.keySet().iterator();
                    while (it.hasNext()) {
                        AbstractC3296qu.a0(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        AbstractC3296qu.a0(byteArrayOutputStream, 0);
                    }
                    for (int i3 : c0240Ng.h) {
                        AbstractC3296qu.a0(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr5 = AbstractC0136He.h;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrQ2 = q(c0240NgArr, bArr5);
                AbstractC3296qu.Z(byteArrayOutputStream, c0240NgArr.length, 1);
                AbstractC3296qu.Z(byteArrayOutputStream, bArrQ2.length, 4);
                byte[] bArrK2 = AbstractC3296qu.k(bArrQ2);
                AbstractC3296qu.Z(byteArrayOutputStream, bArrK2.length, 4);
                byteArrayOutputStream.write(bArrK2);
                return true;
            }
            byte[] bArr6 = AbstractC0136He.j;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            AbstractC3296qu.a0(byteArrayOutputStream, c0240NgArr.length);
            for (C0240Ng c0240Ng2 : c0240NgArr) {
                String strV2 = v(c0240Ng2.a, c0240Ng2.b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                AbstractC3296qu.a0(byteArrayOutputStream, strV2.getBytes(charset2).length);
                TreeMap treeMap = c0240Ng2.i;
                AbstractC3296qu.a0(byteArrayOutputStream, treeMap.size());
                AbstractC3296qu.a0(byteArrayOutputStream, c0240Ng2.h.length);
                AbstractC3296qu.Z(byteArrayOutputStream, c0240Ng2.c, 4);
                byteArrayOutputStream.write(strV2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    AbstractC3296qu.a0(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : c0240Ng2.h) {
                    AbstractC3296qu.a0(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            AbstractC3296qu.a0(byteArrayOutputStream2, c0240NgArr.length);
            int i5 = 2;
            int i6 = 2;
            for (C0240Ng c0240Ng3 : c0240NgArr) {
                AbstractC3296qu.Z(byteArrayOutputStream2, c0240Ng3.c, 4);
                AbstractC3296qu.Z(byteArrayOutputStream2, c0240Ng3.d, 4);
                AbstractC3296qu.Z(byteArrayOutputStream2, c0240Ng3.g, 4);
                String strV3 = v(c0240Ng3.a, c0240Ng3.b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strV3.getBytes(charset3).length;
                AbstractC3296qu.a0(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(strV3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            C3542vO c3542vO = new C3542vO(byteArray, 1, false);
            byteArrayOutputStream2.close();
            arrayList2.add(c3542vO);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < c0240NgArr.length) {
                try {
                    C0240Ng c0240Ng4 = c0240NgArr[i7];
                    AbstractC3296qu.a0(byteArrayOutputStream3, i7);
                    AbstractC3296qu.a0(byteArrayOutputStream3, c0240Ng4.e);
                    i8 = i8 + 4 + (c0240Ng4.e * 2);
                    int[] iArr = c0240Ng4.h;
                    int length3 = iArr.length;
                    int i9 = i2;
                    while (i2 < length3) {
                        int i10 = iArr[i2];
                        AbstractC3296qu.a0(byteArrayOutputStream3, i10 - i9);
                        i2++;
                        i9 = i10;
                    }
                    i7++;
                    i2 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            C3542vO c3542vO2 = new C3542vO(byteArray2, 3, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c3542vO2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i11 = 0;
            int i12 = 0;
            while (i11 < c0240NgArr.length) {
                try {
                    C0240Ng c0240Ng5 = c0240NgArr[i11];
                    Iterator it3 = c0240Ng5.i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        r0(byteArrayOutputStream4, iIntValue, c0240Ng5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            s0(byteArrayOutputStream4, c0240Ng5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            AbstractC3296qu.a0(byteArrayOutputStream3, i11);
                            int length4 = byteArray3.length + i5 + byteArray4.length;
                            int i13 = i12 + 6;
                            ArrayList arrayList4 = arrayList3;
                            AbstractC3296qu.Z(byteArrayOutputStream3, length4, 4);
                            AbstractC3296qu.a0(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i12 = i13 + length4;
                            i11++;
                            arrayList3 = arrayList4;
                            i5 = 2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            C3542vO c3542vO3 = new C3542vO(byteArray5, 4, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c3542vO3);
            long j2 = 4;
            long size2 = j2 + j2 + 4 + (arrayList2.size() * 16);
            int i14 = 4;
            AbstractC3296qu.Z(byteArrayOutputStream, arrayList2.size(), 4);
            int i15 = 0;
            while (i15 < arrayList2.size()) {
                C3542vO c3542vO4 = (C3542vO) arrayList2.get(i15);
                AbstractC3296qu.Z(byteArrayOutputStream, AbstractC3264qG.c(c3542vO4.a), i14);
                AbstractC3296qu.Z(byteArrayOutputStream, size2, i14);
                boolean z = c3542vO4.c;
                byte[] bArr7 = c3542vO4.b;
                if (z) {
                    long length5 = bArr7.length;
                    byte[] bArrK3 = AbstractC3296qu.k(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrK3);
                    AbstractC3296qu.Z(byteArrayOutputStream, bArrK3.length, 4);
                    AbstractC3296qu.Z(byteArrayOutputStream, length5, 4);
                    length = bArrK3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    AbstractC3296qu.Z(byteArrayOutputStream, bArr7.length, 4);
                    AbstractC3296qu.Z(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i15++;
                arrayList5 = arrayList;
                i14 = 4;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i16));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void l(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void m(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RA.G, i2, i3);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            for (int i4 : iArr2) {
                if (typedArrayObtainStyledAttributes2.getResourceId(i4, -1) == -1) {
                    typedArrayObtainStyledAttributes2.recycle();
                    break;
                }
            }
            typedArrayObtainStyledAttributes2.recycle();
            z = true;
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static Context m0(int i2, int i3, Context context, AttributeSet attributeSet, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o, i2, i3);
        int[] iArr2 = {typedArrayObtainStyledAttributes.getResourceId(0, 0)};
        typedArrayObtainStyledAttributes.recycle();
        int i4 = iArr2[0];
        boolean z = (context instanceof C3439tc) && ((C3439tc) context).a == i4;
        if (i4 == 0 || z) {
            return context;
        }
        C3439tc c3439tc = new C3439tc(context, i4);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            for (int i5 = 0; i5 < iArr.length; i5++) {
                iArr3[i5] = typedArrayObtainStyledAttributes2.getResourceId(i5, 0);
            }
            typedArrayObtainStyledAttributes2.recycle();
        }
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = iArr3[i6];
            if (i7 != 0) {
                c3439tc.getTheme().applyStyle(i7, true);
            }
        }
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, n);
        int resourceId = typedArrayObtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(1, 0);
        typedArrayObtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            c3439tc.getTheme().applyStyle(resourceId, true);
        }
        return c3439tc;
    }

    public static void n(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i2)) {
                typedArrayObtainStyledAttributes.recycle();
                throw new IllegalArgumentException(AbstractC3264qG.x("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static Context n0(Context context, AttributeSet attributeSet, int i2, int i3) {
        return m0(i2, i3, context, attributeSet, new int[0]);
    }

    public static C0228Ml o(Context context) {
        ProviderInfo providerInfo;
        C0194Kl c0194Kl;
        ApplicationInfo applicationInfo;
        C0108Fk c0154If = Build.VERSION.SDK_INT >= 28 ? new C0154If(12) : new C0108Fk(12);
        PackageManager packageManager = context.getPackageManager();
        AbstractC0136He.g(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            c0194Kl = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrH = c0154If.h(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrH) {
                    arrayList.add(signature.toByteArray());
                }
                c0194Kl = new C0194Kl(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
            }
        }
        if (c0194Kl == null) {
            return null;
        }
        return new C0228Ml(new C0211Ll(context, c0194Kl));
    }

    public static void o0(Context context, String str, String str2) throws IOException {
        FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(str, 0);
        try {
            fileOutputStreamOpenFileOutput.write(str2.getBytes());
        } finally {
            fileOutputStreamOpenFileOutput.close();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:200:0x03a1, code lost:
    
        if (r31 == null) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03a3, code lost:
    
        if (r13 == null) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03a5, code lost:
    
        r1 = new android.animation.Animator[r13.size()];
        r3 = r13.iterator();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03b4, code lost:
    
        if (r3.hasNext() == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03b6, code lost:
    
        r1[r14] = (android.animation.Animator) r3.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03c2, code lost:
    
        if (r32 != 0) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03c4, code lost:
    
        r31.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03c8, code lost:
    
        r31.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03cb, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator p(android.content.Context r26, android.content.res.Resources r27, android.content.res.Resources.Theme r28, android.content.res.XmlResourceParser r29, android.util.AttributeSet r30, android.animation.AnimatorSet r31, int r32) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 972
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3279qd.p(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.content.res.XmlResourceParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public static void p0(ByteArrayOutputStream byteArrayOutputStream, C0240Ng c0240Ng) throws IOException {
        s0(byteArrayOutputStream, c0240Ng);
        int[] iArr = c0240Ng.h;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            AbstractC3296qu.a0(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        int i5 = c0240Ng.g;
        byte[] bArr = new byte[(((i5 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0240Ng.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int iR = R(2, iIntValue, i5);
                int i6 = iR / 8;
                bArr[i6] = (byte) ((1 << (iR % 8)) | bArr[i6]);
            }
            if ((iIntValue2 & 4) != 0) {
                int iR2 = R(4, iIntValue, i5);
                int i7 = iR2 / 8;
                bArr[i7] = (byte) ((1 << (iR2 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static byte[] q(C0240Ng[] c0240NgArr, byte[] bArr) throws IOException {
        int i2 = 0;
        int length = 0;
        for (C0240Ng c0240Ng : c0240NgArr) {
            length += ((((c0240Ng.g * 2) + 7) & (-8)) / 8) + (c0240Ng.e * 2) + v(c0240Ng.a, c0240Ng.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c0240Ng.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, AbstractC0136He.h)) {
            int length2 = c0240NgArr.length;
            while (i2 < length2) {
                C0240Ng c0240Ng2 = c0240NgArr[i2];
                q0(byteArrayOutputStream, c0240Ng2, v(c0240Ng2.a, c0240Ng2.b, bArr));
                p0(byteArrayOutputStream, c0240Ng2);
                i2++;
            }
        } else {
            for (C0240Ng c0240Ng3 : c0240NgArr) {
                q0(byteArrayOutputStream, c0240Ng3, v(c0240Ng3.a, c0240Ng3.b, bArr));
            }
            int length3 = c0240NgArr.length;
            while (i2 < length3) {
                p0(byteArrayOutputStream, c0240NgArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static void q0(ByteArrayOutputStream byteArrayOutputStream, C0240Ng c0240Ng, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        AbstractC3296qu.a0(byteArrayOutputStream, str.getBytes(charset).length);
        AbstractC3296qu.a0(byteArrayOutputStream, c0240Ng.e);
        AbstractC3296qu.Z(byteArrayOutputStream, c0240Ng.f, 4);
        AbstractC3296qu.Z(byteArrayOutputStream, c0240Ng.c, 4);
        AbstractC3296qu.Z(byteArrayOutputStream, c0240Ng.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static AbstractC0478aM r(Class cls) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                AbstractC0500aq.j(objNewInstance);
                return (AbstractC0478aM) objNewInstance;
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            }
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        }
    }

    public static void r0(ByteArrayOutputStream byteArrayOutputStream, int i2, C0240Ng c0240Ng) throws IOException {
        int iBitCount = Integer.bitCount(i2 & (-2));
        int i3 = c0240Ng.g;
        byte[] bArr = new byte[(((iBitCount * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0240Ng.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & iIntValue2) == i5) {
                        int i6 = (i4 * i3) + iIntValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(String str, String str2, Object obj) {
        String strI = I(str);
        if (Log.isLoggable(strI, 3)) {
            Log.d(strI, String.format(str2, obj));
        }
    }

    public static void s0(ByteArrayOutputStream byteArrayOutputStream, C0240Ng c0240Ng) {
        int i2 = 0;
        for (Map.Entry entry : c0240Ng.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                AbstractC3296qu.a0(byteArrayOutputStream, iIntValue - i2);
                AbstractC3296qu.a0(byteArrayOutputStream, 0);
                i2 = iIntValue;
            }
        }
    }

    public static void t(Exception exc, String str, String str2) {
        String strI = I(str);
        if (Log.isLoggable(strI, 6)) {
            Log.e(strI, str2, exc);
        }
    }

    public static String u(String str) {
        try {
            return AbstractC0309Rh.e(str, AbstractC0309Rh.a);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String v(String str, String str2, byte[] bArr) {
        byte[] bArr2 = AbstractC0136He.j;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = AbstractC0136He.i;
        String str3 = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return AbstractC3264qG.l(AbstractC3264qG.n(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
    }

    public static String w(Context context) throws NoSuchAlgorithmException {
        StringBuilder sb = new StringBuilder();
        for (Signature signature : context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures) {
            byte[] byteArray = signature.toByteArray();
            MessageDigest messageDigest = MessageDigest.getInstance(Deobfuscator$MHRTUNNELVPN$app.getString(-175629154874298L));
            messageDigest.update(byteArray);
            byte[] bArrDigest = messageDigest.digest();
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            char[] cArr2 = new char[bArrDigest.length * 2];
            for (int i2 = 0; i2 < bArrDigest.length; i2++) {
                byte b2 = bArrDigest[i2];
                int i3 = i2 * 2;
                cArr2[i3] = cArr[(b2 & 255) >>> 4];
                cArr2[i3 + 1] = cArr[b2 & 15];
            }
            sb.append(new String(cArr2));
        }
        return sb.toString();
    }

    public static Object x(Future future) {
        Object obj;
        boolean z = false;
        if (!future.isDone()) {
            throw new IllegalStateException(AbstractC3296qu.I("Future was expected to be done: %s", future));
        }
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public abstract int A();

    public abstract int B();

    public abstract int D(View view);

    public abstract int F(CoordinatorLayout coordinatorLayout);

    public abstract int H();

    public abstract boolean N(float f2);

    public abstract boolean O(View view);

    public abstract boolean P(float f2, float f3);

    public abstract void U(C3409t c3409t, C3409t c3409t2);

    public abstract void V(C3409t c3409t, Thread thread);

    public abstract int d(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float e(int i2);

    public abstract boolean h(AbstractC3463u abstractC3463u, C3192p c3192p, C3192p c3192p2);

    public abstract boolean h0(View view, float f2);

    public abstract boolean i(AbstractC3463u abstractC3463u, Object obj, Object obj2);

    public abstract boolean j(AbstractC3463u abstractC3463u, C3409t c3409t, C3409t c3409t2);

    public abstract void l0(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3);

    public abstract int y();

    public abstract int z();
}
