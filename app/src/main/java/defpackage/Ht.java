package defpackage;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class Ht extends AbstractC0136He {
    public static Object T(Map map, Object obj) {
        AbstractC0500aq.m(map, "<this>");
        if (map instanceof Gt) {
            return ((Gt) map).a();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int U(int i) {
        return i < 0 ? i : i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public static Map V(Jy jy) {
        AbstractC0500aq.m(jy, "pair");
        Map mapSingletonMap = Collections.singletonMap(jy.a, jy.b);
        AbstractC0500aq.l(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static Map W(Jy... jyArr) {
        if (jyArr.length <= 0) {
            return C0072Di.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(U(jyArr.length));
        X(linkedHashMap, jyArr);
        return linkedHashMap;
    }

    public static final void X(LinkedHashMap linkedHashMap, Jy[] jyArr) {
        for (Jy jy : jyArr) {
            linkedHashMap.put(jy.a, jy.b);
        }
    }

    public static Map Y(ArrayList arrayList) {
        C0072Di c0072Di = C0072Di.a;
        int size = arrayList.size();
        if (size == 0) {
            return c0072Di;
        }
        if (size == 1) {
            return V((Jy) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(U(arrayList.size()));
        a0(arrayList, linkedHashMap);
        return linkedHashMap;
    }

    public static Map Z(LinkedHashMap linkedHashMap) {
        AbstractC0500aq.m(linkedHashMap, "<this>");
        int size = linkedHashMap.size();
        return size != 0 ? size != 1 ? b0(linkedHashMap) : c0(linkedHashMap) : C0072Di.a;
    }

    public static final void a0(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Jy jy = (Jy) it.next();
            linkedHashMap.put(jy.a, jy.b);
        }
    }

    public static LinkedHashMap b0(Map map) {
        AbstractC0500aq.m(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static final Map c0(LinkedHashMap linkedHashMap) {
        AbstractC0500aq.m(linkedHashMap, "<this>");
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        AbstractC0500aq.l(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
