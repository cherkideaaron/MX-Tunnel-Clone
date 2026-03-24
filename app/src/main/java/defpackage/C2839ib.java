package defpackage;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* renamed from: ib, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2839ib implements InterfaceC3258qA {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C2839ib(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC3258qA
    public final Object get() throws ClassNotFoundException {
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new C2799hq("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new C2799hq(AbstractC3264qG.x("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new C2799hq(AbstractC3264qG.x("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new C2799hq(AbstractC3264qG.w("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new C2799hq(AbstractC3264qG.w("Could not instantiate ", str), e4);
                }
            case 1:
                return (ComponentRegistrar) this.b;
            default:
                return new C2633ep((C3663xk) this.b);
        }
    }
}
