package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/* loaded from: classes.dex */
public final /* synthetic */ class zzauh implements zzauy {
    public static final /* synthetic */ zzauh zza;
    public static final /* synthetic */ zzauh zzb;
    public static final /* synthetic */ zzauh zzc;
    public static final /* synthetic */ zzauh zzd;
    public static final /* synthetic */ zzauh zze;
    public static final /* synthetic */ zzauh zzf;
    public static final /* synthetic */ zzauh zzg;
    public static final /* synthetic */ zzauh zzh;
    public static final /* synthetic */ zzauh zzi;
    public static final /* synthetic */ zzauh zzj;
    public static final /* synthetic */ zzauh zzk;
    public static final /* synthetic */ zzauh zzl;
    public static final /* synthetic */ zzauh zzm;
    public static final /* synthetic */ zzauh zzn;
    public static final /* synthetic */ zzauh zzo;
    public static final /* synthetic */ zzauh zzp;
    private final /* synthetic */ int zzq;

    static {
        int i = (((((~358984857) & 11257432) | 369424399) + ((358984857 & 615188052) | 873771151)) - 1245366369) ^ (1985433483 % 395279207);
        int i2 = (((((~1402492972) & 1009329808) | 1643537068) + ((1402492972 & 503911450) | 580170602)) - (-2136216298)) ^ (1489001354 % 953691761);
        int i3 = (((((~1389079342) & 405954790) | 5768193) + ((1389079342 & 967468022) | 1640566552)) - 1618010502) ^ (1588695568 % 1155465115);
        int i4 = (((((~1666231349) & 289538432) | 621649449) + ((1666231349 & 406985104) | 264059443)) - 1093855303) ^ (1698487330 % 272312086);
        int i5 = (((((~1953161956) & 2021553924) | 1308628610) + ((1953161956 & 813590916) | 134225131)) - 2074905685) ^ (1172063133 % 990526343);
        int i6 = (((((~1889804310) & 69748745) | 707083896) + ((1889804310 & 604795185) | 951435262)) - 1284100923) ^ (1663080928 % 610506582);
        int i7 = (((((~279121308) & 136482862) | 293951273) + ((279121308 & 1302561302) | 1440046744)) - 1857458389) ^ (1404515797 % 695748720);
        int i8 = (((((~1460082195) & 849562858) | 543970048) + ((1460082195 & 381881578) | 1279262981)) - 1872584419) ^ (1122336503 % 861109485);
        int i9 = (((((~70788355) & 1377181904) | 713084892) + ((70788355 & 1410740224) | 99160279)) - 1955016785) ^ (1156541312 % 318561886);
        int i10 = (((((~12895151) & 1277237303) | 185162640) + ((12895151 & 1411547303) | 306429832)) - 1475739783) ^ (1498617647 % 669908538);
        int i11 = (((((~1566288819) & 1018167620) | 793479703) + ((1566288819 & 284165456) | 1648575546)) - (-1895196318)) ^ (846942590 % 524688209);
        int i12 = (((((~1540846267) & 571107379) | 1484708373) + ((1540846267 & 709108258) | 1568035525)) - (-834164565)) ^ (2037335344 % 1874960596);
        zzp = new zzauh((((((~1245644428) & 268473430) | 2019232319) + ((1245644428 & 2266696) | 1693582250)) - (-827594116)) ^ (1308581515 % 354367395));
        zzo = new zzauh((((((~464837581) & 1181588952) | 603091067) + ((464837581 & 1544523140) | 967967255)) - (-2124025763)) ^ (1295815494 % 753959819));
        zzn = new zzauh(i12);
        zzm = new zzauh(i3);
        zzl = new zzauh(i4);
        zzk = new zzauh(i5);
        zzj = new zzauh(i2);
        zzi = new zzauh(i6);
        zzh = new zzauh(i7);
        zzg = new zzauh(i8);
        zzf = new zzauh(i);
        zze = new zzauh(i9);
        zzd = new zzauh(i10);
        zzc = new zzauh(i11);
        zzb = new zzauh(1);
        zza = new zzauh(0);
    }

    private /* synthetic */ zzauh(int i) {
        this.zzq = i;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) throws zzave {
        zzatq zzatqVar;
        zzaux zzauxVar;
        zzavg zzavgVarZzd;
        zzaux zzauxVar2;
        zzavg zzavgVarZzb;
        zzaux zzauxVar3;
        zzavg zzavgVarZzd2;
        zzavg zzavgVarZzc;
        zzavb zzavbVar = (zzavb) obj;
        try {
            try {
                try {
                    try {
                        try {
                            switch (this.zzq) {
                                case 0:
                                    return zzavbVar.zza();
                                case 1:
                                    try {
                                        zzaux zzauxVar4 = zzavbVar.zzb;
                                        long jZzm = zzauxVar4.zzc().zzm();
                                        zzavg zzavgVarZzc2 = zzauxVar4.zzc();
                                        List listZzo = zzavgVarZzc2.zzo();
                                        if (jZzm < 0) {
                                            jZzm += listZzo.size();
                                        }
                                        if (jZzm < 0 || jZzm >= listZzo.size()) {
                                            throw new zzave();
                                        }
                                        listZzo.remove((int) jZzm);
                                        zzauxVar4.zzb(zzavgVarZzc2);
                                        return Optional.empty();
                                    } catch (zzave unused) {
                                        zzatqVar = zzatq.zzI;
                                        return Optional.of(zzatqVar);
                                    }
                                case 2:
                                    zzaux zzauxVar5 = zzavbVar.zzb;
                                    zzavg zzavgVarZzc3 = zzauxVar5.zzc();
                                    zzauk zzaukVarZzn = zzauxVar5.zzc().zzn();
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    zzavgVarZzc3.zzk(byteArrayOutputStream);
                                    zzauk zzaukVarZzd = zzaukVarZzn.zzd(zzauk.zze(byteArrayOutputStream.toByteArray()));
                                    zzauxVar = zzavbVar.zzb;
                                    zzavgVarZzd = zzavg.zzd(zzaukVarZzd);
                                    zzauxVar.zzb(zzavgVarZzd);
                                    return Optional.empty();
                                case 3:
                                    zzaux zzauxVar6 = zzavbVar.zzb;
                                    zzavg zzavgVarZzc4 = zzauxVar6.zzc();
                                    zzauk zzaukVarZzn2 = zzauxVar6.zzc().zzn();
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    zzaug.zzb(zzavgVarZzc4.zzm(), new zzavf(byteArrayOutputStream2, 4), false);
                                    zzauk zzaukVarZzd2 = zzaukVarZzn2.zzd(zzauk.zze(byteArrayOutputStream2.toByteArray()));
                                    zzauxVar = zzavbVar.zzb;
                                    zzavgVarZzd = zzavg.zzd(zzaukVarZzd2);
                                    zzauxVar.zzb(zzavgVarZzd);
                                    return Optional.empty();
                                case 4:
                                    zzavbVar.zzb.zze(-(zzavbVar.zzc.zzb().zzb + zzavbVar.zzd.zze()), zzavbVar.zzb.zzc());
                                    return Optional.empty();
                                case 5:
                                    zzauxVar2 = zzavbVar.zzb;
                                    zzavgVarZzb = zzavg.zzb(zzauxVar2.zzc().zzm() << ((int) zzauxVar2.zzc().zzm()));
                                    zzauxVar2.zzb(zzavgVarZzb);
                                    return Optional.empty();
                                case 6:
                                    zzauxVar2 = zzavbVar.zzb;
                                    zzavgVarZzb = zzavg.zzb(zzauxVar2.zzc().zzm() >>> ((int) zzauxVar2.zzc().zzm()));
                                    zzauxVar2.zzb(zzavgVarZzb);
                                    return Optional.empty();
                                case 7:
                                    zzauxVar2 = zzavbVar.zzb;
                                    zzavgVarZzb = zzavg.zzc(zzauxVar2.zzc().zzq() - zzauxVar2.zzc().zzq());
                                    zzauxVar2.zzb(zzavgVarZzb);
                                    return Optional.empty();
                                case 8:
                                    zzauxVar2 = zzavbVar.zzb;
                                    zzavgVarZzb = zzavg.zzb(zzauxVar2.zzc().zzm() - zzauxVar2.zzc().zzm());
                                    zzauxVar2.zzb(zzavgVarZzb);
                                    return Optional.empty();
                                case 9:
                                    zzaux zzauxVar7 = zzavbVar.zzb;
                                    long jZzm2 = zzauxVar7.zzc().zzm();
                                    zzavg zzavgVarZzc5 = zzauxVar7.zzc();
                                    zzauxVar3 = zzavbVar.zzb;
                                    zzavgVarZzd2 = zzauxVar3.zzd(jZzm2);
                                    zzauxVar3.zze(jZzm2, zzavgVarZzc5);
                                    zzauxVar3.zzb(zzavgVarZzd2);
                                    return Optional.empty();
                                case 10:
                                    zzaux zzauxVar8 = zzavbVar.zzb;
                                    long jZzm3 = zzavbVar.zzc.zzb().zzb + zzauxVar8.zzc().zzm();
                                    zzavg zzavgVarZzc6 = zzauxVar8.zzc();
                                    zzauxVar3 = zzavbVar.zzb;
                                    long j = -jZzm3;
                                    zzavgVarZzd2 = zzauxVar3.zzd(j);
                                    zzauxVar3.zze(j, zzavgVarZzc6);
                                    zzauxVar3.zzb(zzavgVarZzd2);
                                    return Optional.empty();
                                case 11:
                                    long jZze = zzavbVar.zzc.zzb().zzb + zzavbVar.zzd.zze();
                                    zzavg zzavgVarZzc7 = zzavbVar.zzb.zzc();
                                    zzauxVar3 = zzavbVar.zzb;
                                    long j2 = -jZze;
                                    zzavgVarZzd2 = zzauxVar3.zzd(j2);
                                    zzauxVar3.zze(j2, zzavgVarZzc7);
                                    zzauxVar3.zzb(zzavgVarZzd2);
                                    return Optional.empty();
                                case 12:
                                    long jZzm4 = zzavbVar.zzb.zzc().zzm();
                                    try {
                                        zzaux zzauxVar9 = zzavbVar.zzb;
                                        if (jZzm4 == 0) {
                                            zzavgVarZzc = zzauxVar9.zzc();
                                        } else {
                                            zzauxVar9.zzb--;
                                            zzavgVarZzc = (zzavg) zzauxVar9.zza.remove(zzauxVar9.zza(jZzm4));
                                        }
                                        zzauxVar9.zzb(zzavgVarZzc);
                                        return Optional.empty();
                                    } catch (zzauv unused2) {
                                        zzatqVar = zzatq.zzg;
                                        return Optional.of(zzatqVar);
                                    }
                                case 13:
                                    try {
                                        zzaux zzauxVar10 = zzavbVar.zzb;
                                        long jZzm5 = zzauxVar10.zzc().zzm();
                                        long jZzm6 = zzauxVar10.zzc().zzm();
                                        zzauu zzauuVar = zzavbVar.zzc;
                                        zzaup zzaupVar = zzavbVar.zzd;
                                        zzauuVar.zza(zzaupVar.zzb(), jZzm6, zzauuVar.zzb().zzb);
                                        zzaupVar.zza(jZzm5);
                                        return Optional.empty();
                                    } catch (zzaun | zzauo unused3) {
                                        zzatqVar = zzatq.zzr;
                                        return Optional.of(zzatqVar);
                                    } catch (zzaus unused4) {
                                        zzatqVar = zzatq.zzB;
                                        return Optional.of(zzatqVar);
                                    } catch (zzaut unused5) {
                                        zzatqVar = zzatq.zzw;
                                        return Optional.of(zzatqVar);
                                    }
                                case 14:
                                    try {
                                        zzavbVar.zzb.zzb(zzavg.zzg(zzavbVar.zzb.zzc().zzl()));
                                        return Optional.empty();
                                    } catch (zzavd unused6) {
                                        zzatqVar = zzatq.zzp;
                                        return Optional.of(zzatqVar);
                                    }
                                default:
                                    try {
                                        zzaux zzauxVar11 = zzavbVar.zzb;
                                        Iterator it = zzauxVar11.zzc().zzo().iterator();
                                        while (it.hasNext()) {
                                            zzauxVar11.zzb((zzavg) it.next());
                                        }
                                        return Optional.empty();
                                    } catch (zzauw unused7) {
                                        zzatqVar = zzatq.zza;
                                        return Optional.of(zzatqVar);
                                    }
                            }
                        } catch (zzavd unused8) {
                            zzatqVar = zzatq.zzk;
                        } catch (IOException e) {
                            e = e;
                            throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e);
                        }
                    } catch (zzaut | zzauv unused9) {
                        zzatqVar = zzatq.zzx;
                    }
                } catch (zzaum | zzauo | zzavd unused10) {
                    zzatqVar = zzatq.zzy;
                }
            } catch (zzauv unused11) {
                zzatqVar = zzatq.zzh;
            }
        } catch (zzauw e2) {
            e = e2;
            throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e);
        }
    }
}
