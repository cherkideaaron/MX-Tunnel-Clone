package defpackage;

import android.app.NotificationChannel;
import android.media.AudioFocusRequest;

/* renamed from: gQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2726gQ {
    public static /* synthetic */ NotificationChannel c(int i) {
        return new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", i);
    }

    public static /* synthetic */ AudioFocusRequest.Builder e() {
        return new AudioFocusRequest.Builder(1);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest h(Object obj) {
        return (AudioFocusRequest) obj;
    }

    public static /* synthetic */ void k() {
    }
}
