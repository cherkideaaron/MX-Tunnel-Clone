package defpackage;

/* renamed from: Zi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0446Zi extends AbstractRunnableC0548bj {
    public final InterfaceC3742z8 c;
    public final /* synthetic */ AbstractC2573dj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0446Zi(AbstractC2573dj abstractC2573dj, long j, B8 b8) {
        super(j);
        this.d = abstractC2573dj;
        this.c = b8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a(this.d);
    }

    @Override // defpackage.AbstractRunnableC0548bj
    public final String toString() {
        return super.toString() + this.c;
    }
}
