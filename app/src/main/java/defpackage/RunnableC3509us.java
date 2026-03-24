package defpackage;

/* renamed from: us, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC3509us implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C3725ys b;

    public /* synthetic */ RunnableC3509us(C3725ys c3725ys, int i) {
        this.a = i;
        this.b = c3725ys;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C0054Ch c0054Ch = this.b.c;
                if (c0054Ch != null) {
                    c0054Ch.setListSelectionHidden(true);
                    c0054Ch.requestLayout();
                    break;
                }
                break;
            default:
                C3725ys c3725ys = this.b;
                C0054Ch c0054Ch2 = c3725ys.c;
                if (c0054Ch2 != null && c0054Ch2.isAttachedToWindow() && c3725ys.c.getCount() > c3725ys.c.getChildCount() && c3725ys.c.getChildCount() <= c3725ys.s) {
                    c3725ys.F.setInputMethodMode(2);
                    c3725ys.show();
                    break;
                }
                break;
        }
    }
}
