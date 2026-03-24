package com.google.android.gms.internal.ads;

import android.util.Base64;
import defpackage.AbstractC3650xO;
import defpackage.SM;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.support_lib_boundary.util.Features;

/* loaded from: classes.dex */
public final class zzclx {
    private String zza;
    private zziff zzb;
    private zzijc zzc;
    private final ScheduledExecutorService zzd;
    private final AtomicBoolean zze = new AtomicBoolean(false);

    public zzclx(zzclk zzclkVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzd = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final void zze() {
        try {
            String strC = AbstractC3650xO.b(Features.GET_VARIATIONS_HEADER) ? SM.c() : null;
            if (strC != null && !strC.isEmpty()) {
                this.zza = strC;
                byte[] bArrDecode = Base64.decode(strC, 10);
                this.zzb = zziff.zzc(bArrDecode, zzibb.zzb());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkk)).booleanValue()) {
                    this.zzc = zzijc.zzc(bArrDecode, zzibb.zzb());
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzki)).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkh)).booleanValue()) {
                        this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclw
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zze();
                            }
                        }, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkj)).intValue(), TimeUnit.MINUTES);
                    }
                }
            }
        } catch (zzicg e) {
            e = e;
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "ChromeVariations");
        } catch (IllegalArgumentException e2) {
            e = e2;
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "ChromeVariations");
        }
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkh)).booleanValue() && !this.zze.getAndSet(true)) {
            zze();
        }
    }

    public final String zzb() {
        zzijc zzijcVar = this.zzc;
        if (zzijcVar != null) {
            return Base64.encodeToString(zzijcVar.zzaN(), 10);
        }
        return null;
    }

    public final String zzc() {
        return this.zza;
    }

    public final zziff zzd() {
        return this.zzb;
    }
}
