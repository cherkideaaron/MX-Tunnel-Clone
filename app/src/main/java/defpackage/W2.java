package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.mxtunnel.pro.R;

/* loaded from: classes.dex */
public final class W2 extends R2 {
    public final SeekBar p;
    public Drawable q;
    public ColorStateList r;
    public PorterDuff.Mode s;
    public boolean t;
    public boolean u;

    public W2(SeekBar seekBar) {
        super(seekBar);
        this.r = null;
        this.s = null;
        this.t = false;
        this.u = false;
        this.p = seekBar;
    }

    public final void H() {
        Drawable drawable = this.q;
        if (drawable != null) {
            if (this.t || this.u) {
                Drawable drawableMutate = drawable.mutate();
                this.q = drawableMutate;
                if (this.t) {
                    drawableMutate.setTintList(this.r);
                }
                if (this.u) {
                    this.q.setTintMode(this.s);
                }
                if (this.q.isStateful()) {
                    this.q.setState(this.p.getDrawableState());
                }
            }
        }
    }

    public final void I(Canvas canvas) {
        if (this.q != null) {
            int max = this.p.getMax();
            if (max > 1) {
                int intrinsicWidth = this.q.getIntrinsicWidth();
                int intrinsicHeight = this.q.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.q.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.q.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // defpackage.R2
    public final void u(AttributeSet attributeSet, int i) {
        super.u(attributeSet, R.attr.seekBarStyle);
        SeekBar seekBar = this.p;
        Context context = seekBar.getContext();
        int[] iArr = AbstractC2547dB.g;
        D3 d3L = D3.L(R.attr.seekBarStyle, 0, context, attributeSet, iArr);
        UL.k(seekBar, seekBar.getContext(), iArr, attributeSet, (TypedArray) d3L.b, R.attr.seekBarStyle);
        Drawable drawableY = d3L.y(0);
        if (drawableY != null) {
            seekBar.setThumb(drawableY);
        }
        Drawable drawableX = d3L.x(1);
        Drawable drawable = this.q;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.q = drawableX;
        if (drawableX != null) {
            drawableX.setCallback(seekBar);
            drawableX.setLayoutDirection(seekBar.getLayoutDirection());
            if (drawableX.isStateful()) {
                drawableX.setState(seekBar.getDrawableState());
            }
            H();
        }
        seekBar.invalidate();
        TypedArray typedArray = (TypedArray) d3L.b;
        if (typedArray.hasValue(3)) {
            this.s = AbstractC3228ph.c(typedArray.getInt(3, -1), this.s);
            this.u = true;
        }
        if (typedArray.hasValue(2)) {
            this.r = d3L.w(2);
            this.t = true;
        }
        d3L.P();
        H();
    }
}
