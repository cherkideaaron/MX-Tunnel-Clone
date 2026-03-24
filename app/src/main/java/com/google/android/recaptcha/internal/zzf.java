package com.google.android.recaptcha.internal;

import defpackage.C0530bJ;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzf {
    @NotNull
    public static final zzbd zza(@NotNull Exception exc, @NotNull zzbd zzbdVar) {
        return exc instanceof C0530bJ ? new zzbd(zzbb.zzb, zzba.zzb, exc.getMessage()) : exc instanceof zzbd ? (zzbd) exc : zzbdVar;
    }
}
