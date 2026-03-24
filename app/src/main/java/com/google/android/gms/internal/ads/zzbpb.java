package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Map;
import org.achartengine.ChartFactory;

/* loaded from: classes.dex */
public final class zzbpb implements zzboh {
    private final Context zza;

    public zzbpb(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
        if (map.containsKey(ChartFactory.TITLE)) {
            intent.putExtra("android.intent.extra.TITLE", (String) map.get(ChartFactory.TITLE));
        }
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzaa(this.zza, intent);
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to open Share Sheet", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "ShareSheetGmsgHandler.onGmsg");
        }
    }
}
