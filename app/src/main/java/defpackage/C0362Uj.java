package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: Uj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0362Uj extends AbstractC3421tB {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final RunnableC2705g5 B;
    public final int a;
    public final int b;
    public final StateListDrawable c;
    public final Drawable d;
    public final int e;
    public final int f;
    public final StateListDrawable g;
    public final Drawable h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public int o;
    public float p;
    public final RecyclerView s;
    public final ValueAnimator z;
    public int q = 0;
    public int r = 0;
    public boolean t = false;
    public boolean u = false;
    public int v = 0;
    public int w = 0;
    public final int[] x = new int[2];
    public final int[] y = new int[2];

    public C0362Uj(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.z = valueAnimatorOfFloat;
        this.A = 0;
        RunnableC2705g5 runnableC2705g5 = new RunnableC2705g5(this, 10);
        this.B = runnableC2705g5;
        C0328Sj c0328Sj = new C0328Sj(this);
        this.c = stateListDrawable;
        this.d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C0345Tj(this));
        valueAnimatorOfFloat.addUpdateListener(new G7(this, true ? 1 : 0));
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            AbstractC3529vB abstractC3529vB = recyclerView2.r;
            if (abstractC3529vB != null) {
                abstractC3529vB.c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.t;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.N();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.s;
            recyclerView3.u.remove(this);
            if (recyclerView3.v == this) {
                recyclerView3.v = null;
            }
            ArrayList arrayList2 = this.s.l0;
            if (arrayList2 != null) {
                arrayList2.remove(c0328Sj);
            }
            this.s.removeCallbacks(runnableC2705g5);
        }
        this.s = recyclerView;
        if (recyclerView != null) {
            recyclerView.g(this);
            this.s.u.add(this);
            this.s.h(c0328Sj);
        }
    }

    public static int e(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    @Override // defpackage.AbstractC3421tB
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2 = this.q;
        RecyclerView recyclerView2 = this.s;
        if (i2 != recyclerView2.getWidth() || this.r != recyclerView2.getHeight()) {
            this.q = recyclerView2.getWidth();
            this.r = recyclerView2.getHeight();
            f(0);
            return;
        }
        if (this.A != 0) {
            if (this.t) {
                int i3 = this.q;
                int i4 = this.e;
                int i5 = i3 - i4;
                int i6 = this.l;
                int i7 = this.k;
                int i8 = i6 - (i7 / 2);
                StateListDrawable stateListDrawable = this.c;
                stateListDrawable.setBounds(0, 0, i4, i7);
                int i9 = this.r;
                int i10 = this.f;
                Drawable drawable = this.d;
                drawable.setBounds(0, 0, i10, i9);
                WeakHashMap weakHashMap = UL.a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i4, i8);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    i = -i4;
                } else {
                    canvas.translate(i5, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i8);
                    stateListDrawable.draw(canvas);
                    i = -i5;
                }
                canvas.translate(i, -i8);
            }
            if (this.u) {
                int i11 = this.r;
                int i12 = this.i;
                int i13 = i11 - i12;
                int i14 = this.o;
                int i15 = this.n;
                int i16 = i14 - (i15 / 2);
                StateListDrawable stateListDrawable2 = this.g;
                stateListDrawable2.setBounds(0, 0, i15, i12);
                int i17 = this.q;
                int i18 = this.j;
                Drawable drawable2 = this.h;
                drawable2.setBounds(0, 0, i17, i18);
                canvas.translate(0.0f, i13);
                drawable2.draw(canvas);
                canvas.translate(i16, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i16, -i13);
            }
        }
    }

    public final boolean c(float f, float f2) {
        if (f2 >= this.r - this.i) {
            int i = this.o;
            int i2 = this.n;
            if (f >= i - (i2 / 2) && f <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(float f, float f2) {
        RecyclerView recyclerView = this.s;
        WeakHashMap weakHashMap = UL.a;
        boolean z = recyclerView.getLayoutDirection() == 1;
        int i = this.e;
        if (z) {
            if (f > i) {
                return false;
            }
        } else if (f < this.q - i) {
            return false;
        }
        int i2 = this.l;
        int i3 = this.k / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    public final void f(int i) {
        RecyclerView recyclerView;
        int i2;
        RunnableC2705g5 runnableC2705g5 = this.B;
        StateListDrawable stateListDrawable = this.c;
        if (i == 2 && this.v != 2) {
            stateListDrawable.setState(C);
            this.s.removeCallbacks(runnableC2705g5);
        }
        if (i == 0) {
            this.s.invalidate();
        } else {
            g();
        }
        if (this.v != 2 || i == 2) {
            if (i == 1) {
                this.s.removeCallbacks(runnableC2705g5);
                recyclerView = this.s;
                i2 = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
            }
            this.v = i;
        }
        stateListDrawable.setState(D);
        this.s.removeCallbacks(runnableC2705g5);
        recyclerView = this.s;
        i2 = 1200;
        recyclerView.postDelayed(runnableC2705g5, i2);
        this.v = i;
    }

    public final void g() {
        int i = this.A;
        ValueAnimator valueAnimator = this.z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
