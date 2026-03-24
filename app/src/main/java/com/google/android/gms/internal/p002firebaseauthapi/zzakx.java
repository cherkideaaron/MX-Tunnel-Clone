package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzakx<T extends zzakz<T>> {
    private static final zzakx<?> zzb = new zzakx<>(true);
    final zzang<T, Object> zza;
    private boolean zzc;
    private boolean zzd;

    private zzakx() {
        this.zza = new zzanf();
    }

    public static <T extends zzakz<T>> zzakx<T> zzb() {
        return (zzakx<T>) zzb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() {
        zzakx zzakxVar = new zzakx();
        int iZzb = this.zza.zzb();
        for (int i = 0; i < iZzb; i++) {
            Map.Entry<K, Object> entryZza = this.zza.zza(i);
            zzakxVar.zzb((zzakz) entryZza.getKey(), entryZza.getValue());
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zzakxVar.zzb((zzakz) entry.getKey(), entry.getValue());
        }
        zzakxVar.zzd = this.zzd;
        return zzakxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzakx) {
            return this.zza.equals(((zzakx) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zza() {
        int iZzb = this.zza.zzb();
        int iZza = 0;
        for (int i = 0; i < iZzb; i++) {
            iZza += zza((Map.Entry) this.zza.zza(i));
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            iZza += zza((Map.Entry) it.next());
        }
        return iZza;
    }

    public final Iterator<Map.Entry<T, Object>> zzc() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzals(this.zza.zzd().iterator()) : this.zza.zzd().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzals(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zze() {
        if (this.zzc) {
            return;
        }
        int iZzb = this.zza.zzb();
        for (int i = 0; i < iZzb; i++) {
            Object value = this.zza.zza(i).getValue();
            if (value instanceof zzalf) {
                ((zzalf) value).zzt();
            }
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzalf) {
                ((zzalf) value2).zzt();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        int iZzb = this.zza.zzb();
        for (int i = 0; i < iZzb; i++) {
            if (!zzc(this.zza.zza(i))) {
                return false;
            }
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzc((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzakx(zzang<T, Object> zzangVar) {
        this.zza = zzangVar;
        zze();
    }

    public static int zza(zzakz<?> zzakzVar, Object obj) {
        zzaog zzaogVarZzb = zzakzVar.zzb();
        int iZza = zzakzVar.zza();
        if (!zzakzVar.zze()) {
            return zza(zzaogVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!zzakzVar.zzd()) {
            int iZza2 = 0;
            while (i < size) {
                iZza2 += zza(zzaogVarZzb, iZza, list.get(i));
                i++;
            }
            return iZza2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iZza3 = 0;
        while (i < size) {
            iZza3 += zza(zzaogVarZzb, list.get(i));
            i++;
        }
        return zzakn.zzi(iZza3) + zzakn.zzh(iZza) + iZza3;
    }

    private final void zzb(T t, Object obj) {
        if (!t.zze()) {
            zzc(t, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                zzc(t, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzalq) {
            this.zzd = true;
        }
        this.zza.zza((zzang<T, Object>) t, (T) obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzc(T r5, java.lang.Object r6) {
        /*
            com.google.android.gms.internal.firebase-auth-api.zzaog r0 = r5.zzb()
            com.google.android.gms.internal.p002firebaseauthapi.zzalh.zza(r6)
            int[] r1 = com.google.android.gms.internal.p002firebaseauthapi.zzala.zza
            com.google.android.gms.internal.firebase-auth-api.zzaoj r0 = r0.zzb()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L45;
                case 2: goto L42;
                case 3: goto L3f;
                case 4: goto L3c;
                case 5: goto L39;
                case 6: goto L36;
                case 7: goto L2d;
                case 8: goto L24;
                case 9: goto L1a;
                default: goto L18;
            }
        L18:
            r0 = r2
            goto L47
        L1a:
            boolean r0 = r6 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzamm
            if (r0 != 0) goto L22
            boolean r0 = r6 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzalq
            if (r0 == 0) goto L18
        L22:
            r0 = r1
            goto L47
        L24:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 != 0) goto L22
            boolean r0 = r6 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzalk
            if (r0 == 0) goto L18
            goto L22
        L2d:
            boolean r0 = r6 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzajv
            if (r0 != 0) goto L22
            boolean r0 = r6 instanceof byte[]
            if (r0 == 0) goto L18
            goto L22
        L36:
            boolean r0 = r6 instanceof java.lang.String
            goto L47
        L39:
            boolean r0 = r6 instanceof java.lang.Boolean
            goto L47
        L3c:
            boolean r0 = r6 instanceof java.lang.Double
            goto L47
        L3f:
            boolean r0 = r6 instanceof java.lang.Float
            goto L47
        L42:
            boolean r0 = r6 instanceof java.lang.Long
            goto L47
        L45:
            boolean r0 = r6 instanceof java.lang.Integer
        L47:
            if (r0 == 0) goto L4a
            return
        L4a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r3 = r5.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.gms.internal.firebase-auth-api.zzaog r5 = r5.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzaoj r5 = r5.zzb()
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r3
            r4[r1] = r5
            r5 = 2
            r4[r5] = r6
            java.lang.String r5 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r5 = java.lang.String.format(r5, r4)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzakx.zzc(com.google.android.gms.internal.firebase-auth-api.zzakz, java.lang.Object):void");
    }

    private zzakx(boolean z) {
        this(new zzanf());
        zze();
    }

    public static int zza(zzaog zzaogVar, int i, Object obj) {
        int iZzh = zzakn.zzh(i);
        if (zzaogVar == zzaog.zzj) {
            zzalh.zza((zzamm) obj);
            iZzh <<= 1;
        }
        return iZzh + zza(zzaogVar, obj);
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof zzalq;
        if (key.zze()) {
            if (z) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objZza = zza((zzakx<T>) key);
            List list = (List) value;
            int size = list.size();
            if (objZza == null) {
                objZza = new ArrayList(size);
            }
            List list2 = (List) objZza;
            for (int i = 0; i < size; i++) {
                list2.add(zza(list.get(i)));
            }
            this.zza.zza((zzang<T, Object>) key, (T) objZza);
            return;
        }
        if (key.zzc() != zzaoj.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.zza((zzang<T, Object>) key, (T) zza(value));
            return;
        }
        Object objZza2 = zza((zzakx<T>) key);
        if (objZza2 != null) {
            if (z) {
                throw new NoSuchMethodError();
            }
            this.zza.zza((zzang<T, Object>) key, (T) (objZza2 instanceof zzamr ? key.zza((zzamr) objZza2, (zzamr) value) : key.zza(((zzamm) objZza2).zzr(), (zzamm) value).zze()));
        } else {
            this.zza.zza((zzang<T, Object>) key, (T) zza(value));
            if (z) {
                this.zzd = true;
            }
        }
    }

    private static <T extends zzakz<T>> boolean zzc(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() != zzaoj.MESSAGE) {
            return true;
        }
        boolean zZze = key.zze();
        Object value = entry.getValue();
        if (!zZze) {
            return zzb(value);
        }
        List list = (List) value;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!zzb(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static int zza(zzaog zzaogVar, Object obj) {
        switch (zzala.zzb[zzaogVar.ordinal()]) {
            case 1:
                return zzakn.zza(((Double) obj).doubleValue());
            case 2:
                return zzakn.zza(((Float) obj).floatValue());
            case 3:
                return zzakn.zzb(((Long) obj).longValue());
            case 4:
                return zzakn.zze(((Long) obj).longValue());
            case 5:
                return zzakn.zzc(((Integer) obj).intValue());
            case 6:
                return zzakn.zza(((Long) obj).longValue());
            case 7:
                return zzakn.zzb(((Integer) obj).intValue());
            case 8:
                return zzakn.zza(((Boolean) obj).booleanValue());
            case 9:
                return ((zzamm) obj).zzl();
            case 10:
                return obj instanceof zzalq ? zzakn.zza((zzalq) obj) : zzakn.zza((zzamm) obj);
            case 11:
                return obj instanceof zzajv ? zzakn.zza((zzajv) obj) : zzakn.zza((String) obj);
            case 12:
                return obj instanceof zzajv ? zzakn.zza((zzajv) obj) : zzakn.zza((byte[]) obj);
            case 13:
                return zzakn.zzi(((Integer) obj).intValue());
            case 14:
                return zzakn.zzf(((Integer) obj).intValue());
            case 15:
                return zzakn.zzc(((Long) obj).longValue());
            case 16:
                return zzakn.zzg(((Integer) obj).intValue());
            case 17:
                return zzakn.zzd(((Long) obj).longValue());
            case 18:
                return obj instanceof zzalk ? zzakn.zza(((zzalk) obj).zza()) : zzakn.zza(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static boolean zzb(Object obj) {
        if (obj instanceof zzamo) {
            return ((zzamo) obj).zzv();
        }
        if (obj instanceof zzalq) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static int zza(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() != zzaoj.MESSAGE || key.zze() || key.zzd()) {
            return zza((zzakz<?>) key, value);
        }
        boolean z = value instanceof zzalq;
        int iZza = entry.getKey().zza();
        return z ? zzakn.zza(iZza, (zzalq) value) : zzakn.zza(iZza, (zzamm) value);
    }

    private final Object zza(T t) {
        Object obj = this.zza.get(t);
        if (obj instanceof zzalq) {
            throw new NoSuchMethodError();
        }
        return obj;
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzamr) {
            return ((zzamr) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static void zza(zzakn zzaknVar, zzaog zzaogVar, int i, Object obj) {
        if (zzaogVar == zzaog.zzj) {
            zzamm zzammVar = (zzamm) obj;
            zzalh.zza(zzammVar);
            zzaknVar.zzj(i, 3);
            zzammVar.zza(zzaknVar);
            zzaknVar.zzj(i, 4);
        }
        zzaknVar.zzj(i, zzaogVar.zza());
        switch (zzala.zzb[zzaogVar.ordinal()]) {
            case 1:
                zzaknVar.zzb(((Double) obj).doubleValue());
                break;
            case 2:
                zzaknVar.zzb(((Float) obj).floatValue());
                break;
            case 3:
                zzaknVar.zzh(((Long) obj).longValue());
                break;
            case 4:
                zzaknVar.zzh(((Long) obj).longValue());
                break;
            case 5:
                zzaknVar.zzk(((Integer) obj).intValue());
                break;
            case 6:
                zzaknVar.zzf(((Long) obj).longValue());
                break;
            case 7:
                zzaknVar.zzj(((Integer) obj).intValue());
                break;
            case 8:
                zzaknVar.zzb(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((zzamm) obj).zza(zzaknVar);
                break;
            case 10:
                zzaknVar.zzb((zzamm) obj);
                break;
            case 11:
                if (!(obj instanceof zzajv)) {
                    zzaknVar.zzb((String) obj);
                    break;
                } else {
                    zzaknVar.zzb((zzajv) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof zzajv)) {
                    byte[] bArr = (byte[]) obj;
                    zzaknVar.zzb(bArr, 0, bArr.length);
                    break;
                } else {
                    zzaknVar.zzb((zzajv) obj);
                    break;
                }
            case 13:
                zzaknVar.zzm(((Integer) obj).intValue());
                break;
            case 14:
                zzaknVar.zzj(((Integer) obj).intValue());
                break;
            case 15:
                zzaknVar.zzf(((Long) obj).longValue());
                break;
            case 16:
                zzaknVar.zzl(((Integer) obj).intValue());
                break;
            case 17:
                zzaknVar.zzg(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof zzalk)) {
                    zzaknVar.zzk(((Integer) obj).intValue());
                    break;
                } else {
                    zzaknVar.zzk(((zzalk) obj).zza());
                    break;
                }
        }
    }

    public final void zza(zzakx<T> zzakxVar) {
        int iZzb = zzakxVar.zza.zzb();
        for (int i = 0; i < iZzb; i++) {
            zzb((Map.Entry) zzakxVar.zza.zza(i));
        }
        Iterator it = zzakxVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzb((Map.Entry) it.next());
        }
    }
}
