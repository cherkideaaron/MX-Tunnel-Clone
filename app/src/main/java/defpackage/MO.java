package defpackage;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.Xml;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class MO {
    public static final C3337ri f;
    public static final C3337ri g;
    public static Field l = null;
    public static boolean m = false;
    public static Class n = null;
    public static boolean o = false;
    public static Field p = null;
    public static boolean q = false;
    public static Field r = null;
    public static boolean s = false;
    public static boolean t = true;
    public static Field u;
    public static boolean v;
    public final /* synthetic */ int a;
    public static final String[] b = {"com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk", "com.kingroot.kinguser", "com.kingo.root", "com.smedialink.oneclickroot", "com.zhiqupk.root.global", "com.alephzain.framaroot"};
    public static final String[] c = {"com.koushikdutta.rommanager", "com.koushikdutta.rommanager.license", "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.ramdroid.appquarantine", "com.ramdroid.appquarantinepro", "com.android.vending.billing.InAppBillingService.COIN", "com.android.vending.billing.InAppBillingService.LUCK", "com.chelpus.luckypatcher", "com.blackmartalpha", "org.blackmart.market", "com.allinone.free", "com.repodroid.app", "org.creeplays.hack", "com.baseappfull.fwd", "com.zmapp", "com.dv.marketmod.installer", "org.mobilism.android", "com.android.wp.net.log", "com.android.camera.update", "cc.madkite.freedom", "com.solohsu.android.edxp.manager", "org.meowcat.edxposed.manager", "com.xmodgame", "com.cih.game_cih", "com.charles.lpoqasert", "catch_.me_.if_.you_.can_"};
    public static final String[] d = {"/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/cache/", "/data/", "/dev/"};
    public static final String[] e = {"/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc"};
    public static final C0108Fk h = new C0108Fk(13);
    public static final InterfaceC2963kr[] i = new InterfaceC2963kr[0];
    public static final Object j = new Object();
    public static final int[] k = {R.attr.stateListAnimator};

    static {
        int i2 = 3;
        f = new C3337ri("REMOVED_TASK", i2);
        g = new C3337ri("CLOSED_EMPTY", i2);
    }

    public /* synthetic */ MO(int i2) {
        this.a = i2;
    }

    public static InterfaceC0313Rl A(XmlResourceParser xmlResourceParser, Resources resources) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (xmlResourceParser.getName().equals("font-family")) {
            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), YA.b);
            String string = typedArrayObtainAttributes.getString(0);
            String string2 = typedArrayObtainAttributes.getString(5);
            String string3 = typedArrayObtainAttributes.getString(6);
            String string4 = typedArrayObtainAttributes.getString(2);
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            int integer = typedArrayObtainAttributes.getInteger(3, 1);
            int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
            String string5 = typedArrayObtainAttributes.getString(7);
            typedArrayObtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlResourceParser.next() != 3) {
                    L(xmlResourceParser);
                }
                List listC = C(resources, resourceId);
                return new C0364Ul(new C0194Kl(string, string2, string3, listC), string4 != null ? new C0194Kl(string, string2, string4, listC) : null, integer, integer2, string5);
            }
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), YA.c);
                        int i2 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i3 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i4 = typedArrayObtainAttributes2.getInt(i3, 0);
                        int i5 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i5, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i5);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            L(xmlResourceParser);
                        }
                        arrayList.add(new C0347Tl(i2, i4, resourceId2, string7, string6, z));
                    } else {
                        L(xmlResourceParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new C0330Sl((C0347Tl[]) arrayList.toArray(new C0347Tl[0]));
            }
        } else {
            L(xmlResourceParser);
        }
        return null;
    }

    public static final byte[] B(InputStream inputStream) throws IOException {
        AbstractC0500aq.m(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        k(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        AbstractC0500aq.l(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static List C(Resources resources, int i2) throws Resources.NotFoundException {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < typedArrayObtainTypedArray.length(); i3++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void D(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static final void E(Object[] objArr, int i2, int i3) {
        AbstractC0500aq.m(objArr, "<this>");
        while (i2 < i3) {
            objArr[i2] = null;
            i2++;
        }
    }

    public static void G(View view, float f2) throws Resources.NotFoundException {
        int integer = view.getResources().getInteger(com.mxtunnel.pro.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j2 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, com.mxtunnel.pro.R.attr.state_liftable, -2130969742}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j2));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, "elevation", f2).setDuration(j2));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    public static void H(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = zHasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    public static void I(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC3267qJ.a(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC3375sJ viewOnLongClickListenerC3375sJ = ViewOnLongClickListenerC3375sJ.q;
        if (viewOnLongClickListenerC3375sJ != null && viewOnLongClickListenerC3375sJ.a == view) {
            ViewOnLongClickListenerC3375sJ.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC3375sJ(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC3375sJ viewOnLongClickListenerC3375sJ2 = ViewOnLongClickListenerC3375sJ.r;
        if (viewOnLongClickListenerC3375sJ2 != null && viewOnLongClickListenerC3375sJ2.a == view) {
            viewOnLongClickListenerC3375sJ2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static void L(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static final long O(long j2, long j3, long j4, String str) {
        String property;
        int i2 = AbstractC3101nI.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j2;
        }
        Long lW = BH.W(property);
        if (lW == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lW.longValue();
        if (j3 <= jLongValue && jLongValue <= j4) {
            return jLongValue;
        }
        StringBuilder sb = new StringBuilder("System property '");
        sb.append(str);
        sb.append("' should be in range ");
        sb.append(j3);
        Vs.y(sb, "..", j4, ", but is '");
        sb.append(jLongValue);
        sb.append('\'');
        throw new IllegalStateException(sb.toString().toString());
    }

    public static int P(String str, int i2, int i3, int i4, int i5) {
        if ((i5 & 4) != 0) {
            i3 = 1;
        }
        if ((i5 & 8) != 0) {
            i4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return (int) O(i2, i3, i4, str);
    }

    public static final AK Q(InterfaceC3493uc interfaceC3493uc, InterfaceC0168Jc interfaceC0168Jc, Object obj) {
        AK ak = null;
        if (!(interfaceC3493uc instanceof InterfaceC0338Tc)) {
            return null;
        }
        if (interfaceC0168Jc.get(BK.a) != null) {
            InterfaceC0338Tc callerFrame = (InterfaceC0338Tc) interfaceC3493uc;
            while (true) {
                if ((callerFrame instanceof C0491ah) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof AK) {
                    ak = (AK) callerFrame;
                    break;
                }
            }
            if (ak != null) {
                ak.W(interfaceC0168Jc, obj);
            }
        }
        return ak;
    }

    public static void a(Throwable th, Throwable th2) {
        AbstractC0500aq.m(th, "<this>");
        AbstractC0500aq.m(th2, "exception");
        if (th != th2) {
            Integer num = AbstractC3127nq.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = Wy.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static void b(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static final Object c(InterfaceC3117ng[] interfaceC3117ngArr, InterfaceC3493uc interfaceC3493uc) {
        if (interfaceC3117ngArr.length == 0) {
            return C0055Ci.a;
        }
        M6 m6 = new M6(interfaceC3117ngArr);
        B8 b8 = new B8(1, AbstractC0069Df.C(interfaceC3493uc));
        b8.s();
        int length = interfaceC3117ngArr.length;
        K6[] k6Arr = new K6[length];
        for (int i2 = 0; i2 < length; i2++) {
            InterfaceC3117ng interfaceC3117ng = interfaceC3117ngArr[i2];
            interfaceC3117ng.start();
            K6 k6 = new K6(m6, b8);
            k6.f = AbstractC3296qu.F(interfaceC3117ng, true, k6);
            k6Arr[i2] = k6;
        }
        L6 l6 = new L6(k6Arr);
        for (int i3 = 0; i3 < length; i3++) {
            K6 k62 = k6Arr[i3];
            k62.getClass();
            K6.n.set(k62, l6);
        }
        if (!(B8.m.get(b8) instanceof InterfaceC3621ww)) {
            l6.b();
        } else {
            AbstractC3279qd.K(b8, l6);
        }
        Object objR = b8.r();
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        return objR;
    }

    public static final void d(LinkedHashMap linkedHashMap, InterfaceC3207pE interfaceC3207pE, String str, int i2) {
        String str2 = AbstractC0500aq.b(interfaceC3207pE.e(), C3370sE.x) ? "enum value" : "property";
        if (!linkedHashMap.containsKey(str)) {
            linkedHashMap.put(str, Integer.valueOf(i2));
            return;
        }
        String str3 = "The suggested name '" + str + "' for " + str2 + ' ' + interfaceC3207pE.g(i2) + " is already one of the names for " + str2 + ' ' + interfaceC3207pE.g(((Number) Ht.T(linkedHashMap, str)).intValue()) + " in " + interfaceC3207pE;
        AbstractC0500aq.m(str3, "message");
        throw new C0454Zq(str3);
    }

    public static void f(int i2, Object[] objArr) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (objArr[i3] == null) {
                throw new NullPointerException(Vs.k(i3, "at index "));
            }
        }
    }

    public static void g(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static int h(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    public static final long i(long j2, EnumC0173Jh enumC0173Jh, EnumC0173Jh enumC0173Jh2) {
        AbstractC0500aq.m(enumC0173Jh, "sourceUnit");
        AbstractC0500aq.m(enumC0173Jh2, "targetUnit");
        return enumC0173Jh2.a.convert(j2, enumC0173Jh.a);
    }

    public static ImageView.ScaleType j(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 5 ? i2 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static void k(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        AbstractC0500aq.m(inputStream, "<this>");
        byte[] bArr = new byte[8192];
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 < 0) {
                return;
            } else {
                byteArrayOutputStream.write(bArr, 0, i2);
            }
        }
    }

    public static final File l(Context context, String str) {
        AbstractC0500aq.m(context, "<this>");
        AbstractC0500aq.m(str, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(str));
    }

    public static final void m(C0284Pq c0284Pq, C3249q1 c3249q1, InterfaceC2963kr interfaceC2963kr, Object obj) {
        AbstractC0500aq.m(c0284Pq, "json");
        AbstractC0500aq.m(interfaceC2963kr, "serializer");
        new C0206Lg(c0284Pq.a.e ? new C3167ob(c3249q1, c0284Pq) : new H7(c3249q1), c0284Pq, EnumC3596wO.c, new C0206Lg[EnumC3596wO.n.a()]).l(interfaceC2963kr, obj);
    }

    public static void o(Object obj) throws NoSuchFieldException, SecurityException {
        LongSparseArray longSparseArray;
        if (!o) {
            try {
                n = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            o = true;
        }
        Class cls = n;
        if (cls == null) {
            return;
        }
        if (!q) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                p = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            q = true;
        }
        Field field = p;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e4) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    public static final InterfaceC0168Jc p(InterfaceC0168Jc interfaceC0168Jc, InterfaceC0168Jc interfaceC0168Jc2, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) interfaceC0168Jc.fold(bool, new C0030Ba(2))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC0168Jc2.fold(bool, new C0030Ba(2))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC0168Jc.plus(interfaceC0168Jc2);
        }
        C0021Ai c0021Ai = C0021Ai.a;
        InterfaceC0168Jc interfaceC0168Jc3 = (InterfaceC0168Jc) interfaceC0168Jc.fold(c0021Ai, new C0030Ba(3));
        Object objFold = interfaceC0168Jc2;
        if (zBooleanValue2) {
            objFold = interfaceC0168Jc2.fold(c0021Ai, new C0030Ba(4));
        }
        return interfaceC0168Jc3.plus((InterfaceC0168Jc) objFold);
    }

    public static final int q(final InterfaceC3207pE interfaceC3207pE, final C0284Pq c0284Pq, String str) {
        AbstractC0500aq.m(interfaceC3207pE, "<this>");
        AbstractC0500aq.m(c0284Pq, "json");
        AbstractC0500aq.m(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        C0318Rq c0318Rq = c0284Pq.a;
        boolean z = c0318Rq.m;
        C0108Fk c0108Fk = h;
        C2524cp c2524cp = c0284Pq.c;
        if (z && AbstractC0500aq.b(interfaceC3207pE.e(), C3370sE.x)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            AbstractC0500aq.l(lowerCase, "toLowerCase(...)");
            InterfaceC0606cn interfaceC0606cn = new InterfaceC0606cn() { // from class: br
                @Override // defpackage.InterfaceC0606cn
                public final Object invoke() {
                    String[] strArrNames;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C0284Pq c0284Pq2 = c0284Pq;
                    boolean z2 = c0284Pq2.a.m;
                    InterfaceC3207pE interfaceC3207pE2 = interfaceC3207pE;
                    boolean z3 = z2 && AbstractC0500aq.b(interfaceC3207pE2.e(), C3370sE.x);
                    MO.y(c0284Pq2, interfaceC3207pE2);
                    int iF = interfaceC3207pE2.f();
                    for (int i2 = 0; i2 < iF; i2++) {
                        List listH = interfaceC3207pE2.h(i2);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listH) {
                            if (obj instanceof InterfaceC0501ar) {
                                arrayList.add(obj);
                            }
                        }
                        String lowerCase2 = null;
                        InterfaceC0501ar interfaceC0501ar = (InterfaceC0501ar) (arrayList.size() == 1 ? arrayList.get(0) : null);
                        if (interfaceC0501ar != null && (strArrNames = interfaceC0501ar.names()) != null) {
                            for (String lowerCase3 : strArrNames) {
                                if (z3) {
                                    lowerCase3 = lowerCase3.toLowerCase(Locale.ROOT);
                                    AbstractC0500aq.l(lowerCase3, "toLowerCase(...)");
                                }
                                MO.d(linkedHashMap, interfaceC3207pE2, lowerCase3, i2);
                            }
                        }
                        if (z3) {
                            lowerCase2 = interfaceC3207pE2.g(i2).toLowerCase(Locale.ROOT);
                            AbstractC0500aq.l(lowerCase2, "toLowerCase(...)");
                        }
                        if (lowerCase2 != null) {
                            MO.d(linkedHashMap, interfaceC3207pE2, lowerCase2, i2);
                        }
                    }
                    return linkedHashMap.isEmpty() ? C0072Di.a : linkedHashMap;
                }
            };
            c2524cp.getClass();
            Object objS = c2524cp.s(interfaceC3207pE, c0108Fk);
            if (objS == null) {
                objS = interfaceC0606cn.invoke();
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c2524cp.b;
                Object concurrentHashMap2 = concurrentHashMap.get(interfaceC3207pE);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(interfaceC3207pE, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(c0108Fk, objS);
            }
            Integer num = (Integer) ((Map) objS).get(lowerCase);
            if (num != null) {
                return num.intValue();
            }
            return -3;
        }
        y(c0284Pq, interfaceC3207pE);
        int iD = interfaceC3207pE.d(str);
        if (iD != -3 || !c0318Rq.l) {
            return iD;
        }
        InterfaceC0606cn interfaceC0606cn2 = new InterfaceC0606cn() { // from class: br
            @Override // defpackage.InterfaceC0606cn
            public final Object invoke() {
                String[] strArrNames;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C0284Pq c0284Pq2 = c0284Pq;
                boolean z2 = c0284Pq2.a.m;
                InterfaceC3207pE interfaceC3207pE2 = interfaceC3207pE;
                boolean z3 = z2 && AbstractC0500aq.b(interfaceC3207pE2.e(), C3370sE.x);
                MO.y(c0284Pq2, interfaceC3207pE2);
                int iF = interfaceC3207pE2.f();
                for (int i2 = 0; i2 < iF; i2++) {
                    List listH = interfaceC3207pE2.h(i2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listH) {
                        if (obj instanceof InterfaceC0501ar) {
                            arrayList.add(obj);
                        }
                    }
                    String lowerCase2 = null;
                    InterfaceC0501ar interfaceC0501ar = (InterfaceC0501ar) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (interfaceC0501ar != null && (strArrNames = interfaceC0501ar.names()) != null) {
                        for (String lowerCase3 : strArrNames) {
                            if (z3) {
                                lowerCase3 = lowerCase3.toLowerCase(Locale.ROOT);
                                AbstractC0500aq.l(lowerCase3, "toLowerCase(...)");
                            }
                            MO.d(linkedHashMap, interfaceC3207pE2, lowerCase3, i2);
                        }
                    }
                    if (z3) {
                        lowerCase2 = interfaceC3207pE2.g(i2).toLowerCase(Locale.ROOT);
                        AbstractC0500aq.l(lowerCase2, "toLowerCase(...)");
                    }
                    if (lowerCase2 != null) {
                        MO.d(linkedHashMap, interfaceC3207pE2, lowerCase2, i2);
                    }
                }
                return linkedHashMap.isEmpty() ? C0072Di.a : linkedHashMap;
            }
        };
        c2524cp.getClass();
        Object objS2 = c2524cp.s(interfaceC3207pE, c0108Fk);
        if (objS2 == null) {
            objS2 = interfaceC0606cn2.invoke();
            ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) c2524cp.b;
            Object concurrentHashMap4 = concurrentHashMap3.get(interfaceC3207pE);
            if (concurrentHashMap4 == null) {
                concurrentHashMap4 = new ConcurrentHashMap(2);
                concurrentHashMap3.put(interfaceC3207pE, concurrentHashMap4);
            }
            ((Map) concurrentHashMap4).put(c0108Fk, objS2);
        }
        Integer num2 = (Integer) ((Map) objS2).get(str);
        if (num2 != null) {
            return num2.intValue();
        }
        return -3;
    }

    public static String[] r() {
        Object[] array;
        ArrayList arrayList = new ArrayList(Arrays.asList(d));
        String str = System.getenv("PATH");
        if (str == null || "".equals(str)) {
            array = arrayList.toArray(new String[0]);
        } else {
            String[] strArrSplit = str.split(":");
            int length = strArrSplit.length;
            for (int i2 = 0; i2 < length; i2++) {
                String strConcat = strArrSplit[i2];
                if (!strConcat.endsWith("/")) {
                    strConcat = strConcat.concat("/");
                }
                if (!arrayList.contains(strConcat)) {
                    arrayList.add(strConcat);
                }
            }
            array = arrayList.toArray(new String[0]);
        }
        return (String[]) array;
    }

    public static final int s(int i2, int i3, int i4) {
        if (i4 > 0) {
            if (i2 >= i3) {
                return i3;
            }
            int i5 = i3 % i4;
            if (i5 < 0) {
                i5 += i4;
            }
            int i6 = i2 % i4;
            if (i6 < 0) {
                i6 += i4;
            }
            int i7 = (i5 - i6) % i4;
            if (i7 < 0) {
                i7 += i4;
            }
            return i3 - i7;
        }
        if (i4 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i2 <= i3) {
            return i3;
        }
        int i8 = -i4;
        int i9 = i2 % i8;
        if (i9 < 0) {
            i9 += i8;
        }
        int i10 = i3 % i8;
        if (i10 < 0) {
            i10 += i8;
        }
        int i11 = (i9 - i10) % i8;
        if (i11 < 0) {
            i11 += i8;
        }
        return i3 + i11;
    }

    public static final int u(InterfaceC3207pE interfaceC3207pE, InterfaceC3207pE[] interfaceC3207pEArr) {
        AbstractC0500aq.m(interfaceC3207pEArr, "typeParams");
        int iHashCode = (interfaceC3207pE.a().hashCode() * 31) + Arrays.hashCode(interfaceC3207pEArr);
        int iF = interfaceC3207pE.f();
        int i2 = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iF > 0)) {
                break;
            }
            int i3 = iF - 1;
            int i4 = i2 * 31;
            String strA = interfaceC3207pE.i(interfaceC3207pE.f() - iF).a();
            if (strA != null) {
                iHashCode2 = strA.hashCode();
            }
            i2 = i4 + iHashCode2;
            iF = i3;
        }
        int iF2 = interfaceC3207pE.f();
        int iHashCode3 = 1;
        while (true) {
            if (!(iF2 > 0)) {
                return (((iHashCode * 31) + i2) * 31) + iHashCode3;
            }
            int i5 = iF2 - 1;
            int i6 = iHashCode3 * 31;
            MO moE = interfaceC3207pE.i(interfaceC3207pE.f() - iF2).e();
            iHashCode3 = i6 + (moE != null ? moE.hashCode() : 0);
            iF2 = i5;
        }
    }

    public static boolean v(byte b2) {
        return b2 > -65;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object w(java.util.List r4, defpackage.InterfaceC3493uc r5) {
        /*
            boolean r0 = r5 instanceof defpackage.O6
            if (r0 == 0) goto L13
            r0 = r5
            O6 r0 = (defpackage.O6) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            O6 r0 = new O6
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.b
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.Iterator r4 = r0.a
            defpackage.AbstractC0115Ga.U(r5)
            goto L38
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.AbstractC0115Ga.U(r5)
            java.util.Iterator r4 = r4.iterator()
        L38:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4f
            java.lang.Object r5 = r4.next()
            Aq r5 = (defpackage.InterfaceC0029Aq) r5
            r0.a = r4
            r0.c = r3
            java.lang.Object r5 = r5.join(r0)
            if (r5 != r1) goto L38
            return r1
        L4f:
            DK r4 = defpackage.DK.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MO.w(java.util.List, uc):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:19:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object x(defpackage.InterfaceC0029Aq[] r6, defpackage.InterfaceC3493uc r7) {
        /*
            boolean r0 = r7 instanceof defpackage.N6
            if (r0 == 0) goto L13
            r0 = r7
            N6 r0 = (defpackage.N6) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            N6 r0 = new N6
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.d
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r6 = r0.c
            int r2 = r0.b
            java.lang.Object[] r4 = r0.a
            Aq[] r4 = (defpackage.InterfaceC0029Aq[]) r4
            defpackage.AbstractC0115Ga.U(r7)
            r7 = r4
            goto L53
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            defpackage.AbstractC0115Ga.U(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L40:
            if (r2 >= r6) goto L55
            r4 = r7[r2]
            r0.a = r7
            r0.b = r2
            r0.c = r6
            r0.e = r3
            java.lang.Object r4 = r4.join(r0)
            if (r4 != r1) goto L53
            return r1
        L53:
            int r2 = r2 + r3
            goto L40
        L55:
            DK r6 = defpackage.DK.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MO.x(Aq[], uc):java.lang.Object");
    }

    public static final void y(C0284Pq c0284Pq, InterfaceC3207pE interfaceC3207pE) {
        AbstractC0500aq.m(interfaceC3207pE, "<this>");
        AbstractC0500aq.m(c0284Pq, "json");
        if (AbstractC0500aq.b(interfaceC3207pE.e(), DH.w)) {
            c0284Pq.a.getClass();
        }
    }

    public static final InterfaceC0168Jc z(InterfaceC0304Rc interfaceC0304Rc, InterfaceC0168Jc interfaceC0168Jc) {
        InterfaceC0168Jc interfaceC0168JcP = p(interfaceC0304Rc.g(), interfaceC0168Jc, true);
        C0545bg c0545bg = AbstractC0600ch.a;
        return (interfaceC0168JcP == c0545bg || interfaceC0168JcP.get(C3397so.b) != null) ? interfaceC0168JcP : interfaceC0168JcP.plus(c0545bg);
    }

    public void J(View view, float f2) {
        if (t) {
            try {
                AbstractC3324rM.b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                t = false;
            }
        }
        view.setAlpha(f2);
    }

    public void K(View view, int i2) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!v) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                u = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            v = true;
        }
        Field field = u;
        if (field != null) {
            try {
                u.setInt(view, i2 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void M();

    public abstract void N();

    public boolean e() {
        return false;
    }

    public int hashCode() {
        switch (this.a) {
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public void n(C3299qx c3299qx) {
        List listSingletonList = Collections.singletonList(c3299qx);
        C0589cO c0589cO = (C0589cO) this;
        if (listSingletonList.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        RN rn = new RN(c0589cO, listSingletonList);
        if (rn.e) {
            C3130nt.d().g(RN.f, AbstractC3264qG.x("Already enqueued work ids (", TextUtils.join(", ", rn.c), ")"), new Throwable[0]);
        } else {
            ((D3) c0589cO.z).t(new RunnableC0310Ri(rn));
        }
    }

    public float t(View view) {
        if (t) {
            try {
                return AbstractC3324rM.a(view);
            } catch (NoSuchMethodError unused) {
                t = false;
            }
        }
        return view.getAlpha();
    }

    public String toString() {
        switch (this.a) {
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                String strB = PB.a(getClass()).b();
                AbstractC0500aq.j(strB);
                return strB;
            default:
                return super.toString();
        }
    }

    public void F() {
    }
}
