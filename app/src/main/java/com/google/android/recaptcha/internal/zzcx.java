package com.google.android.recaptcha.internal;

import android.content.pm.PackageManager;
import defpackage.AbstractC3547vc;
import defpackage.EnumC0321Sc;
import defpackage.IC;
import defpackage.InterfaceC3493uc;
import java.util.MissingResourceException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
final class zzcx extends AbstractC3547vc {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcx(zzdc zzdcVar, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.zzb = zzdcVar;
    }

    @Override // defpackage.AbstractC2543d7
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws PackageManager.NameNotFoundException, MissingResourceException {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objMo4executegIAlus = this.zzb.mo4executegIAlus(null, this);
        return objMo4executegIAlus == EnumC0321Sc.a ? objMo4executegIAlus : new IC(objMo4executegIAlus);
    }
}
