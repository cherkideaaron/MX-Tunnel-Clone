package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class r implements View.OnAttachStateChangeListener {
    public final /* synthetic */ w a;
    public final /* synthetic */ s b;

    public r(s sVar, w wVar) {
        this.b = sVar;
        this.a = wVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        w wVar = this.a;
        l lVar = wVar.c;
        wVar.j();
        f.i((ViewGroup) lVar.mView.getParent(), this.b.a).g();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
