package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.InterfaceC3117ng;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzas {
    @NotNull
    public static final Task zza(@NotNull InterfaceC3117ng interfaceC3117ng) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        interfaceC3117ng.invokeOnCompletion(new zzar(taskCompletionSource, interfaceC3117ng));
        return taskCompletionSource.getTask();
    }
}
