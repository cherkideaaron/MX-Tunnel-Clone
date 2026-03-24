package defpackage;

import android.os.Bundle;

/* renamed from: ee, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2622ee implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ BinderC2895je c;

    public /* synthetic */ RunnableC2622ee(BinderC2895je binderC2895je, Bundle bundle, int i) {
        this.a = i;
        this.c = binderC2895je;
        this.b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.c.b.onUnminimized(this.b);
                break;
            case 1:
                this.c.b.onMessageChannelReady(this.b);
                break;
            case 2:
                this.c.b.onWarmupCompleted(this.b);
                break;
            default:
                this.c.b.onMinimized(this.b);
                break;
        }
    }
}
