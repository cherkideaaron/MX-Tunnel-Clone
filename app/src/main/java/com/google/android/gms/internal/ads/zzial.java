package com.google.android.gms.internal.ads;

import defpackage.AbstractC3264qG;
import defpackage.Vs;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzial extends zziak {
    private final byte[] zzb;

    public zzial(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final byte zza(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final byte zzb(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final int zzc() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final zzian zzd(int i, int i2) {
        byte[] bArr = this.zzb;
        int iZzC = zzian.zzC(i, i2, bArr.length);
        return iZzC == 0 ? zzian.zza : new zziah(bArr, i, iZzC);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzb, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final ByteBuffer zzf() {
        return ByteBuffer.wrap(this.zzb).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final void zzg(zziae zziaeVar) {
        byte[] bArr = this.zzb;
        zziaeVar.zza(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final String zzh(Charset charset) {
        return new String(this.zzb, charset);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final boolean zzi() {
        return zzier.zza(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final boolean zzj(zzian zzianVar) {
        return zzianVar instanceof zzial ? Arrays.equals(this.zzb, ((zzial) zzianVar).zzb) : zzianVar instanceof zziah ? zzk(zzianVar, 0, this.zzb.length) : zzianVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zziak
    public final boolean zzk(zzian zzianVar, int i, int i2) {
        if (i2 > zzianVar.zzc()) {
            byte[] bArr = this.zzb;
            int length = String.valueOf(i2).length();
            int length2 = bArr.length;
            StringBuilder sb = new StringBuilder(length + 18 + String.valueOf(length2).length());
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        int i3 = i + i2;
        if (i3 <= zzianVar.zzc()) {
            if (zzianVar instanceof zzial) {
                return zzian.zzD(this.zzb, 0, ((zzial) zzianVar).zzb, i, i2);
            }
            if (!(zzianVar instanceof zziah)) {
                return zzianVar.zzd(i, i3).equals(zzd(0, i2));
            }
            zziah zziahVar = (zziah) zzianVar;
            return zzian.zzD(this.zzb, 0, zziahVar.zzn(), zziahVar.zzo() + i, i2);
        }
        int iZzc = zzianVar.zzc();
        int length3 = String.valueOf(i).length();
        StringBuilder sb2 = new StringBuilder(length3 + 24 + String.valueOf(i2).length() + 2 + String.valueOf(iZzc).length());
        Vs.x(sb2, "Ran off end of other: ", i, ", ", i2);
        throw new IllegalArgumentException(AbstractC3264qG.k(sb2, ", ", iZzc));
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final int zzl(int i, int i2, int i3) {
        return zzice.zzc(i, this.zzb, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final zziaq zzm() {
        byte[] bArr = this.zzb;
        return zziaq.zzG(bArr, 0, bArr.length, true);
    }

    public final /* synthetic */ byte[] zzn() {
        return this.zzb;
    }
}
