package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class OO extends AbstractRunnableC3163oP {
    public final /* synthetic */ IBinder m;
    public final /* synthetic */ ServiceConnectionC2697fy n;

    public OO(ServiceConnectionC2697fy serviceConnectionC2697fy, IBinder iBinder) {
        this.n = serviceConnectionC2697fy;
        this.m = iBinder;
    }

    @Override // defpackage.AbstractRunnableC3163oP
    public final void b() throws RemoteException {
        ServiceConnectionC2697fy serviceConnectionC2697fy = this.n;
        IInterface iInterface = (IInterface) ((QO) serviceConnectionC2697fy.b).i.a(this.m);
        QO qo = (QO) serviceConnectionC2697fy.b;
        qo.n = iInterface;
        C3108nP c3108nP = qo.b;
        c3108nP.b("linkToDeath", new Object[0]);
        try {
            qo.n.asBinder().linkToDeath(qo.k, 0);
        } catch (RemoteException e) {
            c3108nP.a(e, "linkToDeath failed", new Object[0]);
        }
        qo.g = false;
        Iterator it = qo.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        qo.d.clear();
    }
}
