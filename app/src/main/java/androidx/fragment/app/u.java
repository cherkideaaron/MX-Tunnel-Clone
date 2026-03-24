package androidx.fragment.app;

import android.util.Log;
import defpackage.AbstractC0478aM;
import defpackage.C0360Uh;
import defpackage.C2667fM;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class u extends AbstractC0478aM {
    public static final C0360Uh h = new C0360Uh(18);
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public u(boolean z) {
        this.e = z;
    }

    @Override // defpackage.AbstractC0478aM
    public final void b() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f = true;
    }

    public final void c(l lVar) {
        if (this.g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        HashMap map = this.b;
        if (map.containsKey(lVar.mWho)) {
            return;
        }
        map.put(lVar.mWho, lVar);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + lVar);
        }
    }

    public final void d(l lVar) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + lVar);
        }
        e(lVar.mWho);
    }

    public final void e(String str) {
        HashMap map = this.c;
        u uVar = (u) map.get(str);
        if (uVar != null) {
            uVar.b();
            map.remove(str);
        }
        HashMap map2 = this.d;
        C2667fM c2667fM = (C2667fM) map2.get(str);
        if (c2667fM != null) {
            c2667fM.a();
            map2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        return this.b.equals(uVar.b) && this.c.equals(uVar.c) && this.d.equals(uVar.d);
    }

    public final void f(l lVar) {
        if (this.g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.b.remove(lVar.mWho) == null || !Log.isLoggable("FragmentManager", 2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + lVar);
        }
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
