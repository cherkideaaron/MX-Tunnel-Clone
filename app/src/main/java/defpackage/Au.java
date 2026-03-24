package defpackage;

import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class Au {
    public final Runnable a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final HashMap c = new HashMap();

    public Au(Runnable runnable) {
        this.a = runnable;
    }

    public final boolean a(MenuItem menuItem) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((C3341rm) ((Qu) it.next())).a.o(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void b(Qu qu) {
        this.b.remove(qu);
        C3781zu c3781zu = (C3781zu) this.c.remove(qu);
        if (c3781zu != null) {
            c3781zu.a.b(c3781zu.b);
            c3781zu.b = null;
        }
        this.a.run();
    }
}
