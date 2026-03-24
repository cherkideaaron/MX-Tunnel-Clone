package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: d7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2543d7 implements InterfaceC3493uc, InterfaceC0338Tc, Serializable {

    @Nullable
    private final InterfaceC3493uc completion;

    public AbstractC2543d7(InterfaceC3493uc interfaceC3493uc) {
        this.completion = interfaceC3493uc;
    }

    @NotNull
    public InterfaceC3493uc create(@NotNull InterfaceC3493uc interfaceC3493uc) {
        AbstractC0500aq.m(interfaceC3493uc, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // defpackage.InterfaceC0338Tc
    @Nullable
    public InterfaceC0338Tc getCallerFrame() {
        InterfaceC3493uc interfaceC3493uc = this.completion;
        if (interfaceC3493uc instanceof InterfaceC0338Tc) {
            return (InterfaceC0338Tc) interfaceC3493uc;
        }
        return null;
    }

    @Nullable
    public final InterfaceC3493uc getCompletion() {
        return this.completion;
    }

    @Nullable
    public StackTraceElement getStackTraceElement() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        InterfaceC0052Cf interfaceC0052Cf = (InterfaceC0052Cf) getClass().getAnnotation(InterfaceC0052Cf.class);
        String str = null;
        if (interfaceC0052Cf == null) {
            return null;
        }
        int iV = interfaceC0052Cf.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? interfaceC0052Cf.l()[iIntValue] : -1;
        D3 d3 = AbstractC0136He.e;
        D3 d32 = AbstractC0136He.d;
        if (d3 == null) {
            try {
                D3 d33 = new D3(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(AppMeasurementSdk.ConditionalUserProperty.NAME, null), 12);
                AbstractC0136He.e = d33;
                d3 = d33;
            } catch (Exception unused2) {
                AbstractC0136He.e = d32;
                d3 = d32;
            }
        }
        if (d3 != d32 && (method = (Method) d3.b) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) d3.c) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) d3.d;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = interfaceC0052Cf.c();
        } else {
            strC = str + '/' + interfaceC0052Cf.c();
        }
        return new StackTraceElement(strC, interfaceC0052Cf.m(), interfaceC0052Cf.f(), i);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // defpackage.InterfaceC3493uc
    public final void resumeWith(@NotNull Object obj) {
        InterfaceC3493uc interfaceC3493uc = this;
        while (true) {
            AbstractC2543d7 abstractC2543d7 = (AbstractC2543d7) interfaceC3493uc;
            InterfaceC3493uc interfaceC3493uc2 = abstractC2543d7.completion;
            AbstractC0500aq.j(interfaceC3493uc2);
            try {
                obj = abstractC2543d7.invokeSuspend(obj);
                if (obj == EnumC0321Sc.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = AbstractC0115Ga.n(th);
            }
            abstractC2543d7.releaseIntercepted();
            if (!(interfaceC3493uc2 instanceof AbstractC2543d7)) {
                interfaceC3493uc2.resumeWith(obj);
                return;
            }
            interfaceC3493uc = interfaceC3493uc2;
        }
    }

    @NotNull
    public String toString() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    @NotNull
    public InterfaceC3493uc create(@Nullable Object obj, @NotNull InterfaceC3493uc interfaceC3493uc) {
        AbstractC0500aq.m(interfaceC3493uc, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
