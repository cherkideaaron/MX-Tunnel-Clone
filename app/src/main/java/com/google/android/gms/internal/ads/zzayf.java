package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
final class zzayf implements Runnable {
    private zzayf() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zzayg.zzd = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
        } catch (Throwable th) {
            zzayg.zzb.countDown();
            throw th;
        }
        zzayg.zzb.countDown();
    }

    public /* synthetic */ zzayf(byte[] bArr) {
    }
}
