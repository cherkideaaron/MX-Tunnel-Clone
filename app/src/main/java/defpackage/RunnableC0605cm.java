package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: cm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0605cm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractViewOnTouchListenerC2576dm b;

    public /* synthetic */ RunnableC0605cm(AbstractViewOnTouchListenerC2576dm abstractViewOnTouchListenerC2576dm, int i) {
        this.a = i;
        this.b = abstractViewOnTouchListenerC2576dm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ViewParent parent = this.b.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC2576dm abstractViewOnTouchListenerC2576dm = this.b;
                abstractViewOnTouchListenerC2576dm.a();
                View view = abstractViewOnTouchListenerC2576dm.d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC2576dm.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC2576dm.m = true;
                    break;
                }
                break;
        }
    }
}
