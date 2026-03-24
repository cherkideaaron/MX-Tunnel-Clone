package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: lB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2984lB implements Mr {
    public static int c;
    public static Field d;
    public static Field e;
    public static Field f;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ C2984lB() {
        this.a = 2;
    }

    @Override // defpackage.Mr
    public final void c(Or or, Hr hr) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View view;
        switch (this.a) {
            case 0:
                if (hr != Hr.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                or.getLifecycle().b(this);
                HD hd = (HD) this.b;
                Bundle bundleA = hd.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (bundleA == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"".toString());
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, C2984lB.class.getClassLoader()).asSubclass(BD.class);
                        AbstractC0500aq.j(clsAsSubclass);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                AbstractC0500aq.j(objNewInstance);
                                if (!(hd instanceof InterfaceC2722gM)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + hd).toString());
                                }
                                C2667fM viewModelStore = ((InterfaceC2722gM) hd).getViewModelStore();
                                DD savedStateRegistry = hd.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str2 = (String) it.next();
                                    AbstractC0500aq.m(str2, "key");
                                    AbstractC0478aM abstractC0478aM = (AbstractC0478aM) linkedHashMap.get(str2);
                                    if (abstractC0478aM != null) {
                                        AbstractC0500aq.c(abstractC0478aM, savedStateRegistry, hd.getLifecycle());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.d();
                                }
                            } catch (Exception e2) {
                                throw new RuntimeException(AbstractC3264qG.w("Failed to instantiate ", str), e2);
                            }
                        } catch (NoSuchMethodException e3) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
                        }
                    } catch (ClassNotFoundException e4) {
                        throw new RuntimeException(AbstractC3264qG.x("Class ", str, " wasn't found"), e4);
                    }
                }
                return;
            case 1:
                C0034Be c0034Be = new C0034Be(1);
                InterfaceC0179Jn[] interfaceC0179JnArr = (InterfaceC0179Jn[]) this.b;
                for (InterfaceC0179Jn interfaceC0179Jn : interfaceC0179JnArr) {
                    interfaceC0179Jn.a(hr, false, c0034Be);
                }
                for (InterfaceC0179Jn interfaceC0179Jn2 : interfaceC0179JnArr) {
                    interfaceC0179Jn2.a(hr, true, c0034Be);
                }
                return;
            case 2:
                if (hr != Hr.ON_DESTROY) {
                    return;
                }
                if (c == 0) {
                    try {
                        c = 2;
                        Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                        e = declaredField;
                        declaredField.setAccessible(true);
                        Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                        f = declaredField2;
                        declaredField2.setAccessible(true);
                        Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                        d = declaredField3;
                        declaredField3.setAccessible(true);
                        c = 1;
                    } catch (NoSuchFieldException unused) {
                    }
                }
                if (c == 1) {
                    InputMethodManager inputMethodManager = (InputMethodManager) ((Activity) this.b).getSystemService("input_method");
                    try {
                        Object obj = d.get(inputMethodManager);
                        if (obj == null) {
                            return;
                        }
                        synchronized (obj) {
                            try {
                                try {
                                    view = (View) e.get(inputMethodManager);
                                } finally {
                                }
                            } catch (ClassCastException | IllegalAccessException unused2) {
                            }
                            if (view != null && !view.isAttachedToWindow()) {
                                f.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            }
                        }
                        return;
                    } catch (IllegalAccessException unused3) {
                        return;
                    }
                }
                return;
            case 3:
                if (hr != Hr.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + hr).toString());
                }
                or.getLifecycle().b(this);
                ((C3747zD) this.b).b();
                return;
            default:
                InterfaceC0179Jn interfaceC0179Jn3 = (InterfaceC0179Jn) this.b;
                interfaceC0179Jn3.a(hr, false, null);
                interfaceC0179Jn3.a(hr, true, null);
                return;
        }
    }

    public /* synthetic */ C2984lB(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
