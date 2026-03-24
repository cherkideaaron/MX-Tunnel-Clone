package defpackage;

/* loaded from: classes2.dex */
public final class X5 {
    public AbstractC0067Dd a;
    public String b;
    public String c;
    public long d;
    public byte e;

    public final Y5 a() {
        AbstractC0067Dd abstractC0067Dd;
        String str;
        String str2;
        if (this.e == 1 && (abstractC0067Dd = this.a) != null && (str = this.b) != null && (str2 = this.c) != null) {
            return new Y5(abstractC0067Dd, str, str2, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rolloutVariant");
        }
        if (this.b == null) {
            sb.append(" parameterKey");
        }
        if (this.c == null) {
            sb.append(" parameterValue");
        }
        if ((1 & this.e) == 0) {
            sb.append(" templateVersion");
        }
        throw new IllegalStateException(AbstractC3264qG.i("Missing required properties:", sb));
    }
}
