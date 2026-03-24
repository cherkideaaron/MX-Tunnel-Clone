package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import defpackage.AbstractC3264qG;
import defpackage.Vs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
final class zzks extends zzf implements zzjh {
    public static final /* synthetic */ int zzd = 0;
    private final long zzA;
    private final zzdm zzB;
    private final zzfa zzC;
    private final zzkr zzD;
    private final Map zzE;
    private int zzF;
    private int zzG;
    private boolean zzH;
    private zzms zzI;
    private zzmt zzJ;
    private zzjg zzK;
    private zzax zzL;
    private zzan zzM;
    private Object zzN;
    private Surface zzO;
    private int zzP;
    private zzes zzQ;
    private zzd zzR;
    private float zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private int zzW;
    private boolean zzX;
    private zzil zzY;
    private zzan zzZ;
    private zzmd zzaa;
    private int zzab;
    private long zzac;
    private zzyf zzad;
    final zzaak zzb;
    final zzax zzc;
    private final zzdq zze = new zzdq(zzdn.zza);
    private final Context zzf;
    private final zzbb zzg;
    private final zzml[] zzh;
    private final zzml[] zzi;
    private final zzaaj zzj;
    private final zzdx zzk;
    private final zzld zzl;
    private final zzlf zzm;
    private final zzed zzn;
    private final CopyOnWriteArraySet zzo;
    private final zzbd zzp;
    private final List zzq;
    private final boolean zzr;
    private final zzmx zzs;
    private final Looper zzt;
    private final zzaas zzu;
    private final zzdn zzv;
    private final zzjo zzw;
    private final zzkn zzx;
    private final zzfo zzy;
    private final zzfp zzz;

    static {
        zzal.zzb("media3.exoplayer");
    }

    public zzks(zzjf zzjfVar, zzbb zzbbVar) {
        zzjf zzjfVar2;
        zzdn zzdnVar;
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = zzfj.zza;
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 37 + String.valueOf(str).length() + 1);
            sb.append("Init ");
            sb.append(hexString);
            sb.append(" [AndroidXMedia3/1.9.0-beta01] [");
            sb.append(str);
            sb.append("]");
            zzee.zzb("ExoPlayerImpl", sb.toString());
            this.zzf = zzjfVar.zza.getApplicationContext();
            this.zzs = (zzmx) zzjfVar.zzh.apply(zzjfVar.zzb);
            this.zzW = zzjfVar.zzj;
            this.zzR = zzjfVar.zzk;
            this.zzP = zzjfVar.zzl;
            this.zzT = false;
            this.zzA = zzjfVar.zzq;
            zzjo zzjoVar = new zzjo(this, null);
            this.zzw = zzjoVar;
            this.zzx = new zzkn(null);
            zzml[] zzmlVarArrZza = ((zzmq) zzjfVar.zzc.zza()).zza(new Handler(zzjfVar.zzi), zzjoVar, zzjoVar, zzjoVar, zzjoVar);
            this.zzh = zzmlVarArrZza;
            int length = zzmlVarArrZza.length;
            this.zzi = new zzml[2];
            int i = 0;
            while (true) {
                zzml[] zzmlVarArr = this.zzi;
                int length2 = zzmlVarArr.length;
                if (i >= 2) {
                    break;
                }
                zzml zzmlVar = this.zzh[i];
                zzmlVarArr[i] = null;
                i++;
            }
            zzaaj zzaajVar = (zzaaj) zzjfVar.zze.zza();
            this.zzj = zzaajVar;
            zzaas zzaasVar = (zzaas) zzjfVar.zzg.zza();
            this.zzu = zzaasVar;
            this.zzr = zzjfVar.zzm;
            this.zzJ = zzjfVar.zzn;
            this.zzI = zzjfVar.zzo;
            Looper looper = zzjfVar.zzi;
            this.zzt = looper;
            zzdn zzdnVar2 = zzjfVar.zzb;
            this.zzv = zzdnVar2;
            this.zzg = zzbbVar;
            this.zzn = new zzed(looper, zzdnVar2, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkm
                @Override // com.google.android.gms.internal.ads.zzdz
                public final /* synthetic */ void zza(Object obj, zzs zzsVar) {
                    this.zza.zzJ((zzaz) obj, zzsVar);
                }
            });
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzo = copyOnWriteArraySet;
            this.zzq = new ArrayList();
            this.zzad = new zzyf(0);
            this.zzK = zzjg.zza;
            int length3 = this.zzh.length;
            zzaak zzaakVar = new zzaak(new zzmo[2], new zzaac[2], zzbn.zza, null);
            this.zzb = zzaakVar;
            this.zzp = new zzbd();
            zzaw zzawVar = new zzaw();
            zzawVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzaajVar.zzd();
            zzawVar.zzb(29, true);
            zzawVar.zzb(23, false);
            zzawVar.zzb(25, false);
            zzawVar.zzb(33, false);
            zzawVar.zzb(26, false);
            zzawVar.zzb(34, false);
            zzax zzaxVarZze = zzawVar.zze();
            this.zzc = zzaxVarZze;
            zzaw zzawVar2 = new zzaw();
            zzawVar2.zzd(zzaxVarZze);
            zzawVar2.zza(4);
            zzawVar2.zza(10);
            this.zzL = zzawVar2.zze();
            this.zzk = zzdnVar2.zzd(looper, null);
            zzld zzldVar = new zzld() { // from class: com.google.android.gms.internal.ads.zzjp
                @Override // com.google.android.gms.internal.ads.zzld
                public final /* synthetic */ void zza(zzlc zzlcVar) {
                    this.zza.zzK(zzlcVar);
                }
            };
            this.zzl = zzldVar;
            this.zzaa = zzmd.zza(zzaakVar);
            this.zzs.zzx(zzbbVar, looper);
            final zzpq zzpqVar = new zzpq(zzjfVar.zzx);
            zzlf zzlfVar = new zzlf(this.zzf, this.zzh, this.zzi, zzaajVar, zzaakVar, (zzlj) zzjfVar.zzf.zza(), zzaasVar, 0, false, this.zzs, this.zzJ, zzjfVar.zzy, zzjfVar.zzp, false, false, looper, zzdnVar2, zzldVar, zzpqVar, null, this.zzK, this.zzx);
            this.zzm = zzlfVar;
            Looper looperZzn = zzlfVar.zzn();
            this.zzS = 1.0f;
            zzan zzanVar = zzan.zza;
            this.zzM = zzanVar;
            this.zzZ = zzanVar;
            this.zzab = -1;
            int i2 = zzcz.zza;
            this.zzU = true;
            zze(this.zzs);
            zzaasVar.zzf(new Handler(looper), this.zzs);
            copyOnWriteArraySet.add(this.zzw);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 31) {
                final Context context = this.zzf;
                zzjfVar2 = zzjfVar;
                final boolean z = zzjfVar2.zzv;
                zzdnVar = zzdnVar2;
                zzdnVar.zzd(zzlfVar.zzn(), null).zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzji
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzpm zzpmVarZza = zzpm.zza(context);
                        if (zzpmVarZza == null) {
                            zzee.zzc("ExoPlayerImpl", "MediaMetricsService unavailable.");
                            return;
                        }
                        if (z) {
                            this.zzD(zzpmVarZza);
                        }
                        zzpqVar.zzb(zzpmVarZza.zzb());
                    }
                });
            } else {
                zzjfVar2 = zzjfVar;
                zzdnVar = zzdnVar2;
            }
            zzdm zzdmVar = new zzdm(0, looperZzn, looper, zzdnVar, new zzdl() { // from class: com.google.android.gms.internal.ads.zzka
                @Override // com.google.android.gms.internal.ads.zzdl
                public final /* synthetic */ void zza(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    this.zza.zzL(((Integer) obj).intValue(), iIntValue);
                }
            });
            this.zzB = zzdmVar;
            zzdmVar.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzM();
                }
            });
            new zzbz(zzjfVar2.zza, looperZzn, zzjfVar2.zzi, this.zzw, zzdnVar);
            boolean z2 = (zzjfVar2.zzs == Integer.MAX_VALUE || zzjfVar2.zzt == Integer.MAX_VALUE) ? false : true;
            zzfo zzfoVar = new zzfo(zzjfVar2.zza, looperZzn, zzdnVar);
            this.zzy = zzfoVar;
            zzfoVar.zza(z2);
            this.zzz = new zzfp(zzjfVar2.zza, looperZzn, zzdnVar);
            int i4 = zzm.zza;
            zzbv zzbvVar = zzbv.zza;
            this.zzQ = zzes.zza;
            this.zzD = i3 >= 34 ? new zzkr(this, zzjfVar2.zza, null) : null;
            this.zzE = new HashMap();
            this.zzY = zzil.zza;
            this.zzC = new zzfa(this, this.zzw, zzdnVar, zzjfVar2.zzr, zzjfVar2.zzs, zzjfVar2.zzt, zzjfVar2.zzu);
            zzlfVar.zzg(this.zzI);
            zzlfVar.zzi(this.zzR, false);
            zzaw(1, 3, this.zzR);
            zzaw(2, 4, Integer.valueOf(this.zzP));
            zzaw(2, 5, 0);
            zzaw(1, 9, Boolean.valueOf(this.zzT));
            zzaw(6, 8, this.zzx);
            zzaw(-1, 16, Integer.valueOf(this.zzW));
            this.zze.zza();
        } catch (Throwable th) {
            this.zze.zza();
            throw th;
        }
    }

    public static /* synthetic */ zzil zzU(zzil zzilVar, List list) {
        zzik zzikVar = new zzik(zzilVar, null);
        HashSet hashSet = new HashSet(list);
        for (String str : zzilVar.zza()) {
            if (!hashSet.contains(str)) {
                zzikVar.zzf(str);
            }
        }
        return zzikVar.zzg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzah, reason: merged with bridge method [inline-methods] */
    public final void zzP(zziw zziwVar) {
        zzmd zzmdVar = this.zzaa;
        zzmd zzmdVarZzh = zzmdVar.zzh(zzmdVar.zzb);
        zzmdVarZzh.zzq = zzmdVarZzh.zzs;
        zzmdVarZzh.zzr = 0L;
        zzmd zzmdVarZzao = zzao(zzmdVarZzh, 1);
        if (zziwVar != null) {
            zzmdVarZzao = zzmdVarZzao.zzf(zziwVar);
        }
        this.zzF++;
        this.zzm.zzh();
        zzal(zzmdVarZzao, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private final int zzai(zzmd zzmdVar) {
        zzbf zzbfVar = zzmdVar.zza;
        return zzbfVar.zzg() ? this.zzab : zzbfVar.zzo(zzmdVar.zzb.zza, this.zzp).zzc;
    }

    private final long zzaj(zzmd zzmdVar) {
        zzwk zzwkVar = zzmdVar.zzb;
        if (!zzwkVar.zzb()) {
            return zzfj.zzp(zzak(zzmdVar));
        }
        zzbf zzbfVar = zzmdVar.zza;
        zzbfVar.zzo(zzwkVar.zza, this.zzp);
        long j = zzmdVar.zzc;
        if (j != -9223372036854775807L) {
            return zzfj.zzp(0L) + zzfj.zzp(j);
        }
        long j2 = zzbfVar.zzb(zzai(zzmdVar), this.zza, 0L).zzl;
        return zzfj.zzp(0L);
    }

    private final long zzak(zzmd zzmdVar) {
        zzbf zzbfVar = zzmdVar.zza;
        if (zzbfVar.zzg()) {
            return zzfj.zzq(this.zzac);
        }
        long j = zzmdVar.zzs;
        zzwk zzwkVar = zzmdVar.zzb;
        if (zzwkVar.zzb()) {
            return j;
        }
        zzaq(zzbfVar, zzwkVar, j);
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0453 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x045d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0469 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x047c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0488 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a5  */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzal(final com.google.android.gms.internal.ads.zzmd r43, final int r44, boolean r45, int r46, long r47, int r49, boolean r50) {
        /*
            Method dump skipped, instructions count: 1237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzks.zzal(com.google.android.gms.internal.ads.zzmd, int, boolean, int, long, int, boolean):void");
    }

    private static long zzam(zzmd zzmdVar) {
        zzbe zzbeVar = new zzbe();
        zzbd zzbdVar = new zzbd();
        zzbf zzbfVar = zzmdVar.zza;
        zzbfVar.zzo(zzmdVar.zzb.zza, zzbdVar);
        long j = zzmdVar.zzc;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L).zzl;
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.internal.ads.zzmd zzan(com.google.android.gms.internal.ads.zzmd r23, com.google.android.gms.internal.ads.zzbf r24, android.util.Pair r25) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzks.zzan(com.google.android.gms.internal.ads.zzmd, com.google.android.gms.internal.ads.zzbf, android.util.Pair):com.google.android.gms.internal.ads.zzmd");
    }

    private static zzmd zzao(zzmd zzmdVar, int i) {
        zzmd zzmdVarZze = zzmdVar.zze(i);
        return (i == 1 || i == 4) ? zzmdVarZze.zzg(false) : zzmdVarZze;
    }

    private final Pair zzap(zzbf zzbfVar, int i, long j) {
        if (zzbfVar.zzg()) {
            this.zzab = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzac = j;
            return null;
        }
        if (i == -1 || i >= zzbfVar.zza()) {
            i = zzbfVar.zzk(false);
            long j2 = zzbfVar.zzb(i, this.zza, 0L).zzl;
            j = zzfj.zzp(0L);
        }
        return zzbfVar.zzm(this.zza, this.zzp, i, zzfj.zzq(j));
    }

    private final long zzaq(zzbf zzbfVar, zzwk zzwkVar, long j) {
        zzbfVar.zzo(zzwkVar.zza, this.zzp);
        return j;
    }

    private final zzmh zzar(zzmg zzmgVar) {
        int iZzai = zzai(this.zzaa);
        zzbf zzbfVar = this.zzaa.zza;
        if (iZzai == -1) {
            iZzai = 0;
        }
        zzdn zzdnVar = this.zzv;
        zzlf zzlfVar = this.zzm;
        return new zzmh(zzlfVar, zzmgVar, zzbfVar, iZzai, zzdnVar, zzlfVar.zzn());
    }

    private final void zzas(Object obj) {
        Object obj2 = this.zzN;
        boolean z = false;
        if (obj2 != null && obj2 != obj) {
            z = true;
        }
        boolean zZzl = this.zzm.zzl(obj, z ? this.zzA : -9223372036854775807L);
        if (z) {
            Object obj3 = this.zzN;
            Surface surface = this.zzO;
            if (obj3 == surface) {
                surface.release();
                this.zzO = null;
            }
        }
        this.zzN = obj;
        if (zZzl) {
            return;
        }
        zzP(zziw.zzc(new zzlg(3), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzat, reason: merged with bridge method [inline-methods] */
    public final void zzS(final int i, final int i2) {
        if (i == this.zzQ.zza() && i2 == this.zzQ.zzb()) {
            return;
        }
        this.zzQ = new zzes(i, i2);
        zzed zzedVar = this.zzn;
        zzedVar.zzd(24, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkc
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                int i3 = zzks.zzd;
                ((zzaz) obj).zzu(i, i2);
            }
        });
        zzedVar.zze();
        zzaw(2, 14, new zzes(i, i2));
    }

    private final void zzau() {
        zzfp zzfpVar;
        boolean zZzk;
        int iZzh = zzh();
        if (iZzh == 2 || iZzh == 3) {
            zzav();
            boolean z = this.zzaa.zzp;
            this.zzy.zzb(zzk());
            zzfpVar = this.zzz;
            zZzk = zzk();
        } else {
            zZzk = false;
            this.zzy.zzb(false);
            zzfpVar = this.zzz;
        }
        zzfpVar.zza(zZzk);
    }

    private final void zzav() {
        this.zze.zzd();
        Looper looper = this.zzt;
        if (Thread.currentThread() != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = zzfj.zza;
            Locale locale = Locale.US;
            String strM = Vs.m("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.zzU) {
                throw new IllegalStateException(strM);
            }
            zzee.zzd("ExoPlayerImpl", strM, this.zzV ? null : new IllegalStateException());
            this.zzV = true;
        }
    }

    private final void zzaw(int i, int i2, Object obj) {
        zzml[] zzmlVarArr = this.zzh;
        int length = zzmlVarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zzml zzmlVar = zzmlVarArr[i3];
            if (i == -1 || zzmlVar.zza() == i) {
                zzmh zzmhVarZzar = zzar(zzmlVar);
                zzmhVarZzar.zzb(i2);
                zzmhVarZzar.zzd(obj);
                zzmhVarZzar.zzg();
            }
        }
        zzml[] zzmlVarArr2 = this.zzi;
        int length2 = zzmlVarArr2.length;
        for (int i4 = 0; i4 < 2; i4++) {
            zzml zzmlVar2 = zzmlVarArr2[i4];
            if (zzmlVar2 != null && (i == -1 || zzmlVar2.zza() == i)) {
                zzmh zzmhVarZzar2 = zzar(zzmlVar2);
                zzmhVarZzar2.zzb(i2);
                zzmhVarZzar2.zzd(obj);
                zzmhVarZzar2.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzA() {
        zzav();
        return zzaj(this.zzaa);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzB(float f) {
        zzav();
        String str = zzfj.zza;
        final float fMax = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.zzS == fMax) {
            return;
        }
        this.zzS = fMax;
        this.zzm.zzj(fMax);
        zzed zzedVar = this.zzn;
        zzedVar.zzd(22, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkh
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                int i = zzks.zzd;
                ((zzaz) obj).zzr(fMax);
            }
        });
        zzedVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzC(Surface surface) {
        zzav();
        zzas(surface);
        int i = surface == null ? 0 : -1;
        zzS(i, i);
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final void zzD(zzna zznaVar) {
        this.zzs.zzv(zznaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final void zzE(zzna zznaVar) {
        zzav();
        this.zzs.zzw(zznaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final int zzF() {
        zzav();
        int length = this.zzh.length;
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    @Override // com.google.android.gms.internal.ads.zzjh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzG(com.google.android.gms.internal.ads.zzwm r13) {
        /*
            r12 = this;
            r12.zzav()
            java.util.List r0 = java.util.Collections.singletonList(r13)
            r12.zzav()
            r12.zzav()
            com.google.android.gms.internal.ads.zzmd r1 = r12.zzaa
            r12.zzai(r1)
            r12.zzu()
            int r1 = r12.zzF
            r2 = 1
            int r1 = r1 + r2
            r12.zzF = r1
            java.util.List r1 = r12.zzq
            r1.clear()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r9 = 0
            r3 = r9
        L27:
            int r5 = r0.size()
            if (r3 >= r5) goto L4c
            com.google.android.gms.internal.ads.zzlz r5 = new com.google.android.gms.internal.ads.zzlz
            java.lang.Object r6 = r0.get(r3)
            com.google.android.gms.internal.ads.zzwm r6 = (com.google.android.gms.internal.ads.zzwm) r6
            boolean r7 = r12.zzr
            r5.<init>(r6, r7)
            r4.add(r5)
            java.lang.Object r6 = r5.zzb
            com.google.android.gms.internal.ads.zzwf r5 = r5.zza
            com.google.android.gms.internal.ads.zzko r7 = new com.google.android.gms.internal.ads.zzko
            r7.<init>(r6, r5)
            r1.add(r3, r7)
            int r3 = r3 + 1
            goto L27
        L4c:
            com.google.android.gms.internal.ads.zzyf r0 = r12.zzad
            int r3 = r4.size()
            com.google.android.gms.internal.ads.zzyf r0 = r0.zzg()
            com.google.android.gms.internal.ads.zzyf r0 = r0.zzf(r9, r3)
            r12.zzad = r0
            com.google.android.gms.internal.ads.zzmj r0 = new com.google.android.gms.internal.ads.zzmj
            com.google.android.gms.internal.ads.zzyf r3 = r12.zzad
            r0.<init>(r1, r3)
            boolean r1 = r0.zzg()
            r3 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L7c
            int r1 = r0.zza()
            if (r1 < 0) goto L76
            goto L7c
        L76:
            com.google.android.gms.internal.ads.zzw r1 = new com.google.android.gms.internal.ads.zzw
            r1.<init>(r0, r3, r5)
            throw r1
        L7c:
            int r1 = r0.zzk(r9)
            com.google.android.gms.internal.ads.zzmd r7 = r12.zzaa
            android.util.Pair r8 = r12.zzap(r0, r1, r5)
            com.google.android.gms.internal.ads.zzmd r7 = r12.zzan(r7, r0, r8)
            int r8 = r7.zze
            if (r8 != r2) goto L90
            r8 = r2
            goto La4
        L90:
            boolean r10 = r0.zzg()
            r11 = 4
            if (r10 == 0) goto L99
        L97:
            r8 = r11
            goto La4
        L99:
            if (r1 != r3) goto L9c
            goto La4
        L9c:
            int r0 = r0.zza()
            if (r1 < r0) goto La3
            goto L97
        La3:
            r8 = 2
        La4:
            com.google.android.gms.internal.ads.zzmd r10 = zzao(r7, r8)
            com.google.android.gms.internal.ads.zzlf r3 = r12.zzm
            long r6 = com.google.android.gms.internal.ads.zzfj.zzq(r5)
            com.google.android.gms.internal.ads.zzyf r8 = r12.zzad
            r5 = r1
            r3.zzy(r4, r5, r6, r8)
            com.google.android.gms.internal.ads.zzmd r0 = r12.zzaa
            com.google.android.gms.internal.ads.zzwk r0 = r0.zzb
            java.lang.Object r0 = r0.zza
            com.google.android.gms.internal.ads.zzwk r1 = r10.zzb
            java.lang.Object r1 = r1.zza
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Ld0
            com.google.android.gms.internal.ads.zzmd r0 = r12.zzaa
            com.google.android.gms.internal.ads.zzbf r0 = r0.zza
            boolean r0 = r0.zzg()
            if (r0 != 0) goto Ld0
            r3 = r2
            goto Ld1
        Ld0:
            r3 = r9
        Ld1:
            long r5 = r12.zzak(r10)
            r7 = -1
            r8 = 0
            r2 = 0
            r4 = 4
            r0 = r12
            r1 = r10
            r0.zzal(r1, r2, r3, r4, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzks.zzG(com.google.android.gms.internal.ads.zzwm):void");
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final void zzH() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzfj.zza;
        String strZza = zzal.zza();
        int length = String.valueOf(hexString).length();
        StringBuilder sb = new StringBuilder(length + 40 + String.valueOf(str).length() + 3 + String.valueOf(strZza).length() + 1);
        AbstractC3264qG.v(sb, "Release ", hexString, " [AndroidXMedia3/1.9.0-beta01] [", str);
        sb.append("] [");
        sb.append(strZza);
        sb.append("]");
        zzee.zzb("ExoPlayerImpl", sb.toString());
        zzav();
        this.zzy.zzb(false);
        this.zzz.zza(false);
        zzkr zzkrVar = this.zzD;
        if (zzkrVar != null && Build.VERSION.SDK_INT >= 34) {
            zzkrVar.zza();
        }
        this.zzC.zza();
        if (!this.zzm.zzm()) {
            zzed zzedVar = this.zzn;
            zzedVar.zzd(10, zzkg.zza);
            zzedVar.zze();
        }
        this.zzn.zzf();
        this.zzk.zzm(null);
        zzaas zzaasVar = this.zzu;
        zzmx zzmxVar = this.zzs;
        zzaasVar.zzg(zzmxVar);
        zzmd zzmdVar = this.zzaa;
        boolean z = zzmdVar.zzp;
        zzmd zzmdVarZzao = zzao(zzmdVar, 1);
        this.zzaa = zzmdVarZzao;
        zzmd zzmdVarZzh = zzmdVarZzao.zzh(zzmdVarZzao.zzb);
        this.zzaa = zzmdVarZzh;
        zzmdVarZzh.zzq = zzmdVarZzh.zzs;
        this.zzaa.zzr = 0L;
        zzmxVar.zzy();
        Surface surface = this.zzO;
        if (surface != null) {
            surface.release();
            this.zzO = null;
        }
        int i = zzcz.zza;
        this.zzX = true;
    }

    public final zziw zzI() {
        zzav();
        return this.zzaa.zzf;
    }

    public final /* synthetic */ void zzJ(zzaz zzazVar, zzs zzsVar) {
        zzazVar.zza(this.zzg, new zzay(zzsVar));
    }

    public final /* synthetic */ void zzK(final zzlc zzlcVar) {
        this.zzk.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzke
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzO(zzlcVar);
            }
        });
    }

    public final /* synthetic */ void zzL(int i, final int i2) {
        zzav();
        Integer numValueOf = Integer.valueOf(i2);
        zzaw(1, 10, numValueOf);
        zzaw(2, 10, numValueOf);
        zzdy zzdyVar = new zzdy() { // from class: com.google.android.gms.internal.ads.zzkd
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                int i3 = zzks.zzd;
                ((zzaz) obj).zzq(i2);
            }
        };
        zzed zzedVar = this.zzn;
        zzedVar.zzd(21, zzdyVar);
        zzedVar.zze();
    }

    public final /* synthetic */ void zzM() {
        String str = zzfj.zza;
        int iGenerateAudioSessionId = zzcj.zza(this.zzf).generateAudioSessionId();
        if (iGenerateAudioSessionId == -1) {
            iGenerateAudioSessionId = 0;
        }
        this.zzB.zzb(Integer.valueOf(iGenerateAudioSessionId));
    }

    public final /* synthetic */ void zzN(zzaz zzazVar) {
        zzazVar.zzg(this.zzL);
    }

    public final /* synthetic */ void zzO(zzlc zzlcVar) {
        int i;
        long j;
        int i2 = this.zzF - zzlcVar.zzb;
        this.zzF = i2;
        boolean z = true;
        if (zzlcVar.zzc) {
            this.zzG = zzlcVar.zzd;
            this.zzH = true;
        }
        if (i2 == 0) {
            zzbf zzbfVar = zzlcVar.zza.zza;
            if (!this.zzaa.zza.zzg() && zzbfVar.zzg()) {
                this.zzab = -1;
                this.zzac = 0L;
            }
            if (!zzbfVar.zzg()) {
                List listZzw = ((zzmj) zzbfVar).zzw();
                int size = listZzw.size();
                List list = this.zzq;
                zzgrc.zzi(size == list.size());
                for (int i3 = 0; i3 < listZzw.size(); i3++) {
                    ((zzko) list.get(i3)).zzc((zzbf) listZzw.get(i3));
                }
            }
            long j2 = -9223372036854775807L;
            if (this.zzH) {
                boolean z2 = zzlcVar.zza.zza.zzg() && this.zzaa.zza.zzg();
                boolean zEquals = zzlcVar.zza.zzb.equals(this.zzaa.zzb);
                long j3 = zzlcVar.zza.zzd;
                long j4 = this.zzaa.zzs;
                if (z2 || (zEquals && j3 == j4)) {
                    z = false;
                }
                if (z) {
                    int iZzs = zzs();
                    if (zzbfVar.zzg() || zzlcVar.zza.zzb.zzb()) {
                        j = zzlcVar.zza.zzd;
                    } else {
                        zzmd zzmdVar = zzlcVar.zza;
                        zzwk zzwkVar = zzmdVar.zzb;
                        j = zzmdVar.zzd;
                        zzaq(zzbfVar, zzwkVar, j);
                    }
                    j2 = j;
                    i = iZzs;
                } else {
                    i = -1;
                }
            } else {
                i = -1;
                z = false;
            }
            this.zzH = false;
            zzal(zzlcVar.zza, 1, z, this.zzG, j2, i, false);
        }
    }

    public final /* synthetic */ void zzQ(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzas(surface);
        this.zzO = surface;
    }

    public final /* synthetic */ void zzR(Object obj) {
        zzas(null);
    }

    public final /* synthetic */ void zzT(int i, int i2, Object obj) {
        zzaw(1, 19, obj);
    }

    public final /* synthetic */ zzed zzV() {
        return this.zzn;
    }

    public final /* synthetic */ zzmx zzW() {
        return this.zzs;
    }

    public final /* synthetic */ Looper zzX() {
        return this.zzt;
    }

    public final /* synthetic */ zzdn zzY() {
        return this.zzv;
    }

    public final /* synthetic */ zzdm zzZ() {
        return this.zzB;
    }

    public final /* synthetic */ Map zzaa() {
        return this.zzE;
    }

    public final /* synthetic */ Object zzab() {
        return this.zzN;
    }

    public final /* synthetic */ boolean zzac() {
        return this.zzT;
    }

    public final /* synthetic */ void zzad(boolean z) {
        this.zzT = z;
    }

    public final /* synthetic */ boolean zzae() {
        return this.zzX;
    }

    public final /* synthetic */ zzil zzaf() {
        return this.zzY;
    }

    public final /* synthetic */ void zzag(zzil zzilVar) {
        this.zzY = zzilVar;
    }

    @Override // com.google.android.gms.internal.ads.zzf
    public final void zzc(int i, long j, int i2, boolean z) {
        zzav();
        if (i == -1) {
            return;
        }
        zzgrc.zza(i >= 0);
        zzbf zzbfVar = this.zzaa.zza;
        if (zzbfVar.zzg() || i < zzbfVar.zza()) {
            this.zzs.zzA();
            this.zzF++;
            if (zzx()) {
                zzee.zzc("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzlc zzlcVar = new zzlc(this.zzaa);
                zzlcVar.zza(1);
                this.zzl.zza(zzlcVar);
                return;
            }
            zzmd zzmdVarZzao = this.zzaa;
            int i3 = zzmdVarZzao.zze;
            if (i3 == 3 || (i3 == 4 && !zzbfVar.zzg())) {
                zzmdVarZzao = zzao(this.zzaa, 2);
            }
            int iZzs = zzs();
            zzmd zzmdVarZzan = zzan(zzmdVarZzao, zzbfVar, zzap(zzbfVar, i, j));
            this.zzm.zzf(zzbfVar, i, zzfj.zzq(j));
            zzal(zzmdVarZzan, 0, true, 1, zzak(zzmdVarZzan), iZzs, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final Looper zzd() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zze(zzaz zzazVar) {
        zzazVar.getClass();
        this.zzn.zzb(zzazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzf(zzaz zzazVar) {
        zzav();
        zzazVar.getClass();
        this.zzn.zzc(zzazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzg() {
        zzav();
        zzmd zzmdVar = this.zzaa;
        if (zzmdVar.zze != 1) {
            return;
        }
        zzmd zzmdVarZzf = zzmdVar.zzf(null);
        zzmd zzmdVarZzao = zzao(zzmdVarZzf, true != zzmdVarZzf.zza.zzg() ? 2 : 4);
        this.zzF++;
        this.zzm.zzd();
        zzal(zzmdVarZzao, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzh() {
        zzav();
        return this.zzaa.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzi() {
        zzav();
        return this.zzaa.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzj(boolean z) {
        zzav();
        zzmd zzmdVar = this.zzaa;
        int i = zzmdVar.zzn;
        int i2 = 0;
        if (i == 1) {
            i = 1;
            if (!z) {
                i2 = 1;
            }
        }
        if (zzmdVar.zzl == z && i == i2 && zzmdVar.zzm == 1) {
            return;
        }
        this.zzF++;
        zzmd zzmdVarZzi = zzmdVar.zzi(z, 1, i2);
        this.zzm.zze(z, 1, i2);
        zzal(zzmdVarZzi, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzk() {
        zzav();
        return this.zzaa.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzl() {
        zzav();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzm() {
        zzav();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzav zzn() {
        zzav();
        return this.zzaa.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzo() {
        zzav();
        zzP(null);
        new zzcz(zzguf.zzi(), this.zzaa.zzs);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzbn zzp() {
        zzav();
        return this.zzaa.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzbf zzq() {
        zzav();
        return this.zzaa.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzr() {
        zzav();
        if (!this.zzaa.zza.zzg()) {
            zzmd zzmdVar = this.zzaa;
            return zzmdVar.zza.zze(zzmdVar.zzb.zza);
        }
        int i = this.zzab;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzs() {
        zzav();
        int iZzai = zzai(this.zzaa);
        if (iZzai == -1) {
            return 0;
        }
        return iZzai;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzt() {
        long jZzh;
        zzav();
        if (zzx()) {
            zzmd zzmdVar = this.zzaa;
            zzwk zzwkVar = zzmdVar.zzb;
            zzbf zzbfVar = zzmdVar.zza;
            Object obj = zzwkVar.zza;
            zzbd zzbdVar = this.zzp;
            zzbfVar.zzo(obj, zzbdVar);
            jZzh = zzbdVar.zzh(zzwkVar.zzb, zzwkVar.zzc);
        } else {
            zzbf zzbfVarZzq = zzq();
            if (zzbfVarZzq.zzg()) {
                return -9223372036854775807L;
            }
            jZzh = zzbfVarZzq.zzb(zzs(), this.zza, 0L).zzm;
        }
        return zzfj.zzp(jZzh);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzu() {
        zzav();
        return zzfj.zzp(zzak(this.zzaa));
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzv() {
        long j;
        zzav();
        if (zzx()) {
            zzmd zzmdVar = this.zzaa;
            if (!zzmdVar.zzk.equals(zzmdVar.zzb)) {
                return zzt();
            }
            j = this.zzaa.zzq;
        } else {
            zzav();
            if (this.zzaa.zza.zzg()) {
                return this.zzac;
            }
            zzmd zzmdVar2 = this.zzaa;
            long j2 = 0;
            if (zzmdVar2.zzk.zzd == zzmdVar2.zzb.zzd) {
                long j3 = zzmdVar2.zzq;
                if (this.zzaa.zzk.zzb()) {
                    zzmd zzmdVar3 = this.zzaa;
                    zzmdVar3.zza.zzo(zzmdVar3.zzk.zza, this.zzp).zzc(this.zzaa.zzk.zzb);
                } else {
                    j2 = j3;
                }
                zzmd zzmdVar4 = this.zzaa;
                zzaq(zzmdVar4.zza, zzmdVar4.zzk, j2);
                return zzfj.zzp(j2);
            }
            j = zzmdVar2.zza.zzb(zzs(), this.zza, 0L).zzm;
        }
        return zzfj.zzp(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzw() {
        zzav();
        return zzfj.zzp(this.zzaa.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzx() {
        zzav();
        return this.zzaa.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzy() {
        zzav();
        if (zzx()) {
            return this.zzaa.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzz() {
        zzav();
        if (zzx()) {
            return this.zzaa.zzb.zzc;
        }
        return -1;
    }
}
