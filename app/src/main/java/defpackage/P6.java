package defpackage;

import android.graphics.DashPathEffect;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class P6 extends AbstractC2674fb {
    public C0120Gf g;
    public int j;
    public int k;
    public final ArrayList r;
    public int h = -7829368;
    public float[] i = new float[0];
    public int l = 6;
    public boolean m = false;
    public boolean n = true;
    public boolean o = true;
    public boolean p = true;
    public DashPathEffect q = null;
    public boolean s = false;
    public boolean t = false;
    public boolean u = false;
    public float v = 0.0f;
    public float w = 0.0f;
    public float x = 0.0f;

    public P6() {
        this.e = AbstractC2831iL.c(10.0f);
        this.b = AbstractC2831iL.c(5.0f);
        this.c = AbstractC2831iL.c(5.0f);
        this.r = new ArrayList();
    }

    public void b(float f, float f2) {
        float f3 = this.t ? this.w : f - 0.0f;
        float f4 = this.u ? this.v : f2 + 0.0f;
        if (Math.abs(f4 - f3) == 0.0f) {
            f4 += 1.0f;
            f3 -= 1.0f;
        }
        this.w = f3;
        this.v = f4;
        this.x = Math.abs(f4 - f3);
    }

    public final String c() {
        String str;
        int i = 0;
        String str2 = "";
        while (true) {
            float[] fArr = this.i;
            if (i >= fArr.length) {
                return str2;
            }
            if (i < 0 || i >= fArr.length) {
                str = "";
            } else {
                str = d().a.format(this.i[i]);
            }
            if (str != null && str2.length() < str.length()) {
                str2 = str;
            }
            i++;
        }
    }

    public final C0120Gf d() {
        C0120Gf c0120Gf;
        C0120Gf c0120Gf2 = this.g;
        if (c0120Gf2 != null) {
            int i = c0120Gf2.b;
            int i2 = this.k;
            if (i != i2 && (c0120Gf2 instanceof C0120Gf)) {
                c0120Gf = new C0120Gf(i2);
            }
            return this.g;
        }
        c0120Gf = new C0120Gf(this.k);
        this.g = c0120Gf;
        return this.g;
    }
}
