package rased.vpn.app.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.mxtunnel.pro.R;
import defpackage.H3;
import defpackage.K2;
import defpackage.SA;

/* loaded from: classes2.dex */
public class MaterialEditText extends K2 {
    public boolean m;
    public Drawable n;
    public final boolean o;
    public int p;
    public int q;
    public int r;
    public int s;

    public MaterialEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.m = false;
        this.o = true;
        this.p = 0;
        this.s = 40;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, SA.b);
            this.q = typedArrayObtainStyledAttributes.getResourceId(2, R.drawable.ic_visibility_grey_900_24dp);
            this.r = typedArrayObtainStyledAttributes.getResourceId(1, R.drawable.ic_visibility_off_grey_900_24dp);
            this.p = typedArrayObtainStyledAttributes.getColor(3, 0);
            this.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 40);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.q = R.drawable.ic_visibility_grey_900_24dp;
            this.r = R.drawable.ic_visibility_off_grey_900_24dp;
        }
        this.o = getResources().getConfiguration().getLayoutDirection() != 1;
        setMaxLines(1);
        setSingleLine(true);
        this.m = false;
        setTransformationMethod(PasswordTransformationMethod.getInstance());
        setSaveEnabled(true);
        if (!TextUtils.isEmpty(getText())) {
            c(true);
        }
        addTextChangedListener(new H3(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[PHI: r1
      0x0037: PHI (r1v7 android.graphics.drawable.Drawable) = (r1v5 android.graphics.drawable.Drawable), (r1v8 android.graphics.drawable.Drawable) binds: [B:21:0x0042, B:15:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(boolean r6) {
        /*
            r5 = this;
            android.graphics.drawable.Drawable[] r0 = r5.getCompoundDrawables()
            r1 = 0
            r1 = r0[r1]
            r2 = 1
            r2 = r0[r2]
            r3 = 2
            r3 = r0[r3]
            r4 = 3
            r0 = r0[r4]
            if (r6 == 0) goto L45
            boolean r6 = r5.m
            if (r6 == 0) goto L21
            android.content.Context r6 = r5.getContext()
            int r4 = r5.r
        L1c:
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r4)
            goto L28
        L21:
            android.content.Context r6 = r5.getContext()
            int r4 = r5.q
            goto L1c
        L28:
            r6.mutate()
            int r4 = r5.p
            if (r4 != 0) goto L39
            boolean r4 = r5.o
            if (r4 == 0) goto L34
            goto L35
        L34:
            r1 = r6
        L35:
            if (r4 == 0) goto L4f
        L37:
            r3 = r6
            goto L4f
        L39:
            r6.setTint(r4)
            boolean r4 = r5.o
            if (r4 == 0) goto L41
            goto L42
        L41:
            r1 = r6
        L42:
            if (r4 == 0) goto L4f
            goto L37
        L45:
            boolean r6 = r5.o
            r4 = 0
            if (r6 == 0) goto L4b
            goto L4c
        L4b:
            r1 = r4
        L4c:
            if (r6 == 0) goto L4f
            r3 = r4
        L4f:
            r5.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rased.vpn.app.view.MaterialEditText.c(boolean):void");
    }

    public final void finalize() throws Throwable {
        this.n = null;
        super.finalize();
    }

    public int getAdditionalTouchTargetSizePixels() {
        return this.s;
    }

    public int getVisibilityIndicatorHide() {
        return this.r;
    }

    public int getVisibilityIndicatorShow() {
        return this.q;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            boolean z = bundle.getBoolean("IS_SHOWING_PASSWORD_STATE_KEY", false);
            this.m = z;
            if (z) {
                setTransformationMethod(null);
            }
            parcelable = bundle.getParcelable("SUPER_STATE_KEY");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("SUPER_STATE_KEY", super.onSaveInstanceState());
        bundle.putBoolean("IS_SHOWING_PASSWORD_STATE_KEY", this.m);
        return bundle;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 1 && (drawable = this.n) != null) {
            Rect bounds = drawable.getBounds();
            int x = (int) motionEvent.getX();
            int iWidth = bounds.width() + (this.o ? getPaddingRight() : getPaddingLeft()) + this.s;
            if ((this.o && x >= getRight() - iWidth) || (!this.o && x <= getLeft() + iWidth)) {
                int selectionStart = getSelectionStart();
                int selectionEnd = getSelectionEnd();
                if (this.m) {
                    setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    setTransformationMethod(null);
                }
                setSelection(selectionStart, selectionEnd);
                this.m = !this.m;
                c(true);
                motionEvent.setAction(3);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAdditionalTouchTargetSizePixels(int i) {
        this.s = i;
    }

    @Override // defpackage.K2, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        boolean z = this.o;
        if (z && drawable3 != null) {
            this.n = drawable3;
        } else if (!z && drawable != null) {
            this.n = drawable;
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    public void setTintColor(int i) {
        this.p = i;
    }

    public void setVisibilityIndicatorHide(int i) {
        this.r = i;
    }

    public void setVisibilityIndicatorShow(int i) {
        this.q = i;
    }
}
