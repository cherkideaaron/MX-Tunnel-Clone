package defpackage;

import android.content.Context;
import android.os.Process;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Iz {
    public final Context a;
    public final C0583cI b;
    public final int c;
    public final C0583cI d;
    public final C0583cI e;
    public boolean f;

    public Iz(Context context, C2884jL c2884jL) {
        AbstractC0500aq.m(context, "appContext");
        AbstractC0500aq.m(c2884jL, "uuidGenerator");
        this.a = context;
        final int i = 0;
        this.b = AbstractC0069Df.G(new InterfaceC0606cn(this) { // from class: Hz
            public final /* synthetic */ Iz b;

            {
                this.b = this;
            }

            @Override // defpackage.InterfaceC0606cn
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ((Jz) this.b.e.getValue()).a;
                    default:
                        return AbstractC3296qu.A(this.b.a);
                }
            }
        });
        this.c = Process.myPid();
        this.d = AbstractC0069Df.G(new C0336Ta(c2884jL, 1));
        final int i2 = 1;
        this.e = AbstractC0069Df.G(new InterfaceC0606cn(this) { // from class: Hz
            public final /* synthetic */ Iz b;

            {
                this.b = this;
            }

            @Override // defpackage.InterfaceC0606cn
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ((Jz) this.b.e.getValue()).a;
                    default:
                        return AbstractC3296qu.A(this.b.a);
                }
            }
        });
    }

    public final String a() {
        return (String) this.b.getValue();
    }

    public final Map b(Map map) {
        C0583cI c0583cI = this.d;
        if (map == null) {
            return Ht.V(new Jy(a(), new Gz(Process.myPid(), (String) c0583cI.getValue())));
        }
        LinkedHashMap linkedHashMapB0 = Ht.b0(map);
        linkedHashMapB0.put(a(), new Gz(Process.myPid(), (String) c0583cI.getValue()));
        return Ht.Z(linkedHashMapB0);
    }
}
