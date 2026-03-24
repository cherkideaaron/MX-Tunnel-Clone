package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import defpackage.AbstractC3219pQ;
import defpackage.AbstractC3264qG;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class zznp<T> implements zznx<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzop.zzq();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zznm zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzoi zzl;
    private final zzls zzm;

    private zznp(int[] iArr, Object[] objArr, int i, int i2, zznm zznmVar, boolean z, int[] iArr2, int i3, int i4, zznr zznrVar, zzmy zzmyVar, zzoi zzoiVar, zzls zzlsVar, zznh zznhVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        boolean z2 = false;
        if (zzlsVar != null && (zznmVar instanceof zzmc)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = zzoiVar;
        this.zzm = zzlsVar;
        this.zzg = zznmVar;
    }

    private static boolean zzA(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzmf) {
            return ((zzmf) obj).zzcf();
        }
        return true;
    }

    private static void zzB(Object obj) {
        if (!zzA(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static double zzC(Object obj, long j) {
        return ((Double) zzop.zzn(obj, j)).doubleValue();
    }

    private static float zzD(Object obj, long j) {
        return ((Float) zzop.zzn(obj, j)).floatValue();
    }

    private static int zzE(Object obj, long j) {
        return ((Integer) zzop.zzn(obj, j)).intValue();
    }

    private static long zzF(Object obj, long j) {
        return ((Long) zzop.zzn(obj, j)).longValue();
    }

    private static boolean zzG(Object obj, long j) {
        return ((Boolean) zzop.zzn(obj, j)).booleanValue();
    }

    private final boolean zzH(Object obj, Object obj2, int i) {
        return zzJ(obj, i) == zzJ(obj2, i);
    }

    private final boolean zzI(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzJ(obj, i) : (i3 & i4) != 0;
    }

    private final boolean zzJ(Object obj, int i) {
        int iZzy = zzy(i);
        long j = iZzy & 1048575;
        if (j != 1048575) {
            return (zzop.zzd(obj, j) & (1 << (iZzy >>> 20))) != 0;
        }
        int iZzx = zzx(i);
        long j2 = iZzx & 1048575;
        switch (zzz(iZzx)) {
            case 0:
                return Double.doubleToRawLongBits(zzop.zzl(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzop.zzj(obj, j2)) != 0;
            case 2:
                return zzop.zzf(obj, j2) != 0;
            case 3:
                return zzop.zzf(obj, j2) != 0;
            case 4:
                return zzop.zzd(obj, j2) != 0;
            case 5:
                return zzop.zzf(obj, j2) != 0;
            case 6:
                return zzop.zzd(obj, j2) != 0;
            case 7:
                return zzop.zzh(obj, j2);
            case 8:
                Object objZzn = zzop.zzn(obj, j2);
                if (objZzn instanceof String) {
                    return !((String) objZzn).isEmpty();
                }
                if (objZzn instanceof zzlh) {
                    return !zzlh.zzb.equals(objZzn);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzop.zzn(obj, j2) != null;
            case 10:
                return !zzlh.zzb.equals(zzop.zzn(obj, j2));
            case 11:
                return zzop.zzd(obj, j2) != 0;
            case 12:
                return zzop.zzd(obj, j2) != 0;
            case 13:
                return zzop.zzd(obj, j2) != 0;
            case 14:
                return zzop.zzf(obj, j2) != 0;
            case 15:
                return zzop.zzd(obj, j2) != 0;
            case 16:
                return zzop.zzf(obj, j2) != 0;
            case 17:
                return zzop.zzn(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzK(Object obj, int i) {
        int iZzy = zzy(i);
        long j = 1048575 & iZzy;
        if (j == 1048575) {
            return;
        }
        zzop.zze(obj, j, (1 << (iZzy >>> 20)) | zzop.zzd(obj, j));
    }

    private final boolean zzL(Object obj, int i, int i2) {
        return zzop.zzd(obj, (long) (zzy(i2) & 1048575)) == i;
    }

    private final void zzM(Object obj, int i, int i2) {
        zzop.zze(obj, zzy(i2) & 1048575, i);
    }

    private final int zzN(int i, int i2) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
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

    private static final int zzO(byte[] bArr, int i, int i2, zzot zzotVar, Class cls, zzkw zzkwVar) {
        int i3;
        Object objValueOf;
        int iZzc;
        long jZzc;
        int iZzb;
        Object objValueOf2;
        zzot zzotVar2 = zzot.zza;
        switch (zzotVar.ordinal()) {
            case 0:
                i3 = i + 8;
                objValueOf = Double.valueOf(Double.longBitsToDouble(zzkx.zze(bArr, i)));
                zzkwVar.zzc = objValueOf;
                return i3;
            case 1:
                i3 = i + 4;
                objValueOf = Float.valueOf(Float.intBitsToFloat(zzkx.zzd(bArr, i)));
                zzkwVar.zzc = objValueOf;
                return i3;
            case 2:
            case 3:
                iZzc = zzkx.zzc(bArr, i, zzkwVar);
                jZzc = zzkwVar.zzb;
                objValueOf2 = Long.valueOf(jZzc);
                zzkwVar.zzc = objValueOf2;
                return iZzc;
            case 4:
            case 12:
            case 13:
                iZzc = zzkx.zza(bArr, i, zzkwVar);
                iZzb = zzkwVar.zza;
                objValueOf2 = Integer.valueOf(iZzb);
                zzkwVar.zzc = objValueOf2;
                return iZzc;
            case 5:
            case 15:
                i3 = i + 8;
                objValueOf = Long.valueOf(zzkx.zze(bArr, i));
                zzkwVar.zzc = objValueOf;
                return i3;
            case 6:
            case 14:
                i3 = i + 4;
                objValueOf = Integer.valueOf(zzkx.zzd(bArr, i));
                zzkwVar.zzc = objValueOf;
                return i3;
            case 7:
                iZzc = zzkx.zzc(bArr, i, zzkwVar);
                objValueOf2 = Boolean.valueOf(zzkwVar.zzb != 0);
                zzkwVar.zzc = objValueOf2;
                return iZzc;
            case 8:
                return zzkx.zzf(bArr, i, zzkwVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zzkx.zzh(zznu.zza().zzb(cls), bArr, i, i2, zzkwVar);
            case 11:
                return zzkx.zzg(bArr, i, zzkwVar);
            case 16:
                iZzc = zzkx.zza(bArr, i, zzkwVar);
                iZzb = zzlj.zzb(zzkwVar.zza);
                objValueOf2 = Integer.valueOf(iZzb);
                zzkwVar.zzc = objValueOf2;
                return iZzc;
            case 17:
                iZzc = zzkx.zzc(bArr, i, zzkwVar);
                jZzc = zzlj.zzc(zzkwVar.zzb);
                objValueOf2 = Long.valueOf(jZzc);
                zzkwVar.zzc = objValueOf2;
                return iZzc;
        }
    }

    private static final void zzP(int i, Object obj, zzov zzovVar) {
        if (obj instanceof String) {
            zzovVar.zzm(i, (String) obj);
        } else {
            zzovVar.zzn(i, (zzlh) obj);
        }
    }

    public static zzoj zzg(Object obj) {
        zzmf zzmfVar = (zzmf) obj;
        zzoj zzojVar = zzmfVar.zzc;
        if (zzojVar != zzoj.zza()) {
            return zzojVar;
        }
        zzoj zzojVarZzb = zzoj.zzb();
        zzmfVar.zzc = zzojVarZzb;
        return zzojVarZzb;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0395  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.measurement.zznp zzl(java.lang.Class r32, com.google.android.gms.internal.measurement.zznj r33, com.google.android.gms.internal.measurement.zznr r34, com.google.android.gms.internal.measurement.zzmy r35, com.google.android.gms.internal.measurement.zzoi r36, com.google.android.gms.internal.measurement.zzls r37, com.google.android.gms.internal.measurement.zznh r38) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.zzl(java.lang.Class, com.google.android.gms.internal.measurement.zznj, com.google.android.gms.internal.measurement.zznr, com.google.android.gms.internal.measurement.zzmy, com.google.android.gms.internal.measurement.zzoi, com.google.android.gms.internal.measurement.zzls, com.google.android.gms.internal.measurement.zznh):com.google.android.gms.internal.measurement.zznp");
    }

    private static Field zzm(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            AbstractC3264qG.v(sb, "Field ", str, " for ", name);
            throw new RuntimeException(AbstractC3264qG.l(sb, " not found. Known fields are ", string), e);
        }
    }

    private final void zzn(Object obj, Object obj2, int i) {
        if (zzJ(obj2, i)) {
            int iZzx = zzx(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzx;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i2 = this.zzc[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(AbstractC3219pQ.a(i2, 38) + string.length());
                sb.append("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            zznx zznxVarZzp = zzp(i);
            if (!zzJ(obj, i)) {
                if (zzA(object)) {
                    Object objZza = zznxVarZzp.zza();
                    zznxVarZzp.zzd(objZza, object);
                    unsafe.putObject(obj, j, objZza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzK(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzA(object2)) {
                Object objZza2 = zznxVarZzp.zza();
                zznxVarZzp.zzd(objZza2, object2);
                unsafe.putObject(obj, j, objZza2);
                object2 = objZza2;
            }
            zznxVarZzp.zzd(object2, object);
        }
    }

    private final void zzo(Object obj, Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzL(obj2, i2, i)) {
            int iZzx = zzx(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzx;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i3 = iArr[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(AbstractC3219pQ.a(i3, 38) + string.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            zznx zznxVarZzp = zzp(i);
            if (!zzL(obj, i2, i)) {
                if (zzA(object)) {
                    Object objZza = zznxVarZzp.zza();
                    zznxVarZzp.zzd(objZza, object);
                    unsafe.putObject(obj, j, objZza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzM(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzA(object2)) {
                Object objZza2 = zznxVarZzp.zza();
                zznxVarZzp.zzd(objZza2, object2);
                unsafe.putObject(obj, j, objZza2);
                object2 = objZza2;
            }
            zznxVarZzp.zzd(object2, object);
        }
    }

    private final zznx zzp(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zznx zznxVar = (zznx) objArr[i3];
        if (zznxVar != null) {
            return zznxVar;
        }
        zznx zznxVarZzb = zznu.zza().zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zznxVarZzb;
        return zznxVarZzb;
    }

    private final Object zzq(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final zzmk zzr(int i) {
        int i2 = i / 3;
        return (zzmk) this.zzd[i2 + i2 + 1];
    }

    private final Object zzs(Object obj, int i) {
        zznx zznxVarZzp = zzp(i);
        int iZzx = zzx(i) & 1048575;
        if (!zzJ(obj, i)) {
            return zznxVarZzp.zza();
        }
        Object object = zzb.getObject(obj, iZzx);
        if (zzA(object)) {
            return object;
        }
        Object objZza = zznxVarZzp.zza();
        if (object != null) {
            zznxVarZzp.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzt(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzx(i) & 1048575, obj2);
        zzK(obj, i);
    }

    private final Object zzu(Object obj, int i, int i2) {
        zznx zznxVarZzp = zzp(i2);
        if (!zzL(obj, i, i2)) {
            return zznxVarZzp.zza();
        }
        Object object = zzb.getObject(obj, zzx(i2) & 1048575);
        if (zzA(object)) {
            return object;
        }
        Object objZza = zznxVarZzp.zza();
        if (object != null) {
            zznxVarZzp.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzv(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzx(i2) & 1048575, obj2);
        zzM(obj, i, i2);
    }

    private static boolean zzw(Object obj, int i, zznx zznxVar) {
        return zznxVar.zzk(zzop.zzn(obj, i & 1048575));
    }

    private final int zzx(int i) {
        return this.zzc[i + 1];
    }

    private final int zzy(int i) {
        return this.zzc[i + 2];
    }

    private static int zzz(int i) {
        return (i >>> 20) & 255;
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final Object zza() {
        return ((zzmf) this.zzg).zzch();
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final boolean zzb(Object obj, Object obj2) {
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzx = zzx(i);
            long j = iZzx & 1048575;
            switch (zzz(iZzx)) {
                case 0:
                    if (!zzH(obj, obj2, i) || Double.doubleToLongBits(zzop.zzl(obj, j)) != Double.doubleToLongBits(zzop.zzl(obj2, j))) {
                        return false;
                    }
                    break;
                    break;
                case 1:
                    if (!zzH(obj, obj2, i) || Float.floatToIntBits(zzop.zzj(obj, j)) != Float.floatToIntBits(zzop.zzj(obj2, j))) {
                        return false;
                    }
                    break;
                case 2:
                    if (!zzH(obj, obj2, i) || zzop.zzf(obj, j) != zzop.zzf(obj2, j)) {
                        return false;
                    }
                    break;
                    break;
                case 3:
                    if (!zzH(obj, obj2, i) || zzop.zzf(obj, j) != zzop.zzf(obj2, j)) {
                        return false;
                    }
                    break;
                    break;
                case 4:
                    if (!zzH(obj, obj2, i) || zzop.zzd(obj, j) != zzop.zzd(obj2, j)) {
                        return false;
                    }
                    break;
                    break;
                case 5:
                    if (!zzH(obj, obj2, i) || zzop.zzf(obj, j) != zzop.zzf(obj2, j)) {
                        return false;
                    }
                    break;
                case 6:
                    if (!zzH(obj, obj2, i) || zzop.zzd(obj, j) != zzop.zzd(obj2, j)) {
                        return false;
                    }
                    break;
                    break;
                case 7:
                    if (!zzH(obj, obj2, i) || zzop.zzh(obj, j) != zzop.zzh(obj2, j)) {
                        return false;
                    }
                    break;
                    break;
                case 8:
                    if (!zzH(obj, obj2, i) || !zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                        return false;
                    }
                    break;
                case 9:
                    if (!zzH(obj, obj2, i) || !zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                        return false;
                    }
                    break;
                case 10:
                    if (!zzH(obj, obj2, i) || !zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                        return false;
                    }
                    break;
                    break;
                case 11:
                    if (!zzH(obj, obj2, i) || zzop.zzd(obj, j) != zzop.zzd(obj2, j)) {
                        return false;
                    }
                    break;
                case 12:
                    if (!zzH(obj, obj2, i) || zzop.zzd(obj, j) != zzop.zzd(obj2, j)) {
                        return false;
                    }
                    break;
                case 13:
                    if (!zzH(obj, obj2, i) || zzop.zzd(obj, j) != zzop.zzd(obj2, j)) {
                        return false;
                    }
                    break;
                case 14:
                    if (!zzH(obj, obj2, i) || zzop.zzf(obj, j) != zzop.zzf(obj2, j)) {
                        return false;
                    }
                    break;
                    break;
                case 15:
                    if (!zzH(obj, obj2, i) || zzop.zzd(obj, j) != zzop.zzd(obj2, j)) {
                        return false;
                    }
                    break;
                case 16:
                    if (!zzH(obj, obj2, i) || zzop.zzf(obj, j) != zzop.zzf(obj2, j)) {
                        return false;
                    }
                    break;
                case 17:
                    if (!zzH(obj, obj2, i) || !zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                        return false;
                    }
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
                    if (!zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
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
                    long jZzy = zzy(i) & 1048575;
                    if (zzop.zzd(obj, jZzy) != zzop.zzd(obj2, jZzy) || !zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                        return false;
                    }
                    break;
                    break;
            }
        }
        if (!((zzmf) obj).zzc.equals(((zzmf) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzmc) obj).zzb.equals(((zzmc) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f4 A[PHI: r1 r2
      0x00f4: PHI (r1v12 int) = (r1v7 int), (r1v13 int) binds: [B:75:0x0110, B:69:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x00f4: PHI (r2v8 java.lang.Object) = (r2v5 java.lang.Object), (r2v9 java.lang.Object) binds: [B:75:0x0110, B:69:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.measurement.zznx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.zzc(java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    @Override // com.google.android.gms.internal.measurement.zznx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(java.lang.Object r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.zzd(java.lang.Object, java.lang.Object):void");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.measurement.zznx
    public final int zze(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 1758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.zze(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v20 */
    @Override // com.google.android.gms.internal.measurement.zznx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.Object r20, com.google.android.gms.internal.measurement.zzov r21) {
        /*
            Method dump skipped, instructions count: 1668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.zzf(java.lang.Object, com.google.android.gms.internal.measurement.zzov):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:217:0x052c, code lost:
    
        if (r2 == 0) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x052e, code lost:
    
        r9.add(com.google.android.gms.internal.measurement.zzlh.zzb);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0534, code lost:
    
        r9.add(com.google.android.gms.internal.measurement.zzlh.zzh(r12, r1, r2));
        r1 = r1 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x053c, code lost:
    
        if (r1 >= r11) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x053e, code lost:
    
        r2 = com.google.android.gms.internal.measurement.zzkx.zza(r12, r1, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0544, code lost:
    
        if (r8 != r10.zza) goto L704;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0546, code lost:
    
        r1 = com.google.android.gms.internal.measurement.zzkx.zza(r12, r2, r10);
        r2 = r10.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x054c, code lost:
    
        if (r2 < 0) goto L630;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0550, code lost:
    
        if (r2 > (r12.length - r1)) goto L631;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0552, code lost:
    
        if (r2 != 0) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x055a, code lost:
    
        throw new com.google.android.gms.internal.measurement.zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0560, code lost:
    
        throw new com.google.android.gms.internal.measurement.zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0561, code lost:
    
        r2 = r1;
        r20 = r15;
        r1 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x06a2, code lost:
    
        if (r10.zzb != 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x06a4, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x06a6, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x06a7, code lost:
    
        r9.zzf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x06aa, code lost:
    
        if (r2 >= r11) goto L717;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x06ac, code lost:
    
        r3 = com.google.android.gms.internal.measurement.zzkx.zza(r12, r2, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x06b2, code lost:
    
        if (r8 != r10.zza) goto L718;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x06b4, code lost:
    
        r2 = com.google.android.gms.internal.measurement.zzkx.zzc(r12, r3, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x06bc, code lost:
    
        if (r10.zzb == 0) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0a40, code lost:
    
        throw new com.google.android.gms.internal.measurement.zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0ce4, code lost:
    
        if (r3 == r5) goto L568;
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x0ce6, code lost:
    
        r13.putInt(r8, r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0cea, code lost:
    
        r3 = r1.zzj;
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x0cf0, code lost:
    
        if (r3 >= r1.zzk) goto L680;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0cf2, code lost:
    
        r5 = r1.zzi;
        r6 = r1.zzl;
        r7 = r1.zzc;
        r5 = r5[r3];
        r7 = r7[r5];
        r9 = com.google.android.gms.internal.measurement.zzop.zzn(r8, r1.zzx(r5) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x0d09, code lost:
    
        if (r9 == null) goto L681;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x0d0b, code lost:
    
        r12 = r1.zzr(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0d0f, code lost:
    
        if (r12 == null) goto L682;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x0d11, code lost:
    
        r5 = ((com.google.android.gms.internal.measurement.zznf) r1.zzq(r5)).zze();
        r9 = ((com.google.android.gms.internal.measurement.zzng) r9).entrySet().iterator();
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0d29, code lost:
    
        if (r9.hasNext() == false) goto L683;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x0d2b, code lost:
    
        r13 = (java.util.Map.Entry) r9.next();
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x0d3f, code lost:
    
        if (r12.zza(((java.lang.Integer) r13.getValue()).intValue()) != false) goto L685;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x0d41, code lost:
    
        if (r4 != null) goto L582;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x0d43, code lost:
    
        r4 = r6.zza(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x0d47, code lost:
    
        r14 = com.google.android.gms.internal.measurement.zznf.zzc(r5, r13.getKey(), r13.getValue());
        r15 = com.google.android.gms.internal.measurement.zzlh.zzb;
        r15 = new byte[r14];
        r16 = com.google.android.gms.internal.measurement.zzlm.zzb;
        r10 = new com.google.android.gms.internal.measurement.zzlk(r15, 0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0d5f, code lost:
    
        com.google.android.gms.internal.measurement.zznf.zzb(r10, r5, r13.getKey(), r13.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x0d6a, code lost:
    
        r4.zzk((r7 << 3) | 2, com.google.android.gms.internal.measurement.zzle.zza(r10, r15));
        r9.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x0d81, code lost:
    
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x0d84, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x0d8a, code lost:
    
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x0d8b, code lost:
    
        r3 = r3 + 1;
        r1 = r33;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x0d97, code lost:
    
        if (r4 == null) goto L592;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x0d99, code lost:
    
        ((com.google.android.gms.internal.measurement.zzmf) r8).zzc = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x0da0, code lost:
    
        if (r0 != 0) goto L598;
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:0x0da2, code lost:
    
        if (r2 != r37) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x0dac, code lost:
    
        throw new com.google.android.gms.internal.measurement.zzmr(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:598:0x0dad, code lost:
    
        r3 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x0daf, code lost:
    
        if (r2 > r37) goto L602;
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x0db1, code lost:
    
        if (r11 != r0) goto L602;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x0db3, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x0db9, code lost:
    
        throw new com.google.android.gms.internal.measurement.zzmr(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x053c, code lost:
    
        r9.add(com.google.android.gms.internal.measurement.zzlh.zzh(r12, r1, r2));
        r1 = r1 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x06a7, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x08e8 A[PHI: r1 r10 r11 r12 r13 r18 r20 r25
      0x08e8: PHI (r1v57 com.google.android.gms.internal.measurement.zznp<T>) = 
      (r1v1 com.google.android.gms.internal.measurement.zznp<T>)
      (r1v1 com.google.android.gms.internal.measurement.zznp<T>)
      (r1v1 com.google.android.gms.internal.measurement.zznp<T>)
      (r1v1 com.google.android.gms.internal.measurement.zznp<T>)
      (r1v1 com.google.android.gms.internal.measurement.zznp<T>)
      (r1v58 com.google.android.gms.internal.measurement.zznp<T>)
     binds: [B:414:0x08bf, B:394:0x084f, B:373:0x07eb, B:362:0x07ab, B:352:0x0771, B:147:0x03c6] A[DONT_GENERATE, DONT_INLINE]
      0x08e8: PHI (r10v29 com.google.android.gms.internal.measurement.zzkw) = 
      (r10v13 com.google.android.gms.internal.measurement.zzkw)
      (r10v14 com.google.android.gms.internal.measurement.zzkw)
      (r10v15 com.google.android.gms.internal.measurement.zzkw)
      (r10v16 com.google.android.gms.internal.measurement.zzkw)
      (r10v18 com.google.android.gms.internal.measurement.zzkw)
      (r10v30 com.google.android.gms.internal.measurement.zzkw)
     binds: [B:414:0x08bf, B:394:0x084f, B:373:0x07eb, B:362:0x07ab, B:352:0x0771, B:147:0x03c6] A[DONT_GENERATE, DONT_INLINE]
      0x08e8: PHI (r11v55 int) = (r11v39 int), (r11v40 int), (r11v41 int), (r11v42 int), (r11v44 int), (r11v56 int) binds: [B:414:0x08bf, B:394:0x084f, B:373:0x07eb, B:362:0x07ab, B:352:0x0771, B:147:0x03c6] A[DONT_GENERATE, DONT_INLINE]
      0x08e8: PHI (r12v29 byte[]) = (r12v13 byte[]), (r12v14 byte[]), (r12v15 byte[]), (r12v16 byte[]), (r12v18 byte[]), (r12v30 byte[]) binds: [B:414:0x08bf, B:394:0x084f, B:373:0x07eb, B:362:0x07ab, B:352:0x0771, B:147:0x03c6] A[DONT_GENERATE, DONT_INLINE]
      0x08e8: PHI (r13v33 int) = (r13v17 int), (r13v18 int), (r13v19 int), (r13v20 int), (r13v22 int), (r13v34 int) binds: [B:414:0x08bf, B:394:0x084f, B:373:0x07eb, B:362:0x07ab, B:352:0x0771, B:147:0x03c6] A[DONT_GENERATE, DONT_INLINE]
      0x08e8: PHI (r18v36 int) = (r18v19 int), (r18v20 int), (r18v21 int), (r18v22 int), (r18v24 int), (r18v37 int) binds: [B:414:0x08bf, B:394:0x084f, B:373:0x07eb, B:362:0x07ab, B:352:0x0771, B:147:0x03c6] A[DONT_GENERATE, DONT_INLINE]
      0x08e8: PHI (r20v12 int) = (r20v2 int), (r20v3 int), (r20v4 int), (r20v5 int), (r20v7 int), (r20v13 int) binds: [B:414:0x08bf, B:394:0x084f, B:373:0x07eb, B:362:0x07ab, B:352:0x0771, B:147:0x03c6] A[DONT_GENERATE, DONT_INLINE]
      0x08e8: PHI (r25v19 sun.misc.Unsafe) = 
      (r25v3 sun.misc.Unsafe)
      (r25v4 sun.misc.Unsafe)
      (r25v5 sun.misc.Unsafe)
      (r25v6 sun.misc.Unsafe)
      (r25v8 sun.misc.Unsafe)
      (r25v20 sun.misc.Unsafe)
     binds: [B:414:0x08bf, B:394:0x084f, B:373:0x07eb, B:362:0x07ab, B:352:0x0771, B:147:0x03c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0c57  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0c6f  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0c8d  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0cb5  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x08ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:656:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:673:0x08ff A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v38, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:227:0x0552 -> B:218:0x052e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:258:0x05e3 -> B:250:0x05c2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:278:0x0632 -> B:268:0x0606). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:314:0x06bc -> B:307:0x06a4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzh(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.measurement.zzkw r39) {
        /*
            Method dump skipped, instructions count: 3658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.zzh(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzkw):int");
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzkw zzkwVar) {
        zzh(obj, bArr, i, i2, 0, zzkwVar);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    @Override // com.google.android.gms.internal.measurement.zznx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zzA(r8)
            if (r0 != 0) goto L8
            goto L87
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.measurement.zzmf
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.gms.internal.measurement.zzmf r0 = (com.google.android.gms.internal.measurement.zzmf) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzcm(r2)
            r0.zza = r1
            r0.zzcg()
        L1b:
            int[] r0 = r7.zzc
        L1d:
            int r2 = r0.length
            if (r1 >= r2) goto L79
            int r2 = r7.zzx(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzz(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L6f
            r5 = 60
            if (r2 == r5) goto L59
            r5 = 68
            if (r2 == r5) goto L59
            switch(r2) {
                case 17: goto L6f;
                case 18: goto L4f;
                case 19: goto L4f;
                case 20: goto L4f;
                case 21: goto L4f;
                case 22: goto L4f;
                case 23: goto L4f;
                case 24: goto L4f;
                case 25: goto L4f;
                case 26: goto L4f;
                case 27: goto L4f;
                case 28: goto L4f;
                case 29: goto L4f;
                case 30: goto L4f;
                case 31: goto L4f;
                case 32: goto L4f;
                case 33: goto L4f;
                case 34: goto L4f;
                case 35: goto L4f;
                case 36: goto L4f;
                case 37: goto L4f;
                case 38: goto L4f;
                case 39: goto L4f;
                case 40: goto L4f;
                case 41: goto L4f;
                case 42: goto L4f;
                case 43: goto L4f;
                case 44: goto L4f;
                case 45: goto L4f;
                case 46: goto L4f;
                case 47: goto L4f;
                case 48: goto L4f;
                case 49: goto L4f;
                case 50: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L76
        L3d:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.measurement.zznp.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L76
            r6 = r5
            com.google.android.gms.internal.measurement.zzng r6 = (com.google.android.gms.internal.measurement.zzng) r6
            r6.zzd()
            r2.putObject(r8, r3, r5)
            goto L76
        L4f:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.zzop.zzn(r8, r3)
            com.google.android.gms.internal.measurement.zzmo r2 = (com.google.android.gms.internal.measurement.zzmo) r2
            r2.zzb()
            goto L76
        L59:
            r2 = r0[r1]
            boolean r2 = r7.zzL(r8, r2, r1)
            if (r2 == 0) goto L76
        L61:
            com.google.android.gms.internal.measurement.zznx r2 = r7.zzp(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.measurement.zznp.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzj(r3)
            goto L76
        L6f:
            boolean r2 = r7.zzJ(r8, r1)
            if (r2 == 0) goto L76
            goto L61
        L76:
            int r1 = r1 + 3
            goto L1d
        L79:
            com.google.android.gms.internal.measurement.zzoi r0 = r7.zzl
            r0.zzb(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L87
            com.google.android.gms.internal.measurement.zzls r0 = r7.zzm
            r0.zza(r8)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.zzj(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc  */
    @Override // com.google.android.gms.internal.measurement.zznx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzk(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.zzk(java.lang.Object):boolean");
    }
}
