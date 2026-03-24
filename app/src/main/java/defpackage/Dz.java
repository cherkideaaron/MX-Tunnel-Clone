package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class Dz {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap map = new HashMap();
        b = map;
        map.put(Bz.a, 0);
        map.put(Bz.b, 1);
        map.put(Bz.c, 2);
        for (Bz bz : map.keySet()) {
            a.append(((Integer) b.get(bz)).intValue(), bz);
        }
    }

    public static int a(Bz bz) {
        Integer num = (Integer) b.get(bz);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + bz);
    }

    public static Bz b(int i) {
        Bz bz = (Bz) a.get(i);
        if (bz != null) {
            return bz;
        }
        throw new IllegalArgumentException(Vs.k(i, "Unknown Priority for value "));
    }
}
