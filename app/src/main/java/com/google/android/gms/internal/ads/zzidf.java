package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import defpackage.AbstractC3219pQ;
import defpackage.AbstractC3264qG;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzidf<T> implements zzidu<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zziem.zzs();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzidc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzief zzm;
    private final zzibc zzn;

    private zzidf(int[] iArr, Object[] objArr, int i, int i2, zzidc zzidcVar, boolean z, int[] iArr2, int i3, int i4, zzidi zzidiVar, zzico zzicoVar, zzief zziefVar, zzibc zzibcVar, zzicx zzicxVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzidcVar instanceof zzibr;
        boolean z2 = false;
        if (zzibcVar != null && (zzidcVar instanceof zzibn)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzm = zziefVar;
        this.zzn = zzibcVar;
        this.zzg = zzidcVar;
    }

    private final int zzA(int i) {
        return this.zzc[i + 1];
    }

    private final int zzB(int i) {
        return this.zzc[i + 2];
    }

    private static int zzC(int i) {
        return (i >>> 20) & 255;
    }

    private static boolean zzD(int i) {
        return (i & 536870912) != 0;
    }

    private static boolean zzE(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzibr) {
            return ((zzibr) obj).zzaX();
        }
        return true;
    }

    private static void zzF(Object obj) {
        if (!zzE(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static double zzG(Object obj, long j) {
        return ((Double) zziem.zzn(obj, j)).doubleValue();
    }

    private static float zzH(Object obj, long j) {
        return ((Float) zziem.zzn(obj, j)).floatValue();
    }

    private static int zzI(Object obj, long j) {
        return ((Integer) zziem.zzn(obj, j)).intValue();
    }

    private static long zzJ(Object obj, long j) {
        return ((Long) zziem.zzn(obj, j)).longValue();
    }

    private static boolean zzK(Object obj, long j) {
        return ((Boolean) zziem.zzn(obj, j)).booleanValue();
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return zzN(obj, i) == zzN(obj2, i);
    }

    private final boolean zzM(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzN(obj, i) : (i3 & i4) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int iZzB = zzB(i);
        long j = iZzB & 1048575;
        if (j != 1048575) {
            return (zziem.zzd(obj, j) & (1 << (iZzB >>> 20))) != 0;
        }
        int iZzA = zzA(i);
        long j2 = iZzA & 1048575;
        switch (zzC(iZzA)) {
            case 0:
                return Double.doubleToRawLongBits(zziem.zzl(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zziem.zzj(obj, j2)) != 0;
            case 2:
                return zziem.zzf(obj, j2) != 0;
            case 3:
                return zziem.zzf(obj, j2) != 0;
            case 4:
                return zziem.zzd(obj, j2) != 0;
            case 5:
                return zziem.zzf(obj, j2) != 0;
            case 6:
                return zziem.zzd(obj, j2) != 0;
            case 7:
                return zziem.zzh(obj, j2);
            case 8:
                Object objZzn = zziem.zzn(obj, j2);
                if (objZzn instanceof String) {
                    return !((String) objZzn).isEmpty();
                }
                if (objZzn instanceof zzian) {
                    return !zzian.zza.equals(objZzn);
                }
                throw new IllegalArgumentException();
            case 9:
                return zziem.zzn(obj, j2) != null;
            case 10:
                return !zzian.zza.equals(zziem.zzn(obj, j2));
            case 11:
                return zziem.zzd(obj, j2) != 0;
            case 12:
                return zziem.zzd(obj, j2) != 0;
            case 13:
                return zziem.zzd(obj, j2) != 0;
            case 14:
                return zziem.zzf(obj, j2) != 0;
            case 15:
                return zziem.zzd(obj, j2) != 0;
            case 16:
                return zziem.zzf(obj, j2) != 0;
            case 17:
                return zziem.zzn(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzO(Object obj, int i) {
        int iZzB = zzB(i);
        long j = 1048575 & iZzB;
        if (j == 1048575) {
            return;
        }
        zziem.zze(obj, j, (1 << (iZzB >>> 20)) | zziem.zzd(obj, j));
    }

    private final boolean zzP(Object obj, int i, int i2) {
        return zziem.zzd(obj, (long) (zzB(i2) & 1048575)) == i;
    }

    private final void zzQ(Object obj, int i, int i2) {
        zziem.zze(obj, zzB(i2) & 1048575, i);
    }

    private final int zzR(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzS(i, 0);
    }

    private final int zzS(int i, int i2) {
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

    private static final int zzT(byte[] bArr, int i, int i2, zzies zziesVar, Class cls, zziab zziabVar) {
        int i3;
        Object objValueOf;
        int iZzc;
        long jZzL;
        int iZzK;
        Object objValueOf2;
        zzies zziesVar2 = zzies.zza;
        switch (zziesVar.ordinal()) {
            case 0:
                i3 = i + 8;
                objValueOf = Double.valueOf(Double.longBitsToDouble(zziac.zze(bArr, i)));
                zziabVar.zzc = objValueOf;
                return i3;
            case 1:
                i3 = i + 4;
                objValueOf = Float.valueOf(Float.intBitsToFloat(zziac.zzd(bArr, i)));
                zziabVar.zzc = objValueOf;
                return i3;
            case 2:
            case 3:
                iZzc = zziac.zzc(bArr, i, zziabVar);
                jZzL = zziabVar.zzb;
                objValueOf2 = Long.valueOf(jZzL);
                zziabVar.zzc = objValueOf2;
                return iZzc;
            case 4:
            case 12:
            case 13:
                iZzc = zziac.zza(bArr, i, zziabVar);
                iZzK = zziabVar.zza;
                objValueOf2 = Integer.valueOf(iZzK);
                zziabVar.zzc = objValueOf2;
                return iZzc;
            case 5:
            case 15:
                i3 = i + 8;
                objValueOf = Long.valueOf(zziac.zze(bArr, i));
                zziabVar.zzc = objValueOf;
                return i3;
            case 6:
            case 14:
                i3 = i + 4;
                objValueOf = Integer.valueOf(zziac.zzd(bArr, i));
                zziabVar.zzc = objValueOf;
                return i3;
            case 7:
                iZzc = zziac.zzc(bArr, i, zziabVar);
                objValueOf2 = Boolean.valueOf(zziabVar.zzb != 0);
                zziabVar.zzc = objValueOf2;
                return iZzc;
            case 8:
                return zziac.zzf(bArr, i, zziabVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zziac.zzh(zzidm.zza().zzb(cls), bArr, i, i2, zziabVar);
            case 11:
                return zziac.zzg(bArr, i, zziabVar);
            case 16:
                iZzc = zziac.zza(bArr, i, zziabVar);
                iZzK = zziaq.zzK(zziabVar.zza);
                objValueOf2 = Integer.valueOf(iZzK);
                zziabVar.zzc = objValueOf2;
                return iZzc;
            case 17:
                iZzc = zziac.zzc(bArr, i, zziabVar);
                jZzL = zziaq.zzL(zziabVar.zzb);
                objValueOf2 = Long.valueOf(jZzL);
                zziabVar.zzc = objValueOf2;
                return iZzc;
        }
    }

    private static final void zzU(int i, Object obj, zzieu zzieuVar) {
        if (obj instanceof String) {
            zzieuVar.zzm(i, (String) obj);
        } else {
            zzieuVar.zzn(i, (zzian) obj);
        }
    }

    public static zzieg zzh(Object obj) {
        zzibr zzibrVar = (zzibr) obj;
        zzieg zziegVar = zzibrVar.zzt;
        if (zziegVar != zzieg.zza()) {
            return zziegVar;
        }
        zzieg zziegVarZzb = zzieg.zzb();
        zzibrVar.zzt = zziegVarZzb;
        return zziegVarZzb;
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
    public static com.google.android.gms.internal.ads.zzidf zzm(java.lang.Class r32, com.google.android.gms.internal.ads.zzicz r33, com.google.android.gms.internal.ads.zzidi r34, com.google.android.gms.internal.ads.zzico r35, com.google.android.gms.internal.ads.zzief r36, com.google.android.gms.internal.ads.zzibc r37, com.google.android.gms.internal.ads.zzicx r38) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzidf.zzm(java.lang.Class, com.google.android.gms.internal.ads.zzicz, com.google.android.gms.internal.ads.zzidi, com.google.android.gms.internal.ads.zzico, com.google.android.gms.internal.ads.zzief, com.google.android.gms.internal.ads.zzibc, com.google.android.gms.internal.ads.zzicx):com.google.android.gms.internal.ads.zzidf");
    }

    private static Field zzn(Class cls, String str) {
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

    private final void zzo(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            int iZzA = zzA(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzA;
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
            zzidu zziduVarZzq = zzq(i);
            if (!zzN(obj, i)) {
                if (zzE(object)) {
                    Object objZza = zziduVarZzq.zza();
                    zziduVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j, objZza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzO(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzE(object2)) {
                Object objZza2 = zziduVarZzq.zza();
                zziduVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j, objZza2);
                object2 = objZza2;
            }
            zziduVarZzq.zzd(object2, object);
        }
    }

    private final void zzp(Object obj, Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzP(obj2, i2, i)) {
            int iZzA = zzA(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzA;
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
            zzidu zziduVarZzq = zzq(i);
            if (!zzP(obj, i2, i)) {
                if (zzE(object)) {
                    Object objZza = zziduVarZzq.zza();
                    zziduVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j, objZza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzQ(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzE(object2)) {
                Object objZza2 = zziduVarZzq.zza();
                zziduVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j, objZza2);
                object2 = objZza2;
            }
            zziduVarZzq.zzd(object2, object);
        }
    }

    private final zzidu zzq(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzidu zziduVar = (zzidu) objArr[i3];
        if (zziduVar != null) {
            return zziduVar;
        }
        zzidu zziduVarZzb = zzidm.zza().zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zziduVarZzb;
        return zziduVarZzb;
    }

    private final Object zzr(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final zzibx zzs(int i) {
        int i2 = i / 3;
        return (zzibx) this.zzd[i2 + i2 + 1];
    }

    private final Object zzt(Object obj, int i) {
        zzidu zziduVarZzq = zzq(i);
        int iZzA = zzA(i) & 1048575;
        if (!zzN(obj, i)) {
            return zziduVarZzq.zza();
        }
        Object object = zzb.getObject(obj, iZzA);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zziduVarZzq.zza();
        if (object != null) {
            zziduVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzu(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzA(i) & 1048575, obj2);
        zzO(obj, i);
    }

    private final Object zzv(Object obj, int i, int i2) {
        zzidu zziduVarZzq = zzq(i2);
        if (!zzP(obj, i, i2)) {
            return zziduVarZzq.zza();
        }
        Object object = zzb.getObject(obj, zzA(i2) & 1048575);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zziduVarZzq.zza();
        if (object != null) {
            zziduVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzw(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzA(i2) & 1048575, obj2);
        zzQ(obj, i, i2);
    }

    private final Object zzx(Object obj, int i, Object obj2, zzief zziefVar, Object obj3) {
        zzibx zzibxVarZzs;
        int i2 = this.zzc[i];
        Object objZzn = zziem.zzn(obj, zzA(i) & 1048575);
        if (objZzn == null || (zzibxVarZzs = zzs(i)) == null) {
            return obj2;
        }
        zzicu zzicuVarZze = ((zzicv) zzr(i)).zze();
        Iterator it = ((zzicw) objZzn).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzibxVarZzs.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = zziefVar.zzh(obj3);
                }
                int iZzc = zzicv.zzc(zzicuVarZze, entry.getKey(), entry.getValue());
                zzian zzianVar = zzian.zza;
                byte[] bArr = new byte[iZzc];
                int i3 = zziaw.zzf;
                zziat zziatVar = new zziat(bArr, 0, iZzc);
                try {
                    zzicv.zzb(zziatVar, zzicuVarZze, entry.getKey(), entry.getValue());
                    zziefVar.zzd(obj2, i2, zziaj.zza(zziatVar, bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    private static boolean zzy(Object obj, int i, zzidu zziduVar) {
        return zziduVar.zzl(zziem.zzn(obj, i & 1048575));
    }

    private final void zzz(Object obj, int i, zzidp zzidpVar) {
        zziem.zzo(obj, i & 1048575, zzD(i) ? zzidpVar.zzn() : this.zzi ? zzidpVar.zzm() : zzidpVar.zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final Object zza() {
        return ((zzibr) this.zzg).zzbg();
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final boolean zzb(Object obj, Object obj2) {
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzA = zzA(i);
            long j = iZzA & 1048575;
            switch (zzC(iZzA)) {
                case 0:
                    if (!zzL(obj, obj2, i) || Double.doubleToLongBits(zziem.zzl(obj, j)) != Double.doubleToLongBits(zziem.zzl(obj2, j))) {
                        return false;
                    }
                    break;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i) || Float.floatToIntBits(zziem.zzj(obj, j)) != Float.floatToIntBits(zziem.zzj(obj2, j))) {
                        return false;
                    }
                    break;
                case 2:
                    if (!zzL(obj, obj2, i) || zziem.zzf(obj, j) != zziem.zzf(obj2, j)) {
                        return false;
                    }
                    break;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i) || zziem.zzf(obj, j) != zziem.zzf(obj2, j)) {
                        return false;
                    }
                    break;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i) || zziem.zzd(obj, j) != zziem.zzd(obj2, j)) {
                        return false;
                    }
                    break;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i) || zziem.zzf(obj, j) != zziem.zzf(obj2, j)) {
                        return false;
                    }
                    break;
                case 6:
                    if (!zzL(obj, obj2, i) || zziem.zzd(obj, j) != zziem.zzd(obj2, j)) {
                        return false;
                    }
                    break;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i) || zziem.zzh(obj, j) != zziem.zzh(obj2, j)) {
                        return false;
                    }
                    break;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i) || !zzidw.zzG(zziem.zzn(obj, j), zziem.zzn(obj2, j))) {
                        return false;
                    }
                    break;
                case 9:
                    if (!zzL(obj, obj2, i) || !zzidw.zzG(zziem.zzn(obj, j), zziem.zzn(obj2, j))) {
                        return false;
                    }
                    break;
                case 10:
                    if (!zzL(obj, obj2, i) || !zzidw.zzG(zziem.zzn(obj, j), zziem.zzn(obj2, j))) {
                        return false;
                    }
                    break;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i) || zziem.zzd(obj, j) != zziem.zzd(obj2, j)) {
                        return false;
                    }
                    break;
                case 12:
                    if (!zzL(obj, obj2, i) || zziem.zzd(obj, j) != zziem.zzd(obj2, j)) {
                        return false;
                    }
                    break;
                case 13:
                    if (!zzL(obj, obj2, i) || zziem.zzd(obj, j) != zziem.zzd(obj2, j)) {
                        return false;
                    }
                    break;
                case 14:
                    if (!zzL(obj, obj2, i) || zziem.zzf(obj, j) != zziem.zzf(obj2, j)) {
                        return false;
                    }
                    break;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i) || zziem.zzd(obj, j) != zziem.zzd(obj2, j)) {
                        return false;
                    }
                    break;
                case 16:
                    if (!zzL(obj, obj2, i) || zziem.zzf(obj, j) != zziem.zzf(obj2, j)) {
                        return false;
                    }
                    break;
                case 17:
                    if (!zzL(obj, obj2, i) || !zzidw.zzG(zziem.zzn(obj, j), zziem.zzn(obj2, j))) {
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
                    if (!zzidw.zzG(zziem.zzn(obj, j), zziem.zzn(obj2, j))) {
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
                    long jZzB = zzB(i) & 1048575;
                    if (zziem.zzd(obj, jZzB) != zziem.zzd(obj2, jZzB) || !zzidw.zzG(zziem.zzn(obj, j), zziem.zzn(obj2, j))) {
                        return false;
                    }
                    break;
                    break;
            }
        }
        if (!((zzibr) obj).zzt.equals(((zzibr) obj2).zzt)) {
            return false;
        }
        if (this.zzh) {
            return ((zzibn) obj).zza.equals(((zzibn) obj2).zza);
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f4 A[PHI: r1 r2
      0x00f4: PHI (r1v12 int) = (r1v7 int), (r1v13 int) binds: [B:75:0x0110, B:69:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x00f4: PHI (r2v8 java.lang.Object) = (r2v5 java.lang.Object), (r2v9 java.lang.Object) binds: [B:75:0x0110, B:69:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.zzidu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzidf.zzc(java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    @Override // com.google.android.gms.internal.ads.zzidu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(java.lang.Object r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzidf.zzd(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ee A[PHI: r0
      0x01ee: PHI (r0v137 int) = 
      (r0v100 int)
      (r0v103 int)
      (r0v106 int)
      (r0v109 int)
      (r0v112 int)
      (r0v115 int)
      (r0v118 int)
      (r0v121 int)
      (r0v124 int)
      (r0v127 int)
      (r0v130 int)
      (r0v133 int)
      (r0v136 int)
      (r0v140 int)
     binds: [B:143:0x02a6, B:140:0x0298, B:137:0x028a, B:134:0x027c, B:131:0x026e, B:128:0x0261, B:125:0x0254, B:122:0x0247, B:119:0x0238, B:116:0x022b, B:113:0x021e, B:110:0x0211, B:107:0x0204, B:104:0x01ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04c4 A[PHI: r10
      0x04c4: PHI (r10v20 int) = (r10v5 int), (r10v6 int), (r10v11 int), (r10v12 int), (r10v19 int), (r10v21 int) binds: [B:275:0x05d9, B:272:0x05c8, B:260:0x057f, B:257:0x056e, B:234:0x04d9, B:231:0x04c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5 A[PHI: r0 r1
      0x00f5: PHI (r0v164 int) = (r0v29 int), (r0v35 int), (r0v158 int), (r0v167 int) binds: [B:251:0x054d, B:244:0x0519, B:61:0x0127, B:51:0x00ef] A[DONT_GENERATE, DONT_INLINE]
      0x00f5: PHI (r1v90 java.lang.Object) = (r1v22 java.lang.Object), (r1v25 java.lang.Object), (r1v87 java.lang.Object), (r1v93 java.lang.Object) binds: [B:251:0x054d, B:244:0x0519, B:61:0x0127, B:51:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012a A[PHI: r0 r1
      0x012a: PHI (r0v155 int) = (r0v29 int), (r0v158 int) binds: [B:251:0x054d, B:61:0x0127] A[DONT_GENERATE, DONT_INLINE]
      0x012a: PHI (r1v84 java.lang.Object) = (r1v22 java.lang.Object), (r1v87 java.lang.Object) binds: [B:251:0x054d, B:61:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0192  */
    /* JADX WARN: Type inference failed for: r0v142, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v197, types: [int] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v122 */
    /* JADX WARN: Type inference failed for: r1v123 */
    /* JADX WARN: Type inference failed for: r1v124 */
    /* JADX WARN: Type inference failed for: r1v51, types: [int] */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64, types: [int] */
    /* JADX WARN: Type inference failed for: r2v35, types: [int] */
    /* JADX WARN: Type inference failed for: r2v37, types: [int] */
    /* JADX WARN: Type inference failed for: r2v44, types: [int] */
    /* JADX WARN: Type inference failed for: r2v52, types: [int] */
    /* JADX WARN: Type inference failed for: r2v56, types: [int] */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v60, types: [int] */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v69 */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r2v71 */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference failed for: r2v73 */
    /* JADX WARN: Type inference failed for: r2v74 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29, types: [int] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32, types: [int] */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v39, types: [int] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v46, types: [int] */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36, types: [int] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v41, types: [int] */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.gms.internal.ads.zzidu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zze(java.lang.Object r20) throws com.google.android.gms.internal.ads.zzieq {
        /*
            Method dump skipped, instructions count: 1750
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzidf.zze(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024f  */
    @Override // com.google.android.gms.internal.ads.zzidu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.Object r22, com.google.android.gms.internal.ads.zzieu r23) {
        /*
            Method dump skipped, instructions count: 1692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzidf.zzf(java.lang.Object, com.google.android.gms.internal.ads.zzieu):void");
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzg(Object obj, zzidp zzidpVar, zzibb zzibbVar) {
        Object objZzx;
        zzidc zzidcVar;
        int iZzs;
        List listZza;
        List listZza2;
        List listZza3;
        List listZza4;
        List listZza5;
        List listZza6;
        List listZza7;
        List listZza8;
        List listZza9;
        List listZza10;
        zzibx zzibxVarZzs;
        List listZza11;
        List listZza12;
        List listZza13;
        List listZza14;
        zzidc zzidcVar2;
        zzibbVar.getClass();
        zzF(obj);
        zzief zziefVar = this.zzm;
        Object objZzh = null;
        while (true) {
            try {
                int iZzb = zzidpVar.zzb();
                int iZzR = zzR(iZzb);
                if (iZzR >= 0) {
                    int iZzA = zzA(iZzR);
                    try {
                    } catch (zzicf unused) {
                        if (objZzh == null) {
                            objZzh = zziefVar.zzh(obj);
                        }
                        if (!zziefVar.zzk(objZzh, zzidpVar, 0)) {
                            objZzx = objZzh;
                            for (int i = this.zzk; i < this.zzl; i++) {
                                objZzx = zzx(obj, this.zzj[i], objZzx, zziefVar, obj);
                            }
                        }
                    }
                    switch (zzC(iZzA)) {
                        case 0:
                            zziem.zzm(obj, iZzA & 1048575, zzidpVar.zze());
                            zzO(obj, iZzR);
                        case 1:
                            zziem.zzk(obj, iZzA & 1048575, zzidpVar.zzf());
                            zzO(obj, iZzR);
                        case 2:
                            zziem.zzg(obj, iZzA & 1048575, zzidpVar.zzh());
                            zzO(obj, iZzR);
                        case 3:
                            zziem.zzg(obj, iZzA & 1048575, zzidpVar.zzg());
                            zzO(obj, iZzR);
                        case 4:
                            zziem.zze(obj, iZzA & 1048575, zzidpVar.zzi());
                            zzO(obj, iZzR);
                        case 5:
                            zziem.zzg(obj, iZzA & 1048575, zzidpVar.zzj());
                            zzO(obj, iZzR);
                        case 6:
                            zziem.zze(obj, iZzA & 1048575, zzidpVar.zzk());
                            zzO(obj, iZzR);
                        case 7:
                            zziem.zzi(obj, iZzA & 1048575, zzidpVar.zzl());
                            zzO(obj, iZzR);
                        case 8:
                            zzz(obj, iZzA, zzidpVar);
                            zzO(obj, iZzR);
                        case 9:
                            zzidcVar = (zzidc) zzt(obj, iZzR);
                            zzidpVar.zzo(zzidcVar, zzq(iZzR), zzibbVar);
                            zzu(obj, iZzR, zzidcVar);
                        case 10:
                            zziem.zzo(obj, iZzA & 1048575, zzidpVar.zzq());
                            zzO(obj, iZzR);
                        case 11:
                            zziem.zze(obj, iZzA & 1048575, zzidpVar.zzr());
                            zzO(obj, iZzR);
                        case 12:
                            iZzs = zzidpVar.zzs();
                            zzibx zzibxVarZzs2 = zzs(iZzR);
                            if (zzibxVarZzs2 == null || zzibxVarZzs2.zza(iZzs)) {
                                zziem.zze(obj, iZzA & 1048575, iZzs);
                                zzO(obj, iZzR);
                            } else {
                                objZzh = zzidw.zzK(obj, iZzb, iZzs, objZzh, zziefVar);
                            }
                            break;
                        case 13:
                            zziem.zze(obj, iZzA & 1048575, zzidpVar.zzt());
                            zzO(obj, iZzR);
                        case 14:
                            zziem.zzg(obj, iZzA & 1048575, zzidpVar.zzu());
                            zzO(obj, iZzR);
                        case 15:
                            zziem.zze(obj, iZzA & 1048575, zzidpVar.zzv());
                            zzO(obj, iZzR);
                        case 16:
                            zziem.zzg(obj, iZzA & 1048575, zzidpVar.zzw());
                            zzO(obj, iZzR);
                        case 17:
                            zzidcVar = (zzidc) zzt(obj, iZzR);
                            zzidpVar.zzp(zzidcVar, zzq(iZzR), zzibbVar);
                            zzu(obj, iZzR, zzidcVar);
                        case 18:
                            listZza = zzico.zza(obj, iZzA & 1048575);
                            zzidpVar.zzx(listZza);
                        case 19:
                            listZza2 = zzico.zza(obj, iZzA & 1048575);
                            zzidpVar.zzy(listZza2);
                        case 20:
                            listZza3 = zzico.zza(obj, iZzA & 1048575);
                            zzidpVar.zzA(listZza3);
                        case 21:
                            listZza4 = zzico.zza(obj, iZzA & 1048575);
                            zzidpVar.zzz(listZza4);
                        case 22:
                            listZza5 = zzico.zza(obj, iZzA & 1048575);
                            zzidpVar.zzB(listZza5);
                        case ConnectionResult.API_DISABLED /* 23 */:
                            listZza6 = zzico.zza(obj, iZzA & 1048575);
                            zzidpVar.zzC(listZza6);
                        case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                            listZza7 = zzico.zza(obj, iZzA & 1048575);
                            zzidpVar.zzD(listZza7);
                        case 25:
                            listZza8 = zzico.zza(obj, iZzA & 1048575);
                            zzidpVar.zzE(listZza8);
                        case 26:
                            if (zzD(iZzA)) {
                                ((zziar) zzidpVar).zzF(zzico.zza(obj, iZzA & 1048575), true);
                            } else {
                                ((zziar) zzidpVar).zzF(zzico.zza(obj, iZzA & 1048575), false);
                            }
                        case 27:
                            zzidpVar.zzG(zzico.zza(obj, iZzA & 1048575), zzq(iZzR), zzibbVar);
                        case 28:
                            zzidpVar.zzI(zzico.zza(obj, iZzA & 1048575));
                        case 29:
                            listZza9 = zzico.zza(obj, iZzA & 1048575);
                            zzidpVar.zzJ(listZza9);
                        case 30:
                            listZza10 = zzico.zza(obj, iZzA & 1048575);
                            zzidpVar.zzK(listZza10);
                            zzibxVarZzs = zzs(iZzR);
                            objZzh = zzidw.zzJ(obj, iZzb, listZza10, zzibxVarZzs, objZzh, zziefVar);
                        case 31:
                            listZza11 = zzico.zza(obj, iZzA & 1048575);
                            zzidpVar.zzL(listZza11);
                        case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                            listZza12 = zzico.zza(obj, iZzA & 1048575);
                            zzidpVar.zzM(listZza12);
                        case 33:
                            listZza13 = zzico.zza(obj, iZzA & 1048575);
                            zzidpVar.zzN(listZza13);
                        case 34:
                            listZza14 = zzico.zza(obj, iZzA & 1048575);
                            zzidpVar.zzO(listZza14);
                        case 35:
                            listZza = zzico.zza(obj, iZzA & 1048575);
                            zzidpVar.zzx(listZza);
                        case 36:
                            listZza2 = zzico.zza(obj, iZzA & 1048575);
                            zzidpVar.zzy(listZza2);
                        case 37:
                            listZza3 = zzico.zza(obj, iZzA & 1048575);
                            zzidpVar.zzA(listZza3);
                        case 38:
                            listZza4 = zzico.zza(obj, iZzA & 1048575);
                            zzidpVar.zzz(listZza4);
                        case 39:
                            listZza5 = zzico.zza(obj, iZzA & 1048575);
                            zzidpVar.zzB(listZza5);
                        case 40:
                            listZza6 = zzico.zza(obj, iZzA & 1048575);
                            zzidpVar.zzC(listZza6);
                        case 41:
                            listZza7 = zzico.zza(obj, iZzA & 1048575);
                            zzidpVar.zzD(listZza7);
                        case 42:
                            listZza8 = zzico.zza(obj, iZzA & 1048575);
                            zzidpVar.zzE(listZza8);
                        case 43:
                            listZza9 = zzico.zza(obj, iZzA & 1048575);
                            zzidpVar.zzJ(listZza9);
                        case 44:
                            listZza10 = zzico.zza(obj, iZzA & 1048575);
                            zzidpVar.zzK(listZza10);
                            zzibxVarZzs = zzs(iZzR);
                            objZzh = zzidw.zzJ(obj, iZzb, listZza10, zzibxVarZzs, objZzh, zziefVar);
                        case 45:
                            listZza11 = zzico.zza(obj, iZzA & 1048575);
                            zzidpVar.zzL(listZza11);
                        case 46:
                            listZza12 = zzico.zza(obj, iZzA & 1048575);
                            zzidpVar.zzM(listZza12);
                        case 47:
                            listZza13 = zzico.zza(obj, iZzA & 1048575);
                            zzidpVar.zzN(listZza13);
                        case 48:
                            listZza14 = zzico.zza(obj, iZzA & 1048575);
                            zzidpVar.zzO(listZza14);
                        case 49:
                            zzidpVar.zzH(zzico.zza(obj, iZzA & 1048575), zzq(iZzR), zzibbVar);
                        case 50:
                            Object objZzr = zzr(iZzR);
                            long jZzA = zzA(iZzR) & 1048575;
                            Object objZzn = zziem.zzn(obj, jZzA);
                            if (objZzn == null) {
                                objZzn = zzicw.zza().zzc();
                                zziem.zzo(obj, jZzA, objZzn);
                            } else if (zzicx.zza(objZzn)) {
                                Object objZzc = zzicw.zza().zzc();
                                zzicx.zzb(objZzc, objZzn);
                                zziem.zzo(obj, jZzA, objZzc);
                                objZzn = objZzc;
                            }
                            zzidpVar.zzP((zzicw) objZzn, ((zzicv) objZzr).zze(), zzibbVar);
                        case 51:
                            zziem.zzo(obj, iZzA & 1048575, Double.valueOf(zzidpVar.zze()));
                            zzQ(obj, iZzb, iZzR);
                        case 52:
                            zziem.zzo(obj, iZzA & 1048575, Float.valueOf(zzidpVar.zzf()));
                            zzQ(obj, iZzb, iZzR);
                        case 53:
                            zziem.zzo(obj, iZzA & 1048575, Long.valueOf(zzidpVar.zzh()));
                            zzQ(obj, iZzb, iZzR);
                        case 54:
                            zziem.zzo(obj, iZzA & 1048575, Long.valueOf(zzidpVar.zzg()));
                            zzQ(obj, iZzb, iZzR);
                        case 55:
                            zziem.zzo(obj, iZzA & 1048575, Integer.valueOf(zzidpVar.zzi()));
                            zzQ(obj, iZzb, iZzR);
                        case 56:
                            zziem.zzo(obj, iZzA & 1048575, Long.valueOf(zzidpVar.zzj()));
                            zzQ(obj, iZzb, iZzR);
                        case 57:
                            zziem.zzo(obj, iZzA & 1048575, Integer.valueOf(zzidpVar.zzk()));
                            zzQ(obj, iZzb, iZzR);
                        case 58:
                            zziem.zzo(obj, iZzA & 1048575, Boolean.valueOf(zzidpVar.zzl()));
                            zzQ(obj, iZzb, iZzR);
                        case 59:
                            zzz(obj, iZzA, zzidpVar);
                            zzQ(obj, iZzb, iZzR);
                        case 60:
                            zzidcVar2 = (zzidc) zzv(obj, iZzb, iZzR);
                            zzidpVar.zzo(zzidcVar2, zzq(iZzR), zzibbVar);
                            zzw(obj, iZzb, iZzR, zzidcVar2);
                        case 61:
                            zziem.zzo(obj, iZzA & 1048575, zzidpVar.zzq());
                            zzQ(obj, iZzb, iZzR);
                        case 62:
                            zziem.zzo(obj, iZzA & 1048575, Integer.valueOf(zzidpVar.zzr()));
                            zzQ(obj, iZzb, iZzR);
                        case 63:
                            iZzs = zzidpVar.zzs();
                            zzibx zzibxVarZzs3 = zzs(iZzR);
                            if (zzibxVarZzs3 != null && !zzibxVarZzs3.zza(iZzs)) {
                                objZzh = zzidw.zzK(obj, iZzb, iZzs, objZzh, zziefVar);
                            }
                            zziem.zzo(obj, iZzA & 1048575, Integer.valueOf(iZzs));
                            zzQ(obj, iZzb, iZzR);
                            break;
                        case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                            zziem.zzo(obj, iZzA & 1048575, Integer.valueOf(zzidpVar.zzt()));
                            zzQ(obj, iZzb, iZzR);
                        case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                            zziem.zzo(obj, iZzA & 1048575, Long.valueOf(zzidpVar.zzu()));
                            zzQ(obj, iZzb, iZzR);
                        case 66:
                            zziem.zzo(obj, iZzA & 1048575, Integer.valueOf(zzidpVar.zzv()));
                            zzQ(obj, iZzb, iZzR);
                        case 67:
                            zziem.zzo(obj, iZzA & 1048575, Long.valueOf(zzidpVar.zzw()));
                            zzQ(obj, iZzb, iZzR);
                        case 68:
                            zzidcVar2 = (zzidc) zzv(obj, iZzb, iZzR);
                            zzidpVar.zzp(zzidcVar2, zzq(iZzR), zzibbVar);
                            zzw(obj, iZzb, iZzR, zzidcVar2);
                        default:
                            if (objZzh == null) {
                                objZzh = zziefVar.zzh(obj);
                            }
                            if (!zziefVar.zzk(objZzh, zzidpVar, 0)) {
                                objZzx = objZzh;
                                for (int i2 = this.zzk; i2 < this.zzl; i2++) {
                                    objZzx = zzx(obj, this.zzj[i2], objZzx, zziefVar, obj);
                                }
                                break;
                            }
                    }
                } else if (iZzb == Integer.MAX_VALUE) {
                    objZzx = objZzh;
                    for (int i3 = this.zzk; i3 < this.zzl; i3++) {
                        objZzx = zzx(obj, this.zzj[i3], objZzx, zziefVar, obj);
                    }
                } else {
                    if ((!this.zzh ? null : zzibbVar.zzc(this.zzg, iZzb)) != null) {
                        throw null;
                    }
                    if (objZzh == null) {
                        objZzh = zziefVar.zzh(obj);
                    }
                    if (!zziefVar.zzk(objZzh, zzidpVar, 0)) {
                        objZzx = objZzh;
                        for (int i4 = this.zzk; i4 < this.zzl; i4++) {
                            objZzx = zzx(obj, this.zzj[i4], objZzx, zziefVar, obj);
                        }
                    }
                }
            } catch (Throwable th) {
                Object objZzx2 = objZzh;
                for (int i5 = this.zzk; i5 < this.zzl; i5++) {
                    objZzx2 = zzx(obj, this.zzj[i5], objZzx2, zziefVar, obj);
                }
                if (objZzx2 != null) {
                    zziefVar.zzi(obj, objZzx2);
                }
                throw th;
            }
        }
        if (objZzx != null) {
            zziefVar.zzi(obj, objZzx);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x05ad, code lost:
    
        if (r1 == 0) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x05af, code lost:
    
        r11.add(com.google.android.gms.internal.ads.zzian.zza);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x05b5, code lost:
    
        r11.add(com.google.android.gms.internal.ads.zzian.zzs(r36, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x05bd, code lost:
    
        if (r0 >= r7) goto L681;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x05bf, code lost:
    
        r1 = com.google.android.gms.internal.ads.zziac.zza(r36, r0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x05c5, code lost:
    
        if (r10 != r14.zza) goto L682;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x05c7, code lost:
    
        r0 = com.google.android.gms.internal.ads.zziac.zza(r36, r1, r14);
        r1 = r14.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x05cd, code lost:
    
        if (r1 < 0) goto L590;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x05d1, code lost:
    
        if (r1 > (r36.length - r0)) goto L591;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x05d3, code lost:
    
        if (r1 != 0) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x05db, code lost:
    
        throw new com.google.android.gms.internal.ads.zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x05e3, code lost:
    
        throw new com.google.android.gms.internal.ads.zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x072d, code lost:
    
        if (r14.zzb != 0) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x072f, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0731, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0733, code lost:
    
        r11.zzg(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0736, code lost:
    
        if (r1 >= r7) goto L698;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0738, code lost:
    
        r3 = com.google.android.gms.internal.ads.zziac.zza(r36, r1, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x073e, code lost:
    
        if (r4 != r14.zza) goto L696;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0740, code lost:
    
        r1 = com.google.android.gms.internal.ads.zziac.zzc(r36, r3, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0748, code lost:
    
        if (r14.zzb == 0) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0aea, code lost:
    
        throw new com.google.android.gms.internal.ads.zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0e7d, code lost:
    
        if (r11 == r0) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0e7f, code lost:
    
        r9.putInt(r14, r11, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x0e83, code lost:
    
        r6 = r10.zzk;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x0e8a, code lost:
    
        if (r6 >= r10.zzl) goto L672;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x0e8c, code lost:
    
        r3 = (com.google.android.gms.internal.ads.zzieg) zzx(r35, r10.zzj[r6], r3, r10.zzm, r35);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x0ea2, code lost:
    
        if (r3 == null) goto L554;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0ea4, code lost:
    
        r10.zzm.zzi(r14, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x0eab, code lost:
    
        if (r7 != 0) goto L560;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x0ead, code lost:
    
        if (r8 != r38) goto L558;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x0eb7, code lost:
    
        throw new com.google.android.gms.internal.ads.zzicg(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x0eb8, code lost:
    
        r1 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0eba, code lost:
    
        if (r8 > r38) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0ebc, code lost:
    
        if (r12 != r7) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0ebe, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x0ec4, code lost:
    
        throw new com.google.android.gms.internal.ads.zzicg(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x05bd, code lost:
    
        r11.add(com.google.android.gms.internal.ads.zzian.zzs(r36, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0733, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0e03  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0e17  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0e55  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x0975 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:652:0x0989 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v166, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:199:0x05d3 -> B:190:0x05af). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:231:0x0665 -> B:223:0x0644). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:253:0x06b4 -> B:243:0x068b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:290:0x0748 -> B:283:0x072f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzi(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, com.google.android.gms.internal.ads.zziab r40) throws com.google.android.gms.internal.ads.zzicg {
        /*
            Method dump skipped, instructions count: 3926
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzidf.zzi(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zziab):int");
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzj(Object obj, byte[] bArr, int i, int i2, zziab zziabVar) throws zzicg {
        zzi(obj, bArr, i, i2, 0, zziabVar);
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
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    @Override // com.google.android.gms.internal.ads.zzidu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzk(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zzE(r8)
            if (r0 != 0) goto L8
            goto L85
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzibr
            if (r0 == 0) goto L18
            r0 = r8
            com.google.android.gms.internal.ads.zzibr r0 = (com.google.android.gms.internal.ads.zzibr) r0
            r0.zzbq()
            r0.zzbb()
            r0.zzaY()
        L18:
            int[] r0 = r7.zzc
            r1 = 0
        L1b:
            int r2 = r0.length
            if (r1 >= r2) goto L77
            int r2 = r7.zzA(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzC(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L6d
            r5 = 60
            if (r2 == r5) goto L57
            r5 = 68
            if (r2 == r5) goto L57
            switch(r2) {
                case 17: goto L6d;
                case 18: goto L4d;
                case 19: goto L4d;
                case 20: goto L4d;
                case 21: goto L4d;
                case 22: goto L4d;
                case 23: goto L4d;
                case 24: goto L4d;
                case 25: goto L4d;
                case 26: goto L4d;
                case 27: goto L4d;
                case 28: goto L4d;
                case 29: goto L4d;
                case 30: goto L4d;
                case 31: goto L4d;
                case 32: goto L4d;
                case 33: goto L4d;
                case 34: goto L4d;
                case 35: goto L4d;
                case 36: goto L4d;
                case 37: goto L4d;
                case 38: goto L4d;
                case 39: goto L4d;
                case 40: goto L4d;
                case 41: goto L4d;
                case 42: goto L4d;
                case 43: goto L4d;
                case 44: goto L4d;
                case 45: goto L4d;
                case 46: goto L4d;
                case 47: goto L4d;
                case 48: goto L4d;
                case 49: goto L4d;
                case 50: goto L3b;
                default: goto L3a;
            }
        L3a:
            goto L74
        L3b:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.ads.zzidf.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L74
            r6 = r5
            com.google.android.gms.internal.ads.zzicw r6 = (com.google.android.gms.internal.ads.zzicw) r6
            r6.zzd()
            r2.putObject(r8, r3, r5)
            goto L74
        L4d:
            java.lang.Object r2 = com.google.android.gms.internal.ads.zziem.zzn(r8, r3)
            com.google.android.gms.internal.ads.zzicd r2 = (com.google.android.gms.internal.ads.zzicd) r2
            r2.zzb()
            goto L74
        L57:
            r2 = r0[r1]
            boolean r2 = r7.zzP(r8, r2, r1)
            if (r2 == 0) goto L74
        L5f:
            com.google.android.gms.internal.ads.zzidu r2 = r7.zzq(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.ads.zzidf.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzk(r3)
            goto L74
        L6d:
            boolean r2 = r7.zzN(r8, r1)
            if (r2 == 0) goto L74
            goto L5f
        L74:
            int r1 = r1 + 3
            goto L1b
        L77:
            com.google.android.gms.internal.ads.zzief r0 = r7.zzm
            r0.zzj(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L85
            com.google.android.gms.internal.ads.zzibc r0 = r7.zzn
            r0.zza(r8)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzidf.zzk(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc  */
    @Override // com.google.android.gms.internal.ads.zzidu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzl(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzidf.zzl(java.lang.Object):boolean");
    }
}
