package rased.vpn.app.tethering;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import defpackage.C3474uA;
import java.io.IOException;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

/* loaded from: classes2.dex */
public class ProxyService extends Service {
    public static volatile ProxyService m;
    public static final String n = ProxyService.class.getName().concat("::stopservicebroadcast");
    public static boolean o;
    public final String a = "vpntether_channel_id";
    public final String b = "vpntether_channel_name";
    public final C3474uA c = new C3474uA();
    public int d = 8964;
    public Selector e;
    public ServerSocketChannel f;

    public ProxyService() {
        o = false;
    }

    public final synchronized void a() {
        if (o) {
            Log.d("ProxyService", "stop proxy server");
            o = false;
            try {
                this.e.wakeup();
                this.e.close();
                this.e = null;
            } catch (Exception e) {
                Log.e("ProxyService", "close selector exception.", e);
            }
            try {
                this.f.close();
                this.f = null;
            } catch (IOException e2) {
                Log.e("ProxyService", "close server exception.", e2);
            }
            stopForeground(true);
            stopSelf();
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Log.d("VPNTetherLogs", "onBind");
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        m = this;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        try {
            unregisterReceiver(this.c);
        } catch (IllegalArgumentException unused) {
        }
        if (m != null) {
            m.a();
        }
        m = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0107  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int onStartCommand(android.content.Intent r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rased.vpn.app.tethering.ProxyService.onStartCommand(android.content.Intent, int, int):int");
    }
}
