package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import defpackage.AbstractBinderC2998lP;
import defpackage.C3108nP;
import defpackage.QO;

/* loaded from: classes2.dex */
final class as extends AbstractBinderC2998lP {
    final TaskCompletionSource a;
    final QO b;
    private final C3108nP c;
    private final String d;
    private final k e;
    private final Activity f;

    public as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, QO qo) {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
        this.c = new C3108nP("RequestDialogCallbackImpl");
        this.d = context.getPackageName();
        this.e = kVar;
        this.a = taskCompletionSource;
        this.f = activity;
        this.b = qo;
    }

    @Override // defpackage.InterfaceC3053mP
    public final void b(Bundle bundle) {
        this.b.d(this.a);
        this.c.b("onRequestDialog(%s)", this.d);
        ApiException apiExceptionA = this.e.a(bundle);
        if (apiExceptionA != null) {
            this.a.trySetException(apiExceptionA);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            C3108nP c3108nP = this.c;
            Object[] objArr = {this.d};
            c3108nP.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", C3108nP.c(c3108nP.a, "onRequestDialog(%s): got null dialog intent", objArr));
            }
            this.a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ar(this, this.b.a()));
        C3108nP c3108nP2 = this.c;
        Object[] objArr2 = new Object[0];
        c3108nP2.getClass();
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", C3108nP.c(c3108nP2.a, "Starting dialog intent...", objArr2));
        }
        this.f.startActivityForResult(intent, 0);
    }
}
