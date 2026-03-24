package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.AbstractBinderC2615eP;

/* loaded from: classes2.dex */
class bi extends AbstractBinderC2615eP {
    final TaskCompletionSource a;
    final /* synthetic */ bn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.b = bnVar;
        this.a = taskCompletionSource;
    }

    @Override // defpackage.InterfaceC2670fP
    public final void b(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // defpackage.InterfaceC2670fP
    public void c(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // defpackage.InterfaceC2670fP
    public final void d(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // defpackage.InterfaceC2670fP
    public void e(Bundle bundle) {
        this.b.a.d(this.a);
    }
}
