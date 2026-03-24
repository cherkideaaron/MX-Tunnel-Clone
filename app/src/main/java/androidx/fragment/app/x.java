package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class x {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public u d;

    public final void a(l lVar) {
        if (this.a.contains(lVar)) {
            throw new IllegalStateException("Fragment already added: " + lVar);
        }
        synchronized (this.a) {
            this.a.add(lVar);
        }
        lVar.mAdded = true;
    }

    public final l b(String str) {
        w wVar = (w) this.b.get(str);
        if (wVar != null) {
            return wVar.c;
        }
        return null;
    }

    public final l c(String str) {
        l lVarFindFragmentByWho;
        for (w wVar : this.b.values()) {
            if (wVar != null && (lVarFindFragmentByWho = wVar.c.findFragmentByWho(str)) != null) {
                return lVarFindFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (w wVar : this.b.values()) {
            if (wVar != null) {
                arrayList.add(wVar);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (w wVar : this.b.values()) {
            arrayList.add(wVar != null ? wVar.c : null);
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public final void g(w wVar) {
        l lVar = wVar.c;
        String str = lVar.mWho;
        HashMap map = this.b;
        if (map.get(str) != null) {
            return;
        }
        map.put(lVar.mWho, wVar);
        if (lVar.mRetainInstanceChangedWhileDetached) {
            if (lVar.mRetainInstance) {
                this.d.c(lVar);
            } else {
                this.d.f(lVar);
            }
            lVar.mRetainInstanceChangedWhileDetached = false;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + lVar);
        }
    }

    public final void h(w wVar) {
        l lVar = wVar.c;
        if (lVar.mRetainInstance) {
            this.d.f(lVar);
        }
        if (((w) this.b.put(lVar.mWho, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + lVar);
        }
    }
}
