package org.junit.internal.management;

import java.lang.reflect.InvocationTargetException;
import org.junit.internal.Classes;

/* loaded from: classes2.dex */
public class ManagementFactory {

    public static final class FactoryHolder {
        private static final Class<?> MANAGEMENT_FACTORY_CLASS;

        static {
            Class<?> cls;
            try {
                cls = Classes.getClass("java.lang.management.ManagementFactory");
            } catch (ClassNotFoundException unused) {
                cls = null;
            }
            MANAGEMENT_FACTORY_CLASS = cls;
        }

        private FactoryHolder() {
        }

        public static Object getBeanObject(String str) {
            Class<?> cls = MANAGEMENT_FACTORY_CLASS;
            if (cls != null) {
                try {
                    return cls.getMethod(str, null).invoke(null, null);
                } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
                }
            }
            return null;
        }
    }

    public static final class RuntimeHolder {
        private static final RuntimeMXBean RUNTIME_MX_BEAN = getBean(FactoryHolder.getBeanObject("getRuntimeMXBean"));

        private RuntimeHolder() {
        }

        private static final RuntimeMXBean getBean(Object obj) {
            return obj != null ? new ReflectiveRuntimeMXBean(obj) : new FakeRuntimeMXBean();
        }
    }

    public static final class ThreadHolder {
        private static final ThreadMXBean THREAD_MX_BEAN = getBean(FactoryHolder.getBeanObject("getThreadMXBean"));

        private ThreadHolder() {
        }

        private static final ThreadMXBean getBean(Object obj) {
            return obj != null ? new ReflectiveThreadMXBean(obj) : new FakeThreadMXBean();
        }
    }

    public static RuntimeMXBean getRuntimeMXBean() {
        return RuntimeHolder.RUNTIME_MX_BEAN;
    }

    public static ThreadMXBean getThreadMXBean() {
        return ThreadHolder.THREAD_MX_BEAN;
    }
}
