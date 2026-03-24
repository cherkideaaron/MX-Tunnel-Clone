package com.google.android.gms.internal.auth;

import android.net.Uri;
import defpackage.Z3;

/* loaded from: classes.dex */
public final class zzcr {
    private static final Z3 zza = new Z3();

    public static synchronized Uri zza(String str) {
        Z3 z3 = zza;
        Uri uri = (Uri) z3.get("com.google.android.gms.auth_account");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
        z3.put("com.google.android.gms.auth_account", uri2);
        return uri2;
    }
}
