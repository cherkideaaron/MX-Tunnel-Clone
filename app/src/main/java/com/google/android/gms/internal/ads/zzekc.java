package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import defpackage.AbstractC3131nu;
import defpackage.As;
import defpackage.C3076mu;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzekc {
    private AbstractC3131nu zza;
    private final Context zzb;

    public zzekc(Context context) {
        this.zzb = context;
    }

    public final As zza() {
        try {
            C3076mu c3076muA = AbstractC3131nu.a(this.zzb);
            this.zza = c3076muA;
            return c3076muA == null ? zzgzo.zzc(new IllegalStateException("MeasurementManagerFutures is null")) : c3076muA.b();
        } catch (Exception e) {
            return zzgzo.zzc(e);
        }
    }

    public final As zzb(Uri uri, InputEvent inputEvent) {
        try {
            AbstractC3131nu abstractC3131nu = this.zza;
            Objects.requireNonNull(abstractC3131nu);
            return abstractC3131nu.c(uri, inputEvent);
        } catch (Exception e) {
            return zzgzo.zzc(e);
        }
    }
}
