package com.google.android.gms.internal.ads;

import defpackage.AbstractC0500aq;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzgmx implements zzgmu {
    private final zzgoe zza;
    private final long zzb;

    public zzgmx(zzgao zzgaoVar, zzgoe zzgoeVar, long j) {
        this.zza = zzgoeVar;
        this.zzb = j;
    }

    private static boolean zzc(zzgdu zzgduVar) {
        int iZza = zzgduVar.zzb().zza().zza();
        int iZzb = zzgduVar.zzb().zza().zzb();
        byte[] bArrZza = zzatu.zza();
        AbstractC0500aq.m(bArrZza, "versionArray");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        AbstractC0500aq.l(byteBufferAllocate, "allocate(...)");
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort((short) iZza);
        byteBufferAllocate.putInt(iZzb);
        byte[] bArrArray = byteBufferAllocate.array();
        AbstractC0500aq.l(bArrArray, "array(...)");
        return Arrays.equals(bArrArray, bArrZza);
    }

    @Override // com.google.android.gms.internal.ads.zzgmu
    public final boolean zza(zzgdu zzgduVar) {
        zzgoe zzgoeVar;
        int i;
        if (zzgduVar == null || zzgduVar.equals(zzgdu.zzg())) {
            zzgoeVar = this.zza;
            i = 20202;
        } else {
            if (zzc(zzgduVar)) {
                boolean z = zzgduVar.zzb().zzc() - System.currentTimeMillis() <= this.zzb;
                if (z) {
                    this.zza.zzb(20203);
                }
                return z;
            }
            zzgoeVar = this.zza;
            i = 20205;
        }
        zzgoeVar.zzb(i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgmu
    public final boolean zzb(zzgdu zzgduVar) {
        zzgoe zzgoeVar;
        int i;
        if (zzgduVar == null || zzgduVar.equals(zzgdu.zzg())) {
            zzgoeVar = this.zza;
            i = 20204;
        } else {
            if (zzc(zzgduVar)) {
                return true;
            }
            zzgoeVar = this.zza;
            i = 20206;
        }
        zzgoeVar.zzb(i);
        return false;
    }
}
