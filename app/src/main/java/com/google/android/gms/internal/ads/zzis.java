package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class zzis implements zzlj {
    public static final zzguf zza = zzguf.zzn("file", "content", "data", "android.resource", "rawresource", "asset");
    private final zzbe zzb;
    private final zzbd zzc;
    private final zzaat zzd;
    private final long zze;
    private final long zzf;
    private final long zzg;
    private final long zzh;
    private final long zzi;
    private final long zzj;
    private final long zzk;
    private final long zzl;
    private final long zzm;
    private final zzgui zzn;
    private final ConcurrentHashMap zzo;
    private long zzp;

    public zzis() {
        zzaat zzaatVar = new zzaat(true, 65536);
        zzgui zzguiVarZza = zzgui.zza();
        zzq(1000, 0, "bufferForPlaybackMs", "0");
        zzq(1000, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        zzq(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzq(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        zzq(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        zzq(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        zzq(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzq(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        zzq(50000, 50000, "maxBufferMs", "minBufferMs");
        zzq(50000, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        zzq(0, 0, "backBufferDurationMs", "0");
        this.zzb = new zzbe();
        this.zzc = new zzbd();
        this.zzd = zzaatVar;
        this.zze = zzfj.zzq(50000L);
        this.zzf = zzfj.zzq(1000L);
        this.zzg = zzfj.zzq(50000L);
        this.zzh = zzfj.zzq(50000L);
        this.zzi = zzfj.zzq(1000L);
        this.zzj = zzfj.zzq(1000L);
        this.zzk = zzfj.zzq(2000L);
        this.zzl = zzfj.zzq(1000L);
        this.zzm = zzfj.zzq(0L);
        this.zzo = new ConcurrentHashMap();
        this.zzn = zzgui.zzc(zzguiVarZza);
        this.zzp = -1L;
    }

    private final int zzm(zzpq zzpqVar) {
        Integer num = (Integer) this.zzn.get(zzpqVar.zzb);
        if (num == null || num.intValue() == -1) {
            return -1;
        }
        return num.intValue();
    }

    private final void zzn(zzpq zzpqVar) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzir zzirVar = (zzir) concurrentHashMap.get(zzpqVar);
        if (zzirVar != null) {
            int i = zzirVar.zza - 1;
            zzirVar.zza = i;
            if (i == 0) {
                concurrentHashMap.remove(zzpqVar);
                zzo();
            }
        }
    }

    private final void zzo() {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        if (concurrentHashMap.isEmpty()) {
            this.zzd.zze();
            return;
        }
        zzaat zzaatVar = this.zzd;
        Iterator it = concurrentHashMap.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((zzir) it.next()).zzc;
        }
        zzaatVar.zzf(i);
    }

    private final boolean zzp(zzli zzliVar) {
        zzbf zzbfVar = zzliVar.zzb;
        zzag zzagVar = zzbfVar.zzb(zzbfVar.zzo(zzliVar.zzc.zza, this.zzc).zzc, this.zzb, 0L).zzd.zzb;
        if (zzagVar == null) {
            return false;
        }
        String scheme = zzagVar.zza.getScheme();
        return TextUtils.isEmpty(scheme) || zza.contains(scheme);
    }

    private static void zzq(int i, int i2, String str, String str2) {
        zzgrc.zzh(i >= i2, "%s cannot be less than %s", str, str2);
    }

    private final int zzr(zzpq zzpqVar) {
        zzir zzirVar = (zzir) this.zzo.get(zzpqVar);
        zzirVar.getClass();
        return zzirVar.zzc() * 65536;
    }

    private final int zzs(zzpq zzpqVar) {
        zzir zzirVar = (zzir) this.zzo.get(zzpqVar);
        zzirVar.getClass();
        return zzirVar.zzc;
    }

    private static final boolean zzt(boolean z) {
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zza(zzpq zzpqVar) {
        long id = Thread.currentThread().getId();
        long j = this.zzp;
        zzgrc.zzj(j == -1 || j == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.zzp = id;
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzir zzirVar = (zzir) concurrentHashMap.get(zzpqVar);
        if (zzirVar == null) {
            concurrentHashMap.put(zzpqVar, new zzir());
        } else {
            zzirVar.zza++;
        }
        zzir zzirVar2 = (zzir) concurrentHashMap.get(zzpqVar);
        zzirVar2.getClass();
        int iZzm = zzm(zzpqVar);
        if (iZzm == -1) {
            iZzm = 13107200;
        }
        zzirVar2.zzc = iZzm;
        zzirVar2.zzb = false;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzb(zzli zzliVar, zzyn zzynVar, zzaac[] zzaacVarArr) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzpq zzpqVar = zzliVar.zza;
        int iZzm = zzm(zzpqVar);
        zzir zzirVar = (zzir) concurrentHashMap.get(zzpqVar);
        zzirVar.getClass();
        if (iZzm == -1) {
            boolean zZzp = zzp(zzliVar);
            int length = zzaacVarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i < length) {
                    zzaac zzaacVar = zzaacVarArr[i];
                    if (zzaacVar != null) {
                        switch (zzaacVar.zza().zzc) {
                            case -1:
                            case 1:
                                break;
                            case 0:
                                i3 = 144310272;
                                break;
                            case 2:
                                if (!zZzp) {
                                    i3 = 131072000;
                                    break;
                                } else {
                                    i3 = 19660800;
                                    break;
                                }
                            case 3:
                            case 5:
                            default:
                                i3 = 131072;
                                break;
                            case 4:
                                i3 = 26214400;
                                break;
                        }
                        i2 += i3;
                    }
                    i++;
                } else {
                    iZzm = Math.max(13107200, i2);
                }
            }
        }
        zzirVar.zzc = iZzm;
        zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzc(zzpq zzpqVar) {
        zzn(zzpqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzd(zzpq zzpqVar) {
        zzn(zzpqVar);
        if (this.zzo.isEmpty()) {
            this.zzp = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final zzaan zze(zzpq zzpqVar) {
        return new zziq(this, zzpqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final long zzf(zzpq zzpqVar) {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzg(zzpq zzpqVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzh(zzli zzliVar) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzpq zzpqVar = zzliVar.zza;
        zzir zzirVar = (zzir) concurrentHashMap.get(zzpqVar);
        zzirVar.getClass();
        int iZzr = zzr(zzpqVar);
        int iZzs = zzs(zzpqVar);
        if (zzpqVar.equals(zzpq.zza)) {
            return iZzr < iZzs;
        }
        boolean zZzp = zzp(zzliVar);
        long jMin = zZzp ? this.zzf : this.zze;
        long j = zZzp ? this.zzh : this.zzg;
        float f = zzliVar.zzf;
        if (f > 1.0f) {
            jMin = Math.min(zzfj.zzv(jMin, f), j);
        }
        long j2 = zzliVar.zze;
        if (j2 < Math.max(jMin, 500000L)) {
            boolean z = zzt(zZzp) || iZzr < iZzs;
            zzirVar.zzb = z;
            if (!z && j2 < 500000) {
                zzee.zzc("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= j || iZzr >= iZzs) {
            zzirVar.zzb = false;
        }
        return zzirVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzi(zzli zzliVar) {
        long jMin;
        boolean z;
        boolean z2 = zzliVar.zzg;
        long j = zzliVar.zze;
        float f = zzliVar.zzf;
        boolean zZzp = zzp(zzliVar);
        long jZzw = zzfj.zzw(j, f);
        if (z2) {
            if (zZzp) {
                jMin = this.zzl;
                z = true;
            } else {
                jMin = this.zzk;
                z = false;
            }
        } else if (zZzp) {
            jMin = this.zzj;
            z = true;
        } else {
            jMin = this.zzi;
            z = false;
        }
        long j2 = zzliVar.zzh;
        if (j2 != -9223372036854775807L) {
            jMin = Math.min(j2 / 2, jMin);
        }
        if (jMin > 0 && jZzw < jMin) {
            if (zzt(z)) {
                return false;
            }
            zzpq zzpqVar = zzliVar.zza;
            if (zzr(zzpqVar) < zzs(zzpqVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzj(zzpq zzpqVar, zzbf zzbfVar, zzwk zzwkVar, long j) {
        Iterator it = this.zzo.values().iterator();
        while (it.hasNext()) {
            if (((zzir) it.next()).zzb) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ zzaat zzk() {
        return this.zzd;
    }

    public final /* synthetic */ ConcurrentHashMap zzl() {
        return this.zzo;
    }
}
