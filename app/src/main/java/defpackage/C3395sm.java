package defpackage;

import androidx.fragment.app.t;

/* renamed from: sm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3395sm {
    public static final WF b = new WF();
    public final /* synthetic */ t a;

    public C3395sm(t tVar) {
        this.a = tVar;
    }

    public static Class a(ClassLoader classLoader, String str) throws ClassNotFoundException {
        WF wf = b;
        WF wf2 = (WF) wf.get(classLoader);
        if (wf2 == null) {
            wf2 = new WF();
            wf.put(classLoader, wf2);
        }
        Class cls = (Class) wf2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        wf2.put(str, cls2);
        return cls2;
    }

    public static Class b(ClassLoader classLoader, String str) {
        try {
            return a(classLoader, str);
        } catch (ClassCastException e) {
            throw new C0234Na(AbstractC3264qG.x("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new C0234Na(AbstractC3264qG.x("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }
}
