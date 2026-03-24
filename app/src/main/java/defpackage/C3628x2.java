package defpackage;

import android.window.OnBackInvokedCallback;
import java.lang.reflect.InvocationTargetException;

/* renamed from: x2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3628x2 implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C3628x2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.a) {
            case 0:
                ((F2) this.b).E();
                break;
            case 1:
                InterfaceC0606cn interfaceC0606cn = (InterfaceC0606cn) this.b;
                AbstractC0500aq.m(interfaceC0606cn, "$onBackInvoked");
                interfaceC0606cn.invoke();
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
