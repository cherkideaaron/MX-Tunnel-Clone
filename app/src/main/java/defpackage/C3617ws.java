package defpackage;

import android.os.Handler;
import android.widget.AbsListView;

/* renamed from: ws, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3617ws implements AbsListView.OnScrollListener {
    public final /* synthetic */ C3725ys a;

    public C3617ws(C3725ys c3725ys) {
        this.a = c3725ys;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            C3725ys c3725ys = this.a;
            if (c3725ys.F.getInputMethodMode() == 2 || c3725ys.F.getContentView() == null) {
                return;
            }
            Handler handler = c3725ys.B;
            RunnableC3509us runnableC3509us = c3725ys.x;
            handler.removeCallbacks(runnableC3509us);
            runnableC3509us.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
