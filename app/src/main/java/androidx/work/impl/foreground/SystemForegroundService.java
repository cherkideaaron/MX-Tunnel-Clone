package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import defpackage.C0589cO;
import defpackage.C2773hI;
import defpackage.C3130nt;
import defpackage.C3472u8;
import defpackage.D3;
import defpackage.InterfaceC2718gI;
import defpackage.Rr;
import defpackage.RunnableC0354Ub;
import java.util.UUID;

/* loaded from: classes.dex */
public class SystemForegroundService extends Rr implements InterfaceC2718gI {
    public static final String f = C3130nt.f("SystemFgService");
    public Handler b;
    public boolean c;
    public C2773hI d;
    public NotificationManager e;

    public final void a() {
        this.b = new Handler(Looper.getMainLooper());
        this.e = (NotificationManager) getApplicationContext().getSystemService("notification");
        C2773hI c2773hI = new C2773hI(getApplicationContext());
        this.d = c2773hI;
        if (c2773hI.o == null) {
            c2773hI.o = this;
        } else {
            C3130nt.d().b(C2773hI.p, "A callback already exists.", new Throwable[0]);
        }
    }

    @Override // defpackage.Rr, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // defpackage.Rr, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.d.g();
    }

    @Override // defpackage.Rr, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.c;
        String str = f;
        if (z) {
            C3130nt.d().e(str, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.d.g();
            a();
            this.c = false;
        }
        if (intent == null) {
            return 3;
        }
        C2773hI c2773hI = this.d;
        c2773hI.getClass();
        String action = intent.getAction();
        boolean zEquals = "ACTION_START_FOREGROUND".equals(action);
        String str2 = C2773hI.p;
        C0589cO c0589cO = c2773hI.a;
        if (zEquals) {
            C3130nt.d().e(str2, String.format("Started foreground service %s", intent), new Throwable[0]);
            ((D3) c2773hI.b).t(new RunnableC0354Ub(c2773hI, c0589cO.y, intent.getStringExtra("KEY_WORKSPEC_ID"), 8, false));
        } else if (!"ACTION_NOTIFY".equals(action)) {
            if ("ACTION_CANCEL_WORK".equals(action)) {
                C3130nt.d().e(str2, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
                    return 3;
                }
                UUID uuidFromString = UUID.fromString(stringExtra);
                c0589cO.getClass();
                ((D3) c0589cO.z).t(new C3472u8(c0589cO, uuidFromString));
                return 3;
            }
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            C3130nt.d().e(str2, "Stopping foreground service", new Throwable[0]);
            InterfaceC2718gI interfaceC2718gI = c2773hI.o;
            if (interfaceC2718gI == null) {
                return 3;
            }
            SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC2718gI;
            systemForegroundService.c = true;
            C3130nt.d().a(str, "All commands completed.", new Throwable[0]);
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
            return 3;
        }
        c2773hI.e(intent);
        return 3;
    }
}
