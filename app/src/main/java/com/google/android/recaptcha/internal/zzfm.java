package com.google.android.recaptcha.internal;

import defpackage.AbstractC0069Df;
import defpackage.AbstractC0500aq;
import defpackage.InterfaceC3508ur;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzfm {

    @NotNull
    private final InterfaceC3508ur zza;

    public zzfm() {
        int i = zzav.zza;
        this.zza = AbstractC0069Df.G(zzfl.zza);
    }

    @NotNull
    public final HttpURLConnection zza(@NotNull String str) throws IOException, zzbd {
        if (!((zzfk) this.zza.getValue()).zzb(str)) {
            throw new zzbd(zzbb.zzc, zzba.zzQ, null);
        }
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        AbstractC0500aq.k(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) uRLConnectionOpenConnection;
    }
}
