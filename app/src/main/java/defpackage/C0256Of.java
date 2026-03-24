package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: Of, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0256Of implements InterfaceC3451to, InterfaceC3505uo {
    public final InterfaceC3258qA a;
    public final Context b;
    public final InterfaceC3258qA c;
    public final Set d;
    public final Executor e;

    public C0256Of(Context context, String str, Set set, InterfaceC3258qA interfaceC3258qA, Executor executor) {
        this.a = new C3562vr(new C3057mb(1, context, str));
        this.d = set;
        this.e = executor;
        this.c = interfaceC3258qA;
        this.b = context;
    }

    public final synchronized int a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C3667xo c3667xo = (C3667xo) this.a.get();
        if (!c3667xo.i(jCurrentTimeMillis)) {
            return 1;
        }
        c3667xo.g();
        return 3;
    }

    public final void b() {
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
            return;
        }
        if (!(Build.VERSION.SDK_INT >= 24 ? AbstractC3600wb.g(this.b) : true)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.e, new CallableC0239Nf(this, 1));
        }
    }
}
