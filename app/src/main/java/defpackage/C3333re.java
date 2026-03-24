package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: re, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3333re {
    public final InterfaceC0248No b;
    public final InterfaceC0197Ko c;
    public final ComponentName d;
    public final Object a = new Object();
    public final PendingIntent e = null;

    public C3333re(InterfaceC0248No interfaceC0248No, BinderC2895je binderC2895je, ComponentName componentName) {
        this.b = interfaceC0248No;
        this.c = binderC2895je;
        this.d = componentName;
    }

    public final void a(String str) {
        Bundle bundle = new Bundle();
        PendingIntent pendingIntent = this.e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
        synchronized (this.a) {
            try {
                try {
                    ((C0214Lo) this.b).c(this.c, str, bundle);
                } catch (RemoteException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
