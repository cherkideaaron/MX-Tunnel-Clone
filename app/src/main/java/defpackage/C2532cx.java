package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.t;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: cx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2532cx {
    public final Runnable a;
    public final T3 b = new T3();
    public C3288qm c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public C2532cx(Runnable runnable) {
        this.a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.d = i >= 34 ? Zw.a.a(new Vw(this, 0), new Vw(this, 1), new Ww(this, 0), new Ww(this, 1)) : Xw.a.a(new Ww(this, 2));
        }
    }

    public final void a() {
        Object objPrevious;
        T3 t3 = this.b;
        t3.getClass();
        ListIterator listIterator = t3.listIterator(t3.c);
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((C3288qm) objPrevious).a) {
                    break;
                }
            }
        }
        C3288qm c3288qm = (C3288qm) objPrevious;
        this.c = null;
        if (c3288qm == null) {
            Runnable runnable = this.a;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        t tVar = c3288qm.d;
        tVar.x(true);
        if (tVar.h.a) {
            tVar.L();
        } else {
            tVar.g.a();
        }
    }

    public final void b(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        Xw xw = Xw.a;
        if (z && !this.f) {
            xw.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z || !this.f) {
                return;
            }
            xw.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void c() {
        boolean z = this.g;
        T3 t3 = this.b;
        boolean z2 = false;
        if (!(t3 instanceof Collection) || !t3.isEmpty()) {
            Iterator it = t3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C3288qm) it.next()).a) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        b(z2);
    }
}
