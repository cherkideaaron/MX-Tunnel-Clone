package defpackage;

import java.util.ArrayList;

/* renamed from: u9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3473u9 implements InterfaceC0282Po {
    public Z6 a;
    public ArrayList b;

    public static float a(ArrayList arrayList, float f, int i) {
        float f2 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C0112Fo c0112Fo = (C0112Fo) arrayList.get(i2);
            if (c0112Fo.f == i) {
                float fAbs = Math.abs(c0112Fo.d - f);
                if (fAbs < f2) {
                    f2 = fAbs;
                }
            }
        }
        return f2;
    }
}
