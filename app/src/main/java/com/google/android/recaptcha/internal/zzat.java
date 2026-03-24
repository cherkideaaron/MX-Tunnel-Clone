package com.google.android.recaptcha.internal;

import defpackage.AbstractC3400sr;
import defpackage.Ht;
import defpackage.InterfaceC0606cn;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzat extends AbstractC3400sr implements InterfaceC0606cn {
    public static final zzat zza = new zzat();

    public zzat() {
        super(0);
    }

    public static final Map zza() {
        Map map = zzav.zzc;
        LinkedHashMap linkedHashMap = new LinkedHashMap(Ht.U(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((zzaw) entry.getValue()).zzb());
        }
        return linkedHashMap;
    }

    @Override // defpackage.InterfaceC0606cn
    public final /* bridge */ /* synthetic */ Object invoke() {
        return zza();
    }
}
