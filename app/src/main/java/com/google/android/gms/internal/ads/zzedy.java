package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.AbstractC3598wQ;
import defpackage.As;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzedy implements zzefe {
    private static final Pattern zzh = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzecz zza;
    private final zzgzy zzb;
    private final zzfjk zzc;
    private final ScheduledExecutorService zzd;
    private final zzehr zze;
    private final zzfoo zzf;
    private final Context zzg;

    public zzedy(Context context, zzfjk zzfjkVar, zzecz zzeczVar, zzgzy zzgzyVar, ScheduledExecutorService scheduledExecutorService, zzehr zzehrVar, zzfoo zzfooVar) {
        this.zzg = context;
        this.zzc = zzfjkVar;
        this.zza = zzeczVar;
        this.zzb = zzgzyVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzehrVar;
        this.zzf = zzfooVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefe
    public final As zza(zzbzu zzbzuVar) {
        Context context = this.zzg;
        As asZza = this.zza.zza(zzbzuVar);
        zzfoe zzfoeVarA = AbstractC3598wQ.a(context, 11);
        zzfon.zzb(asZza, zzfoeVarA);
        As asZzj = zzgzo.zzj(asZza, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzedx
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj) {
                return this.zza.zzb((zzefg) obj);
            }
        }, this.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgB)).booleanValue()) {
            asZzj = zzgzo.zzh(zzgzo.zzi(asZzj, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgC)).intValue(), TimeUnit.SECONDS, this.zzd), TimeoutException.class, zzedw.zza, zzcei.zzg);
        }
        zzfon.zzd(asZzj, this.zzf, zzfoeVarA);
        zzgzo.zzr(asZzj, new zzedv(this), zzcei.zzg);
        return asZzj;
    }

    public final /* synthetic */ As zzb(zzefg zzefgVar) {
        return zzgzo.zza(new zzfjc(new zzfiz(this.zzc), zzfjb.zza(new InputStreamReader(zzefgVar.zza()), zzefgVar.zzb().zzm)));
    }

    public final /* synthetic */ zzehr zzc() {
        return this.zze;
    }
}
