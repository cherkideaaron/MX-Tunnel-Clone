package com.google.android.recaptcha.internal;

/* loaded from: classes2.dex */
public class zzmz extends zzmx implements zzoj {
    public zzmz(zzna zznaVar) {
        super(zznaVar);
    }

    @Override // com.google.android.recaptcha.internal.zzmx, com.google.android.recaptcha.internal.zzoh
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzna zzl() {
        zznd zzndVarZzl;
        if (((zzna) this.zza).zzL()) {
            ((zzna) this.zza).zzb.zzg();
            zzndVarZzl = super.zzl();
        } else {
            zzndVarZzl = this.zza;
        }
        return (zzna) zzndVarZzl;
    }

    @Override // com.google.android.recaptcha.internal.zzmx
    public final void zzo() {
        super.zzo();
        if (((zzna) this.zza).zzb != zzmt.zzd()) {
            zzna zznaVar = (zzna) this.zza;
            zznaVar.zzb = zznaVar.zzb.clone();
        }
    }
}
