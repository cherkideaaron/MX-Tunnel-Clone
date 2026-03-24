package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.AbstractC3264qG;
import java.util.Locale;

/* loaded from: classes.dex */
final class zziat extends zziaw {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    public zziat(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(AbstractC3264qG.e(length, i2, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.zza = bArr;
        this.zzc = 0;
        this.zzb = i2;
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzH(int i, int i2) throws zziau {
        zzs((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzI(int i, int i2) throws zziau {
        zzs(i << 3);
        zzr(i2);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzJ(int i, int i2) throws zziau {
        zzs(i << 3);
        zzs(i2);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzK(int i, int i2) throws zziau {
        zzs((i << 3) | 5);
        zzt(i2);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzL(int i, long j) throws zziau {
        zzs(i << 3);
        zzu(j);
    }

    @Override // com.google.android.gms.internal.ads.zziae
    public final void zza(byte[] bArr, int i, int i2) throws zziau {
        zzw(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzh(int i, long j) throws zziau {
        zzs((i << 3) | 1);
        zzv(j);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzi(int i, boolean z) throws zziau {
        zzs(i << 3);
        zzq(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzj(int i, String str) throws zziau {
        zzs((i << 3) | 2);
        zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzk(int i, zzian zzianVar) throws zziau {
        zzs((i << 3) | 2);
        zzl(zzianVar);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzl(zzian zzianVar) throws zziau {
        zzs(zzianVar.zzc());
        zzianVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzm(byte[] bArr, int i, int i2) throws zziau {
        zzs(i2);
        zzw(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzn(int i, zzidc zzidcVar) throws zziau {
        zzs(11);
        zzJ(2, i);
        zzs(26);
        zzp(zzidcVar);
        zzs(12);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzo(int i, zzian zzianVar) throws zziau {
        zzs(11);
        zzJ(2, i);
        zzk(3, zzianVar);
        zzs(12);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzp(zzidc zzidcVar) throws zziau {
        zzs(zzidcVar.zzbr());
        zzidcVar.zzcX(this);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzq(byte b) throws zziau {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i;
        int i2 = this.zzc;
        try {
            i = i2 + 1;
        } catch (IndexOutOfBoundsException e) {
            indexOutOfBoundsException = e;
        }
        try {
            this.zza[i2] = b;
            this.zzc = i;
        } catch (IndexOutOfBoundsException e2) {
            indexOutOfBoundsException = e2;
            i2 = i;
            throw new zziau(i2, this.zzb, 1, indexOutOfBoundsException);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzr(int i) throws zziau {
        if (i >= 0) {
            zzs(i);
        } else {
            zzu(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzs(int i) throws zziau {
        int i2;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i3 = this.zzc;
        while ((i & (-128)) != 0) {
            try {
                i2 = i3 + 1;
            } catch (IndexOutOfBoundsException e) {
                indexOutOfBoundsException = e;
                throw new zziau(i3, this.zzb, 1, indexOutOfBoundsException);
            }
            try {
                this.zza[i3] = (byte) (i | UserVerificationMethods.USER_VERIFY_PATTERN);
                i >>>= 7;
                i3 = i2;
            } catch (IndexOutOfBoundsException e2) {
                indexOutOfBoundsException = e2;
                i3 = i2;
                throw new zziau(i3, this.zzb, 1, indexOutOfBoundsException);
            }
        }
        i2 = i3 + 1;
        this.zza[i3] = (byte) i;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzt(int i) throws zziau {
        int i2 = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.zzc = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zziau(i2, this.zzb, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzu(long j) throws zziau {
        int i;
        IndexOutOfBoundsException indexOutOfBoundsException;
        boolean z = zziaw.zza;
        int i2 = this.zzc;
        if (!z || this.zzb - i2 < 10) {
            while ((j & (-128)) != 0) {
                try {
                    int i3 = i2 + 1;
                    try {
                        this.zza[i2] = (byte) (((int) j) | UserVerificationMethods.USER_VERIFY_PATTERN);
                        j >>>= 7;
                        i2 = i3;
                    } catch (IndexOutOfBoundsException e) {
                        indexOutOfBoundsException = e;
                        i2 = i3;
                        throw new zziau(i2, this.zzb, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                }
            }
            i = i2 + 1;
            try {
                this.zza[i2] = (byte) j;
            } catch (IndexOutOfBoundsException e3) {
                indexOutOfBoundsException = e3;
                i2 = i;
                throw new zziau(i2, this.zzb, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j & (-128)) != 0) {
                zziem.zzp(this.zza, i2, (byte) (((int) j) | UserVerificationMethods.USER_VERIFY_PATTERN));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            zziem.zzp(this.zza, i2, (byte) j);
        }
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzv(long j) throws zziau {
        int i = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.zzc = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zziau(i, this.zzb, 8, e);
        }
    }

    public final void zzw(byte[] bArr, int i, int i2) throws zziau {
        try {
            System.arraycopy(bArr, i, this.zza, this.zzc, i2);
            this.zzc += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zziau(this.zzc, this.zzb, i2, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzx(String str) throws zziau {
        int i = this.zzc;
        try {
            int iZzA = zziaw.zzA(str.length() * 3);
            int iZzA2 = zziaw.zzA(str.length());
            if (iZzA2 != iZzA) {
                zzs(zzier.zzc(str));
                byte[] bArr = this.zza;
                int i2 = this.zzc;
                this.zzc = zzier.zzd(str, bArr, i2, this.zzb - i2);
                return;
            }
            int i3 = i + iZzA2;
            this.zzc = i3;
            int iZzd = zzier.zzd(str, this.zza, i3, this.zzb - i3);
            this.zzc = i;
            zzs((iZzd - i) - iZzA2);
            this.zzc = iZzd;
        } catch (IndexOutOfBoundsException e) {
            throw new zziau(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzy() {
    }
}
