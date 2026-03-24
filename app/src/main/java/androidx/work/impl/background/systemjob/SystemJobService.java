package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import defpackage.AbstractC3264qG;
import defpackage.C0589cO;
import defpackage.C3130nt;
import defpackage.D3;
import defpackage.InterfaceC2900jj;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC2900jj {
    public static final String c = C3130nt.f("SystemJobService");
    public C0589cO a;
    public final HashMap b = new HashMap();

    @Override // defpackage.InterfaceC2900jj
    public final void b(String str, boolean z) {
        JobParameters jobParameters;
        C3130nt.d().a(c, AbstractC3264qG.g(str, " executed on JobScheduler"), new Throwable[0]);
        synchronized (this.b) {
            jobParameters = (JobParameters) this.b.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            C0589cO c0589cOS = C0589cO.S(getApplicationContext());
            this.a = c0589cOS;
            c0589cOS.B.a(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            C3130nt.d().g(c, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        C0589cO c0589cO = this.a;
        if (c0589cO != null) {
            c0589cO.B.f(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras;
        if (this.a == null) {
            C3130nt.d().a(c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        D3 d3 = null;
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException unused) {
        }
        String string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            C3130nt.d().b(c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.b) {
            try {
                if (this.b.containsKey(string)) {
                    C3130nt.d().a(c, "Job is already being executed by SystemJobService: " + string, new Throwable[0]);
                    return false;
                }
                C3130nt.d().a(c, "onStartJob for " + string, new Throwable[0]);
                this.b.put(string, jobParameters);
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    d3 = new D3();
                    if (jobParameters.getTriggeredContentUris() != null) {
                        d3.c = Arrays.asList(jobParameters.getTriggeredContentUris());
                    }
                    if (jobParameters.getTriggeredContentAuthorities() != null) {
                        d3.b = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                    }
                    if (i >= 28) {
                        d3.d = jobParameters.getNetwork();
                    }
                }
                this.a.W(string, d3);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        PersistableBundle extras;
        if (this.a == null) {
            C3130nt.d().a(c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException unused) {
        }
        String string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            C3130nt.d().b(c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        C3130nt.d().a(c, AbstractC3264qG.w("onStopJob for ", string), new Throwable[0]);
        synchronized (this.b) {
            this.b.remove(string);
        }
        this.a.X(string);
        return !this.a.B.d(string);
    }
}
