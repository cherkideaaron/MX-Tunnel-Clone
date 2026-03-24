package com.google.android.gms.internal.ads;

import defpackage.AbstractC0115Ga;
import defpackage.As;
import defpackage.C3036m8;
import defpackage.InterfaceC3091n8;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class zzgck implements zzgce {
    private final ExecutorService zza;
    private final String zzb;
    private final long zzc;

    public zzgck(ExecutorService executorService, String str, long j) {
        this.zza = executorService;
        this.zzb = str;
        this.zzc = j;
    }

    private final As zze(final String str, final boolean z, final byte[] bArr, final String str2) {
        return AbstractC0115Ga.x(new InterfaceC3091n8() { // from class: com.google.android.gms.internal.ads.zzgch
            @Override // defpackage.InterfaceC3091n8
            public final /* synthetic */ Object attachCompleter(C3036m8 c3036m8) {
                return this.zza.zzc(str, z, str2, bArr, c3036m8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(java.lang.String r6, defpackage.C3036m8 r7, boolean r8, java.lang.String r9, byte[] r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgck.zzd(java.lang.String, m8, boolean, java.lang.String, byte[]):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgce
    public final As zza(String str) {
        return zze(str, false, new byte[0], null);
    }

    @Override // com.google.android.gms.internal.ads.zzgce
    public final As zzb(String str, byte[] bArr, String str2) {
        return zze(str, true, bArr, "application/x-protobuf");
    }

    public final /* synthetic */ Object zzc(final String str, final boolean z, final String str2, final byte[] bArr, final C3036m8 c3036m8) {
        this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgcg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd(str, c3036m8, z, str2, bArr);
            }
        });
        return "";
    }
}
