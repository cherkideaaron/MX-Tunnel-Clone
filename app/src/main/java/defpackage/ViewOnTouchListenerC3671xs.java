package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* renamed from: xs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC3671xs implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ViewOnTouchListenerC3671xs(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Q2 q2;
        switch (this.a) {
            case 0:
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                C3725ys c3725ys = (C3725ys) this.b;
                if (action == 0 && (q2 = c3725ys.F) != null && q2.isShowing() && x >= 0 && x < c3725ys.F.getWidth() && y >= 0 && y < c3725ys.F.getHeight()) {
                    c3725ys.B.postDelayed(c3725ys.x, 250L);
                    return false;
                }
                if (action != 1) {
                    return false;
                }
                c3725ys.B.removeCallbacks(c3725ys.x);
                return false;
            default:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) this.b).onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
