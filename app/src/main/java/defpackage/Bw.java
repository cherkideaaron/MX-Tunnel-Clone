package defpackage;

import android.app.Notification;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class Bw extends Ew {
    public CharSequence b;

    @Override // defpackage.Ew
    public final void a(Bundle bundle) {
        super.a(bundle);
    }

    @Override // defpackage.Ew
    public final void b(KJ kj) {
        new Notification.BigTextStyle((Notification.Builder) kj.b).setBigContentTitle(null).bigText(this.b);
    }

    @Override // defpackage.Ew
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
