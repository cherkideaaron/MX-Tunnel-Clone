package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class GD {
    public final HD a;
    public final InterfaceC0606cn b;
    public final C0360Uh c;
    public final LinkedHashMap d;
    public boolean e;
    public Bundle f;
    public boolean g;
    public boolean h;

    public GD(HD hd, C0336Ta c0336Ta) {
        AbstractC0500aq.m(hd, "owner");
        this.a = hd;
        this.b = c0336Ta;
        this.c = new C0360Uh(27);
        this.d = new LinkedHashMap();
        this.h = true;
    }

    public final void a() {
        HD hd = this.a;
        if (((Qr) hd.getLifecycle()).c != Ir.b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        if (!(!this.e)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        this.b.invoke();
        hd.getLifecycle().a(new Mr() { // from class: FD
            @Override // defpackage.Mr
            public final void c(Or or, Hr hr) {
                boolean z;
                Hr hr2 = Hr.ON_START;
                GD gd = this.a;
                if (hr == hr2) {
                    z = true;
                } else if (hr != Hr.ON_STOP) {
                    return;
                } else {
                    z = false;
                }
                gd.h = z;
            }
        });
        this.e = true;
    }
}
