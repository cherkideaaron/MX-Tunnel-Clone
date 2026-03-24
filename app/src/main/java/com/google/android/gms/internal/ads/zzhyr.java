package com.google.android.gms.internal.ads;

import defpackage.Vs;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzhyr extends zzhys {
    final /* synthetic */ zzhys zza;

    public /* synthetic */ zzhyr(zzhys zzhysVar, byte[] bArr) {
        Objects.requireNonNull(zzhysVar);
        this.zza = zzhysVar;
    }

    public final String toString() {
        String string = this.zza.toString();
        return Vs.o(new StringBuilder(string.length() + 21), "NullSafeTypeAdapter[", string, "]");
    }

    @Override // com.google.android.gms.internal.ads.zzhys
    public final void zza(zzhzs zzhzsVar, Object obj) {
        throw null;
    }
}
