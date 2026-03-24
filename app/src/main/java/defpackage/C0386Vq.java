package defpackage;

import java.util.Date;
import java.util.HashMap;

/* renamed from: Vq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0386Vq implements InterfaceC0157Ii {
    public static final C0352Tq f;
    public static final C0352Tq g;
    public final HashMap a;
    public final HashMap b;
    public final C0335Sq c;
    public boolean d;
    public static final C0335Sq e = new C0335Sq(0);
    public static final C0369Uq h = new C0369Uq();

    /* JADX WARN: Type inference failed for: r0v1, types: [Tq] */
    /* JADX WARN: Type inference failed for: r0v2, types: [Tq] */
    static {
        final int i = 0;
        f = new InterfaceC3049mL() { // from class: Tq
            @Override // defpackage.InterfaceC0140Hi
            public final void a(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((InterfaceC3104nL) obj2).b((String) obj);
                        break;
                    default:
                        ((InterfaceC3104nL) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        g = new InterfaceC3049mL() { // from class: Tq
            @Override // defpackage.InterfaceC0140Hi
            public final void a(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((InterfaceC3104nL) obj2).b((String) obj);
                        break;
                    default:
                        ((InterfaceC3104nL) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public C0386Vq() {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        this.c = e;
        this.d = false;
        map2.put(String.class, f);
        map.remove(String.class);
        map2.put(Boolean.class, g);
        map.remove(Boolean.class);
        map2.put(Date.class, h);
        map.remove(Date.class);
    }

    public final InterfaceC0157Ii a(Class cls, Pw pw) {
        this.a.put(cls, pw);
        this.b.remove(cls);
        return this;
    }
}
