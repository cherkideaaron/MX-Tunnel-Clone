package defpackage;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: nb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3112nb implements InterfaceC2729gb, InterfaceC0192Kj {
    public static final C3002lb n = new C3002lb(0);
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object m;

    public C3112nb(InterfaceC3148oA interfaceC3148oA, InterfaceC3148oA interfaceC3148oA2, InterfaceC3148oA interfaceC3148oA3, InterfaceC3148oA interfaceC3148oA4, InterfaceC3148oA interfaceC3148oA5, InterfaceC3148oA interfaceC3148oA6, InterfaceC3148oA interfaceC3148oA7) {
        this.a = interfaceC3148oA;
        this.b = interfaceC3148oA2;
        this.c = interfaceC3148oA3;
        this.d = interfaceC3148oA4;
        this.e = interfaceC3148oA5;
        this.f = interfaceC3148oA6;
        this.m = interfaceC3148oA7;
    }

    @Override // defpackage.InterfaceC2729gb
    public Object a(Class cls) {
        return g(KA.a(cls));
    }

    @Override // defpackage.InterfaceC2729gb
    public Set b(KA ka) {
        return (Set) l(ka).get();
    }

    @Override // defpackage.InterfaceC2729gb
    public InterfaceC3258qA c(Class cls) {
        return f(KA.a(cls));
    }

    public void d(Map map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            C0319Sa c0319Sa = (C0319Sa) entry.getKey();
            InterfaceC3258qA interfaceC3258qA = (InterfaceC3258qA) entry.getValue();
            int i = c0319Sa.d;
            if (i == 1 || (i == 2 && z)) {
                interfaceC3258qA.get();
            }
        }
        C0378Vi c0378Vi = (C0378Vi) this.e;
        synchronized (c0378Vi) {
            arrayDeque = c0378Vi.b;
            if (arrayDeque != null) {
                c0378Vi.b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                Vs.u(it.next());
                throw null;
            }
        }
    }

    @Override // defpackage.InterfaceC2729gb
    public Dy e(KA ka) {
        InterfaceC3258qA interfaceC3258qAF = f(ka);
        return interfaceC3258qAF == null ? new Dy(Dy.c, Dy.d) : interfaceC3258qAF instanceof Dy ? (Dy) interfaceC3258qAF : new Dy(null, interfaceC3258qAF);
    }

    @Override // defpackage.InterfaceC2729gb
    public synchronized InterfaceC3258qA f(KA ka) {
        AbstractC3279qd.l(ka, "Null interface requested.");
        return (InterfaceC3258qA) ((HashMap) this.b).get(ka);
    }

    @Override // defpackage.InterfaceC2729gb
    public Object g(KA ka) {
        InterfaceC3258qA interfaceC3258qAF = f(ka);
        if (interfaceC3258qAF == null) {
            return null;
        }
        return interfaceC3258qAF.get();
    }

    @Override // defpackage.InterfaceC3203pA
    public Object get() {
        return new PF((SE) ((InterfaceC3203pA) this.a).get(), (ME) ((InterfaceC3203pA) this.b).get(), (IE) ((InterfaceC3203pA) this.c).get(), (YI) ((InterfaceC3203pA) this.d).get(), (InterfaceC0272Pe) ((InterfaceC3203pA) this.e).get(), (Iz) ((InterfaceC3203pA) this.f).get(), (InterfaceC0168Jc) ((InterfaceC3203pA) this.m).get());
    }

    @Override // defpackage.InterfaceC2729gb
    public Dy h(Class cls) {
        return e(KA.a(cls));
    }

    public void i() {
        for (C0319Sa c0319Sa : ((HashMap) this.a).keySet()) {
            for (C0036Bg c0036Bg : c0319Sa.c) {
                boolean z = c0036Bg.b == 2;
                KA ka = c0036Bg.a;
                if (z) {
                    HashMap map = (HashMap) this.c;
                    if (!map.containsKey(ka)) {
                        Set setEmptySet = Collections.emptySet();
                        C3616wr c3616wr = new C3616wr();
                        c3616wr.b = null;
                        c3616wr.a = Collections.newSetFromMap(new ConcurrentHashMap());
                        c3616wr.a.addAll(setEmptySet);
                        map.put(ka, c3616wr);
                    }
                }
                HashMap map2 = (HashMap) this.b;
                if (map2.containsKey(ka)) {
                    continue;
                } else {
                    int i = c0036Bg.b;
                    if (i == 1) {
                        throw new C3187ov("Unsatisfied dependency for component " + c0319Sa + ": " + ka);
                    }
                    if (i != 2) {
                        map2.put(ka, new Dy(Dy.c, Dy.d));
                    }
                }
            }
        }
    }

    public ArrayList j(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0319Sa c0319Sa = (C0319Sa) it.next();
            if (c0319Sa.e == 0) {
                InterfaceC3258qA interfaceC3258qA = (InterfaceC3258qA) ((HashMap) this.a).get(c0319Sa);
                for (KA ka : c0319Sa.b) {
                    HashMap map = (HashMap) this.b;
                    if (map.containsKey(ka)) {
                        arrayList2.add(new RunnableC3195p2(1, (Dy) ((InterfaceC3258qA) map.get(ka)), interfaceC3258qA));
                    } else {
                        map.put(ka, interfaceC3258qA);
                    }
                }
            }
        }
        return arrayList2;
    }

    public ArrayList k() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : ((HashMap) this.a).entrySet()) {
            C0319Sa c0319Sa = (C0319Sa) entry.getKey();
            if (c0319Sa.e != 0) {
                InterfaceC3258qA interfaceC3258qA = (InterfaceC3258qA) entry.getValue();
                for (KA ka : c0319Sa.b) {
                    if (!map.containsKey(ka)) {
                        map.put(ka, new HashSet());
                    }
                    ((Set) map.get(ka)).add(interfaceC3258qA);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            HashMap map2 = (HashMap) this.c;
            if (map2.containsKey(key)) {
                C3616wr c3616wr = (C3616wr) map2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new RunnableC3195p2(2, c3616wr, (InterfaceC3258qA) it.next()));
                }
            } else {
                KA ka2 = (KA) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                C3616wr c3616wr2 = new C3616wr();
                c3616wr2.b = null;
                c3616wr2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                c3616wr2.a.addAll(set);
                map2.put(ka2, c3616wr2);
            }
        }
        return arrayList;
    }

    public synchronized InterfaceC3258qA l(KA ka) {
        C3616wr c3616wr = (C3616wr) ((HashMap) this.c).get(ka);
        if (c3616wr != null) {
            return c3616wr;
        }
        return n;
    }

    public C3112nb(Executor executor, ArrayList arrayList, ArrayList arrayList2, C0108Fk c0108Fk) {
        int i = 0;
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashSet();
        this.f = new AtomicReference();
        C0378Vi c0378Vi = new C0378Vi(executor);
        this.e = c0378Vi;
        this.m = c0108Fk;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(C0319Sa.c(c0378Vi, C0378Vi.class, GH.class, GA.class));
        arrayList3.add(C0319Sa.c(this, C3112nb.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C0319Sa c0319Sa = (C0319Sa) it.next();
            if (c0319Sa != null) {
                arrayList3.add(c0319Sa);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC3258qA) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(((C0108Fk) this.m).m(componentRegistrar));
                        it3.remove();
                    }
                } catch (C2799hq e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((C0319Sa) it4.next()).b.toArray();
                int length = array.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        Object obj = array[i2];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (((HashSet) this.d).contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            ((HashSet) this.d).add(obj.toString());
                        }
                        i2++;
                    }
                }
            }
            if (((HashMap) this.a).isEmpty()) {
                AbstractC3296qu.n(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(((HashMap) this.a).keySet());
                arrayList6.addAll(arrayList3);
                AbstractC3296qu.n(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                C0319Sa c0319Sa2 = (C0319Sa) it5.next();
                ((HashMap) this.a).put(c0319Sa2, new C3562vr(new C3057mb(i, this, c0319Sa2)));
            }
            arrayList5.addAll(j(arrayList3));
            arrayList5.addAll(k());
            i();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) this.f).get();
        if (bool != null) {
            d((HashMap) this.a, bool.booleanValue());
        }
    }
}
