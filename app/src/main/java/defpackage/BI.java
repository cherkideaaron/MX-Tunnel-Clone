package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import org.junit.internal.MethodSorter;
import org.junit.internal.Throwables;

/* loaded from: classes2.dex */
public final class BI implements InterfaceC3644xI {
    public String a;
    public Vector b = new Vector(10);

    public BI(Class cls) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AI ai;
        int i;
        int i2;
        Object[] objArr;
        AI ai2;
        Constructor constructor;
        InterfaceC3644xI interfaceC3644xI;
        Object objNewInstance;
        int i3 = 0;
        int i4 = 1;
        this.a = cls.getName();
        try {
            try {
                cls.getConstructor(String.class);
            } catch (NoSuchMethodException unused) {
                cls.getConstructor(null);
            }
        } catch (NoSuchMethodException unused2) {
            ai = new AI("Class " + cls.getName() + " has no public constructor TestCase(String name) or TestCase()");
        }
        if (!Modifier.isPublic(cls.getModifiers())) {
            c(new AI("Class " + cls.getName() + " is not public"));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Class superclass = cls;
        while (InterfaceC3644xI.class.isAssignableFrom(superclass)) {
            Method[] declaredMethods = MethodSorter.getDeclaredMethods(superclass);
            int length = declaredMethods.length;
            int i5 = i3;
            while (i5 < length) {
                Method method = declaredMethods[i5];
                String name = method.getName();
                if (arrayList.contains(name)) {
                    int i6 = i4;
                    i = i3;
                    i2 = i6;
                } else {
                    if (d(method) && Modifier.isPublic(method.getModifiers())) {
                        arrayList.add(name);
                        try {
                            Class<?>[] clsArr = new Class[i4];
                            clsArr[i3] = String.class;
                            constructor = cls.getConstructor(clsArr);
                            objArr = null;
                        } catch (NoSuchMethodException unused3) {
                            objArr = null;
                            try {
                                constructor = cls.getConstructor(null);
                            } catch (NoSuchMethodException unused4) {
                                i = 0;
                                ai2 = new AI("Class " + cls.getName() + " has no public constructor TestCase(String name) or TestCase()");
                                interfaceC3644xI = ai2;
                                c(interfaceC3644xI);
                                i2 = 1;
                                i5 += i2;
                                int i7 = i;
                                i4 = i2;
                                i3 = i7;
                            }
                        }
                        try {
                            if (constructor.getParameterTypes().length == 0) {
                                objNewInstance = constructor.newInstance(objArr);
                                if (objNewInstance instanceof AbstractC3698yI) {
                                    ((AbstractC3698yI) objNewInstance).a = name;
                                }
                                i = 0;
                            } else {
                                Object[] objArr2 = new Object[1];
                                i = 0;
                                try {
                                    objArr2[0] = name;
                                    objNewInstance = constructor.newInstance(objArr2);
                                } catch (IllegalAccessException e) {
                                    e = e;
                                    StringBuilder sbO = AbstractC3264qG.o("Cannot access test case: ", name, " (");
                                    sbO.append(Throwables.getStacktrace(e));
                                    sbO.append(")");
                                    ai2 = new AI(sbO.toString());
                                    interfaceC3644xI = ai2;
                                    c(interfaceC3644xI);
                                    i2 = 1;
                                    i5 += i2;
                                    int i72 = i;
                                    i4 = i2;
                                    i3 = i72;
                                } catch (InstantiationException e2) {
                                    e = e2;
                                    StringBuilder sbO2 = AbstractC3264qG.o("Cannot instantiate test case: ", name, " (");
                                    sbO2.append(Throwables.getStacktrace(e));
                                    sbO2.append(")");
                                    ai2 = new AI(sbO2.toString());
                                    interfaceC3644xI = ai2;
                                    c(interfaceC3644xI);
                                    i2 = 1;
                                    i5 += i2;
                                    int i722 = i;
                                    i4 = i2;
                                    i3 = i722;
                                } catch (InvocationTargetException e3) {
                                    e = e3;
                                    StringBuilder sbO3 = AbstractC3264qG.o("Exception in constructor: ", name, " (");
                                    sbO3.append(Throwables.getStacktrace(e.getTargetException()));
                                    sbO3.append(")");
                                    ai2 = new AI(sbO3.toString());
                                    interfaceC3644xI = ai2;
                                    c(interfaceC3644xI);
                                    i2 = 1;
                                    i5 += i2;
                                    int i7222 = i;
                                    i4 = i2;
                                    i3 = i7222;
                                }
                            }
                            interfaceC3644xI = (InterfaceC3644xI) objNewInstance;
                        } catch (IllegalAccessException e4) {
                            e = e4;
                            i = 0;
                        } catch (InstantiationException e5) {
                            e = e5;
                            i = 0;
                        } catch (InvocationTargetException e6) {
                            e = e6;
                            i = 0;
                        }
                        c(interfaceC3644xI);
                    } else {
                        i = i3;
                        if (d(method)) {
                            c(new AI("Test method isn't public: " + method.getName() + "(" + cls.getCanonicalName() + ")"));
                        }
                    }
                    i2 = 1;
                }
                i5 += i2;
                int i72222 = i;
                i4 = i2;
                i3 = i72222;
            }
            superclass = superclass.getSuperclass();
            i4 = i4;
            i3 = i3;
        }
        if (this.b.size() == 0) {
            ai = new AI("No tests found in ".concat(cls.getName()));
            c(ai);
        }
    }

    public static boolean d(Method method) {
        return method.getParameterTypes().length == 0 && method.getName().startsWith("test") && method.getReturnType().equals(Void.TYPE);
    }

    @Override // defpackage.InterfaceC3644xI
    public final int a() {
        Iterator it = this.b.iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA += ((InterfaceC3644xI) it.next()).a();
        }
        return iA;
    }

    @Override // defpackage.InterfaceC3644xI
    public final void b(D3 d3) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            InterfaceC3644xI interfaceC3644xI = (InterfaceC3644xI) it.next();
            synchronized (d3) {
            }
            interfaceC3644xI.b(d3);
        }
    }

    public final void c(InterfaceC3644xI interfaceC3644xI) {
        this.b.add(interfaceC3644xI);
    }

    public final String toString() {
        String str = this.a;
        return str != null ? str : super.toString();
    }
}
