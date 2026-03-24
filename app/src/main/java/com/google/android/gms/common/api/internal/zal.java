package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.Z3;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class zal {
    private int zad;
    private final Z3 zab = new Z3();
    private final TaskCompletionSource zac = new TaskCompletionSource();
    private boolean zae = false;
    private final Z3 zaa = new Z3();

    public zal(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zaa.put(((HasApiKey) it.next()).getApiKey(), null);
        }
        this.zad = this.zaa.c;
    }

    public final Set zaa() {
        return this.zaa.keySet();
    }

    public final Task zab() {
        return this.zac.getTask();
    }

    public final void zac(ApiKey apiKey, ConnectionResult connectionResult, String str) {
        Z3 z3 = this.zaa;
        z3.put(apiKey, connectionResult);
        Z3 z32 = this.zab;
        z32.put(apiKey, str);
        this.zad--;
        if (!connectionResult.isSuccess()) {
            this.zae = true;
        }
        if (this.zad == 0) {
            if (!this.zae) {
                this.zac.setResult(z32);
            } else {
                this.zac.setException(new AvailabilityException(z3));
            }
        }
    }
}
