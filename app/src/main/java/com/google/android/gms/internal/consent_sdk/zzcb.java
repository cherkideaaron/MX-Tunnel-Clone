package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzcb implements zzd {
    private final Application zza;
    private final zzbx zzb;
    private final Handler zzc;
    private final Executor zzd;
    private final zze zze;
    private final zzao zzf;
    private final zzbc zzg;
    private final zzaq zzh;

    public zzcb(Application application, zzbx zzbxVar, Handler handler, Executor executor, zze zzeVar, zzao zzaoVar, zzbc zzbcVar, zzaq zzaqVar) {
        this.zza = application;
        this.zzb = zzbxVar;
        this.zzc = handler;
        this.zzd = executor;
        this.zze = zzeVar;
        this.zzf = zzaoVar;
        this.zzg = zzbcVar;
        this.zzh = zzaqVar;
    }

    public static /* synthetic */ void zzc(zzcb zzcbVar) throws JSONException {
        String strConcat;
        JSONObject jSONObject = new JSONObject();
        Application application = zzcbVar.zza;
        try {
            jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
            Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
            if (applicationIcon == null) {
                strConcat = null;
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strConcat = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
            }
            jSONObject.put("app_icon", strConcat);
            JSONObject jSONObject2 = new JSONObject();
            zzaq zzaqVar = zzcbVar.zzh;
            for (String str : zzaqVar.zzc().keySet()) {
                jSONObject2.put(str, zzaqVar.zzc().get(str));
            }
            jSONObject.put("stored_infos_map", jSONObject2);
        } catch (JSONException unused) {
        }
        zzcbVar.zzg.zzc().zzd("UMP_configureFormWithAppAssets", jSONObject.toString());
    }

    private final void zzg(JSONObject jSONObject) {
        String strOptString = jSONObject.optString(ImagesContract.URL);
        if (TextUtils.isEmpty(strOptString)) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
        }
        Uri uri = Uri.parse(strOptString);
        if (uri.getScheme() == null) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty scheme: ".concat(String.valueOf(strOptString)));
        }
        try {
            this.zzb.startActivity(new Intent("android.intent.action.VIEW", uri));
        } catch (ActivityNotFoundException e) {
            Log.d("UserMessagingPlatform", "Action[browser]: can not open url: ".concat(String.valueOf(strOptString)), e);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final Executor zza() {
        final Handler handler = this.zzc;
        Objects.requireNonNull(handler);
        return new Executor() { // from class: com.google.android.gms.internal.consent_sdk.zzbz
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    @Override // com.google.android.gms.internal.consent_sdk.zzd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzb(java.lang.String r8, org.json.JSONObject r9) {
        /*
            r7 = this;
            int r0 = r8.hashCode()
            r1 = -1
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            switch(r0) {
                case -1370505102: goto L2b;
                case -278739366: goto L21;
                case 150940456: goto L17;
                case 1671672458: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L35
        Ld:
            java.lang.String r0 = "dismiss"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L35
            r8 = r5
            goto L36
        L17:
            java.lang.String r0 = "browser"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L35
            r8 = r3
            goto L36
        L21:
            java.lang.String r0 = "configure_app_assets"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L35
            r8 = r4
            goto L36
        L2b:
            java.lang.String r0 = "load_complete"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L35
            r8 = r2
            goto L36
        L35:
            r8 = r1
        L36:
            if (r8 == 0) goto Lb2
            if (r8 == r5) goto L47
            if (r8 == r3) goto L43
            if (r8 == r4) goto L3f
            return r2
        L3f:
            r7.zzd()
            return r5
        L43:
            r7.zzg(r9)
            return r5
        L47:
            java.lang.String r8 = "status"
            java.lang.String r8 = r9.optString(r8)
            int r9 = r8.hashCode()
            r0 = 4
            r6 = 5
            switch(r9) {
                case -954325659: goto L89;
                case -258041904: goto L7f;
                case 429411856: goto L75;
                case 467888915: goto L6b;
                case 1666911234: goto L61;
                case 1725474845: goto L57;
                default: goto L56;
            }
        L56:
            goto L92
        L57:
            java.lang.String r9 = "CONSENT_SIGNAL_NOT_REQUIRED"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L92
            r1 = r6
            goto L92
        L61:
            java.lang.String r9 = "non_personalized"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L92
            r1 = r3
            goto L92
        L6b:
            java.lang.String r9 = "CONSENT_SIGNAL_PERSONALIZED_ADS"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L92
            r1 = r5
            goto L92
        L75:
            java.lang.String r9 = "CONSENT_SIGNAL_SUFFICIENT"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L92
            r1 = r0
            goto L92
        L7f:
            java.lang.String r9 = "personalized"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L92
            r1 = r2
            goto L92
        L89:
            java.lang.String r9 = "CONSENT_SIGNAL_NON_PERSONALIZED_ADS"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L92
            r1 = r4
        L92:
            if (r1 == 0) goto Lac
            if (r1 == r5) goto Lac
            if (r1 == r3) goto Lac
            if (r1 == r4) goto Lac
            if (r1 == r0) goto Lac
            if (r1 == r6) goto Lab
            com.google.android.gms.internal.consent_sdk.zzbc r8 = r7.zzg
            com.google.android.gms.internal.consent_sdk.zzg r9 = new com.google.android.gms.internal.consent_sdk.zzg
            java.lang.String r0 = "We are getting something wrong with the webview."
            r9.<init>(r5, r0)
            r8.zzh(r9)
            goto Lb1
        Lab:
            r4 = r5
        Lac:
            com.google.android.gms.internal.consent_sdk.zzbc r8 = r7.zzg
            r8.zzg(r4)
        Lb1:
            return r5
        Lb2:
            com.google.android.gms.internal.consent_sdk.zzbc r8 = r7.zzg
            r8.zzi()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzcb.zzb(java.lang.String, org.json.JSONObject):boolean");
    }

    public final void zzd() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzca
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                zzcb.zzc(this.zza);
            }
        });
    }

    public final void zze(String str) {
        Log.d("UserMessagingPlatform", "Receive consent action: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        this.zze.zzb(uri.getQueryParameter("action"), uri.getQueryParameter("args"), this, this.zzf);
    }

    public final void zzf(int i, String str, String str2) {
        Locale locale = Locale.US;
        this.zzg.zzj(new zzg(2, "WebResourceError(" + i + ", " + str2 + "): " + str));
    }
}
