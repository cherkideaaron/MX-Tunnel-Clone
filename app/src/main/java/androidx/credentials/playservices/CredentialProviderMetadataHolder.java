package androidx.credentials.playservices;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.AbstractC0500aq;
import defpackage.BinderC0488ae;

/* loaded from: classes.dex */
public final class CredentialProviderMetadataHolder extends Service {
    public final BinderC0488ae a = new BinderC0488ae();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        AbstractC0500aq.m(intent, "intent");
        return this.a;
    }
}
