package defpackage;

import java.util.UUID;

/* renamed from: Ta, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0336Ta implements InterfaceC0606cn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0336Ta(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC0606cn
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ((AbstractActivityC2619eb) this.b).reportFullyDrawn();
                return null;
            case 1:
                ((C2884jL) this.b).getClass();
                UUID uuidRandomUUID = UUID.randomUUID();
                AbstractC0500aq.l(uuidRandomUUID, "randomUUID(...)");
                String string = uuidRandomUUID.toString();
                AbstractC0500aq.l(string, "toString(...)");
                return string;
            case 2:
                return AbstractC3296qu.B((InterfaceC2722gM) this.b);
            default:
                HD hd = (HD) this.b;
                hd.getLifecycle().a(new C2984lB(hd, 0));
                return DK.a;
        }
    }
}
