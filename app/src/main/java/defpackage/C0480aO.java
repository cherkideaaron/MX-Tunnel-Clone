package defpackage;

import androidx.work.impl.WorkDatabase;

/* renamed from: aO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0480aO implements InterfaceC0496am {
    public final InterfaceC3482uI a;
    public final InterfaceC0449Zl b;
    public final C3308r6 c;

    static {
        C3130nt.f("WMFgUpdater");
    }

    public C0480aO(WorkDatabase workDatabase, InterfaceC0449Zl interfaceC0449Zl, InterfaceC3482uI interfaceC3482uI) {
        this.b = interfaceC0449Zl;
        this.a = interfaceC3482uI;
        this.c = workDatabase.n();
    }
}
