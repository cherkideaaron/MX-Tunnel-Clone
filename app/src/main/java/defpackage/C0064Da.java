package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: Da, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0064Da implements InterfaceC2900jj {
    public static final String d = C3130nt.f("CommandHandler");
    public final Context a;
    public final HashMap b = new HashMap();
    public final Object c = new Object();

    public C0064Da(Context context) {
        this.a = context;
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // defpackage.InterfaceC2900jj
    public final void b(String str, boolean z) {
        synchronized (this.c) {
            try {
                InterfaceC2900jj interfaceC2900jj = (InterfaceC2900jj) this.b.remove(str);
                if (interfaceC2900jj != null) {
                    interfaceC2900jj.b(str, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        boolean z;
        synchronized (this.c) {
            z = !this.b.isEmpty();
        }
        return z;
    }

    public final void e(Intent intent, int i, C2663fI c2663fI) {
        int i2 = 5;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            C3130nt.d().a(d, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            C2785hc c2785hc = new C2785hc(this.a, i, c2663fI);
            ArrayList arrayListE = c2663fI.e.y.n().e();
            String str = AbstractC0337Tb.a;
            Iterator it = arrayListE.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            while (it.hasNext()) {
                C2675fc c2675fc = ((C2834iO) it.next()).j;
                z |= c2675fc.d;
                z2 |= c2675fc.b;
                z3 |= c2675fc.e;
                z4 |= c2675fc.a != 1;
                if (z && z2 && z3 && z4) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = c2785hc.a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
            context.sendBroadcast(intent2);
            QN qn = c2785hc.c;
            qn.c(arrayListE);
            ArrayList arrayList = new ArrayList(arrayListE.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it2 = arrayListE.iterator();
            while (it2.hasNext()) {
                C2834iO c2834iO = (C2834iO) it2.next();
                String str3 = c2834iO.a;
                if (jCurrentTimeMillis >= c2834iO.a() && (!c2834iO.b() || qn.a(str3))) {
                    arrayList.add(c2834iO);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String str4 = ((C2834iO) it3.next()).a;
                Intent intentA = a(context, str4);
                C3130nt.d().a(C2785hc.d, AbstractC3264qG.x("Creating a delay_met command for workSpec with id (", str4, ")"), new Throwable[0]);
                c2663fI.f(new RunnableC2921k3(c2663fI, intentA, c2785hc.b, i2));
            }
            qn.d();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            C3130nt.d().a(d, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
            c2663fI.e.V();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            C3130nt.d().b(d, AbstractC3264qG.x("Invalid request for ", action, ", requires KEY_WORKSPEC_ID."), new Throwable[0]);
            return;
        }
        if (!"ACTION_SCHEDULE_WORK".equals(action)) {
            if ("ACTION_DELAY_MET".equals(action)) {
                Bundle extras2 = intent.getExtras();
                synchronized (this.c) {
                    try {
                        String string = extras2.getString("KEY_WORKSPEC_ID");
                        C3130nt c3130ntD = C3130nt.d();
                        String str5 = d;
                        c3130ntD.a(str5, "Handing delay met for " + string, new Throwable[0]);
                        if (this.b.containsKey(string)) {
                            C3130nt.d().a(str5, "WorkSpec " + string + " is already being handled for ACTION_DELAY_MET", new Throwable[0]);
                        } else {
                            C3282qg c3282qg = new C3282qg(this.a, i, string, c2663fI);
                            this.b.put(string, c3282qg);
                            c3282qg.c();
                        }
                    } finally {
                    }
                }
                return;
            }
            if (!"ACTION_STOP_WORK".equals(action)) {
                if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                    C3130nt.d().g(d, String.format("Ignoring intent %s", intent), new Throwable[0]);
                    return;
                }
                Bundle extras3 = intent.getExtras();
                String string2 = extras3.getString("KEY_WORKSPEC_ID");
                boolean z5 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
                C3130nt.d().a(d, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
                b(string2, z5);
                return;
            }
            String string3 = intent.getExtras().getString("KEY_WORKSPEC_ID");
            C3130nt.d().a(d, AbstractC3264qG.w("Handing stopWork work for ", string3), new Throwable[0]);
            c2663fI.e.X(string3);
            String str6 = AbstractC2974l1.a;
            D3 d3K = c2663fI.e.y.k();
            C2828iI c2828iIC = d3K.C(string3);
            if (c2828iIC != null) {
                AbstractC2974l1.a(this.a, c2828iIC.b, string3);
                C3130nt.d().a(AbstractC2974l1.a, AbstractC3264qG.x("Removing SystemIdInfo for workSpecId (", string3, ")"), new Throwable[0]);
                d3K.Q(string3);
            }
            c2663fI.b(string3, false);
            return;
        }
        String string4 = intent.getExtras().getString("KEY_WORKSPEC_ID");
        String str7 = d;
        C3130nt.d().a(str7, AbstractC3264qG.w("Handling schedule work for ", string4), new Throwable[0]);
        WorkDatabase workDatabase = c2663fI.e.y;
        workDatabase.c();
        try {
            C2834iO c2834iOJ = workDatabase.n().j(string4);
            if (c2834iOJ == null) {
                C3130nt.d().g(str7, "Skipping scheduling " + string4 + " because it's no longer in the DB", new Throwable[0]);
            } else if (Vs.d(c2834iOJ.b)) {
                C3130nt.d().g(str7, "Skipping scheduling " + string4 + "because it is finished.", new Throwable[0]);
            } else {
                long jA = c2834iOJ.a();
                boolean zB = c2834iOJ.b();
                Context context2 = this.a;
                C0589cO c0589cO = c2663fI.e;
                if (zB) {
                    C3130nt.d().a(str7, "Opportunistically setting an alarm for " + string4 + " at " + jA, new Throwable[0]);
                    AbstractC2974l1.b(context2, c0589cO, string4, jA);
                    Intent intent3 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                    c2663fI.f(new RunnableC2921k3(c2663fI, intent3, i, i2));
                } else {
                    C3130nt.d().a(str7, "Setting up Alarms for " + string4 + " at " + jA, new Throwable[0]);
                    AbstractC2974l1.b(context2, c0589cO, string4, jA);
                }
                workDatabase.h();
            }
            workDatabase.f();
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
