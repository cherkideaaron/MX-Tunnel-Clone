package com.google.android.gms.internal.ads;

import defpackage.Vs;
import java.util.ArrayDeque;
import java.util.Optional;

/* loaded from: classes.dex */
public final class zzavb {
    public final zzatw zza;
    public final zzaux zzb;
    public final zzauu zzc;
    public final zzaup zzd;

    public zzavb(zzatw zzatwVar, zzaux zzauxVar, zzaup zzaupVar) {
        int[] iArr = {343945053, 300943123, 276960570, 1098387973, 1376531620, 1545514151, 271059426, 857490000, 454333378};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        this.zza = zzatwVar;
        this.zzb = zzauxVar;
        this.zzd = zzaupVar;
        this.zzc = new zzauu(Vs.e((i2 & (~i)) | i3, (i & i4) | i5, i6, i7) ^ (i8 % 454333378));
    }

    public final Optional zza() {
        zzatq zzatqVar;
        try {
            ArrayDeque arrayDeque = this.zzc.zza;
            if (arrayDeque.isEmpty()) {
                throw new zzaut();
            }
            zzaur zzaurVar = (zzaur) arrayDeque.pop();
            long j = zzaurVar.zza;
            long j2 = zzaurVar.zzb;
            long j3 = zzaurVar.zzc;
            zzaux zzauxVar = this.zzb;
            if (zzauxVar.zzb < j2) {
                return Optional.of(zzatq.zzG);
            }
            this.zzd.zza(j);
            if (j3 == 0) {
                while (zzauxVar.zzb > j2) {
                    zzauxVar.zzc();
                }
            }
            return Optional.empty();
        } catch (zzaun e) {
            e = e;
            throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e);
        } catch (zzauo e2) {
            e = e2;
            throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e);
        } catch (zzaut unused) {
            zzatqVar = zzatq.zzw;
            return Optional.of(zzatqVar);
        } catch (zzauv unused2) {
            zzatqVar = zzatq.zzG;
            return Optional.of(zzatqVar);
        }
    }
}
