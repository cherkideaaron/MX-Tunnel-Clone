package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import defpackage.Vs;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class zzcdw {
    final String zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzl;
    long zza = -1;
    long zzb = -1;
    int zzc = -1;
    int zzd = -1;
    long zze = 0;
    private final Object zzj = new Object();
    private final Object zzk = new Object();
    int zzg = 0;
    int zzh = 0;
    int zzi = 0;
    private int zzm = 0;
    private final Map zzn = new HashMap();
    private final Map zzo = new HashMap();

    public zzcdw(String str, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzf = str;
        this.zzl = zzgVar;
    }

    private final void zzj() {
        if (((Boolean) zzbjl.zza.zze()).booleanValue()) {
            synchronized (this.zzj) {
                this.zzc--;
                this.zzd--;
            }
        }
    }

    public final void zza() {
        synchronized (this.zzj) {
            this.zzg++;
        }
    }

    public final void zzb() {
        synchronized (this.zzj) {
            this.zzh++;
        }
    }

    public final void zzc() {
        synchronized (this.zzj) {
            this.zzi++;
        }
    }

    public final int zzd() {
        int i;
        synchronized (this.zzj) {
            i = this.zzi;
        }
        return i;
    }

    public final void zze(com.google.android.gms.ads.internal.client.zzm zzmVar, long j) {
        Bundle bundle;
        synchronized (this.zzj) {
            try {
                com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzl;
                long jZzm = zzgVar.zzm();
                long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                if (this.zzb == -1) {
                    if (jCurrentTimeMillis - jZzm > ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbB)).longValue()) {
                        this.zzd = -1;
                    } else {
                        this.zzd = zzgVar.zzo();
                    }
                    this.zzb = j;
                }
                this.zza = j;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzew)).booleanValue() || (bundle = zzmVar.zzc) == null || bundle.getInt("gw", 2) != 1) {
                    this.zzc++;
                    int i = this.zzd + 1;
                    this.zzd = i;
                    if (i == 0) {
                        this.zze = 0L;
                        zzgVar.zzp(jCurrentTimeMillis);
                    } else {
                        this.zze = jCurrentTimeMillis - zzgVar.zzq();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzf() {
        zzj();
    }

    public final void zzg() {
        zzj();
    }

    public final Bundle zzh(Context context, String str) {
        Bundle bundle;
        String str2;
        synchronized (this.zzj) {
            try {
                bundle = new Bundle();
                if (!this.zzl.zzx()) {
                    bundle.putString("session_id", this.zzf);
                }
                bundle.putLong("basets", this.zzb);
                bundle.putLong("currts", this.zza);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", this.zzc);
                bundle.putInt("preqs_in_session", this.zzd);
                bundle.putLong("time_in_session", this.zze);
                bundle.putInt("pclick", this.zzg);
                bundle.putInt("pimp", this.zzh);
                Context contextZza = zzcae.zza(context);
                int identifier = contextZza.getResources().getIdentifier("Theme.Translucent", "style", "android");
                boolean z = false;
                if (identifier == 0) {
                    str2 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                } else {
                    try {
                        if (identifier == contextZza.getPackageManager().getActivityInfo(new ComponentName(contextZza.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                            z = true;
                        } else {
                            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Fail to fetch AdActivity theme");
                        str2 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
                    }
                    bundle.putBoolean("support_transparent_background", z);
                    bundle.putInt("consent_form_action_identifier", zzd());
                }
                com.google.android.gms.ads.internal.util.client.zzo.zzh(str2);
                bundle.putBoolean("support_transparent_background", z);
                bundle.putInt("consent_form_action_identifier", zzd());
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final zzcdv zzi(Set set, String str) {
        synchronized (this.zzk) {
            try {
                int i = this.zzm;
                this.zzm = i + 1;
                if (set.isEmpty()) {
                    return new zzcdv(i, -1, -1);
                }
                String strP = Vs.p(new TreeSet(set));
                Map map = this.zzn;
                Integer num = (Integer) map.get(strP);
                int iIntValue = 0;
                int iIntValue2 = num == null ? 0 : num.intValue();
                map.put(strP, Integer.valueOf(iIntValue2 + 1));
                if (str == null) {
                    return new zzcdv(i, iIntValue2, -1);
                }
                StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(strP).length());
                sb.append(str);
                sb.append("|");
                sb.append(strP);
                String string = sb.toString();
                Map map2 = this.zzo;
                Integer num2 = (Integer) map2.get(string);
                if (num2 != null) {
                    iIntValue = num2.intValue();
                }
                map2.put(string, Integer.valueOf(iIntValue + 1));
                return new zzcdv(i, iIntValue2, iIntValue);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
