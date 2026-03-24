package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class zzvs extends zzvj {
    private final HashMap zza = new HashMap();
    private Handler zzb;
    private zzhz zzc;

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzM() {
        for (zzvr zzvrVar : this.zza.values()) {
            zzvrVar.zza.zzq(zzvrVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public void zza(zzhz zzhzVar) {
        this.zzc = zzhzVar;
        this.zzb = zzfj.zzc(null);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzc() {
        for (zzvr zzvrVar : this.zza.values()) {
            zzvrVar.zza.zzr(zzvrVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public void zzd() {
        HashMap map = this.zza;
        for (zzvr zzvrVar : map.values()) {
            zzwm zzwmVar = zzvrVar.zza;
            zzwmVar.zzs(zzvrVar.zzb);
            zzvq zzvqVar = zzvrVar.zzc;
            zzwmVar.zzm(zzvqVar);
            zzwmVar.zzo(zzvqVar);
        }
        map.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public void zzt() {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((zzvr) it.next()).zza.zzt();
        }
    }

    public abstract void zzu(Object obj, zzwm zzwmVar, zzbf zzbfVar);

    public final void zzv(final Object obj, zzwm zzwmVar) {
        HashMap map = this.zza;
        zzgrc.zza(!map.containsKey(obj));
        zzwl zzwlVar = new zzwl() { // from class: com.google.android.gms.internal.ads.zzvp
            @Override // com.google.android.gms.internal.ads.zzwl
            public final /* synthetic */ void zza(zzwm zzwmVar2, zzbf zzbfVar) {
                this.zza.zzu(obj, zzwmVar2, zzbfVar);
            }
        };
        zzvq zzvqVar = new zzvq(this, obj);
        map.put(obj, new zzvr(zzwmVar, zzwlVar, zzvqVar));
        Handler handler = this.zzb;
        handler.getClass();
        zzwmVar.zzl(handler, zzvqVar);
        Handler handler2 = this.zzb;
        handler2.getClass();
        zzwmVar.zzn(handler2, zzvqVar);
        zzwmVar.zzp(zzwlVar, this.zzc, zzk());
        if (zzj()) {
            return;
        }
        zzwmVar.zzr(zzwlVar);
    }

    public int zzw(Object obj, int i) {
        return 0;
    }

    public zzwk zzx(Object obj, zzwk zzwkVar) {
        throw null;
    }

    public long zzy(Object obj, long j, zzwk zzwkVar) {
        return j;
    }
}
