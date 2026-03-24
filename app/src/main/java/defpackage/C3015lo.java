package defpackage;

import java.util.LinkedHashMap;

/* renamed from: lo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3015lo implements InterfaceC2680fh {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C3015lo(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.InterfaceC2680fh
    public final void c() {
        switch (this.a) {
            case 0:
                ((C3125no) this.b).c.removeCallbacks((Runnable) this.c);
                return;
            default:
                String str = (String) this.b;
                InterfaceC2631en interfaceC2631en = (InterfaceC2631en) this.c;
                AbstractC0500aq.m(interfaceC2631en, "$observer");
                synchronized (Ov.b) {
                    LinkedHashMap linkedHashMap = Ov.c;
                    Ov ov = (Ov) linkedHashMap.get(str);
                    if (ov != null) {
                        ov.a.remove(interfaceC2631en);
                        if (ov.a.isEmpty()) {
                            linkedHashMap.remove(str);
                            ov.stopWatching();
                        }
                    }
                }
                return;
        }
    }
}
