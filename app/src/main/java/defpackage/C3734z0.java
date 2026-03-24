package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.mxtunnel.pro.R;

/* renamed from: z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3734z0 extends O2 implements B0 {
    public final /* synthetic */ A0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3734z0(A0 a0, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.d = a0;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        MO.I(this, getContentDescription());
        setOnTouchListener(new C3464u0(this, this));
    }

    @Override // defpackage.B0
    public final boolean a() {
        return false;
    }

    @Override // defpackage.B0
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.d.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
