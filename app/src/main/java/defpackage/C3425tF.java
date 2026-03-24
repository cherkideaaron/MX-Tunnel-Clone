package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* renamed from: tF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3425tF {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public C3425tF() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f) {
        float f2 = this.e;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.c;
        float f5 = this.d;
        C3208pF c3208pF = new C3208pF(f4, f5, f4, f5);
        c3208pF.f = this.e;
        c3208pF.g = f3;
        this.h.add(new C3098nF(c3208pF));
        this.e = f;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC3317rF) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f, float f2) {
        C3263qF c3263qF = new C3263qF();
        c3263qF.b = f;
        c3263qF.c = f2;
        this.g.add(c3263qF);
        C3153oF c3153oF = new C3153oF(c3263qF, this.c, this.d);
        float fB = c3153oF.b() + 270.0f;
        float fB2 = c3153oF.b() + 270.0f;
        a(fB);
        this.h.add(c3153oF);
        this.e = fB2;
        this.c = f;
        this.d = f2;
    }

    public final void d(float f, float f2, float f3) {
        this.a = 0.0f;
        this.b = f;
        this.c = 0.0f;
        this.d = f;
        this.e = f2;
        this.f = (f2 + f3) % 360.0f;
        this.g.clear();
        this.h.clear();
    }
}
