package defpackage;

/* loaded from: classes2.dex */
public abstract class PB {
    public static final QB a;

    static {
        QB qb = null;
        try {
            qb = (QB) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (qb == null) {
            qb = new QB();
        }
        a = qb;
    }

    public static R9 a(Class cls) {
        a.getClass();
        return new R9(cls);
    }
}
