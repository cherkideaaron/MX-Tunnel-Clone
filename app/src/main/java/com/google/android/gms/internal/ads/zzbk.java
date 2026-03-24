package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.util.HashMap;
import java.util.HashSet;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes.dex */
public class zzbk {
    private int zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzguf zzi;
    private zzguf zzj;
    private zzguf zzk;
    private zzguf zzl;
    private zzguf zzm;
    private int zzn;
    private int zzo;
    private zzguf zzp;
    private zzbj zzq;
    private zzguf zzr;
    private boolean zzs;
    private zzguf zzt;
    private HashMap zzu;
    private HashSet zzv;

    public zzbk() {
        this.zza = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzb = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzc = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzd = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zze = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzf = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzg = true;
        this.zzh = true;
        this.zzi = zzguf.zzi();
        this.zzj = zzguf.zzi();
        this.zzk = zzguf.zzi();
        this.zzl = zzguf.zzi();
        this.zzm = zzguf.zzi();
        this.zzn = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzo = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzp = zzguf.zzi();
        this.zzq = zzbj.zza;
        this.zzr = zzguf.zzi();
        this.zzs = true;
        this.zzt = zzguf.zzi();
        this.zzu = new HashMap();
        this.zzv = new HashSet();
    }

    @EnsuresNonNull({"preferredVideoMimeTypes", "preferredVideoLanguages", "preferredAudioLanguages", "preferredAudioMimeTypes", "audioOffloadPreferences", "preferredTextLanguages", "overrides", "disabledTrackTypes", "preferredVideoLabels", "preferredAudioLabels", "preferredTextLabels"})
    private final void zzx(zzbl zzblVar) {
        this.zza = zzblVar.zza;
        this.zzb = zzblVar.zzb;
        this.zzc = zzblVar.zzc;
        this.zzd = zzblVar.zzd;
        this.zze = zzblVar.zzi;
        this.zzf = zzblVar.zzj;
        this.zzg = zzblVar.zzk;
        this.zzh = zzblVar.zzl;
        this.zzj = zzblVar.zzn;
        this.zzi = zzblVar.zzm;
        this.zzk = zzblVar.zzo;
        this.zzl = zzblVar.zzq;
        this.zzm = zzblVar.zzr;
        this.zzn = zzblVar.zzt;
        this.zzo = zzblVar.zzu;
        this.zzp = zzblVar.zzv;
        this.zzq = zzblVar.zzw;
        this.zzr = zzblVar.zzy;
        this.zzs = zzblVar.zzB;
        this.zzt = zzblVar.zzz;
        this.zzv = new HashSet(zzblVar.zzI);
        this.zzu = new HashMap(zzblVar.zzH);
    }

    public final zzbk zza(zzbl zzblVar) {
        zzx(zzblVar);
        return this;
    }

    public final /* synthetic */ int zzb() {
        return this.zza;
    }

    public final /* synthetic */ int zzc() {
        return this.zzb;
    }

    public final /* synthetic */ int zzd() {
        return this.zzc;
    }

    public final /* synthetic */ int zze() {
        return this.zzd;
    }

    public final /* synthetic */ int zzf() {
        return this.zze;
    }

    public final /* synthetic */ int zzg() {
        return this.zzf;
    }

    public final /* synthetic */ boolean zzh() {
        return this.zzg;
    }

    public final /* synthetic */ boolean zzi() {
        return this.zzh;
    }

    public final /* synthetic */ zzguf zzj() {
        return this.zzi;
    }

    public final /* synthetic */ zzguf zzk() {
        return this.zzj;
    }

    public final /* synthetic */ zzguf zzl() {
        return this.zzk;
    }

    public final /* synthetic */ zzguf zzm() {
        return this.zzl;
    }

    public final /* synthetic */ zzguf zzn() {
        return this.zzm;
    }

    public final /* synthetic */ int zzo() {
        return this.zzn;
    }

    public final /* synthetic */ int zzp() {
        return this.zzo;
    }

    public final /* synthetic */ zzguf zzq() {
        return this.zzp;
    }

    public final /* synthetic */ zzbj zzr() {
        return this.zzq;
    }

    public final /* synthetic */ zzguf zzs() {
        return this.zzr;
    }

    public final /* synthetic */ boolean zzt() {
        return this.zzs;
    }

    public final /* synthetic */ zzguf zzu() {
        return this.zzt;
    }

    public final /* synthetic */ HashMap zzv() {
        return this.zzu;
    }

    public final /* synthetic */ HashSet zzw() {
        return this.zzv;
    }

    public zzbk(zzbl zzblVar) {
        zzx(zzblVar);
    }
}
