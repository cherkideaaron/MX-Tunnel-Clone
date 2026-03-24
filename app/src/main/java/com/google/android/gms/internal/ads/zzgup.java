package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class zzgup<E> extends zzgub<E> implements Set<E> {
    private transient zzguf zza;

    public static zzgup zzh() {
        return zzgwg.zza;
    }

    public static zzgup zzi(Object obj) {
        return new zzgwq(obj);
    }

    public static zzgup zzj(Object obj, Object obj2) {
        return zzv(2, obj, obj2);
    }

    public static zzgup zzk(Object obj, Object obj2, Object obj3) {
        return zzv(3, obj, obj2, obj3);
    }

    public static zzgup zzl(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzv(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static zzgup zzm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return zzv(i, objArr2);
    }

    public static int zzn(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            zzgrc.zzb(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzgup zzo(Collection collection) {
        if ((collection instanceof zzgup) && !(collection instanceof SortedSet)) {
            zzgup zzgupVar = (zzgup) collection;
            if (!zzgupVar.zzf()) {
                return zzgupVar;
            }
        }
        Object[] array = collection.toArray();
        return zzv(array.length, array);
    }

    public static zzgup zzp(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? zzv(length, (Object[]) objArr.clone()) : new zzgwq(objArr[0]) : zzgwg.zza;
    }

    public static zzguo zzs(int i) {
        zzgtb.zzb(i, "expectedSize");
        return new zzguo(i, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgup zzv(int i, Object... objArr) {
        if (i == 0) {
            return zzgwg.zza;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzgwq(obj);
        }
        int iZzn = zzn(i);
        Object[] objArr2 = new Object[iZzn];
        int i2 = iZzn - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            zzgvy.zzb(obj2, i5);
            int iHashCode = obj2.hashCode();
            int iZza = zzgty.zza(iHashCode);
            while (true) {
                int i6 = iZza & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iZza++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzgwq(obj4);
        }
        if (zzn(i4) < iZzn / 2) {
            return zzv(i4, objArr);
        }
        if (zzw(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new zzgwg(objArr, i3, objArr2, i2, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzw(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgup) && zzq() && ((zzgup) obj).zzq() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzgwp.zzd(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzgwp.zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgub, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract zzgwt iterator();

    @Override // com.google.android.gms.internal.ads.zzgub
    public zzguf zze() {
        zzguf zzgufVar = this.zza;
        if (zzgufVar != null) {
            return zzgufVar;
        }
        zzguf zzgufVarZzr = zzr();
        this.zza = zzgufVarZzr;
        return zzgufVarZzr;
    }

    public boolean zzq() {
        return false;
    }

    public zzguf zzr() {
        Object[] array = toArray();
        int i = zzguf.zzd;
        return zzguf.zzt(array, array.length);
    }
}
