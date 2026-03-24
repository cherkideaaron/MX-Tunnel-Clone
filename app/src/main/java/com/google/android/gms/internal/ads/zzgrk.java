package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgrk extends zzgrp {
    public zzgrk(zzgrr zzgrrVar, CharSequence charSequence, int i) {
        super(zzgrrVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    public final int zzc(int i) {
        int i2 = i + 4000;
        if (i2 < ((zzgrp) this).zzb.length()) {
            return i2;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    public final int zzd(int i) {
        return i;
    }
}
