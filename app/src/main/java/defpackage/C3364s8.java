package defpackage;

import java.util.concurrent.Future;

/* renamed from: s8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3364s8 implements InterfaceC3418t8 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C3364s8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC3418t8
    public final void a(Throwable th) {
        switch (this.a) {
            case 0:
                ((Future) this.b).cancel(false);
                break;
            case 1:
                ((InterfaceC2631en) this.b).invoke(th);
                break;
            default:
                ((InterfaceC2680fh) this.b).c();
                break;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "CancelFutureOnCancel[" + ((Future) this.b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((InterfaceC2631en) this.b).getClass().getSimpleName() + '@' + AbstractC0069Df.u(this) + ']';
            default:
                return "DisposeOnCancel[" + ((InterfaceC2680fh) this.b) + ']';
        }
    }
}
