package com.google.android.gms.internal.ads;

import defpackage.AbstractC3264qG;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzasr {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    public zzasr(String str, zzarh zzarhVar) {
        String str2 = zzarhVar.zzb;
        long j = zzarhVar.zzc;
        long j2 = zzarhVar.zzd;
        long j3 = zzarhVar.zze;
        long j4 = zzarhVar.zzf;
        List arrayList = zzarhVar.zzh;
        if (arrayList == 0) {
            Map map = zzarhVar.zzg;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new zzarq((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j, j2, j3, j4, arrayList);
    }

    public static zzasr zza(zzass zzassVar) throws IOException {
        if (zzasu.zzi(zzassVar) != 538247942) {
            throw new IOException();
        }
        String strZzm = zzasu.zzm(zzassVar);
        String strZzm2 = zzasu.zzm(zzassVar);
        long jZzk = zzasu.zzk(zzassVar);
        long jZzk2 = zzasu.zzk(zzassVar);
        long jZzk3 = zzasu.zzk(zzassVar);
        long jZzk4 = zzasu.zzk(zzassVar);
        int iZzi = zzasu.zzi(zzassVar);
        if (iZzi < 0) {
            throw new IOException(AbstractC3264qG.k(new StringBuilder(String.valueOf(iZzi).length() + 20), "readHeaderList size=", iZzi));
        }
        List listEmptyList = iZzi == 0 ? Collections.emptyList() : new ArrayList();
        for (int i = 0; i < iZzi; i++) {
            listEmptyList.add(new zzarq(zzasu.zzm(zzassVar).intern(), zzasu.zzm(zzassVar).intern()));
        }
        return new zzasr(strZzm, strZzm2, jZzk, jZzk2, jZzk3, jZzk4, listEmptyList);
    }

    private zzasr(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = j4;
        this.zzh = list;
    }
}
