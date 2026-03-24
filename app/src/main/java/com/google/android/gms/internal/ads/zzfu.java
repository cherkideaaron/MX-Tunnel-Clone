package com.google.android.gms.internal.ads;

import defpackage.AbstractC3264qG;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class zzfu extends zzfw {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzfu(int i, long j) {
        super(i, null);
        this.zza = j;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzfw
    public final String toString() {
        List list = this.zzb;
        String strZze = zzfw.zze(this.zzd);
        String string = Arrays.toString(list.toArray());
        String string2 = Arrays.toString(this.zzc.toArray());
        int length = strZze.length();
        StringBuilder sb = new StringBuilder(length + 9 + String.valueOf(string).length() + 13 + String.valueOf(string2).length());
        AbstractC3264qG.v(sb, strZze, " leaves: ", string, " containers: ");
        sb.append(string2);
        return sb.toString();
    }

    public final void zza(zzfv zzfvVar) {
        this.zzb.add(zzfvVar);
    }

    public final void zzb(zzfu zzfuVar) {
        this.zzc.add(zzfuVar);
    }

    public final zzfv zzc(int i) {
        List list = this.zzb;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzfv zzfvVar = (zzfv) list.get(i2);
            if (zzfvVar.zzd == i) {
                return zzfvVar;
            }
        }
        return null;
    }

    public final zzfu zzd(int i) {
        List list = this.zzc;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzfu zzfuVar = (zzfu) list.get(i2);
            if (zzfuVar.zzd == i) {
                return zzfuVar;
            }
        }
        return null;
    }
}
