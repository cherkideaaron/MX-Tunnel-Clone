package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Build;

/* renamed from: qw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3298qw extends AbstractC0595cc {
    public static final String j = C3130nt.f("NetworkStateTracker");
    public final ConnectivityManager g;
    public final C3708yb h;
    public final B2 i;

    public C3298qw(Context context, InterfaceC3482uI interfaceC3482uI) {
        super(context, interfaceC3482uI);
        this.g = (ConnectivityManager) this.b.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 24) {
            this.h = new C3708yb(this, 1);
        } else {
            this.i = new B2(this, 2);
        }
    }

    @Override // defpackage.AbstractC0595cc
    public final Object a() {
        return f();
    }

    @Override // defpackage.AbstractC0595cc
    public final void d() {
        boolean z = Build.VERSION.SDK_INT >= 24;
        String str = j;
        if (!z) {
            C3130nt.d().a(str, "Registering broadcast receiver", new Throwable[0]);
            this.b.registerReceiver(this.i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            C3130nt.d().a(str, "Registering network callback", new Throwable[0]);
            this.g.registerDefaultNetworkCallback(this.h);
        } catch (IllegalArgumentException | SecurityException e) {
            C3130nt.d().b(str, "Received exception while registering network callback", e);
        }
    }

    @Override // defpackage.AbstractC0595cc
    public final void e() {
        boolean z = Build.VERSION.SDK_INT >= 24;
        String str = j;
        if (!z) {
            C3130nt.d().a(str, "Unregistering broadcast receiver", new Throwable[0]);
            this.b.unregisterReceiver(this.i);
            return;
        }
        try {
            C3130nt.d().a(str, "Unregistering network callback", new Throwable[0]);
            this.g.unregisterNetworkCallback(this.h);
        } catch (IllegalArgumentException | SecurityException e) {
            C3130nt.d().b(str, "Received exception while unregistering network callback", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C3243pw f() {
        /*
            r9 = this;
            android.net.ConnectivityManager r0 = r9.g
            android.net.NetworkInfo r1 = r0.getActiveNetworkInfo()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            boolean r4 = r1.isConnected()
            if (r4 == 0) goto L12
            r4 = r3
            goto L13
        L12:
            r4 = r2
        L13:
            android.net.Network r5 = r0.getActiveNetwork()     // Catch: java.lang.SecurityException -> L27
            android.net.NetworkCapabilities r5 = r0.getNetworkCapabilities(r5)     // Catch: java.lang.SecurityException -> L27
            if (r5 == 0) goto L37
            r6 = 16
            boolean r5 = r5.hasCapability(r6)     // Catch: java.lang.SecurityException -> L27
            if (r5 == 0) goto L37
            r5 = r3
            goto L38
        L27:
            r5 = move-exception
            nt r6 = defpackage.C3130nt.d()
            java.lang.Throwable[] r7 = new java.lang.Throwable[r3]
            r7[r2] = r5
            java.lang.String r5 = defpackage.C3298qw.j
            java.lang.String r8 = "Unable to validate active network"
            r6.b(r5, r8, r7)
        L37:
            r5 = r2
        L38:
            boolean r0 = r0.isActiveNetworkMetered()
            if (r1 == 0) goto L45
            boolean r1 = r1.isRoaming()
            if (r1 != 0) goto L45
            r2 = r3
        L45:
            pw r1 = new pw
            r1.<init>()
            r1.a = r4
            r1.b = r5
            r1.c = r0
            r1.d = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3298qw.f():pw");
    }
}
