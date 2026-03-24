package defpackage;

import org.jetbrains.annotations.Nullable;

/* renamed from: bj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC0548bj implements Runnable, Comparable, InterfaceC2680fh {

    @Nullable
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public AbstractRunnableC0548bj(long j) {
        this.a = j;
    }

    public final SI b() {
        Object obj = this._heap;
        if (obj instanceof SI) {
            return (SI) obj;
        }
        return null;
    }

    @Override // defpackage.InterfaceC2680fh
    public final void c() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C3337ri c3337ri = MO.f;
                if (obj == c3337ri) {
                    return;
                }
                C0602cj c0602cj = obj instanceof C0602cj ? (C0602cj) obj : null;
                if (c0602cj != null) {
                    c0602cj.b(this);
                }
                this._heap = c3337ri;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.a - ((AbstractRunnableC0548bj) obj).a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x004c A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:9:0x000b, B:11:0x0010, B:13:0x0014, B:23:0x002b, B:33:0x0043, B:35:0x004c, B:36:0x004e, B:26:0x0030, B:30:0x003a), top: B:45:0x000b, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(long r9, defpackage.C0602cj r11, defpackage.AbstractC2573dj r12) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.Object r0 = r8._heap     // Catch: java.lang.Throwable -> L25
            ri r1 = defpackage.MO.f     // Catch: java.lang.Throwable -> L25
            if (r0 != r1) goto La
            monitor-exit(r8)
            r9 = 2
            return r9
        La:
            monitor-enter(r11)     // Catch: java.lang.Throwable -> L25
            bj[] r0 = r11.a     // Catch: java.lang.Throwable -> L2e
            r1 = 0
            if (r0 == 0) goto L13
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L2e
            goto L14
        L13:
            r0 = 0
        L14:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = defpackage.AbstractC2573dj.m     // Catch: java.lang.Throwable -> L2e
            r12.getClass()     // Catch: java.lang.Throwable -> L2e
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.AbstractC2573dj.o     // Catch: java.lang.Throwable -> L2e
            int r12 = r2.get(r12)     // Catch: java.lang.Throwable -> L2e
            if (r12 == 0) goto L27
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r8)
            r9 = 1
            return r9
        L25:
            r9 = move-exception
            goto L56
        L27:
            r2 = 0
            if (r0 != 0) goto L30
        L2b:
            r11.c = r9     // Catch: java.lang.Throwable -> L2e
            goto L43
        L2e:
            r9 = move-exception
            goto L54
        L30:
            long r4 = r0.a     // Catch: java.lang.Throwable -> L2e
            long r6 = r4 - r9
            int r12 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r12 < 0) goto L39
            goto L3a
        L39:
            r9 = r4
        L3a:
            long r4 = r11.c     // Catch: java.lang.Throwable -> L2e
            long r4 = r9 - r4
            int r12 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r12 <= 0) goto L43
            goto L2b
        L43:
            long r9 = r8.a     // Catch: java.lang.Throwable -> L2e
            long r4 = r11.c     // Catch: java.lang.Throwable -> L2e
            long r9 = r9 - r4
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 >= 0) goto L4e
            r8.a = r4     // Catch: java.lang.Throwable -> L2e
        L4e:
            r11.a(r8)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r8)
            return r1
        L54:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L25
            throw r9     // Catch: java.lang.Throwable -> L25
        L56:
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractRunnableC0548bj.d(long, cj, dj):int");
    }

    public final void e(C0602cj c0602cj) {
        if (this._heap == MO.f) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this._heap = c0602cj;
    }

    public String toString() {
        return "Delayed[nanos=" + this.a + ']';
    }
}
