package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import defpackage.AbstractC0500aq;
import defpackage.AbstractC3162oO;
import defpackage.AbstractC3264qG;
import defpackage.C0051Ce;
import defpackage.C0589cO;
import defpackage.C2675fc;
import defpackage.C2828iI;
import defpackage.C2834iO;
import defpackage.C3130nt;
import defpackage.C3178om;
import defpackage.C3308r6;
import defpackage.D3;
import defpackage.Ds;
import defpackage.Es;
import defpackage.TC;
import defpackage.UC;
import defpackage.Vs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {
    public static final String a = C3130nt.f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String a(C3178om c3178om, C3178om c3178om2, D3 d3, ArrayList arrayList) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2834iO c2834iO = (C2834iO) it.next();
            C2828iI c2828iIC = d3.C(c2834iO.a);
            Integer numValueOf = c2828iIC != null ? Integer.valueOf(c2828iIC.b) : null;
            String str = c2834iO.a;
            c3178om.getClass();
            UC ucC = UC.c(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str == null) {
                ucC.f(1);
            } else {
                ucC.g(1, str);
            }
            TC tc = (TC) c3178om.b;
            tc.b();
            Cursor cursorG = tc.g(ucC);
            try {
                ArrayList arrayList2 = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    arrayList2.add(cursorG.getString(0));
                }
                cursorG.close();
                ucC.release();
                ArrayList arrayListA = c3178om2.A(c2834iO.a);
                String strJoin = TextUtils.join(",", arrayList2);
                String strJoin2 = TextUtils.join(",", arrayListA);
                String str2 = c2834iO.a;
                String str3 = c2834iO.c;
                String strZ = Vs.z(c2834iO.b);
                StringBuilder sbP = AbstractC3264qG.p("\n", str2, "\t ", str3, "\t ");
                sbP.append(numValueOf);
                sbP.append("\t ");
                sbP.append(strZ);
                sbP.append("\t ");
                sb.append(AbstractC3264qG.m(sbP, strJoin, "\t ", strJoin2, "\t"));
            } catch (Throwable th) {
                cursorG.close();
                ucC.release();
                throw th;
            }
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public final Es doWork() throws Throwable {
        UC uc;
        int iD;
        int iD2;
        int iD3;
        int iD4;
        int iD5;
        int iD6;
        int iD7;
        int iD8;
        int iD9;
        int iD10;
        int iD11;
        int iD12;
        int iD13;
        int iD14;
        ArrayList arrayList;
        D3 d3;
        C3178om c3178om;
        C3178om c3178om2;
        int i;
        WorkDatabase workDatabase = C0589cO.S(getApplicationContext()).y;
        C3308r6 c3308r6N = workDatabase.n();
        C3178om c3178omL = workDatabase.l();
        C3178om c3178omO = workDatabase.o();
        D3 d3K = workDatabase.k();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        c3308r6N.getClass();
        UC ucC = UC.c(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        ucC.e(1, jCurrentTimeMillis);
        TC tc = (TC) c3308r6N.a;
        tc.b();
        Cursor cursorG = tc.g(ucC);
        try {
            iD = AbstractC0500aq.D(cursorG, "required_network_type");
            iD2 = AbstractC0500aq.D(cursorG, "requires_charging");
            iD3 = AbstractC0500aq.D(cursorG, "requires_device_idle");
            iD4 = AbstractC0500aq.D(cursorG, "requires_battery_not_low");
            iD5 = AbstractC0500aq.D(cursorG, "requires_storage_not_low");
            iD6 = AbstractC0500aq.D(cursorG, "trigger_content_update_delay");
            iD7 = AbstractC0500aq.D(cursorG, "trigger_max_content_delay");
            iD8 = AbstractC0500aq.D(cursorG, "content_uri_triggers");
            iD9 = AbstractC0500aq.D(cursorG, FacebookMediationAdapter.KEY_ID);
            iD10 = AbstractC0500aq.D(cursorG, "state");
            iD11 = AbstractC0500aq.D(cursorG, "worker_class_name");
            iD12 = AbstractC0500aq.D(cursorG, "input_merger_class_name");
            iD13 = AbstractC0500aq.D(cursorG, "input");
            iD14 = AbstractC0500aq.D(cursorG, "output");
            uc = ucC;
        } catch (Throwable th) {
            th = th;
            uc = ucC;
        }
        try {
            int iD15 = AbstractC0500aq.D(cursorG, "initial_delay");
            int iD16 = AbstractC0500aq.D(cursorG, "interval_duration");
            int iD17 = AbstractC0500aq.D(cursorG, "flex_duration");
            int iD18 = AbstractC0500aq.D(cursorG, "run_attempt_count");
            int iD19 = AbstractC0500aq.D(cursorG, "backoff_policy");
            int iD20 = AbstractC0500aq.D(cursorG, "backoff_delay_duration");
            int iD21 = AbstractC0500aq.D(cursorG, "period_start_time");
            int iD22 = AbstractC0500aq.D(cursorG, "minimum_retention_duration");
            int iD23 = AbstractC0500aq.D(cursorG, "schedule_requested_at");
            int iD24 = AbstractC0500aq.D(cursorG, "run_in_foreground");
            int iD25 = AbstractC0500aq.D(cursorG, "out_of_quota_policy");
            int i2 = iD14;
            ArrayList arrayList2 = new ArrayList(cursorG.getCount());
            while (true) {
                arrayList = arrayList2;
                if (!cursorG.moveToNext()) {
                    break;
                }
                String string = cursorG.getString(iD9);
                String string2 = cursorG.getString(iD11);
                int i3 = iD11;
                C2675fc c2675fc = new C2675fc();
                int i4 = iD;
                c2675fc.a = AbstractC3162oO.c(cursorG.getInt(iD));
                c2675fc.b = cursorG.getInt(iD2) != 0;
                c2675fc.c = cursorG.getInt(iD3) != 0;
                c2675fc.d = cursorG.getInt(iD4) != 0;
                c2675fc.e = cursorG.getInt(iD5) != 0;
                int i5 = iD2;
                int i6 = iD3;
                c2675fc.f = cursorG.getLong(iD6);
                c2675fc.g = cursorG.getLong(iD7);
                c2675fc.h = AbstractC3162oO.a(cursorG.getBlob(iD8));
                C2834iO c2834iO = new C2834iO(string, string2);
                c2834iO.b = AbstractC3162oO.e(cursorG.getInt(iD10));
                c2834iO.d = cursorG.getString(iD12);
                c2834iO.e = C0051Ce.a(cursorG.getBlob(iD13));
                int i7 = i2;
                c2834iO.f = C0051Ce.a(cursorG.getBlob(i7));
                i2 = i7;
                int i8 = iD12;
                int i9 = iD15;
                c2834iO.g = cursorG.getLong(i9);
                int i10 = iD13;
                int i11 = iD16;
                c2834iO.h = cursorG.getLong(i11);
                int i12 = iD17;
                c2834iO.i = cursorG.getLong(i12);
                int i13 = iD18;
                c2834iO.k = cursorG.getInt(i13);
                int i14 = iD19;
                c2834iO.l = AbstractC3162oO.b(cursorG.getInt(i14));
                iD17 = i12;
                int i15 = iD20;
                c2834iO.m = cursorG.getLong(i15);
                int i16 = iD21;
                c2834iO.n = cursorG.getLong(i16);
                iD21 = i16;
                int i17 = iD22;
                c2834iO.o = cursorG.getLong(i17);
                int i18 = iD23;
                c2834iO.p = cursorG.getLong(i18);
                int i19 = iD24;
                c2834iO.q = cursorG.getInt(i19) != 0;
                int i20 = iD25;
                c2834iO.r = AbstractC3162oO.d(cursorG.getInt(i20));
                c2834iO.j = c2675fc;
                arrayList.add(c2834iO);
                iD25 = i20;
                iD13 = i10;
                iD15 = i9;
                iD16 = i11;
                iD2 = i5;
                iD19 = i14;
                iD18 = i13;
                iD23 = i18;
                iD24 = i19;
                iD22 = i17;
                iD20 = i15;
                iD12 = i8;
                iD3 = i6;
                iD = i4;
                arrayList2 = arrayList;
                iD11 = i3;
            }
            cursorG.close();
            uc.release();
            ArrayList arrayListD = c3308r6N.d();
            ArrayList arrayListA = c3308r6N.a();
            boolean zIsEmpty = arrayList.isEmpty();
            String str = a;
            if (zIsEmpty) {
                d3 = d3K;
                c3178om = c3178omL;
                c3178om2 = c3178omO;
                i = 0;
            } else {
                i = 0;
                C3130nt.d().e(str, "Recently completed work:\n\n", new Throwable[0]);
                d3 = d3K;
                c3178om = c3178omL;
                c3178om2 = c3178omO;
                C3130nt.d().e(str, a(c3178om, c3178om2, d3, arrayList), new Throwable[0]);
            }
            if (!arrayListD.isEmpty()) {
                C3130nt.d().e(str, "Running work:\n\n", new Throwable[i]);
                C3130nt.d().e(str, a(c3178om, c3178om2, d3, arrayListD), new Throwable[i]);
            }
            if (!arrayListA.isEmpty()) {
                C3130nt.d().e(str, "Enqueued work:\n\n", new Throwable[i]);
                C3130nt.d().e(str, a(c3178om, c3178om2, d3, arrayListA), new Throwable[i]);
            }
            return new Ds(C0051Ce.c);
        } catch (Throwable th2) {
            th = th2;
            cursorG.close();
            uc.release();
            throw th;
        }
    }
}
