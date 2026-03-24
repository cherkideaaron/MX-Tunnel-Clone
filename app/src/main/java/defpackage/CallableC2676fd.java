package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.NavigableSet;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* renamed from: fd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC2676fd implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ CallableC2676fd(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                C2567dd c2567dd = ((C2841id) this.b).g;
                c2567dd.getClass();
                D3.j();
                R2 r2 = c2567dd.c;
                C3121nk c3121nk = (C3121nk) r2.c;
                c3121nk.getClass();
                File file = (File) c3121nk.c;
                String str = (String) r2.b;
                boolean z = true;
                if (new File(file, str).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    C3121nk c3121nk2 = (C3121nk) r2.c;
                    c3121nk2.getClass();
                    new File((File) c3121nk2.c, str).delete();
                } else {
                    NavigableSet navigableSetC = ((C0254Od) c2567dd.m.b).c();
                    String str2 = navigableSetC.isEmpty() ? null : (String) navigableSetC.first();
                    if (str2 == null || !c2567dd.j.c(str2)) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                return new C3723yq((JsReplyProxyBoundaryInterface) this.b);
            default:
                C3308r6 c3308r6 = (C3308r6) ((C3178om) this.b).c;
                R2 r22 = (R2) c3308r6.f;
                C2715gF c2715gF = (C2715gF) c3308r6.b;
                String str3 = (String) r22.b;
                D3.k();
                try {
                    HashMap mapR = R2.r(c2715gF);
                    ((C3397so) r22.c).getClass();
                    D3 d3 = new D3(mapR, str3);
                    HashMap map = (HashMap) d3.b;
                    map.put("User-Agent", "Crashlytics Android SDK/20.0.4");
                    map.put("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    R2.k(d3, c2715gF);
                    String str4 = "Requesting settings from " + str3;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str4, null);
                    }
                    String str5 = "Settings query params were: " + mapR;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str5, null);
                    }
                    return r22.s(d3.s());
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e);
                    return null;
                }
        }
    }
}
