package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ZC {
    public ZM a;
    public ArrayList b;

    public static long a(C0121Gg c0121Gg, long j) {
        ZM zm = c0121Gg.d;
        if (zm instanceof C3721yo) {
            return j;
        }
        ArrayList arrayList = c0121Gg.k;
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            InterfaceC0053Cg interfaceC0053Cg = (InterfaceC0053Cg) arrayList.get(i);
            if (interfaceC0053Cg instanceof C0121Gg) {
                C0121Gg c0121Gg2 = (C0121Gg) interfaceC0053Cg;
                if (c0121Gg2.d != zm) {
                    jMin = Math.min(jMin, a(c0121Gg2, c0121Gg2.f + j));
                }
            }
        }
        if (c0121Gg != zm.i) {
            return jMin;
        }
        long j2 = zm.j();
        long j3 = j - j2;
        return Math.min(Math.min(jMin, a(zm.h, j3)), j3 - r9.f);
    }

    public static long b(C0121Gg c0121Gg, long j) {
        ZM zm = c0121Gg.d;
        if (zm instanceof C3721yo) {
            return j;
        }
        ArrayList arrayList = c0121Gg.k;
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            InterfaceC0053Cg interfaceC0053Cg = (InterfaceC0053Cg) arrayList.get(i);
            if (interfaceC0053Cg instanceof C0121Gg) {
                C0121Gg c0121Gg2 = (C0121Gg) interfaceC0053Cg;
                if (c0121Gg2.d != zm) {
                    jMax = Math.max(jMax, b(c0121Gg2, c0121Gg2.f + j));
                }
            }
        }
        if (c0121Gg != zm.h) {
            return jMax;
        }
        long j2 = zm.j();
        long j3 = j + j2;
        return Math.max(Math.max(jMax, b(zm.i, j3)), j3 - r9.f);
    }
}
