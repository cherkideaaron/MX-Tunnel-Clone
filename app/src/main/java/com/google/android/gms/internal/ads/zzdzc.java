package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class zzdzc {
    private final Map zza = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:30:0x0095 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:3:0x0001, B:8:0x0019, B:10:0x0032, B:12:0x0038, B:14:0x0041, B:18:0x0049, B:25:0x0068, B:26:0x0074, B:30:0x0095, B:32:0x009f, B:33:0x00a7, B:34:0x00ae, B:36:0x00b4, B:37:0x00b8, B:39:0x00cd, B:40:0x00d6, B:42:0x00dc, B:44:0x00ea, B:46:0x00f0, B:47:0x0102, B:49:0x0108, B:51:0x011a, B:53:0x0122, B:57:0x0133, B:59:0x013b, B:61:0x0141, B:63:0x014a, B:64:0x0153, B:27:0x0079, B:28:0x0086), top: B:71:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zza(long r8, int r10, long r11) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdzc.zza(long, int, long):void");
    }

    public final synchronized Map zzb() {
        HashMap map;
        map = new HashMap();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziP)).booleanValue()) {
            zzc();
            for (Map.Entry entry : this.zza.entrySet()) {
                map.put((zzdzf) entry.getKey(), new ArrayDeque((Collection) entry.getValue()));
            }
        }
        return map;
    }

    public final void zzc() {
        long jLongValue;
        zzbgv zzbgvVar;
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        Iterator it = this.zza.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zzdzf zzdzfVar = (zzdzf) entry.getKey();
            ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
            int iZzb = zzdzfVar.zzb();
            if (iZzb == 0) {
                jLongValue = 0;
            } else {
                if (iZzb == 1) {
                    zzbgvVar = zzbhe.zziS;
                } else if (iZzb != 2) {
                    if (iZzb == 3) {
                        zzbgvVar = zzbhe.zziU;
                    }
                    jLongValue = 0;
                } else {
                    zzbgvVar = zzbhe.zziT;
                }
                jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).longValue();
            }
            if (jLongValue == 0) {
                it.remove();
                jLongValue = 0;
            }
            if (jLongValue > 0) {
                Iterator it2 = arrayDeque.iterator();
                while (it2.hasNext() && jCurrentTimeMillis - ((Long) it2.next()).longValue() > jLongValue) {
                    it2.remove();
                }
                if (arrayDeque.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
