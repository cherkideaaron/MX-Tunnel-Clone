package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.UUID;

/* renamed from: u8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3472u8 extends AbstractRunnableC3580w8 {
    public final /* synthetic */ int b;
    public final /* synthetic */ C0589cO c;
    public final /* synthetic */ Object d;

    public C3472u8(C0589cO c0589cO) {
        this.b = 1;
        this.c = c0589cO;
        this.d = "offline_ping_sender_work";
    }

    @Override // defpackage.AbstractRunnableC3580w8
    public final void b() {
        WorkDatabase workDatabase;
        switch (this.b) {
            case 0:
                C0589cO c0589cO = this.c;
                workDatabase = c0589cO.y;
                workDatabase.c();
                try {
                    AbstractRunnableC3580w8.a(c0589cO, ((UUID) this.d).toString());
                    workDatabase.h();
                    workDatabase.f();
                    OD.a(c0589cO.x, c0589cO.y, c0589cO.A);
                    return;
                } finally {
                    workDatabase.f();
                }
            default:
                C0589cO c0589cO2 = this.c;
                workDatabase = c0589cO2.y;
                workDatabase.c();
                try {
                    Iterator it = workDatabase.n().i((String) this.d).iterator();
                    while (it.hasNext()) {
                        AbstractRunnableC3580w8.a(c0589cO2, (String) it.next());
                    }
                    workDatabase.h();
                    workDatabase.f();
                    OD.a(c0589cO2.x, c0589cO2.y, c0589cO2.A);
                    return;
                } catch (Throwable th) {
                    throw th;
                }
        }
    }

    public C3472u8(C0589cO c0589cO, UUID uuid) {
        this.b = 0;
        this.c = c0589cO;
        this.d = uuid;
    }
}
