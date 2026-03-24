package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Q8 extends ZM {
    public final ArrayList k;
    public int l;

    public Q8(C2566dc c2566dc, int i) {
        C2566dc c2566dc2;
        super(c2566dc);
        this.k = new ArrayList();
        this.f = i;
        C2566dc c2566dc3 = this.b;
        while (true) {
            C2566dc c2566dcM = c2566dc3.m(i);
            c2566dc2 = c2566dc3;
            c2566dc3 = c2566dcM;
            if (c2566dc3 == null) {
                break;
            } else {
                i = this.f;
            }
        }
        this.b = c2566dc2;
        int i2 = this.f;
        ZM zm = i2 == 0 ? c2566dc2.d : i2 == 1 ? c2566dc2.e : null;
        ArrayList arrayList = this.k;
        arrayList.add(zm);
        C2566dc c2566dcL = c2566dc2.l(this.f);
        while (c2566dcL != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? c2566dcL.d : i3 == 1 ? c2566dcL.e : null);
            c2566dcL = c2566dcL.l(this.f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ZM zm2 = (ZM) it.next();
            int i4 = this.f;
            if (i4 == 0) {
                zm2.b.b = this;
            } else if (i4 == 1) {
                zm2.b.c = this;
            }
        }
        if (this.f == 0 && ((C2620ec) this.b.S).u0 && arrayList.size() > 1) {
            this.b = ((ZM) arrayList.get(arrayList.size() - 1)).b;
        }
        this.l = this.f == 0 ? this.b.h0 : this.b.i0;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014d  */
    @Override // defpackage.InterfaceC0053Cg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.InterfaceC0053Cg r27) {
        /*
            Method dump skipped, instructions count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Q8.a(Cg):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009f A[PHI: r0 r1
      0x009f: PHI (r0v9 int) = (r0v6 int), (r0v13 int) binds: [B:29:0x009d, B:19:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r1v10 Gg) = (r1v7 Gg), (r1v14 Gg) binds: [B:29:0x009d, B:19:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.ZM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r7 = this;
            java.util.ArrayList r0 = r7.k
            java.util.Iterator r1 = r0.iterator()
        L6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L16
            java.lang.Object r2 = r1.next()
            ZM r2 = (defpackage.ZM) r2
            r2.d()
            goto L6
        L16:
            int r1 = r0.size()
            r2 = 1
            if (r1 >= r2) goto L1e
            return
        L1e:
            r3 = 0
            java.lang.Object r4 = r0.get(r3)
            ZM r4 = (defpackage.ZM) r4
            dc r4 = r4.b
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            ZM r0 = (defpackage.ZM) r0
            dc r0 = r0.b
            int r1 = r7.f
            Gg r5 = r7.i
            Gg r6 = r7.h
            if (r1 != 0) goto L6c
            Jb r1 = r4.H
            Jb r0 = r0.J
            Gg r2 = defpackage.ZM.i(r1, r3)
            int r1 = r1.e()
            dc r4 = r7.m()
            if (r4 == 0) goto L50
            Jb r1 = r4.H
            int r1 = r1.e()
        L50:
            if (r2 == 0) goto L55
            defpackage.ZM.b(r6, r2, r1)
        L55:
            Gg r1 = defpackage.ZM.i(r0, r3)
            int r0 = r0.e()
            dc r2 = r7.n()
            if (r2 == 0) goto L69
            Jb r0 = r2.J
            int r0 = r0.e()
        L69:
            if (r1 == 0) goto La3
            goto L9f
        L6c:
            Jb r1 = r4.I
            Jb r0 = r0.K
            Gg r3 = defpackage.ZM.i(r1, r2)
            int r1 = r1.e()
            dc r4 = r7.m()
            if (r4 == 0) goto L84
            Jb r1 = r4.I
            int r1 = r1.e()
        L84:
            if (r3 == 0) goto L89
            defpackage.ZM.b(r6, r3, r1)
        L89:
            Gg r1 = defpackage.ZM.i(r0, r2)
            int r0 = r0.e()
            dc r2 = r7.n()
            if (r2 == 0) goto L9d
            Jb r0 = r2.K
            int r0 = r0.e()
        L9d:
            if (r1 == 0) goto La3
        L9f:
            int r0 = -r0
            defpackage.ZM.b(r5, r1, r0)
        La3:
            r6.a = r7
            r5.a = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Q8.d():void");
    }

    @Override // defpackage.ZM
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            ((ZM) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // defpackage.ZM
    public final void f() {
        this.c = null;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((ZM) it.next()).f();
        }
    }

    @Override // defpackage.ZM
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = r5.i.f + ((ZM) arrayList.get(i)).j() + j + r5.h.f;
        }
        return j;
    }

    @Override // defpackage.ZM
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((ZM) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final C2566dc m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            C2566dc c2566dc = ((ZM) arrayList.get(i)).b;
            if (c2566dc.f0 != 8) {
                return c2566dc;
            }
            i++;
        }
    }

    public final C2566dc n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C2566dc c2566dc = ((ZM) arrayList.get(size)).b;
            if (c2566dc.f0 != 8) {
                return c2566dc;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ZM zm = (ZM) it.next();
            sb.append("<");
            sb.append(zm);
            sb.append("> ");
        }
        return sb.toString();
    }
}
