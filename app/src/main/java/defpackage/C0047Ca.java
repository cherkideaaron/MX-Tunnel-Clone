package defpackage;

import java.io.Serializable;

/* renamed from: Ca, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0047Ca implements InterfaceC0168Jc, Serializable {
    public final InterfaceC0168Jc a;
    public final InterfaceC0134Hc b;

    public C0047Ca(InterfaceC0134Hc interfaceC0134Hc, InterfaceC0168Jc interfaceC0168Jc) {
        AbstractC0500aq.m(interfaceC0168Jc, "left");
        AbstractC0500aq.m(interfaceC0134Hc, "element");
        this.a = interfaceC0168Jc;
        this.b = interfaceC0134Hc;
    }

    public final boolean equals(Object obj) {
        boolean zB;
        if (this != obj) {
            if (!(obj instanceof C0047Ca)) {
                return false;
            }
            C0047Ca c0047Ca = (C0047Ca) obj;
            c0047Ca.getClass();
            int i = 2;
            C0047Ca c0047Ca2 = c0047Ca;
            int i2 = 2;
            while (true) {
                InterfaceC0168Jc interfaceC0168Jc = c0047Ca2.a;
                c0047Ca2 = interfaceC0168Jc instanceof C0047Ca ? (C0047Ca) interfaceC0168Jc : null;
                if (c0047Ca2 == null) {
                    break;
                }
                i2++;
            }
            C0047Ca c0047Ca3 = this;
            while (true) {
                InterfaceC0168Jc interfaceC0168Jc2 = c0047Ca3.a;
                c0047Ca3 = interfaceC0168Jc2 instanceof C0047Ca ? (C0047Ca) interfaceC0168Jc2 : null;
                if (c0047Ca3 == null) {
                    break;
                }
                i++;
            }
            if (i2 != i) {
                return false;
            }
            C0047Ca c0047Ca4 = this;
            while (true) {
                InterfaceC0134Hc interfaceC0134Hc = c0047Ca4.b;
                if (!AbstractC0500aq.b(c0047Ca.get(interfaceC0134Hc.getKey()), interfaceC0134Hc)) {
                    zB = false;
                    break;
                }
                InterfaceC0168Jc interfaceC0168Jc3 = c0047Ca4.a;
                if (!(interfaceC0168Jc3 instanceof C0047Ca)) {
                    AbstractC0500aq.k(interfaceC0168Jc3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    InterfaceC0134Hc interfaceC0134Hc2 = (InterfaceC0134Hc) interfaceC0168Jc3;
                    zB = AbstractC0500aq.b(c0047Ca.get(interfaceC0134Hc2.getKey()), interfaceC0134Hc2);
                    break;
                }
                c0047Ca4 = (C0047Ca) interfaceC0168Jc3;
            }
            if (!zB) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC0168Jc
    public final Object fold(Object obj, InterfaceC3396sn interfaceC3396sn) {
        return interfaceC3396sn.invoke(this.a.fold(obj, interfaceC3396sn), this.b);
    }

    @Override // defpackage.InterfaceC0168Jc
    public final InterfaceC0134Hc get(InterfaceC0151Ic interfaceC0151Ic) {
        AbstractC0500aq.m(interfaceC0151Ic, "key");
        C0047Ca c0047Ca = this;
        while (true) {
            InterfaceC0134Hc interfaceC0134Hc = c0047Ca.b.get(interfaceC0151Ic);
            if (interfaceC0134Hc != null) {
                return interfaceC0134Hc;
            }
            InterfaceC0168Jc interfaceC0168Jc = c0047Ca.a;
            if (!(interfaceC0168Jc instanceof C0047Ca)) {
                return interfaceC0168Jc.get(interfaceC0151Ic);
            }
            c0047Ca = (C0047Ca) interfaceC0168Jc;
        }
    }

    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode();
    }

    @Override // defpackage.InterfaceC0168Jc
    public final InterfaceC0168Jc minusKey(InterfaceC0151Ic interfaceC0151Ic) {
        AbstractC0500aq.m(interfaceC0151Ic, "key");
        InterfaceC0134Hc interfaceC0134Hc = this.b;
        InterfaceC0134Hc interfaceC0134Hc2 = interfaceC0134Hc.get(interfaceC0151Ic);
        InterfaceC0168Jc interfaceC0168Jc = this.a;
        if (interfaceC0134Hc2 != null) {
            return interfaceC0168Jc;
        }
        InterfaceC0168Jc interfaceC0168JcMinusKey = interfaceC0168Jc.minusKey(interfaceC0151Ic);
        return interfaceC0168JcMinusKey == interfaceC0168Jc ? this : interfaceC0168JcMinusKey == C0021Ai.a ? interfaceC0134Hc : new C0047Ca(interfaceC0134Hc, interfaceC0168JcMinusKey);
    }

    @Override // defpackage.InterfaceC0168Jc
    public final InterfaceC0168Jc plus(InterfaceC0168Jc interfaceC0168Jc) {
        AbstractC0500aq.m(interfaceC0168Jc, "context");
        return interfaceC0168Jc == C0021Ai.a ? this : (InterfaceC0168Jc) interfaceC0168Jc.fold(this, new C0030Ba(1));
    }

    public final String toString() {
        return "[" + ((String) fold("", new C0030Ba(0))) + ']';
    }
}
