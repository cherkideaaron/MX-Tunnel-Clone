package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class S9 {
    public final HashMap a = new HashMap();
    public final Map b;

    public S9(HashMap map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            Hr hr = (Hr) entry.getValue();
            List arrayList = (List) this.a.get(hr);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(hr, arrayList);
            }
            arrayList.add((T9) entry.getKey());
        }
    }

    public static void a(List list, Or or, Hr hr, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                T9 t9 = (T9) list.get(size);
                t9.getClass();
                try {
                    int i = t9.a;
                    Method method = t9.b;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, or);
                    } else if (i == 2) {
                        method.invoke(obj, or, hr);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
