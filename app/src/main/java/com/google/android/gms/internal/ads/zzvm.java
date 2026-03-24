package com.google.android.gms.internal.ads;

import android.net.Uri;
import defpackage.Vs;
import java.io.EOFException;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzvm implements zzxd {
    private final zzafa zza;
    private zzaeu zzb;
    private zzaev zzc;

    public zzvm(zzafa zzafaVar) {
        this.zza = zzafaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zza(zzj zzjVar, Uri uri, Map map, long j, long j2, zzaex zzaexVar) throws zzyo {
        zzael zzaelVar = new zzael(zzjVar, j, j2);
        this.zzc = zzaelVar;
        if (this.zzb != null) {
            return;
        }
        zzaeu[] zzaeuVarArrZzb = this.zza.zzb(uri, map);
        int length = zzaeuVarArrZzb.length;
        zzguc zzgucVarZzv = zzguf.zzv(length);
        if (length == 1) {
            this.zzb = zzaeuVarArrZzb[0];
        } else {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                zzaeu zzaeuVar = zzaeuVarArrZzb[i];
                try {
                } catch (EOFException unused) {
                    if (this.zzb != null || zzaelVar.zzn() == j) {
                    }
                } catch (Throwable th) {
                    zzgrc.zzi(this.zzb != null || zzaelVar.zzn() == j);
                    zzaelVar.zzl();
                    throw th;
                }
                if (zzaeuVar.zza(zzaelVar)) {
                    this.zzb = zzaeuVar;
                    zzgrc.zzi(true);
                    zzaelVar.zzl();
                    break;
                } else {
                    zzgucVarZzv.zzh(zzaeuVar.zzb());
                    boolean z = this.zzb != null || zzaelVar.zzn() == j;
                    zzgrc.zzi(z);
                    zzaelVar.zzl();
                    i++;
                }
            }
            if (this.zzb == null) {
                String strZzd = zzgqw.zzd(zzgvf.zzc(zzguf.zzr(zzaeuVarArrZzb), zzvl.zza), ", ");
                throw new zzyo(Vs.o(new StringBuilder(strZzd.length() + 58), "None of the available extractors (", strZzd, ") could read the stream."), uri, zzgucVarZzv.zzi());
            }
        }
        this.zzb.zzc(zzaexVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zzb() {
        zzaeu zzaeuVar = this.zzb;
        if (zzaeuVar != null) {
            zzaeuVar.zzf();
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zzc() {
        zzaeu zzaeuVar = this.zzb;
        if (zzaeuVar != null && (zzaeuVar instanceof zzajp)) {
            ((zzajp) zzaeuVar).zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final long zzd() {
        zzaev zzaevVar = this.zzc;
        if (zzaevVar != null) {
            return zzaevVar.zzn();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zze(long j, long j2) {
        zzaeu zzaeuVar = this.zzb;
        zzaeuVar.getClass();
        zzaeuVar.zze(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final int zzf(zzafv zzafvVar) {
        zzaev zzaevVar;
        zzaeu zzaeuVar = this.zzb;
        if (zzaeuVar == null || (zzaevVar = this.zzc) == null) {
            throw null;
        }
        return zzaeuVar.zzd(zzaevVar, zzafvVar);
    }
}
