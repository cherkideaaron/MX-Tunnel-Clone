package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;

/* renamed from: Xa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0404Xa implements Mr {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractActivityC2619eb b;

    public /* synthetic */ C0404Xa(AbstractActivityC2619eb abstractActivityC2619eb, int i) {
        this.a = i;
        this.b = abstractActivityC2619eb;
    }

    @Override // defpackage.Mr
    public final void c(Or or, Hr hr) {
        switch (this.a) {
            case 0:
                if (hr == Hr.ON_DESTROY) {
                    this.b.mContextAwareHelper.b = null;
                    if (!this.b.isChangingConfigurations()) {
                        this.b.getViewModelStore().a();
                    }
                    ViewTreeObserverOnDrawListenerC0594cb viewTreeObserverOnDrawListenerC0594cb = (ViewTreeObserverOnDrawListenerC0594cb) this.b.mReportFullyDrawnExecutor;
                    AbstractActivityC2619eb abstractActivityC2619eb = viewTreeObserverOnDrawListenerC0594cb.d;
                    abstractActivityC2619eb.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0594cb);
                    abstractActivityC2619eb.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0594cb);
                    break;
                }
                break;
            case 1:
                if (hr == Hr.ON_STOP) {
                    Window window = this.b.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                        break;
                    }
                }
                break;
            case 2:
                AbstractActivityC2619eb abstractActivityC2619eb2 = this.b;
                abstractActivityC2619eb2.ensureViewModelStore();
                abstractActivityC2619eb2.getLifecycle().b(this);
                break;
            default:
                if (hr == Hr.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
                    C2532cx c2532cx = this.b.mOnBackPressedDispatcher;
                    OnBackInvokedDispatcher onBackInvokedDispatcherA = AbstractC0421Ya.a((AbstractActivityC2619eb) or);
                    c2532cx.getClass();
                    AbstractC0500aq.m(onBackInvokedDispatcherA, "invoker");
                    c2532cx.e = onBackInvokedDispatcherA;
                    c2532cx.b(c2532cx.g);
                    break;
                }
                break;
        }
    }
}
