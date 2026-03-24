package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.C0228Ml;
import defpackage.C2626ei;
import defpackage.C2681fi;
import defpackage.C2845ii;
import defpackage.D3;
import defpackage.InterfaceC3614wp;
import defpackage.Jr;
import defpackage.Or;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC3614wp {
    @Override // defpackage.InterfaceC3614wp
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    public final void b(Context context) {
        C0228Ml c0228Ml = new C0228Ml(new C2845ii(context, 0));
        c0228Ml.a = 1;
        if (C2626ei.k == null) {
            synchronized (C2626ei.j) {
                try {
                    if (C2626ei.k == null) {
                        C2626ei.k = new C2626ei(c0228Ml);
                    }
                } finally {
                }
            }
        }
        c(context);
    }

    public final void c(Context context) {
        Object objQ;
        D3 d3A = D3.A(context);
        d3A.getClass();
        synchronized (D3.f) {
            try {
                objQ = ((HashMap) d3A.b).get(ProcessLifecycleInitializer.class);
                if (objQ == null) {
                    objQ = d3A.q(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Jr lifecycle = ((Or) objQ).getLifecycle();
        lifecycle.a(new C2681fi(this, lifecycle));
    }

    @Override // defpackage.InterfaceC3614wp
    public final /* bridge */ /* synthetic */ Object create(Context context) {
        b(context);
        return Boolean.TRUE;
    }
}
