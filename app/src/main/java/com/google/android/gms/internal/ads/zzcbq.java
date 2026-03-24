package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardItem;

/* loaded from: classes.dex */
public final class zzcbq extends zzcav {
    private final String zza;
    private final int zzb;

    public zzcbq(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final String zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final int zzf() {
        return this.zzb;
    }

    public zzcbq(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }
}
