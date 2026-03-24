package com.google.android.recaptcha.internal;

import defpackage.AbstractC0069Df;
import defpackage.AbstractC0500aq;
import defpackage.InterfaceC3508ur;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzfa implements zzey {

    @NotNull
    private final InterfaceC3508ur zza;

    public zzfa() {
        int i = zzav.zza;
        this.zza = AbstractC0069Df.G(zzez.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzey
    @NotNull
    public final zzsc zza(@NotNull String str, @NotNull zzto zztoVar) throws zzbd {
        zzew zzewVarZza = null;
        try {
            try {
                try {
                    zzewVarZza = ((zzex) this.zza.getValue()).zza(str);
                    zzewVarZza.zzc();
                    zzewVarZza.zze(zztoVar.zzd());
                    zzsc zzscVar = (zzsc) zzewVarZza.zza(zzsc.zzi());
                    zzewVarZza.zzd();
                    return zzscVar;
                } catch (Exception e) {
                    throw new zzbd(zzbb.zzc, zzba.zzF, e.getMessage());
                }
            } catch (zzbd e2) {
                if (zzewVarZza == null || !AbstractC0500aq.b(e2.zza(), zzba.zzau)) {
                    throw e2;
                }
                try {
                    throw zzbc.zza(zztu.zzg(zzewVarZza.zzb().getErrorStream()).zzi());
                } catch (Exception e3) {
                    throw new zzbd(zzbb.zzc, zzba.zzG, e3.getMessage());
                }
            }
        } catch (Throwable th) {
            if (zzewVarZza != null) {
                zzewVarZza.zzd();
            }
            throw th;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzey
    @NotNull
    public final String zzb(@NotNull String str) throws IOException, zzbd {
        try {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                AbstractC0500aq.k(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestProperty("Accept", "application/x-protobuffer");
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() != 200) {
                    throw new zzbd(zzbb.zzc, new zzba(httpURLConnection.getResponseCode()), null);
                }
                try {
                    InputStreamReader inputStreamReader = AbstractC0500aq.b("gzip", httpURLConnection.getContentEncoding()) ? new InputStreamReader(new GZIPInputStream(httpURLConnection.getInputStream())) : new InputStreamReader(httpURLConnection.getInputStream());
                    StringWriter stringWriter = new StringWriter();
                    char[] cArr = new char[8192];
                    while (true) {
                        int i = inputStreamReader.read(cArr);
                        if (i < 0) {
                            String string = stringWriter.toString();
                            AbstractC0500aq.l(string, "toString(...)");
                            return string;
                        }
                        stringWriter.write(cArr, 0, i);
                    }
                } catch (Exception unused) {
                    throw new zzbd(zzbb.zzc, zzba.zzP, null);
                }
            } catch (Exception unused2) {
                throw new zzbd(zzbb.zzc, zzba.zzO, null);
            }
        } catch (Exception unused3) {
            throw new zzbd(zzbb.zzb, zzba.zzN, null);
        }
    }
}
