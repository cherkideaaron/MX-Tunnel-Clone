package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.Vs;
import defpackage.X3;
import defpackage.Z3;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class AvailabilityException extends Exception {
    private final Z3 zaa;

    public AvailabilityException(Z3 z3) {
        this.zaa = z3;
    }

    public ConnectionResult getConnectionResult(GoogleApi<? extends Api.ApiOptions> googleApi) {
        Z3 z3 = this.zaa;
        ApiKey<O> apiKey = googleApi.getApiKey();
        Object obj = z3.get(apiKey);
        String strZaa = apiKey.zaa();
        Preconditions.checkArgument(obj != null, Vs.o(new StringBuilder(String.valueOf(strZaa).length() + 58), "The given API (", strZaa, ") was not part of the availability request."));
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) z3.get(apiKey));
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        Z3 z3 = this.zaa;
        Iterator it = ((X3) z3.keySet()).iterator();
        boolean z = true;
        while (it.hasNext()) {
            ApiKey apiKey = (ApiKey) it.next();
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) z3.get(apiKey));
            z &= !connectionResult.isSuccess();
            String strZaa = apiKey.zaa();
            String strValueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(strZaa).length() + 2 + strValueOf.length());
            sb.append(strZaa);
            sb.append(": ");
            sb.append(strValueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }

    public ConnectionResult getConnectionResult(HasApiKey<? extends Api.ApiOptions> hasApiKey) {
        Z3 z3 = this.zaa;
        ApiKey<O> apiKey = hasApiKey.getApiKey();
        Object obj = z3.get(apiKey);
        String strZaa = apiKey.zaa();
        Preconditions.checkArgument(obj != null, Vs.o(new StringBuilder(String.valueOf(strZaa).length() + 58), "The given API (", strZaa, ") was not part of the availability request."));
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) z3.get(apiKey));
    }
}
