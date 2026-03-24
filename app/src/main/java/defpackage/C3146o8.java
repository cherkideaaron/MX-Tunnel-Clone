package defpackage;

/* renamed from: o8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3146o8 extends I {
    public final /* synthetic */ C3201p8 n;

    public C3146o8(C3201p8 c3201p8) {
        this.n = c3201p8;
    }

    @Override // defpackage.I
    public final String f() {
        C3036m8 c3036m8 = (C3036m8) this.n.a.get();
        if (c3036m8 == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + c3036m8.a + "]";
    }
}
