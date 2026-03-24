package com.google.android.gms.ads.internal.util.client;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbjn;
import com.google.android.gms.internal.ads.zzfvb;
import com.google.android.gms.internal.ads.zzfyn;
import defpackage.AbstractC3264qG;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import org.achartengine.renderer.DefaultRenderer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzf {
    public static final Handler zza = new zzfyn(Looper.getMainLooper());
    private static final String zzb = AdView.class.getName();
    private static final String zzc = InterstitialAd.class.getName();
    private static final String zzd = AdManagerAdView.class.getName();
    private static final String zze = AdManagerInterstitialAd.class.getName();
    private static final String zzf = zzfvb.class.getName();
    private static final String zzg = AdLoader.class.getName();
    private float zzh = -1.0f;

    public static final int zzA(DisplayMetrics displayMetrics, int i) {
        return Math.round(i / displayMetrics.density);
    }

    public static final void zzB(Context context, String str, String str2, Bundle bundle, boolean z, zze zzeVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            int apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(context);
            str = AbstractC3264qG.j(new StringBuilder(String.valueOf(apkVersion).length() + 10), apkVersion, ".254715000");
        }
        bundle.putString("js", str);
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter(FacebookMediationAdapter.KEY_ID, "gmob-apps");
        for (String str3 : bundle.keySet()) {
            builderAppendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        zzeVar.zza(builderAppendQueryParameter.toString());
    }

    public static final int zzC(Context context, int i) {
        return zzu(context.getResources().getDisplayMetrics(), i);
    }

    public static final String zzD(Context context) {
        zzbhe.zza(context);
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || zzw()) {
            string = "emulator";
        }
        return zzE(string, "MD5");
    }

    private static String zzE(String str, String str2) throws NoSuchAlgorithmException {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    private final JSONArray zzF(Collection collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zzG(jSONArray, it.next());
        }
        return jSONArray;
    }

    private final void zzG(JSONArray jSONArray, Object obj) throws JSONException {
        Object objZzn;
        if (obj instanceof Bundle) {
            objZzn = zzm((Bundle) obj);
        } else if (obj instanceof Map) {
            objZzn = zzk((Map) obj);
        } else if (obj instanceof Collection) {
            objZzn = zzF((Collection) obj);
        } else {
            if (!(obj instanceof Object[])) {
                jSONArray.put(obj);
                return;
            }
            objZzn = zzn((Object[]) obj);
        }
        jSONArray.put(objZzn);
    }

    private final void zzH(JSONObject jSONObject, String str, Object obj) throws JSONException {
        Boolean[] boolArr;
        Object objZzn;
        Long[] lArr;
        Double[] dArr;
        Integer[] numArr;
        Collection collectionAsList;
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzs)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            objZzn = zzm((Bundle) obj);
        } else if (obj instanceof Map) {
            objZzn = zzk((Map) obj);
        } else {
            if (obj instanceof Collection) {
                str = String.valueOf(str);
                collectionAsList = (Collection) obj;
            } else if (obj instanceof Object[]) {
                collectionAsList = Arrays.asList((Object[]) obj);
            } else {
                int i = 0;
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    if (iArr == null) {
                        numArr = new Integer[0];
                    } else {
                        int length = iArr.length;
                        Integer[] numArr2 = new Integer[length];
                        while (i < length) {
                            numArr2[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                        numArr = numArr2;
                    }
                    objZzn = zzn(numArr);
                } else if (obj instanceof double[]) {
                    double[] dArr2 = (double[]) obj;
                    if (dArr2 == null) {
                        dArr = new Double[0];
                    } else {
                        int length2 = dArr2.length;
                        Double[] dArr3 = new Double[length2];
                        while (i < length2) {
                            dArr3[i] = Double.valueOf(dArr2[i]);
                            i++;
                        }
                        dArr = dArr3;
                    }
                    objZzn = zzn(dArr);
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    if (jArr == null) {
                        lArr = new Long[0];
                    } else {
                        int length3 = jArr.length;
                        Long[] lArr2 = new Long[length3];
                        while (i < length3) {
                            lArr2[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                        lArr = lArr2;
                    }
                    objZzn = zzn(lArr);
                } else {
                    if (!(obj instanceof boolean[])) {
                        jSONObject.put(str, obj);
                        return;
                    }
                    boolean[] zArr = (boolean[]) obj;
                    if (zArr == null) {
                        boolArr = new Boolean[0];
                    } else {
                        int length4 = zArr.length;
                        Boolean[] boolArr2 = new Boolean[length4];
                        while (i < length4) {
                            boolArr2[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                        boolArr = boolArr2;
                    }
                    objZzn = zzn(boolArr);
                }
            }
            objZzn = zzF(collectionAsList);
        }
        jSONObject.put(str, objZzn);
    }

    private static final void zzI(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, int i, int i2) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i);
        textView.setBackgroundColor(i2);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i);
        int iZzC = zzC(context, 3);
        int i3 = zzrVar.zzf;
        int i4 = zzrVar.zzc;
        frameLayout.addView(textView, new FrameLayout.LayoutParams(i3 - iZzC, i4 - iZzC, 17));
        viewGroup.addView(frameLayout, i3, i4);
    }

    public static Object zzd(Map map, Object obj, Object obj2) {
        return map.containsKey(obj) ? map.get(obj) : obj2;
    }

    public static ActivityManager.MemoryInfo zze(Context context) {
        ActivityManager activityManager;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        try {
            activityManager.getMemoryInfo(memoryInfo);
        } catch (NullPointerException unused) {
            zzo.zzi("Error retrieving the memory information.");
        }
        return memoryInfo;
    }

    public static String zzf(String str) {
        return zzE(str, "MD5");
    }

    public static String zzg(String str) {
        return zzE(str, "SHA-256");
    }

    public static String zzi() {
        UUID uuidRandomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(uuidRandomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(uuidRandomUUID.getMostSignificantBits()).toByteArray();
        String string = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                string = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return string;
    }

    public static AdSize zzj(Context context, int i, int i2, int i3) {
        float f;
        float f2;
        int iRound;
        int iZzp = zzp(context, i3);
        if (iZzp == -1) {
            return AdSize.INVALID;
        }
        int iMin = Math.min(90, Math.round(iZzp * 0.15f));
        if (i <= 655) {
            if (i > 632) {
                iRound = 81;
            } else if (i > 526) {
                f = i / 468.0f;
                f2 = 60.0f;
            } else if (i > 432) {
                iRound = 68;
            } else {
                f = i / 320.0f;
                f2 = 50.0f;
            }
            return new AdSize(i, Math.max(Math.min(iRound, iMin), 50));
        }
        f = i / 728.0f;
        f2 = 90.0f;
        iRound = Math.round(f * f2);
        return new AdSize(i, Math.max(Math.min(iRound, iMin), 50));
    }

    public static boolean zzo(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) zzbjn.zzd.zze());
    }

    public static int zzp(Context context, int i) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i2 = configuration.orientation;
        if (i == 0) {
            i = i2;
        }
        return Math.round((i == i2 ? displayMetrics.heightPixels : displayMetrics.widthPixels) / displayMetrics.density);
    }

    public static PreloadConfiguration zzq(zzft zzftVar) {
        PreloadConfiguration preloadConfigurationZzr = zzr(zzftVar);
        if (preloadConfigurationZzr == null) {
            return null;
        }
        PreloadConfiguration.Builder builder = new PreloadConfiguration.Builder(preloadConfigurationZzr.getAdUnitId());
        builder.setAdRequest(preloadConfigurationZzr.getAdRequest());
        builder.setBufferSize(preloadConfigurationZzr.getBufferSize());
        return builder.build();
    }

    public static PreloadConfiguration zzr(zzft zzftVar) {
        String str = zzftVar.zza;
        AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
        if (adFormat == null) {
            return null;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzftVar.zzc;
        AdRequest.Builder builder = new AdRequest.Builder();
        List list = zzmVar.zze;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                builder.addKeyword((String) it.next());
            }
        }
        builder.zza(zzmVar.zzm);
        Bundle bundle = zzmVar.zzn;
        for (String str2 : bundle.keySet()) {
            builder.addCustomTargeting(str2, bundle.getString(str2));
        }
        builder.setAdString(zzmVar.zzx);
        String str3 = zzmVar.zzl;
        if (str3 != null) {
            builder.setContentUrl(str3);
        }
        builder.setNeighboringContentUrls(zzmVar.zzv);
        builder.setRequestAgent(zzmVar.zzp);
        AdRequest adRequestBuild = builder.build();
        PreloadConfiguration.Builder builder2 = new PreloadConfiguration.Builder(str, adFormat);
        builder2.setAdRequest(adRequestBuild);
        builder2.setBufferSize(zzftVar.zzd);
        return builder2.build();
    }

    public static zzft zzs(Context context, PreloadConfiguration preloadConfiguration, AdFormat adFormat) {
        PreloadConfiguration.Builder builder = new PreloadConfiguration.Builder(preloadConfiguration.getAdUnitId(), adFormat);
        builder.setAdRequest(preloadConfiguration.getAdRequest());
        builder.setBufferSize(preloadConfiguration.getBufferSize());
        return zzt(context, builder.build(), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.ads.internal.client.zzft zzt(android.content.Context r5, com.google.android.gms.ads.preload.PreloadConfiguration r6, int r7) {
        /*
            com.google.android.gms.ads.internal.client.zzq r0 = com.google.android.gms.ads.internal.client.zzq.zza
            com.google.android.gms.ads.AdRequest r1 = r6.getAdRequest()
            com.google.android.gms.ads.internal.client.zzek r1 = r1.zza()
            com.google.android.gms.ads.internal.client.zzm r5 = r0.zza(r5, r1)
            r0 = 1
            if (r7 != r0) goto L19
            android.os.Bundle r7 = r5.zzc
            java.lang.String r1 = "is_sdk_preload"
        L15:
            r7.putBoolean(r1, r0)
            goto L1e
        L19:
            android.os.Bundle r7 = r5.zzc
            java.lang.String r1 = "zenith_v2"
            goto L15
        L1e:
            int r7 = r6.getBufferSize()
            r1 = 5
            r2 = 2
            if (r7 > 0) goto L4f
            com.google.android.gms.ads.AdFormat r7 = r6.getAdFormat()
            com.google.android.gms.ads.AdFormat r3 = com.google.android.gms.ads.AdFormat.BANNER
            int r7 = r7.ordinal()
            if (r7 == r0) goto L4c
            if (r7 == r2) goto L49
            if (r7 == r1) goto L38
            r7 = r0
            goto L53
        L38:
            com.google.android.gms.internal.ads.zzbgv r7 = com.google.android.gms.internal.ads.zzbhe.zzab
        L3a:
            com.google.android.gms.internal.ads.zzbhc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r7 = r3.zzd(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            goto L53
        L49:
            com.google.android.gms.internal.ads.zzbgv r7 = com.google.android.gms.internal.ads.zzbhe.zzad
            goto L3a
        L4c:
            com.google.android.gms.internal.ads.zzbgv r7 = com.google.android.gms.internal.ads.zzbhe.zzac
            goto L3a
        L4f:
            int r7 = r6.getBufferSize()
        L53:
            com.google.android.gms.ads.AdFormat r3 = r6.getAdFormat()
            com.google.android.gms.ads.AdFormat r4 = com.google.android.gms.ads.AdFormat.BANNER
            int r3 = r3.ordinal()
            if (r3 == r0) goto L79
            if (r3 == r2) goto L76
            if (r3 == r1) goto L65
            r3 = r0
            goto L7c
        L65:
            com.google.android.gms.internal.ads.zzbgv r3 = com.google.android.gms.internal.ads.zzbhe.zzY
        L67:
            com.google.android.gms.internal.ads.zzbhc r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r4.zzd(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L7c
        L76:
            com.google.android.gms.internal.ads.zzbgv r3 = com.google.android.gms.internal.ads.zzbhe.zzaa
            goto L67
        L79:
            com.google.android.gms.internal.ads.zzbgv r3 = com.google.android.gms.internal.ads.zzbhe.zzZ
            goto L67
        L7c:
            r4 = 15
            int r3 = java.lang.Math.min(r3, r4)
            int r3 = java.lang.Math.max(r3, r0)
            com.google.android.gms.ads.AdFormat r4 = r6.getAdFormat()
            int r4 = r4.ordinal()
            if (r4 == r0) goto La9
            if (r4 == r2) goto La6
            if (r4 == r1) goto L95
            goto Lac
        L95:
            com.google.android.gms.internal.ads.zzbgv r0 = com.google.android.gms.internal.ads.zzbhe.zzae
        L97:
            com.google.android.gms.internal.ads.zzbhc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto Lac
        La6:
            com.google.android.gms.internal.ads.zzbgv r0 = com.google.android.gms.internal.ads.zzbhe.zzag
            goto L97
        La9:
            com.google.android.gms.internal.ads.zzbgv r0 = com.google.android.gms.internal.ads.zzbhe.zzaf
            goto L97
        Lac:
            int r0 = java.lang.Math.min(r0, r3)
            int r7 = java.lang.Math.min(r7, r3)
            int r7 = java.lang.Math.max(r7, r0)
            com.google.android.gms.ads.internal.client.zzft r0 = new com.google.android.gms.ads.internal.client.zzft
            java.lang.String r1 = r6.getAdUnitId()
            com.google.android.gms.ads.AdFormat r6 = r6.getAdFormat()
            int r6 = r6.getValue()
            r0.<init>(r1, r6, r5, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.client.zzf.zzt(android.content.Context, com.google.android.gms.ads.preload.PreloadConfiguration, int):com.google.android.gms.ads.internal.client.zzft");
    }

    public static final int zzu(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, i, displayMetrics);
    }

    public static final String zzv(StackTraceElement[] stackTraceElementArr, String str) {
        int i;
        String className;
        int i2 = 0;
        while (true) {
            i = i2 + 1;
            if (i >= stackTraceElementArr.length) {
                className = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            String className2 = stackTraceElement.getClassName();
            if ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (zzb.equalsIgnoreCase(className2) || zzc.equalsIgnoreCase(className2) || zzd.equalsIgnoreCase(className2) || zze.equalsIgnoreCase(className2) || zzf.equalsIgnoreCase(className2) || zzg.equalsIgnoreCase(className2))) {
                break;
            }
            i2 = i;
        }
        className = stackTraceElementArr[i].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                for (int i3 = 2; i3 > 0 && stringTokenizer.hasMoreElements(); i3--) {
                    sb.append(".");
                    sb.append(stringTokenizer.nextToken());
                }
                str = sb.toString();
            }
            if (className != null && !className.contains(str)) {
                return className;
            }
        }
        return null;
    }

    public static final boolean zzw() {
        boolean zBooleanValue = ((Boolean) zzbd.zzc().zzd(zzbhe.zzmR)).booleanValue();
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        if (str.contains("generic") || str.contains("emulator")) {
            return true;
        }
        return zBooleanValue && Build.HARDWARE.contains("ranchu");
    }

    public static final boolean zzx(Context context, int i) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, i) == 0;
    }

    public static final boolean zzy(Context context) {
        int iIsGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 12451000);
        return iIsGooglePlayServicesAvailable == 0 || iIsGooglePlayServicesAvailable == 2;
    }

    public static final boolean zzz() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public final int zza(Context context, int i) {
        if (this.zzh < 0.0f) {
            synchronized (this) {
                try {
                    if (this.zzh < 0.0f) {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        if (windowManager == null) {
                            return 0;
                        }
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        this.zzh = displayMetrics.density;
                    }
                } finally {
                }
            }
        }
        return Math.round(i / this.zzh);
    }

    public final void zzb(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, String str2) {
        if (str2 != null) {
            zzo.zzi(str2);
        }
        zzI(viewGroup, zzrVar, str, -65536, DefaultRenderer.BACKGROUND_COLOR);
    }

    public final void zzc(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar, String str) {
        zzI(viewGroup, zzrVar, "Ads by Google", DefaultRenderer.BACKGROUND_COLOR, -1);
    }

    public final void zzh(final Context context, String str, String str2, Bundle bundle, boolean z) {
        zzB(context, str, "gmob-apps", bundle, true, new zze() { // from class: com.google.android.gms.ads.internal.util.client.zzd
            @Override // com.google.android.gms.ads.internal.util.client.zze
            public final /* synthetic */ zzt zza(String str3) {
                new zzc(this.zza, context, str3).start();
                return zzt.SUCCESS;
            }
        });
    }

    public final JSONObject zzk(Map map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                zzH(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e.getMessage())));
        }
    }

    public final JSONObject zzl(Bundle bundle, JSONObject jSONObject) {
        if (bundle == null) {
            return null;
        }
        try {
            return zzm(bundle);
        } catch (JSONException e) {
            zzo.zzg("Error converting Bundle to JSON", e);
            return null;
        }
    }

    public final JSONObject zzm(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            zzH(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONArray zzn(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            zzG(jSONArray, obj);
        }
        return jSONArray;
    }
}
