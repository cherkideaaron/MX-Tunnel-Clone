package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* renamed from: dM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2558dM extends IK {
    public static C2558dM d;
    public static final C0587cM e = new C0587cM();
    public final Application c;

    public C2558dM(Application application) {
        this.c = application;
    }

    @Override // defpackage.IK, defpackage.InterfaceC2612eM
    public final AbstractC0478aM b(Class cls) {
        Application application = this.c;
        if (application != null) {
            return c(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    public final AbstractC0478aM c(Class cls, Application application) {
        if (!E1.class.isAssignableFrom(cls)) {
            return AbstractC3279qd.r(cls);
        }
        try {
            AbstractC0478aM abstractC0478aM = (AbstractC0478aM) cls.getConstructor(Application.class).newInstance(application);
            AbstractC0500aq.j(abstractC0478aM);
            return abstractC0478aM;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException("Cannot create an instance of " + cls, e5);
        }
    }

    @Override // defpackage.IK, defpackage.InterfaceC2612eM
    public final AbstractC0478aM g(Class cls, Pv pv) {
        if (this.c != null) {
            return b(cls);
        }
        Application application = (Application) pv.a.get(e);
        if (application != null) {
            return c(cls, application);
        }
        if (E1.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return AbstractC3279qd.r(cls);
    }
}
