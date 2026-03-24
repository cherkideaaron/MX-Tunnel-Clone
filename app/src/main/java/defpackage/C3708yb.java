package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.util.Log;

/* renamed from: yb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3708yb extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C3708yb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.a) {
            case 0:
                Log.i("service.ConnectivityReceiver", "onAvailable");
                ((C2811i1) this.b).j();
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.a) {
            case 1:
                C3130nt.d().a(C3298qw.j, "Network capabilities changed: " + networkCapabilities, new Throwable[0]);
                C3298qw c3298qw = (C3298qw) this.b;
                c3298qw.c(c3298qw.f());
                break;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLosing(Network network, int i) {
        switch (this.a) {
            case 0:
                Log.i("service.ConnectivityReceiver", "onLosing");
                ((C2811i1) this.b).getClass();
                break;
            default:
                super.onLosing(network, i);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.a) {
            case 0:
                Log.i("service.ConnectivityReceiver", "onLost");
                ((C2811i1) this.b).j();
                break;
            default:
                C3130nt.d().a(C3298qw.j, "Network connection lost", new Throwable[0]);
                C3298qw c3298qw = (C3298qw) this.b;
                c3298qw.c(c3298qw.f());
                break;
        }
    }
}
