package com.google.android.gms.internal.ads;

import defpackage.WF;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzdor {
    public static final zzdor zza = new zzdor(new zzdoq());
    private final zzblt zzb;
    private final zzblq zzc;
    private final zzbmg zzd;
    private final zzbmd zze;
    private final zzbrb zzf;
    private final WF zzg;
    private final WF zzh;

    private zzdor(zzdoq zzdoqVar) {
        this.zzb = zzdoqVar.zza;
        this.zzc = zzdoqVar.zzb;
        this.zzd = zzdoqVar.zzc;
        this.zzg = new WF(zzdoqVar.zzf);
        this.zzh = new WF(zzdoqVar.zzg);
        this.zze = zzdoqVar.zzd;
        this.zzf = zzdoqVar.zze;
    }

    public final zzblt zza() {
        return this.zzb;
    }

    public final zzblq zzb() {
        return this.zzc;
    }

    public final zzbmg zzc() {
        return this.zzd;
    }

    public final zzbmd zzd() {
        return this.zze;
    }

    public final zzbrb zze() {
        return this.zzf;
    }

    public final zzblz zzf(String str) {
        if (str == null) {
            return null;
        }
        return (zzblz) this.zzg.get(str);
    }

    public final zzblw zzg(String str) {
        return (zzblw) this.zzh.get(str);
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        WF wf = this.zzg;
        ArrayList arrayList = new ArrayList(wf.c);
        for (int i = 0; i < wf.c; i++) {
            arrayList.add((String) wf.g(i));
        }
        return arrayList;
    }

    public /* synthetic */ zzdor(zzdoq zzdoqVar, byte[] bArr) {
        this(zzdoqVar);
    }
}
