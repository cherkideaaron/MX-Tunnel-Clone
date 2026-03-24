package com.google.android.recaptcha.internal;

import defpackage.AbstractC0500aq;
import defpackage.C0055Ci;
import defpackage.InterfaceC3396sn;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class zzfy extends zzfx {

    @NotNull
    private final InterfaceC3396sn zza;

    @NotNull
    private final String zzb;

    public zzfy(@NotNull InterfaceC3396sn interfaceC3396sn, @NotNull String str, @Nullable Object obj) {
        super(obj);
        this.zza = interfaceC3396sn;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(@NotNull Object obj, @NotNull Method method, @Nullable Object[] objArr) {
        List arrayList;
        if (!AbstractC0500aq.b(method.getName(), this.zzb)) {
            return false;
        }
        zztf zztfVarZzf = zzti.zzf();
        if (objArr != null) {
            arrayList = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                zztg zztgVarZzf = zzth.zzf();
                zztgVarZzf.zzw(obj2.toString());
                arrayList.add((zzth) zztgVarZzf.zzk());
            }
        } else {
            arrayList = C0055Ci.a;
        }
        zztfVarZzf.zze(arrayList);
        zzti zztiVar = (zzti) zztfVarZzf.zzk();
        InterfaceC3396sn interfaceC3396sn = this.zza;
        byte[] bArrZzd = zztiVar.zzd();
        interfaceC3396sn.invoke(objArr, zzkh.zzh().zzi(bArrZzd, 0, bArrZzd.length));
        return true;
    }
}
