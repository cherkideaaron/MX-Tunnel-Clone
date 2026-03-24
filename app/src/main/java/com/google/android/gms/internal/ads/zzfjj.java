package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class zzfjj {
    private com.google.android.gms.ads.internal.client.zzm zza;
    private com.google.android.gms.ads.internal.client.zzr zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzga zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    private zzbkh zzh;
    private com.google.android.gms.ads.internal.client.zzx zzi;
    private AdManagerAdViewOptions zzj;
    private PublisherAdViewOptions zzk;
    private com.google.android.gms.ads.internal.client.zzco zzl;
    private zzbqs zzn;
    private zzerp zzr;
    private Bundle zzt;
    private com.google.android.gms.ads.internal.client.zzcs zzw;
    private int zzm = 1;
    private final zzfix zzo = new zzfix();
    private boolean zzp = false;
    private boolean zzq = false;
    private boolean zzs = false;
    private final AtomicLong zzu = new AtomicLong();
    private boolean zzv = false;

    public final zzfjk zzA() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzfjk(this, null);
    }

    public final boolean zzB() {
        return this.zzp;
    }

    public final boolean zzC() {
        return this.zzq;
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzm zzD() {
        return this.zza;
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzr zzE() {
        return this.zzb;
    }

    public final /* synthetic */ String zzF() {
        return this.zzc;
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzga zzG() {
        return this.zzd;
    }

    public final /* synthetic */ boolean zzH() {
        return this.zze;
    }

    public final /* synthetic */ ArrayList zzI() {
        return this.zzf;
    }

    public final /* synthetic */ ArrayList zzJ() {
        return this.zzg;
    }

    public final /* synthetic */ zzbkh zzK() {
        return this.zzh;
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzx zzL() {
        return this.zzi;
    }

    public final /* synthetic */ AdManagerAdViewOptions zzM() {
        return this.zzj;
    }

    public final /* synthetic */ PublisherAdViewOptions zzN() {
        return this.zzk;
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzco zzO() {
        return this.zzl;
    }

    public final /* synthetic */ int zzP() {
        return this.zzm;
    }

    public final /* synthetic */ zzbqs zzQ() {
        return this.zzn;
    }

    public final /* synthetic */ zzfix zzR() {
        return this.zzo;
    }

    public final /* synthetic */ boolean zzS() {
        return this.zzp;
    }

    public final /* synthetic */ boolean zzT() {
        return this.zzq;
    }

    public final /* synthetic */ zzerp zzU() {
        return this.zzr;
    }

    public final /* synthetic */ boolean zzV() {
        return this.zzs;
    }

    public final /* synthetic */ Bundle zzW() {
        return this.zzt;
    }

    public final /* synthetic */ AtomicLong zzX() {
        return this.zzu;
    }

    public final /* synthetic */ boolean zzY() {
        return this.zzv;
    }

    public final zzfjj zzZ(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzw = zzcsVar;
        return this;
    }

    public final zzfjj zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zza = zzmVar;
        return this;
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzcs zzaa() {
        return this.zzw;
    }

    public final com.google.android.gms.ads.internal.client.zzm zzb() {
        return this.zza;
    }

    public final zzfjj zzc(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzb = zzrVar;
        return this;
    }

    public final zzfjj zzd(boolean z) {
        this.zzp = z;
        return this;
    }

    public final zzfjj zze(boolean z) {
        this.zzq = z;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzr zzf() {
        return this.zzb;
    }

    public final zzfjj zzg(String str) {
        this.zzc = str;
        return this;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final zzfjj zzi(com.google.android.gms.ads.internal.client.zzga zzgaVar) {
        this.zzd = zzgaVar;
        return this;
    }

    public final zzfix zzj() {
        return this.zzo;
    }

    public final zzfjj zzk(boolean z) {
        this.zze = z;
        return this;
    }

    public final zzfjj zzl(int i) {
        this.zzm = i;
        return this;
    }

    public final zzfjj zzm(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfjj zzn(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfjj zzo(zzbkh zzbkhVar) {
        this.zzh = zzbkhVar;
        return this;
    }

    public final zzfjj zzp(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.zzi = zzxVar;
        return this;
    }

    public final zzfjj zzq(zzbqs zzbqsVar) {
        this.zzn = zzbqsVar;
        this.zzd = new com.google.android.gms.ads.internal.client.zzga(false, true, false);
        return this;
    }

    public final zzfjj zzr(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zza();
            this.zzl = publisherAdViewOptions.zzb();
        }
        return this;
    }

    public final zzfjj zzs(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzfjj zzt(zzerp zzerpVar) {
        this.zzr = zzerpVar;
        return this;
    }

    public final zzfjj zzu(boolean z) {
        this.zzs = true;
        return this;
    }

    public final zzfjj zzv(Bundle bundle) {
        this.zzt = bundle;
        return this;
    }

    public final long zzw() {
        return this.zzu.get();
    }

    public final zzfjj zzx(long j) {
        this.zzu.set(j);
        return this;
    }

    public final zzfjj zzy(boolean z) {
        this.zzv = true;
        return this;
    }

    public final zzfjj zzz(zzfjk zzfjkVar) {
        this.zzo.zza(zzfjkVar.zzp.zza);
        this.zza = zzfjkVar.zzd;
        this.zzb = zzfjkVar.zzf;
        this.zzw = zzfjkVar.zzw;
        this.zzc = zzfjkVar.zzg;
        this.zzd = zzfjkVar.zza;
        this.zzf = zzfjkVar.zzh;
        this.zzg = zzfjkVar.zzi;
        this.zzh = zzfjkVar.zzj;
        this.zzi = zzfjkVar.zzk;
        zzs(zzfjkVar.zzm);
        zzr(zzfjkVar.zzn);
        this.zzp = zzfjkVar.zzq;
        this.zzq = zzfjkVar.zzr;
        this.zzr = zzfjkVar.zzc;
        this.zzs = zzfjkVar.zzs;
        this.zzt = zzfjkVar.zzt;
        this.zzu.set(zzfjkVar.zzu.get());
        this.zzv = zzfjkVar.zzv;
        return this;
    }
}
