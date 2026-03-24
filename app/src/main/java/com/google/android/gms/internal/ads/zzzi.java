package com.google.android.gms.internal.ads;

import defpackage.VQ;

/* loaded from: classes.dex */
final class zzzi extends zzzs implements Comparable {
    private final int zze;
    private final int zzf;

    public zzzi(int i, zzbg zzbgVar, int i2, zzzl zzzlVar, int i3) {
        super(i, zzbgVar, i2);
        this.zze = VQ.c(i3, zzzlVar.zzV) ? 1 : 0;
        this.zzf = this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzzi zzziVar) {
        return Integer.compare(this.zzf, zzziVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final /* bridge */ /* synthetic */ boolean zzc(zzzs zzzsVar) {
        return false;
    }
}
