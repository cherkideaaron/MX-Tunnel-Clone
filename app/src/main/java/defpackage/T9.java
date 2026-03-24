package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class T9 {
    public final int a;
    public final Method b;

    public T9(int i, Method method) throws SecurityException {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T9)) {
            return false;
        }
        T9 t9 = (T9) obj;
        return this.a == t9.a && this.b.getName().equals(t9.b.getName());
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.a * 31);
    }
}
