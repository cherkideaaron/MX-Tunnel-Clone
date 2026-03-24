package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzcfz implements Runnable {
    public zzcfz(zzcgb zzcgbVar) {
        Objects.requireNonNull(zzcgbVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
