package com.google.android.gms.internal.ads;

import android.util.Base64;
import defpackage.As;
import defpackage.C0451Zn;
import defpackage.C3483uJ;

/* loaded from: classes.dex */
final /* synthetic */ class zzfbq implements zzgyw {
    static final /* synthetic */ zzfbq zza = new zzfbq();

    private /* synthetic */ zzfbq() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final As zza(Object obj) {
        C0451Zn c0451Zn = (C0451Zn) obj;
        if (c0451Zn == null) {
            return zzgzo.zza(new zzfbs("", 1, null));
        }
        zzifk zzifkVarZzc = zzifl.zzc();
        for (C3483uJ c3483uJ : c0451Zn.a) {
            zzifi zzifiVarZzc = zzifj.zzc();
            zzifiVarZzc.zza(c3483uJ.c);
            zzifiVarZzc.zzb(c3483uJ.b);
            zzifiVarZzc.zzc(c3483uJ.a);
            zzifkVarZzc.zza((zzifj) zzifiVarZzc.zzbu());
        }
        return zzgzo.zza(new zzfbs(Base64.encodeToString(((zzifl) zzifkVarZzc.zzbu()).zzaN(), 1), 1, null));
    }
}
