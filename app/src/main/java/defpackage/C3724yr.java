package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* renamed from: yr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3724yr extends AbstractC3279qd {
    public final /* synthetic */ int v;
    public final SideSheetBehavior w;

    public /* synthetic */ C3724yr(SideSheetBehavior sideSheetBehavior, int i) {
        this.v = i;
        this.w = sideSheetBehavior;
    }

    @Override // defpackage.AbstractC3279qd
    public final int A() {
        switch (this.v) {
            case 0:
                return this.w.o;
            default:
                return this.w.m;
        }
    }

    @Override // defpackage.AbstractC3279qd
    public final int B() {
        switch (this.v) {
            case 0:
                return -this.w.l;
            default:
                return y();
        }
    }

    @Override // defpackage.AbstractC3279qd
    public final int D(View view) {
        switch (this.v) {
            case 0:
                return view.getRight() + this.w.o;
            default:
                return view.getLeft() - this.w.o;
        }
    }

    @Override // defpackage.AbstractC3279qd
    public final int F(CoordinatorLayout coordinatorLayout) {
        switch (this.v) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // defpackage.AbstractC3279qd
    public final int H() {
        switch (this.v) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // defpackage.AbstractC3279qd
    public final boolean N(float f) {
        switch (this.v) {
            case 0:
                if (f > 0.0f) {
                }
                break;
            default:
                if (f < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.AbstractC3279qd
    public final boolean O(View view) {
        switch (this.v) {
            case 0:
                if (view.getRight() < (y() - z()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (y() + this.w.m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.AbstractC3279qd
    public final boolean P(float f, float f2) {
        switch (this.v) {
            case 0:
                if (Math.abs(f) > Math.abs(f2)) {
                    float fAbs = Math.abs(f);
                    this.w.getClass();
                    if (fAbs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f) > Math.abs(f2)) {
                    float fAbs2 = Math.abs(f);
                    this.w.getClass();
                    if (fAbs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // defpackage.AbstractC3279qd
    public final int d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.v) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // defpackage.AbstractC3279qd
    public final float e(int i) {
        switch (this.v) {
            case 0:
                float fZ = z();
                return (i - fZ) / (y() - fZ);
            default:
                float f = this.w.m;
                return (f - i) / (f - y());
        }
    }

    @Override // defpackage.AbstractC3279qd
    public final boolean h0(View view, float f) {
        switch (this.v) {
            case 0:
                if (Math.abs((f * this.w.k) + view.getLeft()) > 0.5f) {
                }
                break;
            default:
                if (Math.abs((f * this.w.k) + view.getRight()) > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.AbstractC3279qd
    public final void l0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.v) {
            case 0:
                if (i <= this.w.m) {
                    marginLayoutParams.leftMargin = i2;
                    break;
                }
                break;
            default:
                int i3 = this.w.m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.AbstractC3279qd
    public final int y() {
        switch (this.v) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.w;
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.w;
                return Math.max(0, (sideSheetBehavior2.m - sideSheetBehavior2.l) - sideSheetBehavior2.o);
        }
    }

    @Override // defpackage.AbstractC3279qd
    public final int z() {
        switch (this.v) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.w;
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return this.w.m;
        }
    }
}
