package defpackage;

import android.util.Log;
import java.util.Map;

/* loaded from: classes2.dex */
public final class PF {
    public final SE a;
    public final ME b;
    public final IE c;
    public final YI d;
    public final InterfaceC0272Pe e;
    public final Iz f;
    public final InterfaceC0168Jc g;
    public BE h;
    public boolean i;
    public boolean j;
    public String k;

    public PF(SE se, ME me, IE ie, YI yi, InterfaceC0272Pe interfaceC0272Pe, Iz iz, InterfaceC0168Jc interfaceC0168Jc) {
        AbstractC0500aq.m(se, "sessionsSettings");
        AbstractC0500aq.m(me, "sessionGenerator");
        AbstractC0500aq.m(ie, "sessionFirelogPublisher");
        AbstractC0500aq.m(yi, "timeProvider");
        AbstractC0500aq.m(interfaceC0272Pe, "sessionDataStore");
        AbstractC0500aq.m(iz, "processDataManager");
        AbstractC0500aq.m(interfaceC0168Jc, "backgroundDispatcher");
        this.a = se;
        this.b = me;
        this.c = ie;
        this.d = yi;
        this.e = interfaceC0272Pe;
        this.f = iz;
        this.g = interfaceC0168Jc;
        JF jf = JF.a;
        this.k = "";
        AbstractC0136He.y(AbstractC0136He.a(interfaceC0168Jc), new IF(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.PF r4, java.lang.String r5, defpackage.JF r6, defpackage.InterfaceC3493uc r7) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.PF.a(PF, java.lang.String, JF, uc):java.lang.Object");
    }

    public final void b() {
        this.i = false;
        if (this.h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f.a());
        AbstractC0136He.y(AbstractC0136He.a(this.g), new LF(this, null));
    }

    public final void c() {
        this.i = true;
        BE be = this.h;
        if (be == null) {
            this.j = true;
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
        } else {
            if (be == null) {
                AbstractC0500aq.d0("localSessionData");
                throw null;
            }
            Log.d("FirebaseSessions", "App foregrounded on " + this.f.a());
            if (e(be) || d(be)) {
                AbstractC0136He.y(AbstractC0136He.a(this.g), new NF(this, be, null));
            }
        }
    }

    public final boolean d(BE be) {
        Map map = be.c;
        boolean z = true;
        Iz iz = this.f;
        if (map == null) {
            Log.d("FirebaseSessions", "No process data for " + iz.a());
            return true;
        }
        iz.getClass();
        Gz gz = (Gz) map.get(iz.a());
        if (gz != null && gz.a == iz.c) {
            if (AbstractC0500aq.b(gz.b, (String) iz.d.getValue())) {
                z = false;
            }
        }
        if (z) {
            Log.d("FirebaseSessions", "Process " + iz.a() + " is stale");
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(defpackage.BE r13) {
        /*
            r12 = this;
            XI r0 = r13.b
            java.lang.String r1 = "Session "
            java.lang.String r2 = "FirebaseSessions"
            r3 = 0
            FE r13 = r13.a
            if (r0 == 0) goto L77
            YI r4 = r12.d
            XI r4 = r4.a()
            int r5 = defpackage.C0139Hh.d
            long r4 = r4.a
            long r6 = r0.a
            long r4 = r4 - r6
            Jh r0 = defpackage.EnumC0173Jh.c
            long r4 = defpackage.AbstractC2883jK.R(r4, r0)
            SE r0 = r12.a
            fF r6 = r0.a
            Hh r6 = r6.c()
            r7 = 0
            r9 = 1
            if (r6 == 0) goto L39
            long r10 = r6.a
            int r6 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r6 <= 0) goto L39
            boolean r6 = defpackage.C0139Hh.d(r10)
            r6 = r6 ^ r9
            if (r6 == 0) goto L39
            goto L57
        L39:
            fF r0 = r0.b
            Hh r0 = r0.c()
            if (r0 == 0) goto L4f
            long r10 = r0.a
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 <= 0) goto L4f
            boolean r0 = defpackage.C0139Hh.d(r10)
            r0 = r0 ^ r9
            if (r0 == 0) goto L4f
            goto L57
        L4f:
            r0 = 30
            Jh r6 = defpackage.EnumC0173Jh.e
            long r10 = defpackage.AbstractC2883jK.Q(r0, r6)
        L57:
            int r0 = defpackage.C0139Hh.b(r4, r10)
            if (r0 <= 0) goto L5e
            r3 = r9
        L5e:
            if (r3 == 0) goto L76
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r13 = r13.a
            r0.append(r13)
            java.lang.String r13 = " is expired"
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            android.util.Log.d(r2, r13)
        L76:
            return r3
        L77:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r13 = r13.a
            r0.append(r13)
            java.lang.String r13 = " has not backgrounded yet"
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            android.util.Log.d(r2, r13)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.PF.e(BE):boolean");
    }
}
