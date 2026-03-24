package defpackage;

import android.os.Bundle;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class R0 implements Mr {
    public final /* synthetic */ String a;
    public final /* synthetic */ N0 b;
    public final /* synthetic */ O0 c;
    public final /* synthetic */ V0 d;

    public R0(V0 v0, String str, N0 n0, O0 o0) {
        this.d = v0;
        this.a = str;
        this.b = n0;
        this.c = o0;
    }

    @Override // defpackage.Mr
    public final void c(Or or, Hr hr) {
        boolean zEquals = Hr.ON_START.equals(hr);
        String str = this.a;
        V0 v0 = this.d;
        if (!zEquals) {
            if (Hr.ON_STOP.equals(hr)) {
                v0.e.remove(str);
                return;
            } else {
                if (Hr.ON_DESTROY.equals(hr)) {
                    v0.f(str);
                    return;
                }
                return;
            }
        }
        HashMap map = v0.e;
        N0 n0 = this.b;
        O0 o0 = this.c;
        map.put(str, new T0(o0, n0));
        HashMap map2 = v0.f;
        if (map2.containsKey(str)) {
            Object obj = map2.get(str);
            map2.remove(str);
            n0.c(obj);
        }
        Bundle bundle = v0.g;
        M0 m0 = (M0) bundle.getParcelable(str);
        if (m0 != null) {
            bundle.remove(str);
            n0.c(o0.c(m0.a, m0.b));
        }
    }
}
