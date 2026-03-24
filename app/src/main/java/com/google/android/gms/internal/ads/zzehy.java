package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzehy implements zzgzl {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzehz zzb;

    public zzehy(zzehz zzehzVar, boolean z) {
        this.zza = z;
        Objects.requireNonNull(zzehzVar);
        this.zzb = zzehzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    @Override // com.google.android.gms.internal.ads.zzgzl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r9) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzehz r0 = r8.zzb
            com.google.android.gms.internal.ads.zzdah r9 = (com.google.android.gms.internal.ads.zzdah) r9
            boolean r1 = r0.zzf()
            if (r1 == 0) goto Lb
            return
        Lb:
            android.os.Bundle r9 = r9.zza
            java.lang.String r1 = "ad_types"
            java.lang.Object r1 = r9.get(r1)
            boolean r2 = r1 instanceof java.util.List
            if (r2 == 0) goto L1a
            java.util.List r1 = (java.util.List) r1
            goto L24
        L1a:
            boolean r2 = r1 instanceof java.lang.String[]
            if (r2 == 0) goto L4a
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.util.List r1 = java.util.Arrays.asList(r1)
        L24:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L31:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L45
            java.lang.Object r3 = r1.next()
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L31
            java.lang.String r3 = (java.lang.String) r3
            r2.add(r3)
            goto L31
        L45:
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
            goto L4e
        L4a:
            java.util.List r1 = java.util.Collections.emptyList()
        L4e:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        L57:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb1
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r2.hashCode()
            r4 = 2
            r6 = 3
            r7 = 1
            switch(r3) {
                case -1396342996: goto L8c;
                case -1052618729: goto L82;
                case -239580146: goto L78;
                case 604727084: goto L6e;
                default: goto L6d;
            }
        L6d:
            goto L96
        L6e:
            java.lang.String r3 = "interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L96
            r2 = r7
            goto L97
        L78:
            java.lang.String r3 = "rewarded"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L96
            r2 = r6
            goto L97
        L82:
            java.lang.String r3 = "native"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L96
            r2 = r4
            goto L97
        L8c:
            java.lang.String r3 = "banner"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L96
            r2 = 0
            goto L97
        L96:
            r2 = -1
        L97:
            if (r2 == 0) goto Lab
            if (r2 == r7) goto La8
            if (r2 == r4) goto La5
            if (r2 == r6) goto La2
            com.google.android.gms.internal.ads.zzbgj$zzd$zza r2 = com.google.android.gms.internal.ads.zzbgj.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED
            goto Lad
        La2:
            com.google.android.gms.internal.ads.zzbgj$zzd$zza r2 = com.google.android.gms.internal.ads.zzbgj.zzd.zza.REWARD_BASED_VIDEO_AD
            goto Lad
        La5:
            com.google.android.gms.internal.ads.zzbgj$zzd$zza r2 = com.google.android.gms.internal.ads.zzbgj.zzd.zza.NATIVE_APP_INSTALL
            goto Lad
        La8:
            com.google.android.gms.internal.ads.zzbgj$zzd$zza r2 = com.google.android.gms.internal.ads.zzbgj.zzd.zza.INTERSTITIAL
            goto Lad
        Lab:
            com.google.android.gms.internal.ads.zzbgj$zzd$zza r2 = com.google.android.gms.internal.ads.zzbgj.zzd.zza.BANNER
        Lad:
            r5.add(r2)
            goto L57
        Lb1:
            com.google.android.gms.internal.ads.zzbgj$zzaf$zzd r7 = com.google.android.gms.internal.ads.zzehz.zze(r9)
            com.google.android.gms.internal.ads.zzbgj$zzab r6 = r0.zzb(r9)
            boolean r4 = r8.zza
            com.google.android.gms.internal.ads.zzehx r9 = new com.google.android.gms.internal.ads.zzehx
            r2 = r9
            r3 = r8
            r2.<init>()
            com.google.android.gms.internal.ads.zzehn r0 = r0.zza
            r0.zza(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzehy.zzb(java.lang.Object):void");
    }
}
