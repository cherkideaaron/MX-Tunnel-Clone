package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: r6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3308r6 implements InterfaceC0209Lj {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object m;
    public Object n;
    public Object o;

    public C3308r6(TC tc) {
        this.a = tc;
        this.b = new C0087Eg(tc, 5);
        this.c = new C2881jI(tc, 3);
        this.d = new C2881jI(tc, 4);
        this.e = new C2881jI(tc, 5);
        this.f = new C2881jI(tc, 6);
        this.m = new C2881jI(tc, 7);
        this.n = new C2881jI(tc, 8);
        this.o = new C2881jI(tc, 9);
        new AtomicBoolean(false);
    }

    public static void l(String str, JSONObject jSONObject) {
        StringBuilder sbN = AbstractC3264qG.n(str);
        sbN.append(jSONObject.toString());
        String string = sbN.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
    }

    public ArrayList a() throws Throwable {
        UC uc;
        UC ucC = UC.c(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        ucC.e(1, 200);
        TC tc = (TC) this.a;
        tc.b();
        Cursor cursorG = tc.g(ucC);
        try {
            int iD = AbstractC0500aq.D(cursorG, "required_network_type");
            int iD2 = AbstractC0500aq.D(cursorG, "requires_charging");
            int iD3 = AbstractC0500aq.D(cursorG, "requires_device_idle");
            int iD4 = AbstractC0500aq.D(cursorG, "requires_battery_not_low");
            int iD5 = AbstractC0500aq.D(cursorG, "requires_storage_not_low");
            int iD6 = AbstractC0500aq.D(cursorG, "trigger_content_update_delay");
            int iD7 = AbstractC0500aq.D(cursorG, "trigger_max_content_delay");
            int iD8 = AbstractC0500aq.D(cursorG, "content_uri_triggers");
            int iD9 = AbstractC0500aq.D(cursorG, FacebookMediationAdapter.KEY_ID);
            int iD10 = AbstractC0500aq.D(cursorG, "state");
            int iD11 = AbstractC0500aq.D(cursorG, "worker_class_name");
            int iD12 = AbstractC0500aq.D(cursorG, "input_merger_class_name");
            int iD13 = AbstractC0500aq.D(cursorG, "input");
            int iD14 = AbstractC0500aq.D(cursorG, "output");
            uc = ucC;
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
                int i = iD14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iD9);
                    int i2 = iD9;
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
                    int i7 = i;
                    c2834iO.f = C0051Ce.a(cursorG.getBlob(i7));
                    int i8 = iD13;
                    int i9 = iD15;
                    c2834iO.g = cursorG.getLong(i9);
                    int i10 = iD4;
                    int i11 = iD16;
                    c2834iO.h = cursorG.getLong(i11);
                    int i12 = iD17;
                    c2834iO.i = cursorG.getLong(i12);
                    int i13 = iD18;
                    c2834iO.k = cursorG.getInt(i13);
                    int i14 = iD19;
                    c2834iO.l = AbstractC3162oO.b(cursorG.getInt(i14));
                    int i15 = iD20;
                    c2834iO.m = cursorG.getLong(i15);
                    int i16 = iD21;
                    c2834iO.n = cursorG.getLong(i16);
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
                    i = i7;
                    iD2 = i5;
                    iD15 = i9;
                    iD16 = i11;
                    iD20 = i15;
                    iD21 = i16;
                    iD24 = i19;
                    iD11 = i3;
                    iD = i4;
                    iD25 = i20;
                    iD23 = i18;
                    iD13 = i8;
                    iD9 = i2;
                    iD3 = i6;
                    iD22 = i17;
                    iD4 = i10;
                    iD17 = i12;
                    iD18 = i13;
                    iD19 = i14;
                }
                cursorG.close();
                uc.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorG.close();
                uc.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            uc = ucC;
        }
    }

    public XE b(int i) {
        XE xe = null;
        try {
            if (!AbstractC3264qG.a(2, i)) {
                JSONObject jSONObjectB = ((C2827iH) this.e).B();
                if (jSONObjectB != null) {
                    XE xeZ = ((C2827iH) this.c).z(jSONObjectB);
                    l("Loaded cached settings: ", jSONObjectB);
                    ((C0360Uh) this.d).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (AbstractC3264qG.a(3, i) || xeZ.c >= jCurrentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            xe = xeZ;
                        } catch (Exception e) {
                            e = e;
                            xe = xeZ;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return xe;
                        }
                    } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        return xe;
    }

    public ArrayList c(int i) throws Throwable {
        UC uc;
        UC ucC = UC.c(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        ucC.e(1, i);
        TC tc = (TC) this.a;
        tc.b();
        Cursor cursorG = tc.g(ucC);
        try {
            int iD = AbstractC0500aq.D(cursorG, "required_network_type");
            int iD2 = AbstractC0500aq.D(cursorG, "requires_charging");
            int iD3 = AbstractC0500aq.D(cursorG, "requires_device_idle");
            int iD4 = AbstractC0500aq.D(cursorG, "requires_battery_not_low");
            int iD5 = AbstractC0500aq.D(cursorG, "requires_storage_not_low");
            int iD6 = AbstractC0500aq.D(cursorG, "trigger_content_update_delay");
            int iD7 = AbstractC0500aq.D(cursorG, "trigger_max_content_delay");
            int iD8 = AbstractC0500aq.D(cursorG, "content_uri_triggers");
            int iD9 = AbstractC0500aq.D(cursorG, FacebookMediationAdapter.KEY_ID);
            int iD10 = AbstractC0500aq.D(cursorG, "state");
            int iD11 = AbstractC0500aq.D(cursorG, "worker_class_name");
            int iD12 = AbstractC0500aq.D(cursorG, "input_merger_class_name");
            int iD13 = AbstractC0500aq.D(cursorG, "input");
            int iD14 = AbstractC0500aq.D(cursorG, "output");
            uc = ucC;
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
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iD9);
                    int i3 = iD9;
                    String string2 = cursorG.getString(iD11);
                    int i4 = iD11;
                    C2675fc c2675fc = new C2675fc();
                    int i5 = iD;
                    c2675fc.a = AbstractC3162oO.c(cursorG.getInt(iD));
                    c2675fc.b = cursorG.getInt(iD2) != 0;
                    c2675fc.c = cursorG.getInt(iD3) != 0;
                    c2675fc.d = cursorG.getInt(iD4) != 0;
                    c2675fc.e = cursorG.getInt(iD5) != 0;
                    int i6 = iD2;
                    int i7 = iD3;
                    c2675fc.f = cursorG.getLong(iD6);
                    c2675fc.g = cursorG.getLong(iD7);
                    c2675fc.h = AbstractC3162oO.a(cursorG.getBlob(iD8));
                    C2834iO c2834iO = new C2834iO(string, string2);
                    c2834iO.b = AbstractC3162oO.e(cursorG.getInt(iD10));
                    c2834iO.d = cursorG.getString(iD12);
                    c2834iO.e = C0051Ce.a(cursorG.getBlob(iD13));
                    int i8 = i2;
                    c2834iO.f = C0051Ce.a(cursorG.getBlob(i8));
                    int i9 = iD15;
                    int i10 = iD13;
                    c2834iO.g = cursorG.getLong(i9);
                    int i11 = iD4;
                    int i12 = iD16;
                    c2834iO.h = cursorG.getLong(i12);
                    int i13 = iD17;
                    c2834iO.i = cursorG.getLong(i13);
                    int i14 = iD18;
                    c2834iO.k = cursorG.getInt(i14);
                    int i15 = iD19;
                    c2834iO.l = AbstractC3162oO.b(cursorG.getInt(i15));
                    int i16 = iD20;
                    c2834iO.m = cursorG.getLong(i16);
                    int i17 = iD21;
                    c2834iO.n = cursorG.getLong(i17);
                    int i18 = iD22;
                    c2834iO.o = cursorG.getLong(i18);
                    int i19 = iD23;
                    c2834iO.p = cursorG.getLong(i19);
                    int i20 = iD24;
                    c2834iO.q = cursorG.getInt(i20) != 0;
                    int i21 = iD25;
                    c2834iO.r = AbstractC3162oO.d(cursorG.getInt(i21));
                    c2834iO.j = c2675fc;
                    arrayList.add(c2834iO);
                    i2 = i8;
                    iD2 = i6;
                    iD24 = i20;
                    iD9 = i3;
                    iD11 = i4;
                    iD = i5;
                    iD25 = i21;
                    iD13 = i10;
                    iD15 = i9;
                    iD16 = i12;
                    iD20 = i16;
                    iD21 = i17;
                    iD23 = i19;
                    iD3 = i7;
                    iD22 = i18;
                    iD4 = i11;
                    iD17 = i13;
                    iD18 = i14;
                    iD19 = i15;
                }
                cursorG.close();
                uc.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorG.close();
                uc.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            uc = ucC;
        }
    }

    public ArrayList d() throws Throwable {
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
        UC ucC = UC.c(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        TC tc = (TC) this.a;
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
            int i = iD14;
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                String string = cursorG.getString(iD9);
                int i2 = iD9;
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
                int i7 = i;
                c2834iO.f = C0051Ce.a(cursorG.getBlob(i7));
                int i8 = iD13;
                int i9 = iD15;
                c2834iO.g = cursorG.getLong(i9);
                int i10 = iD4;
                int i11 = iD16;
                c2834iO.h = cursorG.getLong(i11);
                int i12 = iD17;
                c2834iO.i = cursorG.getLong(i12);
                int i13 = iD18;
                c2834iO.k = cursorG.getInt(i13);
                int i14 = iD19;
                c2834iO.l = AbstractC3162oO.b(cursorG.getInt(i14));
                int i15 = iD20;
                c2834iO.m = cursorG.getLong(i15);
                int i16 = iD21;
                c2834iO.n = cursorG.getLong(i16);
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
                i = i7;
                iD2 = i5;
                iD15 = i9;
                iD16 = i11;
                iD20 = i15;
                iD21 = i16;
                iD24 = i19;
                iD11 = i3;
                iD = i4;
                iD25 = i20;
                iD23 = i18;
                iD13 = i8;
                iD9 = i2;
                iD3 = i6;
                iD22 = i17;
                iD4 = i10;
                iD17 = i12;
                iD18 = i13;
                iD19 = i14;
            }
            cursorG.close();
            uc.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorG.close();
            uc.release();
            throw th;
        }
    }

    public ArrayList e() {
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
        UC ucC = UC.c(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        TC tc = (TC) this.a;
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
            int i = iD14;
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                String string = cursorG.getString(iD9);
                int i2 = iD9;
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
                int i7 = i;
                c2834iO.f = C0051Ce.a(cursorG.getBlob(i7));
                int i8 = iD13;
                int i9 = iD15;
                c2834iO.g = cursorG.getLong(i9);
                int i10 = iD4;
                int i11 = iD16;
                c2834iO.h = cursorG.getLong(i11);
                int i12 = iD17;
                c2834iO.i = cursorG.getLong(i12);
                int i13 = iD18;
                c2834iO.k = cursorG.getInt(i13);
                int i14 = iD19;
                c2834iO.l = AbstractC3162oO.b(cursorG.getInt(i14));
                int i15 = iD20;
                c2834iO.m = cursorG.getLong(i15);
                int i16 = iD21;
                c2834iO.n = cursorG.getLong(i16);
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
                i = i7;
                iD2 = i5;
                iD15 = i9;
                iD16 = i11;
                iD20 = i15;
                iD21 = i16;
                iD24 = i19;
                iD11 = i3;
                iD = i4;
                iD25 = i20;
                iD23 = i18;
                iD13 = i8;
                iD9 = i2;
                iD3 = i6;
                iD22 = i17;
                iD4 = i10;
                iD17 = i12;
                iD18 = i13;
                iD19 = i14;
            }
            cursorG.close();
            uc.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorG.close();
            uc.release();
            throw th;
        }
    }

    public XE f() {
        return (XE) ((AtomicReference) this.n).get();
    }

    public int g(String str) {
        UC ucC = UC.c(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            ucC.f(1);
        } else {
            ucC.g(1, str);
        }
        TC tc = (TC) this.a;
        tc.b();
        Cursor cursorG = tc.g(ucC);
        try {
            return cursorG.moveToFirst() ? AbstractC3162oO.e(cursorG.getInt(0)) : 0;
        } finally {
            cursorG.close();
            ucC.release();
        }
    }

    @Override // defpackage.InterfaceC3203pA
    public Object get() {
        return new UK((Context) ((InterfaceC3203pA) this.a).get(), (C2912jv) ((InterfaceC3203pA) this.b).get(), (InterfaceC2682fj) ((InterfaceC3203pA) this.c).get(), (C0080Dq) ((InterfaceC3203pA) this.d).get(), (Executor) ((InterfaceC3203pA) this.e).get(), (InterfaceC0529bI) ((InterfaceC3203pA) this.f).get(), (VK) ((InterfaceC3203pA) this.m).get(), (VK) ((InterfaceC3203pA) this.n).get(), (InterfaceC0484aa) ((InterfaceC3203pA) this.o).get());
    }

    public ArrayList h(String str) {
        UC ucC = UC.c(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            ucC.f(1);
        } else {
            ucC.g(1, str);
        }
        TC tc = (TC) this.a;
        tc.b();
        Cursor cursorG = tc.g(ucC);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            ucC.release();
        }
    }

    public ArrayList i(String str) {
        UC ucC = UC.c(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        if (str == null) {
            ucC.f(1);
        } else {
            ucC.g(1, str);
        }
        TC tc = (TC) this.a;
        tc.b();
        Cursor cursorG = tc.g(ucC);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            ucC.release();
        }
    }

    public C2834iO j(String str) {
        UC uc;
        C2834iO c2834iO;
        UC ucC = UC.c(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            ucC.f(1);
        } else {
            ucC.g(1, str);
        }
        TC tc = (TC) this.a;
        tc.b();
        Cursor cursorG = tc.g(ucC);
        try {
            int iD = AbstractC0500aq.D(cursorG, "required_network_type");
            int iD2 = AbstractC0500aq.D(cursorG, "requires_charging");
            int iD3 = AbstractC0500aq.D(cursorG, "requires_device_idle");
            int iD4 = AbstractC0500aq.D(cursorG, "requires_battery_not_low");
            int iD5 = AbstractC0500aq.D(cursorG, "requires_storage_not_low");
            int iD6 = AbstractC0500aq.D(cursorG, "trigger_content_update_delay");
            int iD7 = AbstractC0500aq.D(cursorG, "trigger_max_content_delay");
            int iD8 = AbstractC0500aq.D(cursorG, "content_uri_triggers");
            int iD9 = AbstractC0500aq.D(cursorG, FacebookMediationAdapter.KEY_ID);
            int iD10 = AbstractC0500aq.D(cursorG, "state");
            int iD11 = AbstractC0500aq.D(cursorG, "worker_class_name");
            int iD12 = AbstractC0500aq.D(cursorG, "input_merger_class_name");
            int iD13 = AbstractC0500aq.D(cursorG, "input");
            int iD14 = AbstractC0500aq.D(cursorG, "output");
            uc = ucC;
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
                if (cursorG.moveToFirst()) {
                    String string = cursorG.getString(iD9);
                    String string2 = cursorG.getString(iD11);
                    C2675fc c2675fc = new C2675fc();
                    c2675fc.a = AbstractC3162oO.c(cursorG.getInt(iD));
                    c2675fc.b = cursorG.getInt(iD2) != 0;
                    c2675fc.c = cursorG.getInt(iD3) != 0;
                    c2675fc.d = cursorG.getInt(iD4) != 0;
                    c2675fc.e = cursorG.getInt(iD5) != 0;
                    c2675fc.f = cursorG.getLong(iD6);
                    c2675fc.g = cursorG.getLong(iD7);
                    c2675fc.h = AbstractC3162oO.a(cursorG.getBlob(iD8));
                    c2834iO = new C2834iO(string, string2);
                    c2834iO.b = AbstractC3162oO.e(cursorG.getInt(iD10));
                    c2834iO.d = cursorG.getString(iD12);
                    c2834iO.e = C0051Ce.a(cursorG.getBlob(iD13));
                    c2834iO.f = C0051Ce.a(cursorG.getBlob(iD14));
                    c2834iO.g = cursorG.getLong(iD15);
                    c2834iO.h = cursorG.getLong(iD16);
                    c2834iO.i = cursorG.getLong(iD17);
                    c2834iO.k = cursorG.getInt(iD18);
                    c2834iO.l = AbstractC3162oO.b(cursorG.getInt(iD19));
                    c2834iO.m = cursorG.getLong(iD20);
                    c2834iO.n = cursorG.getLong(iD21);
                    c2834iO.o = cursorG.getLong(iD22);
                    c2834iO.p = cursorG.getLong(iD23);
                    c2834iO.q = cursorG.getInt(iD24) != 0;
                    c2834iO.r = AbstractC3162oO.d(cursorG.getInt(iD25));
                    c2834iO.j = c2675fc;
                } else {
                    c2834iO = null;
                }
                cursorG.close();
                uc.release();
                return c2834iO;
            } catch (Throwable th) {
                th = th;
                cursorG.close();
                uc.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            uc = ucC;
        }
    }

    public void k(String str) {
        TC tc = (TC) this.a;
        tc.b();
        C2881jI c2881jI = (C2881jI) this.f;
        C0497an c0497anA = c2881jI.a();
        if (str == null) {
            c0497anA.f(1);
        } else {
            c0497anA.g(1, str);
        }
        tc.c();
        try {
            c0497anA.d.executeUpdateDelete();
            tc.h();
        } finally {
            tc.f();
            c2881jI.c(c0497anA);
        }
    }

    public void m(long j, String str) {
        TC tc = (TC) this.a;
        tc.b();
        C2881jI c2881jI = (C2881jI) this.n;
        C0497an c0497anA = c2881jI.a();
        c0497anA.e(1, j);
        if (str == null) {
            c0497anA.f(2);
        } else {
            c0497anA.g(2, str);
        }
        tc.c();
        try {
            c0497anA.d.executeUpdateDelete();
            tc.h();
        } finally {
            tc.f();
            c2881jI.c(c0497anA);
        }
    }

    public void n(String str) {
        TC tc = (TC) this.a;
        tc.b();
        C2881jI c2881jI = (C2881jI) this.m;
        C0497an c0497anA = c2881jI.a();
        if (str == null) {
            c0497anA.f(1);
        } else {
            c0497anA.g(1, str);
        }
        tc.c();
        try {
            c0497anA.d.executeUpdateDelete();
            tc.h();
        } finally {
            tc.f();
            c2881jI.c(c0497anA);
        }
    }

    public void o(String str, C0051Ce c0051Ce) throws Throwable {
        TC tc = (TC) this.a;
        tc.b();
        C2881jI c2881jI = (C2881jI) this.d;
        C0497an c0497anA = c2881jI.a();
        byte[] bArrC = C0051Ce.c(c0051Ce);
        if (bArrC == null) {
            c0497anA.f(1);
        } else {
            c0497anA.b(1, bArrC);
        }
        if (str == null) {
            c0497anA.f(2);
        } else {
            c0497anA.g(2, str);
        }
        tc.c();
        try {
            c0497anA.m();
            tc.h();
        } finally {
            tc.f();
            c2881jI.c(c0497anA);
        }
    }

    public void p(long j, String str) {
        TC tc = (TC) this.a;
        tc.b();
        C2881jI c2881jI = (C2881jI) this.e;
        C0497an c0497anA = c2881jI.a();
        c0497anA.e(1, j);
        if (str == null) {
            c0497anA.f(2);
        } else {
            c0497anA.g(2, str);
        }
        tc.c();
        try {
            c0497anA.m();
            tc.h();
        } finally {
            tc.f();
            c2881jI.c(c0497anA);
        }
    }

    public void q(String[] strArr, int i) throws SQLException {
        TC tc = (TC) this.a;
        tc.b();
        StringBuilder sb = new StringBuilder("UPDATE workspec SET state=? WHERE id IN (");
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append("?");
            if (i2 < length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        String string = sb.toString();
        tc.a();
        tc.b();
        SQLiteStatement sQLiteStatementCompileStatement = ((SQLiteDatabase) tc.c.d().b).compileStatement(string);
        sQLiteStatementCompileStatement.bindLong(1, AbstractC3162oO.g(i));
        int i3 = 2;
        for (String str : strArr) {
            if (str == null) {
                sQLiteStatementCompileStatement.bindNull(i3);
            } else {
                sQLiteStatementCompileStatement.bindString(i3, str);
            }
            i3++;
        }
        tc.c();
        try {
            sQLiteStatementCompileStatement.executeUpdateDelete();
            tc.h();
        } finally {
            tc.f();
        }
    }
}
