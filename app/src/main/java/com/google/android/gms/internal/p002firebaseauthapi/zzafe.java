package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import defpackage.AbstractC3264qG;
import defpackage.AbstractC3600wb;
import defpackage.C0256Of;
import defpackage.C3663xk;
import defpackage.CallableC0239Nf;
import defpackage.InterfaceC3451to;
import defpackage.Vs;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public final class zzafe {
    private Context zza;
    private zzafx zzb;
    private String zzc;
    private final C3663xk zzd;
    private boolean zze;
    private String zzf;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zzafe(C3663xk c3663xk, String str) {
        this(c3663xk.a, c3663xk, str);
        c3663xk.a();
    }

    private static String zza(C3663xk c3663xk) {
        Vs.u(FirebaseAuth.getInstance(c3663xk).p.get());
        return null;
    }

    private static String zzb(C3663xk c3663xk) {
        InterfaceC3451to interfaceC3451to = (InterfaceC3451to) FirebaseAuth.getInstance(c3663xk).q.get();
        if (interfaceC3451to != null) {
            try {
                C0256Of c0256Of = (C0256Of) interfaceC3451to;
                return (String) Tasks.await((Build.VERSION.SDK_INT >= 24 ? AbstractC3600wb.g(c0256Of.b) : true) ^ true ? Tasks.forResult("") : Tasks.call(c0256Of.e, new CallableC0239Nf(c0256Of, 0)));
            } catch (InterruptedException | ExecutionException e) {
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: " + e.getMessage());
            }
        }
        return null;
    }

    public zzafe(Context context, C3663xk c3663xk, String str) {
        this.zze = false;
        this.zza = (Context) Preconditions.checkNotNull(context);
        this.zzd = (C3663xk) Preconditions.checkNotNull(c3663xk);
        this.zzc = AbstractC3264qG.w("Android/Fallback/", str);
    }

    public final void zza(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }

    public final void zza(URLConnection uRLConnection) {
        String str;
        String str2;
        if (this.zze) {
            str = this.zzc;
            str2 = "/FirebaseUI-Android";
        } else {
            str = this.zzc;
            str2 = "/FirebaseCore-Android";
        }
        String strG = AbstractC3264qG.g(str, str2);
        if (this.zzb == null) {
            this.zzb = new zzafx(this.zza);
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.zzb.zzb());
        uRLConnection.setRequestProperty("X-Android-Cert", this.zzb.zza());
        uRLConnection.setRequestProperty("Accept-Language", zzafd.zza());
        uRLConnection.setRequestProperty("X-Client-Version", strG);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.zzf);
        C3663xk c3663xk = this.zzd;
        c3663xk.a();
        uRLConnection.setRequestProperty("X-Firebase-GMPID", c3663xk.c.b);
        uRLConnection.setRequestProperty("X-Firebase-Client", zzb(this.zzd));
        String strZza = zza(this.zzd);
        if (!TextUtils.isEmpty(strZza)) {
            uRLConnection.setRequestProperty("X-Firebase-AppCheck", strZza);
        }
        this.zzf = null;
    }

    public final void zzb(String str) {
        this.zzf = str;
    }
}
