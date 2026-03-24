package defpackage;

/* renamed from: ob, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3167ob extends H7 {
    public final C0284Pq c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3167ob(C3249q1 c3249q1, C0284Pq c0284Pq) {
        super(c3249q1);
        AbstractC0500aq.m(c0284Pq, "json");
        this.c = c0284Pq;
    }

    @Override // defpackage.H7
    public final void c() {
        this.a = true;
        this.d++;
    }

    @Override // defpackage.H7
    public final void e() {
        this.a = false;
        j("\n");
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            j(this.c.a.g);
        }
    }

    @Override // defpackage.H7
    public final void f() {
        if (this.a) {
            this.a = false;
        } else {
            e();
        }
    }

    @Override // defpackage.H7
    public final void l() {
        g(' ');
    }

    @Override // defpackage.H7
    public final void m() {
        this.d--;
    }
}
