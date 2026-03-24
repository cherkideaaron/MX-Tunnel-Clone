package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;

/* renamed from: iy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2860iy {
    public static /* synthetic */ NotificationChannel B(String str) {
        return new NotificationChannel("openvpn_userreq", str, 1);
    }

    public static /* synthetic */ Notification.Builder b(Context context) {
        return new Notification.Builder(context, "MESSAGE");
    }

    public static /* synthetic */ NotificationChannel c() {
        return new NotificationChannel("MESSAGE", "Message Notification", 4);
    }

    public static /* synthetic */ NotificationChannel d(String str) {
        return new NotificationChannel("openvpn_bg", str, 1);
    }

    public static /* synthetic */ NotificationChannel e(String str, String str2) {
        return new NotificationChannel(str, str2, 2);
    }

    public static /* synthetic */ void o(Context context) {
        new Notification.Builder(context, "openvpn_newstat");
    }

    public static /* synthetic */ NotificationChannel x(String str) {
        return new NotificationChannel("openvpn_newstat", str, 2);
    }

    public static /* synthetic */ NotificationChannel y(String str, String str2) {
        return new NotificationChannel(str, str2, 3);
    }
}
