package com.google.android.gms.internal.ads;

import android.net.Uri;
import defpackage.CP;
import java.util.Map;

/* loaded from: classes.dex */
final /* synthetic */ class zzciq implements zzafa {
    static final /* synthetic */ zzciq zza = new zzciq();

    private /* synthetic */ zzciq() {
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final /* synthetic */ zzaeu[] zza() {
        int i = zzcit.zza;
        return new zzaeu[]{new zzakw(), new zzajh(), new zzako(zzamd.zza, 32, null, null, zzguf.zzi(), null)};
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final /* synthetic */ zzaeu[] zzb(Uri uri, Map map) {
        return CP.a(this, uri, map);
    }
}
