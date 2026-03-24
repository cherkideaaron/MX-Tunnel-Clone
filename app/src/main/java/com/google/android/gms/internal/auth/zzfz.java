package com.google.android.gms.internal.auth;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import defpackage.AbstractC3264qG;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzfz<T> implements zzgh<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhi.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfw zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzfk zzl;
    private final zzgy zzm;
    private final zzel zzn;
    private final zzgb zzo;
    private final zzfr zzp;

    private zzfz(int[] iArr, Object[] objArr, int i, int i2, zzfw zzfwVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzh = z;
        this.zzi = iArr2;
        this.zzj = i3;
        this.zzk = i4;
        this.zzo = zzgbVar;
        this.zzl = zzfkVar;
        this.zzm = zzgyVar;
        this.zzn = zzelVar;
        this.zzg = zzfwVar;
        this.zzp = zzfrVar;
    }

    private static Field zzA(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbP = AbstractC3264qG.p("Field ", str, " for ", name, " not found. Known fields are ");
            sbP.append(string);
            throw new RuntimeException(sbP.toString());
        }
    }

    private final void zzB(Object obj, Object obj2, int i) {
        long jZzv = zzv(i) & 1048575;
        if (zzG(obj2, i)) {
            Object objZzf = zzhi.zzf(obj, jZzv);
            Object objZzf2 = zzhi.zzf(obj2, jZzv);
            if (objZzf != null && objZzf2 != null) {
                objZzf2 = zzez.zzg(objZzf, objZzf2);
            } else if (objZzf2 == null) {
                return;
            }
            zzhi.zzp(obj, jZzv, objZzf2);
            zzD(obj, i);
        }
    }

    private final void zzC(Object obj, Object obj2, int i) {
        int iZzv = zzv(i);
        int i2 = this.zzc[i];
        long j = iZzv & 1048575;
        if (zzJ(obj2, i2, i)) {
            Object objZzf = zzJ(obj, i2, i) ? zzhi.zzf(obj, j) : null;
            Object objZzf2 = zzhi.zzf(obj2, j);
            if (objZzf != null && objZzf2 != null) {
                objZzf2 = zzez.zzg(objZzf, objZzf2);
            } else if (objZzf2 == null) {
                return;
            }
            zzhi.zzp(obj, j, objZzf2);
            zzE(obj, i2, i);
        }
    }

    private final void zzD(Object obj, int i) {
        int iZzs = zzs(i);
        long j = 1048575 & iZzs;
        if (j == 1048575) {
            return;
        }
        zzhi.zzn(obj, j, (1 << (iZzs >>> 20)) | zzhi.zzc(obj, j));
    }

    private final void zzE(Object obj, int i, int i2) {
        zzhi.zzn(obj, zzs(i2) & 1048575, i);
    }

    private final boolean zzF(Object obj, Object obj2, int i) {
        return zzG(obj, i) == zzG(obj2, i);
    }

    private final boolean zzG(Object obj, int i) {
        int iZzs = zzs(i);
        long j = iZzs & 1048575;
        if (j != 1048575) {
            return (zzhi.zzc(obj, j) & (1 << (iZzs >>> 20))) != 0;
        }
        int iZzv = zzv(i);
        long j2 = iZzv & 1048575;
        switch (zzu(iZzv)) {
            case 0:
                return Double.doubleToRawLongBits(zzhi.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhi.zzb(obj, j2)) != 0;
            case 2:
                return zzhi.zzd(obj, j2) != 0;
            case 3:
                return zzhi.zzd(obj, j2) != 0;
            case 4:
                return zzhi.zzc(obj, j2) != 0;
            case 5:
                return zzhi.zzd(obj, j2) != 0;
            case 6:
                return zzhi.zzc(obj, j2) != 0;
            case 7:
                return zzhi.zzt(obj, j2);
            case 8:
                Object objZzf = zzhi.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzee) {
                    return !zzee.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhi.zzf(obj, j2) != null;
            case 10:
                return !zzee.zzb.equals(zzhi.zzf(obj, j2));
            case 11:
                return zzhi.zzc(obj, j2) != 0;
            case 12:
                return zzhi.zzc(obj, j2) != 0;
            case 13:
                return zzhi.zzc(obj, j2) != 0;
            case 14:
                return zzhi.zzd(obj, j2) != 0;
            case 15:
                return zzhi.zzc(obj, j2) != 0;
            case 16:
                return zzhi.zzd(obj, j2) != 0;
            case 17:
                return zzhi.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzH(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzG(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzI(Object obj, int i, zzgh zzghVar) {
        return zzghVar.zzi(zzhi.zzf(obj, i & 1048575));
    }

    private final boolean zzJ(Object obj, int i, int i2) {
        return zzhi.zzc(obj, (long) (zzs(i2) & 1048575)) == i;
    }

    public static zzgz zzc(Object obj) {
        zzeu zzeuVar = (zzeu) obj;
        zzgz zzgzVar = zzeuVar.zzc;
        if (zzgzVar != zzgz.zza()) {
            return zzgzVar;
        }
        zzgz zzgzVarZzc = zzgz.zzc();
        zzeuVar.zzc = zzgzVarZzc;
        return zzgzVarZzc;
    }

    public static zzfz zzj(Class cls, zzft zzftVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
        if (zzftVar instanceof zzgg) {
            return zzk((zzgg) zzftVar, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0381  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.auth.zzfz zzk(com.google.android.gms.internal.auth.zzgg r34, com.google.android.gms.internal.auth.zzgb r35, com.google.android.gms.internal.auth.zzfk r36, com.google.android.gms.internal.auth.zzgy r37, com.google.android.gms.internal.auth.zzel r38, com.google.android.gms.internal.auth.zzfr r39) {
        /*
            Method dump skipped, instructions count: 1019
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzk(com.google.android.gms.internal.auth.zzgg, com.google.android.gms.internal.auth.zzgb, com.google.android.gms.internal.auth.zzfk, com.google.android.gms.internal.auth.zzgy, com.google.android.gms.internal.auth.zzel, com.google.android.gms.internal.auth.zzfr):com.google.android.gms.internal.auth.zzfz");
    }

    private static int zzl(Object obj, long j) {
        return ((Integer) zzhi.zzf(obj, j)).intValue();
    }

    private final int zzm(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzds zzdsVar) {
        Unsafe unsafe = zzb;
        Object objZzz = zzz(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzfq) object).zze()) {
            zzfq zzfqVarZzb = zzfq.zza().zzb();
            zzfr.zza(zzfqVarZzb, object);
            unsafe.putObject(obj, j, zzfqVarZzb);
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzn(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzds zzdsVar) throws zzfa {
        int iZzm;
        long jZzc;
        int iZzb;
        Object objValueOf;
        int iZzj;
        Object objZzg;
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzdt.zzn(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzdt.zzb(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    iZzm = zzdt.zzm(bArr, i, zzdsVar);
                    jZzc = zzdsVar.zzb;
                    objValueOf = Long.valueOf(jZzc);
                    unsafe.putObject(obj, j, objValueOf);
                    unsafe.putInt(obj, j2, i4);
                    return iZzm;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    iZzm = zzdt.zzj(bArr, i, zzdsVar);
                    iZzb = zzdsVar.zza;
                    objValueOf = Integer.valueOf(iZzb);
                    unsafe.putObject(obj, j, objValueOf);
                    unsafe.putInt(obj, j2, i4);
                    return iZzm;
                }
                return i;
            case 56:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzdt.zzn(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                return i;
            case 57:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzdt.zzb(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    iZzm = zzdt.zzm(bArr, i, zzdsVar);
                    objValueOf = Boolean.valueOf(zzdsVar.zzb != 0);
                    unsafe.putObject(obj, j, objValueOf);
                    unsafe.putInt(obj, j2, i4);
                    return iZzm;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    iZzj = zzdt.zzj(bArr, i, zzdsVar);
                    int i9 = zzdsVar.zza;
                    if (i9 == 0) {
                        objZzg = "";
                        unsafe.putObject(obj, j, objZzg);
                        unsafe.putInt(obj, j2, i4);
                        return iZzj;
                    }
                    if ((i6 & 536870912) != 0 && !zzhm.zzd(bArr, iZzj, iZzj + i9)) {
                        throw zzfa.zzb();
                    }
                    unsafe.putObject(obj, j, new String(bArr, iZzj, i9, zzez.zzb));
                    iZzj += i9;
                    unsafe.putInt(obj, j2, i4);
                    return iZzj;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    iZzj = zzdt.zzd(zzy(i8), bArr, i, i2, zzdsVar);
                    Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    objZzg = zzdsVar.zzc;
                    if (object != null) {
                        objZzg = zzez.zzg(object, objZzg);
                    }
                    unsafe.putObject(obj, j, objZzg);
                    unsafe.putInt(obj, j2, i4);
                    return iZzj;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    iZzm = zzdt.zza(bArr, i, zzdsVar);
                    objValueOf = zzdsVar.zzc;
                    unsafe.putObject(obj, j, objValueOf);
                    unsafe.putInt(obj, j2, i4);
                    return iZzm;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int iZzj2 = zzdt.zzj(bArr, i, zzdsVar);
                    int i10 = zzdsVar.zza;
                    zzex zzexVarZzx = zzx(i8);
                    if (zzexVarZzx == null || zzexVarZzx.zza()) {
                        unsafe.putObject(obj, j, Integer.valueOf(i10));
                        unsafe.putInt(obj, j2, i4);
                    } else {
                        zzc(obj).zzf(i3, Long.valueOf(i10));
                    }
                    return iZzj2;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    iZzm = zzdt.zzj(bArr, i, zzdsVar);
                    iZzb = zzei.zzb(zzdsVar.zza);
                    objValueOf = Integer.valueOf(iZzb);
                    unsafe.putObject(obj, j, objValueOf);
                    unsafe.putInt(obj, j2, i4);
                    return iZzm;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    iZzm = zzdt.zzm(bArr, i, zzdsVar);
                    jZzc = zzei.zzc(zzdsVar.zzb);
                    objValueOf = Long.valueOf(jZzc);
                    unsafe.putObject(obj, j, objValueOf);
                    unsafe.putInt(obj, j2, i4);
                    return iZzm;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    iZzj = zzdt.zzc(zzy(i8), bArr, i, i2, (i3 & (-8)) | 4, zzdsVar);
                    Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    objZzg = zzdsVar.zzc;
                    if (object2 != null) {
                        objZzg = zzez.zzg(object2, objZzg);
                    }
                    unsafe.putObject(obj, j, objZzg);
                    unsafe.putInt(obj, j2, i4);
                    return iZzj;
                }
                return i;
            default:
                return i;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0081. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v24, types: [int] */
    private final int zzo(Object obj, byte[] bArr, int i, int i2, zzds zzdsVar) throws zzfa {
        byte b;
        int iZzk;
        int i3;
        int i4;
        int i5;
        Unsafe unsafe;
        int i6;
        int i7;
        int i8;
        int i9;
        int iZzm;
        Unsafe unsafe2;
        Object obj2;
        long jZzc;
        long j;
        long j2;
        int iZzd;
        Object objZzg;
        long j3;
        int iZzb;
        int i10;
        int i11;
        int i12;
        zzfz<T> zzfzVar = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i13 = i2;
        zzds zzdsVar2 = zzdsVar;
        Unsafe unsafe3 = zzb;
        int i14 = 1048575;
        int i15 = -1;
        int iZzi = i;
        int i16 = -1;
        int i17 = 1048575;
        int i18 = 0;
        int i19 = 0;
        while (iZzi < i13) {
            int i20 = iZzi + 1;
            byte b2 = bArr2[iZzi];
            if (b2 < 0) {
                iZzk = zzdt.zzk(b2, bArr2, i20, zzdsVar2);
                b = zzdsVar2.zza;
            } else {
                b = b2;
                iZzk = i20;
            }
            int i21 = b >>> 3;
            int i22 = b & 7;
            int iZzr = i21 > i16 ? zzfzVar.zzr(i21, i18 / 3) : zzfzVar.zzq(i21);
            if (iZzr == i15) {
                i3 = iZzk;
                i4 = i21;
                i5 = i15;
                unsafe = unsafe3;
                i6 = 0;
            } else {
                int[] iArr = zzfzVar.zzc;
                int i23 = iArr[iZzr + 1];
                int iZzu = zzu(i23);
                long j4 = i23 & i14;
                if (iZzu <= 17) {
                    int i24 = iArr[iZzr + 2];
                    int i25 = 1 << (i24 >>> 20);
                    int i26 = i24 & 1048575;
                    if (i26 != i17) {
                        if (i17 != 1048575) {
                            unsafe3.putInt(obj3, i17, i19);
                        }
                        if (i26 != 1048575) {
                            i19 = unsafe3.getInt(obj3, i26);
                        }
                        i17 = i26;
                    }
                    switch (iZzu) {
                        case 0:
                            zzdsVar2 = zzdsVar;
                            i7 = iZzr;
                            i8 = iZzk;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 1) {
                                i3 = i8;
                                unsafe = unsafe3;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                zzhi.zzl(obj3, j4, Double.longBitsToDouble(zzdt.zzn(bArr2, i8)));
                                iZzi = i8 + 8;
                                i19 |= i25;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 1:
                            zzdsVar2 = zzdsVar;
                            i7 = iZzr;
                            i8 = iZzk;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 5) {
                                i3 = i8;
                                unsafe = unsafe3;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                zzhi.zzm(obj3, j4, Float.intBitsToFloat(zzdt.zzb(bArr2, i8)));
                                iZzi = i8 + 4;
                                i19 |= i25;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            zzdsVar2 = zzdsVar;
                            i7 = iZzr;
                            i8 = iZzk;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 0) {
                                i3 = i8;
                                unsafe = unsafe3;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                iZzm = zzdt.zzm(bArr2, i8, zzdsVar2);
                                unsafe2 = unsafe3;
                                obj2 = obj;
                                jZzc = zzdsVar2.zzb;
                                j = j4;
                                unsafe2.putLong(obj2, j, jZzc);
                                i19 |= i25;
                                iZzi = iZzm;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 4:
                        case 11:
                            zzdsVar2 = zzdsVar;
                            i7 = iZzr;
                            i8 = iZzk;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 0) {
                                i3 = i8;
                                unsafe = unsafe3;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                iZzi = zzdt.zzj(bArr2, i8, zzdsVar2);
                                unsafe3.putInt(obj3, j4, zzdsVar2.zza);
                                i19 |= i25;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            zzdsVar2 = zzdsVar;
                            i7 = iZzr;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 1) {
                                i8 = iZzk;
                                i3 = i8;
                                unsafe = unsafe3;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                i8 = iZzk;
                                unsafe3.putLong(obj, j4, zzdt.zzn(bArr2, iZzk));
                                iZzi = i8 + 8;
                                i19 |= i25;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            zzdsVar2 = zzdsVar;
                            i7 = iZzr;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 5) {
                                i8 = iZzk;
                                i3 = i8;
                                unsafe = unsafe3;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                unsafe3.putInt(obj3, j4, zzdt.zzb(bArr2, iZzk));
                                iZzi = iZzk + 4;
                                i19 |= i25;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 7:
                            zzdsVar2 = zzdsVar;
                            i7 = iZzr;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 0) {
                                i8 = iZzk;
                                i3 = i8;
                                unsafe = unsafe3;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                iZzi = zzdt.zzm(bArr2, iZzk, zzdsVar2);
                                zzhi.zzk(obj3, j4, zzdsVar2.zzb != 0);
                                i19 |= i25;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 8:
                            zzdsVar2 = zzdsVar;
                            i7 = iZzr;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 2) {
                                i8 = iZzk;
                                i3 = i8;
                                unsafe = unsafe3;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                iZzi = (536870912 & i23) == 0 ? zzdt.zzg(bArr2, iZzk, zzdsVar2) : zzdt.zzh(bArr2, iZzk, zzdsVar2);
                                unsafe3.putObject(obj3, j4, zzdsVar2.zzc);
                                i19 |= i25;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 9:
                            zzdsVar2 = zzdsVar;
                            i7 = iZzr;
                            i9 = 1048575;
                            j2 = j4;
                            i4 = i21;
                            if (i22 != 2) {
                                i8 = iZzk;
                                i3 = i8;
                                unsafe = unsafe3;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                iZzd = zzdt.zzd(zzfzVar.zzy(i7), bArr2, iZzk, i13, zzdsVar2);
                                Object object = unsafe3.getObject(obj3, j2);
                                objZzg = object == null ? zzdsVar2.zzc : zzez.zzg(object, zzdsVar2.zzc);
                                unsafe3.putObject(obj3, j2, objZzg);
                                i19 |= i25;
                                iZzi = iZzd;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 10:
                            zzdsVar2 = zzdsVar;
                            i7 = iZzr;
                            i9 = 1048575;
                            j2 = j4;
                            i4 = i21;
                            if (i22 != 2) {
                                i8 = iZzk;
                                i3 = i8;
                                unsafe = unsafe3;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                iZzd = zzdt.zza(bArr2, iZzk, zzdsVar2);
                                objZzg = zzdsVar2.zzc;
                                unsafe3.putObject(obj3, j2, objZzg);
                                i19 |= i25;
                                iZzi = iZzd;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 12:
                            zzdsVar2 = zzdsVar;
                            i7 = iZzr;
                            i9 = 1048575;
                            j3 = j4;
                            i4 = i21;
                            if (i22 != 0) {
                                i8 = iZzk;
                                i3 = i8;
                                unsafe = unsafe3;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                iZzd = zzdt.zzj(bArr2, iZzk, zzdsVar2);
                                iZzb = zzdsVar2.zza;
                                unsafe3.putInt(obj3, j3, iZzb);
                                i19 |= i25;
                                iZzi = iZzd;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 15:
                            zzdsVar2 = zzdsVar;
                            i7 = iZzr;
                            i9 = 1048575;
                            j3 = j4;
                            i4 = i21;
                            if (i22 != 0) {
                                i8 = iZzk;
                                i3 = i8;
                                unsafe = unsafe3;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                iZzd = zzdt.zzj(bArr2, iZzk, zzdsVar2);
                                iZzb = zzei.zzb(zzdsVar2.zza);
                                unsafe3.putInt(obj3, j3, iZzb);
                                i19 |= i25;
                                iZzi = iZzd;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 16:
                            if (i22 != 0) {
                                i4 = i21;
                                i7 = iZzr;
                                i8 = iZzk;
                                i3 = i8;
                                unsafe = unsafe3;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                zzdsVar2 = zzdsVar;
                                iZzm = zzdt.zzm(bArr2, iZzk, zzdsVar2);
                                jZzc = zzei.zzc(zzdsVar2.zzb);
                                unsafe2 = unsafe3;
                                obj2 = obj;
                                i7 = iZzr;
                                j = j4;
                                i4 = i21;
                                i9 = 1048575;
                                unsafe2.putLong(obj2, j, jZzc);
                                i19 |= i25;
                                iZzi = iZzm;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        default:
                            i4 = i21;
                            i7 = iZzr;
                            i8 = iZzk;
                            i3 = i8;
                            unsafe = unsafe3;
                            i6 = i7;
                            i5 = -1;
                            break;
                    }
                } else {
                    zzdsVar2 = zzdsVar;
                    i7 = iZzr;
                    int i27 = iZzk;
                    i9 = 1048575;
                    i4 = i21;
                    if (iZzu == 27) {
                        if (i22 == 2) {
                            zzey zzeyVarZzd = (zzey) unsafe3.getObject(obj3, j4);
                            if (!zzeyVarZzd.zzc()) {
                                int size = zzeyVarZzd.size();
                                zzeyVarZzd = zzeyVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe3.putObject(obj3, j4, zzeyVarZzd);
                            }
                            iZzi = zzdt.zze(zzfzVar.zzy(i7), b, bArr, i27, i2, zzeyVarZzd, zzdsVar);
                            i19 = i19;
                            i18 = i7;
                            i16 = i4;
                            i14 = i9;
                            i15 = -1;
                        } else {
                            i10 = i27;
                            i11 = i19;
                            i12 = i17;
                            unsafe = unsafe3;
                            i6 = i7;
                            i5 = -1;
                        }
                    } else if (iZzu <= 49) {
                        i11 = i19;
                        i12 = i17;
                        i5 = -1;
                        unsafe = unsafe3;
                        i6 = i7;
                        iZzi = zzp(obj, bArr, i27, i2, b, i4, i22, i7, i23, iZzu, j4, zzdsVar);
                        if (iZzi != i27) {
                            obj3 = obj;
                            bArr2 = bArr;
                            i13 = i2;
                            zzdsVar2 = zzdsVar;
                            i17 = i12;
                            i15 = i5;
                            i16 = i4;
                            i19 = i11;
                            i18 = i6;
                            unsafe3 = unsafe;
                            i14 = 1048575;
                            zzfzVar = this;
                        } else {
                            i3 = iZzi;
                            i17 = i12;
                            i19 = i11;
                        }
                    } else {
                        i10 = i27;
                        i11 = i19;
                        i12 = i17;
                        unsafe = unsafe3;
                        i6 = i7;
                        i5 = -1;
                        if (iZzu != 50) {
                            iZzi = zzn(obj, bArr, i10, i2, b, i4, i22, i23, iZzu, j4, i6, zzdsVar);
                            if (iZzi != i10) {
                                obj3 = obj;
                                bArr2 = bArr;
                                i13 = i2;
                                zzdsVar2 = zzdsVar;
                                i17 = i12;
                                i15 = i5;
                                i16 = i4;
                                i19 = i11;
                                i18 = i6;
                                unsafe3 = unsafe;
                                i14 = 1048575;
                                zzfzVar = this;
                            } else {
                                i3 = iZzi;
                                i17 = i12;
                                i19 = i11;
                            }
                        } else if (i22 == 2) {
                            iZzi = zzm(obj, bArr, i10, i2, i6, j4, zzdsVar);
                            if (iZzi != i10) {
                                obj3 = obj;
                                bArr2 = bArr;
                                i13 = i2;
                                zzdsVar2 = zzdsVar;
                                i17 = i12;
                                i15 = i5;
                                i16 = i4;
                                i19 = i11;
                                i18 = i6;
                                unsafe3 = unsafe;
                                i14 = 1048575;
                                zzfzVar = this;
                            } else {
                                i3 = iZzi;
                                i17 = i12;
                                i19 = i11;
                            }
                        }
                    }
                    i3 = i10;
                    i17 = i12;
                    i19 = i11;
                }
            }
            iZzi = zzdt.zzi(b, bArr, i3, i2, zzc(obj), zzdsVar);
            zzfzVar = this;
            obj3 = obj;
            bArr2 = bArr;
            i13 = i2;
            zzdsVar2 = zzdsVar;
            i15 = i5;
            i16 = i4;
            i18 = i6;
            unsafe3 = unsafe;
            i14 = 1048575;
        }
        int i28 = i19;
        int i29 = i17;
        Unsafe unsafe4 = unsafe3;
        if (i29 != i14) {
            unsafe4.putInt(obj, i29, i28);
        }
        if (iZzi == i2) {
            return iZzi;
        }
        throw zzfa.zzd();
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x0273, code lost:
    
        if (r29.zzb != 0) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0275, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0277, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0278, code lost:
    
        r12.zze(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x027b, code lost:
    
        if (r4 >= r19) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x027d, code lost:
    
        r6 = com.google.android.gms.internal.auth.zzdt.zzj(r17, r4, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0283, code lost:
    
        if (r20 == r29.zza) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0286, code lost:
    
        r4 = com.google.android.gms.internal.auth.zzdt.zzm(r17, r6, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x028e, code lost:
    
        if (r29.zzb == 0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0291, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x014e, code lost:
    
        r12.add(com.google.android.gms.internal.auth.zzee.zzk(r17, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0278, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013e, code lost:
    
        if (r4 == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0140, code lost:
    
        r12.add(com.google.android.gms.internal.auth.zzee.zzb);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0146, code lost:
    
        r12.add(com.google.android.gms.internal.auth.zzee.zzk(r17, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014e, code lost:
    
        if (r1 >= r19) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0150, code lost:
    
        r4 = com.google.android.gms.internal.auth.zzdt.zzj(r17, r1, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0156, code lost:
    
        if (r20 == r29.zza) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0159, code lost:
    
        r1 = com.google.android.gms.internal.auth.zzdt.zzj(r17, r4, r29);
        r4 = r29.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015f, code lost:
    
        if (r4 < 0) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0163, code lost:
    
        if (r4 > (r17.length - r1)) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0165, code lost:
    
        if (r4 != 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x016c, code lost:
    
        throw com.google.android.gms.internal.auth.zzfa.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0171, code lost:
    
        throw com.google.android.gms.internal.auth.zzfa.zzc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0172, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0208  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x01d0 -> B:100:0x01af). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x0218 -> B:118:0x01ef). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:165:0x028e -> B:157:0x0275). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0165 -> B:69:0x0140). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzp(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.auth.zzds r29) throws com.google.android.gms.internal.auth.zzfa {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzp(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.auth.zzds):int");
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzt(i, 0);
    }

    private final int zzr(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzt(i, i2);
    }

    private final int zzs(int i) {
        return this.zzc[i + 2];
    }

    private final int zzt(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzu(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzv(int i) {
        return this.zzc[i + 1];
    }

    private static long zzw(Object obj, long j) {
        return ((Long) zzhi.zzf(obj, j)).longValue();
    }

    private final zzex zzx(int i) {
        int i2 = i / 3;
        return (zzex) this.zzd[i2 + i2 + 1];
    }

    private final zzgh zzy(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzgh zzghVar = (zzgh) this.zzd[i3];
        if (zzghVar != null) {
            return zzghVar;
        }
        zzgh zzghVarZzb = zzge.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzghVarZzb;
        return zzghVarZzb;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0102 A[PHI: r3
      0x0102: PHI (r3v8 java.lang.Object) = (r3v5 java.lang.Object), (r3v9 java.lang.Object) binds: [B:74:0x011e, B:68:0x0100] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.auth.zzgh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zza(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x03ae, code lost:
    
        if (r0 != r19) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x03b0, code lost:
    
        r15 = r31;
        r14 = r32;
        r12 = r33;
        r13 = r35;
        r11 = r36;
        r9 = r37;
        r2 = r17;
        r3 = r18;
        r1 = r20;
        r5 = r22;
        r6 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03ca, code lost:
    
        r7 = r36;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03f0, code lost:
    
        if (r0 != r15) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0413, code lost:
    
        if (r0 != r15) goto L124;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x008d. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.auth.zzds r37) throws com.google.android.gms.internal.auth.zzfa {
        /*
            Method dump skipped, instructions count: 1222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzb(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.auth.zzds):int");
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final Object zzd() {
        return ((zzeu) this.zzg).zzi(4, null, null);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zze(Object obj) {
        int i;
        int i2 = this.zzj;
        while (true) {
            i = this.zzk;
            if (i2 >= i) {
                break;
            }
            long jZzv = zzv(this.zzi[i2]) & 1048575;
            Object objZzf = zzhi.zzf(obj, jZzv);
            if (objZzf != null) {
                ((zzfq) objZzf).zzc();
                zzhi.zzp(obj, jZzv, objZzf);
            }
            i2++;
        }
        int length = this.zzi.length;
        while (i < length) {
            this.zzl.zza(obj, this.zzi[i]);
            i++;
        }
        this.zzm.zze(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    @Override // com.google.android.gms.internal.auth.zzgh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            r8.getClass()
            r0 = 0
        L4:
            int[] r1 = r6.zzc
            int r1 = r1.length
            if (r0 >= r1) goto Lf4
            int r1 = r6.zzv(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r2 = (long) r2
            int[] r4 = r6.zzc
            r4 = r4[r0]
            int r1 = zzu(r1)
            switch(r1) {
                case 0: goto Le1;
                case 1: goto Ld2;
                case 2: goto Lcb;
                case 3: goto Lc4;
                case 4: goto Lbd;
                case 5: goto Lb6;
                case 6: goto Laf;
                case 7: goto La1;
                case 8: goto L9a;
                case 9: goto L4b;
                case 10: goto L8c;
                case 11: goto L85;
                case 12: goto L7e;
                case 13: goto L77;
                case 14: goto L70;
                case 15: goto L62;
                case 16: goto L50;
                case 17: goto L4b;
                case 18: goto L44;
                case 19: goto L44;
                case 20: goto L44;
                case 21: goto L44;
                case 22: goto L44;
                case 23: goto L44;
                case 24: goto L44;
                case 25: goto L44;
                case 26: goto L44;
                case 27: goto L44;
                case 28: goto L44;
                case 29: goto L44;
                case 30: goto L44;
                case 31: goto L44;
                case 32: goto L44;
                case 33: goto L44;
                case 34: goto L44;
                case 35: goto L44;
                case 36: goto L44;
                case 37: goto L44;
                case 38: goto L44;
                case 39: goto L44;
                case 40: goto L44;
                case 41: goto L44;
                case 42: goto L44;
                case 43: goto L44;
                case 44: goto L44;
                case 45: goto L44;
                case 46: goto L44;
                case 47: goto L44;
                case 48: goto L44;
                case 49: goto L44;
                case 50: goto L3d;
                case 51: goto L36;
                case 52: goto L36;
                case 53: goto L36;
                case 54: goto L36;
                case 55: goto L36;
                case 56: goto L36;
                case 57: goto L36;
                case 58: goto L36;
                case 59: goto L36;
                case 60: goto L1f;
                case 61: goto L24;
                case 62: goto L24;
                case 63: goto L24;
                case 64: goto L24;
                case 65: goto L24;
                case 66: goto L24;
                case 67: goto L24;
                case 68: goto L1f;
                default: goto L1d;
            }
        L1d:
            goto Lf0
        L1f:
            r6.zzC(r7, r8, r0)
            goto Lf0
        L24:
            boolean r1 = r6.zzJ(r8, r4, r0)
            if (r1 == 0) goto Lf0
        L2a:
            java.lang.Object r1 = com.google.android.gms.internal.auth.zzhi.zzf(r8, r2)
            com.google.android.gms.internal.auth.zzhi.zzp(r7, r2, r1)
            r6.zzE(r7, r4, r0)
            goto Lf0
        L36:
            boolean r1 = r6.zzJ(r8, r4, r0)
            if (r1 == 0) goto Lf0
            goto L2a
        L3d:
            com.google.android.gms.internal.auth.zzfr r1 = r6.zzp
            com.google.android.gms.internal.auth.zzgj.zzi(r1, r7, r8, r2)
            goto Lf0
        L44:
            com.google.android.gms.internal.auth.zzfk r1 = r6.zzl
            r1.zzb(r7, r8, r2)
            goto Lf0
        L4b:
            r6.zzB(r7, r8, r0)
            goto Lf0
        L50:
            boolean r1 = r6.zzG(r8, r0)
            if (r1 == 0) goto Lf0
        L56:
            long r4 = com.google.android.gms.internal.auth.zzhi.zzd(r8, r2)
            com.google.android.gms.internal.auth.zzhi.zzo(r7, r2, r4)
        L5d:
            r6.zzD(r7, r0)
            goto Lf0
        L62:
            boolean r1 = r6.zzG(r8, r0)
            if (r1 == 0) goto Lf0
        L68:
            int r1 = com.google.android.gms.internal.auth.zzhi.zzc(r8, r2)
            com.google.android.gms.internal.auth.zzhi.zzn(r7, r2, r1)
            goto L5d
        L70:
            boolean r1 = r6.zzG(r8, r0)
            if (r1 == 0) goto Lf0
            goto L56
        L77:
            boolean r1 = r6.zzG(r8, r0)
            if (r1 == 0) goto Lf0
            goto L68
        L7e:
            boolean r1 = r6.zzG(r8, r0)
            if (r1 == 0) goto Lf0
            goto L68
        L85:
            boolean r1 = r6.zzG(r8, r0)
            if (r1 == 0) goto Lf0
            goto L68
        L8c:
            boolean r1 = r6.zzG(r8, r0)
            if (r1 == 0) goto Lf0
        L92:
            java.lang.Object r1 = com.google.android.gms.internal.auth.zzhi.zzf(r8, r2)
            com.google.android.gms.internal.auth.zzhi.zzp(r7, r2, r1)
            goto L5d
        L9a:
            boolean r1 = r6.zzG(r8, r0)
            if (r1 == 0) goto Lf0
            goto L92
        La1:
            boolean r1 = r6.zzG(r8, r0)
            if (r1 == 0) goto Lf0
            boolean r1 = com.google.android.gms.internal.auth.zzhi.zzt(r8, r2)
            com.google.android.gms.internal.auth.zzhi.zzk(r7, r2, r1)
            goto L5d
        Laf:
            boolean r1 = r6.zzG(r8, r0)
            if (r1 == 0) goto Lf0
            goto L68
        Lb6:
            boolean r1 = r6.zzG(r8, r0)
            if (r1 == 0) goto Lf0
            goto L56
        Lbd:
            boolean r1 = r6.zzG(r8, r0)
            if (r1 == 0) goto Lf0
            goto L68
        Lc4:
            boolean r1 = r6.zzG(r8, r0)
            if (r1 == 0) goto Lf0
            goto L56
        Lcb:
            boolean r1 = r6.zzG(r8, r0)
            if (r1 == 0) goto Lf0
            goto L56
        Ld2:
            boolean r1 = r6.zzG(r8, r0)
            if (r1 == 0) goto Lf0
            float r1 = com.google.android.gms.internal.auth.zzhi.zzb(r8, r2)
            com.google.android.gms.internal.auth.zzhi.zzm(r7, r2, r1)
            goto L5d
        Le1:
            boolean r1 = r6.zzG(r8, r0)
            if (r1 == 0) goto Lf0
            double r4 = com.google.android.gms.internal.auth.zzhi.zza(r8, r2)
            com.google.android.gms.internal.auth.zzhi.zzl(r7, r2, r4)
            goto L5d
        Lf0:
            int r0 = r0 + 3
            goto L4
        Lf4:
            com.google.android.gms.internal.auth.zzgy r0 = r6.zzm
            com.google.android.gms.internal.auth.zzgj.zzf(r0, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzf(java.lang.Object, java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzg(Object obj, byte[] bArr, int i, int i2, zzds zzdsVar) throws zzfa {
        if (this.zzh) {
            zzo(obj, bArr, i, i2, zzdsVar);
        } else {
            zzb(obj, bArr, i, i2, 0, zzdsVar);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final boolean zzh(Object obj, Object obj2) {
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzv = zzv(i);
            long j = iZzv & 1048575;
            switch (zzu(iZzv)) {
                case 0:
                    if (!zzF(obj, obj2, i) || Double.doubleToLongBits(zzhi.zza(obj, j)) != Double.doubleToLongBits(zzhi.zza(obj2, j))) {
                        return false;
                    }
                    break;
                    break;
                case 1:
                    if (!zzF(obj, obj2, i) || Float.floatToIntBits(zzhi.zzb(obj, j)) != Float.floatToIntBits(zzhi.zzb(obj2, j))) {
                        return false;
                    }
                    break;
                    break;
                case 2:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
                        return false;
                    }
                    break;
                case 3:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
                        return false;
                    }
                    break;
                    break;
                case 4:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    break;
                    break;
                case 5:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
                        return false;
                    }
                    break;
                case 6:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    break;
                case 7:
                    if (!zzF(obj, obj2, i) || zzhi.zzt(obj, j) != zzhi.zzt(obj2, j)) {
                        return false;
                    }
                    break;
                    break;
                case 8:
                    if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        return false;
                    }
                    break;
                case 9:
                    if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        return false;
                    }
                    break;
                case 10:
                    if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        return false;
                    }
                    break;
                case 11:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    break;
                case 12:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    break;
                case 13:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    break;
                    break;
                case 14:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
                        return false;
                    }
                    break;
                case 15:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    break;
                    break;
                case 16:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
                        return false;
                    }
                    break;
                    break;
                case 17:
                    if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        return false;
                    }
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case ConnectionResult.API_DISABLED /* 23 */:
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    if (!zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        return false;
                    }
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                case 66:
                case 67:
                case 68:
                    long jZzs = zzs(i) & 1048575;
                    if (zzhi.zzc(obj, jZzs) != zzhi.zzc(obj2, jZzs) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        return false;
                    }
                    break;
            }
        }
        return this.zzm.zza(obj).equals(this.zzm.zza(obj2));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    @Override // com.google.android.gms.internal.auth.zzgh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzi(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzi(java.lang.Object):boolean");
    }
}
