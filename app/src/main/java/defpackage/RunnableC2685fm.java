package defpackage;

import androidx.fragment.app.l;

/* renamed from: fm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2685fm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ RunnableC2685fm(l lVar, int i) {
        this.a = i;
        this.b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.startPostponedEnterTransition();
                break;
            default:
                this.b.callStartTransitionListener(false);
                break;
        }
    }
}
