package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: eE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2604eE {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(C2604eE.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(C2604eE.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(C2604eE.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(C2604eE.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(C2604eE.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int a = 1;
    public final A8 b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public C2604eE(int i) {
        if (i < 0 || i > 1) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        C2714gE c2714gE = new C2714gE(0L, null, 2);
        this.head$volatile = c2714gE;
        this.tail$volatile = c2714gE;
        this._availablePermits$volatile = 1 - i;
        this.b = new A8(this, 1);
    }

    public final void a(Uv uv) {
        Object objU;
        DK dk;
        B8 b8;
        C0579cE c0579cE;
        long j;
        while (true) {
            int andDecrement = g.getAndDecrement(this);
            if (andDecrement <= this.a) {
                DK dk2 = DK.a;
                B8 b82 = uv.a;
                Vv vv = uv.c;
                Object obj = uv.b;
                if (andDecrement > 0) {
                    Vv.h.set(vv, obj);
                    b82.B(dk2, b82.c, new A8(new C3070mo(2, vv, uv), 0));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
                C2714gE c2714gE = (C2714gE) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f.getAndIncrement(this);
                C0579cE c0579cE2 = C0579cE.a;
                long j2 = andIncrement / AbstractC2659fE.f;
                while (true) {
                    objU = AbstractC2883jK.u(c2714gE, j2, c0579cE2);
                    if (!AbstractC3296qu.G(objU)) {
                        ZD zdC = AbstractC3296qu.C(objU);
                        while (true) {
                            ZD zd = (ZD) atomicReferenceFieldUpdater.get(this);
                            c0579cE = c0579cE2;
                            j = j2;
                            dk = dk2;
                            b8 = b82;
                            if (zd.c >= zdC.c) {
                                break;
                            }
                            if (!zdC.j()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, zd, zdC)) {
                                if (atomicReferenceFieldUpdater.get(this) != zd) {
                                    if (zdC.f()) {
                                        zdC.e();
                                    }
                                    dk2 = dk;
                                    c0579cE2 = c0579cE;
                                    j2 = j;
                                    b82 = b8;
                                }
                            }
                            if (zd.f()) {
                                zd.e();
                            }
                        }
                    } else {
                        dk = dk2;
                        b8 = b82;
                        break;
                    }
                    dk2 = dk;
                    c0579cE2 = c0579cE;
                    j2 = j;
                    b82 = b8;
                }
                C2714gE c2714gE2 = (C2714gE) AbstractC3296qu.C(objU);
                int i = (int) (andIncrement % AbstractC2659fE.f);
                AtomicReferenceArray atomicReferenceArray = c2714gE2.e;
                while (!atomicReferenceArray.compareAndSet(i, null, uv)) {
                    if (atomicReferenceArray.get(i) != null) {
                        C3337ri c3337ri = AbstractC2659fE.b;
                        C3337ri c3337ri2 = AbstractC2659fE.c;
                        while (!atomicReferenceArray.compareAndSet(i, c3337ri, c3337ri2)) {
                            B8 b83 = b8;
                            if (atomicReferenceArray.get(i) != c3337ri) {
                                break;
                            } else {
                                b8 = b83;
                            }
                        }
                        Vv.h.set(vv, obj);
                        B8 b84 = b8;
                        b84.B(dk, b84.c, new A8(new C3070mo(2, vv, uv), 0));
                        return;
                    }
                }
                uv.b(c2714gE2, i);
                return;
            }
        }
    }

    public final void b() {
        int i;
        Object objU;
        boolean z;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.a;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            C2714gE c2714gE = (C2714gE) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = d.getAndIncrement(this);
            long j = andIncrement2 / AbstractC2659fE.f;
            C2550dE c2550dE = C2550dE.a;
            while (true) {
                objU = AbstractC2883jK.u(c2714gE, j, c2550dE);
                if (AbstractC3296qu.G(objU)) {
                    break;
                }
                ZD zdC = AbstractC3296qu.C(objU);
                while (true) {
                    ZD zd = (ZD) atomicReferenceFieldUpdater.get(this);
                    if (zd.c >= zdC.c) {
                        break;
                    }
                    if (!zdC.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, zd, zdC)) {
                        if (atomicReferenceFieldUpdater.get(this) != zd) {
                            if (zdC.f()) {
                                zdC.e();
                            }
                        }
                    }
                    if (zd.f()) {
                        zd.e();
                    }
                }
            }
            C2714gE c2714gE2 = (C2714gE) AbstractC3296qu.C(objU);
            c2714gE2.b();
            z = false;
            if (c2714gE2.c <= j) {
                int i3 = (int) (andIncrement2 % AbstractC2659fE.f);
                C3337ri c3337ri = AbstractC2659fE.b;
                AtomicReferenceArray atomicReferenceArray = c2714gE2.e;
                Object andSet = atomicReferenceArray.getAndSet(i3, c3337ri);
                if (andSet == null) {
                    int i4 = AbstractC2659fE.a;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (atomicReferenceArray.get(i3) == AbstractC2659fE.c) {
                            z = true;
                            break;
                        }
                    }
                    C3337ri c3337ri2 = AbstractC2659fE.b;
                    C3337ri c3337ri3 = AbstractC2659fE.d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i3, c3337ri2, c3337ri3)) {
                            if (atomicReferenceArray.get(i3) != c3337ri2) {
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    z = !z;
                } else if (andSet != AbstractC2659fE.e) {
                    if (!(andSet instanceof InterfaceC3742z8)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC3742z8 interfaceC3742z8 = (InterfaceC3742z8) andSet;
                    C3337ri c3337riC = interfaceC3742z8.c(DK.a, this.b);
                    if (c3337riC != null) {
                        interfaceC3742z8.i(c3337riC);
                        z = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z);
    }
}
