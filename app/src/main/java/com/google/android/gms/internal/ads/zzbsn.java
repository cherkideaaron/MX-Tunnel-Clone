package com.google.android.gms.internal.ads;

import defpackage.WP;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbsn implements zzbre, zzbsm {
    private final zzbsm zza;
    private final HashSet zzb = new HashSet();

    public zzbsn(zzbsm zzbsmVar) {
        this.zza = zzbsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbre, com.google.android.gms.internal.ads.zzbrp
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, com.google.android.gms.internal.ads.zzbrp
    public final /* synthetic */ void zzb(String str, JSONObject jSONObject) {
        WP.a(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, com.google.android.gms.internal.ads.zzbrp
    public final /* synthetic */ void zzc(String str, String str2) {
        WP.b(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, com.google.android.gms.internal.ads.zzbrd
    public final /* synthetic */ void zzd(String str, JSONObject jSONObject) {
        WP.c(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, com.google.android.gms.internal.ads.zzbrd
    public final /* synthetic */ void zze(String str, Map map) {
        WP.d(this, str, map);
    }

    public final void zzf() {
        HashSet hashSet = this.zzb;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            com.google.android.gms.ads.internal.util.zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzboh) simpleEntry.getValue()).toString())));
            this.zza.zzn((String) simpleEntry.getKey(), (zzboh) simpleEntry.getValue());
        }
        hashSet.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void zzm(String str, zzboh zzbohVar) {
        this.zza.zzm(str, zzbohVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbohVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void zzn(String str, zzboh zzbohVar) {
        this.zza.zzn(str, zzbohVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbohVar));
    }
}
