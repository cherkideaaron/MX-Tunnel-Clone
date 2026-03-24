package defpackage;

/* loaded from: classes2.dex */
public final class I5 {
    public long a;
    public String b;
    public AbstractC0016Ad c;
    public AbstractC0033Bd d;
    public AbstractC0050Cd e;
    public AbstractC0101Fd f;
    public byte g;

    public final J5 a() {
        String str;
        AbstractC0016Ad abstractC0016Ad;
        AbstractC0033Bd abstractC0033Bd;
        if (this.g == 1 && (str = this.b) != null && (abstractC0016Ad = this.c) != null && (abstractC0033Bd = this.d) != null) {
            return new J5(this.a, str, abstractC0016Ad, abstractC0033Bd, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & this.g) == 0) {
            sb.append(" timestamp");
        }
        if (this.b == null) {
            sb.append(" type");
        }
        if (this.c == null) {
            sb.append(" app");
        }
        if (this.d == null) {
            sb.append(" device");
        }
        throw new IllegalStateException(AbstractC3264qG.i("Missing required properties:", sb));
    }
}
