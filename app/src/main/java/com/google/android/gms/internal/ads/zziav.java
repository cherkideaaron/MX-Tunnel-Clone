package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
final class zziav extends zzias {
    private final OutputStream zzg;

    public zziav(OutputStream outputStream, int i) {
        super(i);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.zzg = outputStream;
    }

    private final void zzF(int i) throws IOException {
        if (this.zzb - this.zzc < i) {
            zzG();
        }
    }

    private final void zzG() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzH(int i, int i2) {
        zzs((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzI(int i, int i2) throws IOException {
        zzF(20);
        zzd(i << 3);
        if (i2 >= 0) {
            zzd(i2);
        } else {
            zze(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzJ(int i, int i2) throws IOException {
        zzF(20);
        zzd(i << 3);
        zzd(i2);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzK(int i, int i2) throws IOException {
        zzF(14);
        zzd((i << 3) | 5);
        zzf(i2);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzL(int i, long j) throws IOException {
        zzF(20);
        zzd(i << 3);
        zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zziae
    public final void zza(byte[] bArr, int i, int i2) throws IOException {
        zzw(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzh(int i, long j) throws IOException {
        zzF(18);
        zzd((i << 3) | 1);
        zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzi(int i, boolean z) throws IOException {
        zzF(11);
        zzd(i << 3);
        zzc(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzj(int i, String str) throws zzieq, IOException {
        zzs((i << 3) | 2);
        zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzk(int i, zzian zzianVar) {
        zzs((i << 3) | 2);
        zzl(zzianVar);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzl(zzian zzianVar) {
        zzs(zzianVar.zzc());
        zzianVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzm(byte[] bArr, int i, int i2) throws IOException {
        zzs(i2);
        zzw(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzn(int i, zzidc zzidcVar) throws IOException {
        zzs(11);
        zzJ(2, i);
        zzs(26);
        zzp(zzidcVar);
        zzs(12);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzo(int i, zzian zzianVar) throws IOException {
        zzs(11);
        zzJ(2, i);
        zzk(3, zzianVar);
        zzs(12);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzp(zzidc zzidcVar) {
        zzs(zzidcVar.zzbr());
        zzidcVar.zzcX(this);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzq(byte b) throws IOException {
        if (this.zzc == this.zzb) {
            zzG();
        }
        zzc(b);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzr(int i) throws IOException {
        if (i >= 0) {
            zzs(i);
        } else {
            zzu(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzs(int i) {
        zzF(5);
        zzd(i);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzt(int i) throws IOException {
        zzF(4);
        zzf(i);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzu(long j) throws IOException {
        zzF(10);
        zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzv(long j) throws IOException {
        zzF(8);
        zzg(j);
    }

    public final void zzw(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.zzb;
        int i4 = this.zzc;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.zza, i4, i2);
            this.zzc += i2;
        } else {
            byte[] bArr2 = this.zza;
            System.arraycopy(bArr, i, bArr2, i4, i5);
            int i6 = i + i5;
            this.zzc = i3;
            this.zzd += i5;
            zzG();
            i2 -= i5;
            if (i2 <= i3) {
                System.arraycopy(bArr, i6, bArr2, 0, i2);
                this.zzc = i2;
            } else {
                this.zzg.write(bArr, i6, i2);
            }
        }
        this.zzd += i2;
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzx(String str) throws zzieq, IOException {
        int iZzc;
        int iZzd;
        int length = str.length() * 3;
        int iZzA = zziaw.zzA(length);
        int i = iZzA + length;
        int i2 = this.zzb;
        if (i > i2) {
            byte[] bArr = new byte[length];
            int iZzd2 = zzier.zzd(str, bArr, 0, length);
            zzs(iZzd2);
            zzw(bArr, 0, iZzd2);
            return;
        }
        if (i > i2 - this.zzc) {
            zzG();
        }
        int iZzA2 = zziaw.zzA(str.length());
        int i3 = this.zzc;
        try {
            if (iZzA2 == iZzA) {
                int i4 = i3 + iZzA2;
                this.zzc = i4;
                iZzd = zzier.zzd(str, this.zza, i4, i2 - i4);
                this.zzc = i3;
                iZzc = (iZzd - i3) - iZzA2;
                zzd(iZzc);
            } else {
                iZzc = zzier.zzc(str);
                zzd(iZzc);
                iZzd = zzier.zzd(str, this.zza, this.zzc, iZzc);
            }
            this.zzc = iZzd;
            this.zzd += iZzc;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zziau(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzy() {
        if (this.zzc > 0) {
            zzG();
        }
    }
}
