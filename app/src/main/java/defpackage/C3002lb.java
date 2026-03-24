package defpackage;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;

/* renamed from: lb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3002lb implements InterfaceC3258qA {
    public final /* synthetic */ int a;

    public /* synthetic */ C3002lb(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC3258qA
    public final Object get() {
        switch (this.a) {
            case 1:
                C3562vr c3562vr = ExecutorsRegistrar.a;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i = Build.VERSION.SDK_INT;
                builderDetectNetwork.detectResourceMismatches();
                if (i >= 26) {
                    builderDetectNetwork.detectUnbufferedIo();
                }
                break;
            case 2:
                C3562vr c3562vr2 = ExecutorsRegistrar.a;
                break;
            case 3:
                C3562vr c3562vr3 = ExecutorsRegistrar.a;
                break;
            case 4:
                C3562vr c3562vr4 = ExecutorsRegistrar.a;
                break;
            case 5:
                C2524cp c2524cp = FirebaseMessaging.k;
                break;
        }
        return null;
    }
}
