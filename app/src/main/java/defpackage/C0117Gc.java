package defpackage;

import java.io.File;
import java.util.concurrent.CancellationException;

/* renamed from: Gc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0117Gc extends AbstractC3400sr implements InterfaceC2631en {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0117Gc(int i, Object obj, Object obj2) {
        super(1);
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.InterfaceC2631en
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                C3036m8 c3036m8 = (C3036m8) this.b;
                if (th == null) {
                    c3036m8.a(((InterfaceC3117ng) this.c).getCompleted());
                } else if (th instanceof CancellationException) {
                    c3036m8.d = true;
                    C3201p8 c3201p8 = c3036m8.b;
                    if (c3201p8 != null && c3201p8.b.cancel(true)) {
                        c3036m8.a = null;
                        c3036m8.b = null;
                        c3036m8.c = null;
                    }
                } else {
                    c3036m8.b(th);
                }
                return DK.a;
            default:
                boolean zB = AbstractC0500aq.b((String) obj, ((File) this.b).getName());
                DK dk = DK.a;
                if (zB) {
                    Rz rz = (Rz) ((Sz) this.c);
                    Object objH = rz.d.h(dk);
                    if (objH instanceof C2654f9) {
                        Object obj2 = ((C2709g9) AbstractC0136He.I(new C2819i9(rz, dk, null))).a;
                    }
                }
                return dk;
        }
    }
}
