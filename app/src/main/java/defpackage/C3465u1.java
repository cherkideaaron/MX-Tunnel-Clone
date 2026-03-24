package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: u1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3465u1 implements InterfaceC3411t1 {
    public static volatile C3465u1 c;
    public final AppMeasurementSdk a;
    public final ConcurrentHashMap b;

    public C3465u1(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.a = appMeasurementSdk;
        this.b = new ConcurrentHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r7, java.lang.String r8, android.os.Bundle r9) {
        /*
            r6 = this;
            SB r0 = defpackage.ZP.c
            boolean r0 = r0.contains(r7)
            r1 = 1
            r0 = r0 ^ r1
            if (r0 != 0) goto Lc
            goto L93
        Lc:
            SB r0 = defpackage.ZP.b
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L16
            goto L93
        L16:
            SB r0 = defpackage.ZP.d
            int r2 = r0.d
            r3 = 0
            r4 = r3
        L1c:
            if (r4 >= r2) goto L2e
            java.lang.Object r5 = r0.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r9.containsKey(r5)
            int r4 = r4 + 1
            if (r5 == 0) goto L1c
            goto L93
        L2e:
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L38
            goto La0
        L38:
            SB r0 = defpackage.ZP.c
            boolean r0 = r0.contains(r7)
            r0 = r0 ^ r1
            if (r0 != 0) goto L42
            goto L93
        L42:
            SB r0 = defpackage.ZP.d
            int r2 = r0.d
            r4 = r3
        L47:
            if (r4 >= r2) goto L58
            java.lang.Object r5 = r0.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r9.containsKey(r5)
            int r4 = r4 + 1
            if (r5 == 0) goto L47
            goto L93
        L58:
            int r0 = r7.hashCode()
            r2 = 101200(0x18b50, float:1.41811E-40)
            r4 = 2
            if (r0 == r2) goto L81
            r2 = 101230(0x18b6e, float:1.41853E-40)
            if (r0 == r2) goto L77
            r2 = 3142703(0x2ff42f, float:4.403865E-39)
            if (r0 == r2) goto L6d
            goto L8a
        L6d:
            java.lang.String r0 = "fiam"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L8a
            r3 = r4
            goto L8b
        L77:
            java.lang.String r0 = "fdl"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L8a
            r3 = r1
            goto L8b
        L81:
            java.lang.String r0 = "fcm"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L8a
            goto L8b
        L8a:
            r3 = -1
        L8b:
            java.lang.String r0 = "_cis"
            if (r3 == 0) goto L9d
            if (r3 == r1) goto L9a
            if (r3 == r4) goto L94
        L93:
            return
        L94:
            java.lang.String r1 = "fiam_integration"
        L96:
            r9.putString(r0, r1)
            goto La0
        L9a:
            java.lang.String r1 = "fdl_integration"
            goto L96
        L9d:
            java.lang.String r1 = "fcm_integration"
            goto L96
        La0:
            java.lang.String r0 = "clx"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto Lb7
            java.lang.String r0 = "_ae"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto Lb7
            java.lang.String r0 = "_r"
            r1 = 1
            r9.putLong(r0, r1)
        Lb7:
            com.google.android.gms.measurement.api.AppMeasurementSdk r0 = r6.a
            r0.logEvent(r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3465u1.a(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    public final C0108Fk b(String str, R2 r2) {
        Preconditions.checkNotNull(r2);
        if (!ZP.c.contains(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.b;
            if (zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean zEquals = AppMeasurement.FIAM_ORIGIN.equals(str);
                AppMeasurementSdk appMeasurementSdk = this.a;
                Object c3328rQ = zEquals ? new C3328rQ(appMeasurementSdk, r2) : "clx".equals(str) ? new C3706yQ(appMeasurementSdk, r2) : null;
                if (c3328rQ != null) {
                    concurrentHashMap.put(str, c3328rQ);
                    return new C0108Fk(8);
                }
            }
        }
        return null;
    }
}
