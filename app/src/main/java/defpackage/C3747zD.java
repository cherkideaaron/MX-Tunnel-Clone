package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* renamed from: zD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3747zD implements CD {
    public final DD a;
    public boolean b;
    public Bundle c;
    public final C0583cI d;

    public C3747zD(DD dd, InterfaceC2722gM interfaceC2722gM) {
        AbstractC0500aq.m(dd, "savedStateRegistry");
        AbstractC0500aq.m(interfaceC2722gM, "viewModelStoreOwner");
        this.a = dd;
        this.d = AbstractC0069Df.G(new C0336Ta(interfaceC2722gM, 2));
    }

    @Override // defpackage.CD
    public final Bundle a() {
        Bundle bundleD = AbstractC0500aq.d((Jy[]) Arrays.copyOf(new Jy[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleD.putAll(bundle);
        }
        for (Map.Entry entry : ((AD) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((C0353Ua) ((C3639xD) entry.getValue()).a.e).a();
            if (!bundleA.isEmpty()) {
                AbstractC0500aq.m(str, "key");
                bundleD.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundleD;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleA = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleD = AbstractC0500aq.d((Jy[]) Arrays.copyOf(new Jy[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleD.putAll(bundle);
        }
        if (bundleA != null) {
            bundleD.putAll(bundleA);
        }
        this.c = bundleD;
        this.b = true;
    }
}
