package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import java.util.UUID;

/* loaded from: classes.dex */
public final class XN implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VE b;
    public final /* synthetic */ YN c;

    public /* synthetic */ XN(YN yn, VE ve, int i) {
        this.a = i;
        this.c = yn;
        this.b = ve;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.k(this.c.d.getForegroundInfoAsync());
                return;
            default:
                YN yn = this.c;
                try {
                    C0415Xl c0415Xl = (C0415Xl) this.b.get();
                    if (c0415Xl == null) {
                        throw new IllegalStateException("Worker was marked important (" + yn.c.c + ") but did not provide ForegroundInfo");
                    }
                    C3130nt c3130ntD = C3130nt.d();
                    String str = YN.m;
                    C2834iO c2834iO = yn.c;
                    ListenableWorker listenableWorker = yn.d;
                    c3130ntD.a(str, "Updating notification for " + c2834iO.c, new Throwable[0]);
                    listenableWorker.setRunInForeground(true);
                    VE ve = yn.a;
                    InterfaceC0496am interfaceC0496am = yn.e;
                    Context context = yn.b;
                    UUID id = listenableWorker.getId();
                    C0480aO c0480aO = (C0480aO) interfaceC0496am;
                    c0480aO.getClass();
                    VE ve2 = new VE();
                    ((D3) c0480aO.a).t(new ZN(c0480aO, ve2, id, c0415Xl, context));
                    ve.k(ve2);
                    return;
                } catch (Throwable th) {
                    yn.a.j(th);
                    return;
                }
        }
    }
}
