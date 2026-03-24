package androidx.work;

import defpackage.AbstractC0096Ep;
import defpackage.C0034Be;
import defpackage.C0051Ce;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends AbstractC0096Ep {
    @Override // defpackage.AbstractC0096Ep
    public final C0051Ce a(ArrayList arrayList) throws Throwable {
        C0034Be c0034Be = new C0034Be(0);
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.putAll(Collections.unmodifiableMap(((C0051Ce) it.next()).a));
        }
        c0034Be.b(map);
        C0051Ce c0051Ce = new C0051Ce(c0034Be.a);
        C0051Ce.c(c0051Ce);
        return c0051Ce;
    }
}
