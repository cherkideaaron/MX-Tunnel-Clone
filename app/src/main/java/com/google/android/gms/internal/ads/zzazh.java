package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class zzazh {
    private static final String[] zzc = {"/aclk", "/pcs/click", "/dbm/clk"};
    private final String zza = "ad.doubleclick.net";
    private final String[] zzb = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private final zzazc zzd;

    @Deprecated
    public zzazh(zzazc zzazcVar) {
        this.zzd = zzazcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0098 A[Catch: UnsupportedOperationException -> 0x00e5, TryCatch #0 {UnsupportedOperationException -> 0x00e5, blocks: (B:3:0x000f, B:5:0x001b, B:7:0x0025, B:9:0x002f, B:11:0x003b, B:12:0x0056, B:13:0x005a, B:14:0x0060, B:15:0x0090, B:16:0x0097, B:17:0x0098, B:19:0x009e, B:21:0x00aa, B:23:0x00b2, B:24:0x00d0, B:26:0x00dd, B:27:0x00e4), top: B:31:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.net.Uri zzf(android.net.Uri r10, java.lang.String r11) throws com.google.android.gms.internal.ads.zzazi {
        /*
            r9 = this;
            java.lang.String r0 = "ms"
            java.lang.String r1 = ";"
            java.lang.String r2 = "ms="
            java.lang.String r3 = ";dc_ms="
            java.lang.String r4 = "dc_ms="
            r10.getClass()
            r5 = 0
            r6 = -1
            java.lang.String r7 = r10.getHost()     // Catch: java.lang.NullPointerException -> L98 java.lang.UnsupportedOperationException -> Le5
            java.lang.String r8 = r9.zza     // Catch: java.lang.NullPointerException -> L98 java.lang.UnsupportedOperationException -> Le5
            boolean r7 = r7.equals(r8)     // Catch: java.lang.NullPointerException -> L98 java.lang.UnsupportedOperationException -> Le5
            if (r7 == 0) goto L98
            java.lang.String r7 = r10.getPath()     // Catch: java.lang.NullPointerException -> L98 java.lang.UnsupportedOperationException -> Le5
            boolean r7 = r7.contains(r1)     // Catch: java.lang.NullPointerException -> L98 java.lang.UnsupportedOperationException -> Le5
            if (r7 == 0) goto L98
            java.lang.String r0 = r10.toString()     // Catch: java.lang.UnsupportedOperationException -> Le5
            boolean r0 = r0.contains(r4)     // Catch: java.lang.UnsupportedOperationException -> Le5
            if (r0 != 0) goto L90
            java.lang.String r0 = r10.toString()     // Catch: java.lang.UnsupportedOperationException -> Le5
            java.lang.String r2 = ";adurl"
            int r2 = r0.indexOf(r2)     // Catch: java.lang.UnsupportedOperationException -> Le5
            if (r2 == r6) goto L60
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.UnsupportedOperationException -> Le5
            int r2 = r2 + 1
            java.lang.String r3 = r0.substring(r5, r2)     // Catch: java.lang.UnsupportedOperationException -> Le5
            r10.<init>(r3)     // Catch: java.lang.UnsupportedOperationException -> Le5
            r10.append(r4)     // Catch: java.lang.UnsupportedOperationException -> Le5
            r10.append(r11)     // Catch: java.lang.UnsupportedOperationException -> Le5
            r10.append(r1)     // Catch: java.lang.UnsupportedOperationException -> Le5
            java.lang.String r11 = r0.substring(r2)     // Catch: java.lang.UnsupportedOperationException -> Le5
            r10.append(r11)     // Catch: java.lang.UnsupportedOperationException -> Le5
        L56:
            java.lang.String r10 = r10.toString()     // Catch: java.lang.UnsupportedOperationException -> Le5
        L5a:
            android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch: java.lang.UnsupportedOperationException -> Le5
            goto Ldc
        L60:
            java.lang.String r10 = r10.getEncodedPath()     // Catch: java.lang.UnsupportedOperationException -> Le5
            int r2 = r0.indexOf(r10)     // Catch: java.lang.UnsupportedOperationException -> Le5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.UnsupportedOperationException -> Le5
            int r6 = r10.length()     // Catch: java.lang.UnsupportedOperationException -> Le5
            int r6 = r6 + r2
            java.lang.String r5 = r0.substring(r5, r6)     // Catch: java.lang.UnsupportedOperationException -> Le5
            r4.<init>(r5)     // Catch: java.lang.UnsupportedOperationException -> Le5
            r4.append(r3)     // Catch: java.lang.UnsupportedOperationException -> Le5
            r4.append(r11)     // Catch: java.lang.UnsupportedOperationException -> Le5
            r4.append(r1)     // Catch: java.lang.UnsupportedOperationException -> Le5
            int r10 = r10.length()     // Catch: java.lang.UnsupportedOperationException -> Le5
            int r2 = r2 + r10
            java.lang.String r10 = r0.substring(r2)     // Catch: java.lang.UnsupportedOperationException -> Le5
            r4.append(r10)     // Catch: java.lang.UnsupportedOperationException -> Le5
            java.lang.String r10 = r4.toString()     // Catch: java.lang.UnsupportedOperationException -> Le5
            goto L5a
        L90:
            com.google.android.gms.internal.ads.zzazi r10 = new com.google.android.gms.internal.ads.zzazi     // Catch: java.lang.UnsupportedOperationException -> Le5
            java.lang.String r11 = "Parameter already exists: dc_ms"
            r10.<init>(r11)     // Catch: java.lang.UnsupportedOperationException -> Le5
            throw r10     // Catch: java.lang.UnsupportedOperationException -> Le5
        L98:
            java.lang.String r1 = r10.getQueryParameter(r0)     // Catch: java.lang.UnsupportedOperationException -> Le5
            if (r1 != 0) goto Ldd
            java.lang.String r1 = r10.toString()     // Catch: java.lang.UnsupportedOperationException -> Le5
            java.lang.String r3 = "&adurl"
            int r3 = r1.indexOf(r3)     // Catch: java.lang.UnsupportedOperationException -> Le5
            if (r3 != r6) goto Lb0
            java.lang.String r3 = "?adurl"
            int r3 = r1.indexOf(r3)     // Catch: java.lang.UnsupportedOperationException -> Le5
        Lb0:
            if (r3 == r6) goto Ld0
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.UnsupportedOperationException -> Le5
            int r3 = r3 + 1
            java.lang.String r0 = r1.substring(r5, r3)     // Catch: java.lang.UnsupportedOperationException -> Le5
            r10.<init>(r0)     // Catch: java.lang.UnsupportedOperationException -> Le5
            r10.append(r2)     // Catch: java.lang.UnsupportedOperationException -> Le5
            r10.append(r11)     // Catch: java.lang.UnsupportedOperationException -> Le5
            java.lang.String r11 = "&"
            r10.append(r11)     // Catch: java.lang.UnsupportedOperationException -> Le5
            java.lang.String r11 = r1.substring(r3)     // Catch: java.lang.UnsupportedOperationException -> Le5
            r10.append(r11)     // Catch: java.lang.UnsupportedOperationException -> Le5
            goto L56
        Ld0:
            android.net.Uri$Builder r10 = r10.buildUpon()     // Catch: java.lang.UnsupportedOperationException -> Le5
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r0, r11)     // Catch: java.lang.UnsupportedOperationException -> Le5
            android.net.Uri r10 = r10.build()     // Catch: java.lang.UnsupportedOperationException -> Le5
        Ldc:
            return r10
        Ldd:
            com.google.android.gms.internal.ads.zzazi r10 = new com.google.android.gms.internal.ads.zzazi     // Catch: java.lang.UnsupportedOperationException -> Le5
            java.lang.String r11 = "Query parameter already exists: ms"
            r10.<init>(r11)     // Catch: java.lang.UnsupportedOperationException -> Le5
            throw r10     // Catch: java.lang.UnsupportedOperationException -> Le5
        Le5:
            com.google.android.gms.internal.ads.zzazi r10 = new com.google.android.gms.internal.ads.zzazi
            java.lang.String r11 = "Provided Uri is not in a valid state"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzazh.zzf(android.net.Uri, java.lang.String):android.net.Uri");
    }

    public final boolean zza(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            String[] strArr = this.zzb;
            for (int i = 0; i < 3; i++) {
                if (host.endsWith(strArr[i])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    @Deprecated
    public final zzazc zzb() {
        return this.zzd;
    }

    @Deprecated
    public final void zzc(MotionEvent motionEvent) {
        this.zzd.zzd(motionEvent);
    }

    @Deprecated
    public final Uri zzd(Uri uri, Context context, View view, Activity activity) throws zzazi {
        try {
            return zzf(uri, this.zzd.zzf(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzazi("Provided Uri is not in a valid state");
        }
    }

    public final boolean zze(Uri uri) {
        if (zza(uri)) {
            String[] strArr = zzc;
            for (int i = 0; i < 3; i++) {
                if (uri.getPath().endsWith(strArr[i])) {
                    return true;
                }
            }
        }
        return false;
    }
}
