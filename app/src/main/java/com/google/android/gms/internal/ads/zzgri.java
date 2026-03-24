package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgri extends zzgrp {
    final /* synthetic */ zzgqq zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgri(zzgrr zzgrrVar, CharSequence charSequence, zzgqq zzgqqVar) {
        super(zzgrrVar, charSequence);
        this.zza = zzgqqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    public final int zzc(int i) {
        CharSequence charSequence = ((zzgrp) this).zzb;
        int length = charSequence.length();
        zzgrc.zzn(i, length, "index");
        while (i < length) {
            if (this.zza.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    public final int zzd(int i) {
        return i + 1;
    }
}
