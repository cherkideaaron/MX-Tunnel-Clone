package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class RK implements Runnable {
    public final /* synthetic */ UK a;
    public final /* synthetic */ J6 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ RK(UK uk, J6 j6, int i, Runnable runnable) {
        this.a = uk;
        this.b = j6;
        this.c = i;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final J6 j6 = this.b;
        final int i = this.c;
        Runnable runnable = this.d;
        final UK uk = this.a;
        InterfaceC0529bI interfaceC0529bI = uk.f;
        try {
            try {
                InterfaceC2682fj interfaceC2682fj = uk.c;
                Objects.requireNonNull(interfaceC2682fj);
                ((C2768hD) interfaceC0529bI).g(new C0285Qa(interfaceC2682fj, 14));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) uk.a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((C2768hD) interfaceC0529bI).g(new InterfaceC0474aI() { // from class: SK
                        @Override // defpackage.InterfaceC0474aI
                        public final Object e() {
                            uk.d.a(j6, i + 1, false);
                            return null;
                        }
                    });
                } else {
                    uk.a(j6, i);
                }
            } catch (ZH unused) {
                uk.d.a(j6, i + 1, false);
            }
            runnable.run();
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
