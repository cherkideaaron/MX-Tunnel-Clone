package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: wy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3623wy {
    public boolean b;
    public Object d;
    public Object e;
    public long a = -1;
    public Object f = new C3157oJ(this);
    public Cloneable c = new ArrayList();

    public void a() {
        if (this.b) {
            Iterator it = ((ArrayList) this.c).iterator();
            while (it.hasNext()) {
                ((C2885jM) it.next()).b();
            }
            this.b = false;
        }
    }

    public void b() {
        View view;
        if (this.b) {
            return;
        }
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            C2885jM c2885jM = (C2885jM) it.next();
            long j = this.a;
            if (j >= 0) {
                c2885jM.c(j);
            }
            Interpolator interpolator = (Interpolator) this.d;
            if (interpolator != null && (view = (View) c2885jM.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (((InterfaceC2940kM) this.e) != null) {
                c2885jM.d((C3157oJ) this.f);
            }
            View view2 = (View) c2885jM.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.b = true;
    }
}
