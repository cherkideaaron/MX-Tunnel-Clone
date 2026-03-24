package defpackage;

import android.net.Uri;
import java.net.URL;

/* renamed from: gC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2712gC {
    public final O3 a;
    public final InterfaceC0168Jc b;

    public C2712gC(O3 o3, InterfaceC0168Jc interfaceC0168Jc) {
        AbstractC0500aq.m(o3, "appInfo");
        AbstractC0500aq.m(interfaceC0168Jc, "blockingDispatcher");
        this.a = o3;
        this.b = interfaceC0168Jc;
    }

    public static final URL a(C2712gC c2712gC) {
        c2712gC.getClass();
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        O3 o3 = c2712gC.a;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(o3.a).appendPath("settings");
        A1 a1 = o3.d;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", a1.c).appendQueryParameter("display_version", a1.b).build().toString());
    }
}
