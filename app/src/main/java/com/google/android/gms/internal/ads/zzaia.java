package com.google.android.gms.internal.ads;

import defpackage.AbstractC3264qG;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzaia implements zzao {
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzaia(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = i5;
        this.zzh = bArr;
    }

    public static zzaia zzb(zzer zzerVar) {
        int iZzB = zzerVar.zzB();
        String strZzh = zzas.zzh(zzerVar.zzK(zzerVar.zzB(), StandardCharsets.US_ASCII));
        String strZzK = zzerVar.zzK(zzerVar.zzB(), StandardCharsets.UTF_8);
        int iZzB2 = zzerVar.zzB();
        int iZzB3 = zzerVar.zzB();
        int iZzB4 = zzerVar.zzB();
        int iZzB5 = zzerVar.zzB();
        int iZzB6 = zzerVar.zzB();
        byte[] bArr = new byte[iZzB6];
        zzerVar.zzm(bArr, 0, iZzB6);
        return new zzaia(iZzB, strZzh, strZzK, iZzB2, iZzB3, iZzB4, iZzB5, bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaia.class == obj.getClass()) {
            zzaia zzaiaVar = (zzaia) obj;
            if (this.zza == zzaiaVar.zza && this.zzb.equals(zzaiaVar.zzb) && this.zzc.equals(zzaiaVar.zzc) && this.zzd == zzaiaVar.zzd && this.zze == zzaiaVar.zze && this.zzf == zzaiaVar.zzf && this.zzg == zzaiaVar.zzg && Arrays.equals(this.zzh, zzaiaVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza + 527;
        int iHashCode = this.zzb.hashCode() + (i * 31);
        int iHashCode2 = this.zzc.hashCode() + (iHashCode * 31);
        byte[] bArr = this.zzh;
        return Arrays.hashCode(bArr) + (((((((((iHashCode2 * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31);
    }

    public final String toString() {
        String str = this.zzb;
        int length = String.valueOf(str).length();
        String str2 = this.zzc;
        return AbstractC3264qG.m(new StringBuilder(str2.length() + length + 32), "Picture: mimeType=", str, ", description=", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final void zza(zzam zzamVar) {
        zzamVar.zzf(this.zzh, this.zza);
    }
}
