package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;

/* renamed from: l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2974l1 {
    public static final String a = C3130nt.f("Alarms");

    public static void a(Context context, int i, String str) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C0064Da.a(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        C3130nt.d().a(a, "Cancelling existing alarm with (workSpecId, systemId) (" + str + ", " + i + ")", new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void b(Context context, C0589cO c0589cO, String str, long j) {
        int iIntValue;
        WorkDatabase workDatabase = c0589cO.y;
        D3 d3K = workDatabase.k();
        C2828iI c2828iIC = d3K.C(str);
        if (c2828iIC != null) {
            a(context, c2828iIC.b, str);
            int i = c2828iIC.b;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service = PendingIntent.getService(context, i, C0064Da.a(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j, service);
                return;
            }
            return;
        }
        synchronized (C2524cp.class) {
            workDatabase.c();
            try {
                Long lY = workDatabase.j().y("next_alarm_manager_id");
                iIntValue = lY != null ? lY.intValue() : 0;
                workDatabase.j().C(new C2808hz("next_alarm_manager_id", iIntValue == Integer.MAX_VALUE ? 0 : iIntValue + 1));
                workDatabase.h();
                workDatabase.f();
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
        d3K.I(new C2828iI(str, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, C0064Da.a(context, str), 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j, service2);
        }
    }
}
