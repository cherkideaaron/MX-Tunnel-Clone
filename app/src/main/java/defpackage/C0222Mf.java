package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;

/* renamed from: Mf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0222Mf implements InterfaceC2892jb {
    public final /* synthetic */ int a;
    public final /* synthetic */ KA b;

    public /* synthetic */ C0222Mf(KA ka, int i) {
        this.a = i;
        this.b = ka;
    }

    @Override // defpackage.InterfaceC2892jb
    public final Object d(C2811i1 c2811i1) {
        switch (this.a) {
            case 0:
                return new C0256Of((Context) c2811i1.a(Context.class), ((C3663xk) c2811i1.a(C3663xk.class)).f(), c2811i1.A(C3397so.class), c2811i1.c(C3007lg.class), (Executor) c2811i1.g(this.b));
            default:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(this.b, c2811i1);
        }
    }
}
