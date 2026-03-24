package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class ED {
    public final GD a;
    public final DD b;

    public ED(GD gd) {
        this.a = gd;
        this.b = new DD(gd);
    }

    public final void a(Bundle bundle) {
        GD gd = this.a;
        if (!gd.e) {
            gd.a();
        }
        HD hd = gd.a;
        if (!(!((Qr) hd.getLifecycle()).c.a(Ir.d))) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + ((Qr) hd.getLifecycle()).c).toString());
        }
        if (!(!gd.g)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        Bundle bundleX = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleX = AbstractC0069Df.x(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        gd.f = bundleX;
        gd.g = true;
    }

    public final void b(Bundle bundle) {
        AbstractC0500aq.m(bundle, "outBundle");
        GD gd = this.a;
        gd.getClass();
        Bundle bundleD = AbstractC0500aq.d((Jy[]) Arrays.copyOf(new Jy[0], 0));
        Bundle bundle2 = gd.f;
        if (bundle2 != null) {
            bundleD.putAll(bundle2);
        }
        synchronized (gd.c) {
            for (Map.Entry entry : gd.d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleA = ((CD) entry.getValue()).a();
                AbstractC0500aq.m(str, "key");
                bundleD.putBundle(str, bundleA);
            }
        }
        if (!bundleD.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleD);
        }
    }
}
