package com.google.android.gms.internal.ads;

import defpackage.AbstractC3219pQ;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzhbf {
    private final List zza = new ArrayList();
    private final zzhjr zzb = zzhjr.zza;
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzhbd) it.next()).zzd(false);
        }
    }

    public final zzhbf zza(zzhbd zzhbdVar) {
        if (zzhbdVar.zzh() != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzhbdVar.zzc()) {
            zzc();
        }
        zzhbdVar.zzi(this);
        this.zza.add(zzhbdVar);
        return this;
    }

    public final zzhbk zzb() throws GeneralSecurityException {
        int i;
        char c = 1;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.zzc = true;
        List<zzhbd> list = this.zza;
        ArrayList arrayList = new ArrayList(list.size());
        int i2 = 0;
        while (i2 < list.size() - 1) {
            int i3 = i2 + 1;
            if (((zzhbd) list.get(i2)).zzg() == zzhbe.zza && ((zzhbd) list.get(i3)).zzg() != zzhbe.zza) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i2 = i3;
        }
        HashSet hashSet = new HashSet();
        byte[] bArr = null;
        Integer num = null;
        for (zzhbd zzhbdVar : list) {
            zzhbdVar.zze();
            if (zzhbdVar.zzg() == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            int i4 = 3;
            if (zzhbdVar.zzg() == zzhbe.zza) {
                i = 0;
                while (true) {
                    if (i != 0 && !hashSet.contains(Integer.valueOf(i))) {
                        break;
                    }
                    int i5 = zzhln.zza;
                    i = 0;
                    while (i == 0) {
                        byte[] bArrZza = zzhle.zza(4);
                        i = (bArrZza[3] & 255) | ((bArrZza[0] & 255) << 24) | ((bArrZza[c] & 255) << 16) | ((bArrZza[2] & 255) << 8);
                    }
                }
            } else {
                zzhbdVar.zzg();
                i = 0;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (hashSet.contains(numValueOf)) {
                throw new GeneralSecurityException(AbstractC3219pQ.e(new StringBuilder(String.valueOf(i).length() + 31), "Id ", i, " is used twice in the keyset"));
            }
            hashSet.add(numValueOf);
            zzhaz zzhazVarZzc = zzhjx.zza().zzc(zzhbdVar.zzf(), c != zzhbdVar.zzf().zza() ? null : numValueOf);
            zzhbb zzhbbVarZze = zzhbdVar.zze();
            zzhbb zzhbbVar = zzhbb.zza;
            if (!zzhbbVar.equals(zzhbbVarZze)) {
                if (zzhbb.zzb.equals(zzhbbVarZze)) {
                    i4 = 4;
                } else {
                    if (!zzhbb.zzc.equals(zzhbbVarZze)) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    i4 = 5;
                }
            }
            zzhbi zzhbiVar = new zzhbi(zzhazVarZzc, i4, i, zzhbdVar.zzc(), false, zzhbi.zza, null);
            if (zzhbdVar.zzc()) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (zzhbdVar.zze() != zzhbbVar) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = numValueOf;
            }
            arrayList.add(zzhbiVar);
            c = 1;
        }
        if (num != null) {
            return zzhbk.zzh(new zzhbk(arrayList, this.zzb, bArr));
        }
        throw new GeneralSecurityException("No primary was set");
    }
}
