package com.google.android.gms.internal.ads;

import defpackage.IP;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class zzfs implements zzao {
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzfs(java.lang.String r7, byte[] r8, int r9, int r10) {
        /*
            r6 = this;
            r6.<init>()
            int r0 = r7.hashCode()
            r1 = 2
            r2 = 3
            r3 = 4
            r4 = 1
            r5 = 0
            switch(r0) {
                case -1949883051: goto L38;
                case -269399509: goto L2e;
                case 1011693540: goto L24;
                case 1098277265: goto L1a;
                case 2002123038: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L42
        L10:
            java.lang.String r0 = "auxiliary.tracks.map"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L42
            r0 = r2
            goto L43
        L1a:
            java.lang.String r0 = "auxiliary.tracks.offset"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L42
            r0 = r4
            goto L43
        L24:
            java.lang.String r0 = "auxiliary.tracks.length"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L42
            r0 = r1
            goto L43
        L2e:
            java.lang.String r0 = "auxiliary.tracks.interleaved"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L42
            r0 = r3
            goto L43
        L38:
            java.lang.String r0 = "com.android.capture.fps"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L42
            r0 = r5
            goto L43
        L42:
            r0 = -1
        L43:
            if (r0 == 0) goto L72
            if (r0 == r4) goto L66
            if (r0 == r1) goto L66
            if (r0 == r2) goto L63
            if (r0 == r3) goto L4e
            goto L7c
        L4e:
            r0 = 75
            if (r10 != r0) goto L5e
            int r10 = r8.length
            if (r10 != r4) goto L5d
            r10 = r8[r5]
            if (r10 == 0) goto L5b
            if (r10 != r4) goto L5d
        L5b:
            r10 = r0
            goto L5f
        L5d:
            r10 = r0
        L5e:
            r4 = r5
        L5f:
            com.google.android.gms.internal.ads.zzgrc.zza(r4)
            goto L7c
        L63:
            if (r10 != 0) goto L5e
            goto L5f
        L66:
            r0 = 78
            if (r10 != r0) goto L5e
            int r10 = r8.length
            r1 = 8
            if (r10 != r1) goto L70
            goto L5b
        L70:
            r10 = r0
            goto L5e
        L72:
            r0 = 23
            if (r10 != r0) goto L5e
            int r10 = r8.length
            if (r10 != r3) goto L7a
            goto L5b
        L7a:
            r10 = r0
            goto L5e
        L7c:
            r6.zza = r7
            r6.zzb = r8
            r6.zzc = r9
            r6.zzd = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfs.<init>(java.lang.String, byte[], int, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfs.class == obj.getClass()) {
            zzfs zzfsVar = (zzfs) obj;
            if (this.zza.equals(zzfsVar.zza) && Arrays.equals(this.zzb, zzfsVar.zzb) && this.zzc == zzfsVar.zzc && this.zzd == zzfsVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + 527;
        return ((((Arrays.hashCode(this.zzb) + (iHashCode * 31)) * 31) + this.zzc) * 31) + this.zzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            r0 = 1
            int r1 = r6.zzd
            r2 = 0
            if (r1 == 0) goto L52
            if (r1 == r0) goto L4b
            r3 = 23
            if (r1 == r3) goto L3c
            r3 = 67
            if (r1 == r3) goto L35
            r3 = 75
            if (r1 == r3) goto L2a
            r3 = 78
            if (r1 == r3) goto L19
            goto L74
        L19:
            byte[] r0 = r6.zzb
            com.google.android.gms.internal.ads.zzer r1 = new com.google.android.gms.internal.ads.zzer
            r1.<init>(r0)
            long r0 = r1.zzJ()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto La2
        L2a:
            byte[] r0 = r6.zzb
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
        L30:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto La2
        L35:
            byte[] r0 = r6.zzb
            int r0 = com.google.android.gms.internal.ads.zzgxz.zzd(r0)
            goto L30
        L3c:
            byte[] r0 = r6.zzb
            int r0 = com.google.android.gms.internal.ads.zzgxz.zzd(r0)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto La2
        L4b:
            byte[] r0 = r6.zzb
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfj.zzi(r0)
            goto La2
        L52:
            java.lang.String r1 = r6.zza
            java.lang.String r3 = "auxiliary.tracks.map"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L74
            java.util.List r0 = r6.zzb()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "track types = "
            r1.append(r2)
            java.lang.String r2 = ","
            com.google.android.gms.internal.ads.zzgqw.zzb(r1, r0, r2)
            java.lang.String r0 = r1.toString()
            goto La2
        L74:
            byte[] r1 = r6.zzb
            java.lang.String r3 = com.google.android.gms.internal.ads.zzfj.zza
            int r3 = r1.length
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + r3
            r4.<init>(r3)
        L7f:
            int r3 = r1.length
            if (r2 >= r3) goto L9e
            r3 = r1[r2]
            int r3 = r3 >> 4
            r3 = r3 & 15
            r5 = 16
            char r3 = java.lang.Character.forDigit(r3, r5)
            r4.append(r3)
            r3 = r1[r2]
            r3 = r3 & 15
            char r3 = java.lang.Character.forDigit(r3, r5)
            r4.append(r3)
            int r2 = r2 + r0
            goto L7f
        L9e:
            java.lang.String r0 = r4.toString()
        La2:
            java.lang.String r1 = r6.zza
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r2 = r2 + 18
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + r3
            r4.<init>(r2)
            java.lang.String r2 = "mdta: key="
            java.lang.String r3 = ", value="
            java.lang.String r0 = defpackage.AbstractC3264qG.m(r4, r2, r1, r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfs.toString():java.lang.String");
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final /* synthetic */ void zza(zzam zzamVar) {
        IP.a(this, zzamVar);
    }

    public final List zzb() {
        zzgrc.zzj(this.zza.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte[] bArr = this.zzb;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }
}
