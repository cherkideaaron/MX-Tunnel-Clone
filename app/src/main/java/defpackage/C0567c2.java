package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: c2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0567c2 implements CD {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public C0567c2(AbstractActivityC2592e2 abstractActivityC2592e2) {
        this.b = abstractActivityC2592e2;
    }

    @Override // defpackage.CD
    public final Bundle a() {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC2592e2) this.b).j().getClass();
                return bundle;
            default:
                Bundle bundleD = AbstractC0500aq.d((Jy[]) Arrays.copyOf(new Jy[0], 0));
                List listJ0 = AbstractC3383sa.j0((LinkedHashSet) this.b);
                bundleD.putStringArrayList("classes_to_restore", listJ0 instanceof ArrayList ? (ArrayList) listJ0 : new ArrayList<>(listJ0));
                return bundleD;
        }
    }

    public C0567c2(DD dd) {
        AbstractC0500aq.m(dd, "registry");
        this.b = new LinkedHashSet();
        dd.c("androidx.savedstate.Restarter", this);
    }
}
