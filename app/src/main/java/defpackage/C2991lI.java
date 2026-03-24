package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: lI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2991lI implements LD {
    public static final String e = C3130nt.f("SystemJobScheduler");
    public final Context a;
    public final JobScheduler b;
    public final C0589cO c;
    public final C2936kI d;

    public C2991lI(Context context, C0589cO c0589cO) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        C2936kI c2936kI = new C2936kI(context);
        this.a = context;
        this.c = c0589cO;
        this.b = jobScheduler;
        this.d = c2936kI;
    }

    public static void b(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            C3130nt.d().b(e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList d(android.content.Context r5, android.app.job.JobScheduler r6, java.lang.String r7) {
        /*
            java.util.ArrayList r5 = f(r5, r6)
            r6 = 0
            if (r5 != 0) goto L8
            return r6
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L12:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r5.next()
            android.app.job.JobInfo r1 = (android.app.job.JobInfo) r1
            java.lang.String r2 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r3 = r1.getExtras()
            if (r3 == 0) goto L31
            boolean r4 = r3.containsKey(r2)     // Catch: java.lang.NullPointerException -> L31
            if (r4 == 0) goto L31
            java.lang.String r2 = r3.getString(r2)     // Catch: java.lang.NullPointerException -> L31
            goto L32
        L31:
            r2 = r6
        L32:
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L12
            int r1 = r1.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto L12
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2991lI.d(android.content.Context, android.app.job.JobScheduler, java.lang.String):java.util.ArrayList");
    }

    public static ArrayList f(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            C3130nt.d().b(e, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // defpackage.LD
    public final boolean a() {
        return true;
    }

    @Override // defpackage.LD
    public final void c(String str) {
        Context context = this.a;
        JobScheduler jobScheduler = this.b;
        ArrayList arrayListD = d(context, jobScheduler, str);
        if (arrayListD == null || arrayListD.isEmpty()) {
            return;
        }
        Iterator it = arrayListD.iterator();
        while (it.hasNext()) {
            b(jobScheduler, ((Integer) it.next()).intValue());
        }
        this.c.y.k().Q(str);
    }

    @Override // defpackage.LD
    public final void e(C2834iO... c2834iOArr) {
        int iT;
        ArrayList arrayListD;
        int iT2;
        C0589cO c0589cO = this.c;
        WorkDatabase workDatabase = c0589cO.y;
        C2524cp c2524cp = new C2524cp(workDatabase, 0);
        for (C2834iO c2834iO : c2834iOArr) {
            workDatabase.c();
            try {
                C2834iO c2834iOJ = workDatabase.n().j(c2834iO.a);
                String str = e;
                if (c2834iOJ == null) {
                    C3130nt.d().g(str, "Skipping scheduling " + c2834iO.a + " because it's no longer in the DB", new Throwable[0]);
                } else if (c2834iOJ.b != 1) {
                    C3130nt.d().g(str, "Skipping scheduling " + c2834iO.a + " because it is no longer enqueued", new Throwable[0]);
                } else {
                    C2828iI c2828iIC = workDatabase.k().C(c2834iO.a);
                    if (c2828iIC != null) {
                        iT = c2828iIC.b;
                    } else {
                        c0589cO.x.getClass();
                        iT = c2524cp.t(c0589cO.x.b);
                    }
                    if (c2828iIC == null) {
                        c0589cO.y.k().I(new C2828iI(c2834iO.a, iT));
                    }
                    g(c2834iO, iT);
                    if (Build.VERSION.SDK_INT == 23 && (arrayListD = d(this.a, this.b, c2834iO.a)) != null) {
                        int iIndexOf = arrayListD.indexOf(Integer.valueOf(iT));
                        if (iIndexOf >= 0) {
                            arrayListD.remove(iIndexOf);
                        }
                        if (arrayListD.isEmpty()) {
                            c0589cO.x.getClass();
                            iT2 = c2524cp.t(c0589cO.x.b);
                        } else {
                            iT2 = ((Integer) arrayListD.get(0)).intValue();
                        }
                        g(c2834iO, iT2);
                    }
                }
                workDatabase.h();
            } finally {
                workDatabase.f();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0071, code lost:
    
        if (r11 < 26) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(defpackage.C2834iO r19, int r20) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2991lI.g(iO, int):void");
    }
}
