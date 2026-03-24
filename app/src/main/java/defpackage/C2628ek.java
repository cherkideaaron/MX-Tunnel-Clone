package defpackage;

import java.io.FileInputStream;

/* renamed from: ek, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2628ek extends AbstractC3547vc {
    public Object a;
    public FileInputStream b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C2683fk d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2628ek(C2683fk c2683fk, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.d = c2683fk;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return C2683fk.a(this.d, this);
    }
}
