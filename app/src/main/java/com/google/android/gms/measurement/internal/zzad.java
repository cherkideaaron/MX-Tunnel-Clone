package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
final class zzad extends zzos {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    public zzad(zzpg zzpgVar) {
        super(zzpgVar);
    }

    private final zzy zzc(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzy) this.zzc.get(num);
        }
        zzy zzyVar = new zzy(this, this.zza, null);
        this.zzc.put(num, zzyVar);
        return zzyVar;
    }

    private final boolean zzd(int i, int i2) {
        zzy zzyVar = (zzy) this.zzc.get(Integer.valueOf(i));
        if (zzyVar == null) {
            return false;
        }
        return zzyVar.zzc().get(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:399:0x0988, code lost:
    
        r0 = r13.zzaV().zze();
        r1 = com.google.android.gms.measurement.internal.zzgu.zzl(r29.zza);
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x099a, code lost:
    
        if (r8.zza() == false) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x099c, code lost:
    
        r6 = java.lang.Integer.valueOf(r8.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x09a5, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x09a6, code lost:
    
        r0.zzc("Invalid property filter ID. appId, id", r1, java.lang.String.valueOf(r6));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x086d A[PHI: r0 r13 r30
      0x086d: PHI (r0v140 java.util.Map) = (r0v142 java.util.Map), (r0v147 java.util.Map) binds: [B:365:0x0896, B:353:0x0869] A[DONT_GENERATE, DONT_INLINE]
      0x086d: PHI (r13v16 android.database.Cursor) = (r13v17 android.database.Cursor), (r13v18 android.database.Cursor) binds: [B:365:0x0896, B:353:0x0869] A[DONT_GENERATE, DONT_INLINE]
      0x086d: PHI (r30v8 java.util.Iterator) = (r30v9 java.util.Iterator), (r30v12 java.util.Iterator) binds: [B:365:0x0896, B:353:0x0869] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0a66  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01aa A[Catch: all -> 0x01b8, SQLiteException -> 0x01bb, TRY_LEAVE, TryCatch #19 {all -> 0x01b8, blocks: (B:60:0x01a4, B:62:0x01aa, B:69:0x01c2, B:70:0x01c7, B:71:0x01d1, B:72:0x01e1, B:79:0x020d, B:74:0x01f0, B:76:0x0200, B:78:0x0206, B:94:0x0233), top: B:456:0x01a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c2 A[Catch: all -> 0x01b8, SQLiteException -> 0x01bb, TRY_ENTER, TryCatch #19 {all -> 0x01b8, blocks: (B:60:0x01a4, B:62:0x01aa, B:69:0x01c2, B:70:0x01c7, B:71:0x01d1, B:72:0x01e1, B:79:0x020d, B:74:0x01f0, B:76:0x0200, B:78:0x0206, B:94:0x0233), top: B:456:0x01a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024c  */
    /* JADX WARN: Type inference failed for: r0v34, types: [WF, Z3] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v59, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zzb(java.lang.String r30, java.util.List r31, java.util.List r32, java.lang.Long r33, java.lang.Long r34, boolean r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzad.zzb(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.List");
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final boolean zzbb() {
        return false;
    }
}
