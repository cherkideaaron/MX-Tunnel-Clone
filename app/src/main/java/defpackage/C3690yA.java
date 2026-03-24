package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import rased.vpn.app.service.vpn.logger.SkStatus;

/* renamed from: yA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3690yA extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ int a;

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        switch (this.a) {
            case 0:
                SkStatus.logDebug("Available network");
                break;
            case 1:
                SkStatus.logDebug("Available network");
                break;
            default:
                SkStatus.logDebug("Available network");
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.a) {
            case 0:
                SkStatus.logDebug("Network lost");
                break;
            case 1:
                SkStatus.logDebug("Network lost");
                break;
            default:
                SkStatus.logDebug("Network lost");
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        switch (this.a) {
            case 0:
                SkStatus.logDebug("Network unavailable");
                break;
            case 1:
                SkStatus.logDebug("Network unavailable");
                break;
            default:
                SkStatus.logDebug("Network unavailable");
                break;
        }
    }
}
