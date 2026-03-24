package com.github.ybq.android.spinkit;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.mxtunnel.pro.R;
import defpackage.AbstractC0576cB;
import defpackage.AbstractC3264qG;
import defpackage.BG;
import defpackage.C0543be;
import defpackage.C3635x9;
import defpackage.C3689y9;
import defpackage.HA;
import defpackage.L9;

/* loaded from: classes.dex */
public class SpinKitView extends ProgressBar {
    public int a;
    public BG b;

    public SpinKitView(Context context, AttributeSet attributeSet) {
        BG c0543be;
        super(context, attributeSet, R.attr.SpinKitViewStyle, R.style.SpinKitView);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0576cB.a, R.attr.SpinKitViewStyle, R.style.SpinKitView);
        int i = AbstractC3264qG.F(15)[typedArrayObtainStyledAttributes.getInt(1, 0)];
        this.a = typedArrayObtainStyledAttributes.getColor(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        switch (AbstractC3264qG.A(i)) {
            case 0:
                c0543be = new C0543be(2);
                break;
            case 1:
                c0543be = new C3689y9(2);
                break;
            case 2:
                c0543be = new C3689y9(8);
                break;
            case 3:
                c0543be = new C3689y9(7);
                break;
            case 4:
                c0543be = new C3635x9(4);
                break;
            case 5:
                c0543be = new C3689y9(0);
                break;
            case 6:
                c0543be = new C3689y9(6);
                break;
            case 7:
                c0543be = new L9(0);
                break;
            case 8:
                c0543be = new C3689y9(1);
                break;
            case 9:
                c0543be = new L9(1);
                break;
            case 10:
                c0543be = new C3689y9(3);
                break;
            case 11:
                c0543be = new C3635x9(5, false);
                break;
            case 12:
                c0543be = new C3689y9(4);
                break;
            case 13:
                c0543be = new HA();
                break;
            case 14:
                c0543be = new C3689y9(5);
                break;
            default:
                c0543be = null;
                break;
        }
        c0543be.e(this.a);
        setIndeterminateDrawable(c0543be);
        setIndeterminate(true);
    }

    @Override // android.widget.ProgressBar
    public BG getIndeterminateDrawable() {
        return this.b;
    }

    @Override // android.view.View
    public final void onScreenStateChanged(int i) {
        BG bg;
        super.onScreenStateChanged(i);
        if (i != 0 || (bg = this.b) == null) {
            return;
        }
        bg.stop();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.b != null && getVisibility() == 0) {
            this.b.start();
        }
    }

    public void setColor(int i) {
        this.a = i;
        BG bg = this.b;
        if (bg != null) {
            bg.e(i);
        }
        invalidate();
    }

    public void setIndeterminateDrawable(BG bg) {
        super.setIndeterminateDrawable((Drawable) bg);
        this.b = bg;
        if (bg.c() == 0) {
            this.b.e(this.a);
        }
        onSizeChanged(getWidth(), getHeight(), getWidth(), getHeight());
        if (getVisibility() == 0) {
            this.b.start();
        }
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        if (drawable instanceof BG) {
            ((BG) drawable).stop();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (!(drawable instanceof BG)) {
            throw new IllegalArgumentException("this d must be instanceof Sprite");
        }
        setIndeterminateDrawable((BG) drawable);
    }
}
