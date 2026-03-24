package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.List;

/* loaded from: classes.dex */
public final class zzfdc {
    private final zzbzu zza;
    private final int zzb;

    public zzfdc(zzbzu zzbzuVar, int i) {
        this.zza = zzbzuVar;
        this.zzb = i;
    }

    public final String zza() {
        return this.zza.zzd;
    }

    public final String zzb() {
        return zzgrt.zza(this.zza.zza.getString("ms"));
    }

    public final PackageInfo zzc() {
        return this.zza.zzf;
    }

    public final List zzd() {
        return this.zza.zze;
    }

    public final String zze() {
        return this.zza.zzh;
    }

    public final int zzf() {
        return this.zzb;
    }

    public final boolean zzg() {
        return this.zza.zzk;
    }

    public final boolean zzh() {
        return this.zza.zzl;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzi() {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.zzbzu r0 = r12.zza
            android.os.Bundle r0 = r0.zza
            java.lang.String r1 = "extras"
            android.os.Bundle r0 = r0.getBundle(r1)
            r1 = -1
            if (r0 != 0) goto Le
            return r1
        Le:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L16
            goto L8f
        L16:
            java.lang.String r2 = "query_info_type"
            java.lang.String r3 = ""
            java.lang.String r0 = r0.getString(r2, r3)
            int r2 = r0.hashCode()
            r3 = 0
            r4 = 1
            r5 = 2
            r6 = 3
            r7 = 4
            r8 = 5
            r9 = 6
            r10 = 7
            r11 = 8
            switch(r2) {
                case 1743582862: goto L81;
                case 1743582863: goto L77;
                case 1743582864: goto L6d;
                case 1743582865: goto L63;
                case 1743582866: goto L59;
                case 1743582867: goto L4f;
                case 1743582868: goto L45;
                case 1743582869: goto L3b;
                case 1743582870: goto L31;
                default: goto L2f;
            }
        L2f:
            goto L8b
        L31:
            java.lang.String r2 = "requester_type_8"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8b
            r0 = r11
            goto L8c
        L3b:
            java.lang.String r2 = "requester_type_7"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8b
            r0 = r10
            goto L8c
        L45:
            java.lang.String r2 = "requester_type_6"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8b
            r0 = r9
            goto L8c
        L4f:
            java.lang.String r2 = "requester_type_5"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8b
            r0 = r8
            goto L8c
        L59:
            java.lang.String r2 = "requester_type_4"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8b
            r0 = r7
            goto L8c
        L63:
            java.lang.String r2 = "requester_type_3"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8b
            r0 = r6
            goto L8c
        L6d:
            java.lang.String r2 = "requester_type_2"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8b
            r0 = r5
            goto L8c
        L77:
            java.lang.String r2 = "requester_type_1"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8b
            r0 = r4
            goto L8c
        L81:
            java.lang.String r2 = "requester_type_0"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8b
            r0 = r3
            goto L8c
        L8b:
            r0 = r1
        L8c:
            switch(r0) {
                case 0: goto L98;
                case 1: goto L97;
                case 2: goto L96;
                case 3: goto L95;
                case 4: goto L94;
                case 5: goto L93;
                case 6: goto L92;
                case 7: goto L91;
                case 8: goto L90;
                default: goto L8f;
            }
        L8f:
            return r1
        L90:
            return r11
        L91:
            return r10
        L92:
            return r9
        L93:
            return r8
        L94:
            return r7
        L95:
            return r6
        L96:
            return r5
        L97:
            return r4
        L98:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfdc.zzi():int");
    }

    public final int zzj() {
        return this.zza.zzo;
    }
}
