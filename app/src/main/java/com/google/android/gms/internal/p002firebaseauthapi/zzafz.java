package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.RecaptchaActivity;
import defpackage.C3663xk;

/* loaded from: classes2.dex */
public final class zzafz {
    private final FirebaseAuth zza;
    private final Activity zzb;

    public zzafz(FirebaseAuth firebaseAuth, Activity activity) {
        this.zza = firebaseAuth;
        this.zzb = activity;
    }

    public final void zza() {
        String str;
        Intent intent = new Intent("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent.setClass(this.zzb, RecaptchaActivity.class);
        intent.setPackage(this.zzb.getPackageName());
        C3663xk c3663xk = this.zza.a;
        c3663xk.a();
        intent.putExtra("com.google.firebase.auth.KEY_API_KEY", c3663xk.c.a);
        FirebaseAuth firebaseAuth = this.zza;
        synchronized (firebaseAuth.h) {
            str = firebaseAuth.i;
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("com.google.firebase.auth.KEY_TENANT_ID", this.zza.b());
        }
        intent.putExtra("com.google.firebase.auth.internal.CLIENT_VERSION", zzafc.zza().zzb());
        C3663xk c3663xk2 = this.zza.a;
        c3663xk2.a();
        intent.putExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME", c3663xk2.b);
        this.zza.getClass();
        intent.putExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN", (String) null);
        this.zzb.startActivity(intent);
    }
}
