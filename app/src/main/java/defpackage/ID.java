package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class ID implements InterfaceC2612eM {
    public final Application a;
    public final C2558dM b;
    public final Bundle c;
    public final Jr d;
    public final DD e;

    public ID(Application application, HD hd, Bundle bundle) {
        C2558dM c2558dM;
        AbstractC0500aq.m(hd, "owner");
        this.e = hd.getSavedStateRegistry();
        this.d = hd.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (C2558dM.d == null) {
                C2558dM.d = new C2558dM(application);
            }
            c2558dM = C2558dM.d;
            AbstractC0500aq.j(c2558dM);
        } else {
            c2558dM = new C2558dM(null);
        }
        this.b = c2558dM;
    }

    public final AbstractC0478aM a(Class cls, String str) throws Exception {
        AutoCloseable autoCloseable;
        Application application;
        Jr jr = this.d;
        if (jr == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = E1.class.isAssignableFrom(cls);
        Constructor constructorA = JD.a(cls, (!zIsAssignableFrom || this.a == null) ? JD.b : JD.a);
        if (constructorA == null) {
            if (this.a != null) {
                return this.b.b(cls);
            }
            if (IK.a == null) {
                IK.a = new IK();
            }
            IK ik = IK.a;
            AbstractC0500aq.j(ik);
            return ik.b(cls);
        }
        DD dd = this.e;
        AbstractC0500aq.j(dd);
        C3639xD c3639xDI = AbstractC0136He.i(dd.a(str), this.c);
        C3693yD c3693yD = new C3693yD(str, c3639xDI);
        c3693yD.i(jr, dd);
        Ir ir = ((Qr) jr).c;
        if (ir == Ir.b || ir.compareTo(Ir.d) >= 0) {
            dd.d();
        } else {
            jr.a(new C0443Zf(jr, dd));
        }
        AbstractC0478aM abstractC0478aMB = (!zIsAssignableFrom || (application = this.a) == null) ? JD.b(cls, constructorA, c3639xDI) : JD.b(cls, constructorA, application, c3639xDI);
        abstractC0478aMB.getClass();
        C0533bM c0533bM = abstractC0478aMB.a;
        if (c0533bM != null) {
            if (c0533bM.d) {
                C0533bM.a(c3693yD);
            } else {
                synchronized (c0533bM.a) {
                    autoCloseable = (AutoCloseable) c0533bM.b.put("androidx.lifecycle.savedstate.vm.tag", c3693yD);
                }
                C0533bM.a(autoCloseable);
            }
        }
        return abstractC0478aMB;
    }

    @Override // defpackage.InterfaceC2612eM
    public final AbstractC0478aM b(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return a(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // defpackage.InterfaceC2612eM
    public final AbstractC0478aM g(Class cls, Pv pv) {
        C2611eL c2611eL = C2524cp.c;
        LinkedHashMap linkedHashMap = pv.a;
        String str = (String) linkedHashMap.get(c2611eL);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(AbstractC3296qu.e) == null || linkedHashMap.get(AbstractC3296qu.f) == null) {
            if (this.d != null) {
                return a(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(C2558dM.e);
        boolean zIsAssignableFrom = E1.class.isAssignableFrom(cls);
        Constructor constructorA = JD.a(cls, (!zIsAssignableFrom || application == null) ? JD.b : JD.a);
        return constructorA == null ? this.b.g(cls, pv) : (!zIsAssignableFrom || application == null) ? JD.b(cls, constructorA, AbstractC3296qu.m(pv)) : JD.b(cls, constructorA, application, AbstractC3296qu.m(pv));
    }

    @Override // defpackage.InterfaceC2612eM
    public final AbstractC0478aM k(R9 r9, Pv pv) {
        return g(AbstractC0115Ga.y(r9), pv);
    }
}
