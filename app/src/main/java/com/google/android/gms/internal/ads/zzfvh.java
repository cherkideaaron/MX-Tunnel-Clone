package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class zzfvh {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;

    public zzfvh(Context context, Executor executor, Task task, boolean z) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z;
    }

    public static zzfvh zza(final Context context, Executor executor, boolean z) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(z ? new Runnable() { // from class: com.google.android.gms.internal.ads.zzfvd
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                taskCompletionSource.setResult(zzfxd.zzb(context, "GLAS", null));
            }
        } : new Runnable() { // from class: com.google.android.gms.internal.ads.zzfvf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                taskCompletionSource.setResult(zzfxd.zzc());
            }
        });
        return new zzfvh(context, executor, taskCompletionSource.getTask(), z);
    }

    public static void zzg(int i) {
        zzf = i;
    }

    private final Task zzh(final int i, long j, Exception exc, String str, Map map, String str2) {
        if (!this.zze) {
            return this.zzd.continueWith(this.zzc, zzfvg.zza);
        }
        Context context = this.zzb;
        final zzavm zzavmVarZza = zzavq.zza();
        zzavmVarZza.zza(context.getPackageName());
        zzavmVarZza.zzb(j);
        zzavmVarZza.zzg(zzf);
        if (exc != null) {
            int i2 = zzgrz.zza;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            zzavmVarZza.zzc(stringWriter.toString());
            zzavmVarZza.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zzavmVarZza.zze(str2);
        }
        if (str != null) {
            zzavmVarZza.zzf(str);
        }
        return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfve
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ Object then(Task task) {
                if (!task.isSuccessful()) {
                    return Boolean.FALSE;
                }
                int i3 = i;
                zzfxc zzfxcVarZza = ((zzfxd) task.getResult()).zza(((zzavq) zzavmVarZza.zzbu()).zzaN());
                zzfxcVarZza.zzc(i3);
                zzfxcVarZza.zza();
                return Boolean.TRUE;
            }
        });
    }

    public Task zzb(int i, long j) {
        return zzh(i, j, null, null, null, null);
    }

    public Task zzc(int i, long j, Exception exc) {
        return zzh(i, j, exc, null, null, null);
    }

    public final Task zzd(int i, long j, String str, Map map) {
        return zzh(i, j, null, str, null, null);
    }

    public Task zze(int i, String str) {
        return zzh(i, 0L, null, null, null, str);
    }

    public final Task zzf(int i, long j, String str) {
        return zzh(i, j, null, null, null, str);
    }
}
