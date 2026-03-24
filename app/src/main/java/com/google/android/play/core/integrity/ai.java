package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.AbstractBinderC2888jP;
import defpackage.C3108nP;

/* loaded from: classes2.dex */
final class ai extends AbstractBinderC2888jP {
    final /* synthetic */ aj a;
    private final C3108nP b;
    private final TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        this.a = ajVar;
        this.b = new C3108nP("OnRequestIntegrityTokenCallback");
        this.c = taskCompletionSource;
    }

    @Override // defpackage.InterfaceC2943kP
    public final void b(Bundle bundle) {
        this.a.a.d(this.c);
        this.b.b("onRequestIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.a.e.a(bundle);
        if (apiExceptionA != null) {
            this.c.trySetException(apiExceptionA);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        ah ahVar = new ah(this, this.a.c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
