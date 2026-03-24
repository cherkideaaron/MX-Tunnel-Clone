package defpackage;

import android.util.Log;

/* renamed from: Kc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0185Kc implements InterfaceC2631en {
    public final /* synthetic */ int a;

    public /* synthetic */ C0185Kc(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC2631en
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                InterfaceC0134Hc interfaceC0134Hc = (InterfaceC0134Hc) obj;
                if (interfaceC0134Hc instanceof AbstractC0219Mc) {
                    return (AbstractC0219Mc) interfaceC0134Hc;
                }
                return null;
            default:
                C0389Wc c0389Wc = (C0389Wc) obj;
                AbstractC0500aq.m(c0389Wc, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", c0389Wc);
                return C0108Fk.n;
        }
    }
}
