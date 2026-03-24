package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: jM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2885jM {
    public final WeakReference a;

    public C2885jM(View view) {
        this.a = new WeakReference(view);
    }

    public final void a(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void b() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(InterfaceC2940kM interfaceC2940kM) {
        View view = (View) this.a.get();
        if (view != null) {
            if (interfaceC2940kM != null) {
                view.animate().setListener(new MJ(interfaceC2940kM, view, 1));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
