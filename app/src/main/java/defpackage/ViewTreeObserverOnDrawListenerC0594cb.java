package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.q;

/* renamed from: cb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0594cb implements InterfaceExecutorC0540bb, ViewTreeObserver.OnDrawListener, Runnable {
    public Runnable b;
    public final /* synthetic */ AbstractActivityC2619eb d;
    public final long a = SystemClock.uptimeMillis() + 10000;
    public boolean c = false;

    public ViewTreeObserverOnDrawListenerC0594cb(q qVar) {
        this.d = qVar;
    }

    @Override // defpackage.InterfaceExecutorC0540bb
    public final void c(View view) {
        if (this.c) {
            return;
        }
        this.c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b = runnable;
        View decorView = this.d.getWindow().getDecorView();
        if (!this.c) {
            decorView.postOnAnimation(new H0(this, 5));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
            this.b = null;
            C0552bn c0552bn = this.d.mFullyDrawnReporter;
            synchronized (c0552bn.b) {
                z = c0552bn.c;
            }
            if (!z) {
                return;
            }
        } else if (SystemClock.uptimeMillis() <= this.a) {
            return;
        }
        this.c = false;
        this.d.getWindow().getDecorView().post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
