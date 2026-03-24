package com.facebook.ads.internal.dynamicloading;

import defpackage.C0292Qh;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes.dex */
public final class b {
    public Method a;
    public final C0292Qh b = new C0292Qh(this);

    public final Object a(Class cls) {
        return cls.cast(Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{cls}, this.b));
    }
}
