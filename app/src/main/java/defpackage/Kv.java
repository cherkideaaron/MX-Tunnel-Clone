package defpackage;

import java.io.FileInputStream;
import java.nio.channels.FileLock;

/* loaded from: classes.dex */
public final class Kv extends AbstractC3547vc {
    public Vv a;
    public FileInputStream b;
    public FileLock c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Lv f;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kv(Lv lv, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.f = lv;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.m |= Integer.MIN_VALUE;
        return this.f.e(null, this);
    }
}
