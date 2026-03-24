package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* loaded from: classes.dex */
final class zzgrj extends zzgrp {
    final /* synthetic */ zzgqr zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgrj(zzgrr zzgrrVar, CharSequence charSequence, zzgqr zzgqrVar) {
        super(zzgrrVar, charSequence);
        this.zza = zzgqrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    public final int zzc(int i) {
        Matcher matcher = ((zzgqu) this.zza).zza;
        if (matcher.find(i)) {
            return matcher.start();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    public final int zzd(int i) {
        return ((zzgqu) this.zza).zza.end();
    }
}
