package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public class SI {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(SI.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public AbstractRunnableC0548bj[] a;

    public final void a(AbstractRunnableC0548bj abstractRunnableC0548bj) {
        abstractRunnableC0548bj.e((C0602cj) this);
        AbstractRunnableC0548bj[] abstractRunnableC0548bjArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (abstractRunnableC0548bjArr == null) {
            abstractRunnableC0548bjArr = new AbstractRunnableC0548bj[4];
            this.a = abstractRunnableC0548bjArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= abstractRunnableC0548bjArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(abstractRunnableC0548bjArr, atomicIntegerFieldUpdater.get(this) * 2);
            AbstractC0500aq.l(objArrCopyOf, "copyOf(...)");
            abstractRunnableC0548bjArr = (AbstractRunnableC0548bj[]) objArrCopyOf;
            this.a = abstractRunnableC0548bjArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        abstractRunnableC0548bjArr[i] = abstractRunnableC0548bj;
        abstractRunnableC0548bj.b = i;
        d(i);
    }

    public final void b(AbstractRunnableC0548bj abstractRunnableC0548bj) {
        synchronized (this) {
            if (abstractRunnableC0548bj.b() != null) {
                c(abstractRunnableC0548bj.b);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.AbstractRunnableC0548bj c(int r9) {
        /*
            r8 = this;
            bj[] r0 = r8.a
            defpackage.AbstractC0500aq.j(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.SI.b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.e(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            defpackage.AbstractC0500aq.j(r4)
            r5 = r0[r2]
            defpackage.AbstractC0500aq.j(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.e(r9, r2)
            r8.d(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            bj[] r5 = r8.a
            defpackage.AbstractC0500aq.j(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            defpackage.AbstractC0500aq.j(r6)
            r7 = r5[r4]
            defpackage.AbstractC0500aq.j(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            defpackage.AbstractC0500aq.j(r4)
            r5 = r5[r2]
            defpackage.AbstractC0500aq.j(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.e(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            defpackage.AbstractC0500aq.j(r9)
            r2 = 0
            r9.e(r2)
            r9.b = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.SI.c(int):bj");
    }

    public final void d(int i) {
        while (i > 0) {
            AbstractRunnableC0548bj[] abstractRunnableC0548bjArr = this.a;
            AbstractC0500aq.j(abstractRunnableC0548bjArr);
            int i2 = (i - 1) / 2;
            AbstractRunnableC0548bj abstractRunnableC0548bj = abstractRunnableC0548bjArr[i2];
            AbstractC0500aq.j(abstractRunnableC0548bj);
            AbstractRunnableC0548bj abstractRunnableC0548bj2 = abstractRunnableC0548bjArr[i];
            AbstractC0500aq.j(abstractRunnableC0548bj2);
            if (abstractRunnableC0548bj.compareTo(abstractRunnableC0548bj2) <= 0) {
                return;
            }
            e(i, i2);
            i = i2;
        }
    }

    public final void e(int i, int i2) {
        AbstractRunnableC0548bj[] abstractRunnableC0548bjArr = this.a;
        AbstractC0500aq.j(abstractRunnableC0548bjArr);
        AbstractRunnableC0548bj abstractRunnableC0548bj = abstractRunnableC0548bjArr[i2];
        AbstractC0500aq.j(abstractRunnableC0548bj);
        AbstractRunnableC0548bj abstractRunnableC0548bj2 = abstractRunnableC0548bjArr[i];
        AbstractC0500aq.j(abstractRunnableC0548bj2);
        abstractRunnableC0548bjArr[i] = abstractRunnableC0548bj;
        abstractRunnableC0548bjArr[i2] = abstractRunnableC0548bj2;
        abstractRunnableC0548bj.b = i;
        abstractRunnableC0548bj2.b = i2;
    }
}
