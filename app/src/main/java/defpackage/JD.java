package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class JD {
    public static final List a = AbstractC3437ta.Y(Application.class, C3639xD.class);
    public static final List b = AbstractC0115Ga.I(C3639xD.class);

    public static final Constructor a(Class cls, List list) {
        AbstractC0500aq.m(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        AbstractC0500aq.l(constructors, "getConstructors(...)");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            AbstractC0500aq.l(parameterTypes, "getParameterTypes(...)");
            List listB0 = AbstractC2540d4.b0(parameterTypes);
            if (AbstractC0500aq.b(list, listB0)) {
                return constructor;
            }
            if (list.size() == listB0.size() && listB0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final AbstractC0478aM b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (AbstractC0478aM) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
