package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.AbstractC0500aq;
import defpackage.C0055Ci;
import defpackage.D3;
import defpackage.Hr;
import defpackage.InterfaceC3614wp;
import defpackage.Kr;
import defpackage.Lr;
import defpackage.Lz;
import defpackage.Mz;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC3614wp {
    @Override // defpackage.InterfaceC3614wp
    public final List a() {
        return C0055Ci.a;
    }

    @Override // defpackage.InterfaceC3614wp
    public final Object create(Context context) {
        AbstractC0500aq.m(context, "context");
        D3 d3A = D3.A(context);
        AbstractC0500aq.l(d3A, "getInstance(...)");
        if (!((HashSet) d3A.c).contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
        }
        if (!Lr.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            AbstractC0500aq.k(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new Kr());
        }
        Mz mz = Mz.o;
        mz.getClass();
        mz.e = new Handler();
        mz.f.e(Hr.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        AbstractC0500aq.k(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new Lz(mz));
        return mz;
    }
}
