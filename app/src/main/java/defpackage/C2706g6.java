package defpackage;

import java.util.Map;

/* renamed from: g6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2706g6 {
    public String a;
    public Integer b;
    public C0123Gi c;
    public Long d;
    public Long e;
    public Map f;
    public Integer g;
    public String h;
    public byte[] i;
    public byte[] j;

    public final void a(String str, String str2) {
        Map map = this.f;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    public final C2761h6 b() {
        String strG = this.a == null ? " transportName" : "";
        if (this.c == null) {
            strG = strG.concat(" encodedPayload");
        }
        if (this.d == null) {
            strG = AbstractC3264qG.g(strG, " eventMillis");
        }
        if (this.e == null) {
            strG = AbstractC3264qG.g(strG, " uptimeMillis");
        }
        if (this.f == null) {
            strG = AbstractC3264qG.g(strG, " autoMetadata");
        }
        if (strG.isEmpty()) {
            return new C2761h6(this.a, this.b, this.c, this.d.longValue(), this.e.longValue(), this.f, this.g, this.h, this.i, this.j);
        }
        throw new IllegalStateException("Missing required properties:".concat(strG));
    }

    public final void c(C0123Gi c0123Gi) {
        if (c0123Gi == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        this.c = c0123Gi;
    }
}
