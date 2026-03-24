package defpackage;

import java.util.ArrayList;

/* renamed from: Ol, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262Ol implements InterfaceC2840ic {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0262Ol(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC2840ic
    public final void a(Object obj) {
        C0279Pl c0279Pl = (C0279Pl) obj;
        switch (this.a) {
            case 0:
                if (c0279Pl == null) {
                    c0279Pl = new C0279Pl(-3);
                }
                ((R2) this.b).x(c0279Pl);
                return;
            default:
                synchronized (AbstractC0296Ql.c) {
                    try {
                        WF wf = AbstractC0296Ql.d;
                        ArrayList arrayList = (ArrayList) wf.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        wf.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((InterfaceC2840ic) arrayList.get(i)).a(c0279Pl);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
