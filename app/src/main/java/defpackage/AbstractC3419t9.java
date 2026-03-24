package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: t9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3419t9 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public List i;

    public final void a() {
        Object obj;
        InterfaceC0265Oo interfaceC0265Oo;
        List<InterfaceC0265Oo> list = this.i;
        if (list == null) {
            return;
        }
        this.a = -3.4028235E38f;
        this.b = Float.MAX_VALUE;
        this.c = -3.4028235E38f;
        this.d = Float.MAX_VALUE;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((InterfaceC0265Oo) it.next());
        }
        this.e = -3.4028235E38f;
        this.f = Float.MAX_VALUE;
        this.g = -3.4028235E38f;
        this.h = Float.MAX_VALUE;
        Iterator it2 = list.iterator();
        while (true) {
            obj = null;
            if (it2.hasNext()) {
                interfaceC0265Oo = (InterfaceC0265Oo) it2.next();
                if (((C0502as) interfaceC0265Oo).d == 1) {
                    break;
                }
            } else {
                interfaceC0265Oo = null;
                break;
            }
        }
        if (interfaceC0265Oo != null) {
            C0502as c0502as = (C0502as) interfaceC0265Oo;
            this.e = c0502as.n;
            this.f = c0502as.o;
            for (InterfaceC0265Oo interfaceC0265Oo2 : list) {
                if (((C0502as) interfaceC0265Oo2).d == 1) {
                    C0502as c0502as2 = (C0502as) interfaceC0265Oo2;
                    float f = c0502as2.o;
                    if (f < this.f) {
                        this.f = f;
                    }
                    float f2 = c0502as2.n;
                    if (f2 > this.e) {
                        this.e = f2;
                    }
                }
            }
        }
        Iterator it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object obj2 = (InterfaceC0265Oo) it3.next();
            if (((C0502as) obj2).d == 2) {
                obj = obj2;
                break;
            }
        }
        if (obj != null) {
            C0502as c0502as3 = (C0502as) obj;
            this.g = c0502as3.n;
            this.h = c0502as3.o;
            for (InterfaceC0265Oo interfaceC0265Oo3 : list) {
                if (((C0502as) interfaceC0265Oo3).d == 2) {
                    C0502as c0502as4 = (C0502as) interfaceC0265Oo3;
                    float f3 = c0502as4.o;
                    if (f3 < this.h) {
                        this.h = f3;
                    }
                    float f4 = c0502as4.n;
                    if (f4 > this.g) {
                        this.g = f4;
                    }
                }
            }
        }
    }

    public final void b(InterfaceC0265Oo interfaceC0265Oo) {
        float f = this.a;
        C0502as c0502as = (C0502as) interfaceC0265Oo;
        float f2 = c0502as.n;
        if (f < f2) {
            this.a = f2;
        }
        float f3 = this.b;
        float f4 = c0502as.o;
        if (f3 > f4) {
            this.b = f4;
        }
        float f5 = this.c;
        float f6 = c0502as.p;
        if (f5 < f6) {
            this.c = f6;
        }
        float f7 = this.d;
        float f8 = c0502as.q;
        if (f7 > f8) {
            this.d = f8;
        }
        if (((C0502as) interfaceC0265Oo).d == 1) {
            if (this.e < f2) {
                this.e = f2;
            }
            if (this.f > f4) {
                this.f = f4;
                return;
            }
            return;
        }
        if (this.g < f2) {
            this.g = f2;
        }
        if (this.h > f4) {
            this.h = f4;
        }
    }

    public final InterfaceC0265Oo c(int i) {
        List list = this.i;
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return (InterfaceC0265Oo) list.get(i);
    }

    public final int d() {
        Iterator it = this.i.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((C0502as) ((InterfaceC0265Oo) it.next())).m.size();
        }
        return size;
    }

    public final float e(int i) {
        if (i == 1) {
            float f = this.e;
            return f == -3.4028235E38f ? this.g : f;
        }
        float f2 = this.g;
        return f2 == -3.4028235E38f ? this.e : f2;
    }

    public final float f(int i) {
        if (i == 1) {
            float f = this.f;
            return f == Float.MAX_VALUE ? this.h : f;
        }
        float f2 = this.h;
        return f2 == Float.MAX_VALUE ? this.f : f2;
    }

    public final void g(int i) {
        InterfaceC0265Oo interfaceC0265Oo;
        List list = this.i;
        if (i >= list.size() || i < 0 || (interfaceC0265Oo = (InterfaceC0265Oo) list.get(i)) == null || !list.remove(interfaceC0265Oo)) {
            return;
        }
        a();
    }
}
