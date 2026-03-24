package defpackage;

import com.google.android.gms.common.api.Api;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: Nn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0247Nn extends AbstractC3733z {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0247Nn> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected EK unknownFields;

    public AbstractC0247Nn() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = EK.f;
    }

    public static AbstractC0247Nn g(Class cls) throws ClassNotFoundException {
        AbstractC0247Nn abstractC0247Nn = defaultInstanceMap.get(cls);
        if (abstractC0247Nn == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0247Nn = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC0247Nn == null) {
            abstractC0247Nn = (AbstractC0247Nn) ((AbstractC0247Nn) PK.d(cls)).f(6);
            if (abstractC0247Nn == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC0247Nn);
        }
        return abstractC0247Nn;
    }

    public static Object h(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean i(AbstractC0247Nn abstractC0247Nn, boolean z) {
        byte bByteValue = ((Byte) abstractC0247Nn.f(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C2928kA c2928kA = C2928kA.c;
        c2928kA.getClass();
        boolean zD = c2928kA.a(abstractC0247Nn.getClass()).d(abstractC0247Nn);
        if (z) {
            abstractC0247Nn.f(2);
        }
        return zD;
    }

    public static void m(Class cls, AbstractC0247Nn abstractC0247Nn) {
        abstractC0247Nn.k();
        defaultInstanceMap.put(cls, abstractC0247Nn);
    }

    @Override // defpackage.AbstractC3733z
    public final int a() {
        return b(null);
    }

    @Override // defpackage.AbstractC3733z
    public final int b(PD pd) {
        if (j()) {
            if (pd == null) {
                C2928kA c2928kA = C2928kA.c;
                c2928kA.getClass();
                pd = c2928kA.a(getClass());
            }
            int iG = pd.g(this);
            if (iG >= 0) {
                return iG;
            }
            throw new IllegalStateException(Vs.k(iG, "serialized size must be non-negative, was "));
        }
        int i = this.memoizedSerializedSize;
        if ((i & Api.BaseClientBuilder.API_PRIORITY_OTHER) != Integer.MAX_VALUE) {
            return i & Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        if (pd == null) {
            C2928kA c2928kA2 = C2928kA.c;
            c2928kA2.getClass();
            pd = c2928kA2.a(getClass());
        }
        int iG2 = pd.g(this);
        n(iG2);
        return iG2;
    }

    @Override // defpackage.AbstractC3733z
    public final void c(C3221pa c3221pa) {
        C2928kA c2928kA = C2928kA.c;
        c2928kA.getClass();
        PD pdA = c2928kA.a(getClass());
        C2524cp c2524cp = c3221pa.j;
        if (c2524cp == null) {
            c2524cp = new C2524cp(c3221pa);
        }
        pdA.b(this, c2524cp);
    }

    public final void d() {
        this.memoizedHashCode = 0;
    }

    public final void e() {
        n(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2928kA c2928kA = C2928kA.c;
        c2928kA.getClass();
        return c2928kA.a(getClass()).f(this, (AbstractC0247Nn) obj);
    }

    public abstract Object f(int i);

    public final int hashCode() {
        if (j()) {
            C2928kA c2928kA = C2928kA.c;
            c2928kA.getClass();
            return c2928kA.a(getClass()).i(this);
        }
        if (this.memoizedHashCode == 0) {
            C2928kA c2928kA2 = C2928kA.c;
            c2928kA2.getClass();
            this.memoizedHashCode = c2928kA2.a(getClass()).i(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean j() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void k() {
        this.memoizedSerializedSize &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public final AbstractC0247Nn l() {
        return (AbstractC0247Nn) f(4);
    }

    public final void n(int i) {
        if (i < 0) {
            throw new IllegalStateException(Vs.k(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i & Api.BaseClientBuilder.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = Wu.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        Wu.c(this, sb, 0);
        return sb.toString();
    }
}
