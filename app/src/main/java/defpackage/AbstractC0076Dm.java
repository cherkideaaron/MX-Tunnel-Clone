package defpackage;

import android.util.Log;
import androidx.fragment.app.l;

/* renamed from: Dm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0076Dm {
    public static final C0059Cm a = C0059Cm.a;

    public static C0059Cm a(l lVar) {
        while (lVar != null) {
            if (lVar.isAdded()) {
                AbstractC0500aq.l(lVar.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            lVar = lVar.getParentFragment();
        }
        return a;
    }

    public static void b(AbstractC3756zM abstractC3756zM) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(abstractC3756zM.a.getClass().getName()), abstractC3756zM);
        }
    }

    public static final void c(l lVar, String str) {
        AbstractC0500aq.m(lVar, "fragment");
        AbstractC0500aq.m(str, "previousFragmentId");
        b(new C0025Am(lVar, "Attempting to reuse fragment " + lVar + " with previous ID " + str));
        a(lVar).getClass();
        Object obj = EnumC0042Bm.a;
        if (obj instanceof Void) {
        }
    }
}
