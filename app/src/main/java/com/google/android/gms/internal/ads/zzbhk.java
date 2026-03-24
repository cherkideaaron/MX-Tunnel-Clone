package com.google.android.gms.internal.ads;

import android.text.TextUtils;

@Deprecated
/* loaded from: classes.dex */
public final class zzbhk {
    public static final void zza(zzbhj zzbhjVar, zzbhh zzbhhVar) {
        if (zzbhhVar.zzb() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zzbhhVar.zzc())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zzbhjVar.zza(zzbhhVar.zzb(), zzbhhVar.zzc(), zzbhhVar.zza(), zzbhhVar.zzd());
    }
}
