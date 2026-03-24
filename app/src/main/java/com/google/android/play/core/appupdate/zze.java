package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zze extends ResultReceiver {
    final /* synthetic */ TaskCompletionSource zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zze(zzg zzgVar, Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.zza = taskCompletionSource;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        TaskCompletionSource taskCompletionSource;
        int i2 = 1;
        if (i == 1) {
            taskCompletionSource = this.zza;
            i2 = -1;
        } else if (i != 2) {
            taskCompletionSource = this.zza;
        } else {
            taskCompletionSource = this.zza;
            i2 = 0;
        }
        taskCompletionSource.trySetResult(Integer.valueOf(i2));
    }
}
