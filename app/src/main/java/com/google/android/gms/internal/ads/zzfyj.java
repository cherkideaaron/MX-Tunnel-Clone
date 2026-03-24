package com.google.android.gms.internal.ads;

import android.net.Network;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes.dex */
public final class zzfyj extends zzfxx {
    private zzgru<Integer> zza;
    private zzgru<Integer> zzb;
    private zzfxz zzc;
    private HttpURLConnection zzd;

    public zzfyj() {
        this(zzfyi.zza, zzfya.zza, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer zzA() {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer zzB() {
        return -1;
    }

    public static void zzi(HttpURLConnection httpURLConnection) {
        zzfxy.zzb();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzi(this.zzd);
    }

    public URLConnection zzf(final URL url, final int i) {
        this.zza = new zzgru() { // from class: com.google.android.gms.internal.ads.zzfyb
            @Override // com.google.android.gms.internal.ads.zzgru
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.zzc = new zzfxz() { // from class: com.google.android.gms.internal.ads.zzfyc
            @Override // com.google.android.gms.internal.ads.zzfxz
            public final /* synthetic */ URLConnection zza() {
                return url.openConnection();
            }
        };
        return zzj();
    }

    public HttpURLConnection zzg(final Network network, final URL url, final int i, final int i2) {
        this.zza = new zzgru() { // from class: com.google.android.gms.internal.ads.zzfyd
            @Override // com.google.android.gms.internal.ads.zzgru
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.zzb = new zzgru() { // from class: com.google.android.gms.internal.ads.zzfye
            @Override // com.google.android.gms.internal.ads.zzgru
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i2);
            }
        };
        this.zzc = new zzfxz() { // from class: com.google.android.gms.internal.ads.zzfyf
            @Override // com.google.android.gms.internal.ads.zzfxz
            public final /* synthetic */ URLConnection zza() {
                return network.openConnection(url);
            }
        };
        return zzj();
    }

    public HttpURLConnection zzh(zzfxz zzfxzVar, final int i, final int i2) {
        this.zza = new zzgru() { // from class: com.google.android.gms.internal.ads.zzfyg
            @Override // com.google.android.gms.internal.ads.zzgru
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.zzb = new zzgru() { // from class: com.google.android.gms.internal.ads.zzfyh
            @Override // com.google.android.gms.internal.ads.zzgru
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i2);
            }
        };
        this.zzc = zzfxzVar;
        return zzj();
    }

    public HttpURLConnection zzj() {
        zzfxy.zza(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfxz zzfxzVar = this.zzc;
        zzfxzVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfxzVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public zzfyj(zzgru<Integer> zzgruVar, zzgru<Integer> zzgruVar2, zzfxz zzfxzVar) {
        this.zza = zzgruVar;
        this.zzb = zzgruVar2;
        this.zzc = zzfxzVar;
    }
}
