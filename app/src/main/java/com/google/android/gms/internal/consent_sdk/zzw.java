package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import defpackage.C0116Gb;
import defpackage.EnumC0082Eb;
import defpackage.InterfaceC0048Cb;
import defpackage.InterfaceC0065Db;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzw {
    private final Application zza;
    private final Handler zzb;
    private final Executor zzc;
    private final zzaq zzd;
    private final zzbo zze;
    private final zzn zzf;
    private final zzz zzg;
    private final zze zzh;

    public zzw(Application application, zzad zzadVar, Handler handler, Executor executor, zzaq zzaqVar, zzbo zzboVar, zzn zznVar, zzz zzzVar, zze zzeVar) {
        this.zza = application;
        this.zzb = handler;
        this.zzc = executor;
        this.zzd = zzaqVar;
        this.zze = zzboVar;
        this.zzf = zznVar;
        this.zzg = zzzVar;
        this.zzh = zzeVar;
    }

    public static /* synthetic */ void zza(final zzw zzwVar, Activity activity, C0116Gb c0116Gb, final InterfaceC0065Db interfaceC0065Db, final InterfaceC0048Cb interfaceC0048Cb) throws IOException {
        try {
            c0116Gb.getClass();
            Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + zzcm.zza(zzwVar.zza) + "\") to set this as a debug device.");
            final zzab zzabVarZza = new zzy(zzwVar.zzg, zzwVar.zzd(zzwVar.zzf.zzc(activity, c0116Gb))).zza();
            zzaq zzaqVar = zzwVar.zzd;
            zzaqVar.zzg(zzabVarZza.zza);
            zzaqVar.zzi(zzabVarZza.zzb);
            zzwVar.zze.zzd(zzabVarZza.zzc);
            zzwVar.zzh.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzu
                @Override // java.lang.Runnable
                public final void run() {
                    zzw.zzb(this.zza, interfaceC0065Db, zzabVarZza);
                }
            });
        } catch (zzg e) {
            zzwVar.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzr
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC0048Cb.onConsentInfoUpdateFailure(e.zza());
                }
            });
        } catch (RuntimeException e2) {
            final zzg zzgVar = new zzg(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e2))));
            zzwVar.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzs
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC0048Cb.onConsentInfoUpdateFailure(zzgVar.zza());
                }
            });
        }
    }

    public static /* synthetic */ void zzb(zzw zzwVar, final InterfaceC0065Db interfaceC0065Db, zzab zzabVar) {
        Objects.requireNonNull(interfaceC0065Db);
        zzwVar.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzt
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC0065Db.onConsentInfoUpdateSuccess();
            }
        });
        if (zzabVar.zzb != EnumC0082Eb.b) {
            zzwVar.zze.zzc();
        }
    }

    private final zzcl zzd(zzcj zzcjVar) throws zzg, IOException {
        String str;
        String str2;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent(this.zza));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str3 = zzcjVar.zza;
                    if (str3 != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str3);
                    }
                    zzcf zzcfVar = zzcjVar.zzb;
                    if (zzcfVar != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        int i = zzcfVar.zzc;
                        if (i != 1) {
                            jsonWriter.name("os_type");
                            int i2 = i - 1;
                            if (i2 == 0) {
                                str2 = "UNKNOWN";
                            } else if (i2 == 1) {
                                str2 = "ANDROID";
                            }
                            jsonWriter.value(str2);
                        }
                        String str4 = zzcfVar.zza;
                        if (str4 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str4);
                        }
                        Integer num = zzcfVar.zzb;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str5 = zzcjVar.zzc;
                    if (str5 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str5);
                    }
                    Boolean bool = zzcjVar.zzd;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    Map map = zzcjVar.zze;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    zzch zzchVar = zzcjVar.zzf;
                    if (zzchVar != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = zzchVar.zza;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = zzchVar.zzb;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d = zzchVar.zzc;
                        if (d != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d);
                        }
                        List<zzcg> list = zzchVar.zzd;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (zzcg zzcgVar : list) {
                                jsonWriter.beginObject();
                                Integer num4 = zzcgVar.zza;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = zzcgVar.zzb;
                                if (num5 != null) {
                                    jsonWriter.name("left");
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = zzcgVar.zzc;
                                if (num6 != null) {
                                    jsonWriter.name("right");
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = zzcgVar.zzd;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    zzcd zzcdVar = zzcjVar.zzg;
                    if (zzcdVar != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str6 = zzcdVar.zza;
                        if (str6 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str6);
                        }
                        String str7 = zzcdVar.zzb;
                        if (str7 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str7);
                        }
                        String str8 = zzcdVar.zzc;
                        if (str8 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str8);
                        }
                        jsonWriter.endObject();
                    }
                    zzci zzciVar = zzcjVar.zzh;
                    if (zzciVar != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        String str9 = zzciVar.zza;
                        if (str9 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str9);
                        }
                        jsonWriter.endObject();
                    }
                    List list2 = zzcjVar.zzi;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            switch (((zzce) it.next()).ordinal()) {
                                case 0:
                                    str = "DEBUG_PARAM_UNKNOWN";
                                    break;
                                case 1:
                                    str = "ALWAYS_SHOW";
                                    break;
                                case 2:
                                    str = "GEO_OVERRIDE_EEA";
                                    break;
                                case 3:
                                    str = "GEO_OVERRIDE_REGULATED_US_STATE";
                                    break;
                                case 4:
                                    str = "GEO_OVERRIDE_OTHER";
                                    break;
                                case 5:
                                    str = "GEO_OVERRIDE_NON_EEA";
                                    break;
                                case 6:
                                    str = "PREVIEWING_DEBUG_MESSAGES";
                                    break;
                                default:
                                    continue;
                            }
                            jsonWriter.value(str);
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                    }
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        zzcl zzclVarZza = zzcl.zza(new JsonReader(new StringReader(headerField)));
                        zzclVarZza.zza = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return zzclVarZza;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            zzcl zzclVarZza2 = zzcl.zza(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return zzclVarZza2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (SocketTimeoutException e) {
            throw new zzg(4, "The server timed out.", e);
        } catch (IOException e2) {
            throw new zzg(2, "Error making request.", e2);
        }
    }

    public final void zzc(final Activity activity, final C0116Gb c0116Gb, final InterfaceC0065Db interfaceC0065Db, final InterfaceC0048Cb interfaceC0048Cb) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzv
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                zzw.zza(this.zza, activity, c0116Gb, interfaceC0065Db, interfaceC0048Cb);
            }
        });
    }
}
