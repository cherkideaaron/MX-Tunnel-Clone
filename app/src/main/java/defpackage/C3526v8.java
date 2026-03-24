package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* renamed from: v8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3526v8 extends AbstractRunnableC3580w8 {
    public final /* synthetic */ C0589cO b;
    public final /* synthetic */ String c = null;
    public final /* synthetic */ boolean d = false;

    public C3526v8(C0589cO c0589cO) {
        this.b = c0589cO;
    }

    @Override // defpackage.AbstractRunnableC3580w8
    public final void b() {
        C0589cO c0589cO = this.b;
        WorkDatabase workDatabase = c0589cO.y;
        workDatabase.c();
        try {
            Iterator it = workDatabase.n().h(this.c).iterator();
            while (it.hasNext()) {
                AbstractRunnableC3580w8.a(c0589cO, (String) it.next());
            }
            workDatabase.h();
            workDatabase.f();
            if (this.d) {
                OD.a(c0589cO.x, c0589cO.y, c0589cO.A);
            }
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
