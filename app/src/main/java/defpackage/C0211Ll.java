package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: Ll, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0211Ll implements InterfaceC2572di {
    public final Context a;
    public final C0194Kl b;
    public final C0108Fk c;
    public final Object d;
    public Handler e;
    public Executor f;
    public ThreadPoolExecutor g;
    public AbstractC0136He h;

    public C0211Ll(Context context, C0194Kl c0194Kl) {
        C0108Fk c0108Fk = C0228Ml.d;
        this.d = new Object();
        AbstractC0136He.g(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = c0194Kl;
        this.c = c0108Fk;
    }

    @Override // defpackage.InterfaceC2572di
    public final void a(AbstractC0136He abstractC0136He) {
        synchronized (this.d) {
            this.h = abstractC0136He;
        }
        c();
    }

    public final void b() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.e = null;
                ThreadPoolExecutor threadPoolExecutor = this.g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC3222pb("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.g = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                this.f.execute(new H0(this, 9));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C0381Vl d() {
        try {
            C0108Fk c0108Fk = this.c;
            Context context = this.a;
            C0194Kl c0194Kl = this.b;
            c0108Fk.getClass();
            Object[] objArr = {c0194Kl};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            C3249q1 c3249q1A = AbstractC0177Jl.a(context, Collections.unmodifiableList(arrayList));
            int i = c3249q1A.b;
            if (i != 0) {
                throw new RuntimeException(Vs.l(i, "fetchFonts failed (", ")"));
            }
            C0381Vl[] c0381VlArr = (C0381Vl[]) ((List) c3249q1A.c).get(0);
            if (c0381VlArr == null || c0381VlArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c0381VlArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
