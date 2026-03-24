package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import defpackage.AbstractC3272qO;
import defpackage.As;
import defpackage.C0051Ce;
import defpackage.C0415Xl;
import defpackage.C0480aO;
import defpackage.C2669fO;
import defpackage.D3;
import defpackage.InterfaceC0466aA;
import defpackage.InterfaceC0496am;
import defpackage.InterfaceC3482uI;
import defpackage.K8;
import defpackage.VE;
import defpackage.ZN;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class ListenableWorker {
    private Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    @Keep
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f;
    }

    public As getForegroundInfoAsync() {
        VE ve = new VE();
        ve.j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return ve;
    }

    public final UUID getId() {
        return this.mWorkerParams.a;
    }

    public final C0051Ce getInputData() {
        return this.mWorkerParams.b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.d.d;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.e;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.c;
    }

    public InterfaceC3482uI getTaskExecutor() {
        return this.mWorkerParams.g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.d.b;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.d.c;
    }

    public AbstractC3272qO getWorkerFactory() {
        return this.mWorkerParams.h;
    }

    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final As setForegroundAsync(C0415Xl c0415Xl) {
        this.mRunInForeground = true;
        InterfaceC0496am interfaceC0496am = this.mWorkerParams.j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        C0480aO c0480aO = (C0480aO) interfaceC0496am;
        c0480aO.getClass();
        VE ve = new VE();
        ((D3) c0480aO.a).t(new ZN(c0480aO, ve, id, c0415Xl, applicationContext));
        return ve;
    }

    public As setProgressAsync(C0051Ce c0051Ce) {
        InterfaceC0466aA interfaceC0466aA = this.mWorkerParams.i;
        getApplicationContext();
        UUID id = getId();
        C2669fO c2669fO = (C2669fO) interfaceC0466aA;
        c2669fO.getClass();
        VE ve = new VE();
        ((D3) c2669fO.b).t(new K8(c2669fO, id, c0051Ce, ve, 1));
        return ve;
    }

    public void setRunInForeground(boolean z) {
        this.mRunInForeground = z;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract As startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}
