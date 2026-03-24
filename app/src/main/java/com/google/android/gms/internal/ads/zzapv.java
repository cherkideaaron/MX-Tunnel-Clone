package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzapv implements zzapn {
    final /* synthetic */ zzapx zza;
    private final zzeq zzb;
    private final SparseArray zzc;
    private final SparseIntArray zzd;
    private final int zze;

    public zzapv(zzapx zzapxVar, int i) {
        Objects.requireNonNull(zzapxVar);
        this.zza = zzapxVar;
        this.zzb = new zzeq(new byte[5], 5);
        this.zzc = new SparseArray();
        this.zzd = new SparseIntArray();
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzapn
    public final void zza(zzfg zzfgVar, zzaex zzaexVar, zzaqb zzaqbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzapn
    public final void zzb(zzer zzerVar) {
        zzfg zzfgVar;
        int i;
        zzfg zzfgVar2;
        int i2;
        zzeq zzeqVar;
        int i3;
        if (zzerVar.zzs() == 2) {
            zzapx zzapxVar = this.zza;
            zzfg zzfgVar3 = (zzfg) zzapxVar.zzh().get(0);
            if ((zzerVar.zzs() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                zzerVar.zzk(1);
                int iZzt = zzerVar.zzt();
                int i4 = 3;
                zzerVar.zzk(3);
                zzeq zzeqVar2 = this.zzb;
                zzerVar.zzl(zzeqVar2, 2);
                zzeqVar2.zzh(3);
                int i5 = 13;
                zzapxVar.zzq(zzeqVar2.zzj(13));
                zzerVar.zzl(zzeqVar2, 2);
                int i6 = 4;
                zzeqVar2.zzh(4);
                int i7 = 12;
                zzerVar.zzk(zzeqVar2.zzj(12));
                SparseArray sparseArray = this.zzc;
                sparseArray.clear();
                SparseIntArray sparseIntArray = this.zzd;
                sparseIntArray.clear();
                int iZzd = zzerVar.zzd();
                while (iZzd > 0) {
                    int i8 = 5;
                    zzerVar.zzl(zzeqVar2, 5);
                    int iZzj = zzeqVar2.zzj(8);
                    zzeqVar2.zzh(i4);
                    int iZzj2 = zzeqVar2.zzj(i5);
                    zzeqVar2.zzh(i6);
                    int iZzj3 = zzeqVar2.zzj(i7);
                    int iZzg = zzerVar.zzg();
                    int i9 = iZzg + iZzj3;
                    String str = null;
                    ArrayList arrayList = null;
                    int i10 = -1;
                    int iZzs = 0;
                    while (zzerVar.zzg() < i9) {
                        int iZzs2 = zzerVar.zzs();
                        int iZzg2 = zzerVar.zzg() + zzerVar.zzs();
                        if (iZzg2 > i9) {
                            break;
                        }
                        if (iZzs2 == i8) {
                            long jZzz = zzerVar.zzz();
                            if (jZzz != 1094921523) {
                                if (jZzz != 1161904947) {
                                    if (jZzz != 1094921524) {
                                        if (jZzz == 1212503619) {
                                            i3 = 36;
                                            i10 = i3;
                                        }
                                        zzfgVar2 = zzfgVar3;
                                        i2 = iZzt;
                                        zzeqVar = zzeqVar2;
                                    }
                                    zzfgVar2 = zzfgVar3;
                                    i2 = iZzt;
                                    zzeqVar = zzeqVar2;
                                    i10 = 172;
                                }
                                zzfgVar2 = zzfgVar3;
                                i2 = iZzt;
                                zzeqVar = zzeqVar2;
                                i10 = 135;
                            }
                            zzfgVar2 = zzfgVar3;
                            i2 = iZzt;
                            zzeqVar = zzeqVar2;
                            i10 = 129;
                        } else {
                            if (iZzs2 != 106) {
                                if (iZzs2 != 122) {
                                    if (iZzs2 == 127) {
                                        int iZzs3 = zzerVar.zzs();
                                        if (iZzs3 != 21) {
                                            if (iZzs3 == 14) {
                                                i3 = 136;
                                            } else {
                                                if (iZzs3 == 33) {
                                                    i3 = 139;
                                                }
                                                zzfgVar2 = zzfgVar3;
                                                i2 = iZzt;
                                                zzeqVar = zzeqVar2;
                                            }
                                            i10 = i3;
                                            zzfgVar2 = zzfgVar3;
                                            i2 = iZzt;
                                            zzeqVar = zzeqVar2;
                                        }
                                        zzfgVar2 = zzfgVar3;
                                        i2 = iZzt;
                                        zzeqVar = zzeqVar2;
                                        i10 = 172;
                                    } else if (iZzs2 == 123) {
                                        i3 = 138;
                                        i10 = i3;
                                        zzfgVar2 = zzfgVar3;
                                        i2 = iZzt;
                                        zzeqVar = zzeqVar2;
                                    } else if (iZzs2 == 10) {
                                        String strTrim = zzerVar.zzK(3, StandardCharsets.UTF_8).trim();
                                        iZzs = zzerVar.zzs();
                                        str = strTrim;
                                        zzfgVar2 = zzfgVar3;
                                        i2 = iZzt;
                                        zzeqVar = zzeqVar2;
                                    } else if (iZzs2 == 89) {
                                        ArrayList arrayList2 = new ArrayList();
                                        while (zzerVar.zzg() < iZzg2) {
                                            zzeq zzeqVar3 = zzeqVar2;
                                            String strTrim2 = zzerVar.zzK(3, StandardCharsets.UTF_8).trim();
                                            int iZzs4 = zzerVar.zzs();
                                            zzfg zzfgVar4 = zzfgVar3;
                                            byte[] bArr = new byte[4];
                                            zzerVar.zzm(bArr, 0, 4);
                                            arrayList2.add(new zzapy(strTrim2, iZzs4, bArr));
                                            zzfgVar3 = zzfgVar4;
                                            zzeqVar2 = zzeqVar3;
                                            iZzt = iZzt;
                                        }
                                        zzfgVar2 = zzfgVar3;
                                        i2 = iZzt;
                                        zzeqVar = zzeqVar2;
                                        arrayList = arrayList2;
                                        i10 = 89;
                                    } else {
                                        zzfgVar2 = zzfgVar3;
                                        i2 = iZzt;
                                        zzeqVar = zzeqVar2;
                                        if (iZzs2 == 111) {
                                            i10 = 257;
                                        }
                                    }
                                }
                                zzfgVar2 = zzfgVar3;
                                i2 = iZzt;
                                zzeqVar = zzeqVar2;
                                i10 = 135;
                            }
                            zzfgVar2 = zzfgVar3;
                            i2 = iZzt;
                            zzeqVar = zzeqVar2;
                            i10 = 129;
                        }
                        zzerVar.zzk(iZzg2 - zzerVar.zzg());
                        zzfgVar3 = zzfgVar2;
                        zzeqVar2 = zzeqVar;
                        iZzt = i2;
                        i8 = 5;
                    }
                    zzfg zzfgVar5 = zzfgVar3;
                    int i11 = iZzt;
                    zzeq zzeqVar4 = zzeqVar2;
                    zzerVar.zzh(i9);
                    zzapz zzapzVar = new zzapz(i10, str, iZzs, arrayList, Arrays.copyOfRange(zzerVar.zzi(), iZzg, i9));
                    if (iZzj == 6 || iZzj == 5) {
                        iZzj = zzapzVar.zza;
                    }
                    iZzd -= iZzj3 + 5;
                    if (!zzapxVar.zzk().get(iZzj2)) {
                        zzaqc zzaqcVarZzb = zzapxVar.zzi().zzb(iZzj, zzapzVar);
                        sparseIntArray.put(iZzj2, iZzj2);
                        sparseArray.put(iZzj2, zzaqcVarZzb);
                    }
                    i6 = 4;
                    zzfgVar3 = zzfgVar5;
                    zzeqVar2 = zzeqVar4;
                    iZzt = i11;
                    i4 = 3;
                    i5 = 13;
                    i7 = 12;
                }
                zzfg zzfgVar6 = zzfgVar3;
                int i12 = iZzt;
                int size = sparseIntArray.size();
                int i13 = 0;
                while (i13 < size) {
                    int iKeyAt = sparseIntArray.keyAt(i13);
                    int iValueAt = sparseIntArray.valueAt(i13);
                    zzapxVar.zzk().put(iKeyAt, true);
                    zzapxVar.zzl().put(iValueAt, true);
                    zzaqc zzaqcVar = (zzaqc) sparseArray.valueAt(i13);
                    if (zzaqcVar != null) {
                        i = i12;
                        zzfgVar = zzfgVar6;
                        zzaqcVar.zza(zzfgVar, zzapxVar.zzm(), new zzaqb(i, iKeyAt, 8192));
                        zzapxVar.zzj().put(iValueAt, zzaqcVar);
                    } else {
                        zzfgVar = zzfgVar6;
                        i = i12;
                    }
                    i13++;
                    zzfgVar6 = zzfgVar;
                    i12 = i;
                }
                zzapxVar.zzj().remove(this.zze);
                zzapxVar.zzo(0);
                if (zzapxVar.zzn() == 0) {
                    zzapxVar.zzm().zzv();
                    zzapxVar.zzp(true);
                }
            }
        }
    }
}
