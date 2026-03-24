package com.google.android.recaptcha.internal;

import defpackage.AbstractC3383sa;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzfz {

    @NotNull
    private final zzjj zza;

    public zzfz() {
        this(1);
    }

    @NotNull
    public final List zwk() {
        return zza();
    }

    @NotNull
    public final List zza() {
        return AbstractC3383sa.j0(this.zza);
    }

    public final boolean zzb(@NotNull List list) {
        this.zza.add(list);
        return true;
    }

    public zzfz(int i) {
        this.zza = zzjj.zza(i);
    }
}
