package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaua implements zzaty {
    private int zza = (((((~1539942439) & 2070175971) | 1100945533) + ((1539942439 & (-1166483302)) | (-2145608135))) - 96382817) ^ (1143565421 % 981914693);
    private final byte[] zzb = new byte[(((((~991039875) & 475472926) | 1225689584) + ((991039875 & 357672014) | 1805818736)) - (-1256743880)) ^ (1671581032 % 1337434154)];
    private final zzauc zzc;

    public zzaua(zzauc zzaucVar) {
        this.zzc = zzaucVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final byte zza(zzauk zzaukVar, int i) {
        int i2 = ((((~1264448664) & 231739608) | 1128901767) + ((1264448664 & 479203675) | 860794247)) - 1823332376;
        int i3 = 1761855727 % 1384724137;
        int i4 = (((((~143154913) & 992498304) | 439467622) + ((143154913 & 1627930754) | 1212551295)) - (-2089988634)) ^ (2033018190 % 70061690);
        int i5 = ((((~1661299468) & 613450408) | 2017391535) + ((1661299468 & 109051904) | 2071555381)) - (-441392543);
        int i6 = 1694830070 % 1383960411;
        int i7 = i >>> i4;
        if (i7 != this.zza) {
            this.zzc.zza(i7, this.zzb);
            this.zza = i7;
        }
        int i8 = i5 ^ i6;
        return (byte) (((zzaukVar.zzb(i) ^ this.zzb[i % (i2 ^ i3)]) << i8) >> i8);
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final zzauk zzb(zzauk zzaukVar, int i, int i2) {
        if (i < 0 || i > i2 || i2 > zzaukVar.zza.length) {
            throw new IndexOutOfBoundsException();
        }
        byte[] bArr = new byte[i2 - i];
        int i3 = 0;
        while (i < i2) {
            bArr[i3] = zza(zzaukVar, i);
            i++;
            i3++;
        }
        return zzauk.zze(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final /* bridge */ /* synthetic */ zzaty zzc() {
        return new zzaua(this.zzc);
    }
}
