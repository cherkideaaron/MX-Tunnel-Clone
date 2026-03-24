package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzxh implements zzabb, zzvz {
    final /* synthetic */ zzxq zza;
    private final long zzb;
    private final Uri zzc;
    private final zzhy zzd;
    private final zzxd zze;
    private final zzaex zzf;
    private final zzdq zzg;
    private final zzafv zzh;
    private volatile boolean zzi;
    private boolean zzj;
    private long zzk;
    private zzhf zzl;
    private zzagh zzm;
    private boolean zzn;

    public zzxh(zzxq zzxqVar, Uri uri, zzhb zzhbVar, zzxd zzxdVar, zzaex zzaexVar, zzdq zzdqVar) {
        Objects.requireNonNull(zzxqVar);
        this.zza = zzxqVar;
        this.zzc = uri;
        this.zzd = new zzhy(zzhbVar);
        this.zze = zzxdVar;
        this.zzf = zzaexVar;
        this.zzg = zzdqVar;
        this.zzh = new zzafv();
        this.zzj = true;
        this.zzb = zzwb.zza();
        this.zzl = zzi(0L, null);
    }

    private final zzhf zzi(long j, String str) {
        Map mapZzd = zzxq.zzb;
        if (str != null && !str.startsWith("W/")) {
            zzguh zzguhVar = new zzguh();
            zzguhVar.zzb(mapZzd.entrySet());
            zzguhVar.zza("If-Range", str);
            mapZzd = zzguhVar.zzd();
        }
        zzhe zzheVar = new zzhe();
        zzheVar.zza(this.zzc);
        zzheVar.zzc(j);
        zzheVar.zzd(6);
        zzheVar.zzb(mapZzd);
        return zzheVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzer zzerVar) {
        long jMax = !this.zzn ? this.zzk : Math.max(this.zza.zzI(true), this.zzk);
        int iZzd = zzerVar.zzd();
        zzagh zzaghVar = this.zzm;
        zzaghVar.getClass();
        zzaghVar.zzc(zzerVar, iZzd);
        zzaghVar.zze(jMax, 1, iZzd, 0, null);
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb() {
        this.zzi = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x020e A[EDGE_INSN: B:141:0x020e->B:100:0x020e BREAK  A[LOOP:1: B:88:0x01d6->B:144:0x01d6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9 A[Catch: all -> 0x0054, TryCatch #5 {all -> 0x0054, blocks: (B:7:0x000d, B:14:0x0039, B:16:0x0047, B:18:0x004d, B:24:0x005d, B:25:0x0063, B:28:0x007e, B:29:0x0084, B:37:0x00bf, B:39:0x00c9, B:41:0x00d5, B:43:0x00df, B:45:0x00eb, B:47:0x00f5, B:49:0x0101, B:51:0x010b, B:53:0x011d, B:55:0x0127, B:56:0x012d, B:64:0x0166, B:66:0x016f, B:68:0x017c, B:70:0x0184, B:72:0x019f, B:59:0x0137, B:62:0x0157, B:33:0x0090, B:36:0x00b1), top: B:128:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00df A[Catch: all -> 0x0054, TryCatch #5 {all -> 0x0054, blocks: (B:7:0x000d, B:14:0x0039, B:16:0x0047, B:18:0x004d, B:24:0x005d, B:25:0x0063, B:28:0x007e, B:29:0x0084, B:37:0x00bf, B:39:0x00c9, B:41:0x00d5, B:43:0x00df, B:45:0x00eb, B:47:0x00f5, B:49:0x0101, B:51:0x010b, B:53:0x011d, B:55:0x0127, B:56:0x012d, B:64:0x0166, B:66:0x016f, B:68:0x017c, B:70:0x0184, B:72:0x019f, B:59:0x0137, B:62:0x0157, B:33:0x0090, B:36:0x00b1), top: B:128:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5 A[Catch: all -> 0x0054, TryCatch #5 {all -> 0x0054, blocks: (B:7:0x000d, B:14:0x0039, B:16:0x0047, B:18:0x004d, B:24:0x005d, B:25:0x0063, B:28:0x007e, B:29:0x0084, B:37:0x00bf, B:39:0x00c9, B:41:0x00d5, B:43:0x00df, B:45:0x00eb, B:47:0x00f5, B:49:0x0101, B:51:0x010b, B:53:0x011d, B:55:0x0127, B:56:0x012d, B:64:0x0166, B:66:0x016f, B:68:0x017c, B:70:0x0184, B:72:0x019f, B:59:0x0137, B:62:0x0157, B:33:0x0090, B:36:0x00b1), top: B:128:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010b A[Catch: all -> 0x0054, TryCatch #5 {all -> 0x0054, blocks: (B:7:0x000d, B:14:0x0039, B:16:0x0047, B:18:0x004d, B:24:0x005d, B:25:0x0063, B:28:0x007e, B:29:0x0084, B:37:0x00bf, B:39:0x00c9, B:41:0x00d5, B:43:0x00df, B:45:0x00eb, B:47:0x00f5, B:49:0x0101, B:51:0x010b, B:53:0x011d, B:55:0x0127, B:56:0x012d, B:64:0x0166, B:66:0x016f, B:68:0x017c, B:70:0x0184, B:72:0x019f, B:59:0x0137, B:62:0x0157, B:33:0x0090, B:36:0x00b1), top: B:128:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0127 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #5 {all -> 0x0054, blocks: (B:7:0x000d, B:14:0x0039, B:16:0x0047, B:18:0x004d, B:24:0x005d, B:25:0x0063, B:28:0x007e, B:29:0x0084, B:37:0x00bf, B:39:0x00c9, B:41:0x00d5, B:43:0x00df, B:45:0x00eb, B:47:0x00f5, B:49:0x0101, B:51:0x010b, B:53:0x011d, B:55:0x0127, B:56:0x012d, B:64:0x0166, B:66:0x016f, B:68:0x017c, B:70:0x0184, B:72:0x019f, B:59:0x0137, B:62:0x0157, B:33:0x0090, B:36:0x00b1), top: B:128:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0166 A[Catch: all -> 0x0054, TryCatch #5 {all -> 0x0054, blocks: (B:7:0x000d, B:14:0x0039, B:16:0x0047, B:18:0x004d, B:24:0x005d, B:25:0x0063, B:28:0x007e, B:29:0x0084, B:37:0x00bf, B:39:0x00c9, B:41:0x00d5, B:43:0x00df, B:45:0x00eb, B:47:0x00f5, B:49:0x0101, B:51:0x010b, B:53:0x011d, B:55:0x0127, B:56:0x012d, B:64:0x0166, B:66:0x016f, B:68:0x017c, B:70:0x0184, B:72:0x019f, B:59:0x0137, B:62:0x0157, B:33:0x0090, B:36:0x00b1), top: B:128:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017c A[Catch: all -> 0x0054, TryCatch #5 {all -> 0x0054, blocks: (B:7:0x000d, B:14:0x0039, B:16:0x0047, B:18:0x004d, B:24:0x005d, B:25:0x0063, B:28:0x007e, B:29:0x0084, B:37:0x00bf, B:39:0x00c9, B:41:0x00d5, B:43:0x00df, B:45:0x00eb, B:47:0x00f5, B:49:0x0101, B:51:0x010b, B:53:0x011d, B:55:0x0127, B:56:0x012d, B:64:0x0166, B:66:0x016f, B:68:0x017c, B:70:0x0184, B:72:0x019f, B:59:0x0137, B:62:0x0157, B:33:0x0090, B:36:0x00b1), top: B:128:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01bb A[Catch: all -> 0x01bf, TryCatch #8 {all -> 0x01bf, blocks: (B:74:0x01b2, B:76:0x01bb, B:79:0x01c3, B:81:0x01c7), top: B:134:0x01b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c7 A[Catch: all -> 0x01bf, TRY_LEAVE, TryCatch #8 {all -> 0x01bf, blocks: (B:74:0x01b2, B:76:0x01bb, B:79:0x01c3, B:81:0x01c7), top: B:134:0x01b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d4  */
    @Override // com.google.android.gms.internal.ads.zzabb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzc() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxh.zzc():void");
    }

    public final /* synthetic */ void zzd(long j, long j2) {
        this.zzh.zza = j;
        this.zzk = j2;
        this.zzj = true;
        this.zzn = false;
    }

    public final /* synthetic */ long zze() {
        return this.zzb;
    }

    public final /* synthetic */ zzhy zzf() {
        return this.zzd;
    }

    public final /* synthetic */ long zzg() {
        return this.zzk;
    }

    public final /* synthetic */ zzhf zzh() {
        return this.zzl;
    }
}
