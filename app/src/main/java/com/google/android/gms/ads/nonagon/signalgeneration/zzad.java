package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcda;
import com.google.android.gms.internal.ads.zzcdh;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfoo;
import com.google.android.gms.internal.ads.zzgzl;
import defpackage.As;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzad implements zzgzl {
    final /* synthetic */ As zza;
    final /* synthetic */ zzcdh zzb;
    final /* synthetic */ zzcda zzc;
    final /* synthetic */ zzfoe zzd;
    final /* synthetic */ zzau zze;

    public zzad(zzau zzauVar, As as, zzcdh zzcdhVar, zzcda zzcdaVar, zzfoe zzfoeVar) {
        this.zza = as;
        this.zzb = zzcdhVar;
        this.zzc = zzcdaVar;
        this.zzd = zzfoeVar;
        Objects.requireNonNull(zzauVar);
        this.zze = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziL)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "SignalGeneratorImpl.generateSignals");
        } else {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "SignalGeneratorImpl.generateSignals");
        }
        zzfoo zzfooVarZzy = zzau.zzy(this.zza, this.zzb);
        if (((Boolean) zzbix.zze.zze()).booleanValue() && zzfooVarZzy != null) {
            zzfoe zzfoeVar = this.zzd;
            zzfoeVar.zzj(th);
            zzfoeVar.zzd(false);
            zzfooVarZzy.zza(zzfoeVar);
            zzfooVarZzy.zzh();
        }
        zzcda zzcdaVar = this.zzc;
        if (zzcdaVar == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
                sb.append("Internal error. ");
                sb.append(message);
                message = sb.toString();
            }
            zzcdaVar.zzb(message);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfoe zzfoeVar;
        String str;
        String str2;
        As as = this.zza;
        AtomicBoolean atomicBooleanZzN = this.zze.zzN();
        zzbj zzbjVar = (zzbj) obj;
        zzfoo zzfooVarZzy = zzau.zzy(as, this.zzb);
        atomicBooleanZzN.set(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziF)).booleanValue()) {
            try {
                try {
                } catch (Throwable th) {
                    if (((Boolean) zzbix.zze.zze()).booleanValue() && zzfooVarZzy != null) {
                        zzfooVarZzy.zza(this.zzd);
                        zzfooVarZzy.zzh();
                    }
                    throw th;
                }
            } catch (RemoteException e) {
                zzfoe zzfoeVar2 = this.zzd;
                zzfoeVar2.zzj(e);
                zzfoeVar2.zzd(false);
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) zzbix.zze.zze()).booleanValue() || zzfooVarZzy == null) {
                    return;
                }
            }
            if (zzbjVar == null) {
                zzcda zzcdaVar = this.zzc;
                if (zzcdaVar != null) {
                    zzcdaVar.zzc(null, null, null);
                }
                zzfoeVar = this.zzd;
                zzfoeVar.zzd(true);
                if (!((Boolean) zzbix.zze.zze()).booleanValue() || zzfooVarZzy == null) {
                    return;
                }
            } else {
                try {
                    if (TextUtils.isEmpty((!TextUtils.isEmpty(zzbjVar.zzc) ? new JSONObject(zzbjVar.zzc) : new JSONObject(zzbjVar.zzb)).optString("request_id", ""))) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("The request ID is empty in request JSON.");
                        zzcda zzcdaVar2 = this.zzc;
                        if (zzcdaVar2 != null) {
                            zzcdaVar2.zzb("Internal error: request ID is empty in request JSON.");
                        }
                        zzfoeVar = this.zzd;
                        zzfoeVar.zzk("Request ID empty");
                        zzfoeVar.zzd(false);
                        if (!((Boolean) zzbix.zze.zze()).booleanValue() || zzfooVarZzy == null) {
                            return;
                        }
                    } else {
                        Bundle bundle = zzbjVar.zzf;
                        zzau zzauVar = this.zze;
                        if (zzauVar.zzF() && bundle != null && bundle.getInt(zzauVar.zzH(), -1) == -1) {
                            bundle.putInt(zzauVar.zzH(), zzauVar.zzI().get());
                        }
                        if (zzauVar.zzE() && bundle != null && TextUtils.isEmpty(bundle.getString(zzauVar.zzG()))) {
                            if (TextUtils.isEmpty(zzauVar.zzK())) {
                                zzauVar.zzL(com.google.android.gms.ads.internal.zzt.zzc().zze(zzauVar.zzz(), zzauVar.zzJ().afmaVersion));
                            }
                            bundle.putString(zzauVar.zzG(), zzauVar.zzK());
                        }
                        zzcda zzcdaVar3 = this.zzc;
                        if (zzcdaVar3 != null) {
                            if (TextUtils.isEmpty(zzbjVar.zzc)) {
                                str = zzbjVar.zza;
                                str2 = zzbjVar.zzb;
                            } else {
                                str = zzbjVar.zza;
                                str2 = zzbjVar.zzc;
                            }
                            zzcdaVar3.zzc(str, str2, bundle);
                        }
                        this.zzd.zzd(true);
                        if (!((Boolean) zzbix.zze.zze()).booleanValue() || zzfooVarZzy == null) {
                            return;
                        }
                        zzfoeVar = this.zzd;
                    }
                } catch (JSONException e2) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to create JSON object from the request string.");
                    zzcda zzcdaVar4 = this.zzc;
                    if (zzcdaVar4 != null) {
                        String string = e2.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 33);
                        sb.append("Internal error for request JSON: ");
                        sb.append(string);
                        zzcdaVar4.zzb(sb.toString());
                    }
                    zzfoe zzfoeVar3 = this.zzd;
                    zzfoeVar3.zzj(e2);
                    zzfoeVar3.zzd(false);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((Boolean) zzbix.zze.zze()).booleanValue() || zzfooVarZzy == null) {
                        return;
                    } else {
                        zzfooVarZzy.zza(zzfoeVar3);
                    }
                }
            }
        } else {
            try {
                zzcda zzcdaVar5 = this.zzc;
                if (zzcdaVar5 != null) {
                    zzcdaVar5.zzb("QueryInfo generation has been disabled.");
                }
            } catch (RemoteException e3) {
                String strConcat = "QueryInfo generation has been disabled.".concat(e3.toString());
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf(strConcat);
            }
            if (!((Boolean) zzbix.zze.zze()).booleanValue() || zzfooVarZzy == null) {
                return;
            }
            zzfoeVar = this.zzd;
            zzfoeVar.zzk("QueryInfo generation has been disabled.");
            zzfoeVar.zzd(false);
        }
        zzfooVarZzy.zza(zzfoeVar);
        zzfooVarZzy.zzh();
    }
}
