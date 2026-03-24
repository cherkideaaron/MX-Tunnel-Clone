package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.QO;
import defpackage.WO;

/* loaded from: classes2.dex */
final class at {
    private final WO a;
    private final WO b;

    public at(WO wo, WO wo2) {
        this.a = wo;
        this.b = wo2;
    }

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, QO qo) {
        Object objA = this.a.a();
        objA.getClass();
        k kVar = (k) this.b.a();
        kVar.getClass();
        activity.getClass();
        qo.getClass();
        return new as((Context) objA, kVar, activity, taskCompletionSource, qo);
    }
}
