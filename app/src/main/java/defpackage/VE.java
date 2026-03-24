package defpackage;

/* loaded from: classes.dex */
public final class VE extends AbstractC3463u {
    public final boolean i(Object obj) {
        if (obj == null) {
            obj = AbstractC3463u.m;
        }
        if (!AbstractC3463u.f.i(this, null, obj)) {
            return false;
        }
        AbstractC3463u.b(this);
        return true;
    }

    public final boolean j(Throwable th) {
        th.getClass();
        if (!AbstractC3463u.f.i(this, null, new C3137o(th))) {
            return false;
        }
        AbstractC3463u.b(this);
        return true;
    }

    public final boolean k(As as) {
        C3137o c3137o;
        as.getClass();
        Object obj = this.a;
        if (obj == null) {
            if (as.isDone()) {
                if (!AbstractC3463u.f.i(this, null, AbstractC3463u.e(as))) {
                    return false;
                }
                AbstractC3463u.b(this);
            } else {
                r rVar = new r(this, as);
                if (AbstractC3463u.f.i(this, null, rVar)) {
                    try {
                        as.addListener(rVar, EnumC0359Ug.a);
                    } catch (Throwable th) {
                        try {
                            c3137o = new C3137o(th);
                        } catch (Throwable unused) {
                            c3137o = C3137o.b;
                        }
                        AbstractC3463u.f.i(this, rVar, c3137o);
                    }
                } else {
                    obj = this.a;
                }
            }
            return true;
        }
        if (!(obj instanceof C3027m)) {
            return false;
        }
        as.cancel(((C3027m) obj).a);
        return false;
    }
}
