package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzbay extends zzbby {
    private static final zzbbz zzh = new zzbbz();
    private final zzavz zzi;
    private final Context zzj;
    private final zzaye zzk;

    public zzbay(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i, int i2, Context context, zzavs zzavsVar, zzavz zzavzVar, zzaye zzayeVar) {
        super(zzbakVar, "ZQJAB1msowxCz8mqmvl8OKnBprztAFjM8nst6XEIBWdYMrqlQRx5Smd7STWtlGuv", "xxbBAKX4fynezd8sgu9AN42lCipqUqelmvdX3g0EV6w=", zzawgVar, i, 27);
        this.zzj = context;
        this.zzi = zzavzVar;
        this.zzk = zzayeVar;
    }

    private final zzayb zzc() {
        String str;
        int iIntValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdt)).booleanValue() ? ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdz)).intValue() : this.zzi.zzb();
        zzayb zzaybVar = new zzayb((String) this.zze.invoke(null, this.zzj, Boolean.FALSE, ""));
        zzaye zzayeVar = this.zzk;
        if (zzayeVar == null || zzayeVar.zza() == null) {
            str = "E";
        } else {
            try {
                str = (String) zzayeVar.zza().get(iIntValue, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
        }
        zzaybVar.zza = str;
        return zzaybVar;
    }

    private final String zzd() throws ExecutionException, InterruptedException {
        try {
            zzbak zzbakVar = this.zza;
            if (zzbakVar.zzm() != null) {
                zzbakVar.zzm().get();
            }
            zzaxg zzaxgVarZzl = zzbakVar.zzl();
            if (zzaxgVarZzl == null || !zzaxgVarZzl.zza()) {
                return null;
            }
            return zzaxgVarZzl.zzb();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    public final void zza() {
        int i;
        zzayb zzaybVarZzc;
        zzayb zzaybVar;
        zzbbz zzbbzVar = zzh;
        Context context = this.zzj;
        AtomicReference atomicReferenceZza = zzbbzVar.zza(context.getPackageName());
        synchronized (atomicReferenceZza) {
            try {
                zzayb zzaybVar2 = (zzayb) atomicReferenceZza.get();
                if (zzaybVar2 == null || zzban.zzc(zzaybVar2.zza) || zzaybVar2.zza.equals("E") || zzaybVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                    if (zzban.zzc(null)) {
                        zzban.zzc(null);
                        i = 3;
                    } else {
                        i = 5;
                    }
                    if (this.zzk != null) {
                        zzaybVarZzc = zzc();
                    } else {
                        Boolean boolValueOf = Boolean.valueOf(i == 3 && !this.zzi.zza());
                        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdh);
                        String strZzb = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdg)).booleanValue() ? zzb() : null;
                        if (bool.booleanValue() && this.zza.zzi() && zzban.zzc(strZzb)) {
                            strZzb = zzd();
                        }
                        zzayb zzaybVar3 = new zzayb((String) this.zze.invoke(null, context, boolValueOf, strZzb));
                        String str = zzaybVar3.zza;
                        if (zzban.zzc(str) || str.equals("E")) {
                            int i2 = i - 1;
                            if (i2 == 3) {
                                String strZzd = zzd();
                                if (!zzban.zzc(strZzd)) {
                                    zzaybVar3.zza = strZzd;
                                }
                            } else if (i2 == 4) {
                                throw null;
                            }
                        }
                        zzaybVarZzc = zzaybVar3;
                    }
                    atomicReferenceZza.set(zzaybVarZzc);
                }
                zzaybVar = (zzayb) atomicReferenceZza.get();
            } finally {
            }
        }
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            if (zzaybVar != null) {
                try {
                    zzawgVar.zzo(zzaybVar.zza);
                    zzawgVar.zzu(zzaybVar.zzb);
                    zzawgVar.zzt(zzaybVar.zzc);
                    zzawgVar.zzD(zzaybVar.zzd);
                    zzawgVar.zzE(zzaybVar.zze);
                } finally {
                }
            }
        }
    }

    public final String zzb() throws CertificateException {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] bArrZzb = zzban.zzb((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdi));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzb)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzban.zzb((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdj)))));
            }
            Context context = this.zzj;
            return zzbcb.zza(context, context.getPackageName(), arrayList, this.zza.zzd());
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
