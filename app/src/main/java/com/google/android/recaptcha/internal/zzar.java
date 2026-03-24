package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.AbstractC3400sr;
import defpackage.DK;
import defpackage.InterfaceC2631en;
import defpackage.InterfaceC3117ng;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
final class zzar extends AbstractC3400sr implements InterfaceC2631en {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ InterfaceC3117ng zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzar(TaskCompletionSource taskCompletionSource, InterfaceC3117ng interfaceC3117ng) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = interfaceC3117ng;
    }

    @Override // defpackage.InterfaceC2631en
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            this.zza.setException((Exception) th);
        } else {
            Throwable completionExceptionOrNull = this.zzb.getCompletionExceptionOrNull();
            if (completionExceptionOrNull == null) {
                this.zza.setResult(this.zzb.getCompleted());
            } else {
                TaskCompletionSource taskCompletionSource = this.zza;
                Exception runtimeExecutionException = completionExceptionOrNull instanceof Exception ? (Exception) completionExceptionOrNull : null;
                if (runtimeExecutionException == null) {
                    runtimeExecutionException = new RuntimeExecutionException(completionExceptionOrNull);
                }
                taskCompletionSource.setException(runtimeExecutionException);
            }
        }
        return DK.a;
    }
}
