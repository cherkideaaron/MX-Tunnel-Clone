package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzaat implements zzaan {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzaal[] zzd = new zzaal[100];

    public zzaat(boolean z, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzaan
    public final synchronized zzaal zza() {
        zzaal zzaalVar;
        try {
            this.zzb++;
            int i = this.zzc;
            if (i > 0) {
                zzaal[] zzaalVarArr = this.zzd;
                int i2 = i - 1;
                this.zzc = i2;
                zzaalVar = zzaalVarArr[i2];
                zzaalVar.getClass();
                zzaalVarArr[i2] = null;
            } else {
                zzaalVar = new zzaal(new byte[65536], 0);
                int i3 = this.zzb;
                zzaal[] zzaalVarArr2 = this.zzd;
                int length = zzaalVarArr2.length;
                if (i3 > length) {
                    this.zzd = (zzaal[]) Arrays.copyOf(zzaalVarArr2, length + length);
                    return zzaalVar;
                }
            }
            return zzaalVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaan
    public final synchronized void zzb(zzaal zzaalVar) {
        zzaal[] zzaalVarArr = this.zzd;
        int i = this.zzc;
        this.zzc = i + 1;
        zzaalVarArr[i] = zzaalVar;
        this.zzb--;
        notifyAll();
    }

    @Override // com.google.android.gms.internal.ads.zzaan
    public final synchronized void zzc(zzaam zzaamVar) {
        while (zzaamVar != null) {
            try {
                zzaal[] zzaalVarArr = this.zzd;
                int i = this.zzc;
                this.zzc = i + 1;
                zzaalVarArr[i] = zzaamVar.zzd();
                this.zzb--;
                zzaamVar = zzaamVar.zze();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    @Override // com.google.android.gms.internal.ads.zzaan
    public final synchronized void zzd() {
        int i = this.zza;
        String str = zzfj.zza;
        int iMax = Math.max(0, ((i + 65535) / 65536) - this.zzb);
        int i2 = this.zzc;
        if (iMax >= i2) {
            return;
        }
        Arrays.fill(this.zzd, iMax, i2, (Object) null);
        this.zzc = iMax;
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i) {
        int i2 = this.zza;
        this.zza = i;
        if (i < i2) {
            zzd();
        }
    }

    public final synchronized int zzg() {
        return this.zzb * 65536;
    }
}
