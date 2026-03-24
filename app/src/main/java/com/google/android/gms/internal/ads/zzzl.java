package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzzl extends zzbl {
    public static final zzzl zzJ = new zzzl(new zzzk());
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final boolean zzV;
    public final boolean zzW;
    public final boolean zzX;
    public final boolean zzY;
    private final SparseArray zzZ;
    private final SparseBooleanArray zzaa;

    static {
        String str = zzfj.zza;
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    private zzzl(zzzk zzzkVar) {
        super(zzzkVar);
        this.zzK = zzzkVar.zzz();
        this.zzL = false;
        this.zzM = zzzkVar.zzA();
        this.zzN = false;
        this.zzO = zzzkVar.zzB();
        this.zzP = false;
        this.zzQ = false;
        this.zzR = false;
        this.zzS = false;
        this.zzT = zzzkVar.zzC();
        this.zzU = zzzkVar.zzD();
        this.zzV = zzzkVar.zzE();
        this.zzW = false;
        this.zzX = zzzkVar.zzF();
        this.zzY = false;
        this.zzZ = zzzkVar.zzG();
        this.zzaa = zzzkVar.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzl.class == obj.getClass()) {
            zzzl zzzlVar = (zzzl) obj;
            if (super.equals(zzzlVar) && this.zzK == zzzlVar.zzK && this.zzM == zzzlVar.zzM && this.zzO == zzzlVar.zzO && this.zzT == zzzlVar.zzT && this.zzU == zzzlVar.zzU && this.zzV == zzzlVar.zzV && this.zzX == zzzlVar.zzX) {
                SparseBooleanArray sparseBooleanArray = this.zzaa;
                SparseBooleanArray sparseBooleanArray2 = zzzlVar.zzaa;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.zzZ;
                            SparseArray sparseArray2 = zzzlVar.zzZ;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzyn zzynVar = (zzyn) entry.getKey();
                                                if (!map2.containsKey(zzynVar) || !Objects.equals(entry.getValue(), map2.get(zzynVar))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.zzK ? 1 : 0)) * 961) + (this.zzM ? 1 : 0)) * 961) + (this.zzO ? 1 : 0)) * 28629151) + (this.zzT ? 1 : 0)) * 31) + (this.zzU ? 1 : 0)) * 31) + (this.zzV ? 1 : 0)) * 961) + (this.zzX ? 1 : 0)) * 31;
    }

    public final boolean zza(int i) {
        return this.zzaa.get(i);
    }

    @Deprecated
    public final boolean zzb(int i, zzyn zzynVar) {
        Map map = (Map) this.zzZ.get(i);
        return map != null && map.containsKey(zzynVar);
    }

    @Deprecated
    public final zzzm zzc(int i, zzyn zzynVar) {
        Map map = (Map) this.zzZ.get(i);
        if (map != null) {
            return (zzzm) map.get(zzynVar);
        }
        return null;
    }

    public final zzzk zzd() {
        return new zzzk(this, null);
    }

    public final /* synthetic */ SparseArray zze() {
        return this.zzZ;
    }

    public final /* synthetic */ SparseBooleanArray zzf() {
        return this.zzaa;
    }

    public /* synthetic */ zzzl(zzzk zzzkVar, byte[] bArr) {
        this(zzzkVar);
    }
}
