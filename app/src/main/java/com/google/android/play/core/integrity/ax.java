package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes2.dex */
final class ax {
    private static aw a;

    public static synchronized aw a(Context context) {
        try {
            if (a == null) {
                u uVar = new u(null);
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                uVar.a(context);
                a = uVar.b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }
}
