package com.google.android.gms.internal.ads;

import defpackage.AbstractC3219pQ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
final class zzwy implements zzwi, zzwh {
    private final zzwi[] zza;
    private final boolean[] zzb;
    private zzwh zzf;
    private zzyn zzg;
    private final ArrayList zzd = new ArrayList();
    private final HashMap zze = new HashMap();
    private zzye zzi = new zzvu(zzguf.zzi(), zzguf.zzi());
    private final IdentityHashMap zzc = new IdentityHashMap();
    private zzwi[] zzh = new zzwi[0];

    public zzwy(zzvv zzvvVar, long[] jArr, zzwi... zzwiVarArr) {
        this.zza = zzwiVarArr;
        this.zzb = new boolean[zzwiVarArr.length];
        for (int i = 0; i < zzwiVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.zzb[i] = true;
                this.zza[i] = new zzyk(zzwiVarArr[i], j);
            }
        }
    }

    public final zzwi zza(int i) {
        return this.zzb[i] ? ((zzyk) this.zza[i]).zza() : this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzb(zzwh zzwhVar, long j) {
        this.zzf = zzwhVar;
        ArrayList arrayList = this.zzd;
        zzwi[] zzwiVarArr = this.zza;
        Collections.addAll(arrayList, zzwiVarArr);
        for (zzwi zzwiVar : zzwiVarArr) {
            zzwiVar.zzb(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzc() {
        int i = 0;
        while (true) {
            zzwi[] zzwiVarArr = this.zza;
            if (i >= zzwiVarArr.length) {
                return;
            }
            zzwiVarArr[i].zzc();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzyn zzd() {
        zzyn zzynVar = this.zzg;
        zzynVar.getClass();
        return zzynVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zze(zzaac[] zzaacVarArr, boolean[] zArr, zzyc[] zzycVarArr, boolean[] zArr2, long j) {
        int length;
        ArrayList arrayList;
        int length2 = zzaacVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = zzaacVarArr.length;
            if (i2 >= length) {
                break;
            }
            zzyc zzycVar = zzycVarArr[i2];
            Integer num = zzycVar == null ? null : (Integer) this.zzc.get(zzycVar);
            iArr[i2] = num == null ? -1 : num.intValue();
            zzaac zzaacVar = zzaacVarArr[i2];
            if (zzaacVar != null) {
                String str = zzaacVar.zza().zzb;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        IdentityHashMap identityHashMap = this.zzc;
        identityHashMap.clear();
        zzwi[] zzwiVarArr = this.zza;
        zzyc[] zzycVarArr2 = new zzyc[length];
        zzyc[] zzycVarArr3 = new zzyc[length];
        zzaac[] zzaacVarArr2 = new zzaac[length];
        ArrayList arrayList2 = new ArrayList(zzwiVarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < zzwiVarArr.length) {
            int i4 = i;
            while (i4 < zzaacVarArr.length) {
                zzycVarArr3[i4] = iArr[i4] == i3 ? zzycVarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    zzaac zzaacVar2 = zzaacVarArr[i4];
                    zzaacVar2.getClass();
                    arrayList = arrayList2;
                    zzbg zzbgVar = (zzbg) this.zze.get(zzaacVar2.zza());
                    zzbgVar.getClass();
                    zzaacVarArr2[i4] = new zzwx(zzaacVar2, zzbgVar);
                } else {
                    arrayList = arrayList2;
                    zzaacVarArr2[i4] = null;
                }
                i4++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            int i5 = i3;
            zzaac[] zzaacVarArr3 = zzaacVarArr2;
            zzyc[] zzycVarArr4 = zzycVarArr3;
            long jZze = zzwiVarArr[i3].zze(zzaacVarArr2, zArr, zzycVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jZze;
            } else if (jZze != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < zzaacVarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    zzyc zzycVar2 = zzycVarArr4[i6];
                    zzycVar2.getClass();
                    zzycVarArr2[i6] = zzycVar2;
                    identityHashMap.put(zzycVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    zzgrc.zzi(zzycVarArr4[i6] == null);
                }
            }
            if (z) {
                arrayList3.add(zzwiVarArr[i5]);
            }
            i3 = i5 + 1;
            arrayList2 = arrayList3;
            zzaacVarArr2 = zzaacVarArr3;
            zzycVarArr3 = zzycVarArr4;
            i = 0;
        }
        int i7 = i;
        ArrayList arrayList4 = arrayList2;
        System.arraycopy(zzycVarArr2, i7, zzycVarArr, i7, length);
        this.zzh = (zzwi[]) arrayList4.toArray(new zzwi[i7]);
        this.zzi = new zzvu(arrayList4, zzgvf.zzc(arrayList4, zzww.zza));
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzf(long j, boolean z) {
        for (zzwi zzwiVar : this.zzh) {
            zzwiVar.zzf(j, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final void zzg(long j) {
        this.zzi.zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzh() {
        long j = -9223372036854775807L;
        for (zzwi zzwiVar : this.zzh) {
            long jZzh = zzwiVar.zzh();
            if (jZzh == -9223372036854775807L) {
                if (j != -9223372036854775807L && zzwiVar.zzj(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (zzwi zzwiVar2 : this.zzh) {
                    if (zzwiVar2 == zzwiVar) {
                        break;
                    }
                    if (zzwiVar2.zzj(jZzh) != jZzh) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jZzh;
            } else if (jZzh != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzi() {
        return this.zzi.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzj(long j) {
        long jZzj = this.zzh[0].zzj(j);
        int i = 1;
        while (true) {
            zzwi[] zzwiVarArr = this.zzh;
            if (i >= zzwiVarArr.length) {
                return jZzj;
            }
            if (zzwiVarArr[i].zzj(jZzj) != jZzj) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzk(long j, zzmt zzmtVar) {
        zzwi[] zzwiVarArr = this.zzh;
        return (zzwiVarArr.length > 0 ? zzwiVarArr[0] : this.zza[0]).zzk(j, zzmtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzl() {
        return this.zzi.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzm(zzll zzllVar) {
        ArrayList arrayList = this.zzd;
        if (arrayList.isEmpty()) {
            return this.zzi.zzm(zzllVar);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zzwi) arrayList.get(i)).zzm(zzllVar);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzn() {
        return this.zzi.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final void zzp(zzwi zzwiVar) {
        ArrayList arrayList = this.zzd;
        arrayList.remove(zzwiVar);
        if (arrayList.isEmpty()) {
            zzwi[] zzwiVarArr = this.zza;
            int i = 0;
            for (zzwi zzwiVar2 : zzwiVarArr) {
                i += zzwiVar2.zzd().zzb;
            }
            zzbg[] zzbgVarArr = new zzbg[i];
            int i2 = 0;
            for (int i3 = 0; i3 < zzwiVarArr.length; i3++) {
                zzyn zzynVarZzd = zzwiVarArr[i3].zzd();
                int i4 = zzynVarZzd.zzb;
                int i5 = 0;
                while (i5 < i4) {
                    zzbg zzbgVarZza = zzynVarZzd.zza(i5);
                    int i6 = zzbgVarZza.zza;
                    zzv[] zzvVarArr = new zzv[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        zzv zzvVarZza = zzbgVarZza.zza(i7);
                        zzt zztVarZza = zzvVarZza.zza();
                        String str = zzvVarZza.zza;
                        if (str == null) {
                            str = "";
                        }
                        zzwi[] zzwiVarArr2 = zzwiVarArr;
                        StringBuilder sb = new StringBuilder(str.length() + AbstractC3219pQ.a(i3, 1));
                        sb.append(i3);
                        sb.append(":");
                        sb.append(str);
                        zztVarZza.zza(sb.toString());
                        zzvVarArr[i7] = zztVarZza.zzM();
                        i7++;
                        zzwiVarArr = zzwiVarArr2;
                    }
                    zzwi[] zzwiVarArr3 = zzwiVarArr;
                    String str2 = zzbgVarZza.zzb;
                    StringBuilder sb2 = new StringBuilder(AbstractC3219pQ.a(i3, 1) + String.valueOf(str2).length());
                    sb2.append(i3);
                    sb2.append(":");
                    sb2.append(str2);
                    zzbg zzbgVar = new zzbg(sb2.toString(), zzvVarArr);
                    this.zze.put(zzbgVar, zzbgVarZza);
                    zzbgVarArr[i2] = zzbgVar;
                    i5++;
                    i2++;
                    zzwiVarArr = zzwiVarArr3;
                }
            }
            this.zzg = new zzyn(zzbgVarArr);
            zzwh zzwhVar = this.zzf;
            zzwhVar.getClass();
            zzwhVar.zzp(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final /* bridge */ /* synthetic */ void zzs(zzye zzyeVar) {
        zzwh zzwhVar = this.zzf;
        zzwhVar.getClass();
        zzwhVar.zzs(this);
    }
}
