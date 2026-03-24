package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;

/* renamed from: Wl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0398Wl implements Runnable {
    public static final String d = C3130nt.f("ForceStopRunnable");
    public static final long e = TimeUnit.DAYS.toMillis(3650);
    public final Context a;
    public final C0589cO b;
    public int c = 0;

    public RunnableC0398Wl(Context context, C0589cO c0589cO) {
        this.a = context.getApplicationContext();
        this.b = c0589cO;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = U7.b() ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + e;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC0398Wl.a():void");
    }

    public final boolean b() {
        C2770hF c2770hF = this.b.x;
        c2770hF.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = d;
        if (zIsEmpty) {
            C3130nt.d().a(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean zA = Nz.a(this.a, c2770hF);
        C3130nt.d().a(str, "Is default app process = " + zA, new Throwable[0]);
        return zA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = d;
        C0589cO c0589cO = this.b;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                VN.a(this.a);
                C3130nt.d().a(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e2) {
                    int i = this.c + 1;
                    this.c = i;
                    if (i >= 3) {
                        C3130nt.d().b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
                        c0589cO.x.getClass();
                        throw illegalStateException;
                    }
                    C3130nt.d().a(str, "Retrying after " + (i * 300), e2);
                    try {
                        Thread.sleep(this.c * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } finally {
            c0589cO.U();
        }
    }
}
