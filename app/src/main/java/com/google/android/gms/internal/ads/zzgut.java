package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class zzgut {
    public static boolean zza(Iterable iterable, zzgrd zzgrdVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            zzgrdVar.getClass();
            return zzc((List) iterable, zzgrdVar);
        }
        Iterator it = iterable.iterator();
        zzgrdVar.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (zzgrdVar.zza(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static Object zzb(Iterable iterable, Object obj) {
        zzgwt it = ((zzgwk) iterable).iterator();
        return it.hasNext() ? it.next() : obj;
    }

    private static boolean zzc(List list, zzgrd zzgrdVar) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!zzgrdVar.zza(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (IllegalArgumentException unused) {
                        zzd(list, zzgrdVar, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzd(list, zzgrdVar, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }

    private static void zzd(List list, zzgrd zzgrdVar, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (zzgrdVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            } else {
                list.remove(i2);
            }
        }
    }
}
