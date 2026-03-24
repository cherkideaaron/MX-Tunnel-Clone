package defpackage;

/* loaded from: classes2.dex */
public final class Q5 {
    public long a;
    public String b;
    public String c;
    public long d;
    public int e;
    public byte f;

    public final R5 a() {
        String str;
        if (this.f == 7 && (str = this.b) != null) {
            return new R5(this.a, str, this.c, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb.append(" pc");
        }
        if (this.b == null) {
            sb.append(" symbol");
        }
        if ((this.f & 2) == 0) {
            sb.append(" offset");
        }
        if ((this.f & 4) == 0) {
            sb.append(" importance");
        }
        throw new IllegalStateException(AbstractC3264qG.i("Missing required properties:", sb));
    }
}
