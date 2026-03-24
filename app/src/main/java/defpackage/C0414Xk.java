package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* renamed from: Xk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0414Xk implements InterfaceC0606cn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ C0414Xk(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.InterfaceC0606cn
    public final Object invoke() throws IOException {
        switch (this.a) {
            case 0:
                File fileL = MO.l(this.b, "firebaseSessions/sessionConfigsDataStore.data");
                C3397so.j(fileL);
                return fileL;
            default:
                File fileL2 = MO.l(this.b, "firebaseSessions/sessionDataStore.data");
                C3397so.j(fileL2);
                return fileL2;
        }
    }
}
