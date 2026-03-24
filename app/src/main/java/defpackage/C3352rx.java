package defpackage;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;
import java.util.Date;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;

/* renamed from: rx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3352rx extends AppOpenAd.AppOpenAdLoadCallback {
    public final /* synthetic */ C3460tx a;

    public C3352rx(C3460tx c3460tx) {
        this.a = c3460tx;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.a.b = false;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(AppOpenAd appOpenAd) {
        C3460tx c3460tx = this.a;
        c3460tx.a = appOpenAd;
        c3460tx.b = false;
        new Date().getTime();
        XD xd = (XD) c3460tx.d.c.edit();
        xd.putLong(Deobfuscator$MHRTUNNELVPN$app.getString(-17028897534906L), System.currentTimeMillis());
        xd.apply();
    }
}
