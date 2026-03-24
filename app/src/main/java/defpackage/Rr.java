package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public abstract class Rr extends Service implements Or {
    public final D3 a = new D3((Or) this);

    @Override // defpackage.Or
    public final Jr getLifecycle() {
        return (Qr) this.a.b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        AbstractC0500aq.m(intent, "intent");
        D3 d3 = this.a;
        d3.getClass();
        d3.N(Hr.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        D3 d3 = this.a;
        d3.getClass();
        d3.N(Hr.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        D3 d3 = this.a;
        d3.getClass();
        d3.N(Hr.ON_STOP);
        d3.N(Hr.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        D3 d3 = this.a;
        d3.getClass();
        d3.N(Hr.ON_START);
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
