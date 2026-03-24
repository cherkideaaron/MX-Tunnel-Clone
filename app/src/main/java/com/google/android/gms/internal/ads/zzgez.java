package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import defpackage.As;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzgez {
    private final zzgzy zza;
    private final zzgfe zzb;
    private final Set zzc;
    private final String zzd;
    private final zzawg zze;
    private final zzgfx zzf;
    private final zzgoe zzg;

    public zzgez(zzgzy zzgzyVar, zzgfe zzgfeVar, zzgfx zzgfxVar, zzgcc zzgccVar, String str, zzawg zzawgVar, zzikv zzikvVar, zzikv zzikvVar2, zzikv zzikvVar3, zzgoe zzgoeVar) {
        Set setZzb;
        this.zza = zzgzyVar;
        this.zzb = zzgfeVar;
        this.zzd = str;
        this.zzf = zzgfxVar;
        this.zze = zzawgVar;
        this.zzg = zzgoeVar;
        int iOrdinal = zzgccVar.ordinal();
        if (iOrdinal == 0) {
            setZzb = ((zziks) zzikvVar).zzb();
        } else if (iOrdinal == 1) {
            setZzb = ((zziks) zzikvVar2).zzb();
        } else {
            if (iOrdinal != 2) {
                throw new IllegalStateException();
            }
            setZzb = ((zziks) zzikvVar3).zzb();
        }
        this.zzc = setZzb;
    }

    public final As zza() {
        if (!this.zzb.zzc()) {
            return zzgzo.zza(Integer.toString(7));
        }
        if (!this.zzf.zzb()) {
            return zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgey
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzb();
                }
            }, this.zza);
        }
        Set set = this.zzc;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(this.zza.zzc((zzgha) it.next()));
        }
        return zzgzo.zzn(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzgew
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        }, zzhaf.zza());
    }

    public final /* synthetic */ String zzb() {
        return this.zzb.zzg(16384, this.zzd);
    }

    public final /* synthetic */ String zzc() {
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzgex
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzd();
            }
        };
        zzgoc zzgocVarZza = this.zzg.zza(FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS);
        try {
            zzgocVarZza.zza();
            Object objCall = callable.call();
            zzgocVarZza.zzc();
            return (String) objCall;
        } finally {
        }
    }

    public final /* synthetic */ String zzd() {
        zzaxg zzaxgVar = (zzaxg) this.zze.zzbu();
        String str = this.zzd;
        zzgfe zzgfeVar = this.zzb;
        try {
            return Base64.encodeToString(((zzaxx) zzgfeVar.zzf(zzaxgVar.zzaN(), str).zzbu()).zzaN(), 11);
        } catch (IllegalArgumentException unused) {
            return zzgfeVar.zzg(4096, str);
        }
    }
}
