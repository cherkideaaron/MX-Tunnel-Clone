package defpackage;

import com.facebook.ads.internal.dynamicloading.b;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: Qh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0292Qh implements InvocationHandler {
    public final /* synthetic */ b a;

    public C0292Qh(b bVar) {
        this.a = bVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if ("toString".equals(method.getName())) {
            return null;
        }
        this.a.a = method;
        return null;
    }
}
