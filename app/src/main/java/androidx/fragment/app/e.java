package androidx.fragment.app;

import defpackage.D8;
import defpackage.Vs;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class e {
    public final z a;
    public final D8 b;

    public e(z zVar, D8 d8) {
        this.a = zVar;
        this.b = d8;
    }

    public final void a() {
        z zVar = this.a;
        HashSet hashSet = zVar.e;
        if (hashSet.remove(this.b) && hashSet.isEmpty()) {
            zVar.b();
        }
    }

    public final boolean b() {
        z zVar = this.a;
        int iC = Vs.c(zVar.c.mView);
        int i = zVar.a;
        return iC == i || !(iC == 2 || i == 2);
    }
}
