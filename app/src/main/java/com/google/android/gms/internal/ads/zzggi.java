package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import defpackage.As;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final class zzggi extends zzghb {
    private final Map zza;
    private final Context zzb;
    private final zzgcc zzc;
    private final long zzd;
    private final long zze;

    public zzggi(zzawg zzawgVar, zzgfx zzgfxVar, Map map, Context context, zzgcc zzgccVar, zzgbf zzgbfVar, zzgoe zzgoeVar) {
        super("Qx6fKcghp39v3hBS7aGRudr3CfsW9ttl9o6D5CM1a5VL5o9yAVkUDqNE55A7wfv7", "6qdYmVukMTFpVys4cpUndL5YDKVPIertd1vgaMgush0=", zzawgVar, zzgfxVar, zzgoeVar.zza(113));
        this.zzb = context;
        this.zza = map;
        this.zzc = zzgccVar;
        this.zzd = zzgbfVar.zzj();
        this.zze = zzgbfVar.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzghb
    public final void zza(Method method, zzawg zzawgVar) {
        zzaxg zzaxgVar;
        Object[] objArr = (Object[]) method.invoke("", this.zzb, Integer.valueOf(this.zzc.ordinal()));
        objArr.getClass();
        String strZzb = "E";
        try {
            As as = (As) this.zza.get("gs");
            if (as != null && ((Build.VERSION.SDK_INT < 31 || as.isDone()) && (zzaxgVar = (zzaxg) as.get(this.zzd, TimeUnit.MILLISECONDS)) != null && zzaxgVar.zzb().length() > 1)) {
                strZzb = zzaxgVar.zzb();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (strZzb.equals("E")) {
            try {
                As as2 = (As) this.zza.get("ai");
                if (as2 != null) {
                    String str = (String) as2.get(this.zze, TimeUnit.MILLISECONDS);
                    if (!zzgrt.zzc(str)) {
                        strZzb = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr[5];
        synchronized (zzawgVar) {
            try {
                zzawgVar.zzu(((Long) objArr[0]).longValue());
                zzawgVar.zzt((String) objArr[1]);
                zzawgVar.zzD((String) objArr[2]);
                zzawgVar.zzE((String) objArr[3]);
                zzgxa zzgxaVarZzi = zzgxa.zzn().zzi();
                byte[] bArr = (byte[]) objArr[4];
                zzawgVar.zzp(zzgxaVarZzi.zzj(bArr, 0, bArr.length));
                zzawgVar.zzo(strZzb);
                if (bool != null) {
                    zzawgVar.zzai(true != bool.booleanValue() ? 1 : 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
