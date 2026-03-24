package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* loaded from: classes.dex */
final class zzpb {
    private final zzbd zza;
    private zzguf zzb = zzguf.zzi();
    private zzgui zzc = zzgui.zza();
    private zzwk zzd;
    private zzwk zze;
    private zzwk zzf;

    public zzpb(zzbd zzbdVar) {
        this.zza = zzbdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzj(com.google.android.gms.internal.ads.zzbf r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzguh r0 = new com.google.android.gms.internal.ads.zzguh
            r0.<init>()
            com.google.android.gms.internal.ads.zzguf r1 = r3.zzb
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L3b
            com.google.android.gms.internal.ads.zzwk r1 = r3.zze
            r3.zzk(r0, r1, r4)
            com.google.android.gms.internal.ads.zzwk r1 = r3.zzf
            com.google.android.gms.internal.ads.zzwk r2 = r3.zze
            boolean r1 = java.util.Objects.equals(r1, r2)
            if (r1 != 0) goto L21
            com.google.android.gms.internal.ads.zzwk r1 = r3.zzf
            r3.zzk(r0, r1, r4)
        L21:
            com.google.android.gms.internal.ads.zzwk r1 = r3.zzd
            com.google.android.gms.internal.ads.zzwk r2 = r3.zze
            boolean r1 = java.util.Objects.equals(r1, r2)
            if (r1 != 0) goto L5d
            com.google.android.gms.internal.ads.zzwk r1 = r3.zzd
            com.google.android.gms.internal.ads.zzwk r2 = r3.zzf
            boolean r1 = java.util.Objects.equals(r1, r2)
            if (r1 != 0) goto L5d
        L35:
            com.google.android.gms.internal.ads.zzwk r1 = r3.zzd
            r3.zzk(r0, r1, r4)
            goto L5d
        L3b:
            r1 = 0
        L3c:
            com.google.android.gms.internal.ads.zzguf r2 = r3.zzb
            int r2 = r2.size()
            if (r1 >= r2) goto L52
            com.google.android.gms.internal.ads.zzguf r2 = r3.zzb
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.internal.ads.zzwk r2 = (com.google.android.gms.internal.ads.zzwk) r2
            r3.zzk(r0, r2, r4)
            int r1 = r1 + 1
            goto L3c
        L52:
            com.google.android.gms.internal.ads.zzguf r1 = r3.zzb
            com.google.android.gms.internal.ads.zzwk r2 = r3.zzd
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L5d
            goto L35
        L5d:
            com.google.android.gms.internal.ads.zzgui r4 = r0.zzc()
            r3.zzc = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpb.zzj(com.google.android.gms.internal.ads.zzbf):void");
    }

    private final void zzk(zzguh zzguhVar, zzwk zzwkVar, zzbf zzbfVar) {
        if (zzwkVar == null) {
            return;
        }
        if (zzbfVar.zze(zzwkVar.zza) != -1) {
            zzguhVar.zza(zzwkVar, zzbfVar);
            return;
        }
        zzbf zzbfVar2 = (zzbf) this.zzc.get(zzwkVar);
        if (zzbfVar2 != null) {
            zzguhVar.zza(zzwkVar, zzbfVar2);
        }
    }

    private static zzwk zzl(zzbb zzbbVar, zzguf zzgufVar, zzwk zzwkVar, zzbd zzbdVar) {
        zzbf zzbfVarZzq = zzbbVar.zzq();
        int iZzr = zzbbVar.zzr();
        Object objZzf = zzbfVarZzq.zzg() ? null : zzbfVarZzq.zzf(iZzr);
        int iZzf = (zzbbVar.zzx() || zzbfVarZzq.zzg()) ? -1 : zzbfVarZzq.zzd(iZzr, zzbdVar, false).zzf(zzfj.zzq(zzbbVar.zzu()));
        for (int i = 0; i < zzgufVar.size(); i++) {
            zzwk zzwkVar2 = (zzwk) zzgufVar.get(i);
            if (zzm(zzwkVar2, objZzf, zzbbVar.zzx(), zzbbVar.zzy(), zzbbVar.zzz(), iZzf)) {
                return zzwkVar2;
            }
        }
        if (zzgufVar.isEmpty() && zzwkVar != null) {
            if (zzm(zzwkVar, objZzf, zzbbVar.zzx(), zzbbVar.zzy(), zzbbVar.zzz(), iZzf)) {
                return zzwkVar;
            }
        }
        return null;
    }

    private static boolean zzm(zzwk zzwkVar, Object obj, boolean z, int i, int i2, int i3) {
        if (!zzwkVar.zza.equals(obj)) {
            return false;
        }
        if (z) {
            if (zzwkVar.zzb != i || zzwkVar.zzc != i2) {
                return false;
            }
        } else if (zzwkVar.zzb != -1 || zzwkVar.zze != i3) {
            return false;
        }
        return true;
    }

    public final zzwk zza() {
        return this.zzd;
    }

    public final zzwk zzb() {
        return this.zze;
    }

    public final zzwk zzc() {
        return this.zzf;
    }

    public final zzwk zzd() {
        Object next;
        Object objLast;
        if (this.zzb.isEmpty()) {
            return null;
        }
        List list = this.zzb;
        if (list instanceof List) {
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            objLast = list.get(list.size() - 1);
        } else if (list instanceof SortedSet) {
            objLast = ((SortedSet) list).last();
        } else {
            Iterator it = list.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            objLast = next;
        }
        return (zzwk) objLast;
    }

    public final zzbf zze(zzwk zzwkVar) {
        return (zzbf) this.zzc.get(zzwkVar);
    }

    public final void zzf(zzbb zzbbVar) {
        this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
    }

    public final void zzg(zzbb zzbbVar) {
        this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
        zzj(zzbbVar.zzq());
    }

    public final void zzh(List list, zzwk zzwkVar, zzbb zzbbVar) {
        this.zzb = zzguf.zzq(list);
        if (!list.isEmpty()) {
            this.zze = (zzwk) list.get(0);
            zzwkVar.getClass();
            this.zzf = zzwkVar;
        }
        if (this.zzd == null) {
            this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
        }
        zzj(zzbbVar.zzq());
    }

    public final /* synthetic */ zzguf zzi() {
        return this.zzb;
    }
}
