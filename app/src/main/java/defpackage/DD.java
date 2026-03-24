package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* loaded from: classes.dex */
public final class DD {
    public final GD a;
    public C0567c2 b;

    public DD(GD gd) {
        this.a = gd;
    }

    public final Bundle a(String str) {
        GD gd = this.a;
        gd.getClass();
        if (!gd.g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state".toString());
        }
        Bundle bundle = gd.f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleX = bundle.containsKey(str) ? AbstractC0069Df.x(bundle, str) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            gd.f = null;
        }
        return bundleX;
    }

    public final CD b() {
        CD cd;
        GD gd = this.a;
        gd.getClass();
        synchronized (gd.c) {
            Iterator it = gd.d.entrySet().iterator();
            do {
                cd = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                CD cd2 = (CD) entry.getValue();
                if (AbstractC0500aq.b(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    cd = cd2;
                }
            } while (cd == null);
        }
        return cd;
    }

    public final void c(String str, CD cd) {
        AbstractC0500aq.m(str, "key");
        AbstractC0500aq.m(cd, "provider");
        GD gd = this.a;
        gd.getClass();
        synchronized (gd.c) {
            if (!(!gd.d.containsKey(str))) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
            }
            gd.d.put(str, cd);
        }
    }

    public final void d() {
        if (!this.a.h) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        C0567c2 c0567c2 = this.b;
        if (c0567c2 == null) {
            c0567c2 = new C0567c2(this);
        }
        this.b = c0567c2;
        try {
            C3778zr.class.getDeclaredConstructor(null);
            C0567c2 c0567c22 = this.b;
            if (c0567c22 != null) {
                ((LinkedHashSet) c0567c22.b).add(C3778zr.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + C3778zr.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
