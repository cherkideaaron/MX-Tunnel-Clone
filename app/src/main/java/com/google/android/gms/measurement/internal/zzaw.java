package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* loaded from: classes2.dex */
public final class zzaw {
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e A[Catch: SQLiteException -> 0x00b3, TryCatch #3 {SQLiteException -> 0x00b3, blocks: (B:21:0x0040, B:23:0x0070, B:25:0x007e, B:27:0x0086, B:28:0x0089, B:29:0x00b2, B:33:0x00b7, B:35:0x00ba, B:37:0x00c2, B:38:0x00c9, B:39:0x00cc, B:41:0x00d2, B:44:0x00e3, B:45:0x00e6, B:22:0x0069), top: B:58:0x0040, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7 A[Catch: SQLiteException -> 0x00b3, LOOP:1: B:33:0x00b7->B:38:0x00c9, LOOP_START, PHI: r2
      0x00b7: PHI (r2v6 int) = (r2v5 int), (r2v7 int) binds: [B:32:0x00b5, B:38:0x00c9] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {SQLiteException -> 0x00b3, blocks: (B:21:0x0040, B:23:0x0070, B:25:0x007e, B:27:0x0086, B:28:0x0089, B:29:0x00b2, B:33:0x00b7, B:35:0x00ba, B:37:0x00c2, B:38:0x00c9, B:39:0x00cc, B:41:0x00d2, B:44:0x00e3, B:45:0x00e6, B:22:0x0069), top: B:58:0x0040, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2 A[Catch: SQLiteException -> 0x00b3, TryCatch #3 {SQLiteException -> 0x00b3, blocks: (B:21:0x0040, B:23:0x0070, B:25:0x007e, B:27:0x0086, B:28:0x0089, B:29:0x00b2, B:33:0x00b7, B:35:0x00ba, B:37:0x00c2, B:38:0x00c9, B:39:0x00cc, B:41:0x00d2, B:44:0x00e3, B:45:0x00e6, B:22:0x0069), top: B:58:0x0040, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void zza(com.google.android.gms.measurement.internal.zzgu r9, android.database.sqlite.SQLiteDatabase r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String[] r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaw.zza(com.google.android.gms.measurement.internal.zzgu, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    public static void zzb(zzgu zzguVar, SQLiteDatabase sQLiteDatabase) {
        if (zzguVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        com.google.android.gms.internal.measurement.zzbv.zza();
        String path = sQLiteDatabase.getPath();
        int i = com.google.android.gms.internal.measurement.zzca.zzb;
        File file = new File(path);
        if (!file.setReadable(false, false)) {
            zzguVar.zze().zza("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            zzguVar.zze().zza("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            zzguVar.zze().zza("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        zzguVar.zze().zza("Failed to turn on database write permission for owner");
    }
}
