package com.google.android.gms.internal.ads;

import defpackage.AbstractC3219pQ;
import defpackage.Vs;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzhbk implements zzhjj {
    private final List zza;
    private final zzhjr zzb;
    private final zzhbk zzc;

    private zzhbk(List list, zzhjr zzhjrVar) throws GeneralSecurityException {
        this.zza = list;
        this.zzb = zzhjrVar;
        if (zzhib.zza.zza()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean zZzd = false;
            while (it.hasNext()) {
                zzhbi zzhbiVar = (zzhbi) it.next();
                if (hashSet.contains(Integer.valueOf(zzhbiVar.zzc()))) {
                    int iZzc = zzhbiVar.zzc();
                    throw new GeneralSecurityException(AbstractC3219pQ.e(new StringBuilder(String.valueOf(iZzc).length() + 121), "KeyID ", iZzc, " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                }
                hashSet.add(Integer.valueOf(zzhbiVar.zzc()));
                zZzd |= zzhbiVar.zzd();
            }
            if (!zZzd) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.zzc = null;
    }

    public static final zzhbk zza(zzhql zzhqlVar) throws GeneralSecurityException {
        if (zzhqlVar == null || zzhqlVar.zzc() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new zzhbk(zzi(zzhqlVar), zzhjr.zza);
    }

    public static final zzhbk zzf(zzhbp zzhbpVar) {
        zzhbf zzhbfVar = new zzhbf();
        zzhbd zzhbdVar = new zzhbd(zzhbpVar, null);
        zzhbdVar.zzb();
        zzhbdVar.zza();
        zzhbfVar.zza(zzhbdVar);
        return zzhbfVar.zzb();
    }

    public static /* synthetic */ zzhbk zzh(final zzhbk zzhbkVar) {
        final zzhjr zzhjrVar = zzhbkVar.zzb;
        if (zzhjrVar.zza()) {
            return zzhbkVar;
        }
        zzhbg zzhbgVar = new zzhbg() { // from class: com.google.android.gms.internal.ads.zzhbj
            @Override // com.google.android.gms.internal.ads.zzhbg
            public final /* synthetic */ void zza(zzhbi zzhbiVar) {
                zzhkb.zza().zzb().zza(this.zza, zzhjrVar, "keyset_handle", "get_key");
            }
        };
        List<zzhbi> list = zzhbkVar.zza;
        ArrayList arrayList = new ArrayList(list.size());
        for (zzhbi zzhbiVar : list) {
            arrayList.add(new zzhbi(zzhbiVar.zzf(), zzhbiVar.zzj(), zzhbiVar.zzg(), zzhbiVar.zzh(), zzhbiVar.zzi(), zzhbgVar, null));
        }
        return new zzhbk(arrayList, zzhjrVar, zzhbkVar);
    }

    private static List zzi(zzhql zzhqlVar) throws GeneralSecurityException {
        zzhaz zzhjoVar;
        boolean z;
        ArrayList arrayList = new ArrayList(zzhqlVar.zzc());
        for (zzhqk zzhqkVar : zzhqlVar.zzb()) {
            int iZzc = zzhqkVar.zzc();
            try {
                zzhlb zzhlbVarZzk = zzk(zzhqkVar);
                zzhkg zzhkgVarZza = zzhkg.zza();
                zzhbt zzhbtVarZza = zzhbt.zza();
                zzhaz zzhjoVar2 = !zzhkgVarZza.zzf(zzhlbVarZzk) ? new zzhjo(zzhlbVarZzk, zzhbtVarZza) : zzhkgVarZza.zzg(zzhlbVarZzk, zzhbtVarZza);
                z = false;
                zzhjoVar = zzhjoVar2;
            } catch (GeneralSecurityException e) {
                if (zzhib.zza.zza()) {
                    throw e;
                }
                zzhjoVar = new zzhjo(zzk(zzhqkVar), zzhbt.zza());
                z = true;
            }
            if (zzhib.zza.zza() && !zzl(zzhqkVar.zzk())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            arrayList.add(new zzhbi(zzhjoVar, zzhqkVar.zzk(), iZzc, iZzc == zzhqlVar.zza(), z, zzhbi.zza, null));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private final zzhbk zzj() {
        zzhbk zzhbkVar = this.zzc;
        return zzhbkVar == null ? this : zzhbkVar;
    }

    private static zzhlb zzk(zzhqk zzhqkVar) {
        return zzhlb.zza(zzhqkVar.zzb().zza(), zzhqkVar.zzb().zzb(), zzhqkVar.zzb().zzc(), zzhqkVar.zzd(), zzhqkVar.zzd() == zzhqy.RAW ? null : Integer.valueOf(zzhqkVar.zzc()));
    }

    private static boolean zzl(int i) {
        int i2 = i - 2;
        return i2 == 1 || i2 == 2 || i2 == 3;
    }

    public final String toString() throws GeneralSecurityException {
        zzhql zzhqlVarZzb = zzb();
        int i = zzhbw.zza;
        zzhqm zzhqmVarZza = zzhqp.zza();
        zzhqmVarZza.zza(zzhqlVarZzb.zza());
        for (zzhqk zzhqkVar : zzhqlVarZzb.zzb()) {
            zzhqn zzhqnVarZza = zzhqo.zza();
            zzhqnVarZza.zza(zzhqkVar.zzb().zza());
            zzhqnVarZza.zzd(zzhqkVar.zzk());
            zzhqnVarZza.zzc(zzhqkVar.zzd());
            zzhqnVarZza.zzb(zzhqkVar.zzc());
            zzhqmVarZza.zzb((zzhqo) zzhqnVarZza.zzbu());
        }
        return ((zzhqp) zzhqmVarZza.zzbu()).toString();
    }

    public final zzhql zzb() throws GeneralSecurityException {
        try {
            zzhqi zzhqiVarZzh = zzhql.zzh();
            for (zzhbi zzhbiVar : this.zza) {
                zzhaz zzhazVarZza = zzhbiVar.zza();
                int iZzj = zzhbiVar.zzj();
                int iZzc = zzhbiVar.zzc();
                zzhlb zzhlbVar = (zzhlb) zzhkg.zza().zzh(zzhazVarZza, zzhlb.class, zzhbt.zza());
                Integer numZzb = zzhazVarZza.zzb();
                if (numZzb != null && numZzb.intValue() != iZzc) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                zzhqj zzhqjVarZze = zzhqk.zze();
                zzhqa zzhqaVarZzd = zzhqc.zzd();
                zzhqaVarZzd.zza(zzhlbVar.zzg());
                zzhqaVarZzd.zzb(zzhlbVar.zzb());
                zzhqaVarZzd.zzc(zzhlbVar.zzc());
                zzhqjVarZze.zzb(zzhqaVarZzd);
                zzhqjVarZze.zze(iZzj);
                zzhqjVarZze.zzc(iZzc);
                zzhqjVarZze.zzd(zzhlbVar.zzd());
                zzhqiVarZzh.zzb((zzhqk) zzhqjVarZze.zzbu());
                if (zzhbiVar.zzd()) {
                    zzhqiVarZzh.zza(zzhbiVar.zzc());
                }
            }
            return (zzhql) zzhqiVarZzh.zzbu();
        } catch (GeneralSecurityException e) {
            throw new zzhlm(e);
        }
    }

    public final zzhbi zzc() {
        for (zzhbi zzhbiVar : this.zza) {
            if (zzhbiVar != null && zzhbiVar.zzd()) {
                if (zzhbiVar.zzb() == zzhbb.zza) {
                    return zzhbiVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    @Override // com.google.android.gms.internal.ads.zzhjj
    public final int zzd() {
        return this.zza.size();
    }

    public final zzhbi zze(int i) {
        if (i < 0 || i >= zzd()) {
            int iZzd = zzd();
            throw new IndexOutOfBoundsException(Vs.n(new StringBuilder(String.valueOf(i).length() + 34 + String.valueOf(iZzd).length()), "Invalid index ", i, " for keyset of size ", iZzd));
        }
        List list = this.zza;
        zzhbi zzhbiVar = (zzhbi) list.get(i);
        if (!zzl(zzhbiVar.zzj())) {
            throw new IllegalStateException(AbstractC3219pQ.e(new StringBuilder(String.valueOf(i).length() + 42), "Keyset-Entry at position ", i, " has wrong status"));
        }
        if (zzhbiVar.zzi()) {
            throw new IllegalStateException(AbstractC3219pQ.e(new StringBuilder(String.valueOf(i).length() + 48), "Keyset-Entry at position ", i, " didn't parse correctly"));
        }
        return (zzhbi) list.get(i);
    }

    public final Object zzg(zzhaw zzhawVar, Class cls) throws GeneralSecurityException {
        if (!(zzhawVar instanceof zzhix)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        zzhix zzhixVar = (zzhix) zzhawVar;
        zzhql zzhqlVarZzb = zzj().zzb();
        int i = zzhbw.zza;
        int iZza = zzhqlVarZzb.zza();
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzhqk zzhqkVar : zzhqlVarZzb.zzb()) {
            if (zzhqkVar.zzk() == 3) {
                if (!zzhqkVar.zza()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzhqkVar.zzc())));
                }
                if (zzhqkVar.zzd() == zzhqy.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzhqkVar.zzc())));
                }
                if (zzhqkVar.zzk() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzhqkVar.zzc())));
                }
                if (zzhqkVar.zzc() == iZza) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                z2 &= zzhqkVar.zzb().zzc() == zzhqb.ASYMMETRIC_PUBLIC;
                i2++;
            }
        }
        if (i2 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        for (int i3 = 0; i3 < zzd(); i3++) {
            List list = this.zza;
            if (((zzhbi) list.get(i3)).zzi() || !zzl(((zzhbi) list.get(i3)).zzj())) {
                String strZza = zzhqlVarZzb.zzd(i3).zzb().zza();
                StringBuilder sb = new StringBuilder(String.valueOf(strZza).length() + String.valueOf(i3).length() + 44 + 32);
                sb.append("Key parsing of key with index ");
                sb.append(i3);
                sb.append(" and type_url ");
                sb.append(strZza);
                sb.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzhixVar.zza(zzj(), this.zzb, cls);
    }

    private zzhbk(List list, zzhjr zzhjrVar, zzhbk zzhbkVar) {
        this.zza = list;
        this.zzb = zzhjrVar;
        this.zzc = zzhbkVar;
    }

    public /* synthetic */ zzhbk(List list, zzhjr zzhjrVar, byte[] bArr) {
        this(list, zzhjrVar);
    }
}
