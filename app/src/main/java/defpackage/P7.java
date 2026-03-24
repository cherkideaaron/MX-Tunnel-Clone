package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class P7 implements IM {
    public Object a = T7.p;
    public B8 b;
    public final /* synthetic */ R7 c;

    public P7(R7 r7) {
        this.c = r7;
    }

    public final Object a(C3232pl c3232pl) throws Throwable {
        C2764h9 c2764h9;
        Object obj;
        C2764h9 c2764h92;
        boolean z = false;
        byte b = 0;
        byte b2 = 0;
        Object obj2 = this.a;
        if (obj2 == T7.p || obj2 == T7.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = R7.n;
            R7 r7 = this.c;
            C2764h9 c2764h93 = (C2764h9) atomicReferenceFieldUpdater.get(r7);
            while (true) {
                r7.getClass();
                if (r7.u(R7.c.get(r7), true)) {
                    this.a = T7.l;
                    Throwable thP = r7.p();
                    if (thP != null) {
                        int i = IG.a;
                        throw thP;
                    }
                } else {
                    long andIncrement = R7.d.getAndIncrement(r7);
                    long j = T7.b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (c2764h93.c != j2) {
                        C2764h9 c2764h9O = r7.o(j2, c2764h93);
                        if (c2764h9O == null) {
                            continue;
                        } else {
                            c2764h9 = c2764h9O;
                        }
                    } else {
                        c2764h9 = c2764h93;
                    }
                    Object objE = r7.E(c2764h9, i2, andIncrement, null);
                    C3337ri c3337ri = T7.m;
                    if (objE == c3337ri) {
                        throw new IllegalStateException("unreachable".toString());
                    }
                    C3337ri c3337ri2 = T7.o;
                    if (objE == c3337ri2) {
                        if (andIncrement < r7.s()) {
                            c2764h9.b();
                        }
                        c2764h93 = c2764h9;
                    } else {
                        if (objE == T7.n) {
                            R7 r72 = this.c;
                            B8 b8C = AbstractC3279qd.C(AbstractC0069Df.C(c3232pl));
                            try {
                                this.b = b8C;
                                C2764h9 c2764h94 = c2764h9;
                                Object objE2 = r72.E(c2764h9, i2, andIncrement, this);
                                if (objE2 == c3337ri) {
                                    b(c2764h94, i2);
                                } else {
                                    InterfaceC3504un o7 = null;
                                    InterfaceC2631en interfaceC2631en = r72.b;
                                    if (objE2 == c3337ri2) {
                                        if (andIncrement < r72.s()) {
                                            c2764h94.b();
                                        }
                                        C2764h9 c2764h95 = (C2764h9) R7.n.get(r72);
                                        while (true) {
                                            if (r72.u(R7.c.get(r72), true)) {
                                                B8 b8 = this.b;
                                                AbstractC0500aq.j(b8);
                                                this.b = null;
                                                this.a = T7.l;
                                                Throwable thP2 = r7.p();
                                                b8.resumeWith(thP2 == null ? Boolean.FALSE : AbstractC0115Ga.n(thP2));
                                            } else {
                                                long andIncrement2 = R7.d.getAndIncrement(r72);
                                                long j3 = T7.b;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (c2764h95.c != j4) {
                                                    C2764h9 c2764h9O2 = r72.o(j4, c2764h95);
                                                    if (c2764h9O2 != null) {
                                                        c2764h92 = c2764h9O2;
                                                    }
                                                } else {
                                                    c2764h92 = c2764h95;
                                                }
                                                Object objE3 = r72.E(c2764h92, i3, andIncrement2, this);
                                                if (objE3 == T7.m) {
                                                    b(c2764h92, i3);
                                                    break;
                                                }
                                                if (objE3 == T7.o) {
                                                    if (andIncrement2 < r72.s()) {
                                                        c2764h92.b();
                                                    }
                                                    c2764h95 = c2764h92;
                                                } else {
                                                    if (objE3 == T7.n) {
                                                        throw new IllegalStateException("unexpected".toString());
                                                    }
                                                    c2764h92.b();
                                                    this.a = objE3;
                                                    this.b = null;
                                                    obj = Boolean.TRUE;
                                                    if (interfaceC2631en != null) {
                                                        o7 = new O7(b2 == true ? 1 : 0, interfaceC2631en, objE3);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        c2764h94.b();
                                        this.a = objE2;
                                        this.b = null;
                                        obj = Boolean.TRUE;
                                        if (interfaceC2631en != null) {
                                            o7 = new O7(b == true ? 1 : 0, interfaceC2631en, objE2);
                                        }
                                    }
                                    b8C.A(obj, o7);
                                }
                                Object objR = b8C.r();
                                EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
                                return objR;
                            } catch (Throwable th) {
                                b8C.z();
                                throw th;
                            }
                        }
                        c2764h9.b();
                        this.a = objE;
                    }
                }
            }
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.IM
    public final void b(ZD zd, int i) {
        B8 b8 = this.b;
        if (b8 != null) {
            b8.b(zd, i);
        }
    }
}
