package defpackage;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;

/* renamed from: lR, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3000lR implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ FirebaseAuth b;

    public RunnableC3000lR(FirebaseAuth firebaseAuth) {
        this.b = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                FirebaseAuth firebaseAuth = this.b;
                Iterator it = firebaseAuth.d.iterator();
                if (it.hasNext()) {
                    Vs.u(it.next());
                    throw null;
                }
                Iterator it2 = firebaseAuth.b.iterator();
                if (it2.hasNext()) {
                    Vs.u(it2.next());
                    throw null;
                }
                return;
            default:
                Iterator it3 = this.b.c.iterator();
                if (it3.hasNext()) {
                    Vs.u(it3.next());
                    throw null;
                }
                return;
        }
    }

    public RunnableC3000lR(FirebaseAuth firebaseAuth, C0402Wp c0402Wp) {
        this.b = firebaseAuth;
    }
}
