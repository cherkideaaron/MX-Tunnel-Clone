package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class U9 {
    public static final U9 c = new U9();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap map, T9 t9, Hr hr, Class cls) {
        Hr hr2 = (Hr) map.get(t9);
        if (hr2 == null || hr == hr2) {
            if (hr2 == null) {
                map.put(t9, hr);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + t9.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + hr2 + ", new value " + hr);
    }

    public final S9 a(Class cls, Method[] methodArr) throws SecurityException {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            S9 s9A = (S9) map2.get(superclass);
            if (s9A == null) {
                s9A = a(superclass, null);
            }
            map.putAll(s9A.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            S9 s9A2 = (S9) map2.get(cls2);
            if (s9A2 == null) {
                s9A2 = a(cls2, null);
            }
            for (Map.Entry entry : s9A2.b.entrySet()) {
                b(map, (T9) entry.getKey(), (Hr) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            InterfaceC2969kx interfaceC2969kx = (InterfaceC2969kx) method.getAnnotation(InterfaceC2969kx.class);
            if (interfaceC2969kx != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!Or.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                Hr hrValue = interfaceC2969kx.value();
                if (parameterTypes.length > 1) {
                    if (!Hr.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (hrValue != Hr.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new T9(i, method), hrValue, cls);
                z = true;
            }
        }
        S9 s9 = new S9(map);
        map2.put(cls, s9);
        this.b.put(cls, Boolean.valueOf(z));
        return s9;
    }
}
