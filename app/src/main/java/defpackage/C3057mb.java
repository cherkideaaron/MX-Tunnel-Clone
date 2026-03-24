package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: mb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3057mb implements InterfaceC3258qA {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C3057mb(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.InterfaceC3258qA
    public final Object get() {
        switch (this.a) {
            case 0:
                C3112nb c3112nb = (C3112nb) this.b;
                c3112nb.getClass();
                C0319Sa c0319Sa = (C0319Sa) this.c;
                InterfaceC2892jb interfaceC2892jb = c0319Sa.f;
                C2811i1 c2811i1 = new C2811i1();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                for (C0036Bg c0036Bg : c0319Sa.c) {
                    int i = c0036Bg.c;
                    boolean z = i == 0;
                    int i2 = c0036Bg.b;
                    KA ka = c0036Bg.a;
                    if (z) {
                        if (i2 == 2) {
                            hashSet4.add(ka);
                        } else {
                            hashSet.add(ka);
                        }
                    } else if (i == 2) {
                        hashSet3.add(ka);
                    } else if (i2 == 2) {
                        hashSet5.add(ka);
                    } else {
                        hashSet2.add(ka);
                    }
                }
                if (!c0319Sa.g.isEmpty()) {
                    hashSet.add(KA.a(GA.class));
                }
                c2811i1.a = Collections.unmodifiableSet(hashSet);
                c2811i1.b = Collections.unmodifiableSet(hashSet2);
                c2811i1.c = Collections.unmodifiableSet(hashSet3);
                c2811i1.d = Collections.unmodifiableSet(hashSet4);
                Collections.unmodifiableSet(hashSet5);
                c2811i1.e = c3112nb;
                return interfaceC2892jb.d(c2811i1);
            case 1:
                return new C3667xo((Context) this.b, (String) this.c);
            default:
                C3663xk c3663xk = (C3663xk) this.b;
                String strF = c3663xk.f();
                return new C0119Ge((Context) this.c, strF);
        }
    }
}
