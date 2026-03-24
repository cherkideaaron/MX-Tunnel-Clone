package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.internal.p002firebaseauthapi.zzac;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import com.mxtunnel.pro.R;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class H2 {
    public Object a;
    public Object b;
    public Object c;
    public Object d = "pwdv1";
    public Object e;
    public Object f;

    public H2(YD yd) {
        this.c = yd;
        o(false);
    }

    public static J5 a(J5 j5, R2 r2, C3429tJ c3429tJ, Map map) {
        Map mapUnmodifiableMap;
        I5 i5A = j5.a();
        String strE = ((InterfaceC2574dk) r2.c).e();
        if (strE != null) {
            i5A.e = new W5(strE);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        c3429tJ.getClass();
        boolean zIsEmpty = map.isEmpty();
        C0312Rk c0312Rk = (C0312Rk) c3429tJ.d;
        if (zIsEmpty) {
            mapUnmodifiableMap = ((C3293qr) ((AtomicMarkableReference) c0312Rk.b).getReference()).a();
        } else {
            HashMap map2 = new HashMap(((C3293qr) ((AtomicMarkableReference) c0312Rk.b).getReference()).a());
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strB = C3293qr.b(UserVerificationMethods.USER_VERIFY_ALL, (String) entry.getKey());
                if (map2.size() < 64 || map2.containsKey(strB)) {
                    map2.put(strB, C3293qr.b(UserVerificationMethods.USER_VERIFY_ALL, (String) entry.getValue()));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            mapUnmodifiableMap = Collections.unmodifiableMap(map2);
        }
        List listK = k(mapUnmodifiableMap);
        List listK2 = k(((C3293qr) ((AtomicMarkableReference) ((C0312Rk) c3429tJ.e).b).getReference()).a());
        if (!listK.isEmpty() || !listK2.isEmpty()) {
            K5 k5 = (K5) j5.c;
            AbstractC3710yd abstractC3710yd = k5.a;
            if (abstractC3710yd == null) {
                StringBuilder sb = new StringBuilder();
                if (abstractC3710yd == null) {
                    sb.append(" execution");
                }
                throw new IllegalStateException(AbstractC3264qG.i("Missing required properties:", sb));
            }
            i5A.c = new K5(abstractC3710yd, listK, listK2, k5.d, k5.e, k5.f, k5.g);
        }
        return i5A.a();
    }

    public static AbstractC0118Gd b(J5 j5, C3429tJ c3429tJ) {
        List listD = ((C3249q1) c3429tJ.f).d();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listD.size(); i++) {
            RC rc = (RC) listD.get(i);
            rc.getClass();
            X5 x5 = new X5();
            A6 a6 = (A6) rc;
            String str = a6.e;
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            String str2 = a6.b;
            if (str2 == null) {
                throw new NullPointerException("Null rolloutId");
            }
            x5.a = new Z5(str2, str);
            String str3 = a6.c;
            if (str3 == null) {
                throw new NullPointerException("Null parameterKey");
            }
            x5.b = str3;
            String str4 = a6.d;
            if (str4 == null) {
                throw new NullPointerException("Null parameterValue");
            }
            x5.c = str4;
            x5.d = a6.f;
            x5.e = (byte) (x5.e | 1);
            arrayList.add(x5.a());
        }
        if (arrayList.isEmpty()) {
            return j5;
        }
        I5 i5A = j5.a();
        i5A.f = new C0462a6(arrayList);
        return i5A.a();
    }

    public static boolean c(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static String d(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = bufferedInputStream.read(bArr);
                    if (i == -1) {
                        String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return string;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static H2 e(Context context, C2578dp c2578dp, C3121nk c3121nk, C3 c3, R2 r2, C3429tJ c3429tJ, C3178om c3178om, C3308r6 c3308r6, C3178om c3178om2, C0487ad c0487ad, D3 d3) {
        C0203Ld c0203Ld = new C0203Ld(context, c2578dp, c3, c3178om, c3308r6);
        C0254Od c0254Od = new C0254Od(c3121nk, c3308r6, c0487ad);
        C0237Nd c0237Nd = C3712yf.b;
        C2610eK.b(context);
        C3712yf c3712yf = new C3712yf(new C3040mC(C2610eK.a().c(new C0573c8(C3712yf.c, C3712yf.d)).a("FIREBASE_CRASHLYTICS_REPORT", new C0174Ji("json"), C3712yf.e), c3308r6.f(), c3178om2));
        H2 h2 = new H2();
        h2.a = c0203Ld;
        h2.b = c0254Od;
        h2.c = c3712yf;
        h2.d = r2;
        h2.e = c3429tJ;
        h2.f = c2578dp;
        return h2;
    }

    public static ColorStateList f(Context context, int i) {
        int iC = PI.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{PI.b, PI.d, PI.c, PI.f}, new int[]{PI.b(context, R.attr.colorButtonNormal), AbstractC0013Aa.b(iC, i), AbstractC0013Aa.b(iC, i), i});
    }

    public static LayerDrawable j(C3584wC c3584wC, Context context, int i) throws Resources.NotFoundException {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableF = c3584wC.f(context, R.drawable.abc_star_black_48dp);
        Drawable drawableF2 = c3584wC.f(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableF instanceof BitmapDrawable) && drawableF.getIntrinsicWidth() == dimensionPixelSize && drawableF.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableF;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableF.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableF2 instanceof BitmapDrawable) && drawableF2.getIntrinsicWidth() == dimensionPixelSize && drawableF2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableF2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableF2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static List k(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new C3739z5(str, str2));
        }
        Collections.sort(arrayList, new C0440Zc(4));
        return Collections.unmodifiableList(arrayList);
    }

    public static void s(Drawable drawable, int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterH;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = I2.b;
        }
        PorterDuff.Mode mode2 = I2.b;
        synchronized (I2.class) {
            porterDuffColorFilterH = C3584wC.h(i, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterH);
    }

    public String g(String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArr;
        byte[] bArrM = m();
        if (bArrM != null && (bArr = (byte[]) this.e) != null && !Arrays.equals(bArrM, bArr)) {
            o(false);
        }
        if (str == null || ((SecretKeySpec) this.f) == null || ((String) this.d) == null) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            Cipher cipher = Cipher.getInstance((String) this.a);
            cipher.init(2, (SecretKeySpec) this.f, (IvParameterSpec) this.b);
            return new String(cipher.doFinal(bArrDecode), "UTF-8");
        } catch (Exception e) {
            Log.e("PasswordUtil", "de", e);
            o(true);
            return null;
        }
    }

    public Task h(Task task) {
        return task.continueWith(new P3(1), new C0285Qa(this, 6));
    }

    public String i(String str, String str2) {
        try {
            return g(((YD) this.c).getString(n(str, str2), null));
        } catch (ClassCastException unused) {
            Log.d("PasswordUtil", "get() class cast exception");
            o(true);
            return null;
        }
    }

    public ColorStateList l(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return AbstractC0115Ga.u(context, R.color.abc_tint_edittext);
        }
        if (i == 2131230826) {
            return AbstractC0115Ga.u(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return f(context, PI.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return f(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return f(context, PI.c(context, R.attr.colorAccent));
            }
            if (i == 2131230821 || i == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC0115Ga.u(context, R.color.abc_tint_spinner);
            }
            if (c((int[]) this.b, i)) {
                return PI.d(context, R.attr.colorControlNormal);
            }
            if (c((int[]) this.e, i)) {
                return AbstractC0115Ga.u(context, R.color.abc_tint_default);
            }
            if (c((int[]) this.f, i)) {
                return AbstractC0115Ga.u(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC0115Ga.u(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = PI.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = PI.b;
            iArr2[0] = PI.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = PI.e;
            iArr2[1] = PI.c(context, R.attr.colorControlActivated);
            iArr[2] = PI.f;
            iArr2[2] = PI.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = PI.b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = PI.e;
            iArr2[1] = PI.c(context, R.attr.colorControlActivated);
            iArr[2] = PI.f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public byte[] m() {
        try {
            String string = ((YD) this.c).getString(n("settings", "entropy"), null);
            if (string != null) {
                return Base64.decode(string, 0);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public String n(String str, String str2) {
        return ((String) this.d) + "." + str + "." + str2;
    }

    public void o(boolean z) {
        this.a = "AES/CBC/PKCS5Padding";
        byte[] bArr = {-42, -31, -117, 101, 25, 119, 127, 37, 121, -54, 46, 49, -35, -48, -72, 97};
        this.e = null;
        if (!z) {
            this.e = m();
        }
        if (z || ((byte[]) this.e) == null) {
            YD yd = (YD) this.c;
            SharedPreferences.Editor editorEdit = yd.edit();
            Set<String> setKeySet = ((HashMap) yd.getAll()).keySet();
            String strG = AbstractC3264qG.g((String) this.d, ".");
            for (String str : setKeySet) {
                if (str.startsWith(strG)) {
                    ((XD) editorEdit).remove(str);
                }
            }
            ((XD) editorEdit).apply();
            byte[] bArr2 = new byte[16];
            new SecureRandom().nextBytes(bArr2);
            XD xd = (XD) yd.edit();
            xd.putString(n("settings", "entropy"), Base64.encodeToString(bArr2, 2));
            xd.apply();
            this.e = m();
        }
        if (((byte[]) this.e) != null) {
            try {
                this.f = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec("It was a bright cold day in April, and the clocks were striking thirteen. Winston Smith, his chin nuzzled into his breast in an effort to escape the vile wind, slipped quickly through the glass doors of Victory Mansions, though not quickly enough to prevent a swirl of gritty dust from entering along with him.".toCharArray(), (byte[]) this.e, 16, UserVerificationMethods.USER_VERIFY_PATTERN)).getEncoded(), (String) this.a);
                this.b = new IvParameterSpec(bArr);
                return;
            } catch (Exception e) {
                Log.e("PasswordUtil", "regenerate", e);
            }
        }
        this.f = null;
        this.d = null;
    }

    public void p(String str, String str2) {
        XD xd = (XD) ((YD) this.c).edit();
        xd.remove(n(str, str2));
        xd.apply();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:? -> B:38:0x0138). Please report as a decompilation issue!!! */
    public Task q(ExecutorC0305Rd executorC0305Rd, String str) {
        ArrayBlockingQueue arrayBlockingQueue;
        TaskCompletionSource taskCompletionSource;
        String str2 = str;
        ArrayList arrayListB = ((C0254Od) this.b).b();
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                C0237Nd c0237Nd = C0254Od.g;
                String strE = C0254Od.e(file);
                c0237Nd.getClass();
                arrayList.add(new C3523v5(C0237Nd.i(strE), file.getName(), file));
            } catch (IOException e) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C3523v5 c3523v5 = (C3523v5) it2.next();
            if (str2 == null || str2.equals(c3523v5.b)) {
                C3712yf c3712yf = (C3712yf) this.c;
                C3469u5 c3469u5 = (C3469u5) c3523v5.a;
                if (c3469u5.f == null || c3469u5.g == null) {
                    C0159Ik c0159IkB = ((C2578dp) this.f).b(true);
                    C3415t5 c3415t5A = c3523v5.a.a();
                    c3415t5A.e = c0159IkB.a;
                    C3415t5 c3415t5A2 = c3415t5A.a().a();
                    c3415t5A2.f = c0159IkB.b;
                    c3523v5 = new C3523v5(c3415t5A2.a(), c3523v5.b, c3523v5.c);
                }
                boolean z = str2 != null;
                C3040mC c3040mC = c3712yf.a;
                ArrayBlockingQueue arrayBlockingQueue2 = c3040mC.f;
                synchronized (arrayBlockingQueue2) {
                    try {
                        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                        if (z) {
                            ((AtomicInteger) c3040mC.i.b).getAndIncrement();
                            if (c3040mC.f.size() < c3040mC.e) {
                                C0360Uh c0360Uh = C0360Uh.f;
                                c0360Uh.t("Enqueueing report: " + c3523v5.b);
                                c0360Uh.t("Queue size: " + c3040mC.f.size());
                                taskCompletionSource = taskCompletionSource2;
                                arrayBlockingQueue = arrayBlockingQueue2;
                                try {
                                    c3040mC.g.execute(new RunnableC0354Ub(c3040mC, c3523v5, taskCompletionSource2, 5, false));
                                    c0360Uh.t("Closing task for report: " + c3523v5.b);
                                    taskCompletionSource.trySetResult(c3523v5);
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            } else {
                                taskCompletionSource = taskCompletionSource2;
                                arrayBlockingQueue = arrayBlockingQueue2;
                                c3040mC.a();
                                String str3 = "Dropping report due to queue being full: " + c3523v5.b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str3, null);
                                }
                                ((AtomicInteger) c3040mC.i.c).getAndIncrement();
                                taskCompletionSource.trySetResult(c3523v5);
                            }
                        } else {
                            taskCompletionSource = taskCompletionSource2;
                            arrayBlockingQueue = arrayBlockingQueue2;
                            c3040mC.b(c3523v5, taskCompletionSource);
                        }
                        arrayList2.add(taskCompletionSource.getTask().continueWith(executorC0305Rd, new C0285Qa(this, 11)));
                    } catch (Throwable th2) {
                        th = th2;
                        arrayBlockingQueue = arrayBlockingQueue2;
                        throw th;
                    }
                }
            }
            str2 = str;
        }
        return Tasks.whenAll(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void r(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.H2.r(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    public Task t(String str, String str2, Bundle bundle) {
        try {
            r(str, str2, bundle);
            return ((Rpc) this.c).send(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return Tasks.forException(e);
        }
    }

    public Task u(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        Task taskContinueWithTask;
        if (zzac.zzc(str)) {
            str = "*";
        }
        Task taskV = v(str);
        if (bool.booleanValue() || taskV == null) {
            String str2 = zzac.zzc(str) ? "*" : str;
            if (bool.booleanValue() || (taskContinueWithTask = v(str2)) == null) {
                FirebaseAuth firebaseAuth = (FirebaseAuth) this.e;
                taskContinueWithTask = firebaseAuth.e.zza(firebaseAuth.i, "RECAPTCHA_ENTERPRISE").continueWithTask(new C3178om(this, str2));
            }
            taskV = taskContinueWithTask;
        }
        return taskV.continueWithTask(new WN(this, recaptchaAction));
    }

    public Task v(String str) {
        Task task;
        synchronized (this.a) {
            task = (Task) ((HashMap) this.b).get(str);
        }
        return task;
    }
}
