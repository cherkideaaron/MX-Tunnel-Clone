package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes.dex */
public final class zzdba {
    public static final zzcce zza(Context context, VersionInfoParcel versionInfoParcel, zzfir zzfirVar, zzcca zzccaVar) {
        zzccb zzccbVar = zzfirVar.zzA;
        if (zzccbVar == null) {
            return null;
        }
        zzfiw zzfiwVar = zzfirVar.zzs;
        return new zzcbz(context, versionInfoParcel, zzccbVar, zzfiwVar == null ? null : zzfiwVar.zzb, zzccaVar);
    }
}
