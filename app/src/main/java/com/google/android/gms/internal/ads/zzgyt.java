package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
final class zzgyt extends zzgyr {
    private zzgyt() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyr
    public final void zza(zzgyu zzgyuVar, Set set, Set set2) {
        synchronized (zzgyuVar) {
            try {
                if (zzgyuVar.seenExceptionsField == null) {
                    zzgyuVar.seenExceptionsField = set2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyr
    public final int zzb(zzgyu zzgyuVar) {
        int i;
        synchronized (zzgyuVar) {
            i = zzgyuVar.remainingField - 1;
            zzgyuVar.remainingField = i;
        }
        return i;
    }

    public /* synthetic */ zzgyt(byte[] bArr) {
        super(null);
    }
}
