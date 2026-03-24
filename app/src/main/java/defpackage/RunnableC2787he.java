package defpackage;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: he, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2787he implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Parcelable d;
    public final /* synthetic */ Object e;

    public RunnableC2787he(BinderC2895je binderC2895je, int i, int i2, Bundle bundle) {
        this.e = binderC2895je;
        this.b = i;
        this.c = i2;
        this.d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((BinderC2895je) this.e).b.onActivityResized(this.b, this.c, (Bundle) this.d);
                break;
            default:
                int i = Build.VERSION.SDK_INT;
                Notification notification = (Notification) this.d;
                int i2 = this.b;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.e;
                if (i < 29) {
                    systemForegroundService.startForeground(i2, notification);
                    break;
                } else {
                    systemForegroundService.startForeground(i2, notification, this.c);
                    break;
                }
        }
    }

    public RunnableC2787he(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.e = systemForegroundService;
        this.b = i;
        this.d = notification;
        this.c = i2;
    }
}
