package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: fM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2667fM {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((AbstractC0478aM) it.next()).a();
        }
        linkedHashMap.clear();
    }
}
