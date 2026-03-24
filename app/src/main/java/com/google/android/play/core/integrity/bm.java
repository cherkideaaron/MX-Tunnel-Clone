package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.AbstractRunnableC3163oP;
import defpackage.RO;

/* loaded from: classes2.dex */
abstract class bm extends AbstractRunnableC3163oP {
    final /* synthetic */ bn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f = bnVar;
    }

    @Override // defpackage.AbstractRunnableC3163oP
    public final void a(Exception exc) {
        if (exc instanceof RO) {
            super.a(bn.k(this.f) ? new StandardIntegrityException(-2, exc) : new StandardIntegrityException(-9, exc));
        } else {
            super.a(exc);
        }
    }
}
