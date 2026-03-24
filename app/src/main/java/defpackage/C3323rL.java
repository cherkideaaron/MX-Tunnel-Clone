package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* renamed from: rL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3323rL extends AbstractC3377sL {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public final int k;
    public String l;

    public C3323rL() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.l = null;
    }

    @Override // defpackage.AbstractC3377sL
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC3377sL) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.AbstractC3377sL
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return zB;
            }
            zB |= ((AbstractC3377sL) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.l;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3323rL(C3323rL c3323rL, Z3 z3) {
        C3214pL c3214pL;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.l = null;
        this.c = c3323rL.c;
        this.d = c3323rL.d;
        this.e = c3323rL.e;
        this.f = c3323rL.f;
        this.g = c3323rL.g;
        this.h = c3323rL.h;
        this.i = c3323rL.i;
        String str = c3323rL.l;
        this.l = str;
        this.k = c3323rL.k;
        if (str != null) {
            z3.put(str, this);
        }
        matrix.set(c3323rL.j);
        ArrayList arrayList = c3323rL.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C3323rL) {
                this.b.add(new C3323rL((C3323rL) obj, z3));
            } else {
                if (obj instanceof C3269qL) {
                    C3269qL c3269qL = (C3269qL) obj;
                    C3269qL c3269qL2 = new C3269qL(c3269qL);
                    c3269qL2.f = 0.0f;
                    c3269qL2.h = 1.0f;
                    c3269qL2.i = 1.0f;
                    c3269qL2.j = 0.0f;
                    c3269qL2.k = 1.0f;
                    c3269qL2.l = 0.0f;
                    c3269qL2.m = Paint.Cap.BUTT;
                    c3269qL2.n = Paint.Join.MITER;
                    c3269qL2.o = 4.0f;
                    c3269qL2.e = c3269qL.e;
                    c3269qL2.f = c3269qL.f;
                    c3269qL2.h = c3269qL.h;
                    c3269qL2.g = c3269qL.g;
                    c3269qL2.c = c3269qL.c;
                    c3269qL2.i = c3269qL.i;
                    c3269qL2.j = c3269qL.j;
                    c3269qL2.k = c3269qL.k;
                    c3269qL2.l = c3269qL.l;
                    c3269qL2.m = c3269qL.m;
                    c3269qL2.n = c3269qL.n;
                    c3269qL2.o = c3269qL.o;
                    c3214pL = c3269qL2;
                } else {
                    if (!(obj instanceof C3214pL)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    c3214pL = new C3214pL((C3214pL) obj);
                }
                this.b.add(c3214pL);
                Object obj2 = c3214pL.b;
                if (obj2 != null) {
                    z3.put(obj2, c3214pL);
                }
            }
        }
    }
}
