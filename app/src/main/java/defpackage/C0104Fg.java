package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: Fg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0104Fg {
    public C2620ec a;
    public boolean b;
    public boolean c;
    public C2620ec d;
    public ArrayList e;
    public C0286Qb f;
    public C3417t7 g;
    public ArrayList h;

    public final void a(C0121Gg c0121Gg, int i, ArrayList arrayList, ZC zc) {
        ZM zm = c0121Gg.d;
        if (zm.c == null) {
            C2620ec c2620ec = this.a;
            if (zm == c2620ec.d || zm == c2620ec.e) {
                return;
            }
            if (zc == null) {
                zc = new ZC();
                zc.a = null;
                zc.b = new ArrayList();
                zc.a = zm;
                arrayList.add(zc);
            }
            zm.c = zc;
            zc.b.add(zm);
            C0121Gg c0121Gg2 = zm.h;
            Iterator it = c0121Gg2.k.iterator();
            while (it.hasNext()) {
                InterfaceC0053Cg interfaceC0053Cg = (InterfaceC0053Cg) it.next();
                if (interfaceC0053Cg instanceof C0121Gg) {
                    a((C0121Gg) interfaceC0053Cg, i, arrayList, zc);
                }
            }
            C0121Gg c0121Gg3 = zm.i;
            Iterator it2 = c0121Gg3.k.iterator();
            while (it2.hasNext()) {
                InterfaceC0053Cg interfaceC0053Cg2 = (InterfaceC0053Cg) it2.next();
                if (interfaceC0053Cg2 instanceof C0121Gg) {
                    a((C0121Gg) interfaceC0053Cg2, i, arrayList, zc);
                }
            }
            if (i == 1 && (zm instanceof EL)) {
                Iterator it3 = ((EL) zm).k.k.iterator();
                while (it3.hasNext()) {
                    InterfaceC0053Cg interfaceC0053Cg3 = (InterfaceC0053Cg) it3.next();
                    if (interfaceC0053Cg3 instanceof C0121Gg) {
                        a((C0121Gg) interfaceC0053Cg3, i, arrayList, zc);
                    }
                }
            }
            Iterator it4 = c0121Gg2.l.iterator();
            while (it4.hasNext()) {
                a((C0121Gg) it4.next(), i, arrayList, zc);
            }
            Iterator it5 = c0121Gg3.l.iterator();
            while (it5.hasNext()) {
                a((C0121Gg) it5.next(), i, arrayList, zc);
            }
            if (i == 1 && (zm instanceof EL)) {
                Iterator it6 = ((EL) zm).k.l.iterator();
                while (it6.hasNext()) {
                    a((C0121Gg) it6.next(), i, arrayList, zc);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.C2620ec r17) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0104Fg.b(ec):void");
    }

    public final void c() {
        ZM c2960ko;
        ArrayList arrayList = this.e;
        arrayList.clear();
        C2620ec c2620ec = this.d;
        c2620ec.d.f();
        c2620ec.e.f();
        arrayList.add(c2620ec.d);
        arrayList.add(c2620ec.e);
        Iterator it = c2620ec.p0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C2566dc c2566dc = (C2566dc) it.next();
            if (c2566dc instanceof C2905jo) {
                c2960ko = new C2960ko(c2566dc);
                c2566dc.d.f();
                c2566dc.e.f();
                c2960ko.f = ((C2905jo) c2566dc).t0;
            } else {
                if (c2566dc.u()) {
                    if (c2566dc.b == null) {
                        c2566dc.b = new Q8(c2566dc, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c2566dc.b);
                } else {
                    arrayList.add(c2566dc.d);
                }
                if (c2566dc.v()) {
                    if (c2566dc.c == null) {
                        c2566dc.c = new Q8(c2566dc, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c2566dc.c);
                } else {
                    arrayList.add(c2566dc.e);
                }
                if (c2566dc instanceof AbstractC3775zo) {
                    c2960ko = new C3721yo(c2566dc);
                }
            }
            arrayList.add(c2960ko);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((ZM) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ZM zm = (ZM) it3.next();
            if (zm.b != c2620ec) {
                zm.d();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        C2620ec c2620ec2 = this.a;
        e(c2620ec2.d, 0, arrayList2);
        e(c2620ec2.e, 1, arrayList2);
        this.b = false;
    }

    public final int d(C2620ec c2620ec, int i) {
        ArrayList arrayList;
        int i2;
        int i3;
        long j;
        long j2;
        long jB;
        float f;
        C2620ec c2620ec2 = c2620ec;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i4 = 0;
        long jMax = 0;
        while (i4 < size) {
            ZM zm = ((ZC) arrayList2.get(i4)).a;
            if (!(zm instanceof Q8) ? !(i != 0 ? (zm instanceof EL) : (zm instanceof C0129Go)) : ((Q8) zm).f != i) {
                C0121Gg c0121Gg = (i == 0 ? c2620ec2.d : c2620ec2.e).h;
                C0121Gg c0121Gg2 = (i == 0 ? c2620ec2.d : c2620ec2.e).i;
                boolean zContains = zm.h.l.contains(c0121Gg);
                C0121Gg c0121Gg3 = zm.i;
                boolean zContains2 = c0121Gg3.l.contains(c0121Gg2);
                long j3 = zm.j();
                C0121Gg c0121Gg4 = zm.h;
                if (zContains && zContains2) {
                    long jB2 = ZC.b(c0121Gg4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i2 = size;
                    long jA = ZC.a(c0121Gg3, 0L);
                    long j4 = jB2 - j3;
                    int i5 = c0121Gg3.f;
                    arrayList = arrayList3;
                    i3 = i4;
                    if (j4 >= (-i5)) {
                        j4 += i5;
                    }
                    long j5 = (-jA) - j3;
                    long j6 = c0121Gg4.f;
                    long j7 = j5 - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    C2566dc c2566dc = zm.b;
                    if (i == 0) {
                        f = c2566dc.c0;
                    } else if (i == 1) {
                        f = c2566dc.d0;
                    } else {
                        c2566dc.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j4 / (1.0f - f)) + (j7 / f)) : 0L;
                    j = (c0121Gg4.f + ((((long) ((f2 * f) + 0.5f)) + j3) + ((long) (((1.0f - f) * f2) + 0.5f)))) - c0121Gg3.f;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i4;
                    if (zContains) {
                        jB = ZC.b(c0121Gg4, c0121Gg4.f);
                        j2 = c0121Gg4.f + j3;
                    } else if (zContains2) {
                        j2 = (-c0121Gg3.f) + j3;
                        jB = -ZC.a(c0121Gg3, c0121Gg3.f);
                    } else {
                        j = (zm.j() + c0121Gg4.f) - c0121Gg3.f;
                    }
                    j = Math.max(jB, j2);
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                i3 = i4;
                j = 0;
            }
            jMax = Math.max(jMax, j);
            i4 = i3 + 1;
            c2620ec2 = c2620ec;
            size = i2;
            arrayList2 = arrayList;
        }
        return (int) jMax;
    }

    public final void e(ZM zm, int i, ArrayList arrayList) {
        C0121Gg c0121Gg;
        C0121Gg c0121Gg2;
        C0121Gg c0121Gg3;
        Iterator it = zm.h.k.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c0121Gg = zm.i;
            if (!zHasNext) {
                break;
            }
            InterfaceC0053Cg interfaceC0053Cg = (InterfaceC0053Cg) it.next();
            if (interfaceC0053Cg instanceof C0121Gg) {
                c0121Gg3 = (C0121Gg) interfaceC0053Cg;
            } else if (interfaceC0053Cg instanceof ZM) {
                c0121Gg3 = ((ZM) interfaceC0053Cg).h;
            }
            a(c0121Gg3, i, arrayList, null);
        }
        Iterator it2 = c0121Gg.k.iterator();
        while (it2.hasNext()) {
            InterfaceC0053Cg interfaceC0053Cg2 = (InterfaceC0053Cg) it2.next();
            if (interfaceC0053Cg2 instanceof C0121Gg) {
                c0121Gg2 = (C0121Gg) interfaceC0053Cg2;
            } else if (interfaceC0053Cg2 instanceof ZM) {
                c0121Gg2 = ((ZM) interfaceC0053Cg2).i;
            }
            a(c0121Gg2, i, arrayList, null);
        }
        if (i == 1) {
            Iterator it3 = ((EL) zm).k.k.iterator();
            while (it3.hasNext()) {
                InterfaceC0053Cg interfaceC0053Cg3 = (InterfaceC0053Cg) it3.next();
                if (interfaceC0053Cg3 instanceof C0121Gg) {
                    a((C0121Gg) interfaceC0053Cg3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, C2566dc c2566dc) {
        C3417t7 c3417t7 = this.g;
        c3417t7.a = i;
        c3417t7.b = i3;
        c3417t7.c = i2;
        c3417t7.d = i4;
        this.f.b(c2566dc, c3417t7);
        c2566dc.J(c3417t7.e);
        c2566dc.G(c3417t7.f);
        c2566dc.D = c3417t7.h;
        c2566dc.D(c3417t7.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r10 == 3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        r2.m = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        r2.d(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008d, code lost:
    
        if (r8 == 3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r14 = this;
            ec r0 = r14.a
            java.util.ArrayList r0 = r0.p0
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La1
            java.lang.Object r1 = r0.next()
            dc r1 = (defpackage.C2566dc) r1
            boolean r2 = r1.a
            if (r2 == 0) goto L19
            goto L8
        L19:
            int[] r2 = r1.o0
            r3 = 0
            r8 = r2[r3]
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.q
            int r4 = r1.r
            r5 = 2
            r11 = 3
            if (r8 == r5) goto L30
            if (r8 != r11) goto L2e
            if (r2 != r9) goto L2e
            goto L30
        L2e:
            r2 = r3
            goto L31
        L30:
            r2 = r9
        L31:
            if (r10 == r5) goto L37
            if (r10 != r11) goto L38
            if (r4 != r9) goto L38
        L37:
            r3 = r9
        L38:
            Go r4 = r1.d
            Sg r4 = r4.e
            boolean r6 = r4.j
            EL r7 = r1.e
            Sg r7 = r7.e
            boolean r12 = r7.j
            r13 = 1
            if (r6 == 0) goto L57
            if (r12 == 0) goto L57
            int r4 = r4.g
            int r6 = r7.g
            r2 = r14
            r3 = r13
            r5 = r13
            r7 = r1
            r2.f(r3, r4, r5, r6, r7)
        L54:
            r1.a = r9
            goto L90
        L57:
            if (r6 == 0) goto L76
            if (r3 == 0) goto L76
            int r4 = r4.g
            int r6 = r7.g
            r2 = r14
            r3 = r13
            r7 = r1
            r2.f(r3, r4, r5, r6, r7)
            EL r2 = r1.e
            Sg r2 = r2.e
            int r3 = r1.k()
            if (r10 != r11) goto L72
        L6f:
            r2.m = r3
            goto L90
        L72:
            r2.d(r3)
            goto L54
        L76:
            if (r12 == 0) goto L90
            if (r2 == 0) goto L90
            int r4 = r4.g
            int r6 = r7.g
            r2 = r14
            r3 = r5
            r5 = r13
            r7 = r1
            r2.f(r3, r4, r5, r6, r7)
            Go r2 = r1.d
            Sg r2 = r2.e
            int r3 = r1.n()
            if (r8 != r11) goto L72
            goto L6f
        L90:
            boolean r2 = r1.a
            if (r2 == 0) goto L8
            EL r2 = r1.e
            s7 r2 = r2.l
            if (r2 == 0) goto L8
            int r1 = r1.Z
            r2.d(r1)
            goto L8
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0104Fg.g():void");
    }
}
