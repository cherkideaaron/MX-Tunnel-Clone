package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.AP;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes.dex */
public final class zzajh implements zzaeu {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private long zzA;
    private long zzB;
    private boolean zzC;
    private boolean zzD;
    private zzajg zzE;
    private boolean zzF;
    private int zzG;
    private long zzH;
    private final SparseArray zzI;
    private boolean zzJ;
    private long zzK;
    private int zzL;
    private long zzM;
    private long zzN;
    private int zzO;
    private boolean zzP;
    private long zzQ;
    private long zzR;
    private long zzS;
    private boolean zzT;
    private int zzU;
    private long zzV;
    private long zzW;
    private int zzX;
    private int zzY;
    private int[] zzZ;
    private int zzaa;
    private int zzab;
    private int zzac;
    private int zzad;
    private boolean zzae;
    private long zzaf;
    private int zzag;
    private int zzah;
    private int zzai;
    private boolean zzaj;
    private boolean zzak;
    private boolean zzal;
    private int zzam;
    private byte zzan;
    private boolean zzao;
    private zzaex zzap;
    private final zzaja zzaq;
    private final zzajj zzh;
    private final SparseArray zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final zzamd zzl;
    private final zzer zzm;
    private final zzer zzn;
    private final zzer zzo;
    private final zzer zzp;
    private final zzer zzq;
    private final zzer zzr;
    private final zzer zzs;
    private final zzer zzt;
    private final zzer zzu;
    private final zzer zzv;
    private ByteBuffer zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        String str = zzfj.zza;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        zzd = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zze = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zzf = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        zzg = Collections.unmodifiableMap(map);
    }

    @Deprecated
    public zzajh() {
        this(new zzaja(), 2, zzamd.zza);
    }

    private static int[] zzA(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    private final void zzB() {
        if (!this.zzD) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i >= sparseArray.size()) {
                zzaex zzaexVar = this.zzap;
                zzaexVar.getClass();
                zzaexVar.zzv();
                this.zzD = false;
                return;
            }
            if (((zzajg) sparseArray.valueAt(i)).zzV) {
                return;
            } else {
                i++;
            }
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private final void zzq(int i) throws zzat {
        if (this.zzE != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 32);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a TrackEntry");
        throw zzat.zzb(sb.toString(), null);
    }

    private final void zzr(int i) throws zzat {
        if (this.zzJ) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a Cues");
        throw zzat.zzb(sb.toString(), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ec  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzs(com.google.android.gms.internal.ads.zzajg r19, long r20, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajh.zzs(com.google.android.gms.internal.ads.zzajg, long, int, int, int):void");
    }

    private final void zzt(zzaev zzaevVar, int i) {
        zzer zzerVar = this.zzo;
        if (zzerVar.zze() >= i) {
            return;
        }
        if (zzerVar.zzj() < i) {
            int iZzj = zzerVar.zzj();
            zzerVar.zzc(Math.max(iZzj + iZzj, i));
        }
        zzaevVar.zzc(zzerVar.zzi(), zzerVar.zze(), i - zzerVar.zze());
        zzerVar.zzf(i);
    }

    @RequiresNonNull({"#2.output"})
    private final int zzu(zzaev zzaevVar, zzajg zzajgVar, int i, boolean z) throws zzat {
        int i2;
        String str = zzajgVar.zzc;
        if ("S_TEXT/UTF8".equals(str)) {
            zzw(zzaevVar, zzb, i);
        } else if ("S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str)) {
            zzw(zzaevVar, zzd, i);
        } else if ("S_TEXT/WEBVTT".equals(str)) {
            zzw(zzaevVar, zze, i);
        } else {
            if (zzajgVar.zzV) {
                zzajgVar.zzZ.getClass();
                zzer zzerVar = new zzer(i);
                if (zzaevVar.zzh(zzerVar.zzi(), 0, i, true)) {
                    zzaevVar.zzl();
                    if (zzaet.zza(zzerVar.zzr()) == 1 && zzerVar.zzd() >= 10) {
                        byte[] bArr = new byte[10];
                        zzerVar.zzm(bArr, 0, 10);
                        zzerVar.zzh(0);
                        int iZzc = zzaet.zzc(bArr);
                        if (zzerVar.zzd() >= iZzc + 4) {
                            zzerVar.zzk(iZzc);
                            if (zzaet.zza(zzerVar.zzB()) == 2) {
                                zzt zztVarZza = zzajgVar.zzZ.zza();
                                zztVarZza.zzm("audio/vnd.dts.hd");
                                zzajgVar.zzZ = zztVarZza.zzM();
                            }
                        }
                    }
                }
                zzajgVar.zzY.zzz(zzajgVar.zzZ);
                zzajgVar.zzV = false;
                zzB();
            }
            zzagh zzaghVar = zzajgVar.zzY;
            if (!this.zzaj) {
                if (zzajgVar.zzh) {
                    this.zzac &= -1073741825;
                    boolean z2 = this.zzak;
                    int i3 = UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (!z2) {
                        zzer zzerVar2 = this.zzo;
                        zzaevVar.zzc(zzerVar2.zzi(), 0, 1);
                        this.zzag++;
                        if ((zzerVar2.zzi()[0] & 128) == 128) {
                            throw zzat.zzb("Extension bit is set in signal byte", null);
                        }
                        this.zzan = zzerVar2.zzi()[0];
                        this.zzak = true;
                    }
                    byte b = this.zzan;
                    if ((b & 1) == 1) {
                        int i4 = b & 2;
                        this.zzac |= 1073741824;
                        if (!this.zzao) {
                            zzer zzerVar3 = this.zzt;
                            zzaevVar.zzc(zzerVar3.zzi(), 0, 8);
                            this.zzag += 8;
                            this.zzao = true;
                            zzer zzerVar4 = this.zzo;
                            if (i4 != 2) {
                                i3 = 0;
                            }
                            zzerVar4.zzi()[0] = (byte) (i3 | 8);
                            zzerVar4.zzh(0);
                            zzaghVar.zzd(zzerVar4, 1, 1);
                            this.zzah++;
                            zzerVar3.zzh(0);
                            zzaghVar.zzd(zzerVar3, 8, 1);
                            this.zzah += 8;
                        }
                        if (i4 == 2) {
                            if (!this.zzal) {
                                zzer zzerVar5 = this.zzo;
                                zzaevVar.zzc(zzerVar5.zzi(), 0, 1);
                                this.zzag++;
                                zzerVar5.zzh(0);
                                this.zzam = zzerVar5.zzs();
                                this.zzal = true;
                            }
                            int i5 = this.zzam * 4;
                            zzer zzerVar6 = this.zzo;
                            zzerVar6.zza(i5);
                            zzaevVar.zzc(zzerVar6.zzi(), 0, i5);
                            this.zzag += i5;
                            int i6 = (this.zzam >> 1) + 1;
                            int i7 = (i6 * 6) + 2;
                            ByteBuffer byteBuffer = this.zzw;
                            if (byteBuffer == null || byteBuffer.capacity() < i7) {
                                this.zzw = ByteBuffer.allocate(i7);
                            }
                            this.zzw.position(0);
                            this.zzw.putShort((short) i6);
                            int i8 = 0;
                            int i9 = 0;
                            while (true) {
                                i2 = this.zzam;
                                if (i8 >= i2) {
                                    break;
                                }
                                int iZzH = zzerVar6.zzH();
                                int i10 = iZzH - i9;
                                if (i8 % 2 == 0) {
                                    this.zzw.putShort((short) i10);
                                } else {
                                    this.zzw.putInt(i10);
                                }
                                i8++;
                                i9 = iZzH;
                            }
                            int i11 = (i - this.zzag) - i9;
                            if ((i2 & 1) == 1) {
                                this.zzw.putInt(i11);
                            } else {
                                this.zzw.putShort((short) i11);
                                this.zzw.putInt(0);
                            }
                            zzer zzerVar7 = this.zzu;
                            zzerVar7.zzb(this.zzw.array(), i7);
                            zzaghVar.zzd(zzerVar7, i7, 1);
                            this.zzah += i7;
                        }
                    }
                } else {
                    byte[] bArr2 = zzajgVar.zzi;
                    if (bArr2 != null) {
                        this.zzr.zzb(bArr2, bArr2.length);
                    }
                }
                if (!"A_OPUS".equals(zzajgVar.zzc) ? zzajgVar.zzg > 0 : z) {
                    this.zzac |= 268435456;
                    this.zzv.zza(0);
                    int iZze = (this.zzr.zze() + i) - this.zzag;
                    zzer zzerVar8 = this.zzo;
                    zzerVar8.zza(4);
                    zzerVar8.zzi()[0] = (byte) ((iZze >> 24) & 255);
                    zzerVar8.zzi()[1] = (byte) ((iZze >> 16) & 255);
                    zzerVar8.zzi()[2] = (byte) ((iZze >> 8) & 255);
                    zzerVar8.zzi()[3] = (byte) (iZze & 255);
                    zzaghVar.zzd(zzerVar8, 4, 2);
                    this.zzah += 4;
                }
                this.zzaj = true;
            }
            zzer zzerVar9 = this.zzr;
            int iZze2 = zzerVar9.zze() + i;
            String str2 = zzajgVar.zzc;
            if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
                if (zzajgVar.zzU != null) {
                    zzgrc.zzi(zzerVar9.zze() == 0);
                    zzajgVar.zzU.zzb(zzaevVar);
                }
                while (true) {
                    int i12 = this.zzag;
                    if (i12 >= iZze2) {
                        break;
                    }
                    int iZzy = zzy(zzaevVar, zzaghVar, iZze2 - i12);
                    this.zzag += iZzy;
                    this.zzah += iZzy;
                }
            } else {
                zzer zzerVar10 = this.zzn;
                byte[] bArrZzi = zzerVar10.zzi();
                bArrZzi[0] = 0;
                bArrZzi[1] = 0;
                bArrZzi[2] = 0;
                int i13 = zzajgVar.zzaa;
                int i14 = 4 - i13;
                while (this.zzag < iZze2) {
                    int i15 = this.zzai;
                    if (i15 == 0) {
                        int iMin = Math.min(i13, zzerVar9.zzd());
                        zzaevVar.zzc(bArrZzi, i14 + iMin, i13 - iMin);
                        if (iMin > 0) {
                            zzerVar9.zzm(bArrZzi, i14, iMin);
                        }
                        this.zzag += i13;
                        zzerVar10.zzh(0);
                        this.zzai = zzerVar10.zzH();
                        zzer zzerVar11 = this.zzm;
                        zzerVar11.zzh(0);
                        zzaghVar.zzc(zzerVar11, 4);
                        this.zzah += 4;
                    } else {
                        int iZzy2 = zzy(zzaevVar, zzaghVar, i15);
                        this.zzag += iZzy2;
                        this.zzah += iZzy2;
                        this.zzai -= iZzy2;
                    }
                }
            }
            if ("A_VORBIS".equals(zzajgVar.zzc)) {
                zzer zzerVar12 = this.zzp;
                zzerVar12.zzh(0);
                zzaghVar.zzc(zzerVar12, 4);
                this.zzah += 4;
            }
        }
        int i16 = this.zzah;
        zzv();
        return i16;
    }

    private final void zzv() {
        this.zzag = 0;
        this.zzah = 0;
        this.zzai = 0;
        this.zzaj = false;
        this.zzak = false;
        this.zzal = false;
        this.zzam = 0;
        this.zzan = (byte) 0;
        this.zzao = false;
        this.zzr.zza(0);
    }

    private final void zzw(zzaev zzaevVar, byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = length + i;
        zzer zzerVar = this.zzs;
        if (zzerVar.zzj() < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2 + i);
            zzerVar.zzb(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, zzerVar.zzi(), 0, length);
        }
        zzaevVar.zzc(zzerVar.zzi(), length, i);
        zzerVar.zzh(0);
        zzerVar.zzf(i2);
    }

    private static byte[] zzx(long j, String str, long j2) {
        zzgrc.zza(j != -9223372036854775807L);
        Locale locale = Locale.US;
        int i = (int) (j / 3600000000L);
        Integer numValueOf = Integer.valueOf(i);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i2);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        String str3 = zzfj.zza;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    private final int zzy(zzaev zzaevVar, zzagh zzaghVar, int i) {
        zzer zzerVar = this.zzr;
        int iZzd = zzerVar.zzd();
        if (iZzd <= 0) {
            return zzaghVar.zza(zzaevVar, i, false);
        }
        int iMin = Math.min(i, iZzd);
        zzaghVar.zzc(zzerVar, iMin);
        return iMin;
    }

    private final long zzz(long j) throws zzat {
        long j2 = this.zzz;
        if (j2 != -9223372036854775807L) {
            return zzfj.zzt(j, j2, 1000L, RoundingMode.DOWN);
        }
        throw zzat.zzb("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) {
        return new zzaji().zza(zzaevVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final /* synthetic */ List zzb() {
        return AP.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        if (this.zzk) {
            zzaexVar = new zzamg(zzaexVar, this.zzl);
        }
        this.zzap = zzaexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) {
        int i = 0;
        this.zzT = false;
        while (!this.zzT) {
            if (this.zzaq.zzc(zzaevVar)) {
                long jZzn = zzaevVar.zzn();
                if (this.zzP) {
                    this.zzR = jZzn;
                    zzafvVar.zza = this.zzQ;
                    this.zzP = false;
                    return 1;
                }
                if (this.zzF) {
                    long j = this.zzR;
                    if (j != -1) {
                        zzafvVar.zza = j;
                        this.zzR = -1L;
                        return 1;
                    }
                }
            } else {
                while (true) {
                    SparseArray sparseArray = this.zzi;
                    if (i >= sparseArray.size()) {
                        return -1;
                    }
                    zzajg zzajgVar = (zzajg) sparseArray.valueAt(i);
                    zzajgVar.zzb();
                    zzagi zzagiVar = zzajgVar.zzU;
                    if (zzagiVar != null) {
                        zzagiVar.zzd(zzajgVar.zzY, zzajgVar.zzj);
                    }
                    i++;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j, long j2) {
        this.zzS = -9223372036854775807L;
        int i = 0;
        this.zzU = 0;
        this.zzaq.zzb();
        this.zzh.zza();
        zzv();
        this.zzJ = false;
        this.zzK = -9223372036854775807L;
        this.zzL = -1;
        this.zzM = -1L;
        this.zzN = -1L;
        if (!this.zzF) {
            this.zzI.clear();
        }
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i >= sparseArray.size()) {
                return;
            }
            zzagi zzagiVar = ((zzajg) sparseArray.valueAt(i)).zzU;
            if (zzagiVar != null) {
                zzagiVar.zza();
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final /* synthetic */ zzaeu zzg() {
        return AP.b(this);
    }

    public final void zzh(int i, long j, long j2) throws zzat {
        zzaex zzaexVar = this.zzap;
        zzaexVar.getClass();
        if (i == 160) {
            this.zzae = false;
            this.zzaf = 0L;
            return;
        }
        if (i == 174) {
            zzajg zzajgVar = new zzajg();
            this.zzE = zzajgVar;
            zzajgVar.zza = this.zzC;
            return;
        }
        if (i == 183) {
            if (this.zzF) {
                return;
            }
            zzr(i);
            this.zzL = -1;
            this.zzM = -1L;
            this.zzN = -1L;
            return;
        }
        if (i == 187) {
            if (this.zzF) {
                return;
            }
            zzr(i);
            this.zzK = -9223372036854775807L;
            return;
        }
        if (i == 19899) {
            this.zzG = -1;
            this.zzH = -1L;
            return;
        }
        if (i == 20533) {
            zzq(i);
            this.zzE.zzh = true;
            return;
        }
        if (i == 21968) {
            zzq(i);
            this.zzE.zzy = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.zzy;
            if (j3 != -1 && j3 != j) {
                throw zzat.zzb("Multiple Segment elements not supported", null);
            }
            this.zzy = j;
            this.zzx = j2;
            return;
        }
        if (i == 475249515) {
            if (this.zzF) {
                return;
            }
            this.zzJ = true;
        } else if (i == 524531317 && !this.zzF) {
            if (this.zzj && this.zzQ != -1) {
                this.zzP = true;
            } else {
                zzaexVar.zzw(new zzafx(this.zzB, 0L));
                this.zzF = true;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(int r36) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 1596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajh.zzi(int):void");
    }

    public final void zzj(int i, long j) throws zzat {
        boolean z;
        if (i == 240) {
            if (this.zzF) {
                return;
            }
            zzr(i);
            if (this.zzN == -1) {
                this.zzN = j;
                return;
            }
            return;
        }
        if (i == 241) {
            if (this.zzF) {
                return;
            }
            zzr(i);
            if (this.zzM == -1) {
                this.zzM = j;
                return;
            }
            return;
        }
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 35);
            sb.append("ContentEncodingOrder ");
            sb.append(j);
            sb.append(" not supported");
            throw zzat.zzb(sb.toString(), null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 35);
            sb2.append("ContentEncodingScope ");
            sb2.append(j);
            sb2.append(" not supported");
            throw zzat.zzb(sb2.toString(), null);
        }
        switch (i) {
            case 131:
                int i2 = (int) j;
                if (i2 == 1) {
                    zzq(i);
                    this.zzE.zze = 2;
                    return;
                }
                if (i2 == 2) {
                    zzq(i);
                    this.zzE.zze = 1;
                    return;
                }
                zzq(i);
                zzajg zzajgVar = this.zzE;
                if (i2 == 17) {
                    zzajgVar.zze = 3;
                    return;
                } else if (i2 != 33) {
                    zzajgVar.zze = -1;
                    return;
                } else {
                    zzajgVar.zze = 5;
                    return;
                }
            case 136:
                z = j == 1;
                zzq(i);
                this.zzE.zzX = z;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                this.zzW = zzz(j);
                return;
            case 159:
                zzq(i);
                this.zzE.zzP = (int) j;
                return;
            case 176:
                zzq(i);
                this.zzE.zzm = (int) j;
                return;
            case 179:
                if (this.zzF) {
                    return;
                }
                zzr(i);
                this.zzK = zzz(j);
                return;
            case 186:
                zzq(i);
                this.zzE.zzn = (int) j;
                return;
            case 215:
                zzq(i);
                this.zzE.zzd = (int) j;
                return;
            case 231:
                this.zzS = zzz(j);
                return;
            case 238:
                this.zzad = (int) j;
                return;
            case 247:
                if (this.zzF) {
                    return;
                }
                zzr(i);
                this.zzL = (int) j;
                return;
            case 251:
                this.zzae = true;
                return;
            case 16871:
                zzq(i);
                this.zzE.zzd((int) j);
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(j).length() + 30);
                sb3.append("ContentCompAlgo ");
                sb3.append(j);
                sb3.append(" not supported");
                throw zzat.zzb(sb3.toString(), null);
            case 17029:
                if (j < 1 || j > 2) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(j).length() + 33);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j);
                    sb4.append(" not supported");
                    throw zzat.zzb(sb4.toString(), null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(String.valueOf(j).length() + 30);
                sb5.append("EBMLReadVersion ");
                sb5.append(j);
                sb5.append(" not supported");
                throw zzat.zzb(sb5.toString(), null);
            case 18401:
                if (j == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(j).length() + 29);
                sb6.append("ContentEncAlgo ");
                sb6.append(j);
                sb6.append(" not supported");
                throw zzat.zzb(sb6.toString(), null);
            case 18408:
                if (j == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(String.valueOf(j).length() + 36);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j);
                sb7.append(" not supported");
                throw zzat.zzb(sb7.toString(), null);
            case 21420:
                this.zzH = j + this.zzy;
                return;
            case 21432:
                int i3 = (int) j;
                zzq(i);
                if (i3 == 0) {
                    this.zzE.zzx = 0;
                    return;
                }
                if (i3 == 1) {
                    this.zzE.zzx = 2;
                    return;
                } else if (i3 == 3) {
                    this.zzE.zzx = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    this.zzE.zzx = 3;
                    return;
                }
            case 21680:
                zzq(i);
                this.zzE.zzp = (int) j;
                return;
            case 21682:
                zzq(i);
                this.zzE.zzr = (int) j;
                return;
            case 21690:
                zzq(i);
                this.zzE.zzq = (int) j;
                return;
            case 21930:
                z = j == 1;
                zzq(i);
                this.zzE.zzW = z;
                return;
            case 21938:
                zzq(i);
                zzajg zzajgVar2 = this.zzE;
                zzajgVar2.zzy = true;
                zzajgVar2.zzo = (int) j;
                return;
            case 21998:
                zzq(i);
                this.zzE.zzg = (int) j;
                return;
            case 22186:
                zzq(i);
                this.zzE.zzS = j;
                return;
            case 22203:
                zzq(i);
                this.zzE.zzT = j;
                return;
            case 25188:
                zzq(i);
                this.zzE.zzQ = (int) j;
                return;
            case 30114:
                this.zzaf = j;
                return;
            case 30321:
                int i4 = (int) j;
                zzq(i);
                if (i4 == 0) {
                    this.zzE.zzs = 0;
                    return;
                }
                if (i4 == 1) {
                    this.zzE.zzs = 1;
                    return;
                } else if (i4 == 2) {
                    this.zzE.zzs = 2;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.zzE.zzs = 3;
                    return;
                }
            case 2352003:
                zzq(i);
                this.zzE.zzf = (int) j;
                return;
            case 2807729:
                this.zzz = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i5 = (int) j;
                        zzq(i);
                        if (i5 == 1) {
                            this.zzE.zzB = 2;
                            return;
                        } else {
                            if (i5 != 2) {
                                return;
                            }
                            this.zzE.zzB = 1;
                            return;
                        }
                    case 21946:
                        zzq(i);
                        int iZzc = zzi.zzc((int) j);
                        if (iZzc != -1) {
                            this.zzE.zzA = iZzc;
                            return;
                        }
                        return;
                    case 21947:
                        zzq(i);
                        this.zzE.zzy = true;
                        int iZzb = zzi.zzb((int) j);
                        if (iZzb != -1) {
                            this.zzE.zzz = iZzb;
                            return;
                        }
                        return;
                    case 21948:
                        zzq(i);
                        this.zzE.zzC = (int) j;
                        return;
                    case 21949:
                        zzq(i);
                        this.zzE.zzD = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public final void zzk(int i, double d) throws zzat {
        if (i == 181) {
            zzq(i);
            this.zzE.zzR = (int) d;
            return;
        }
        if (i == 17545) {
            this.zzA = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                zzq(i);
                this.zzE.zzE = (float) d;
                break;
            case 21970:
                zzq(i);
                this.zzE.zzF = (float) d;
                break;
            case 21971:
                zzq(i);
                this.zzE.zzG = (float) d;
                break;
            case 21972:
                zzq(i);
                this.zzE.zzH = (float) d;
                break;
            case 21973:
                zzq(i);
                this.zzE.zzI = (float) d;
                break;
            case 21974:
                zzq(i);
                this.zzE.zzJ = (float) d;
                break;
            case 21975:
                zzq(i);
                this.zzE.zzK = (float) d;
                break;
            case 21976:
                zzq(i);
                this.zzE.zzL = (float) d;
                break;
            case 21977:
                zzq(i);
                this.zzE.zzM = (float) d;
                break;
            case 21978:
                zzq(i);
                this.zzE.zzN = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        zzq(i);
                        this.zzE.zzt = (float) d;
                        break;
                    case 30324:
                        zzq(i);
                        this.zzE.zzu = (float) d;
                        break;
                    case 30325:
                        zzq(i);
                        this.zzE.zzv = (float) d;
                        break;
                }
        }
    }

    public final void zzl(int i, String str) throws zzat {
        if (i == 134) {
            zzq(i);
            this.zzE.zzc = str;
            return;
        }
        if (i != 17026) {
            if (i == 21358) {
                zzq(i);
                this.zzE.zzb = str;
                return;
            } else {
                if (i != 2274716) {
                    return;
                }
                zzq(i);
                this.zzE.zze(str);
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            this.zzC = Objects.equals(str, "webm");
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 22);
        sb.append("DocType ");
        sb.append(str);
        sb.append(" not supported");
        throw zzat.zzb(sb.toString(), null);
    }

    public final void zzm(int i, int i2, zzaev zzaevVar) throws zzat {
        zzajg zzajgVar;
        int i3;
        zzajg zzajgVar2;
        zzajg zzajgVar3;
        long j;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i;
        int i10 = 1;
        int i11 = 0;
        if (i9 != 161 && i9 != 163) {
            if (i9 == 165) {
                if (this.zzU != 2) {
                    return;
                }
                zzajg zzajgVar4 = (zzajg) this.zzi.get(this.zzaa);
                if (this.zzad != 4 || !"V_VP9".equals(zzajgVar4.zzc)) {
                    zzaevVar.zzf(i2);
                    return;
                }
                zzer zzerVar = this.zzv;
                zzerVar.zza(i2);
                zzaevVar.zzc(zzerVar.zzi(), 0, i2);
                return;
            }
            if (i9 == 16877) {
                zzq(i);
                zzajg zzajgVar5 = this.zzE;
                if (zzajgVar5.zzc() != 1685485123 && zzajgVar5.zzc() != 1685480259) {
                    zzaevVar.zzf(i2);
                    return;
                }
                byte[] bArr = new byte[i2];
                zzajgVar5.zzO = bArr;
                zzaevVar.zzc(bArr, 0, i2);
                return;
            }
            if (i9 == 16981) {
                zzq(i);
                byte[] bArr2 = new byte[i2];
                this.zzE.zzi = bArr2;
                zzaevVar.zzc(bArr2, 0, i2);
                return;
            }
            if (i9 == 18402) {
                byte[] bArr3 = new byte[i2];
                zzaevVar.zzc(bArr3, 0, i2);
                zzq(i);
                this.zzE.zzj = new zzagg(1, bArr3, 0, 0);
                return;
            }
            if (i9 == 21419) {
                zzer zzerVar2 = this.zzq;
                Arrays.fill(zzerVar2.zzi(), (byte) 0);
                zzaevVar.zzc(zzerVar2.zzi(), 4 - i2, i2);
                zzerVar2.zzh(0);
                this.zzG = (int) zzerVar2.zzz();
                return;
            }
            if (i9 == 25506) {
                zzq(i);
                byte[] bArr4 = new byte[i2];
                this.zzE.zzk = bArr4;
                zzaevVar.zzc(bArr4, 0, i2);
                return;
            }
            if (i9 != 30322) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 15);
                sb.append("Unexpected id: ");
                sb.append(i9);
                throw zzat.zzb(sb.toString(), null);
            }
            zzq(i);
            byte[] bArr5 = new byte[i2];
            this.zzE.zzw = bArr5;
            zzaevVar.zzc(bArr5, 0, i2);
            return;
        }
        int i12 = 8;
        if (this.zzU == 0) {
            zzajj zzajjVar = this.zzh;
            this.zzaa = (int) zzajjVar.zzb(zzaevVar, false, true, 8);
            this.zzab = zzajjVar.zzc();
            this.zzW = -9223372036854775807L;
            this.zzU = 1;
            this.zzo.zza(0);
        }
        zzajg zzajgVar6 = (zzajg) this.zzi.get(this.zzaa);
        if (zzajgVar6 == null) {
            zzaevVar.zzf(i2 - this.zzab);
            this.zzU = 0;
            return;
        }
        zzajgVar6.zzb();
        if (this.zzU == 1) {
            zzt(zzaevVar, 3);
            zzer zzerVar3 = this.zzo;
            int i13 = (zzerVar3.zzi()[2] & 6) >> 1;
            if (i13 == 0) {
                this.zzY = 1;
                int[] iArrZzA = zzA(this.zzZ, 1);
                this.zzZ = iArrZzA;
                iArrZzA[0] = (i2 - this.zzab) - 3;
            } else {
                zzt(zzaevVar, 4);
                int i14 = (zzerVar3.zzi()[3] & 255) + 1;
                this.zzY = i14;
                int[] iArrZzA2 = zzA(this.zzZ, i14);
                this.zzZ = iArrZzA2;
                if (i13 == 2) {
                    int i15 = (i2 - this.zzab) - 4;
                    int i16 = this.zzY;
                    Arrays.fill(iArrZzA2, 0, i16, i15 / i16);
                } else {
                    if (i13 != 1) {
                        if (i13 != 3) {
                            throw zzat.zzb("Unexpected lacing value: 2", null);
                        }
                        int i17 = 0;
                        int i18 = 0;
                        int i19 = 4;
                        while (true) {
                            int i20 = this.zzY - 1;
                            if (i17 >= i20) {
                                zzajgVar2 = zzajgVar6;
                                this.zzZ[i20] = ((i2 - this.zzab) - i19) - i18;
                                break;
                            }
                            this.zzZ[i17] = i11;
                            int i21 = i19 + 1;
                            zzt(zzaevVar, i21);
                            if (zzerVar3.zzi()[i19] == 0) {
                                throw zzat.zzb("No valid varint length mask found", null);
                            }
                            int i22 = i11;
                            while (true) {
                                if (i22 >= i12) {
                                    zzajgVar3 = zzajgVar6;
                                    j = 0;
                                    break;
                                }
                                int i23 = i10 << (7 - i22);
                                if ((zzerVar3.zzi()[i19] & i23) != 0) {
                                    i21 += i22;
                                    zzt(zzaevVar, i21);
                                    j = zzerVar3.zzi()[i19] & 255 & (~i23);
                                    int i24 = i19 + 1;
                                    while (i24 < i21) {
                                        j = (j << i12) | (zzerVar3.zzi()[i24] & 255);
                                        i24++;
                                        zzajgVar6 = zzajgVar6;
                                        i12 = 8;
                                    }
                                    zzajgVar3 = zzajgVar6;
                                    if (i17 > 0) {
                                        j -= (1 << ((i22 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i22++;
                                    i10 = 1;
                                    i12 = 8;
                                }
                            }
                            i19 = i21;
                            if (j < -2147483648L || j > 2147483647L) {
                                break;
                            }
                            int[] iArr = this.zzZ;
                            int i25 = (int) j;
                            if (i17 != 0) {
                                i25 += iArr[i17 - 1];
                            }
                            iArr[i17] = i25;
                            i18 += i25;
                            i17++;
                            zzajgVar6 = zzajgVar3;
                            i10 = 1;
                            i11 = 0;
                            i12 = 8;
                        }
                        throw zzat.zzb("EBML lacing sample size out of range.", null);
                    }
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 4;
                    while (true) {
                        i4 = this.zzY - 1;
                        if (i26 >= i4) {
                            break;
                        }
                        this.zzZ[i26] = 0;
                        while (true) {
                            i5 = i28 + 1;
                            zzt(zzaevVar, i5);
                            int i29 = zzerVar3.zzi()[i28] & 255;
                            int[] iArr2 = this.zzZ;
                            i6 = iArr2[i26] + i29;
                            iArr2[i26] = i6;
                            if (i29 != 255) {
                                break;
                            } else {
                                i28 = i5;
                            }
                        }
                        i27 += i6;
                        i26++;
                        i28 = i5;
                    }
                    this.zzZ[i4] = ((i2 - this.zzab) - i28) - i27;
                }
            }
            zzajgVar2 = zzajgVar6;
            this.zzV = this.zzS + zzz((zzerVar3.zzi()[0] << 8) | (zzerVar3.zzi()[1] & 255));
            zzajgVar = zzajgVar2;
            if (zzajgVar.zze != 1) {
                if (i9 == 163) {
                    i7 = 2;
                    if ((zzerVar3.zzi()[2] & 128) == 128) {
                        i9 = 163;
                    } else {
                        i9 = 163;
                    }
                } else {
                    i7 = 2;
                }
                i8 = 0;
                this.zzac = i8;
                this.zzU = i7;
                this.zzX = 0;
                i3 = 163;
            } else {
                i7 = 2;
            }
            i8 = 1;
            this.zzac = i8;
            this.zzU = i7;
            this.zzX = 0;
            i3 = 163;
        } else {
            zzajgVar = zzajgVar6;
            i3 = 163;
        }
        if (i9 == i3) {
            while (true) {
                int i30 = this.zzX;
                if (i30 >= this.zzY) {
                    this.zzU = 0;
                    return;
                }
                zzs(zzajgVar, ((this.zzX * zzajgVar.zzf) / 1000) + this.zzV, this.zzac, zzu(zzaevVar, zzajgVar, this.zzZ[i30], false), 0);
                this.zzX++;
            }
        } else {
            while (true) {
                int i31 = this.zzX;
                if (i31 >= this.zzY) {
                    return;
                }
                int[] iArr3 = this.zzZ;
                iArr3[i31] = zzu(zzaevVar, zzajgVar, iArr3[i31], true);
                this.zzX++;
            }
        }
    }

    public zzajh(zzaja zzajaVar, int i, zzamd zzamdVar) {
        this.zzy = -1L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzK = -9223372036854775807L;
        this.zzL = -1;
        this.zzM = -1L;
        this.zzN = -1L;
        this.zzO = -1;
        this.zzQ = -1L;
        this.zzR = -1L;
        this.zzS = -9223372036854775807L;
        this.zzaq = zzajaVar;
        zzajaVar.zza(new zzajc(this, null));
        this.zzl = zzamdVar;
        this.zzI = new SparseArray();
        this.zzj = 1 == ((i & 1) ^ 1);
        this.zzk = (i & 2) == 0;
        this.zzh = new zzajj();
        this.zzi = new SparseArray();
        this.zzo = new zzer(4);
        this.zzp = new zzer(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzq = new zzer(4);
        this.zzm = new zzer(zzgm.zza);
        this.zzn = new zzer(4);
        this.zzr = new zzer();
        this.zzs = new zzer();
        this.zzt = new zzer(8);
        this.zzu = new zzer();
        this.zzv = new zzer();
        this.zzZ = new int[1];
        this.zzD = true;
    }

    public zzajh(zzamd zzamdVar, int i) {
        this(new zzaja(), 0, zzamdVar);
    }
}
