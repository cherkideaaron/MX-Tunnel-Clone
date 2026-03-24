package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.AbstractC3264qG;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class zzamq<T> implements zzanb<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzanz.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzamm zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzamu zzn;
    private final zzalw zzo;
    private final zzanu<?, ?> zzp;
    private final zzakw<?> zzq;
    private final zzamf zzr;

    private zzamq(int[] iArr, Object[] objArr, int i, int i2, zzamm zzammVar, boolean z, int[] iArr2, int i3, int i4, zzamu zzamuVar, zzalw zzalwVar, zzanu<?, ?> zzanuVar, zzakw<?> zzakwVar, zzamf zzamfVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzammVar instanceof zzalf;
        this.zzh = zzakwVar != null && zzakwVar.zza(zzammVar);
        this.zzj = false;
        this.zzk = iArr2;
        this.zzl = i3;
        this.zzm = i4;
        this.zzn = zzamuVar;
        this.zzo = zzalwVar;
        this.zzp = zzanuVar;
        this.zzq = zzakwVar;
        this.zzg = zzammVar;
        this.zzr = zzamfVar;
    }

    private static <T> double zza(T t, long j) {
        return ((Double) zzanz.zze(t, j)).doubleValue();
    }

    private static <T> float zzb(T t, long j) {
        return ((Float) zzanz.zze(t, j)).floatValue();
    }

    private final int zzc(int i) {
        return this.zzc[i + 1];
    }

    private static <T> long zzd(T t, long j) {
        return ((Long) zzanz.zze(t, j)).longValue();
    }

    private final zzanb zze(int i) {
        int i2 = (i / 3) << 1;
        zzanb zzanbVar = (zzanb) this.zzd[i2];
        if (zzanbVar != null) {
            return zzanbVar;
        }
        zzanb<T> zzanbVarZza = zzamx.zza().zza((Class) this.zzd[i2 + 1]);
        this.zzd[i2] = zzanbVarZza;
        return zzanbVarZza;
    }

    private final Object zzf(int i) {
        return this.zzd[(i / 3) << 1];
    }

    private static boolean zzg(int i) {
        return (i & 536870912) != 0;
    }

    private final int zza(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zza(i, 0);
    }

    private final int zzb(int i) {
        return this.zzc[i + 2];
    }

    private static <T> int zzc(T t, long j) {
        return ((Integer) zzanz.zze(t, j)).intValue();
    }

    private final zzalj zzd(int i) {
        return (zzalj) this.zzd[((i / 3) << 1) + 1];
    }

    private static void zzf(Object obj) {
        if (!zzg(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzalf) {
            return ((zzalf) obj).zzw();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d2  */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.firebase-auth-api.zzanb] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.firebase-auth-api.zzanb] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zze(T r18) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zze(java.lang.Object):boolean");
    }

    private final int zza(int i, int i2) {
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

    public static zzanx zzc(Object obj) {
        zzalf zzalfVar = (zzalf) obj;
        zzanx zzanxVar = zzalfVar.zzb;
        if (zzanxVar != zzanx.zzc()) {
            return zzanxVar;
        }
        zzanx zzanxVarZzd = zzanx.zzd();
        zzalfVar.zzb = zzanxVarZzd;
        return zzanxVarZzd;
    }

    private static <T> boolean zze(T t, long j) {
        return ((Boolean) zzanz.zze(t, j)).booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f7 A[PHI: r3
      0x00f7: PHI (r3v9 java.lang.Object) = (r3v6 java.lang.Object), (r3v10 java.lang.Object) binds: [B:75:0x0113, B:69:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(T r9) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zzb(java.lang.Object):int");
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
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(T r8) {
        /*
            r7 = this;
            boolean r0 = zzg(r8)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r8 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzalf
            r1 = 0
            if (r0 == 0) goto L1a
            r0 = r8
            com.google.android.gms.internal.firebase-auth-api.zzalf r0 = (com.google.android.gms.internal.p002firebaseauthapi.zzalf) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzb(r2)
            r0.zza = r1
            r0.zzu()
        L1a:
            int[] r0 = r7.zzc
            int r0 = r0.length
        L1d:
            if (r1 >= r0) goto L77
            int r2 = r7.zzc(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            long r3 = (long) r3
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r2 = r2 & r5
            int r2 = r2 >>> 20
            r5 = 9
            if (r2 == r5) goto L6d
            r5 = 60
            if (r2 == r5) goto L55
            r5 = 68
            if (r2 == r5) goto L55
            switch(r2) {
                case 17: goto L6d;
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
            goto L74
        L3d:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.p002firebaseauthapi.zzamq.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L74
            com.google.android.gms.internal.firebase-auth-api.zzamf r6 = r7.zzr
            java.lang.Object r5 = r6.zzc(r5)
            r2.putObject(r8, r3, r5)
            goto L74
        L4f:
            com.google.android.gms.internal.firebase-auth-api.zzalw r2 = r7.zzo
            r2.zzb(r8, r3)
            goto L74
        L55:
            int[] r2 = r7.zzc
            r2 = r2[r1]
            boolean r2 = r7.zzc(r8, r2, r1)
            if (r2 == 0) goto L74
        L5f:
            com.google.android.gms.internal.firebase-auth-api.zzanb r2 = r7.zze(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.p002firebaseauthapi.zzamq.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzd(r3)
            goto L74
        L6d:
            boolean r2 = r7.zzc(r8, r1)
            if (r2 == 0) goto L74
            goto L5f
        L74:
            int r1 = r1 + 3
            goto L1d
        L77:
            com.google.android.gms.internal.firebase-auth-api.zzanu<?, ?> r0 = r7.zzp
            r0.zzf(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L85
            com.google.android.gms.internal.firebase-auth-api.zzakw<?> r0 = r7.zzq
            r0.zzc(r8)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zzd(java.lang.Object):void");
    }

    private final void zzb(T t, int i) {
        int iZzb = zzb(i);
        long j = 1048575 & iZzb;
        if (j == 1048575) {
            return;
        }
        zzanz.zza((Object) t, j, (1 << (iZzb >>> 20)) | zzanz.zzc(t, j));
    }

    private final boolean zzc(T t, int i) {
        int iZzb = zzb(i);
        long j = iZzb & 1048575;
        if (j != 1048575) {
            return (zzanz.zzc(t, j) & (1 << (iZzb >>> 20))) != 0;
        }
        int iZzc = zzc(i);
        long j2 = iZzc & 1048575;
        switch ((iZzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzanz.zza(t, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzanz.zzb(t, j2)) != 0;
            case 2:
                return zzanz.zzd(t, j2) != 0;
            case 3:
                return zzanz.zzd(t, j2) != 0;
            case 4:
                return zzanz.zzc(t, j2) != 0;
            case 5:
                return zzanz.zzd(t, j2) != 0;
            case 6:
                return zzanz.zzc(t, j2) != 0;
            case 7:
                return zzanz.zzh(t, j2);
            case 8:
                Object objZze = zzanz.zze(t, j2);
                if (objZze instanceof String) {
                    return !((String) objZze).isEmpty();
                }
                if (objZze instanceof zzajv) {
                    return !zzajv.zza.equals(objZze);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzanz.zze(t, j2) != null;
            case 10:
                return !zzajv.zza.equals(zzanz.zze(t, j2));
            case 11:
                return zzanz.zzc(t, j2) != 0;
            case 12:
                return zzanz.zzc(t, j2) != 0;
            case 13:
                return zzanz.zzc(t, j2) != 0;
            case 14:
                return zzanz.zzd(t, j2) != 0;
            case 15:
                return zzanz.zzc(t, j2) != 0;
            case 16:
                return zzanz.zzd(t, j2) != 0;
            case 17:
                return zzanz.zze(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0358, code lost:
    
        if (zza((com.google.android.gms.internal.p002firebaseauthapi.zzamq<T>) r18, r11, r14, r16, r5) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0368, code lost:
    
        if (zza((com.google.android.gms.internal.p002firebaseauthapi.zzamq<T>) r18, r11, r14, r16, r5) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03e5, code lost:
    
        if (zza((com.google.android.gms.internal.p002firebaseauthapi.zzamq<T>) r18, r11, r14, r16, r5) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
    
        if (zzc((com.google.android.gms.internal.p002firebaseauthapi.zzamq<T>) r18, r13, r11) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
    
        r0 = com.google.android.gms.internal.p002firebaseauthapi.zzakn.zzc(r13, 0L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a2, code lost:
    
        if (zzc((com.google.android.gms.internal.p002firebaseauthapi.zzamq<T>) r18, r13, r11) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a4, code lost:
    
        r1 = com.google.android.gms.internal.p002firebaseauthapi.zzakn.zzd(r13, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0108, code lost:
    
        if (zzc((com.google.android.gms.internal.p002firebaseauthapi.zzamq<T>) r18, r13, r11) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010a, code lost:
    
        r0 = com.google.android.gms.internal.p002firebaseauthapi.zzakn.zza(r13, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d3 A[PHI: r0
      0x00d3: PHI (r0v190 java.lang.Object) = (r0v43 java.lang.Object), (r0v49 java.lang.Object), (r0v185 java.lang.Object), (r0v194 java.lang.Object) binds: [B:177:0x03d5, B:170:0x03a5, B:61:0x00f9, B:52:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fc A[PHI: r0
      0x00fc: PHI (r0v181 java.lang.Object) = (r0v43 java.lang.Object), (r0v185 java.lang.Object) binds: [B:177:0x03d5, B:61:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019e A[PHI: r0
      0x019e: PHI (r0v152 int) = 
      (r0v115 int)
      (r0v118 int)
      (r0v121 int)
      (r0v124 int)
      (r0v127 int)
      (r0v130 int)
      (r0v133 int)
      (r0v136 int)
      (r0v139 int)
      (r0v142 int)
      (r0v145 int)
      (r0v148 int)
      (r0v151 int)
      (r0v155 int)
     binds: [B:130:0x0255, B:127:0x0247, B:124:0x0239, B:121:0x022b, B:118:0x021d, B:115:0x0210, B:112:0x0203, B:109:0x01f6, B:106:0x01e9, B:103:0x01dc, B:100:0x01cf, B:97:0x01c2, B:94:0x01b5, B:91:0x019c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(T r18) {
        /*
            Method dump skipped, instructions count: 1410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zza(java.lang.Object):int");
    }

    private final void zzb(T t, int i, int i2) {
        zzanz.zza((Object) t, zzb(i2) & 1048575, i);
    }

    private final boolean zzc(T t, int i, int i2) {
        return zzanz.zzc(t, (long) (zzb(i2) & 1048575)) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:277:0x06f8, code lost:
    
        if (r15.zzb != 0) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x06fa, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x06fc, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x06fe, code lost:
    
        r5.zza(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0701, code lost:
    
        if (r1 >= r13) goto L680;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0703, code lost:
    
        r2 = com.google.android.gms.internal.p002firebaseauthapi.zzajr.zzc(r14, r1, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0709, code lost:
    
        if (r12 != r15.zza) goto L681;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x070b, code lost:
    
        r1 = com.google.android.gms.internal.p002firebaseauthapi.zzajr.zzd(r14, r2, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0713, code lost:
    
        if (r15.zzb == 0) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0a50, code lost:
    
        throw com.google.android.gms.internal.p002firebaseauthapi.zzall.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x06fe, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0920 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:601:0x0cfc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:606:0x0c7f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:648:0x0911 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v63, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:197:0x05ab -> B:186:0x0585). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:226:0x063f -> B:218:0x061e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:248:0x068c -> B:238:0x0663). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:285:0x0713 -> B:278:0x06fa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(T r33, byte[] r34, int r35, int r36, int r37, com.google.android.gms.internal.p002firebaseauthapi.zzaju r38) throws com.google.android.gms.internal.p002firebaseauthapi.zzall {
        /*
            Method dump skipped, instructions count: 3578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.firebase-auth-api.zzaju):int");
    }

    private static int zza(byte[] bArr, int i, int i2, zzaog zzaogVar, Class<?> cls, zzaju zzajuVar) {
        int iZzd;
        Object objValueOf;
        Object objValueOf2;
        Object objValueOf3;
        int iZza;
        long jZza;
        switch (zzamp.zza[zzaogVar.ordinal()]) {
            case 1:
                iZzd = zzajr.zzd(bArr, i, zzajuVar);
                objValueOf = Boolean.valueOf(zzajuVar.zzb != 0);
                zzajuVar.zzc = objValueOf;
                return iZzd;
            case 2:
                return zzajr.zza(bArr, i, zzajuVar);
            case 3:
                objValueOf2 = Double.valueOf(zzajr.zza(bArr, i));
                zzajuVar.zzc = objValueOf2;
                return i + 8;
            case 4:
            case 5:
                objValueOf3 = Integer.valueOf(zzajr.zzc(bArr, i));
                zzajuVar.zzc = objValueOf3;
                return i + 4;
            case 6:
            case 7:
                objValueOf2 = Long.valueOf(zzajr.zzd(bArr, i));
                zzajuVar.zzc = objValueOf2;
                return i + 8;
            case 8:
                objValueOf3 = Float.valueOf(zzajr.zzb(bArr, i));
                zzajuVar.zzc = objValueOf3;
                return i + 4;
            case 9:
            case 10:
            case 11:
                iZzd = zzajr.zzc(bArr, i, zzajuVar);
                iZza = zzajuVar.zza;
                objValueOf = Integer.valueOf(iZza);
                zzajuVar.zzc = objValueOf;
                return iZzd;
            case 12:
            case 13:
                iZzd = zzajr.zzd(bArr, i, zzajuVar);
                jZza = zzajuVar.zzb;
                objValueOf = Long.valueOf(jZza);
                zzajuVar.zzc = objValueOf;
                return iZzd;
            case 14:
                return zzajr.zza(zzamx.zza().zza((Class) cls), bArr, i, i2, zzajuVar);
            case 15:
                iZzd = zzajr.zzc(bArr, i, zzajuVar);
                iZza = zzakh.zza(zzajuVar.zza);
                objValueOf = Integer.valueOf(iZza);
                zzajuVar.zzc = objValueOf;
                return iZzd;
            case 16:
                iZzd = zzajr.zzd(bArr, i, zzajuVar);
                jZza = zzakh.zza(zzajuVar.zzb);
                objValueOf = Long.valueOf(jZza);
                zzajuVar.zzc = objValueOf;
                return iZzd;
            case 17:
                return zzajr.zzb(bArr, i, zzajuVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t, T t2, int i) {
        int i2 = this.zzc[i];
        if (zzc((zzamq<T>) t2, i2, i)) {
            long jZzc = zzc(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t2, jZzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + String.valueOf(t2));
            }
            zzanb zzanbVarZze = zze(i);
            if (!zzc((zzamq<T>) t, i2, i)) {
                if (zzg(object)) {
                    Object objZza = zzanbVarZze.zza();
                    zzanbVarZze.zza(objZza, object);
                    unsafe.putObject(t, jZzc, objZza);
                } else {
                    unsafe.putObject(t, jZzc, object);
                }
                zzb((zzamq<T>) t, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(t, jZzc);
            if (!zzg(object2)) {
                Object objZza2 = zzanbVarZze.zza();
                zzanbVarZze.zza(objZza2, object2);
                unsafe.putObject(t, jZzc, objZza2);
                object2 = objZza2;
            }
            zzanbVarZze.zza(object2, object);
        }
    }

    private final boolean zzc(T t, T t2, int i) {
        return zzc((zzamq<T>) t, i) == zzc((zzamq<T>) t2, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> com.google.android.gms.internal.p002firebaseauthapi.zzamq<T> zza(java.lang.Class<T> r32, com.google.android.gms.internal.p002firebaseauthapi.zzamk r33, com.google.android.gms.internal.p002firebaseauthapi.zzamu r34, com.google.android.gms.internal.p002firebaseauthapi.zzalw r35, com.google.android.gms.internal.p002firebaseauthapi.zzanu<?, ?> r36, com.google.android.gms.internal.p002firebaseauthapi.zzakw<?> r37, com.google.android.gms.internal.p002firebaseauthapi.zzamf r38) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zza(java.lang.Class, com.google.android.gms.internal.firebase-auth-api.zzamk, com.google.android.gms.internal.firebase-auth-api.zzamu, com.google.android.gms.internal.firebase-auth-api.zzalw, com.google.android.gms.internal.firebase-auth-api.zzanu, com.google.android.gms.internal.firebase-auth-api.zzakw, com.google.android.gms.internal.firebase-auth-api.zzamf):com.google.android.gms.internal.firebase-auth-api.zzamq");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzb(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zzb(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final T zza() {
        return (T) this.zzn.zza(this.zzg);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzalj zzaljVar, UB ub, zzanu<UT, UB> zzanuVar, Object obj) {
        zzamd<?, ?> zzamdVarZza = this.zzr.zza(zzf(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzaljVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzanuVar.zzc(obj);
                }
                zzake zzakeVarZzc = zzajv.zzc(zzame.zza(zzamdVarZza, next.getKey(), next.getValue()));
                try {
                    zzame.zza(zzakeVarZzc.zzb(), zzamdVarZza, next.getKey(), next.getValue());
                    zzanuVar.zza((zzanu<UT, UB>) ub, i2, zzakeVarZzc.zza());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t, int i) {
        zzanb zzanbVarZze = zze(i);
        long jZzc = zzc(i) & 1048575;
        if (!zzc((zzamq<T>) t, i)) {
            return zzanbVarZze.zza();
        }
        Object object = zzb.getObject(t, jZzc);
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzanbVarZze.zza();
        if (object != null) {
            zzanbVarZze.zza(objZza, object);
        }
        return objZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t, int i, int i2) {
        zzanb zzanbVarZze = zze(i2);
        if (!zzc((zzamq<T>) t, i, i2)) {
            return zzanbVarZze.zza();
        }
        Object object = zzb.getObject(t, zzc(i2) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzanbVarZze.zza();
        if (object != null) {
            zzanbVarZze.zza(objZza, object);
        }
        return objZza;
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzanu<UT, UB> zzanuVar, Object obj2) {
        zzalj zzaljVarZzd;
        int i2 = this.zzc[i];
        Object objZze = zzanz.zze(obj, zzc(i) & 1048575);
        return (objZze == null || (zzaljVarZzd = zzd(i)) == null) ? ub : (UB) zza(i, i2, this.zzr.zze(objZze), zzaljVarZzd, (zzalj) ub, (zzanu<UT, zzalj>) zzanuVar, obj2);
    }

    private static Field zza(Class<?> cls, String str) {
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
            StringBuilder sbP = AbstractC3264qG.p("Field ", str, " for ", name, " not found. Known fields are ");
            sbP.append(string);
            throw new RuntimeException(sbP.toString(), e);
        }
    }

    private static void zza(int i, Object obj, zzaol zzaolVar) {
        if (obj instanceof String) {
            zzaolVar.zza(i, (String) obj);
        } else {
            zzaolVar.zza(i, (zzajv) obj);
        }
    }

    private static <UT, UB> void zza(zzanu<UT, UB> zzanuVar, T t, zzaol zzaolVar) {
        zzanuVar.zzb((zzanu<UT, UB>) zzanuVar.zzd(t), zzaolVar);
    }

    private final <K, V> void zza(zzaol zzaolVar, int i, Object obj, int i2) {
        if (obj != null) {
            zzaolVar.zza(i, this.zzr.zza(zzf(i2)), this.zzr.zzd(obj));
        }
    }

    private final void zza(T t, int i, int i2, Object obj) {
        zzb.putObject(t, zzc(i2) & 1048575, obj);
        zzb((zzamq<T>) t, i, i2);
    }

    private final void zza(Object obj, int i, zzanc zzancVar) {
        long j;
        Object objZzp;
        if (zzg(i)) {
            j = i & 1048575;
            objZzp = zzancVar.zzr();
        } else {
            int i2 = i & 1048575;
            if (this.zzi) {
                j = i2;
                objZzp = zzancVar.zzq();
            } else {
                j = i2;
                objZzp = zzancVar.zzp();
            }
        }
        zzanz.zza(obj, j, objZzp);
    }

    private final void zza(T t, int i, Object obj) {
        zzb.putObject(t, zzc(i) & 1048575, obj);
        zzb((zzamq<T>) t, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05b4 A[Catch: all -> 0x00cb, TryCatch #3 {all -> 0x00cb, blocks: (B:49:0x00c5, B:54:0x00d3, B:180:0x05af, B:182:0x05b4, B:183:0x05b9, B:65:0x00ff, B:66:0x010c, B:68:0x0114, B:69:0x0121, B:70:0x0125, B:71:0x0133, B:72:0x0141, B:73:0x014f, B:75:0x0159, B:78:0x0160, B:79:0x0165, B:80:0x016f, B:81:0x017d, B:82:0x0187, B:83:0x0196, B:84:0x019a, B:85:0x01a9, B:86:0x01b8, B:87:0x01c7, B:88:0x01d6, B:89:0x01e5, B:90:0x01f4, B:91:0x0203, B:92:0x0212, B:94:0x0222, B:98:0x0243, B:95:0x022c, B:97:0x0234, B:99:0x0254, B:100:0x0266, B:101:0x0274, B:102:0x0282, B:103:0x0290), top: B:208:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05e9 A[LOOP:3: B:195:0x05e5->B:197:0x05e9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05bf A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.google.android.gms.internal.firebase-auth-api.zzanc] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r18, com.google.android.gms.internal.p002firebaseauthapi.zzanc r19, com.google.android.gms.internal.p002firebaseauthapi.zzaku r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzanc, com.google.android.gms.internal.firebase-auth-api.zzaku):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r24, com.google.android.gms.internal.p002firebaseauthapi.zzaol r25) {
        /*
            Method dump skipped, instructions count: 3186
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzaol):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r7, T r8) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zza(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t, T t2, int i) {
        if (zzc((zzamq<T>) t2, i)) {
            long jZzc = zzc(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t2, jZzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + String.valueOf(t2));
            }
            zzanb zzanbVarZze = zze(i);
            if (!zzc((zzamq<T>) t, i)) {
                if (zzg(object)) {
                    Object objZza = zzanbVarZze.zza();
                    zzanbVarZze.zza(objZza, object);
                    unsafe.putObject(t, jZzc, objZza);
                } else {
                    unsafe.putObject(t, jZzc, object);
                }
                zzb((zzamq<T>) t, i);
                return;
            }
            Object object2 = unsafe.getObject(t, jZzc);
            if (!zzg(object2)) {
                Object objZza2 = zzanbVarZze.zza();
                zzanbVarZze.zza(objZza2, object2);
                unsafe.putObject(t, jZzc, objZza2);
                object2 = objZza2;
            }
            zzanbVarZze.zza(object2, object);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zza(T t, byte[] bArr, int i, int i2, zzaju zzajuVar) throws zzall {
        zza((zzamq<T>) t, bArr, i, i2, 0, zzajuVar);
    }

    private final boolean zza(T t, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzc((zzamq<T>) t, i) : (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzanb zzanbVar) {
        return zzanbVar.zze(zzanz.zze(obj, i & 1048575));
    }
}
