package defpackage;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class IB implements Runnable {
    public int a;
    public int b;
    public OverScroller c;
    public Interpolator d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ RecyclerView m;

    public IB(RecyclerView recyclerView) {
        this.m = recyclerView;
        InterpolatorC3039mB interpolatorC3039mB = RecyclerView.E0;
        this.d = interpolatorC3039mB;
        this.e = false;
        this.f = false;
        this.c = new OverScroller(recyclerView.getContext(), interpolatorC3039mB);
    }

    public final void a() {
        if (this.e) {
            this.f = true;
            return;
        }
        RecyclerView recyclerView = this.m;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = UL.a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.m;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.E0;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.b = 0;
        this.a = 0;
        recyclerView.setScrollState(2);
        this.c.startScroll(0, 0, i, i2, i4);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.m;
        if (recyclerView.r == null) {
            recyclerView.removeCallbacks(this);
            this.c.abortAnimation();
            return;
        }
        this.f = false;
        this.e = true;
        recyclerView.m();
        OverScroller overScroller = this.c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.a;
            int i6 = currY - this.b;
            this.a = currX;
            this.b = currY;
            int[] iArr = recyclerView.v0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean zR = recyclerView.r(i5, i6, 1, iArr, null);
            int[] iArr2 = recyclerView.v0;
            if (zR) {
                i5 -= iArr2[0];
                i6 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(i5, i6);
            }
            if (recyclerView.q != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.Z(iArr2, i5, i6);
                int i7 = iArr2[0];
                int i8 = iArr2[1];
                int i9 = i5 - i7;
                int i10 = i6 - i8;
                C2801hs c2801hs = recyclerView.r.e;
                if (c2801hs != null && !c2801hs.d && c2801hs.e) {
                    int iB = recyclerView.j0.b();
                    if (iB == 0) {
                        c2801hs.i();
                    } else {
                        if (c2801hs.a >= iB) {
                            c2801hs.a = iB - 1;
                        }
                        c2801hs.g(i7, i8);
                    }
                }
                i4 = i7;
                i = i9;
                i2 = i10;
                i3 = i8;
            } else {
                i = i5;
                i2 = i6;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.t.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.v0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i11 = i3;
            recyclerView.s(i4, i3, i, i2, null, 1, iArr3);
            int i12 = i - iArr2[0];
            int i13 = i2 - iArr2[1];
            if (i4 != 0 || i11 != 0) {
                recyclerView.t(i4, i11);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
            C2801hs c2801hs2 = recyclerView.r.e;
            if ((c2801hs2 == null || !c2801hs2.d) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i14 = i12 < 0 ? -currVelocity : i12 > 0 ? currVelocity : 0;
                    if (i13 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i13 <= 0) {
                        currVelocity = 0;
                    }
                    if (i14 < 0) {
                        recyclerView.v();
                        if (recyclerView.K.isFinished()) {
                            recyclerView.K.onAbsorb(-i14);
                        }
                    } else if (i14 > 0) {
                        recyclerView.w();
                        if (recyclerView.M.isFinished()) {
                            recyclerView.M.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.x();
                        if (recyclerView.L.isFinished()) {
                            recyclerView.L.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.u();
                        if (recyclerView.N.isFinished()) {
                            recyclerView.N.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = UL.a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                C0463a7 c0463a7 = recyclerView.i0;
                int[] iArr4 = (int[]) c0463a7.d;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                c0463a7.c = 0;
            } else {
                a();
                RunnableC0162In runnableC0162In = recyclerView.h0;
                if (runnableC0162In != null) {
                    runnableC0162In.a(recyclerView, i4, i11);
                }
            }
        }
        C2801hs c2801hs3 = recyclerView.r.e;
        if (c2801hs3 != null && c2801hs3.d) {
            c2801hs3.g(0, 0);
        }
        this.e = false;
        if (!this.f) {
            recyclerView.setScrollState(0);
            recyclerView.e0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = UL.a;
            recyclerView.postOnAnimation(this);
        }
    }
}
