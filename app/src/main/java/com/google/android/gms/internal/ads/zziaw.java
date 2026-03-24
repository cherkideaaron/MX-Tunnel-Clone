package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class zziaw extends zziae {
    private static final boolean zza = zziem.zza();
    public static final /* synthetic */ int zzf = 0;
    Object zze;

    private zziaw() {
        throw null;
    }

    public static int zzA(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int zzB(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int zzC(zzidc zzidcVar) {
        int iZzbr = zzidcVar.zzbr();
        return zzA(iZzbr) + iZzbr;
    }

    public static int zzz(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public final void zzD() {
        if (zzb() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void zzH(int i, int i2);

    public abstract void zzI(int i, int i2);

    public abstract void zzJ(int i, int i2);

    public abstract void zzK(int i, int i2);

    public abstract void zzL(int i, long j);

    public abstract int zzb();

    public abstract void zzh(int i, long j);

    public abstract void zzi(int i, boolean z);

    public abstract void zzj(int i, String str);

    public abstract void zzk(int i, zzian zzianVar);

    public abstract void zzl(zzian zzianVar);

    public abstract void zzm(byte[] bArr, int i, int i2);

    public abstract void zzn(int i, zzidc zzidcVar);

    public abstract void zzo(int i, zzian zzianVar);

    public abstract void zzp(zzidc zzidcVar);

    public abstract void zzq(byte b);

    public abstract void zzr(int i);

    public abstract void zzs(int i);

    public abstract void zzt(int i);

    public abstract void zzu(long j);

    public abstract void zzv(long j);

    public abstract void zzx(String str);

    public abstract void zzy();

    public /* synthetic */ zziaw(byte[] bArr) {
    }
}
