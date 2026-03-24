package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: tf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3442tf extends AbstractC3400sr implements InterfaceC3396sn {
    public static final C3442tf a = new C3442tf(2);

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        Uu uu = (Uu) obj;
        Throwable cancellationException = (Throwable) obj2;
        AbstractC0500aq.m(uu, "msg");
        if (cancellationException == null) {
            cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        ((C0166Ja) uu.b).S(cancellationException);
        return DK.a;
    }
}
