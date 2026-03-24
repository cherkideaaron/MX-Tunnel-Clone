package defpackage;

import android.graphics.Matrix;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;

/* loaded from: classes.dex */
public final class X6 extends AbstractViewOnTouchListenerC3581w9 {
    public Matrix e;
    public Matrix f;
    public C3510ut m;
    public C3510ut n;
    public float o;
    public float p;
    public float q;
    public C0502as r;
    public VelocityTracker s;
    public long t;
    public C3510ut u;
    public C3510ut v;
    public float w;
    public float x;

    public static float e(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y * y) + (x * x));
    }

    public final C3510ut a(float f, float f2) {
        C2832iM viewPortHandler = ((W6) this.d).getViewPortHandler();
        float f3 = f - viewPortHandler.b.left;
        b();
        return C3510ut.b(f3, -((r0.getMeasuredHeight() - f2) - (viewPortHandler.d - viewPortHandler.b.bottom)));
    }

    public final void b() {
        C0502as c0502as = this.r;
        AbstractC3311r9 abstractC3311r9 = this.d;
        if (c0502as == null) {
            W6 w6 = (W6) abstractC3311r9;
            w6.W.getClass();
            w6.a0.getClass();
        }
        C0502as c0502as2 = this.r;
        if (c0502as2 != null) {
            W6 w62 = (W6) abstractC3311r9;
            (c0502as2.d == 1 ? w62.W : w62.a0).getClass();
        }
    }

    public final void c(MotionEvent motionEvent) {
        this.e.set(this.f);
        ((W6) this.d).getOnChartGestureListener();
        b();
        float x = motionEvent.getX();
        C3510ut c3510ut = this.m;
        this.e.postTranslate(x - c3510ut.b, motionEvent.getY() - c3510ut.c);
    }

    public final void d(MotionEvent motionEvent) {
        this.f.set(this.e);
        float x = motionEvent.getX();
        C3510ut c3510ut = this.m;
        c3510ut.b = x;
        c3510ut.c = motionEvent.getY();
        W6 w6 = (W6) this.d;
        C0112Fo c0112FoB = w6.b(motionEvent.getX(), motionEvent.getY());
        this.r = c0112FoB != null ? (C0502as) ((Y6) w6.b).c(c0112FoB.e) : null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        W6 w6 = (W6) this.d;
        w6.getOnChartGestureListener();
        if (w6.L && ((Y6) w6.getData()).d() > 0) {
            C3510ut c3510utA = a(motionEvent.getX(), motionEvent.getY());
            float f = w6.O ? 1.4f : 1.0f;
            float f2 = w6.P ? 1.4f : 1.0f;
            float f3 = c3510utA.b;
            float f4 = c3510utA.c;
            Matrix matrix = w6.j0;
            C2832iM c2832iM = w6.x;
            c2832iM.getClass();
            matrix.reset();
            matrix.set(c2832iM.a);
            matrix.postScale(f, f2, f3, -f4);
            c2832iM.d(matrix, w6, false);
            w6.a();
            w6.postInvalidate();
            if (w6.a) {
                Log.i("BarlineChartTouch", "Double-Tap, Zooming In, x: " + c3510utA.b + ", y: " + c3510utA.c);
            }
            C3510ut.d.c(c3510utA);
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ((W6) this.d).getOnChartGestureListener();
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        ((W6) this.d).getOnChartGestureListener();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C0112Fo c0112Fo;
        AbstractC3311r9 abstractC3311r9 = this.d;
        W6 w6 = (W6) abstractC3311r9;
        w6.getOnChartGestureListener();
        if (!w6.c) {
            return false;
        }
        C0112Fo c0112FoB = w6.b(motionEvent.getX(), motionEvent.getY());
        if (c0112FoB == null || ((c0112Fo = this.b) != null && c0112FoB.e == c0112Fo.e && c0112FoB.a == c0112Fo.a)) {
            c0112FoB = null;
        }
        abstractC3311r9.c(c0112FoB);
        this.b = c0112FoB;
        return super.onSingleTapUp(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x0235 A[PHI: r7 r15
      0x0235: PHI (r7v3 float) = (r7v2 float), (r7v2 float), (r7v4 float), (r7v4 float) binds: [B:158:0x026d, B:155:0x0264, B:146:0x0231, B:147:0x0233] A[DONT_GENERATE, DONT_INLINE]
      0x0235: PHI (r15v14 float) = (r15v13 float), (r15v13 float), (r15v24 float), (r15v24 float) binds: [B:158:0x026d, B:155:0x0264, B:146:0x0231, B:147:0x0233] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0182  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 835
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.X6.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
