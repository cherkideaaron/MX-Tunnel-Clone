package com.google.android.recaptcha.internal;

import defpackage.AbstractC0500aq;
import defpackage.C0055Ci;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class zzga extends zzfx {

    @NotNull
    private final zzfz zza;

    @NotNull
    private final String zzb;

    public zzga(@NotNull zzfz zzfzVar, @NotNull String str, @Nullable Object obj) {
        super(obj);
        this.zza = zzfzVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(@NotNull Object obj, @NotNull Method method, @Nullable Object[] objArr) {
        List listAsList;
        if (!AbstractC0500aq.b(method.getName(), this.zzb)) {
            return false;
        }
        zzfz zzfzVar = this.zza;
        if (objArr != null) {
            listAsList = Arrays.asList(objArr);
            AbstractC0500aq.l(listAsList, "asList(...)");
        } else {
            listAsList = C0055Ci.a;
        }
        zzfzVar.zzb(listAsList);
        return true;
    }
}
