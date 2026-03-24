package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
final class zzcee extends ScheduledThreadPoolExecutor {
    public zzcee(int i, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}
