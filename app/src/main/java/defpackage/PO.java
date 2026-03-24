package defpackage;

/* loaded from: classes2.dex */
public final class PO extends AbstractRunnableC3163oP {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ PO(Object obj, int i) {
        this.m = i;
        this.n = obj;
    }

    @Override // defpackage.AbstractRunnableC3163oP
    public final void b() {
        switch (this.m) {
            case 0:
                ServiceConnectionC2697fy serviceConnectionC2697fy = (ServiceConnectionC2697fy) this.n;
                QO qo = (QO) serviceConnectionC2697fy.b;
                qo.b.b("unlinkToDeath", new Object[0]);
                qo.n.asBinder().unlinkToDeath(qo.k, 0);
                QO qo2 = (QO) serviceConnectionC2697fy.b;
                qo2.n = null;
                qo2.g = false;
                return;
            default:
                synchronized (((QO) this.n).f) {
                    try {
                        if (((QO) this.n).l.get() <= 0 || ((QO) this.n).l.decrementAndGet() <= 0) {
                            QO qo3 = (QO) this.n;
                            if (qo3.n != null) {
                                qo3.b.b("Unbind from service.", new Object[0]);
                                QO qo4 = (QO) this.n;
                                qo4.a.unbindService(qo4.m);
                                QO qo5 = (QO) this.n;
                                qo5.g = false;
                                qo5.n = null;
                                qo5.m = null;
                            }
                            ((QO) this.n).e();
                        } else {
                            ((QO) this.n).b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                        }
                    } finally {
                    }
                }
                return;
        }
    }
}
