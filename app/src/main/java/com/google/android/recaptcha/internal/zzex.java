package com.google.android.recaptcha.internal;

import defpackage.AbstractC0137Hf;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzex {

    @NotNull
    private final zzfm zza;

    public zzex() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final zzew zza(@NotNull String str) throws ProtocolException, zzbd {
        try {
            HttpURLConnection httpURLConnectionZza = this.zza.zza(str);
            httpURLConnectionZza.setRequestMethod("POST");
            httpURLConnectionZza.setDoOutput(true);
            httpURLConnectionZza.setRequestProperty("Content-Type", "application/x-protobuffer");
            return new zzew(httpURLConnectionZza);
        } catch (zzbd e) {
            throw e;
        } catch (Exception e2) {
            throw new zzbd(zzbb.zzc, zzba.zzai, e2.getMessage());
        }
    }

    public /* synthetic */ zzex(zzfm zzfmVar, int i, AbstractC0137Hf abstractC0137Hf) {
        this.zza = new zzfm();
    }
}
