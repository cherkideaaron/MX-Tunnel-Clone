package rased.vpn.app.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.mxtunnel.pro.R;
import defpackage.AbstractC2860iy;
import defpackage.C0172Jg;
import defpackage.C0468aC;
import defpackage.C0607co;
import defpackage.Gw;
import defpackage.Jw;
import defpackage.Kw;

/* loaded from: classes2.dex */
public class PushNotificationService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void c(C0468aC c0468aC) {
        if (c0468aC.b == null) {
            Bundle bundle = c0468aC.a;
            if (C0607co.G(bundle)) {
                c0468aC.b = new C0172Jg(new C0607co(bundle));
            }
        }
        C0172Jg c0172Jg = c0468aC.b;
        String str = c0172Jg.a;
        if (c0172Jg == null) {
            Bundle bundle2 = c0468aC.a;
            if (C0607co.G(bundle2)) {
                c0468aC.b = new C0172Jg(new C0607co(bundle2));
            }
        }
        String str2 = c0468aC.b.b;
        ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(AbstractC2860iy.c());
        Notification.Builder autoCancel = AbstractC2860iy.b(this).setContentTitle(str).setContentText(str2).setSmallIcon(R.drawable.ic_app_icon).setAutoCancel(true);
        Kw kw = new Kw(this);
        Notification notificationBuild = autoCancel.build();
        Bundle bundle3 = notificationBuild.extras;
        if (bundle3 == null || !bundle3.getBoolean("android.support.useSideChannel")) {
            kw.b.notify(null, 1, notificationBuild);
            return;
        }
        Gw gw = new Gw(getPackageName(), notificationBuild);
        synchronized (Kw.f) {
            try {
                if (Kw.g == null) {
                    Kw.g = new Jw(getApplicationContext());
                }
                Kw.g.b.obtainMessage(0, gw).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        kw.b.cancel(null, 1);
    }
}
