package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class zzaco implements zzbt {
    private final Context zza;
    private final zzbs zzb;
    private final SparseArray zzc;
    private final boolean zzd;
    private final zzadr zze;
    private final zzdn zzf;
    private final CopyOnWriteArraySet zzg;
    private final long zzh;
    private final zzact zzi;
    private zzff zzj = new zzff(10);
    private zzv zzk;
    private zzdx zzl;
    private Pair zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private long zzq;
    private int zzr;

    public /* synthetic */ zzaco(zzacg zzacgVar, byte[] bArr) {
        this.zza = zzacgVar.zze();
        zzbs zzbsVarZzg = zzacgVar.zzg();
        zzbsVarZzg.getClass();
        this.zzb = zzbsVarZzg;
        this.zzc = new SparseArray();
        zzguf.zzi();
        this.zzd = zzacgVar.zzh();
        zzdn zzdnVarZzi = zzacgVar.zzi();
        this.zzf = zzdnVarZzi;
        this.zzh = zzacgVar.zzj() != -9223372036854775807L ? -zzacgVar.zzj() : -9223372036854775807L;
        zzact zzactVarZzk = zzacgVar.zzk();
        this.zzi = zzactVarZzk;
        this.zze = new zzabt(zzacgVar.zzf(), zzactVarZzk, zzdnVarZzi);
        new zzacf(this);
        this.zzg = new CopyOnWriteArraySet();
        this.zzk = new zzt().zzM();
        this.zzp = -9223372036854775807L;
        this.zzq = -9223372036854775807L;
        this.zzr = -1;
        this.zzo = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zzi zzC(zzi zziVar) {
        return (zziVar == null || !zziVar.zzf()) ? zzi.zza : zziVar;
    }

    public final /* synthetic */ void zzA(long j) {
        this.zzq = j;
    }

    public final void zza(int i) {
        this.zzr = 1;
    }

    public final zzadr zzb(int i) {
        SparseArray sparseArray = this.zzc;
        if (zzfj.zza(sparseArray, 0)) {
            return (zzadr) sparseArray.get(0);
        }
        zzaci zzaciVar = new zzaci(this, this.zza, 0);
        this.zzg.add(zzaciVar);
        sparseArray.put(0, zzaciVar);
        return zzaciVar;
    }

    public final void zzc(Surface surface, zzes zzesVar) {
        Pair pair = this.zzm;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzes) this.zzm.second).equals(zzesVar)) {
            return;
        }
        this.zzm = Pair.create(surface, zzesVar);
        zzesVar.zza();
        zzesVar.zzb();
    }

    public final void zzd() {
        zzes zzesVar = zzes.zza;
        zzesVar.zza();
        zzesVar.zzb();
        this.zzm = null;
    }

    public final void zze() {
        this.zze.zza();
    }

    public final void zzf() {
        this.zze.zzb();
    }

    public final void zzg() {
        if (this.zzo == 2) {
            return;
        }
        zzdx zzdxVar = this.zzl;
        if (zzdxVar != null) {
            zzdxVar.zzm(null);
        }
        this.zzm = null;
        this.zzo = 2;
    }

    public final /* synthetic */ void zzh() {
        this.zzn--;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ boolean zzi(com.google.android.gms.internal.ads.zzv r12, int r13) throws com.google.android.gms.internal.ads.zzadq {
        /*
            r11 = this;
            java.lang.String r13 = "Color transfer "
            int r0 = r11.zzo
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            com.google.android.gms.internal.ads.zzgrc.zzi(r0)
            com.google.android.gms.internal.ads.zzi r0 = r12.zzE
            com.google.android.gms.internal.ads.zzi r0 = zzC(r0)
            int r1 = r0.zzd     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
            r2 = 7
            if (r1 != r2) goto L35
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
            r3 = 34
            if (r1 >= r3) goto L23
            boolean r1 = com.google.android.gms.internal.ads.zzdv.zzd()     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
            if (r1 != 0) goto L25
        L23:
            r1 = r2
            goto L35
        L25:
            com.google.android.gms.internal.ads.zzh r13 = r0.zzd()     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
            r0 = 6
            r13.zzc(r0)     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
            com.google.android.gms.internal.ads.zzi r0 = r13.zzg()     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
        L31:
            r3 = r0
            goto L67
        L33:
            r13 = move-exception
            goto L94
        L35:
            boolean r2 = com.google.android.gms.internal.ads.zzdv.zzc(r1)     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
            if (r2 != 0) goto L5f
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
            r3 = 29
            if (r2 >= r3) goto L42
            goto L5f
        L42:
            java.lang.String r0 = "PlaybackVidGraphWrapper"
            java.lang.String r2 = com.google.android.gms.internal.ads.zzfj.zza     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
            java.util.Locale r2 = java.util.Locale.US     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
            r2.<init>(r13)     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
            r2.append(r1)     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
            java.lang.String r13 = " is not supported. Falling back to OpenGl tone mapping."
            r2.append(r13)     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
            java.lang.String r13 = r2.toString()     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
            com.google.android.gms.internal.ads.zzee.zzc(r0, r13)     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
        L5c:
            com.google.android.gms.internal.ads.zzi r0 = com.google.android.gms.internal.ads.zzi.zza     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
            goto L31
        L5f:
            r13 = 2
            if (r1 == r13) goto L5c
            r13 = 10
            if (r1 != r13) goto L31
            goto L5c
        L67:
            com.google.android.gms.internal.ads.zzdn r13 = r11.zzf
            android.os.Looper r0 = android.os.Looper.myLooper()
            r0.getClass()
            r10 = 0
            com.google.android.gms.internal.ads.zzdx r13 = r13.zzd(r0, r10)
            r11.zzl = r13
            com.google.android.gms.internal.ads.zzbs r1 = r11.zzb     // Catch: com.google.android.gms.internal.ads.zzbo -> L8d
            android.content.Context r2 = r11.zza     // Catch: com.google.android.gms.internal.ads.zzbo -> L8d
            com.google.android.gms.internal.ads.zzl r4 = com.google.android.gms.internal.ads.zzl.zzb     // Catch: com.google.android.gms.internal.ads.zzbo -> L8d
            java.util.Objects.requireNonNull(r13)     // Catch: com.google.android.gms.internal.ads.zzbo -> L8d
            com.google.android.gms.internal.ads.zzach r6 = new com.google.android.gms.internal.ads.zzach     // Catch: com.google.android.gms.internal.ads.zzbo -> L8d
            r6.<init>()     // Catch: com.google.android.gms.internal.ads.zzbo -> L8d
            r7 = 0
            r9 = 0
            r5 = r11
            r1.zza(r2, r3, r4, r5, r6, r7, r9)     // Catch: com.google.android.gms.internal.ads.zzbo -> L8d
            throw r10     // Catch: com.google.android.gms.internal.ads.zzbo -> L8d
        L8d:
            r13 = move-exception
            com.google.android.gms.internal.ads.zzadq r0 = new com.google.android.gms.internal.ads.zzadq
            r0.<init>(r13, r12)
            throw r0
        L94:
            com.google.android.gms.internal.ads.zzadq r0 = new com.google.android.gms.internal.ads.zzadq
            r0.<init>(r13, r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaco.zzi(com.google.android.gms.internal.ads.zzv, int):boolean");
    }

    public final /* synthetic */ boolean zzj(boolean z) {
        return this.zze.zzh(false);
    }

    public final /* synthetic */ void zzk() {
        this.zze.zzi();
    }

    public final /* synthetic */ void zzl(long j, long j2) {
        this.zze.zzv(j, j2);
    }

    public final /* synthetic */ void zzm(boolean z) {
        if (this.zzo == 1) {
            this.zzn++;
            zzadr zzadrVar = this.zze;
            zzadrVar.zzg(z);
            while (this.zzj.zzc() > 1) {
                this.zzj.zzd();
            }
            if (this.zzj.zzc() == 1) {
                zzacn zzacnVar = (zzacn) this.zzj.zzd();
                zzacnVar.getClass();
                zzadrVar.zzs(1, this.zzk, zzacnVar.zza, zzacnVar.zzb, zzguf.zzi());
            }
            this.zzp = -9223372036854775807L;
            if (z) {
                this.zzq = -9223372036854775807L;
            }
            zzdx zzdxVar = this.zzl;
            zzdxVar.getClass();
            zzdxVar.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzh();
                }
            });
        }
    }

    public final /* synthetic */ void zzn(boolean z) {
        this.zze.zzw(z);
    }

    public final /* synthetic */ void zzo() {
        this.zze.zzt();
    }

    public final /* synthetic */ void zzp(zzacp zzacpVar) {
        this.zze.zzl(zzacpVar);
    }

    public final /* synthetic */ void zzq(float f) {
        this.zzi.zzc(f);
        this.zze.zzm(f);
    }

    public final /* synthetic */ void zzr(int i) {
        this.zze.zzr(i);
    }

    public final /* synthetic */ boolean zzs() {
        int i = this.zzr;
        return i != -1 && i == 0;
    }

    public final /* synthetic */ boolean zzt() {
        return this.zzd;
    }

    public final /* synthetic */ long zzu() {
        return this.zzh;
    }

    public final /* synthetic */ zzact zzv() {
        return this.zzi;
    }

    public final /* synthetic */ zzff zzw() {
        return this.zzj;
    }

    public final /* synthetic */ void zzx(zzff zzffVar) {
        this.zzj = zzffVar;
    }

    public final /* synthetic */ long zzy() {
        return this.zzp;
    }

    public final /* synthetic */ long zzz() {
        return this.zzq;
    }
}
