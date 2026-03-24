package com.google.android.gms.internal.measurement;

import android.net.Uri;
import defpackage.Z3;

/* loaded from: classes2.dex */
public final class zzkb {
    public static final /* synthetic */ int zza = 0;
    private static final Z3 zzb = new Z3();

    public static synchronized Uri zza(String str) {
        Z3 z3 = zzb;
        Uri uri = (Uri) z3.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        z3.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
