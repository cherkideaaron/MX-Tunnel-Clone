package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

/* renamed from: Zf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0443Zf implements Mr {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public C0443Zf(InterfaceC0409Xf interfaceC0409Xf, Mr mr) {
        AbstractC0500aq.m(interfaceC0409Xf, "defaultLifecycleObserver");
        this.b = interfaceC0409Xf;
        this.c = mr;
    }

    @Override // defpackage.Mr
    public final void c(Or or, Hr hr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.a) {
            case 0:
                int i = AbstractC0426Yf.a[hr.ordinal()];
                InterfaceC0409Xf interfaceC0409Xf = (InterfaceC0409Xf) this.b;
                switch (i) {
                    case 1:
                        interfaceC0409Xf.h(or);
                        break;
                    case 2:
                        interfaceC0409Xf.b(or);
                        break;
                    case 3:
                        interfaceC0409Xf.g(or);
                        break;
                    case 4:
                        interfaceC0409Xf.e(or);
                        break;
                    case 5:
                        interfaceC0409Xf.a(or);
                        break;
                    case 6:
                        interfaceC0409Xf.f(or);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new C0234Na();
                }
                Mr mr = (Mr) this.c;
                if (mr != null) {
                    mr.c(or, hr);
                    return;
                }
                return;
            case 1:
                if (hr == Hr.ON_START) {
                    ((Jr) this.b).b(this);
                    ((DD) this.c).d();
                    return;
                }
                return;
            default:
                HashMap map = ((S9) this.c).a;
                List list = (List) map.get(hr);
                Object obj = this.b;
                S9.a(list, or, hr, obj);
                S9.a((List) map.get(Hr.ON_ANY), or, hr, obj);
                return;
        }
    }

    public C0443Zf(Jr jr, DD dd) {
        this.b = jr;
        this.c = dd;
    }

    public C0443Zf(Object obj) {
        this.b = obj;
        U9 u9 = U9.c;
        Class<?> cls = obj.getClass();
        S9 s9 = (S9) u9.a.get(cls);
        this.c = s9 == null ? u9.a(cls, null) : s9;
    }
}
