package com.google.android.gms.internal.ads;

import defpackage.As;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzgzo extends zzgzq {
    public static As zza(Object obj) {
        return obj == null ? zzgzs.zza : new zzgzs(obj);
    }

    public static As zzb() {
        return zzgzs.zza;
    }

    public static As zzc(Throwable th) {
        th.getClass();
        return new zzgzr(th);
    }

    public static As zzd(Callable callable, Executor executor) {
        zzhan zzhanVar = new zzhan(callable);
        executor.execute(zzhanVar);
        return zzhanVar;
    }

    public static As zze(Runnable runnable, Executor executor) {
        zzhan zzhanVarZze = zzhan.zze(runnable, null);
        executor.execute(zzhanVarZze);
        return zzhanVarZze;
    }

    public static As zzf(zzgyv zzgyvVar, Executor executor) {
        zzhan zzhanVar = new zzhan(zzgyvVar);
        executor.execute(zzhanVar);
        return zzhanVar;
    }

    public static As zzg(As as, Class cls, zzgqt zzgqtVar, Executor executor) {
        int i = zzgyg.zzd;
        zzgyf zzgyfVar = new zzgyf(as, cls, zzgqtVar);
        as.addListener(zzgyfVar, zzhaf.zzd(executor, zzgyfVar));
        return zzgyfVar;
    }

    public static As zzh(As as, Class cls, zzgyw zzgywVar, Executor executor) {
        int i = zzgyg.zzd;
        zzgye zzgyeVar = new zzgye(as, cls, zzgywVar);
        as.addListener(zzgyeVar, zzhaf.zzd(executor, zzgyeVar));
        return zzgyeVar;
    }

    public static As zzi(As as, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return as.isDone() ? as : zzhak.zze(as, j, timeUnit, scheduledExecutorService);
    }

    public static As zzj(As as, zzgyw zzgywVar, Executor executor) {
        int i = zzgyn.zzc;
        zzgyl zzgylVar = new zzgyl(as, zzgywVar);
        as.addListener(zzgylVar, zzhaf.zzd(executor, zzgylVar));
        return zzgylVar;
    }

    public static As zzk(As as, zzgqt zzgqtVar, Executor executor) {
        int i = zzgyn.zzc;
        zzgym zzgymVar = new zzgym(as, zzgqtVar);
        as.addListener(zzgymVar, zzhaf.zzd(executor, zzgymVar));
        return zzgymVar;
    }

    @SafeVarargs
    public static As zzl(As... asArr) {
        return new zzgyx(zzguf.zzr(asArr), true);
    }

    public static As zzm(Iterable iterable) {
        return new zzgyx(zzguf.zzp(iterable), true);
    }

    public static zzgzn zzn(Iterable iterable) {
        return new zzgzn(false, zzguf.zzp(iterable), null);
    }

    @SafeVarargs
    public static zzgzn zzo(As... asArr) {
        return new zzgzn(true, zzguf.zzr(asArr), null);
    }

    public static zzgzn zzp(Iterable iterable) {
        return new zzgzn(true, zzguf.zzp(iterable), null);
    }

    @SafeVarargs
    public static As zzq(As... asArr) {
        return new zzgyx(zzguf.zzr(asArr), false);
    }

    public static void zzr(As as, zzgzl zzgzlVar, Executor executor) {
        zzgzlVar.getClass();
        as.addListener(new zzgzm(as, zzgzlVar), executor);
    }

    public static Object zzs(Future future) {
        if (future.isDone()) {
            return zzhap.zza(future);
        }
        throw new IllegalStateException(zzgrt.zzd("Future was expected to be done: %s", future));
    }

    public static Object zzt(Future future) {
        try {
            return zzhap.zza(future);
        } catch (ExecutionException e) {
            if (e.getCause() instanceof Error) {
                throw new zzgze((Error) e.getCause());
            }
            throw new zzhao(e.getCause());
        }
    }
}
