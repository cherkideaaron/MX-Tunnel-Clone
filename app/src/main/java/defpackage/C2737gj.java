package defpackage;

import android.content.Context;

/* renamed from: gj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2737gj implements InterfaceC0209Lj, InterfaceC0192Kj {
    public final /* synthetic */ int a;
    public final InterfaceC3203pA b;

    public /* synthetic */ C2737gj(InterfaceC3203pA interfaceC3203pA, int i) {
        this.a = i;
        this.b = interfaceC3203pA;
    }

    @Override // defpackage.InterfaceC3203pA
    public final Object get() {
        InterfaceC3203pA interfaceC3203pA = this.b;
        switch (this.a) {
            case 0:
                String packageName = ((Context) interfaceC3203pA.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            case 1:
                C3663xk c3663xk = (C3663xk) interfaceC3203pA.get();
                AbstractC0500aq.m(c3663xk, "firebaseApp");
                HE he = HE.a;
                return HE.a(c3663xk);
            case 2:
                return new Ss((Context) interfaceC3203pA.get());
            default:
                return new QE((PF) interfaceC3203pA.get());
        }
    }
}
