package defpackage;

/* renamed from: x6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3632x6 {
    public String a;
    public int b;
    public String c;
    public String d;
    public long e;
    public long f;
    public String g;
    public byte h;

    public final C3686y6 a() {
        if (this.h == 3 && this.b != 0) {
            return new C3686y6(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == 0) {
            sb.append(" registrationStatus");
        }
        if ((this.h & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((this.h & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(AbstractC3264qG.i("Missing required properties:", sb));
    }

    public final void b(int i) {
        if (i == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        this.b = i;
    }
}
