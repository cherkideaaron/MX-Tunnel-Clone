package defpackage;

import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: dm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC2576dm implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float a;
    public final int b;
    public final int c;
    public final View d;
    public RunnableC0605cm e;
    public RunnableC0605cm f;
    public boolean m;
    public int n;
    public final int[] o = new int[2];

    public AbstractViewOnTouchListenerC2576dm(View view) {
        this.d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.b = tapTimeout;
        this.c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC0605cm runnableC0605cm = this.f;
        View view = this.d;
        if (runnableC0605cm != null) {
            view.removeCallbacks(runnableC0605cm);
        }
        RunnableC0605cm runnableC0605cm2 = this.e;
        if (runnableC0605cm2 != null) {
            view.removeCallbacks(runnableC0605cm2);
        }
    }

    public abstract RF b();

    public abstract boolean c();

    public boolean d() {
        RF rfB = b();
        if (rfB == null || !rfB.b()) {
            return true;
        }
        rfB.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractViewOnTouchListenerC2576dm.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.m = false;
        this.n = -1;
        RunnableC0605cm runnableC0605cm = this.e;
        if (runnableC0605cm != null) {
            this.d.removeCallbacks(runnableC0605cm);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
