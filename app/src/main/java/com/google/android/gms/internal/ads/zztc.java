package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class zztc extends zzcp {
    private int zzd;
    private boolean zze;
    private int zzf;
    private long zzg;
    private byte[] zzi;
    private byte[] zzl;
    private int zzh = 0;
    private int zzj = 0;
    private int zzk = 0;

    public zztc() {
        byte[] bArr = zzfj.zzb;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    private final void zzs(boolean z) {
        int i;
        int length;
        int i2 = this.zzk;
        int length2 = this.zzi.length;
        if (i2 != length2) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        if (this.zzh == 0) {
            if (z) {
                zzu(i2, 3);
                length = i2;
            } else {
                zzgrc.zzi(i2 >= (length2 >> 1));
                length = this.zzi.length >> 1;
                zzu(length, 0);
            }
            i = length;
        } else {
            int i3 = length2 >> 1;
            int i4 = i2 - i3;
            if (z) {
                int iZzt = zzt(i4) + (this.zzi.length >> 1);
                zzu(iZzt, 2);
                int i5 = i3 + i4;
                i = iZzt;
                length = i5;
            } else {
                int iZzt2 = zzt(i4);
                zzu(iZzt2, 1);
                i = iZzt2;
                length = i4;
            }
        }
        if (length % this.zzd != 0) {
            throw new IllegalStateException(zzgrt.zzd("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
        }
        zzgrc.zzi(i2 >= i);
        this.zzk -= length;
        int i6 = this.zzj + length;
        this.zzj = i6;
        this.zzj = i6 % this.zzi.length;
        this.zzh = (i / this.zzd) + this.zzh;
        this.zzg += (length - i) / r1;
    }

    private final int zzt(int i) {
        int iZzw = ((zzw(2000000L) - this.zzh) * this.zzd) - (this.zzi.length >> 1);
        zzgrc.zzi(iZzw >= 0);
        int iMin = (int) Math.min((i * 0.2f) + 0.5f, iZzw);
        int i2 = this.zzd;
        return (iMin / i2) * i2;
    }

    private final void zzu(int i, int i2) {
        int i3;
        if (i == 0) {
            return;
        }
        zzgrc.zza(this.zzk >= i);
        int i4 = this.zzj;
        if (i2 == 2) {
            int i5 = this.zzk;
            int i6 = i4 + i5;
            byte[] bArr = this.zzi;
            int length = bArr.length;
            if (i6 <= length) {
                System.arraycopy(bArr, i6 - i, this.zzl, 0, i);
            } else {
                int i7 = i5 - (length - i4);
                if (i7 >= i) {
                    System.arraycopy(bArr, i7 - i, this.zzl, 0, i);
                } else {
                    int i8 = i - i7;
                    System.arraycopy(bArr, length - i8, this.zzl, 0, i8);
                    System.arraycopy(this.zzi, 0, this.zzl, i8, i7);
                }
            }
        } else {
            int i9 = i4 + i;
            byte[] bArr2 = this.zzi;
            int length2 = bArr2.length;
            if (i9 <= length2) {
                System.arraycopy(bArr2, i4, this.zzl, 0, i);
            } else {
                int i10 = length2 - i4;
                System.arraycopy(bArr2, i4, this.zzl, 0, i10);
                System.arraycopy(this.zzi, 0, this.zzl, i10, i - i10);
            }
        }
        zzgrc.zzd(i % this.zzd == 0, "sizeToOutput is not aligned to frame size: %s", i);
        zzgrc.zzi(this.zzj < this.zzi.length);
        byte[] bArr3 = this.zzl;
        zzgrc.zzd(i % this.zzd == 0, "byteOutput size is not aligned to frame size %s", i);
        if (i2 != 3) {
            for (int i11 = 0; i11 < i; i11 += 2) {
                int i12 = i11 + 1;
                int iZzv = zzv(bArr3[i12], bArr3[i11]);
                if (i2 == 0) {
                    i3 = ((((i11 * 1000) / (i - 1)) * (-90)) / 1000) + 100;
                } else {
                    i3 = 10;
                    if (i2 == 2) {
                        i3 = 10 + (((90000 * i11) / (i - 1)) / 1000);
                    }
                }
                int i13 = (iZzv * i3) / 100;
                if (i13 >= 32767) {
                    bArr3[i11] = -1;
                    bArr3[i12] = 127;
                } else if (i13 <= -32768) {
                    bArr3[i11] = 0;
                    bArr3[i12] = -128;
                } else {
                    bArr3[i11] = (byte) (i13 & 255);
                    bArr3[i12] = (byte) (i13 >> 8);
                }
            }
        }
        zzk(i).put(bArr3, 0, i).flip();
    }

    private static int zzv(byte b, byte b2) {
        return (b << 8) | (b2 & 255);
    }

    private final int zzw(long j) {
        return (int) ((j * this.zzb.zzb) / 1000000);
    }

    private static final boolean zzx(byte b, byte b2) {
        return Math.abs(zzv(b, b2)) > 1024;
    }

    @Override // com.google.android.gms.internal.ads.zzcp, com.google.android.gms.internal.ads.zzco
    public final boolean zzc() {
        return super.zzc() && this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzd(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        int iLimit2;
        int i;
        while (byteBuffer.hasRemaining() && !zzl()) {
            if (this.zzf != 0) {
                zzgrc.zzi(this.zzj < this.zzi.length);
                iLimit = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit2 = byteBuffer.limit();
                        break;
                    } else {
                        if (zzx(byteBuffer.get(iPosition2), byteBuffer.get(iPosition2 - 1))) {
                            int i2 = this.zzd;
                            iLimit2 = (iPosition2 / i2) * i2;
                            break;
                        }
                        iPosition2 += 2;
                    }
                }
                int iPosition3 = iLimit2 - byteBuffer.position();
                int i3 = this.zzj;
                int i4 = this.zzk;
                int i5 = i3 + i4;
                int length = this.zzi.length;
                if (i5 < length) {
                    i = length - i5;
                } else {
                    i5 = i4 - (length - i3);
                    i = i3 - i5;
                }
                int iMin = Math.min(iPosition3, i);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.zzi, i5, iMin);
                int i6 = this.zzk + iMin;
                this.zzk = i6;
                zzgrc.zzi(i6 <= this.zzi.length);
                boolean z = iLimit2 < iLimit && iPosition3 < i;
                zzs(z);
                if (z) {
                    this.zzf = 0;
                    this.zzh = 0;
                }
            } else {
                iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.zzi.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (zzx(byteBuffer.get(iLimit3), byteBuffer.get(iLimit3 - 1))) {
                            int i7 = this.zzd;
                            iPosition = ((iLimit3 / i7) * i7) + i7;
                            break;
                        }
                        iLimit3 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.zzf = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    zzk(byteBuffer.remaining()).put(byteBuffer).flip();
                }
            }
            byteBuffer.limit(iLimit);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcl zzm(zzcl zzclVar) throws zzcn {
        if (zzclVar.zzd == 2) {
            return zzclVar.zzb == -1 ? zzcl.zza : zzclVar;
        }
        throw new zzcn("Unhandled input format:", zzclVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzn() {
        if (this.zzk > 0) {
            zzs(true);
            this.zzh = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzo() {
        if (zzc()) {
            int i = this.zzb.zzc;
            this.zzd = i + i;
            int iZzw = zzw(100000L) / 2;
            int i2 = this.zzd;
            int i3 = (iZzw / i2) * i2;
            int i4 = i3 + i3;
            if (this.zzi.length != i4) {
                this.zzi = new byte[i4];
                this.zzl = new byte[i4];
            }
        }
        this.zzf = 0;
        this.zzg = 0L;
        this.zzh = 0;
        this.zzj = 0;
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzp() {
        this.zze = false;
        byte[] bArr = zzfj.zzb;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    public final void zzq(boolean z) {
        this.zze = z;
    }

    public final long zzr() {
        return this.zzg;
    }
}
