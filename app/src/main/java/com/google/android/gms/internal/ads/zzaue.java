package com.google.android.gms.internal.ads;

import defpackage.Vs;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* loaded from: classes.dex */
public final /* synthetic */ class zzaue implements zzauy {
    public static final /* synthetic */ zzaue zza;
    public static final /* synthetic */ zzaue zzb;
    public static final /* synthetic */ zzaue zzc;
    public static final /* synthetic */ zzaue zzd;
    public static final /* synthetic */ zzaue zze;
    public static final /* synthetic */ zzaue zzf;
    public static final /* synthetic */ zzaue zzg;
    public static final /* synthetic */ zzaue zzh;
    public static final /* synthetic */ zzaue zzi;
    public static final /* synthetic */ zzaue zzj;
    public static final /* synthetic */ zzaue zzk;
    public static final /* synthetic */ zzaue zzl;
    public static final /* synthetic */ zzaue zzm;
    public static final /* synthetic */ zzaue zzn;
    public static final /* synthetic */ zzaue zzo;
    public static final /* synthetic */ zzaue zzp;
    public static final /* synthetic */ zzaue zzq;
    public static final /* synthetic */ zzaue zzr;
    public static final /* synthetic */ zzaue zzs;
    public static final /* synthetic */ zzaue zzt;
    public static final /* synthetic */ zzaue zzu;
    private final /* synthetic */ int zzv;

    static {
        int i = (((((~574682290) & 203332142) | 828655825) + ((574682290 & 488280686) | 1367367889)) - 2039730118) ^ (1891066487 % 382926234);
        int i2 = (((((~138700754) & 1311190796) | 1098494210) + ((138700754 & 235277837) | 2126145)) - 1303500118) ^ (631340353 % 54449299);
        int i3 = (((((~429857344) & 761470753) | 244716435) + ((429857344 & 862030880) | 1585885407)) - (-1912977126)) ^ (1209597698 % 1200977805);
        int i4 = (((((~353056618) & 587352576) | 1209239528) + ((353056618 & 1728108930) | 1420269559)) - (-1847305937)) ^ (1896236448 % 1127167744);
        int i5 = (((((~899633766) & 123837830) | 368257288) + ((899633766 & 167810182) | 1023429240)) - 1335244442) ^ (2104001379 % 2013966848);
        int i6 = (((((~1451163042) & 1144033732) | 979119168) + ((1451163042 & 1142985108) | 17523737)) - 1635219142) ^ (1178835412 % 674426555);
        int i7 = (((((~2129768394) & 1627076842) | 1930240353) + ((2129768394 & 384997514) | 369722160)) - (-1995771891)) ^ (1450967523 % 42186306);
        zzu = new zzaue((((((~880944650) & 1717883648) | 10231720) + ((880944650 & 1718140932) | 277359766)) - 1470954277) ^ (2122533302 % 1588279465));
        zzt = new zzaue((((((~2105342203) & 63587109) | 1700430907) + ((2105342203 & 42025732) | 358031402)) - 2053339984) ^ (1059789835 % 1012707329));
        zzs = new zzaue((((((~217704412) & 144255288) | 1174857666) + ((217704412 & 1788447288) | 1667270208)) - (-1441824169)) ^ (1234644696 % 220282619));
        zzr = new zzaue(i7);
        zzq = new zzaue(i4);
        zzp = new zzaue(i5);
        zzaue zzaueVar = new zzaue(i6);
        int i8 = (((((~363159161) & 562794784) | 672605403) + ((363159161 & 25727904) | 2081572569)) - (-1616076716)) ^ (912078408 % 135177290);
        int i9 = (((((~1362243428) & 18451060) | 1179867339) + ((1362243428 & 558662325) | 550966467)) - 1623872455) ^ (1106211926 % 327305250);
        int i10 = (((((~1725362297) & 1360741300) | 1109702041) + ((1725362297 & 354116135) | 1147188355)) - (-1834394863)) ^ (1760481135 % 279527351);
        int i11 = (((((~167368542) & 67146177) | 1656237739) + ((167368542 & 1145098568) | 1113671327)) - (-1733089599)) ^ (1999038585 % 574620392);
        int i12 = (((((~1855103807) & 659964675) | 1290440236) + ((1855103807 & 588562691) | 482511980)) - 1987315200) ^ (988506952 % 614340012);
        int i13 = (((((~309667127) & 3230344) | 101519449) + ((309667127 & 607439488) | 793023522)) - 846909944) ^ (1953534826 % 1902736997);
        int i14 = (((((~682736626) & 1985796848) | 208315317) + ((682736626 & 1922324801) | 8464129)) - 2089727599) ^ (649022765 % 608034986);
        int i15 = (((((~2068224547) & 575179716) | 1587938398) + ((2068224547 & 1013484418) | 1605526586)) - (-1152499266)) ^ (1603386966 % 1010764797);
        int i16 = (((((~1281944976) & 1463473736) | 847256033) + ((1281944976 & 1698424328) | 948255187)) - (-1974214194)) ^ (1727952741 % 1091714937);
        zzo = zzaueVar;
        zzn = new zzaue(i3);
        zzm = new zzaue(i8);
        zzl = new zzaue(i9);
        zzk = new zzaue(i10);
        zzj = new zzaue(i2);
        zzi = new zzaue(i11);
        zzh = new zzaue(i12);
        zzg = new zzaue(i13);
        zzf = new zzaue(i);
        zze = new zzaue(i14);
        zzd = new zzaue(i15);
        zzc = new zzaue(i16);
        zzb = new zzaue(1);
        zza = new zzaue(0);
    }

    private /* synthetic */ zzaue(int i) {
        this.zzv = i;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) throws zzave {
        zzatq zzatqVar;
        long jZzm;
        zzaup zzaupVar;
        zzaux zzauxVar;
        zzavg zzavgVarZzb;
        zzaux zzauxVar2;
        zzavg zzavgVarZzc;
        zzatq zzatqVar2;
        long j = 1;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        switch (this.zzv) {
                                            case 0:
                                                zzavb zzavbVar = (zzavb) obj;
                                                zzaux zzauxVar3 = zzavbVar.zzb;
                                                jZzm = zzauxVar3.zzc().zzm();
                                                if (zzauxVar3.zzc().zzm() != 0) {
                                                    zzaupVar = zzavbVar.zzd;
                                                    zzaupVar.zza(jZzm);
                                                }
                                                return Optional.empty();
                                            case 1:
                                                try {
                                                    zzaux zzauxVar4 = ((zzavb) obj).zzb;
                                                    long jZzm2 = zzauxVar4.zzc().zzm();
                                                    zzavg zzavgVarZzc2 = zzauxVar4.zzc();
                                                    zzavg zzavgVarZzc3 = zzauxVar4.zzc();
                                                    List listZzo = zzavgVarZzc3.zzo();
                                                    if (jZzm2 < 0) {
                                                        jZzm2 += listZzo.size() + 1;
                                                    }
                                                    if (jZzm2 < 0 || jZzm2 >= listZzo.size() + 1) {
                                                        throw new zzave();
                                                    }
                                                    listZzo.add((int) jZzm2, zzavgVarZzc2);
                                                    zzauxVar4.zzb(zzavgVarZzc3);
                                                    return Optional.empty();
                                                } catch (zzave unused) {
                                                    zzatqVar = zzatq.zzI;
                                                    return Optional.of(zzatqVar);
                                                }
                                            case 2:
                                                zzavb zzavbVar2 = (zzavb) obj;
                                                zzaux zzauxVar5 = zzavbVar2.zzb;
                                                jZzm = zzauxVar5.zzc().zzm();
                                                if (zzauxVar5.zzc().zzm() == 0) {
                                                    zzaupVar = zzavbVar2.zzd;
                                                    zzaupVar.zza(jZzm);
                                                }
                                                return Optional.empty();
                                            case 3:
                                                zzauxVar = ((zzavb) obj).zzb;
                                                zzavgVarZzb = zzavg.zzb(zzauxVar.zzc().zzo().size());
                                                zzauxVar.zzb(zzavgVarZzb);
                                                return Optional.empty();
                                            case 4:
                                                zzauxVar = ((zzavb) obj).zzb;
                                                zzavgVarZzb = zzavg.zzb(zzauxVar.zzc().zzn().zza.length);
                                                zzauxVar.zzb(zzavgVarZzb);
                                                return Optional.empty();
                                            case 5:
                                                zzauxVar2 = ((zzavb) obj).zzb;
                                                zzavgVarZzc = zzavg.zzc(Math.log(zzauxVar2.zzc().zzq()));
                                                zzauxVar2.zzb(zzavgVarZzc);
                                                return Optional.empty();
                                            case 6:
                                                zzauxVar2 = ((zzavb) obj).zzb;
                                                long jZzm3 = zzauxVar2.zzc().zzm();
                                                long jZzm4 = zzauxVar2.zzc().zzm();
                                                if (jZzm3 == 0 || jZzm4 == 0) {
                                                    j = 0;
                                                }
                                                zzavgVarZzc = zzavg.zzb(j);
                                                zzauxVar2.zzb(zzavgVarZzc);
                                                return Optional.empty();
                                            case 7:
                                                zzauxVar2 = ((zzavb) obj).zzb;
                                                if (zzauxVar2.zzc().zzm() != 0) {
                                                    j = 0;
                                                }
                                                zzavgVarZzc = zzavg.zzb(j);
                                                zzauxVar2.zzb(zzavgVarZzc);
                                                return Optional.empty();
                                            case 8:
                                                zzauxVar2 = ((zzavb) obj).zzb;
                                                long jZzm5 = zzauxVar2.zzc().zzm();
                                                long jZzm6 = zzauxVar2.zzc().zzm();
                                                if (jZzm5 == 0 && jZzm6 == 0) {
                                                    j = 0;
                                                }
                                                zzavgVarZzc = zzavg.zzb(j);
                                                zzauxVar2.zzb(zzavgVarZzc);
                                                return Optional.empty();
                                            case 9:
                                                zzavb zzavbVar3 = (zzavb) obj;
                                                zzaux zzauxVar6 = zzavbVar3.zzb;
                                                try {
                                                    int iCompare = new zzavc(false).compare(zzauxVar6.zzc(), zzauxVar6.zzc());
                                                    zzaux zzauxVar7 = zzavbVar3.zzb;
                                                    if (iCompare >= 0) {
                                                        j = 0;
                                                    }
                                                    zzauxVar7.zzb(zzavg.zzb(j));
                                                    return Optional.empty();
                                                } catch (IllegalArgumentException unused2) {
                                                    return Optional.of(zzatq.zzd);
                                                }
                                            case 10:
                                                int[] iArr = {1944216249, 348137722, 926438168, 13122018, 1882968836, -1273372307, 246144337, 1723705710, 1677157265};
                                                int i = iArr[0];
                                                int i2 = iArr[1];
                                                int i3 = iArr[2];
                                                int i4 = iArr[3];
                                                int i5 = iArr[4];
                                                int i6 = iArr[5];
                                                int i7 = iArr[6];
                                                int i8 = iArr[7];
                                                int iE = Vs.e((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
                                                int i9 = i8 % 1677157265;
                                                zzavb zzavbVar4 = (zzavb) obj;
                                                try {
                                                    zzaux zzauxVar8 = zzavbVar4.zzb;
                                                    long jZzm7 = zzauxVar8.zzc().zzm();
                                                    zzatw zzatwVar = zzavbVar4.zza;
                                                    zzaux zzauxVar9 = new zzaux(i9 ^ iE);
                                                    for (int i10 = 0; i10 < zzauxVar8.zzb; i10++) {
                                                        try {
                                                            zzauxVar9.zzb(zzavg.zzj((zzavg) zzauxVar8.zza.get(i10)));
                                                        } catch (zzauw e) {
                                                            throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e);
                                                        }
                                                    }
                                                    zzaup zzaupVar2 = zzavbVar4.zzd;
                                                    new zzavb(zzatwVar, zzauxVar9, new zzaup(zzaupVar2.zzb, zzaupVar2.zza, zzaupVar2.zzc.zzc(), zzaupVar2.zzd)).zzd.zza(jZzm7);
                                                    zzauxVar8.zzb(zzavg.zza(new zzaug()));
                                                    return Optional.empty();
                                                } catch (zzaun | zzauo unused3) {
                                                    zzatqVar = zzatq.zzt;
                                                    return Optional.of(zzatqVar);
                                                }
                                            case 11:
                                                try {
                                                    zzaux zzauxVar10 = ((zzavb) obj).zzb;
                                                    zzauxVar10.zzb(zzavg.zza(zzauxVar10.zzc().zzi((Class) zzauxVar10.zzc().zzl())));
                                                    return Optional.empty();
                                                } catch (zzavd unused4) {
                                                    zzatqVar = zzatq.zzp;
                                                    return Optional.of(zzatqVar);
                                                }
                                            case 12:
                                                zzauxVar2 = ((zzavb) obj).zzb;
                                                long jZzm8 = zzauxVar2.zzc().zzm();
                                                long jZzm9 = zzauxVar2.zzc().zzm();
                                                if (jZzm8 == 0) {
                                                    return Optional.of(zzatq.zzF);
                                                }
                                                zzavgVarZzc = zzavg.zzb(jZzm9 % jZzm8);
                                                zzauxVar2.zzb(zzavgVarZzc);
                                                return Optional.empty();
                                            case 13:
                                                zzauxVar2 = ((zzavb) obj).zzb;
                                                zzavgVarZzc = zzavg.zzc(zzauxVar2.zzc().zzq() * zzauxVar2.zzc().zzq());
                                                zzauxVar2.zzb(zzavgVarZzc);
                                                return Optional.empty();
                                            case 14:
                                                zzauxVar2 = ((zzavb) obj).zzb;
                                                zzavgVarZzc = zzavg.zzb(zzauxVar2.zzc().zzm() * zzauxVar2.zzc().zzm());
                                                zzauxVar2.zzb(zzavgVarZzc);
                                                return Optional.empty();
                                            case 15:
                                                zzauxVar = ((zzavb) obj).zzb;
                                                long jZzm10 = zzauxVar.zzc().zzm();
                                                ArrayList arrayList = new ArrayList();
                                                for (long j2 = 0; j2 < jZzm10; j2++) {
                                                    arrayList.add(zzauxVar.zzc());
                                                }
                                                Collections.reverse(arrayList);
                                                zzavgVarZzb = zzavg.zze(arrayList);
                                                zzauxVar.zzb(zzavgVarZzb);
                                                return Optional.empty();
                                            case 16:
                                                zzauxVar2 = ((zzavb) obj).zzb;
                                                zzavgVarZzc = zzavg.zzc(Math.pow(zzauxVar2.zzc().zzq(), zzauxVar2.zzc().zzq()));
                                                zzauxVar2.zzb(zzavgVarZzc);
                                                return Optional.empty();
                                            case 17:
                                                ((zzavb) obj).zzb.zzb(zzavg.zza(null));
                                                return Optional.empty();
                                            case 18:
                                                zzavb zzavbVar5 = (zzavb) obj;
                                                ByteBuffer byteBufferWrap = ByteBuffer.wrap(zzavbVar5.zzd.zzf(64L).zza());
                                                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                                                zzavbVar5.zzb.zzb(zzavg.zzc(Double.longBitsToDouble(byteBufferWrap.getLong())));
                                                return Optional.empty();
                                            case 19:
                                                zzavb zzavbVar6 = (zzavb) obj;
                                                zzavbVar6.zzb.zzb(zzavg.zzb(zzavbVar6.zzd.zze()));
                                                return Optional.empty();
                                            default:
                                                zzavb zzavbVar7 = (zzavb) obj;
                                                zzaup zzaupVar3 = zzavbVar7.zzd;
                                                long jZze = zzaupVar3.zze();
                                                if (jZze < 0 || jZze > 2147483647L) {
                                                    zzatqVar2 = zzatq.zzz;
                                                } else {
                                                    if ((7 & jZze) == 0) {
                                                        zzavbVar7.zzb.zzb(zzavg.zzd(zzaupVar3.zzf(jZze)));
                                                        return Optional.empty();
                                                    }
                                                    zzatqVar2 = zzatq.zze;
                                                }
                                                return Optional.of(zzatqVar2);
                                        }
                                    } catch (zzauv unused5) {
                                        zzatqVar = zzatq.zzx;
                                    }
                                } catch (zzauw e2) {
                                    e = e2;
                                    throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e);
                                }
                            } catch (zzaum unused6) {
                                zzatqVar = zzatq.zzD;
                            }
                        } catch (zzaun e3) {
                            e = e3;
                            throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e);
                        }
                    } catch (zzavd unused7) {
                        zzatqVar = zzatq.zzy;
                    }
                } catch (zzauo unused8) {
                    zzatqVar = zzatq.zzz;
                }
            } catch (zzauw unused9) {
                zzatqVar = zzatq.zza;
            }
        } catch (zzaun | zzauo unused10) {
            zzatqVar = zzatq.zzi;
        }
    }
}
