package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: tD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3423tD implements Iterable {
    public C3261qD a;
    public C3261qD b;
    public final WeakHashMap c = new WeakHashMap();
    public int d = 0;

    public C3261qD a(Object obj) {
        C3261qD c3261qD = this.a;
        while (c3261qD != null && !c3261qD.a.equals(obj)) {
            c3261qD = c3261qD.c;
        }
        return c3261qD;
    }

    public Object b(Object obj) {
        C3261qD c3261qDA = a(obj);
        if (c3261qDA == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC3369sD) it.next()).a(c3261qDA);
            }
        }
        C3261qD c3261qD = c3261qDA.d;
        C3261qD c3261qD2 = c3261qDA.c;
        if (c3261qD != null) {
            c3261qD.c = c3261qD2;
        } else {
            this.a = c3261qD2;
        }
        C3261qD c3261qD3 = c3261qDA.c;
        if (c3261qD3 != null) {
            c3261qD3.d = c3261qD;
        } else {
            this.b = c3261qD;
        }
        c3261qDA.c = null;
        c3261qDA.d = null;
        return c3261qDA.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((defpackage.C3206pD) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof defpackage.C3423tD
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            tD r7 = (defpackage.C3423tD) r7
            int r1 = r6.d
            int r3 = r7.d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            pD r3 = (defpackage.C3206pD) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            pD r4 = (defpackage.C3206pD) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            pD r7 = (defpackage.C3206pD) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3423tD.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            C3206pD c3206pD = (C3206pD) it;
            if (!c3206pD.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c3206pD.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C3206pD c3206pD = new C3206pD(this.a, this.b, 0);
        this.c.put(c3206pD, Boolean.FALSE);
        return c3206pD;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C3206pD c3206pD = (C3206pD) it;
            if (!c3206pD.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c3206pD.next()).toString());
            if (c3206pD.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
