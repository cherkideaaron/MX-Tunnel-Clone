package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class QO {
    public static final HashMap o = new HashMap();
    public final Context a;
    public final C3108nP b;
    public final String c;
    public boolean g;
    public final Intent h;
    public final InterfaceC3327rP i;
    public ServiceConnectionC2697fy m;
    public IInterface n;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final C3218pP k = new IBinder.DeathRecipient() { // from class: pP
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            QO qo = this.a;
            qo.b.b("reportBinderDeath", new Object[0]);
            Vs.u(qo.j.get());
            qo.b.b("%s : Binder has died.", qo.c);
            Iterator it = qo.d.iterator();
            while (it.hasNext()) {
                ((AbstractRunnableC3163oP) it.next()).a(new RemoteException(String.valueOf(qo.c).concat(" : Binder has died.")));
            }
            qo.d.clear();
            synchronized (qo.f) {
                qo.e();
            }
        }
    };
    public final AtomicInteger l = new AtomicInteger(0);
    public final WeakReference j = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [pP] */
    public QO(Context context, C3108nP c3108nP, String str, Intent intent, InterfaceC3327rP interfaceC3327rP) {
        this.a = context;
        this.b = c3108nP;
        this.c = str;
        this.h = intent;
        this.i = interfaceC3327rP;
    }

    public static void b(QO qo, AbstractRunnableC3163oP abstractRunnableC3163oP) {
        IInterface iInterface = qo.n;
        ArrayList arrayList = qo.d;
        C3108nP c3108nP = qo.b;
        if (iInterface != null || qo.g) {
            if (!qo.g) {
                abstractRunnableC3163oP.run();
                return;
            } else {
                c3108nP.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(abstractRunnableC3163oP);
                return;
            }
        }
        c3108nP.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(abstractRunnableC3163oP);
        ServiceConnectionC2697fy serviceConnectionC2697fy = new ServiceConnectionC2697fy(qo, 2);
        qo.m = serviceConnectionC2697fy;
        qo.g = true;
        if (qo.a.bindService(qo.h, serviceConnectionC2697fy, 1)) {
            return;
        }
        c3108nP.b("Failed to bind to the service.", new Object[0]);
        qo.g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC3163oP) it.next()).a(new RO("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    map.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(AbstractRunnableC3163oP abstractRunnableC3163oP, TaskCompletionSource taskCompletionSource) {
        a().post(new C3273qP(this, abstractRunnableC3163oP.c(), taskCompletionSource, abstractRunnableC3163oP));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f) {
            this.e.remove(taskCompletionSource);
        }
        a().post(new PO(this, 1));
    }

    public final void e() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
