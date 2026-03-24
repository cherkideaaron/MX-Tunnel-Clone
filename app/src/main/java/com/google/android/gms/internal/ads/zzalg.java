package com.google.android.gms.internal.ads;

import defpackage.Vs;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzalg implements zzagc {
    public final int zza;
    public final zzgxx zzb;

    public zzalg(int i, int[] iArr) {
        this.zza = i;
        this.zzb = iArr != null ? zzgxx.zzb(iArr) : zzgxx.zza();
    }

    public final String toString() {
        zzgxx zzgxxVar = this.zzb;
        ArrayList arrayList = new ArrayList(zzgxxVar.zzc());
        for (int i = 0; i < zzgxxVar.zzc(); i++) {
            arrayList.add(zzfj.zzx(zzgxxVar.zzd(i)));
        }
        String strZzx = zzfj.zzx(this.zza);
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder(Vs.f(strZzx.length() + 37, 1, string));
        sb.append("UnsupportedBrands{major=");
        sb.append(strZzx);
        sb.append(", compatible=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
