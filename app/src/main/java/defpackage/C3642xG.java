package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* renamed from: xG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3642xG {
    public static final C0190Kh m = new C0190Kh(1);
    public static final C0190Kh n = new C0190Kh(2);
    public static final C0190Kh o = new C0190Kh(3);
    public static final C0190Kh p = new C0190Kh(4);
    public static final C0190Kh q = new C0190Kh(5);
    public static final C0190Kh r = new C0190Kh(0);
    public final Object c;
    public final AbstractC0136He d;
    public final float g;
    public C3696yG j;
    public float k;
    public boolean l;
    public float a = 0.0f;
    public float b = Float.MAX_VALUE;
    public boolean e = false;
    public long f = 0;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();

    public C3642xG(Object obj, AbstractC0136He abstractC0136He) {
        this.c = obj;
        this.d = abstractC0136He;
        this.g = (abstractC0136He == o || abstractC0136He == p || abstractC0136He == q) ? 0.1f : abstractC0136He == r ? 0.00390625f : (abstractC0136He == m || abstractC0136He == n) ? 0.002f : 1.0f;
        this.j = null;
        this.k = Float.MAX_VALUE;
        this.l = false;
    }

    public static R1 b() {
        ThreadLocal threadLocal = R1.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new R1(new R2(5)));
        }
        return (R1) threadLocal.get();
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [P1, java.lang.Object] */
    public final void a(float f) {
        if (this.e) {
            this.k = f;
            return;
        }
        if (this.j == null) {
            this.j = new C3696yG(f);
        }
        C3696yG c3696yG = this.j;
        double d = f;
        c3696yG.i = d;
        double d2 = (float) d;
        if (d2 > Float.MAX_VALUE) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d2 < -3.4028235E38f) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.g * 0.75f);
        c3696yG.d = dAbs;
        c3696yG.e = dAbs * 62.5d;
        R2 r2 = b().e;
        r2.getClass();
        if (Thread.currentThread() != ((Looper) r2.c).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.e;
        if (z || z) {
            return;
        }
        this.e = true;
        float fU = this.d.u(this.c);
        this.b = fU;
        if (fU > Float.MAX_VALUE || fU < -3.4028235E38f) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        R1 r1B = b();
        ArrayList arrayList = r1B.b;
        if (arrayList.size() == 0) {
            R2 r22 = r1B.e;
            r22.getClass();
            ((Choreographer) r22.b).postFrameCallback(new Q1(r1B.d));
            if (Build.VERSION.SDK_INT >= 33) {
                r1B.g = ValueAnimator.getDurationScale();
                if (r1B.h == null) {
                    r1B.h = new R2(r1B, 4);
                }
                final R2 r23 = r1B.h;
                if (((P1) r23.b) == null) {
                    ?? r1 = new ValueAnimator.DurationScaleChangeListener() { // from class: P1
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f2) {
                            ((R1) r23.c).g = f2;
                        }
                    };
                    r23.b = r1;
                    ValueAnimator.registerDurationScaleChangeListener(r1);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void c(float f) {
        this.d.J(this.c, f);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i) != null) {
                Vs.u(arrayList.get(i));
                throw null;
            }
            i++;
        }
    }

    public final void d() {
        if (this.j.b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        R2 r2 = b().e;
        r2.getClass();
        if (Thread.currentThread() != ((Looper) r2.c).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.e) {
            this.l = true;
        }
    }
}
