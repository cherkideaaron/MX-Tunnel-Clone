package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzeba {
    private final zzeak zza;
    private final zzdvm zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    public zzeba(zzeak zzeakVar, zzdvm zzdvmVar) {
        this.zza = zzeakVar;
        this.zzb = zzdvmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc(List list) {
        zzdvl zzdvlVarZzc;
        zzdvl zzdvlVarZzc2;
        zzbwh zzbwhVar;
        synchronized (this.zzc) {
            try {
                if (this.zze) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzbqg zzbqgVar = (zzbqg) it.next();
                    String string = (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkM)).booleanValue() || (zzdvlVarZzc2 = this.zzb.zzc(zzbqgVar.zza)) == null || (zzbwhVar = zzdvlVarZzc2.zzc) == null) ? "" : zzbwhVar.toString();
                    boolean z = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkN)).booleanValue() && (zzdvlVarZzc = this.zzb.zzc(zzbqgVar.zza)) != null && zzdvlVarZzc.zzd;
                    List list2 = this.zzd;
                    String str = zzbqgVar.zza;
                    list2.add(new zzeaz(str, string, this.zzb.zzd(str), zzbqgVar.zzb ? 1 : 0, zzbqgVar.zzd, zzbqgVar.zzc, z));
                }
                this.zze = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza() {
        this.zza.zzb(new zzeay(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f A[Catch: all -> 0x001c, LOOP:0: B:15:0x0029->B:17:0x002f, LOOP_END, TryCatch #0 {all -> 0x001c, blocks: (B:4:0x0008, B:6:0x000c, B:8:0x0014, B:11:0x001e, B:12:0x0021, B:14:0x0023, B:15:0x0029, B:17:0x002f), top: B:21:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.json.JSONArray zzb() {
        /*
            r4 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.Object r1 = r4.zzc
            monitor-enter(r1)
            boolean r2 = r4.zze     // Catch: java.lang.Throwable -> L1c
            if (r2 != 0) goto L23
            com.google.android.gms.internal.ads.zzeak r2 = r4.zza     // Catch: java.lang.Throwable -> L1c
            boolean r3 = r2.zze()     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L1e
            java.util.List r2 = r2.zzd()     // Catch: java.lang.Throwable -> L1c
            r4.zzc(r2)     // Catch: java.lang.Throwable -> L1c
            goto L23
        L1c:
            r0 = move-exception
            goto L3e
        L1e:
            r4.zza()     // Catch: java.lang.Throwable -> L1c
        L21:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            goto L3d
        L23:
            java.util.List r2 = r4.zzd     // Catch: java.lang.Throwable -> L1c
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L1c
        L29:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L21
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.internal.ads.zzeaz r3 = (com.google.android.gms.internal.ads.zzeaz) r3     // Catch: java.lang.Throwable -> L1c
            org.json.JSONObject r3 = r3.zza()     // Catch: java.lang.Throwable -> L1c
            r0.put(r3)     // Catch: java.lang.Throwable -> L1c
            goto L29
        L3d:
            return r0
        L3e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeba.zzb():org.json.JSONArray");
    }
}
