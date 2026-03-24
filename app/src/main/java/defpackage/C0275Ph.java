package defpackage;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* renamed from: Ph, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0275Ph implements AudienceNetworkAds.InitResult {
    public final /* synthetic */ Throwable a;

    public C0275Ph(Throwable th) {
        this.a = th;
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitResult
    public final String getMessage() {
        return DynamicLoaderFactory.createErrorMessage(this.a);
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitResult
    public final boolean isSuccess() {
        return false;
    }
}
