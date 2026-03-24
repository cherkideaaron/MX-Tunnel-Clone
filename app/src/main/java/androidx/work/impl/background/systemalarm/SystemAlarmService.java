package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import defpackage.C2663fI;
import defpackage.C3130nt;
import defpackage.InterfaceC2608eI;
import defpackage.LM;
import defpackage.Rr;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SystemAlarmService extends Rr implements InterfaceC2608eI {
    public static final String d = C3130nt.f("SystemAlarmService");
    public C2663fI b;
    public boolean c;

    public final void a() {
        this.c = true;
        C3130nt.d().a(d, "All commands completed in dispatcher", new Throwable[0]);
        String str = LM.a;
        HashMap map = new HashMap();
        WeakHashMap weakHashMap = LM.b;
        synchronized (weakHashMap) {
            map.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                C3130nt.d().g(LM.a, String.format("WakeLock held for %s", map.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // defpackage.Rr, android.app.Service
    public final void onCreate() {
        super.onCreate();
        C2663fI c2663fI = new C2663fI(this);
        this.b = c2663fI;
        if (c2663fI.p != null) {
            C3130nt.d().b(C2663fI.q, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            c2663fI.p = this;
        }
        this.c = false;
    }

    @Override // defpackage.Rr, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.c = true;
        this.b.e();
    }

    @Override // defpackage.Rr, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.c) {
            C3130nt.d().e(d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.b.e();
            C2663fI c2663fI = new C2663fI(this);
            this.b = c2663fI;
            if (c2663fI.p != null) {
                C3130nt.d().b(C2663fI.q, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            } else {
                c2663fI.p = this;
            }
            this.c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.b.a(i2, intent);
        return 3;
    }
}
