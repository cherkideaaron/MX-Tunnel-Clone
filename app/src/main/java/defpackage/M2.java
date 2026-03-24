package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class M2 extends ImageButton {
    public final C2702g2 a;
    public final N2 b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC2555dJ.a(context);
        this.c = false;
        PI.a(this, getContext());
        C2702g2 c2702g2 = new C2702g2(this);
        this.a = c2702g2;
        c2702g2.t(attributeSet, i);
        N2 n2 = new N2(this);
        this.b = n2;
        n2.g(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2702g2 c2702g2 = this.a;
        if (c2702g2 != null) {
            c2702g2.a();
        }
        N2 n2 = this.b;
        if (n2 != null) {
            n2.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2702g2 c2702g2 = this.a;
        if (c2702g2 != null) {
            return c2702g2.r();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2702g2 c2702g2 = this.a;
        if (c2702g2 != null) {
            return c2702g2.s();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C2609eJ c2609eJ;
        N2 n2 = this.b;
        if (n2 == null || (c2609eJ = (C2609eJ) n2.d) == null) {
            return null;
        }
        return c2609eJ.a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C2609eJ c2609eJ;
        N2 n2 = this.b;
        if (n2 == null || (c2609eJ = (C2609eJ) n2.d) == null) {
            return null;
        }
        return c2609eJ.b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return ((((ImageView) this.b.c).getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2702g2 c2702g2 = this.a;
        if (c2702g2 != null) {
            c2702g2.u();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2702g2 c2702g2 = this.a;
        if (c2702g2 != null) {
            c2702g2.v(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        N2 n2 = this.b;
        if (n2 != null) {
            n2.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        N2 n2 = this.b;
        if (n2 != null && drawable != null && !this.c) {
            n2.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (n2 != null) {
            n2.a();
            if (this.c) {
                return;
            }
            ImageView imageView = (ImageView) n2.c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(n2.b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        Drawable drawableF;
        N2 n2 = this.b;
        ImageView imageView = (ImageView) n2.c;
        if (i != 0) {
            drawableF = AbstractC0500aq.F(imageView.getContext(), i);
            if (drawableF != null) {
                AbstractC3228ph.a(drawableF);
            }
        } else {
            drawableF = null;
        }
        imageView.setImageDrawable(drawableF);
        n2.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        N2 n2 = this.b;
        if (n2 != null) {
            n2.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2702g2 c2702g2 = this.a;
        if (c2702g2 != null) {
            c2702g2.x(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2702g2 c2702g2 = this.a;
        if (c2702g2 != null) {
            c2702g2.y(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        N2 n2 = this.b;
        if (n2 != null) {
            if (((C2609eJ) n2.d) == null) {
                n2.d = new C2609eJ();
            }
            C2609eJ c2609eJ = (C2609eJ) n2.d;
            c2609eJ.a = colorStateList;
            c2609eJ.d = true;
            n2.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        N2 n2 = this.b;
        if (n2 != null) {
            if (((C2609eJ) n2.d) == null) {
                n2.d = new C2609eJ();
            }
            C2609eJ c2609eJ = (C2609eJ) n2.d;
            c2609eJ.b = mode;
            c2609eJ.c = true;
            n2.a();
        }
    }
}
