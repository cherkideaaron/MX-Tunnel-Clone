package defpackage;

/* renamed from: m8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3036m8 {
    public Object a;
    public C3201p8 b;
    public C3422tC c;
    public boolean d;

    public final void a(Object obj) {
        this.d = true;
        C3201p8 c3201p8 = this.b;
        if (c3201p8 == null || !c3201p8.b.h(obj)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void b(Throwable th) {
        this.d = true;
        C3201p8 c3201p8 = this.b;
        if (c3201p8 == null || !c3201p8.b.i(th)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void finalize() {
        C3422tC c3422tC;
        C3201p8 c3201p8 = this.b;
        if (c3201p8 != null) {
            C3146o8 c3146o8 = c3201p8.b;
            if (!c3146o8.isDone()) {
                c3146o8.i(new C3082n("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, 2));
            }
        }
        if (this.d || (c3422tC = this.c) == null) {
            return;
        }
        c3422tC.h(null);
    }
}
