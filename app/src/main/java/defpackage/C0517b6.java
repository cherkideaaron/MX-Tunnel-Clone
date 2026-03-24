package defpackage;

/* renamed from: b6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0517b6 {
    public int a;
    public String b;
    public String c;
    public boolean d;
    public byte e;

    public final C0571c6 a() {
        String str;
        String str2;
        if (this.e == 3 && (str = this.b) != null && (str2 = this.c) != null) {
            return new C0571c6(str, this.a, str2, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" platform");
        }
        if (this.b == null) {
            sb.append(" version");
        }
        if (this.c == null) {
            sb.append(" buildVersion");
        }
        if ((this.e & 2) == 0) {
            sb.append(" jailbroken");
        }
        throw new IllegalStateException(AbstractC3264qG.i("Missing required properties:", sb));
    }
}
