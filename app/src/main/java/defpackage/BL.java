package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class BL {
    public final Z3 a;
    public final Z3 b;
    public final Z3 c;

    public BL(Z3 z3, Z3 z32, Z3 z33) {
        this.a = z3;
        this.b = z32;
        this.c = z33;
    }

    public abstract CL a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        Z3 z3 = this.c;
        Class cls2 = (Class) z3.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        z3.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException, SecurityException {
        Z3 z3 = this.a;
        Method method = (Method) z3.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, BL.class.getClassLoader()).getDeclaredMethod("read", BL.class);
        z3.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        String name = cls.getName();
        Z3 z3 = this.b;
        Method method = (Method) z3.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, BL.class);
        z3.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        return !e(i2) ? i : ((CL) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((CL) this).e.readParcelable(CL.class.getClassLoader());
    }

    public final DL h() {
        String string = ((CL) this).e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (DL) c(string).invoke(null, a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void i(int i);

    public final void j(int i, int i2) {
        i(i2);
        ((CL) this).e.writeInt(i);
    }

    public final void k(DL dl) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (dl == null) {
            ((CL) this).e.writeString(null);
            return;
        }
        try {
            ((CL) this).e.writeString(b(dl.getClass()).getName());
            CL clA = a();
            try {
                d(dl.getClass()).invoke(null, dl, clA);
                int i = clA.i;
                if (i >= 0) {
                    int i2 = clA.d.get(i);
                    Parcel parcel = clA.e;
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(dl.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
