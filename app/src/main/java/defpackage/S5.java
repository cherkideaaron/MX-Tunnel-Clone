package defpackage;

/* loaded from: classes2.dex */
public final class S5 {
    public String a;
    public int b;
    public int c;
    public boolean d;
    public byte e;

    public final T5 a() {
        String str;
        if (this.e == 7 && (str = this.a) != null) {
            return new T5(str, this.b, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" processName");
        }
        if ((this.e & 1) == 0) {
            sb.append(" pid");
        }
        if ((this.e & 2) == 0) {
            sb.append(" importance");
        }
        if ((this.e & 4) == 0) {
            sb.append(" defaultProcess");
        }
        throw new IllegalStateException(AbstractC3264qG.i("Missing required properties:", sb));
    }
}
