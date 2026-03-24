package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.mxtunnel.pro.R;

/* loaded from: classes2.dex */
public final class Z9 extends AbstractC0276Pi {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final V9 j;
    public final W9 k;
    public AnimatorSet l;
    public ValueAnimator m;

    public Z9(C0259Oi c0259Oi) {
        super(c0259Oi);
        this.j = new V9(this, 0);
        this.k = new W9(this, 0);
        this.e = AbstractC0069Df.U(c0259Oi.getContext(), R.attr.motionDurationShort3, 100);
        this.f = AbstractC0069Df.U(c0259Oi.getContext(), R.attr.motionDurationShort3, 150);
        this.g = AbstractC0069Df.V(c0259Oi.getContext(), R.attr.motionEasingLinearInterpolator, S1.a);
        this.h = AbstractC0069Df.V(c0259Oi.getContext(), R.attr.motionEasingEmphasizedInterpolator, S1.d);
    }

    @Override // defpackage.AbstractC0276Pi
    public final void a() {
        if (this.b.v != null) {
            return;
        }
        t(u());
    }

    @Override // defpackage.AbstractC0276Pi
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // defpackage.AbstractC0276Pi
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // defpackage.AbstractC0276Pi
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // defpackage.AbstractC0276Pi
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // defpackage.AbstractC0276Pi
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // defpackage.AbstractC0276Pi
    public final void m(EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(u());
    }

    @Override // defpackage.AbstractC0276Pi
    public final void p(boolean z) {
        if (this.b.v == null) {
            return;
        }
        t(z);
    }

    @Override // defpackage.AbstractC0276Pi
    public final void r() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.h);
        valueAnimatorOfFloat.setDuration(this.f);
        valueAnimatorOfFloat.addUpdateListener(new X9(this, 1));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i = this.e;
        valueAnimatorOfFloat2.setDuration(i);
        valueAnimatorOfFloat2.addUpdateListener(new X9(this, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.l.addListener(new Y9(this, 0));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i);
        valueAnimatorOfFloat3.addUpdateListener(new X9(this, 0));
        this.m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new Y9(this, 1));
    }

    @Override // defpackage.AbstractC0276Pi
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new H0(this, 3));
        }
    }

    public final void t(boolean z) {
        boolean z2 = this.b.d() == z;
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.l.cancel();
        this.m.start();
        if (z2) {
            this.m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        return editText != null && (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
    }
}
