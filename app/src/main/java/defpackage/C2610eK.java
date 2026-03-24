package defpackage;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;

/* renamed from: eK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2610eK {
    public static volatile C0017Ae e;
    public final VK a;
    public final VK b;
    public final KD c;
    public final UK d;

    public C2610eK(VK vk, VK vk2, KD kd, UK uk, C0535bO c0535bO) {
        this.a = vk;
        this.b = vk2;
        this.c = kd;
        this.d = uk;
        c0535bO.getClass();
        c0535bO.a.execute(new H0(c0535bO, 20));
    }

    public static C2610eK a() {
        C0017Ae c0017Ae = e;
        if (c0017Ae != null) {
            return (C2610eK) c0017Ae.f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (C2610eK.class) {
                try {
                    if (e == null) {
                        C3765ze c3765ze = new C3765ze();
                        context.getClass();
                        c3765ze.a = context;
                        e = c3765ze.a();
                    }
                } finally {
                }
            }
        }
    }

    public final C0585cK c(C0573c8 c0573c8) {
        Set setSingleton;
        byte[] bytes;
        if (c0573c8 instanceof InterfaceC0106Fi) {
            c0573c8.getClass();
            setSingleton = Collections.unmodifiableSet(C0573c8.d);
        } else {
            setSingleton = Collections.singleton(new C0174Ji("proto"));
        }
        D3 d3A = J6.a();
        c0573c8.getClass();
        d3A.S("cct");
        String str = c0573c8.a;
        String str2 = c0573c8.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        }
        d3A.c = bytes;
        return new C0585cK(setSingleton, d3A.h(), this);
    }
}
