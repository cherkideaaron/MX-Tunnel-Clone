package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.l;
import java.util.LinkedHashMap;

/* renamed from: Um, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0365Um implements InterfaceC3235po, HD, InterfaceC2722gM {
    public final l a;
    public final C2667fM b;
    public Qr c = null;
    public ED d = null;

    public C0365Um(l lVar, C2667fM c2667fM) {
        this.a = lVar;
        this.b = c2667fM;
    }

    public final void a(Hr hr) {
        this.c.e(hr);
    }

    public final void b() {
        if (this.c == null) {
            this.c = new Qr(this);
            GD gd = new GD(this, new C0336Ta(this, 3));
            this.d = new ED(gd);
            gd.a();
            AbstractC3296qu.o(this);
        }
    }

    @Override // defpackage.InterfaceC3235po
    public final AbstractC0424Yd getDefaultViewModelCreationExtras() {
        Application application;
        l lVar = this.a;
        Context applicationContext = lVar.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        Pv pv = new Pv();
        LinkedHashMap linkedHashMap = pv.a;
        if (application != null) {
            linkedHashMap.put(C2558dM.e, application);
        }
        linkedHashMap.put(AbstractC3296qu.e, this);
        linkedHashMap.put(AbstractC3296qu.f, this);
        if (lVar.getArguments() != null) {
            linkedHashMap.put(AbstractC3296qu.g, lVar.getArguments());
        }
        return pv;
    }

    @Override // defpackage.Or
    public final Jr getLifecycle() {
        b();
        return this.c;
    }

    @Override // defpackage.HD
    public final DD getSavedStateRegistry() {
        b();
        return this.d.b;
    }

    @Override // defpackage.InterfaceC2722gM
    public final C2667fM getViewModelStore() {
        b();
        return this.b;
    }
}
