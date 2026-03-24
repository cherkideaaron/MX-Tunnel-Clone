package com.google.android.gms.internal.ads;

import android.net.Uri;
import defpackage.CP;
import java.util.Map;

/* loaded from: classes.dex */
final /* synthetic */ class zzcip implements zzafa {
    static final /* synthetic */ zzcip zza = new zzcip();

    private /* synthetic */ zzcip() {
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final /* synthetic */ zzaeu[] zza() {
        int i = zzcit.zza;
        return new zzaeu[]{new zzakw(), new zzajh()};
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final /* synthetic */ zzaeu[] zzb(Uri uri, Map map) {
        return CP.a(this, uri, map);
    }
}
