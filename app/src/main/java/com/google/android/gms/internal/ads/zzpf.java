package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes.dex */
public final class zzpf implements zzpo {
    public static final zzgru zza = zzpd.zza;
    private static final Random zzb = new Random();
    private final zzbe zzc;
    private final zzbd zzd;
    private final HashMap zze;
    private zzpn zzf;
    private zzbf zzg;
    private String zzh;
    private long zzi;

    public zzpf() {
        throw null;
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private final void zzl(zzmy zzmyVar) {
        if (zzmyVar.zzb.zzg()) {
            String str = this.zzh;
            if (str != null) {
                zzpe zzpeVar = (zzpe) this.zze.get(str);
                zzpeVar.getClass();
                zzm(zzpeVar);
                return;
            }
            return;
        }
        zzpe zzpeVar2 = (zzpe) this.zze.get(this.zzh);
        int i = zzmyVar.zzc;
        zzwk zzwkVar = zzmyVar.zzd;
        this.zzh = zzo(i, zzwkVar).zze();
        zzc(zzmyVar);
        if (zzwkVar == null || !zzwkVar.zzb()) {
            return;
        }
        if (zzpeVar2 != null) {
            if (zzpeVar2.zzg() == zzwkVar.zzd && zzpeVar2.zzh() != null) {
                zzwk zzwkVarZzh = zzpeVar2.zzh();
                if (zzwkVarZzh.zzb == zzwkVar.zzb) {
                    zzwk zzwkVarZzh2 = zzpeVar2.zzh();
                    if (zzwkVarZzh2.zzc == zzwkVar.zzc) {
                        return;
                    }
                }
            }
        }
        zzo(i, new zzwk(zzwkVar.zza, zzwkVar.zzd));
    }

    private final void zzm(zzpe zzpeVar) {
        if (zzpeVar.zzg() != -1 && zzpeVar.zzi()) {
            this.zzi = zzpeVar.zzg();
        }
        this.zzh = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final long zzi() {
        zzpe zzpeVar = (zzpe) this.zze.get(this.zzh);
        return (zzpeVar == null || zzpeVar.zzg() == -1) ? this.zzi + 1 : zzpeVar.zzg();
    }

    private final zzpe zzo(int i, zzwk zzwkVar) {
        HashMap map = this.zze;
        long j = Long.MAX_VALUE;
        zzpe zzpeVar = null;
        for (zzpe zzpeVar2 : map.values()) {
            zzpeVar2.zzc(i, zzwkVar);
            if (zzpeVar2.zzb(i, zzwkVar)) {
                long jZzg = zzpeVar2.zzg();
                if (jZzg == -1 || jZzg < j) {
                    zzpeVar = zzpeVar2;
                    j = jZzg;
                } else if (jZzg == j) {
                    String str = zzfj.zza;
                    if (zzpeVar.zzh() != null && zzpeVar2.zzh() != null) {
                        zzpeVar = zzpeVar2;
                    }
                }
            }
        }
        if (zzpeVar != null) {
            return zzpeVar;
        }
        String strZzp = zzp();
        zzpe zzpeVar3 = new zzpe(this, strZzp, i, zzwkVar);
        map.put(strZzp, zzpeVar3);
        return zzpeVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzp() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final void zza(zzpn zzpnVar) {
        this.zzf = zzpnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final synchronized String zzb(zzbf zzbfVar, zzwk zzwkVar) {
        return zzo(zzbfVar.zzo(zzwkVar.zza, this.zzd).zzc, zzwkVar).zze();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0044 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x0010, B:10:0x0014, B:12:0x001c, B:17:0x0028, B:19:0x0034, B:21:0x003c, B:23:0x0044, B:25:0x004e, B:28:0x0057, B:30:0x005d, B:32:0x0072, B:33:0x008b, B:35:0x0091, B:36:0x0094, B:38:0x00a0, B:40:0x00a6), top: B:47:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzpo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzc(com.google.android.gms.internal.ads.zzmy r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzpn r0 = r9.zzf     // Catch: java.lang.Throwable -> L25
            r0.getClass()
            com.google.android.gms.internal.ads.zzbf r0 = r10.zzb     // Catch: java.lang.Throwable -> L25
            boolean r1 = r0.zzg()     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L10
            goto Lb4
        L10:
            com.google.android.gms.internal.ads.zzwk r1 = r10.zzd     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L44
            long r2 = r1.zzd     // Catch: java.lang.Throwable -> L25
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L28
            long r6 = r9.zzi()     // Catch: java.lang.Throwable -> L25
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto Lb4
            goto L28
        L25:
            r10 = move-exception
            goto Lb6
        L28:
            java.util.HashMap r2 = r9.zze     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = r9.zzh     // Catch: java.lang.Throwable -> L25
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzpe r2 = (com.google.android.gms.internal.ads.zzpe) r2     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L44
            long r6 = r2.zzg()     // Catch: java.lang.Throwable -> L25
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 != 0) goto L44
            int r2 = r2.zzf()     // Catch: java.lang.Throwable -> L25
            int r3 = r10.zzc     // Catch: java.lang.Throwable -> L25
            if (r2 != r3) goto Lb4
        L44:
            int r2 = r10.zzc     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzpe r3 = r9.zzo(r2, r1)     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = r9.zzh     // Catch: java.lang.Throwable -> L25
            if (r4 != 0) goto L54
            java.lang.String r4 = r3.zze()     // Catch: java.lang.Throwable -> L25
            r9.zzh = r4     // Catch: java.lang.Throwable -> L25
        L54:
            r4 = 1
            if (r1 == 0) goto L8b
            boolean r5 = r1.zzb()     // Catch: java.lang.Throwable -> L25
            if (r5 == 0) goto L8b
            java.lang.Object r5 = r1.zza     // Catch: java.lang.Throwable -> L25
            long r6 = r1.zzd     // Catch: java.lang.Throwable -> L25
            int r1 = r1.zzb     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzwk r8 = new com.google.android.gms.internal.ads.zzwk     // Catch: java.lang.Throwable -> L25
            r8.<init>(r5, r6, r1)     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzpe r2 = r9.zzo(r2, r8)     // Catch: java.lang.Throwable -> L25
            boolean r6 = r2.zzi()     // Catch: java.lang.Throwable -> L25
            if (r6 != 0) goto L8b
            r2.zzj(r4)     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzbd r2 = r9.zzd     // Catch: java.lang.Throwable -> L25
            r0.zzo(r5, r2)     // Catch: java.lang.Throwable -> L25
            r2.zzc(r1)     // Catch: java.lang.Throwable -> L25
            r0 = 0
            long r5 = com.google.android.gms.internal.ads.zzfj.zzp(r0)     // Catch: java.lang.Throwable -> L25
            long r7 = com.google.android.gms.internal.ads.zzfj.zzp(r0)     // Catch: java.lang.Throwable -> L25
            long r5 = r5 + r7
            java.lang.Math.max(r0, r5)     // Catch: java.lang.Throwable -> L25
        L8b:
            boolean r0 = r3.zzi()     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L94
            r3.zzj(r4)     // Catch: java.lang.Throwable -> L25
        L94:
            java.lang.String r0 = r3.zze()     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = r9.zzh     // Catch: java.lang.Throwable -> L25
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto Lb4
            boolean r0 = r3.zzk()     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto Lb4
            r3.zzl(r4)     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzpn r0 = r9.zzf     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = r3.zze()     // Catch: java.lang.Throwable -> L25
            r0.zzc(r10, r1)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r9)
            return
        Lb4:
            monitor-exit(r9)
            return
        Lb6:
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpf.zzc(com.google.android.gms.internal.ads.zzmy):void");
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final synchronized void zzd(zzmy zzmyVar) {
        try {
            this.zzf.getClass();
            zzbf zzbfVar = this.zzg;
            this.zzg = zzmyVar.zzb;
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzpe zzpeVar = (zzpe) it.next();
                if (!zzpeVar.zza(zzbfVar, this.zzg) || zzpeVar.zzd(zzmyVar)) {
                    it.remove();
                    if (zzpeVar.zze().equals(this.zzh)) {
                        zzm(zzpeVar);
                    }
                    if (zzpeVar.zzi()) {
                        this.zzf.zzd(zzmyVar, zzpeVar.zze(), false);
                    }
                }
            }
            zzl(zzmyVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final synchronized void zze(zzmy zzmyVar, int i) {
        try {
            this.zzf.getClass();
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzpe zzpeVar = (zzpe) it.next();
                if (zzpeVar.zzd(zzmyVar)) {
                    it.remove();
                    boolean zEquals = zzpeVar.zze().equals(this.zzh);
                    if (zEquals) {
                        zzm(zzpeVar);
                    }
                    if (zzpeVar.zzi()) {
                        boolean z = false;
                        if (i == 0 && zEquals && zzpeVar.zzk()) {
                            z = true;
                        }
                        this.zzf.zzd(zzmyVar, zzpeVar.zze(), z);
                    }
                }
            }
            zzl(zzmyVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final synchronized String zzf() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final synchronized void zzg(zzmy zzmyVar) {
        zzpn zzpnVar;
        try {
            String str = this.zzh;
            if (str != null) {
                zzpe zzpeVar = (zzpe) this.zze.get(str);
                zzpeVar.getClass();
                zzm(zzpeVar);
            }
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzpe zzpeVar2 = (zzpe) it.next();
                it.remove();
                if (zzpeVar2.zzi() && (zzpnVar = this.zzf) != null) {
                    zzpnVar.zzd(zzmyVar, zzpeVar2.zze(), false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final /* synthetic */ zzbe zzj() {
        return this.zzc;
    }

    public final /* synthetic */ zzbd zzk() {
        return this.zzd;
    }

    public zzpf(zzgru zzgruVar) {
        this.zzc = new zzbe();
        this.zzd = new zzbd();
        this.zze = new HashMap();
        this.zzg = zzbf.zza;
        this.zzi = -1L;
    }
}
