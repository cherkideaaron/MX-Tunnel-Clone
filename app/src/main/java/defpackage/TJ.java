package defpackage;

import android.view.ViewGroup;
import com.mxtunnel.pro.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class TJ {
    public static final C3088n5 a;
    public static final ThreadLocal b;
    public static final ArrayList c;

    static {
        C3088n5 c3088n5 = new C3088n5();
        c3088n5.I = false;
        c3088n5.K(new C0243Nj(2));
        c3088n5.K(new V8());
        c3088n5.K(new C0243Nj(1));
        a = c3088n5;
        b = new ThreadLocal();
        c = new ArrayList();
    }

    public static void a(ViewGroup viewGroup, PJ pj) {
        ArrayList arrayList = c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (pj == null) {
            pj = a;
        }
        PJ pjClone = pj.clone();
        ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((PJ) it.next()).x(viewGroup);
            }
        }
        pjClone.i(viewGroup, true);
        Vs.u(viewGroup.getTag(R.id.transition_current_scene));
        viewGroup.setTag(R.id.transition_current_scene, null);
        SJ sj = new SJ();
        sj.a = pjClone;
        sj.b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(sj);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(sj);
    }

    public static Z3 b() {
        Z3 z3;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (z3 = (Z3) weakReference.get()) != null) {
            return z3;
        }
        Z3 z32 = new Z3();
        threadLocal.set(new WeakReference(z32));
        return z32;
    }
}
