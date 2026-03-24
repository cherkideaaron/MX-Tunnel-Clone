package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzchu extends zzchr {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzchu(zzcge zzcgeVar) {
        super(zzcgeVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(zzfxl.zza().zza(cacheDir, "admobVideoStreams"));
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            String strValueOf = String.valueOf(this.zzg.getAbsolutePath());
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create preload cache directory at ".concat(strValueOf));
            this.zzg = null;
            return;
        }
        if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
            return;
        }
        String strValueOf2 = String.valueOf(this.zzg.getAbsolutePath());
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not set cache file permissions at ".concat(strValueOf2));
        this.zzg = null;
    }

    private final File zza(File file) {
        return new File(zzfxl.zza().zza(this.zzg, String.valueOf(file.getName()).concat(".done")));
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0404, code lost:
    
        r33 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0406, code lost:
    
        r14.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x040e, code lost:
    
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(3) == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0410, code lost:
    
        r0 = r15.format(r1);
        r3 = new java.lang.StringBuilder((java.lang.String.valueOf(r0).length() + 22) + java.lang.String.valueOf(r36).length());
        r3.append("Preloaded ");
        r3.append(r0);
        r3.append(" bytes from ");
        r3.append(r36);
        com.google.android.gms.ads.internal.util.client.zzo.zzd(r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0442, code lost:
    
        r10.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x044b, code lost:
    
        if (r0.isFile() == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x044d, code lost:
    
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0459, code lost:
    
        r0.createNewFile();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04d6  */
    /* JADX WARN: Type inference failed for: r15v16, types: [java.text.DecimalFormat, java.text.NumberFormat] */
    @Override // com.google.android.gms.internal.ads.zzchr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zze(final java.lang.String r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzchu.zze(java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzl() {
        this.zzh = true;
    }
}
