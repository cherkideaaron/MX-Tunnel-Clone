package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* renamed from: jv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2912jv {
    public final C3178om a;
    public final C0373Vd b;
    public final HashMap c;

    public C2912jv(Context context, C0373Vd c0373Vd) {
        C3178om c3178om = new C3178om(context);
        this.c = new HashMap();
        this.a = c3178om;
        this.b = c0373Vd;
    }

    public final synchronized InterfaceC0476aK a(String str) {
        if (this.c.containsKey(str)) {
            return (InterfaceC0476aK) this.c.get(str);
        }
        CctBackendFactory cctBackendFactoryW = this.a.w(str);
        if (cctBackendFactoryW == null) {
            return null;
        }
        C0373Vd c0373Vd = this.b;
        InterfaceC0476aK interfaceC0476aKCreate = cctBackendFactoryW.create(new C2596e6(c0373Vd.a, c0373Vd.b, c0373Vd.c, str));
        this.c.put(str, interfaceC0476aKCreate);
        return interfaceC0476aKCreate;
    }
}
