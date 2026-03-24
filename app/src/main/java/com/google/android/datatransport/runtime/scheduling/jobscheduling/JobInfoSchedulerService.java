package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import defpackage.C2610eK;
import defpackage.D3;
import defpackage.Dz;
import defpackage.J6;
import defpackage.RK;
import defpackage.RunnableC3195p2;
import defpackage.UK;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C2610eK.b(getApplicationContext());
        D3 d3A = J6.a();
        d3A.S(string);
        d3A.T(Dz.b(i));
        if (string2 != null) {
            d3A.c = Base64.decode(string2, 0);
        }
        UK uk = C2610eK.a().d;
        J6 j6H = d3A.h();
        RunnableC3195p2 runnableC3195p2 = new RunnableC3195p2(8, this, jobParameters);
        uk.getClass();
        uk.e.execute(new RK(uk, j6H, i2, runnableC3195p2));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
