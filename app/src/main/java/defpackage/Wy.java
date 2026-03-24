package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class Wy {
    public static final Method a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        AbstractC0500aq.j(methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (AbstractC0500aq.b(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                AbstractC0500aq.l(parameterTypes, "getParameterTypes(...)");
                if (AbstractC0500aq.b(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        a = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !AbstractC0500aq.b(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
