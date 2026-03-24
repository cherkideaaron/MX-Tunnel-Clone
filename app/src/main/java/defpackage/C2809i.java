package defpackage;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2809i implements InterfaceC2631en {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C2809i(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC2631en
    public final Object invoke(Object obj) {
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                return obj == ((AbstractC3679y) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                C0389Wc c0389Wc = (C0389Wc) obj;
                AbstractC0500aq.m(c0389Wc, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", c0389Wc);
                CE ce = (CE) obj2;
                ce.getClass();
                return new BE(ce.a.a(null), null, null);
            case 2:
                Rv rv = (Rv) obj;
                C3667xo c3667xo = (C3667xo) obj2;
                c3667xo.getClass();
                long j = 0;
                for (Map.Entry entry : rv.a().entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        C3081mz c3081mz = (C3081mz) entry.getKey();
                        Set set = (Set) entry.getValue();
                        String strD = c3667xo.d(System.currentTimeMillis());
                        if (set.contains(strD)) {
                            Object[] objArr = {strD};
                            HashSet hashSet = new HashSet(1);
                            Object obj3 = objArr[0];
                            Objects.requireNonNull(obj3);
                            if (!hashSet.add(obj3)) {
                                throw new IllegalArgumentException("duplicate element: " + obj3);
                            }
                            rv.d(c3081mz, Collections.unmodifiableSet(hashSet));
                            j++;
                        } else {
                            rv.c(c3081mz);
                        }
                    }
                }
                C3081mz c3081mz2 = C3667xo.c;
                if (j == 0) {
                    rv.c(c3081mz2);
                } else {
                    rv.d(c3081mz2, Long.valueOf(j));
                }
                return null;
            default:
                int iIntValue = ((Integer) obj).intValue();
                StringBuilder sb = new StringBuilder();
                C0509az c0509az = (C0509az) obj2;
                sb.append(c0509az.e[iIntValue]);
                sb.append(": ");
                sb.append(c0509az.i(iIntValue).a());
                return sb.toString();
        }
    }
}
