package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzbeh implements Comparator {
    public zzbeh(zzbej zzbejVar) {
        Objects.requireNonNull(zzbejVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbem zzbemVar = (zzbem) obj;
        zzbem zzbemVar2 = (zzbem) obj2;
        int i = zzbemVar.zzc - zzbemVar2.zzc;
        return i != 0 ? i : Long.compare(zzbemVar.zza, zzbemVar2.zza);
    }
}
