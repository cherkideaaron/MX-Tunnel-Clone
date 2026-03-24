package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.AbstractC2739gl;
import defpackage.AbstractC2814i4;
import defpackage.C3663xk;
import defpackage.LP;
import defpackage.Ry;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
abstract class zzaff<ResultT, CallbackT> implements zzafq<ResultT> {
    protected final int zza;
    protected C3663xk zzc;
    protected AbstractC2739gl zzd;
    protected CallbackT zze;
    protected LP zzf;
    protected zzafg<ResultT> zzg;
    protected Executor zzi;
    protected zzahv zzj;
    protected zzahk zzk;
    protected zzagv zzl;
    protected zzaif zzm;
    protected AbstractC2814i4 zzn;
    protected String zzo;
    protected String zzp;
    protected zzaas zzq;
    protected zzahs zzr;
    protected zzahr zzs;
    protected zzair zzt;
    boolean zzu;
    protected final zzafh zzb = new zzafh(this);
    protected final List<Ry> zzh = new ArrayList();

    public static class zza extends LifecycleCallback {
        private final List<Ry> zza;

        private zza(LifecycleFragment lifecycleFragment, List<Ry> list) {
            super(lifecycleFragment);
            this.mLifecycleFragment.addCallback("PhoneAuthActivityStopCallback", this);
            this.zza = list;
        }

        public static void zza(Activity activity, List<Ry> list) {
            LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
            if (((zza) fragment.getCallbackOrNull("PhoneAuthActivityStopCallback", zza.class)) == null) {
                new zza(fragment, list);
            }
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        public void onStop() {
            synchronized (this.zza) {
                this.zza.clear();
            }
        }
    }

    public zzaff(int i) {
        this.zza = i;
    }

    public final zzaff<ResultT, CallbackT> zza(C3663xk c3663xk) {
        this.zzc = (C3663xk) Preconditions.checkNotNull(c3663xk, "firebaseApp cannot be null");
        return this;
    }

    public abstract void zzb();

    public final void zzb(ResultT resultt) {
        this.zzu = true;
        this.zzg.zza(resultt, null);
    }

    public final zzaff<ResultT, CallbackT> zza(AbstractC2739gl abstractC2739gl) {
        this.zzd = (AbstractC2739gl) Preconditions.checkNotNull(abstractC2739gl, "firebaseUser cannot be null");
        return this;
    }

    public final zzaff<ResultT, CallbackT> zza(Ry ry, Activity activity, Executor executor, String str) {
        Ry ryZza = zzagb.zza(str, ry, this);
        synchronized (this.zzh) {
            this.zzh.add((Ry) Preconditions.checkNotNull(ryZza));
        }
        if (activity != null) {
            zza.zza(activity, this.zzh);
        }
        this.zzi = (Executor) Preconditions.checkNotNull(executor);
        return this;
    }

    public final zzaff<ResultT, CallbackT> zza(CallbackT callbackt) {
        this.zze = (CallbackT) Preconditions.checkNotNull(callbackt, "external callback cannot be null");
        return this;
    }

    public final zzaff<ResultT, CallbackT> zza(LP lp) {
        this.zzf = (LP) Preconditions.checkNotNull(lp, "external failure callback cannot be null");
        return this;
    }

    public final void zza(Status status) {
        this.zzu = true;
        this.zzg.zza(null, status);
    }

    public static /* synthetic */ void zza(zzaff zzaffVar) {
        zzaffVar.zzb();
        Preconditions.checkState(zzaffVar.zzu, "no success or failure set on method implementation");
    }

    public static /* synthetic */ void zza(zzaff zzaffVar, Status status) {
        LP lp = zzaffVar.zzf;
        if (lp != null) {
            lp.zza(status);
        }
    }
}
