package org.junit.internal.management;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import org.junit.internal.Classes;

/* loaded from: classes2.dex */
final class ReflectiveRuntimeMXBean implements RuntimeMXBean {
    private final Object runtimeMxBean;

    public static final class Holder {
        private static final Method getInputArgumentsMethod;

        static {
            Method method = null;
            try {
                method = Classes.getClass("java.lang.management.RuntimeMXBean").getMethod("getInputArguments", null);
            } catch (ClassNotFoundException | NoSuchMethodException | SecurityException unused) {
            }
            getInputArgumentsMethod = method;
        }

        private Holder() {
        }
    }

    public ReflectiveRuntimeMXBean(Object obj) {
        this.runtimeMxBean = obj;
    }

    @Override // org.junit.internal.management.RuntimeMXBean
    public List<String> getInputArguments() {
        if (Holder.getInputArgumentsMethod != null) {
            try {
                return (List) Holder.getInputArgumentsMethod.invoke(this.runtimeMxBean, null);
            } catch (ClassCastException | IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
        return Collections.emptyList();
    }
}
