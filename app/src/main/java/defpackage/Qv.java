package defpackage;

/* loaded from: classes.dex */
public class Qv extends Is {
    @Override // defpackage.Is
    public void h(Object obj) {
        Is.a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }

    public final void i(Object obj) {
        boolean z;
        synchronized (this.a) {
            z = this.f == Is.k;
            this.f = obj;
        }
        if (z) {
            Q3.X().Y(this.j);
        }
    }
}
