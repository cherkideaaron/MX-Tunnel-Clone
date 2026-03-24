package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import defpackage.C3090n7;
import defpackage.C3743z9;
import defpackage.M2;
import defpackage.UL;

/* loaded from: classes2.dex */
public class CheckableImageButton extends M2 implements Checkable {
    public static final int[] m = {R.attr.state_checked};
    public boolean d;
    public boolean e;
    public boolean f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.mxtunnel.pro.R.attr.imageButtonStyle);
        this.e = true;
        this.f = true;
        UL.l(this, new C3090n7(this, 1));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.d ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), m) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C3743z9)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C3743z9 c3743z9 = (C3743z9) parcelable;
        super.onRestoreInstanceState(c3743z9.a);
        setChecked(c3743z9.c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C3743z9 c3743z9 = new C3743z9(super.onSaveInstanceState());
        c3743z9.c = this.d;
        return c3743z9;
    }

    public void setCheckable(boolean z) {
        if (this.e != z) {
            this.e = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.e || this.d == z) {
            return;
        }
        this.d = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.d);
    }
}
