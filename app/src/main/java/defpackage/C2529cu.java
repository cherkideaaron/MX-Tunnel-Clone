package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: cu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2529cu extends Drawable.ConstantState {
    public C2878jF a;
    public C0473aH b;
    public C0411Xh c;
    public ColorStateList d;
    public ColorStateList e;
    public final ColorStateList f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public Rect i;
    public final float j;
    public float k;
    public float l;
    public int m;
    public float n;
    public float o;
    public final float p;
    public final int q;
    public int r;
    public int s;
    public final int t;
    public final boolean u;
    public final Paint.Style v;

    public C2529cu(C2529cu c2529cu) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = PorterDuff.Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = 255;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = Paint.Style.FILL_AND_STROKE;
        this.a = c2529cu.a;
        this.b = c2529cu.b;
        this.c = c2529cu.c;
        this.l = c2529cu.l;
        this.d = c2529cu.d;
        this.e = c2529cu.e;
        this.h = c2529cu.h;
        this.g = c2529cu.g;
        this.m = c2529cu.m;
        this.j = c2529cu.j;
        this.s = c2529cu.s;
        this.q = c2529cu.q;
        this.u = c2529cu.u;
        this.k = c2529cu.k;
        this.n = c2529cu.n;
        this.o = c2529cu.o;
        this.p = c2529cu.p;
        this.r = c2529cu.r;
        this.t = c2529cu.t;
        this.f = c2529cu.f;
        this.v = c2529cu.v;
        if (c2529cu.i != null) {
            this.i = new Rect(c2529cu.i);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C2638eu c2638eu = new C2638eu(this);
        c2638eu.f = true;
        c2638eu.m = true;
        return c2638eu;
    }

    public C2529cu(C2878jF c2878jF) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = PorterDuff.Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = 255;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = Paint.Style.FILL_AND_STROKE;
        this.a = c2878jF;
        this.c = null;
    }
}
