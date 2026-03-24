package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class Ey extends AbstractC0492ai {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Ey(AbstractC3529vB abstractC3529vB, int i) {
        super(abstractC3529vB);
        this.d = i;
    }

    @Override // defpackage.AbstractC0492ai
    public final int b(View view) {
        switch (this.d) {
            case 0:
                C3583wB c3583wB = (C3583wB) view.getLayoutParams();
                ((AbstractC3529vB) this.b).getClass();
                return view.getRight() + ((C3583wB) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) c3583wB).rightMargin;
            default:
                C3583wB c3583wB2 = (C3583wB) view.getLayoutParams();
                ((AbstractC3529vB) this.b).getClass();
                return view.getBottom() + ((C3583wB) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) c3583wB2).bottomMargin;
        }
    }

    @Override // defpackage.AbstractC0492ai
    public final int c(View view) {
        switch (this.d) {
            case 0:
                C3583wB c3583wB = (C3583wB) view.getLayoutParams();
                ((AbstractC3529vB) this.b).getClass();
                return AbstractC3529vB.A(view) + ((ViewGroup.MarginLayoutParams) c3583wB).leftMargin + ((ViewGroup.MarginLayoutParams) c3583wB).rightMargin;
            default:
                C3583wB c3583wB2 = (C3583wB) view.getLayoutParams();
                ((AbstractC3529vB) this.b).getClass();
                return AbstractC3529vB.z(view) + ((ViewGroup.MarginLayoutParams) c3583wB2).topMargin + ((ViewGroup.MarginLayoutParams) c3583wB2).bottomMargin;
        }
    }

    @Override // defpackage.AbstractC0492ai
    public final int d(View view) {
        switch (this.d) {
            case 0:
                C3583wB c3583wB = (C3583wB) view.getLayoutParams();
                ((AbstractC3529vB) this.b).getClass();
                return AbstractC3529vB.z(view) + ((ViewGroup.MarginLayoutParams) c3583wB).topMargin + ((ViewGroup.MarginLayoutParams) c3583wB).bottomMargin;
            default:
                C3583wB c3583wB2 = (C3583wB) view.getLayoutParams();
                ((AbstractC3529vB) this.b).getClass();
                return AbstractC3529vB.A(view) + ((ViewGroup.MarginLayoutParams) c3583wB2).leftMargin + ((ViewGroup.MarginLayoutParams) c3583wB2).rightMargin;
        }
    }

    @Override // defpackage.AbstractC0492ai
    public final int e(View view) {
        switch (this.d) {
            case 0:
                C3583wB c3583wB = (C3583wB) view.getLayoutParams();
                ((AbstractC3529vB) this.b).getClass();
                return (view.getLeft() - ((C3583wB) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) c3583wB).leftMargin;
            default:
                C3583wB c3583wB2 = (C3583wB) view.getLayoutParams();
                ((AbstractC3529vB) this.b).getClass();
                return (view.getTop() - ((C3583wB) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) c3583wB2).topMargin;
        }
    }

    @Override // defpackage.AbstractC0492ai
    public final int f() {
        switch (this.d) {
            case 0:
                return ((AbstractC3529vB) this.b).n;
            default:
                return ((AbstractC3529vB) this.b).o;
        }
    }

    @Override // defpackage.AbstractC0492ai
    public final int g() {
        switch (this.d) {
            case 0:
                AbstractC3529vB abstractC3529vB = (AbstractC3529vB) this.b;
                return abstractC3529vB.n - abstractC3529vB.F();
            default:
                AbstractC3529vB abstractC3529vB2 = (AbstractC3529vB) this.b;
                return abstractC3529vB2.o - abstractC3529vB2.D();
        }
    }

    @Override // defpackage.AbstractC0492ai
    public final int h() {
        switch (this.d) {
            case 0:
                return ((AbstractC3529vB) this.b).F();
            default:
                return ((AbstractC3529vB) this.b).D();
        }
    }

    @Override // defpackage.AbstractC0492ai
    public final int i() {
        switch (this.d) {
            case 0:
                return ((AbstractC3529vB) this.b).l;
            default:
                return ((AbstractC3529vB) this.b).m;
        }
    }

    @Override // defpackage.AbstractC0492ai
    public final int j() {
        switch (this.d) {
            case 0:
                return ((AbstractC3529vB) this.b).m;
            default:
                return ((AbstractC3529vB) this.b).l;
        }
    }

    @Override // defpackage.AbstractC0492ai
    public final int k() {
        switch (this.d) {
            case 0:
                return ((AbstractC3529vB) this.b).E();
            default:
                return ((AbstractC3529vB) this.b).G();
        }
    }

    @Override // defpackage.AbstractC0492ai
    public final int l() {
        switch (this.d) {
            case 0:
                AbstractC3529vB abstractC3529vB = (AbstractC3529vB) this.b;
                return (abstractC3529vB.n - abstractC3529vB.E()) - abstractC3529vB.F();
            default:
                AbstractC3529vB abstractC3529vB2 = (AbstractC3529vB) this.b;
                return (abstractC3529vB2.o - abstractC3529vB2.G()) - abstractC3529vB2.D();
        }
    }

    @Override // defpackage.AbstractC0492ai
    public final int n(View view) {
        switch (this.d) {
            case 0:
                AbstractC3529vB abstractC3529vB = (AbstractC3529vB) this.b;
                Rect rect = (Rect) this.c;
                abstractC3529vB.K(view, rect);
                return rect.right;
            default:
                AbstractC3529vB abstractC3529vB2 = (AbstractC3529vB) this.b;
                Rect rect2 = (Rect) this.c;
                abstractC3529vB2.K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // defpackage.AbstractC0492ai
    public final int o(View view) {
        switch (this.d) {
            case 0:
                AbstractC3529vB abstractC3529vB = (AbstractC3529vB) this.b;
                Rect rect = (Rect) this.c;
                abstractC3529vB.K(view, rect);
                return rect.left;
            default:
                AbstractC3529vB abstractC3529vB2 = (AbstractC3529vB) this.b;
                Rect rect2 = (Rect) this.c;
                abstractC3529vB2.K(view, rect2);
                return rect2.top;
        }
    }

    @Override // defpackage.AbstractC0492ai
    public final void p(int i) {
        switch (this.d) {
            case 0:
                ((AbstractC3529vB) this.b).O(i);
                break;
            default:
                ((AbstractC3529vB) this.b).P(i);
                break;
        }
    }
}
