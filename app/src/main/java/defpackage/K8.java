package defpackage;

import android.view.MenuItem;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* loaded from: classes.dex */
public final class K8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ K8(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2834iO c2834iOJ;
        Object obj = this.e;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.d;
        switch (this.a) {
            case 0:
                L8 l8 = (L8) obj3;
                if (l8 != null) {
                    C0607co c0607co = (C0607co) obj;
                    ((M8) c0607co.a).G = true;
                    l8.b.c(false);
                    ((M8) c0607co.a).G = false;
                }
                MenuItem menuItem = (MenuItem) obj2;
                if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                    ((MenuC3511uu) obj4).q(menuItem, null, 4);
                    return;
                }
                return;
            default:
                VE ve = (VE) obj4;
                UUID uuid = (UUID) obj3;
                String string = uuid.toString();
                C3130nt c3130ntD = C3130nt.d();
                String str = C2669fO.c;
                StringBuilder sb = new StringBuilder("Updating progress for ");
                sb.append(uuid);
                sb.append(" (");
                C0051Ce c0051Ce = (C0051Ce) obj2;
                sb.append(c0051Ce);
                sb.append(")");
                c3130ntD.a(str, sb.toString(), new Throwable[0]);
                C2669fO c2669fO = (C2669fO) obj;
                WorkDatabase workDatabase = c2669fO.a;
                WorkDatabase workDatabase2 = c2669fO.a;
                workDatabase.c();
                try {
                    c2834iOJ = workDatabase2.n().j(string);
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                if (c2834iOJ == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (c2834iOJ.b == 2) {
                    C2614eO c2614eO = new C2614eO(string, c0051Ce);
                    C3532vE c3532vEM = workDatabase2.m();
                    TC tc = (TC) c3532vEM.a;
                    tc.b();
                    tc.c();
                    try {
                        ((C0087Eg) c3532vEM.b).e(c2614eO);
                        tc.h();
                        tc.f();
                    } catch (Throwable th) {
                        tc.f();
                        throw th;
                    }
                } else {
                    C3130nt.d().g(str, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.", new Throwable[0]);
                }
                ve.i(null);
                workDatabase2.h();
                return;
        }
    }
}
