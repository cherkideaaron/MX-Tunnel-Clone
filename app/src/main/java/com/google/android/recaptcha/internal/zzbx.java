package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import defpackage.AbstractC3279qd;
import defpackage.C0166Ja;
import defpackage.C0267Oq;
import defpackage.InterfaceC0029Aq;
import defpackage.InterfaceC3117ng;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzbx {
    @NotNull
    public static final InterfaceC3117ng zza(@NotNull Task task) {
        final C0166Ja c0166JaA = AbstractC3279qd.a();
        task.addOnCompleteListener(zzbv.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzbu
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                InterfaceC0029Aq interfaceC0029Aq = c0166JaA;
                Exception exception = task2.getException();
                if (exception != null) {
                    ((C0166Ja) interfaceC0029Aq).S(exception);
                } else if (task2.isCanceled()) {
                    ((C0267Oq) interfaceC0029Aq).cancel((CancellationException) null);
                } else {
                    ((C0166Ja) interfaceC0029Aq).E(task2.getResult());
                }
            }
        });
        return new zzbw(c0166JaA);
    }
}
