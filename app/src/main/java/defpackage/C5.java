package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class C5 {
    public String a;
    public String b;
    public String c;
    public long d;
    public Long e;
    public boolean f;
    public AbstractC3332rd g;
    public AbstractC0152Id h;
    public AbstractC0135Hd i;
    public AbstractC3386sd j;
    public List k;
    public int l;
    public byte m;

    public final D5 a() {
        String str;
        String str2;
        AbstractC3332rd abstractC3332rd;
        if (this.m == 7 && (str = this.a) != null && (str2 = this.b) != null && (abstractC3332rd = this.g) != null) {
            return new D5(str, str2, this.c, this.d, this.e, this.f, abstractC3332rd, this.h, this.i, this.j, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" generator");
        }
        if (this.b == null) {
            sb.append(" identifier");
        }
        if ((this.m & 1) == 0) {
            sb.append(" startedAt");
        }
        if ((this.m & 2) == 0) {
            sb.append(" crashed");
        }
        if (this.g == null) {
            sb.append(" app");
        }
        if ((this.m & 4) == 0) {
            sb.append(" generatorType");
        }
        throw new IllegalStateException(AbstractC3264qG.i("Missing required properties:", sb));
    }
}
