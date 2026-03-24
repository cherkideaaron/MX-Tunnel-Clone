package defpackage;

/* renamed from: ns, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3129ns {
    public static void a(long j, Object obj) {
        B b = (B) ((InterfaceC0351Tp) PK.c.h(j, obj));
        if (b.a) {
            b.a = false;
        }
    }

    public static InterfaceC0351Tp b(long j, Object obj) {
        InterfaceC0351Tp interfaceC0351Tp = (InterfaceC0351Tp) PK.c.h(j, obj);
        if (((B) interfaceC0351Tp).a) {
            return interfaceC0351Tp;
        }
        C2983lA c2983lA = (C2983lA) interfaceC0351Tp;
        int i = c2983lA.c;
        C2983lA c2983lAC = c2983lA.c(i == 0 ? 10 : i * 2);
        PK.o(obj, j, c2983lAC);
        return c2983lAC;
    }
}
