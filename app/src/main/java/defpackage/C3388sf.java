package defpackage;

import java.io.File;

/* renamed from: sf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3388sf extends AbstractC3400sr implements InterfaceC2631en {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3388sf(Object obj, int i) {
        super(1);
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC2631en
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                C3658xf c3658xf = (C3658xf) this.b;
                if (th != null) {
                    c3658xf.h.M(new C3286qk(th));
                }
                if (c3658xf.j.b != C0360Uh.n) {
                    ((C3011lk) c3658xf.j.getValue()).close();
                }
                return DK.a;
            default:
                File file = (File) obj;
                AbstractC0500aq.m(file, "it");
                return new Lv(((InterfaceC0304Rc) this.b).g(), file);
        }
    }
}
