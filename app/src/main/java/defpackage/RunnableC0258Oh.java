package defpackage;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* renamed from: Oh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0258Oh implements Runnable {
    public final /* synthetic */ AudienceNetworkAds.InitListener a;
    public final /* synthetic */ Throwable b;

    public RunnableC0258Oh(AudienceNetworkAds.InitListener initListener, Throwable th) {
        this.a = initListener;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onInitialized(DynamicLoaderFactory.createErrorInitResult(this.b));
    }
}
