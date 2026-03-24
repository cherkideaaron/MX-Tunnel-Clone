package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class Ew {
    public Object a;

    public Ew(C2832iM c2832iM) {
        this.a = c2832iM;
    }

    public void a(Bundle bundle) {
        bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c());
    }

    public abstract void b(KJ kj);

    public abstract String c();
}
