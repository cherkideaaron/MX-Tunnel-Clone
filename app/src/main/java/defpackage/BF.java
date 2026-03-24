package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class BF extends WH implements InterfaceC3504un {
    public /* synthetic */ FF a;
    public /* synthetic */ Rv b;

    @Override // defpackage.InterfaceC3504un
    public final Object b(Object obj, Object obj2, Object obj3) {
        BF bf = new BF(3, (InterfaceC3493uc) obj3);
        bf.a = (FF) obj;
        bf.b = (Rv) obj2;
        return bf.invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        C3081mz c3081mz;
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        AbstractC0115Ga.U(obj);
        FF ff = this.a;
        Rv rv = this.b;
        Set setKeySet = rv.a().keySet();
        ArrayList arrayList = new ArrayList(AbstractC3491ua.Z(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3081mz) it.next()).a);
        }
        Map<String, ?> all = ff.a.getAll();
        AbstractC0500aq.l(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it2.next();
            String key = next.getKey();
            Set set = ff.b;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(Ht.U(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = AbstractC3383sa.l0((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        Rv rv2 = new Rv(Ht.b0(rv.a()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String str = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                AbstractC0500aq.m(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
                c3081mz = new C3081mz(str);
            } else if (value2 instanceof Float) {
                AbstractC0500aq.m(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
                c3081mz = new C3081mz(str);
            } else if (value2 instanceof Integer) {
                AbstractC0500aq.m(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
                c3081mz = new C3081mz(str);
            } else if (value2 instanceof Long) {
                AbstractC0500aq.m(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
                c3081mz = new C3081mz(str);
            } else if (value2 instanceof String) {
                AbstractC0500aq.m(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
                c3081mz = new C3081mz(str);
            } else if (value2 instanceof Set) {
                C3081mz c3081mzD0 = AbstractC0069Df.d0(str);
                AbstractC0500aq.k(value2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                rv2.e(c3081mzD0, (Set) value2);
            }
            rv2.e(c3081mz, value2);
        }
        return new Rv(Ht.b0(rv2.a()), true);
    }
}
