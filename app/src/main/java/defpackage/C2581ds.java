package defpackage;

import android.view.View;

/* renamed from: ds, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2581ds {
    public AbstractC0492ai a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public C2581ds() {
        d();
    }

    public final void a() {
        this.c = this.d ? this.a.g() : this.a.k();
    }

    public final void b(View view, int i) {
        if (this.d) {
            this.c = this.a.m() + this.a.b(view);
        } else {
            this.c = this.a.e(view);
        }
        this.b = i;
    }

    public final void c(View view, int i) {
        int iMin;
        int iM = this.a.m();
        if (iM >= 0) {
            b(view, i);
            return;
        }
        this.b = i;
        if (this.d) {
            int iG = (this.a.g() - iM) - this.a.b(view);
            this.c = this.a.g() - iG;
            if (iG <= 0) {
                return;
            }
            int iC = this.c - this.a.c(view);
            int iK = this.a.k();
            int iMin2 = iC - (Math.min(this.a.e(view) - iK, 0) + iK);
            if (iMin2 >= 0) {
                return;
            }
            iMin = Math.min(iG, -iMin2) + this.c;
        } else {
            int iE = this.a.e(view);
            int iK2 = iE - this.a.k();
            this.c = iE;
            if (iK2 <= 0) {
                return;
            }
            int iG2 = (this.a.g() - Math.min(0, (this.a.g() - iM) - this.a.b(view))) - (this.a.c(view) + iE);
            if (iG2 >= 0) {
                return;
            } else {
                iMin = this.c - Math.min(iK2, -iG2);
            }
        }
        this.c = iMin;
    }

    public final void d() {
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
    }
}
