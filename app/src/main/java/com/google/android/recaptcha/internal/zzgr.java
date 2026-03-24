package com.google.android.recaptcha.internal;

import defpackage.AbstractC3400sr;
import defpackage.DK;
import defpackage.InterfaceC3396sn;

/* loaded from: classes2.dex */
final class zzgr extends AbstractC3400sr implements InterfaceC3396sn {
    final /* synthetic */ zzgd zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgr(zzgd zzgdVar, String str, int i) {
        super(2);
        this.zza = zzgdVar;
        this.zzb = str;
        this.zzc = i;
    }

    @Override // defpackage.InterfaceC3396sn
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        this.zza.zzi().zzb(this.zzb, (String) obj2);
        int i = this.zzc;
        if (i != -1) {
            this.zza.zzc().zze(i, objArr);
        }
        return DK.a;
    }
}
