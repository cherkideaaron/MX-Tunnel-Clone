package com.google.android.gms.internal.ads;

import defpackage.As;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class zzflv {
    private final zzfkz zza;
    private final zzfls zzb;
    private final zzfkv zzc;
    private zzfmb zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzflv(zzfkz zzfkzVar, zzfkv zzfkvVar, zzfls zzflsVar) {
        this.zza = zzfkzVar;
        this.zzc = zzfkvVar;
        this.zzb = zzflsVar;
        zzfkvVar.zza(new zzfku() { // from class: com.google.android.gms.internal.ads.zzflu
            @Override // com.google.android.gms.internal.ads.zzfku
            public final /* synthetic */ void zza() {
                this.zza.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzd() {
        zzflt zzfltVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhi)).booleanValue() && !com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzi()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (true) {
                ArrayDeque arrayDeque = this.zzd;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                zzfltVar = (zzflt) arrayDeque.pollFirst();
                if (zzfltVar == null || (zzfltVar.zzb() != null && this.zza.zzc(zzfltVar.zzb()))) {
                    break;
                }
            }
            zzfmb zzfmbVar = new zzfmb(this.zza, this.zzb, zzfltVar);
            this.zze = zzfmbVar;
            zzfmbVar.zza(new zzflq(this, zzfltVar));
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized void zza(zzflt zzfltVar) {
        this.zzd.add(zzfltVar);
    }

    public final synchronized As zzb(zzflt zzfltVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zzb(zzfltVar);
    }

    public final /* synthetic */ void zzc() {
        synchronized (this) {
            this.zzf = 1;
            zzd();
        }
    }

    public final /* synthetic */ ArrayDeque zze() {
        return this.zzd;
    }

    public final /* synthetic */ void zzf(zzfmb zzfmbVar) {
        this.zze = null;
    }

    public final /* synthetic */ int zzg() {
        return this.zzf;
    }
}
