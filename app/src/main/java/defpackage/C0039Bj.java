package defpackage;

import com.facebook.ads.AudienceNetworkAds;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: Bj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0039Bj implements AudienceNetworkAds.InitListener {
    public static C0039Bj d;
    public boolean a = false;
    public boolean b = false;
    public final ArrayList c = new ArrayList();

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public final void onInitialized(AudienceNetworkAds.InitResult initResult) {
        this.a = false;
        this.b = initResult.isSuccess();
        ArrayList arrayList = this.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0056Cj c0056Cj = (C0056Cj) it.next();
            if (initResult.isSuccess()) {
                c0056Cj.a.onInitializationSucceeded();
            } else {
                c0056Cj.a.onInitializationFailed(new AdError(FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION, initResult.getMessage(), FacebookMediationAdapter.ERROR_DOMAIN).getMessage());
            }
        }
        arrayList.clear();
    }
}
