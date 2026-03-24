package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: Aq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC0029Aq extends InterfaceC0134Hc {
    B9 attachChild(E9 e9);

    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    /* synthetic */ boolean cancel(Throwable th);

    CancellationException getCancellationException();

    InterfaceC2877jE getChildren();

    InterfaceC0470aE getOnJoin();

    InterfaceC2680fh invokeOnCompletion(InterfaceC2631en interfaceC2631en);

    InterfaceC2680fh invokeOnCompletion(boolean z, boolean z2, InterfaceC2631en interfaceC2631en);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(InterfaceC3493uc interfaceC3493uc);

    InterfaceC0029Aq plus(InterfaceC0029Aq interfaceC0029Aq);

    boolean start();
}
