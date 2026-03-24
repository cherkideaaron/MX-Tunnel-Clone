package defpackage;

import java.io.FileOutputStream;

/* renamed from: ok, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3176ok extends AbstractC3547vc {
    public FileOutputStream a;
    public FileOutputStream b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C3231pk d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3176ok(C3231pk c3231pk, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.d = c3231pk;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(this, null);
    }
}
