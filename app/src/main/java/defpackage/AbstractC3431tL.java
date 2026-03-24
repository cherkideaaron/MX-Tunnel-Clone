package defpackage;

/* renamed from: tL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3431tL extends AbstractC3377sL {
    public Oy[] a;
    public String b;
    public int c;
    public final int d;

    public AbstractC3431tL() {
        this.a = null;
        this.c = 0;
    }

    public Oy[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(Oy[] oyArr) {
        if (!AbstractC0500aq.e(this.a, oyArr)) {
            this.a = AbstractC0500aq.x(oyArr);
            return;
        }
        Oy[] oyArr2 = this.a;
        for (int i = 0; i < oyArr.length; i++) {
            oyArr2[i].a = oyArr[i].a;
            int i2 = 0;
            while (true) {
                float[] fArr = oyArr[i].b;
                if (i2 < fArr.length) {
                    oyArr2[i].b[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public AbstractC3431tL(AbstractC3431tL abstractC3431tL) {
        this.a = null;
        this.c = 0;
        this.b = abstractC3431tL.b;
        this.d = abstractC3431tL.d;
        this.a = AbstractC0500aq.x(abstractC3431tL.a);
    }
}
