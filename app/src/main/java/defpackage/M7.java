package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public abstract class M7 extends AbstractC0595cc {
    public static final String h = C3130nt.f("BrdcstRcvrCnstrntTrckr");
    public final B2 g;

    public M7(Context context, InterfaceC3482uI interfaceC3482uI) {
        super(context, interfaceC3482uI);
        this.g = new B2(this, 1);
    }

    @Override // defpackage.AbstractC0595cc
    public final void d() {
        C3130nt.d().a(h, getClass().getSimpleName().concat(": registering receiver"), new Throwable[0]);
        this.b.registerReceiver(this.g, f());
    }

    @Override // defpackage.AbstractC0595cc
    public final void e() {
        C3130nt.d().a(h, getClass().getSimpleName().concat(": unregistering receiver"), new Throwable[0]);
        this.b.unregisterReceiver(this.g);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}
