package com.google.android.gms.internal.ads;

import defpackage.Vs;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class zzavc implements Comparator {
    private final boolean zza;

    public zzavc(boolean z) {
        this.zza = z;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparator comparatorZza;
        Object objZzn;
        Object objZzn2;
        int[] iArr = {446703183, 1862618146, 1081639777, -1087935358, -803036955, 1104011716, 5522510, 2017461929, 496612959};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iE = Vs.e((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        int i9 = i8 % 496612959;
        zzavg zzavgVar = (zzavg) obj;
        zzavg zzavgVar2 = (zzavg) obj2;
        int i10 = zzavgVar.zza;
        if (i10 != zzavgVar2.zza) {
            throw new IllegalArgumentException();
        }
        int i11 = i9 ^ iE;
        try {
            if (i10 == 0) {
                throw null;
            }
            switch (i10 + i11) {
                case 0:
                    return 0;
                case 1:
                    if (this.zza) {
                        return zzavgVar.zzl() != zzavgVar2.zzl() ? 1 : 0;
                    }
                    throw new IllegalArgumentException();
                case 2:
                    return Long.compare(zzavgVar.zzm(), zzavgVar2.zzm());
                case 3:
                    comparatorZza = zzauk.zzc;
                    objZzn = zzavgVar.zzn();
                    objZzn2 = zzavgVar2.zzn();
                    return comparatorZza.compare(objZzn, objZzn2);
                case 4:
                    objZzn = zzavgVar.zzo();
                    objZzn2 = zzavgVar2.zzo();
                    comparatorZza = zzgtp.zza(this);
                    return comparatorZza.compare(objZzn, objZzn2);
                case 5:
                    if (!this.zza) {
                        throw new IllegalArgumentException();
                    }
                    if (zzavgVar.zzp() == zzavgVar2.zzp()) {
                        return 0;
                    }
                case 6:
                    return Double.compare(zzavgVar.zzq(), zzavgVar2.zzq());
                default:
                    return 0;
            }
        } catch (zzavd e) {
            throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e);
        }
    }
}
