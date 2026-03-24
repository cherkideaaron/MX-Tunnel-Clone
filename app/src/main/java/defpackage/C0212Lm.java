package defpackage;

import android.transition.Transition;

/* renamed from: Lm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0212Lm implements Transition.TransitionListener {
    public final /* synthetic */ Runnable a;

    public C0212Lm(RunnableC3680y0 runnableC3680y0) {
        this.a = runnableC3680y0;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.a.run();
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }
}
