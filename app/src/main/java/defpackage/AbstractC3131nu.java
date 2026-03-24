package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.InputEvent;

/* renamed from: nu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3131nu {
    public static final C3076mu a(Context context) {
        AbstractC3241pu c2856iu;
        Object objInvoke;
        AbstractC0500aq.m(context, "context");
        StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
        int i = Build.VERSION.SDK_INT;
        Z0 z0 = Z0.a;
        sb.append(i >= 33 ? z0.a() : 0);
        Log.d("MeasurementManager", sb.toString());
        if ((i >= 33 ? z0.a() : 0) >= 5) {
            Object systemService = context.getSystemService((Class<Object>) AbstractC0434Yn.s());
            AbstractC0500aq.l(systemService, "context.getSystemService…ementManager::class.java)");
            c2856iu = new C2856iu(AbstractC0434Yn.e(systemService));
        } else {
            Y0 y0 = Y0.a;
            if (((i == 31 || i == 32) ? y0.a() : 0) >= 9) {
                try {
                    objInvoke = new C2803hu(context, 0).invoke(context);
                } catch (NoClassDefFoundError unused) {
                    StringBuilder sb2 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                    int i2 = Build.VERSION.SDK_INT;
                    sb2.append((i2 == 31 || i2 == 32) ? y0.a() : 0);
                    Log.d("MeasurementManager", sb2.toString());
                    objInvoke = null;
                }
                c2856iu = (AbstractC3241pu) objInvoke;
            } else {
                c2856iu = null;
            }
        }
        if (c2856iu != null) {
            return new C3076mu(c2856iu);
        }
        return null;
    }

    public abstract As b();

    public abstract As c(Uri uri, InputEvent inputEvent);

    public abstract As d(Uri uri);
}
