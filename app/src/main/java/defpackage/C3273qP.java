package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: qP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3273qP extends AbstractRunnableC3163oP {
    public final /* synthetic */ TaskCompletionSource m;
    public final /* synthetic */ AbstractRunnableC3163oP n;
    public final /* synthetic */ QO o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3273qP(QO qo, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, AbstractRunnableC3163oP abstractRunnableC3163oP) {
        super(taskCompletionSource);
        this.o = qo;
        this.m = taskCompletionSource2;
        this.n = abstractRunnableC3163oP;
    }

    @Override // defpackage.AbstractRunnableC3163oP
    public final void b() {
        synchronized (this.o.f) {
            try {
                QO qo = this.o;
                TaskCompletionSource taskCompletionSource = this.m;
                qo.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new C3178om(22, qo, taskCompletionSource));
                if (this.o.l.getAndIncrement() > 0) {
                    this.o.b.b("Already connected to the service.", new Object[0]);
                }
                QO.b(this.o, this.n);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
