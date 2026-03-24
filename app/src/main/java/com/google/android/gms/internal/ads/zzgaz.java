package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import defpackage.As;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class zzgaz {
    private final zzgdf zza;
    private final zzgeg zzb;
    private final zzgmz zzc;
    private final zzgoe zzd;
    private final zzgcl zze;
    private final long zzf;
    private final zzika zzg;
    private final long zzh;
    private final long zzi = System.currentTimeMillis();
    private final boolean zzj;
    private final long zzk;

    public zzgaz(zzgdf zzgdfVar, zzgeg zzgegVar, zzgmz zzgmzVar, zzgoe zzgoeVar, zzgcl zzgclVar, zzika zzikaVar, zzgbf zzgbfVar) {
        this.zza = zzgdfVar;
        this.zzb = zzgegVar;
        this.zzc = zzgmzVar;
        this.zzd = zzgoeVar;
        this.zze = zzgclVar;
        this.zzf = zzgbfVar.zzh();
        this.zzg = zzikaVar;
        this.zzh = zzgbfVar.zzg();
        this.zzj = zzgbfVar.zzq();
        this.zzk = zzgbfVar.zzp();
    }

    public final As zza() {
        return this.zza.zza();
    }

    public final String zzb(final Context context) {
        String string;
        boolean z = false;
        if (this.zzj) {
            if (System.currentTimeMillis() - this.zzi <= this.zzk) {
                z = true;
            }
        }
        zzgoc zzgocVarZza = this.zzd.zza(3);
        try {
            try {
                try {
                    zzgocVarZza.zza();
                    string = (String) zzgzo.zzj(this.zza.zzb(), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgay
                        @Override // com.google.android.gms.internal.ads.zzgyw
                        public final /* synthetic */ As zza(Object obj) {
                            return this.zza.zzg(context, (Void) obj);
                        }
                    }, zzhaf.zza()).get(z ? this.zzh : this.zzf, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    zzgocVarZza.zzb(e);
                    string = "";
                } catch (ExecutionException e2) {
                    e = e2;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    zzgocVarZza.zzb(e);
                    string = Integer.toString(3);
                }
            } catch (TimeoutException unused) {
                if (z) {
                    string = ((zzghi) this.zzg.zzb()).zza(true, this.zzi);
                } else {
                    this.zzd.zzb(56);
                    string = Integer.toString(17);
                }
            } catch (Throwable th) {
                zzgocVarZza.zzb(th);
                throw th;
            }
            zzgocVarZza.zzc();
            this.zze.zzb();
            return string;
        } catch (Throwable th2) {
            zzgocVarZza.zzc();
            this.zze.zzb();
            throw th2;
        }
    }

    public final String zzc(final Context context, String str, final View view, final Activity activity) {
        String string;
        zzgoc zzgocVarZza = this.zzd.zza(4);
        try {
            try {
                try {
                    try {
                        zzgocVarZza.zza();
                        final String str2 = null;
                        string = (String) zzgzo.zzj(this.zza.zzb(), new zzgyw(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzgaw
                            private final /* synthetic */ Context zzb;
                            private final /* synthetic */ View zzc;
                            private final /* synthetic */ Activity zzd;

                            {
                                this.zzc = view;
                                this.zzd = activity;
                            }

                            @Override // com.google.android.gms.internal.ads.zzgyw
                            public final /* synthetic */ As zza(Object obj) {
                                return this.zza.zzh(this.zzb, null, this.zzc, this.zzd, (Void) obj);
                            }
                        }, zzhaf.zza()).get(this.zzf, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        zzgocVarZza.zzb(e);
                        string = "";
                    } catch (TimeoutException unused) {
                        this.zzd.zzb(57);
                        string = Integer.toString(17);
                    }
                } catch (ExecutionException e2) {
                    e = e2;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    zzgocVarZza.zzb(e);
                    string = Integer.toString(3);
                }
                zzgocVarZza.zzc();
                this.zze.zzb();
                return string;
            } catch (Throwable th) {
                zzgocVarZza.zzb(th);
                throw th;
            }
        } catch (Throwable th2) {
            zzgocVarZza.zzc();
            this.zze.zzb();
            throw th2;
        }
    }

    public final String zzd(final Context context, final String str, final View view, Activity activity) {
        String string;
        zzgoc zzgocVarZza = this.zzd.zza(5);
        try {
            try {
                try {
                    try {
                        zzgocVarZza.zza();
                        final Activity activity2 = null;
                        string = (String) zzgzo.zzj(this.zza.zzb(), new zzgyw(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzgax
                            private final /* synthetic */ Context zzb;
                            private final /* synthetic */ String zzc;
                            private final /* synthetic */ View zzd;

                            @Override // com.google.android.gms.internal.ads.zzgyw
                            public final /* synthetic */ As zza(Object obj) {
                                return this.zza.zzi(this.zzb, this.zzc, this.zzd, null, (Void) obj);
                            }
                        }, zzhaf.zza()).get(this.zzf, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        zzgocVarZza.zzb(e);
                        string = "";
                    } catch (TimeoutException unused) {
                        this.zzd.zzb(58);
                        string = Integer.toString(17);
                    }
                } catch (ExecutionException e2) {
                    e = e2;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    zzgocVarZza.zzb(e);
                    string = Integer.toString(3);
                }
                zzgocVarZza.zzc();
                this.zze.zzb();
                return string;
            } catch (Throwable th) {
                zzgocVarZza.zzb(th);
                throw th;
            }
        } catch (Throwable th2) {
            zzgocVarZza.zzc();
            this.zze.zzb();
            throw th2;
        }
    }

    public final void zze(List list) {
        this.zzc.zza(list);
    }

    public final void zzf(InputEvent inputEvent) {
        this.zzb.zze(inputEvent);
    }

    public final /* synthetic */ As zzg(Context context, Void r2) {
        return this.zzb.zzb(context);
    }

    public final /* synthetic */ As zzh(Context context, String str, View view, Activity activity, Void r5) {
        return this.zzb.zzc(context, null, view, activity);
    }

    public final /* synthetic */ As zzi(Context context, String str, View view, Activity activity, Void r5) {
        return this.zzb.zzd(context, str, view, null);
    }

    public final int zzj() {
        return this.zzb.zzh();
    }
}
