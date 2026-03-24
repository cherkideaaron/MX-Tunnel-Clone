package defpackage;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final /* synthetic */ class Q1 implements Choreographer.FrameCallback {
    public final /* synthetic */ Runnable a;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a.run();
    }
}
