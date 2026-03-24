package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: kA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2928kA {
    public static final C2928kA c = new C2928kA();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final C0607co a = new C0607co(1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [Yu] */
    /* JADX WARN: Type inference failed for: r4v7, types: [Yu] */
    public final PD a(Class cls) {
        C3554vj c3554vj;
        Et et;
        C3351rw c3351rw;
        C3129ns c3129ns;
        FK fk;
        C3554vj c3554vj2;
        Xu xuX;
        Xu yu;
        Class cls2;
        AbstractC0368Up.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        PD pd = (PD) concurrentHashMap.get(cls);
        if (pd != null) {
            return pd;
        }
        C0607co c0607co = this.a;
        c0607co.getClass();
        Class cls3 = SD.a;
        if (!AbstractC0247Nn.class.isAssignableFrom(cls) && (cls2 = SD.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        C2821iB c2821iBA = ((Vu) c0607co.a).a(cls);
        if ((c2821iBA.d & 2) == 2) {
            boolean zIsAssignableFrom = AbstractC0247Nn.class.isAssignableFrom(cls);
            AbstractC3733z abstractC3733z = c2821iBA.a;
            if (zIsAssignableFrom) {
                yu = new Yu(SD.c, AbstractC3608wj.a, abstractC3733z);
            } else {
                FK fk2 = SD.b;
                C3554vj c3554vj3 = AbstractC3608wj.b;
                if (c3554vj3 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                yu = new Yu(fk2, c3554vj3, abstractC3733z);
            }
            xuX = yu;
        } else {
            if (AbstractC0247Nn.class.isAssignableFrom(cls)) {
                C3351rw c3351rw2 = AbstractC3405sw.b;
                c3129ns = AbstractC3184os.b;
                fk = SD.c;
                c3554vj2 = AbstractC3264qG.A(c2821iBA.d()) != 1 ? AbstractC3608wj.a : null;
                et = Ft.b;
                int[] iArr = Xu.n;
                if (!(c2821iBA instanceof C2821iB)) {
                    Vs.u(c2821iBA);
                    throw null;
                }
                c3351rw = c3351rw2;
            } else {
                C3351rw c3351rw3 = AbstractC3405sw.a;
                C3129ns c3129ns2 = AbstractC3184os.a;
                FK fk3 = SD.b;
                if (AbstractC3264qG.A(c2821iBA.d()) != 1) {
                    c3554vj = AbstractC3608wj.b;
                    if (c3554vj == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                } else {
                    c3554vj = null;
                }
                et = Ft.a;
                int[] iArr2 = Xu.n;
                if (!(c2821iBA instanceof C2821iB)) {
                    Vs.u(c2821iBA);
                    throw null;
                }
                c3351rw = c3351rw3;
                c3129ns = c3129ns2;
                fk = fk3;
                c3554vj2 = c3554vj;
            }
            xuX = Xu.x(c2821iBA, c3351rw, c3129ns, fk, c3554vj2, et);
        }
        PD pd2 = (PD) concurrentHashMap.putIfAbsent(cls, xuX);
        return pd2 != null ? pd2 : xuX;
    }
}
