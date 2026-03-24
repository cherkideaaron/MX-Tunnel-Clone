package com.google.android.gms.internal.ads;

import android.app.Activity;
import defpackage.AbstractC3264qG;

/* loaded from: classes.dex */
final class zzeil extends zzejh {
    private final Activity zza;
    private final com.google.android.gms.ads.internal.overlay.zzm zzb;
    private final String zzc;
    private final String zzd;

    public /* synthetic */ zzeil(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, String str, String str2, byte[] bArr) {
        this.zza = activity;
        this.zzb = zzmVar;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzejh) {
            zzejh zzejhVar = (zzejh) obj;
            if (this.zza.equals(zzejhVar.zza()) && ((zzmVar = this.zzb) != null ? zzmVar.equals(zzejhVar.zzb()) : zzejhVar.zzb() == null) && ((str = this.zzc) != null ? str.equals(zzejhVar.zzc()) : zzejhVar.zzc() == null)) {
                String str2 = this.zzd;
                String strZzd = zzejhVar.zzd();
                if (str2 != null ? str2.equals(strZzd) : strZzd == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzb;
        int iHashCode2 = ((iHashCode * 1000003) ^ (zzmVar == null ? 0 : zzmVar.hashCode())) * 1000003;
        String str = this.zzc;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.zzd;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.zzb);
        int length2 = strValueOf.length();
        String str = this.zzc;
        int length3 = String.valueOf(str).length();
        String str2 = this.zzd;
        StringBuilder sb = new StringBuilder(length + 40 + length2 + 13 + length3 + 6 + String.valueOf(str2).length() + 1);
        AbstractC3264qG.v(sb, "OfflineUtilsParams{activity=", string, ", adOverlay=", strValueOf);
        AbstractC3264qG.v(sb, ", gwsQueryId=", str, ", uri=", str2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzejh
    public final Activity zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzejh
    public final com.google.android.gms.ads.internal.overlay.zzm zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzejh
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzejh
    public final String zzd() {
        return this.zzd;
    }
}
