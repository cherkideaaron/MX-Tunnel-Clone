package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: wB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3583wB extends ViewGroup.MarginLayoutParams {
    public JB a;
    public final Rect b;
    public boolean c;
    public boolean d;

    public C3583wB(int i, int i2) {
        super(i, i2);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public C3583wB(C3583wB c3583wB) {
        super((ViewGroup.LayoutParams) c3583wB);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public C3583wB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public C3583wB(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public C3583wB(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }
}
