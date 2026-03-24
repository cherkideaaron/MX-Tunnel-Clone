package com.google.android.gms.ads.internal.client;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes.dex */
public final class zzey extends ContentProvider {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachInfo(android.content.Context r5, android.content.pm.ProviderInfo r6) {
        /*
            r4 = this;
            r0 = 0
            com.google.android.gms.common.wrappers.PackageManagerWrapper r1 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L12 java.lang.NullPointerException -> L14
            java.lang.String r2 = r5.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L12 java.lang.NullPointerException -> L14
            r3 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L12 java.lang.NullPointerException -> L14
            android.os.Bundle r0 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L12 java.lang.NullPointerException -> L14
            goto L1f
        L12:
            r1 = move-exception
            goto L16
        L14:
            r1 = move-exception
            goto L1c
        L16:
            java.lang.String r2 = "Failed to load metadata: Package name not found."
        L18:
            com.google.android.gms.ads.internal.util.client.zzo.zzg(r2, r1)
            goto L1f
        L1c:
            java.lang.String r2 = "Failed to load metadata: Null pointer exception."
            goto L18
        L1f:
            if (r0 != 0) goto L27
            java.lang.String r1 = "Metadata was null."
            com.google.android.gms.ads.internal.util.client.zzo.zzf(r1)
            goto L60
        L27:
            java.lang.String r1 = "com.google.android.gms.ads.APPLICATION_ID"
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.ClassCastException -> L93
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.ClassCastException -> L93
            java.lang.String r2 = "com.google.android.gms.ads.INTEGRATION_MANAGER"
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.ClassCastException -> L8a
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.ClassCastException -> L8a
            if (r1 == 0) goto L53
            java.lang.String r2 = "^ca-app-pub-[0-9]{16}~[0-9]{10}$"
            boolean r2 = r1.matches(r2)
            if (r2 == 0) goto L4b
            java.lang.String r2 = "Publisher provided Google AdMob App ID in manifest: "
        L43:
            java.lang.String r1 = r2.concat(r1)
            com.google.android.gms.ads.internal.util.client.zzo.zzd(r1)
            goto L60
        L4b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "\n\n******************************************************************************\n* Invalid application ID. Follow instructions here:                          *\n* https://goo.gle/admob-android-update-manifest                              *\n* to find your app ID.                                                       *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://goo.gle/ad-manager-android-update-manifest.                        *\n******************************************************************************\n\n"
            r5.<init>(r6)
            throw r5
        L53:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L82
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r2 = "The Google Mobile Ads SDK is integrated by "
            goto L43
        L60:
            if (r0 != 0) goto L63
            goto L7e
        L63:
            java.lang.String r1 = "com.google.android.gms.ads.flag.OPTIMIZE_INITIALIZATION"
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            java.lang.String r3 = "com.google.android.gms.ads.flag.OPTIMIZE_AD_LOADING"
            boolean r0 = r0.getBoolean(r3, r2)
            if (r1 == 0) goto L77
            java.lang.String r1 = "com.google.android.gms.ads.flag.OPTIMIZE_INITIALIZATION is enabled"
            com.google.android.gms.ads.internal.util.client.zzo.zzd(r1)
        L77:
            if (r0 == 0) goto L7e
            java.lang.String r0 = "com.google.android.gms.ads.flag.OPTIMIZE_AD_LOADING is enabled"
            com.google.android.gms.ads.internal.util.client.zzo.zzd(r0)
        L7e:
            super.attachInfo(r5, r6)
            return
        L82:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "\n\n******************************************************************************\n* Missing application ID. AdMob publishers should follow the instructions    *\n* here:                                                                      *\n* https://goo.gle/admob-android-update-manifest.                             *\n* to add a valid App ID inside the AndroidManifest.                          *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://goo.gle/ad-manager-android-update-manifest.                        *\n******************************************************************************\n\n"
            r5.<init>(r6)
            throw r5
        L8a:
            r5 = move-exception
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "The com.google.android.gms.ads.INTEGRATION_MANAGER metadata must have a String value."
            r6.<init>(r0, r5)
            throw r6
        L93:
            r5 = move-exception
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "The com.google.android.gms.ads.APPLICATION_ID metadata must have a String value."
            r6.<init>(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzey.attachInfo(android.content.Context, android.content.pm.ProviderInfo):void");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
