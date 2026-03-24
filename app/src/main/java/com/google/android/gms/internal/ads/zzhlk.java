package com.google.android.gms.internal.ads;

import defpackage.Vs;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzhlk {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public /* synthetic */ zzhlk(zzhlh zzhlhVar, byte[] bArr) {
        this.zza = new HashMap(zzhlhVar.zze());
        this.zzb = new HashMap(zzhlhVar.zzf());
        this.zzc = new HashMap(zzhlhVar.zzg());
        this.zzd = new HashMap(zzhlhVar.zzh());
    }

    public final boolean zza(zzhlg zzhlgVar) {
        return this.zzb.containsKey(new zzhli(zzhlgVar.getClass(), zzhlgVar.zzf(), null));
    }

    public final zzhaz zzb(zzhlg zzhlgVar, zzhbt zzhbtVar) throws GeneralSecurityException {
        zzhli zzhliVar = new zzhli(zzhlgVar.getClass(), zzhlgVar.zzf(), null);
        Map map = this.zzb;
        if (map.containsKey(zzhliVar)) {
            return ((zzhjf) map.get(zzhliVar)).zza(zzhlgVar, zzhbtVar);
        }
        String string = zzhliVar.toString();
        throw new GeneralSecurityException(Vs.o(new StringBuilder(string.length() + 47), "No Key Parser for requested key type ", string, " available"));
    }

    public final zzhlg zzc(zzhaz zzhazVar, Class cls, zzhbt zzhbtVar) throws GeneralSecurityException {
        zzhlj zzhljVar = new zzhlj(zzhazVar.getClass(), cls, null);
        Map map = this.zza;
        if (map.containsKey(zzhljVar)) {
            return ((zzhji) map.get(zzhljVar)).zza(zzhazVar, zzhbtVar);
        }
        String string = zzhljVar.toString();
        throw new GeneralSecurityException(Vs.o(new StringBuilder(string.length() + 32), "No Key serializer for ", string, " available"));
    }

    public final boolean zzd(zzhlg zzhlgVar) {
        return this.zzd.containsKey(new zzhli(zzhlgVar.getClass(), zzhlgVar.zzf(), null));
    }

    public final zzhbp zze(zzhlg zzhlgVar) throws GeneralSecurityException {
        zzhli zzhliVar = new zzhli(zzhlgVar.getClass(), zzhlgVar.zzf(), null);
        Map map = this.zzd;
        if (map.containsKey(zzhliVar)) {
            return ((zzhkk) map.get(zzhliVar)).zza(zzhlgVar);
        }
        String string = zzhliVar.toString();
        throw new GeneralSecurityException(Vs.o(new StringBuilder(string.length() + 54), "No Parameters Parser for requested key type ", string, " available"));
    }

    public final zzhlg zzf(zzhbp zzhbpVar, Class cls) throws GeneralSecurityException {
        zzhlj zzhljVar = new zzhlj(zzhbpVar.getClass(), cls, null);
        Map map = this.zzc;
        if (map.containsKey(zzhljVar)) {
            return ((zzhkn) map.get(zzhljVar)).zza(zzhbpVar);
        }
        String string = zzhljVar.toString();
        throw new GeneralSecurityException(Vs.o(new StringBuilder(string.length() + 39), "No Key Format serializer for ", string, " available"));
    }

    public final /* synthetic */ Map zzg() {
        return this.zza;
    }

    public final /* synthetic */ Map zzh() {
        return this.zzb;
    }

    public final /* synthetic */ Map zzi() {
        return this.zzc;
    }

    public final /* synthetic */ Map zzj() {
        return this.zzd;
    }
}
