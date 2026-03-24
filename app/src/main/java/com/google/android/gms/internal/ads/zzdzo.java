package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import defpackage.Vs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzdzo extends zzbpj {
    private final zzdzr zza;
    private final zzdzm zzb;
    private final Map zzc = new HashMap();

    public zzdzo(zzdzr zzdzrVar, zzdzm zzdzmVar) {
        this.zza = zzdzrVar;
        this.zzb = zzdzmVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.ads.internal.client.zzm zzc(java.util.Map r32) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdzo.zzc(java.util.Map):com.google.android.gms.ads.internal.client.zzm");
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zze(String str) throws NumberFormatException {
        long j;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzls)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received H5 gmsg: ".concat(String.valueOf(str)));
            Uri uri = Uri.parse(str);
            com.google.android.gms.ads.internal.zzt.zzc();
            Map mapZzV = com.google.android.gms.ads.internal.util.zzs.zzV(uri);
            String str2 = (String) mapZzV.get("action");
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzd("H5 gmsg did not contain an action");
                return;
            }
            str2.hashCode();
            if (str2.equals("initialize")) {
                this.zzc.clear();
                this.zzb.zza();
                return;
            }
            if (str2.equals("dispose_all")) {
                Map map = this.zzc;
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((zzdzi) it.next()).zzc();
                }
                map.clear();
                return;
            }
            String str3 = (String) mapZzV.get("obj_id");
            try {
                Objects.requireNonNull(str3);
                j = Long.parseLong(str3);
                switch (str2) {
                    case "create_interstitial_ad":
                        Map map2 = this.zzc;
                        if (map2.size() < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlt)).intValue()) {
                            Long lValueOf = Long.valueOf(j);
                            if (!map2.containsKey(lValueOf)) {
                                String str4 = (String) mapZzV.get("ad_unit");
                                if (!TextUtils.isEmpty(str4)) {
                                    zzdzj zzdzjVarZzc = this.zza.zzc();
                                    zzdzjVarZzc.zzc(j);
                                    zzdzjVarZzc.zzb(str4);
                                    map2.put(lValueOf, zzdzjVarZzc.zza().zza());
                                    this.zzb.zzb(j);
                                    StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 39 + String.valueOf(str4).length());
                                    Vs.y(sb, "Created H5 interstitial #", j, " with ad unit ");
                                    sb.append(str4);
                                    com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                                    break;
                                } else {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create H5 ad, missing ad unit id");
                                    this.zzb.zzc(j);
                                    break;
                                }
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not create H5 ad, object ID already exists");
                                this.zzb.zzc(j);
                                break;
                            }
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create H5 ad, too many existing objects");
                            this.zzb.zzc(j);
                            break;
                        }
                    case "load_interstitial_ad":
                        zzdzi zzdziVar = (zzdzi) this.zzc.get(Long.valueOf(j));
                        if (zzdziVar != null) {
                            zzdziVar.zza(zzc(mapZzV));
                            break;
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not load H5 ad, object ID does not exist");
                            this.zzb.zzd(j);
                            break;
                        }
                    case "show_interstitial_ad":
                        zzdzi zzdziVar2 = (zzdzi) this.zzc.get(Long.valueOf(j));
                        if (zzdziVar2 != null) {
                            zzdziVar2.zzb();
                            break;
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not show H5 ad, object ID does not exist");
                            this.zzb.zzd(j);
                            break;
                        }
                    case "create_rewarded_ad":
                        Map map3 = this.zzc;
                        if (map3.size() < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlt)).intValue()) {
                            Long lValueOf2 = Long.valueOf(j);
                            if (!map3.containsKey(lValueOf2)) {
                                String str5 = (String) mapZzV.get("ad_unit");
                                if (!TextUtils.isEmpty(str5)) {
                                    zzdzj zzdzjVarZzc2 = this.zza.zzc();
                                    zzdzjVarZzc2.zzc(j);
                                    zzdzjVarZzc2.zzb(str5);
                                    map3.put(lValueOf2, zzdzjVarZzc2.zza().zzb());
                                    this.zzb.zzb(j);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 35 + String.valueOf(str5).length());
                                    Vs.y(sb2, "Created H5 rewarded #", j, " with ad unit ");
                                    sb2.append(str5);
                                    com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                                    break;
                                } else {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create H5 ad, missing ad unit id");
                                    this.zzb.zzc(j);
                                    break;
                                }
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not create H5 ad, object ID already exists");
                                this.zzb.zzc(j);
                                break;
                            }
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create H5 ad, too many existing objects");
                            this.zzb.zzc(j);
                            break;
                        }
                    case "load_rewarded_ad":
                        zzdzi zzdziVar3 = (zzdzi) this.zzc.get(Long.valueOf(j));
                        if (zzdziVar3 != null) {
                            zzdziVar3.zza(zzc(mapZzV));
                            break;
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not load H5 ad, object ID does not exist");
                            this.zzb.zzj(j);
                            break;
                        }
                    case "show_rewarded_ad":
                        zzdzi zzdziVar4 = (zzdzi) this.zzc.get(Long.valueOf(j));
                        if (zzdziVar4 != null) {
                            zzdziVar4.zzb();
                            break;
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not show H5 ad, object ID does not exist");
                            this.zzb.zzj(j);
                            break;
                        }
                    case "dispose":
                        Map map4 = this.zzc;
                        Long lValueOf3 = Long.valueOf(j);
                        zzdzi zzdziVar5 = (zzdzi) map4.get(lValueOf3);
                        if (zzdziVar5 != null) {
                            zzdziVar5.zzc();
                            map4.remove(lValueOf3);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(j).length() + 16);
                            sb3.append("Disposed H5 ad #");
                            sb3.append(j);
                            com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                            break;
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not dispose H5 ad, object ID does not exist");
                            break;
                        }
                    default:
                        com.google.android.gms.ads.internal.util.client.zzo.zzd("H5 gmsg contained invalid action: ".concat(str2));
                        break;
                }
            } catch (NullPointerException | NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzd("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str3)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzf() {
        this.zzc.clear();
    }
}
