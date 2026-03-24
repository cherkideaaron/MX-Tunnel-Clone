package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: nK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3103nK extends C2993lK {
    public final Class p;
    public final Constructor q;
    public final Method r;
    public final Method s;
    public final Method t;
    public final Method u;
    public final Method v;

    public C3103nK() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method methodU0;
        Constructor<?> constructor;
        Method methodT0;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodT0 = t0(cls2);
            Class<?> cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodU0 = u0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodU0 = null;
            constructor = null;
            methodT0 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.p = cls;
        this.q = constructor;
        this.r = methodT0;
        this.s = method;
        this.t = method2;
        this.u = method3;
        this.v = methodU0;
    }

    public static Method t0(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // defpackage.C2993lK, defpackage.AbstractC0069Df
    public final Typeface j(Context context, C0330Sl c0330Sl, Resources resources, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!r0()) {
            return super.j(context, c0330Sl, resources, i);
        }
        Object objS0 = s0();
        if (objS0 == null) {
            return null;
        }
        for (C0347Tl c0347Tl : c0330Sl.a) {
            if (!o0(context, objS0, c0347Tl.a, c0347Tl.e, c0347Tl.b, c0347Tl.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0347Tl.d))) {
                n0(objS0);
                return null;
            }
        }
        if (q0(objS0)) {
            return p0(objS0);
        }
        return null;
    }

    @Override // defpackage.C2993lK, defpackage.AbstractC0069Df
    public final Typeface k(Context context, C0381Vl[] c0381VlArr, int i) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Typeface typefaceP0;
        boolean zBooleanValue;
        if (c0381VlArr.length < 1) {
            return null;
        }
        if (!r0()) {
            C0381Vl c0381VlP = p(c0381VlArr, i);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c0381VlP.a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c0381VlP.c).setItalic(c0381VlP.d).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap map = new HashMap();
        for (C0381Vl c0381Vl : c0381VlArr) {
            if (c0381Vl.e == 0) {
                Uri uri = c0381Vl.a;
                if (!map.containsKey(uri)) {
                    map.put(uri, AbstractC0500aq.R(context, uri));
                }
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Object objS0 = s0();
        if (objS0 == null) {
            return null;
        }
        int length = c0381VlArr.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            C0381Vl c0381Vl2 = c0381VlArr[i2];
            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c0381Vl2.a);
            if (byteBuffer != null) {
                try {
                    zBooleanValue = ((Boolean) this.s.invoke(objS0, byteBuffer, Integer.valueOf(c0381Vl2.b), null, Integer.valueOf(c0381Vl2.c), Integer.valueOf(c0381Vl2.d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    n0(objS0);
                    return null;
                }
                z = true;
            }
            i2++;
            z = z;
        }
        if (!z) {
            n0(objS0);
            return null;
        }
        if (q0(objS0) && (typefaceP0 = p0(objS0)) != null) {
            return Typeface.create(typefaceP0, i);
        }
        return null;
    }

    @Override // defpackage.AbstractC0069Df
    public final Typeface n(Context context, Resources resources, int i, String str, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!r0()) {
            return super.n(context, resources, i, str, i2);
        }
        Object objS0 = s0();
        if (objS0 == null) {
            return null;
        }
        if (!o0(context, objS0, str, 0, -1, -1, null)) {
            n0(objS0);
            return null;
        }
        if (q0(objS0)) {
            return p0(objS0);
        }
        return null;
    }

    public final void n0(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.u.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean o0(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.r.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface p0(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.p, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.v.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean q0(Object obj) {
        try {
            return ((Boolean) this.t.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean r0() {
        Method method = this.r;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object s0() {
        try {
            return this.q.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method u0(Class cls) throws NoSuchMethodException, SecurityException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
