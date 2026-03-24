package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes.dex */
public final class O8 implements InterfaceC0476aK {
    public final C0607co a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final VK e;
    public final VK f;
    public final int g;

    public O8(Context context, VK vk, VK vk2) {
        C0386Vq c0386Vq = new C0386Vq();
        C0360Uh.b.s(c0386Vq);
        c0386Vq.d = true;
        this.a = new C0607co(c0386Vq);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(C0573c8.c);
        this.e = vk2;
        this.f = vk;
        this.g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(AbstractC3264qG.w("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C2761h6 a(defpackage.C2761h6 r7) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.O8.a(h6):h6");
    }
}
