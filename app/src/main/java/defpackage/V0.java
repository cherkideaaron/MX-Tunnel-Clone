package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class V0 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public ArrayList d = new ArrayList();
    public final transient HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final Bundle g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        N0 n0;
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        T0 t0 = (T0) this.e.get(str);
        if (t0 == null || (n0 = t0.a) == null || !this.d.contains(str)) {
            this.f.remove(str);
            this.g.putParcelable(str, new M0(i2, intent));
            return true;
        }
        n0.c(t0.b.c(i2, intent));
        this.d.remove(str);
        return true;
    }

    public abstract void b(int i, O0 o0, Object obj);

    public final S0 c(String str, O0 o0, N0 n0) {
        e(str);
        this.e.put(str, new T0(o0, n0));
        HashMap map = this.f;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            n0.c(obj);
        }
        Bundle bundle = this.g;
        M0 m0 = (M0) bundle.getParcelable(str);
        if (m0 != null) {
            bundle.remove(str);
            n0.c(o0.c(m0.a, m0.b));
        }
        return new S0(this, str, o0, 1);
    }

    public final S0 d(String str, Or or, O0 o0, N0 n0) {
        Jr lifecycle = or.getLifecycle();
        Qr qr = (Qr) lifecycle;
        if (qr.c.compareTo(Ir.d) >= 0) {
            throw new IllegalStateException("LifecycleOwner " + or + " is attempting to register while current state is " + qr.c + ". LifecycleOwners must call register before they are STARTED.");
        }
        e(str);
        HashMap map = this.c;
        U0 u0 = (U0) map.get(str);
        if (u0 == null) {
            u0 = new U0(lifecycle);
        }
        R0 r0 = new R0(this, str, n0, o0);
        u0.a.a(r0);
        u0.b.add(r0);
        map.put(str, u0);
        return new S0(this, str, o0, 0);
    }

    public final void e(String str) {
        HashMap map = this.b;
        if (((Integer) map.get(str)) != null) {
            return;
        }
        AbstractC2711gB.a.getClass();
        int iNextInt = AbstractC2711gB.b.a().nextInt(2147418112);
        while (true) {
            int i = iNextInt + 65536;
            HashMap map2 = this.a;
            if (!map2.containsKey(Integer.valueOf(i))) {
                map2.put(Integer.valueOf(i), str);
                map.put(str, Integer.valueOf(i));
                return;
            } else {
                AbstractC2711gB.a.getClass();
                iNextInt = AbstractC2711gB.b.a().nextInt(2147418112);
            }
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        HashMap map = this.f;
        if (map.containsKey(str)) {
            StringBuilder sbO = AbstractC3264qG.o("Dropping pending result for request ", str, ": ");
            sbO.append(map.get(str));
            Log.w("ActivityResultRegistry", sbO.toString());
            map.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            StringBuilder sbO2 = AbstractC3264qG.o("Dropping pending result for request ", str, ": ");
            sbO2.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", sbO2.toString());
            bundle.remove(str);
        }
        HashMap map2 = this.c;
        U0 u0 = (U0) map2.get(str);
        if (u0 != null) {
            ArrayList arrayList = u0.b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                u0.a.b((Mr) it.next());
            }
            arrayList.clear();
            map2.remove(str);
        }
    }
}
