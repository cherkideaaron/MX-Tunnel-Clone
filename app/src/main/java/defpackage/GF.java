package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class GF {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final TC b;
    public volatile C0497an c;

    public GF(TC tc) {
        this.b = tc;
    }

    public final C0497an a() {
        this.b.a();
        if (!this.a.compareAndSet(false, true)) {
            String strB = b();
            TC tc = this.b;
            tc.a();
            tc.b();
            return new C0497an(((SQLiteDatabase) tc.c.d().b).compileStatement(strB));
        }
        if (this.c == null) {
            String strB2 = b();
            TC tc2 = this.b;
            tc2.a();
            tc2.b();
            this.c = new C0497an(((SQLiteDatabase) tc2.c.d().b).compileStatement(strB2));
        }
        return this.c;
    }

    public abstract String b();

    public final void c(C0497an c0497an) {
        if (c0497an == this.c) {
            this.a.set(false);
        }
    }
}
