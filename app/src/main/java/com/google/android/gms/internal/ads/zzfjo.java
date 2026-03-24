package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;

/* loaded from: classes.dex */
public final class zzfjo {
    private final zzazh zza;

    public zzfjo(zzazh zzazhVar) {
        this.zza = zzazhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5 A[Catch: UnsupportedOperationException -> 0x00f3, TryCatch #0 {UnsupportedOperationException -> 0x00f3, blocks: (B:5:0x0010, B:7:0x001a, B:10:0x0024, B:12:0x002a, B:14:0x0034, B:16:0x0040, B:17:0x005b, B:18:0x005f, B:19:0x0065, B:21:0x006b, B:22:0x0097, B:23:0x009c, B:24:0x009d, B:25:0x00a4, B:26:0x00a5, B:28:0x00ab, B:30:0x00b7, B:32:0x00bf, B:33:0x00de, B:35:0x00eb, B:36:0x00f2), top: B:40:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final android.net.Uri zzb(android.net.Uri r10, java.lang.String r11) throws com.google.android.gms.internal.ads.zzazi {
        /*
            java.lang.String r0 = "ms"
            java.lang.String r1 = ";"
            java.lang.String r2 = "ms="
            java.lang.String r3 = ";dc_ms="
            java.lang.String r4 = "dc_ms="
            r5 = 0
            r6 = -1
            if (r10 != 0) goto L10
            goto La5
        L10:
            java.lang.String r7 = r10.getHost()     // Catch: java.lang.NullPointerException -> La5 java.lang.UnsupportedOperationException -> Lf3
            java.lang.String r8 = r10.getPath()     // Catch: java.lang.NullPointerException -> La5 java.lang.UnsupportedOperationException -> Lf3
            if (r7 == 0) goto La5
            java.lang.String r9 = "ad.doubleclick.net"
            boolean r7 = r7.equals(r9)     // Catch: java.lang.NullPointerException -> La5 java.lang.UnsupportedOperationException -> Lf3
            if (r7 == 0) goto La5
            if (r8 == 0) goto La5
            boolean r7 = r8.contains(r1)     // Catch: java.lang.NullPointerException -> La5 java.lang.UnsupportedOperationException -> Lf3
            if (r7 == 0) goto La5
            java.lang.String r0 = r10.toString()     // Catch: java.lang.UnsupportedOperationException -> Lf3
            boolean r0 = r0.contains(r4)     // Catch: java.lang.UnsupportedOperationException -> Lf3
            if (r0 != 0) goto L9d
            java.lang.String r0 = r10.toString()     // Catch: java.lang.UnsupportedOperationException -> Lf3
            java.lang.String r2 = ";adurl"
            int r2 = r0.indexOf(r2)     // Catch: java.lang.UnsupportedOperationException -> Lf3
            if (r2 == r6) goto L65
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.UnsupportedOperationException -> Lf3
            int r2 = r2 + 1
            java.lang.String r3 = r0.substring(r5, r2)     // Catch: java.lang.UnsupportedOperationException -> Lf3
            r10.<init>(r3)     // Catch: java.lang.UnsupportedOperationException -> Lf3
            r10.append(r4)     // Catch: java.lang.UnsupportedOperationException -> Lf3
            r10.append(r11)     // Catch: java.lang.UnsupportedOperationException -> Lf3
            r10.append(r1)     // Catch: java.lang.UnsupportedOperationException -> Lf3
            int r11 = r0.length()     // Catch: java.lang.UnsupportedOperationException -> Lf3
            r10.append(r0, r2, r11)     // Catch: java.lang.UnsupportedOperationException -> Lf3
        L5b:
            java.lang.String r10 = r10.toString()     // Catch: java.lang.UnsupportedOperationException -> Lf3
        L5f:
            android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch: java.lang.UnsupportedOperationException -> Lf3
            goto Lea
        L65:
            java.lang.String r10 = r10.getEncodedPath()     // Catch: java.lang.UnsupportedOperationException -> Lf3
            if (r10 == 0) goto L97
            int r2 = r0.indexOf(r10)     // Catch: java.lang.UnsupportedOperationException -> Lf3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.UnsupportedOperationException -> Lf3
            int r6 = r10.length()     // Catch: java.lang.UnsupportedOperationException -> Lf3
            int r6 = r6 + r2
            java.lang.String r5 = r0.substring(r5, r6)     // Catch: java.lang.UnsupportedOperationException -> Lf3
            r4.<init>(r5)     // Catch: java.lang.UnsupportedOperationException -> Lf3
            r4.append(r3)     // Catch: java.lang.UnsupportedOperationException -> Lf3
            r4.append(r11)     // Catch: java.lang.UnsupportedOperationException -> Lf3
            r4.append(r1)     // Catch: java.lang.UnsupportedOperationException -> Lf3
            int r10 = r10.length()     // Catch: java.lang.UnsupportedOperationException -> Lf3
            int r2 = r2 + r10
            int r10 = r0.length()     // Catch: java.lang.UnsupportedOperationException -> Lf3
            r4.append(r0, r2, r10)     // Catch: java.lang.UnsupportedOperationException -> Lf3
            java.lang.String r10 = r4.toString()     // Catch: java.lang.UnsupportedOperationException -> Lf3
            goto L5f
        L97:
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException     // Catch: java.lang.UnsupportedOperationException -> Lf3
            r10.<init>()     // Catch: java.lang.UnsupportedOperationException -> Lf3
            throw r10     // Catch: java.lang.UnsupportedOperationException -> Lf3
        L9d:
            com.google.android.gms.internal.ads.zzazi r10 = new com.google.android.gms.internal.ads.zzazi     // Catch: java.lang.UnsupportedOperationException -> Lf3
            java.lang.String r11 = "Parameter already exists: dc_ms"
            r10.<init>(r11)     // Catch: java.lang.UnsupportedOperationException -> Lf3
            throw r10     // Catch: java.lang.UnsupportedOperationException -> Lf3
        La5:
            java.lang.String r1 = r10.getQueryParameter(r0)     // Catch: java.lang.UnsupportedOperationException -> Lf3
            if (r1 != 0) goto Leb
            java.lang.String r1 = r10.toString()     // Catch: java.lang.UnsupportedOperationException -> Lf3
            java.lang.String r3 = "&adurl"
            int r3 = r1.indexOf(r3)     // Catch: java.lang.UnsupportedOperationException -> Lf3
            if (r3 != r6) goto Lbd
            java.lang.String r3 = "?adurl"
            int r3 = r1.indexOf(r3)     // Catch: java.lang.UnsupportedOperationException -> Lf3
        Lbd:
            if (r3 == r6) goto Lde
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.UnsupportedOperationException -> Lf3
            int r3 = r3 + 1
            java.lang.String r0 = r1.substring(r5, r3)     // Catch: java.lang.UnsupportedOperationException -> Lf3
            r10.<init>(r0)     // Catch: java.lang.UnsupportedOperationException -> Lf3
            r10.append(r2)     // Catch: java.lang.UnsupportedOperationException -> Lf3
            r10.append(r11)     // Catch: java.lang.UnsupportedOperationException -> Lf3
            java.lang.String r11 = "&"
            r10.append(r11)     // Catch: java.lang.UnsupportedOperationException -> Lf3
            int r11 = r1.length()     // Catch: java.lang.UnsupportedOperationException -> Lf3
            r10.append(r1, r3, r11)     // Catch: java.lang.UnsupportedOperationException -> Lf3
            goto L5b
        Lde:
            android.net.Uri$Builder r10 = r10.buildUpon()     // Catch: java.lang.UnsupportedOperationException -> Lf3
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r0, r11)     // Catch: java.lang.UnsupportedOperationException -> Lf3
            android.net.Uri r10 = r10.build()     // Catch: java.lang.UnsupportedOperationException -> Lf3
        Lea:
            return r10
        Leb:
            com.google.android.gms.internal.ads.zzazi r10 = new com.google.android.gms.internal.ads.zzazi     // Catch: java.lang.UnsupportedOperationException -> Lf3
            java.lang.String r11 = "Query parameter already exists: ms"
            r10.<init>(r11)     // Catch: java.lang.UnsupportedOperationException -> Lf3
            throw r10     // Catch: java.lang.UnsupportedOperationException -> Lf3
        Lf3:
            com.google.android.gms.internal.ads.zzazi r10 = new com.google.android.gms.internal.ads.zzazi
            java.lang.String r11 = "Provided Uri is not in a valid state"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfjo.zzb(android.net.Uri, java.lang.String):android.net.Uri");
    }

    public final Uri zza(Uri uri, Context context, View view, Activity activity) throws zzazi {
        try {
            return zzb(uri, this.zza.zzb().zzf(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzazi("Provided Uri is not in a valid state");
        }
    }
}
