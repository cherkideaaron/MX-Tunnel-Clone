package defpackage;

import android.content.Context;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener;

/* renamed from: Nh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0241Nh implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ MultithreadedBundleWrapper c;
    public final /* synthetic */ AudienceNetworkAds.InitListener d;

    public RunnableC0241Nh(Context context, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, boolean z) {
        this.a = context;
        this.b = z;
        this.c = multithreadedBundleWrapper;
        this.d = initListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th;
        DynamicLoader dynamicLoader;
        int i;
        ANActivityLifecycleCallbacksListener.registerActivityCallbacks(this.a);
        synchronized (DynamicLoaderFactory.class) {
            DynamicLoader dynamicLoaderDoMakeLoader = null;
            th = null;
            int i2 = 0;
            while (i2 < 3) {
                try {
                    dynamicLoaderDoMakeLoader = DynamicLoaderFactory.doMakeLoader(this.a, false);
                    break;
                } finally {
                    if (i2 == i) {
                        try {
                        } catch (Throwable th2) {
                        }
                    }
                }
            }
            dynamicLoader = dynamicLoaderDoMakeLoader;
        }
        DynamicLoaderFactory.doCallInitialize(this.a, dynamicLoader, th, this.b, this.c, this.d);
        DynamicLoaderFactory.sInitializing.set(false);
    }
}
