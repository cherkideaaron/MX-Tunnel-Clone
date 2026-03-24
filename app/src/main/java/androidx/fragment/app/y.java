package androidx.fragment.app;

import defpackage.Vs;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y implements Runnable {
    public final /* synthetic */ z a;
    public final /* synthetic */ f b;

    public y(f fVar, z zVar) {
        this.b = fVar;
        this.a = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.b.b;
        z zVar = this.a;
        if (arrayList.contains(zVar)) {
            Vs.a(zVar.c.mView, zVar.a);
        }
    }
}
