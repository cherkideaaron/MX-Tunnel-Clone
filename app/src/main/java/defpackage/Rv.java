package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class Rv {
    public final Map a;
    public final C2827iH b;

    public Rv(Map map, boolean z) {
        AbstractC0500aq.m(map, "preferencesMap");
        this.a = map;
        this.b = new C2827iH(z);
    }

    public final Map a() {
        Jy jy;
        Set<Map.Entry> setEntrySet = this.a.entrySet();
        int iU = Ht.U(AbstractC3491ua.Z(setEntrySet, 10));
        if (iU < 16) {
            iU = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iU);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                AbstractC0500aq.l(bArrCopyOf, "copyOf(this, size)");
                jy = new Jy(key, bArrCopyOf);
            } else {
                jy = new Jy(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(jy.a, jy.b);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC0500aq.l(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    public final void b() {
        if (!(!((AtomicBoolean) this.b.b).get())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public final void c(C3081mz c3081mz) {
        AbstractC0500aq.m(c3081mz, "key");
        b();
        this.a.remove(c3081mz);
    }

    public final void d(C3081mz c3081mz, Object obj) {
        AbstractC0500aq.m(c3081mz, "key");
        e(c3081mz, obj);
    }

    public final void e(C3081mz c3081mz, Object obj) {
        AbstractC0500aq.m(c3081mz, "key");
        b();
        if (obj == null) {
            c(c3081mz);
            return;
        }
        boolean z = obj instanceof Set;
        Map map = this.a;
        if (z) {
            obj = Collections.unmodifiableSet(AbstractC3383sa.l0((Set) obj));
            AbstractC0500aq.l(obj, "unmodifiableSet(set.toSet())");
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            AbstractC0500aq.l(bArrCopyOf, "copyOf(this, size)");
            map.put(c3081mz, bArrCopyOf);
            return;
        }
        map.put(c3081mz, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.Rv
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            Rv r7 = (defpackage.Rv) r7
            java.util.Map r0 = r7.a
            java.util.Map r2 = r6.a
            r3 = 1
            if (r0 != r2) goto L10
            return r3
        L10:
            int r0 = r0.size()
            int r4 = r2.size()
            if (r0 == r4) goto L1b
            return r1
        L1b:
            java.util.Map r7 = r7.a
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L25
        L23:
            r1 = r3
            goto L63
        L25:
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L2d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r4 = r2.get(r4)
            if (r4 == 0) goto L60
            java.lang.Object r0 = r0.getValue()
            boolean r5 = r0 instanceof byte[]
            if (r5 == 0) goto L5b
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L60
            byte[] r0 = (byte[]) r0
            byte[] r4 = (byte[]) r4
            boolean r0 = java.util.Arrays.equals(r0, r4)
            if (r0 == 0) goto L60
            r0 = r3
            goto L61
        L5b:
            boolean r0 = defpackage.AbstractC0500aq.b(r0, r4)
            goto L61
        L60:
            r0 = r1
        L61:
            if (r0 != 0) goto L2d
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Rv.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = this.a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return AbstractC3383sa.c0(this.a.entrySet(), ",\n", "{\n", "\n}", C2738gk.c, 24);
    }

    public /* synthetic */ Rv(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
