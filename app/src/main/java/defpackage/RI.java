package defpackage;

/* loaded from: classes2.dex */
public abstract class RI {
    public static final ThreadLocal a = new ThreadLocal();

    public static AbstractC2627ej a() {
        ThreadLocal threadLocal = a;
        AbstractC2627ej abstractC2627ej = (AbstractC2627ej) threadLocal.get();
        if (abstractC2627ej != null) {
            return abstractC2627ej;
        }
        D7 d7 = new D7(Thread.currentThread());
        threadLocal.set(d7);
        return d7;
    }
}
