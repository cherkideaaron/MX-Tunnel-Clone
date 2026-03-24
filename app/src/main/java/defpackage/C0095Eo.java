package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* renamed from: Eo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0095Eo extends AbstractC0500aq {
    public final /* synthetic */ int k;

    @Override // defpackage.AbstractC0500aq
    public final int I(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.k) {
            case 0:
                return view.getMeasuredHeight() + marginLayoutParams.bottomMargin;
            case 1:
                return view.getMeasuredWidth() + marginLayoutParams.leftMargin;
            default:
                return view.getMeasuredWidth() + marginLayoutParams.rightMargin;
        }
    }

    @Override // defpackage.AbstractC0500aq
    public final int K() {
        switch (this.k) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return 0;
        }
    }

    @Override // defpackage.AbstractC0500aq
    public final ViewPropertyAnimator L(View view, int i) {
        switch (this.k) {
            case 0:
                return view.animate().translationY(i);
            case 1:
                return view.animate().translationX(-i);
            default:
                return view.animate().translationX(i);
        }
    }
}
