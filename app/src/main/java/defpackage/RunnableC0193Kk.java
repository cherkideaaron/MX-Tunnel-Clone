package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import java.io.IOException;
import java.util.WeakHashMap;

/* renamed from: Kk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0193Kk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ RunnableC0193Kk(C0210Lk c0210Lk, boolean z) {
        this.a = 1;
        this.b = c0210Lk;
        this.c = z;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C3686y6 c3686y6J;
        C3686y6 c3686y6C;
        FN fn;
        switch (this.a) {
            case 0:
                ((C0210Lk) this.b).b(this.c);
                return;
            case 1:
                C0210Lk c0210Lk = (C0210Lk) this.b;
                boolean z = this.c;
                c0210Lk.getClass();
                synchronized (C0210Lk.m) {
                    try {
                        C3663xk c3663xk = c0210Lk.a;
                        c3663xk.a();
                        R2 r2J = R2.j(c3663xk.a);
                        try {
                            c3686y6J = c0210Lk.c.J();
                            if (r2J != null) {
                                r2J.C();
                            }
                        } catch (Throwable th) {
                            if (r2J != null) {
                                r2J.C();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    int i = c3686y6J.b;
                    if (i == 5 || i == 3) {
                        c3686y6C = c0210Lk.i(c3686y6J);
                    } else if (!z && !c0210Lk.d.a(c3686y6J)) {
                        return;
                    } else {
                        c3686y6C = c0210Lk.c(c3686y6J);
                    }
                    c0210Lk.f(c3686y6C);
                    c0210Lk.m(c3686y6J, c3686y6C);
                    if (c3686y6C.b == 4) {
                        c0210Lk.l(c3686y6C.a);
                    }
                    int i2 = c3686y6C.b;
                    if (i2 == 5) {
                        e = new C0244Nk();
                    } else {
                        if (i2 != 2 && i2 != 1) {
                            c0210Lk.k(c3686y6C);
                            return;
                        }
                        e = new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.");
                    }
                } catch (C0244Nk e) {
                    e = e;
                }
                c0210Lk.j(e);
                return;
            default:
                boolean z2 = this.c;
                View view = (View) this.b;
                if (z2) {
                    WeakHashMap weakHashMap = UL.a;
                    if (Build.VERSION.SDK_INT >= 30) {
                        fn = RL.b(view);
                    } else {
                        Context context = view.getContext();
                        while (true) {
                            if (context instanceof ContextWrapper) {
                                if (context instanceof Activity) {
                                    Window window = ((Activity) context).getWindow();
                                    if (window != null) {
                                        fn = new FN(window, view);
                                    }
                                } else {
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                        }
                        fn = null;
                    }
                    if (fn != null) {
                        fn.a.c();
                        return;
                    }
                }
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                return;
        }
    }

    public /* synthetic */ RunnableC0193Kk(Object obj, int i) {
        this.a = i;
        this.b = obj;
        this.c = false;
    }
}
