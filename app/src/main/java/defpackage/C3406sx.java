package defpackage;

import android.app.Activity;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;

/* renamed from: sx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3406sx extends FullScreenContentCallback {
    public final /* synthetic */ InterfaceC3514ux a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ C3460tx c;

    public C3406sx(C3460tx c3460tx, InterfaceC3514ux interfaceC3514ux, Activity activity) {
        this.c = c3460tx;
        this.a = interfaceC3514ux;
        this.b = activity;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        C3460tx c3460tx = this.c;
        c3460tx.a = null;
        c3460tx.c = false;
        this.a.h();
        long j = c3460tx.d.c.getLong(Deobfuscator$MHRTUNNELVPN$app.getString(-17080437142458L), 0L);
        Activity activity = this.b;
        if (j != 0 && (j == 0 || System.currentTimeMillis() < j + 14400000)) {
            return;
        }
        c3460tx.a(activity);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        C3460tx c3460tx = this.c;
        c3460tx.a = null;
        c3460tx.c = false;
        this.a.h();
        long j = c3460tx.d.c.getLong(Deobfuscator$MHRTUNNELVPN$app.getString(-17131976750010L), 0L);
        Activity activity = this.b;
        if (j != 0 && (j == 0 || System.currentTimeMillis() < j + 14400000)) {
            return;
        }
        c3460tx.a(activity);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
    }
}
