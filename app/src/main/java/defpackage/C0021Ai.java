package defpackage;

import java.io.Serializable;

/* renamed from: Ai, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0021Ai implements InterfaceC0168Jc, Serializable {
    public static final C0021Ai a = new C0021Ai();

    @Override // defpackage.InterfaceC0168Jc
    public final InterfaceC0134Hc get(InterfaceC0151Ic interfaceC0151Ic) {
        AbstractC0500aq.m(interfaceC0151Ic, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.InterfaceC0168Jc
    public final InterfaceC0168Jc minusKey(InterfaceC0151Ic interfaceC0151Ic) {
        AbstractC0500aq.m(interfaceC0151Ic, "key");
        return this;
    }

    @Override // defpackage.InterfaceC0168Jc
    public final InterfaceC0168Jc plus(InterfaceC0168Jc interfaceC0168Jc) {
        AbstractC0500aq.m(interfaceC0168Jc, "context");
        return interfaceC0168Jc;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // defpackage.InterfaceC0168Jc
    public final Object fold(Object obj, InterfaceC3396sn interfaceC3396sn) {
        return obj;
    }
}
