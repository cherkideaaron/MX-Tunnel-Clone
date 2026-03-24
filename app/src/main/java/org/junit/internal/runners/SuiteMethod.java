package org.junit.internal.runners;

import defpackage.InterfaceC3644xI;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: classes2.dex */
public class SuiteMethod extends JUnit38ClassRunner {
    public SuiteMethod(Class<?> cls) {
        super(testFromSuiteMethod(cls));
    }

    public static InterfaceC3644xI testFromSuiteMethod(Class<?> cls) throws Exception {
        try {
            Method method = cls.getMethod("suite", null);
            if (Modifier.isStatic(method.getModifiers())) {
                return (InterfaceC3644xI) method.invoke(null, null);
            }
            throw new Exception(cls.getName().concat(".suite() must be static"));
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }
}
