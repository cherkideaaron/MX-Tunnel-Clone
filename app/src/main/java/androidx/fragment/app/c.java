package androidx.fragment.app;

import defpackage.Vs;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ List a;
    public final /* synthetic */ z b;
    public final /* synthetic */ f c;

    public c(f fVar, ArrayList arrayList, z zVar) {
        this.c = fVar;
        this.a = arrayList;
        this.b = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.a;
        z zVar = this.b;
        if (list.contains(zVar)) {
            list.remove(zVar);
            this.c.getClass();
            Vs.a(zVar.c.mView, zVar.a);
        }
    }
}
