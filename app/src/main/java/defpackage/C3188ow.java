package defpackage;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

/* renamed from: ow, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3188ow {
    public TreeSet a;

    public final void a(C2544d8 c2544d8, boolean z) {
        this.a.add(new C3133nw(c2544d8, z));
    }

    public final void b() {
        this.a.clear();
    }

    public final Vector c(boolean z) {
        Vector vector = new Vector();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            C3133nw c3133nw = (C3133nw) it.next();
            if (c3133nw.c == z) {
                vector.add(c3133nw);
            }
        }
        return vector;
    }

    public final Vector d() {
        PriorityQueue priorityQueue = new PriorityQueue((SortedSet) this.a);
        TreeSet treeSet = new TreeSet();
        C3133nw c3133nw = (C3133nw) priorityQueue.poll();
        if (c3133nw != null) {
            while (c3133nw != null) {
                C3133nw c3133nw2 = (C3133nw) priorityQueue.poll();
                if (c3133nw2 == null || c3133nw.c().compareTo(c3133nw2.a()) == -1) {
                    treeSet.add(c3133nw);
                    c3133nw = c3133nw2;
                } else {
                    boolean zEquals = c3133nw.a().equals(c3133nw2.a());
                    boolean z = c3133nw.c;
                    boolean z2 = c3133nw2.c;
                    int i = c3133nw2.b;
                    if (!zEquals || c3133nw.b < i) {
                        if (z != z2) {
                            C3133nw[] c3133nwArrE = c3133nw.e();
                            C3133nw c3133nw3 = c3133nwArrE[1];
                            if (c3133nw3.b != i) {
                                priorityQueue.add(c3133nw3);
                            }
                            priorityQueue.add(c3133nw2);
                            c3133nw = c3133nwArrE[0];
                        }
                    } else if (z == z2) {
                        c3133nw = c3133nw2;
                    } else {
                        C3133nw[] c3133nwArrE2 = c3133nw2.e();
                        if (!priorityQueue.contains(c3133nwArrE2[1])) {
                            priorityQueue.add(c3133nwArrE2[1]);
                        }
                        if (!c3133nwArrE2[0].c().equals(c3133nw.c()) && !priorityQueue.contains(c3133nwArrE2[0])) {
                            priorityQueue.add(c3133nwArrE2[0]);
                        }
                    }
                }
            }
        }
        Vector vector = new Vector();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            C3133nw c3133nw4 = (C3133nw) it.next();
            if (c3133nw4.c) {
                vector.add(c3133nw4);
            }
        }
        return vector;
    }
}
