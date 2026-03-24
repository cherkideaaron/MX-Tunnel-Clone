package defpackage;

import java.util.Map;

/* renamed from: Sq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0335Sq implements Pw {
    public final /* synthetic */ int a;

    @Override // defpackage.InterfaceC0140Hi
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new C0191Ki("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Qw qw = (Qw) obj2;
                qw.a(C3038mA.g, entry.getKey());
                qw.a(C3038mA.h, entry.getValue());
                return;
            default:
                throw new C0191Ki("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
