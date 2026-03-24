package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzfvx {
    private final Context zza;
    private final Executor zzb;
    private final zzfvh zzc;
    private final zzfvw zzd;
    private Task zze;

    public zzfvx(Context context, Executor executor, zzfvh zzfvhVar, zzfvj zzfvjVar, zzfvt zzfvtVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfvhVar;
        this.zzd = zzfvtVar;
    }

    public static zzfvx zza(Context context, Executor executor, zzfvh zzfvhVar, zzfvj zzfvjVar) {
        final zzfvx zzfvxVar = new zzfvx(context, executor, zzfvhVar, zzfvjVar, new zzfvt());
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzfvv
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        };
        Executor executor2 = zzfvxVar.zzb;
        zzfvxVar.zze = Tasks.call(executor2, callable).addOnFailureListener(executor2, new OnFailureListener() { // from class: com.google.android.gms.internal.ads.zzfvu
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final /* synthetic */ void onFailure(Exception exc) {
                this.zza.zzd(exc);
            }
        });
        return zzfvxVar;
    }

    public final zzaxg zzb() {
        zzfvw zzfvwVar = this.zzd;
        Task task = this.zze;
        return !task.isSuccessful() ? zzfvwVar.zza() : (zzaxg) task.getResult();
    }

    public final /* synthetic */ zzaxg zzc() throws PackageManager.NameNotFoundException {
        Context context = this.zza;
        return zzfvo.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    public final /* synthetic */ void zzd(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1L, exc);
    }
}
