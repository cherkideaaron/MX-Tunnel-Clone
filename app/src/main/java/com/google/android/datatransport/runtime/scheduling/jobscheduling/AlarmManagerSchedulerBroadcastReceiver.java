package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import defpackage.C2610eK;
import defpackage.D3;
import defpackage.Dz;
import defpackage.J6;
import defpackage.RK;
import defpackage.RunnableC2919k1;
import defpackage.UK;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C2610eK.b(context);
        D3 d3A = J6.a();
        d3A.S(queryParameter);
        d3A.T(Dz.b(iIntValue));
        if (queryParameter2 != null) {
            d3A.c = Base64.decode(queryParameter2, 0);
        }
        UK uk = C2610eK.a().d;
        J6 j6H = d3A.h();
        RunnableC2919k1 runnableC2919k1 = new RunnableC2919k1();
        uk.getClass();
        uk.e.execute(new RK(uk, j6H, i, runnableC2919k1));
    }
}
