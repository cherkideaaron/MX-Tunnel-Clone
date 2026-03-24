package defpackage;

import androidx.fragment.app.l;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: gm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2740gm extends AbstractC2849im {
    public final /* synthetic */ InterfaceC0043Bn a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ O0 c;
    public final /* synthetic */ N0 d;
    public final /* synthetic */ l e;

    public C2740gm(l lVar, InterfaceC0043Bn interfaceC0043Bn, AtomicReference atomicReference, O0 o0, N0 n0) {
        this.e = lVar;
        this.a = interfaceC0043Bn;
        this.b = atomicReference;
        this.c = o0;
        this.d = n0;
    }

    @Override // defpackage.AbstractC2849im
    public final void a() {
        l lVar = this.e;
        this.b.set(((V0) this.a.apply()).d(lVar.generateActivityResultKey(), lVar, this.c, this.d));
    }
}
