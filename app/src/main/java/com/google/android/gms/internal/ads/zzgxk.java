package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
final class zzgxk {
    public static final FileOutputStream zza(File file, zzgup zzgupVar, zzgxb zzgxbVar) {
        return new FileOutputStream(file, zzgupVar.contains(zzgxj.APPEND));
    }
}
