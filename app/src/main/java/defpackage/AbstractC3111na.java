package defpackage;

import android.os.Build;
import android.view.View;
import com.google.android.gms.common.api.Api;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* renamed from: na, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3111na {
    public int a;
    public int b;
    public int c;
    public Object d;

    public AbstractC3111na(int i) {
        switch (i) {
            case 2:
                if (C2611eL.a == null) {
                    C2611eL.a = new C2611eL();
                    break;
                }
                break;
            default:
                this.b = 100;
                this.c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                break;
        }
    }

    public abstract int A();

    public abstract int B();

    public abstract long C();

    public void D(View view, Object obj) {
        if (Build.VERSION.SDK_INT >= this.b) {
            e(view, obj);
            return;
        }
        if (E(f(view), obj)) {
            View.AccessibilityDelegate accessibilityDelegateC = UL.c(view);
            M m = accessibilityDelegateC == null ? null : accessibilityDelegateC instanceof L ? ((L) accessibilityDelegateC).a : new M(accessibilityDelegateC);
            if (m == null) {
                m = new M();
            }
            UL.l(view, m);
            view.setTag(this.a, obj);
            UL.g(view, this.c);
        }
    }

    public abstract boolean E(Object obj, Object obj2);

    public abstract boolean F(int i);

    public void G() {
        int iA;
        do {
            iA = A();
            if (iA == 0) {
                return;
            }
            int i = this.a;
            if (i >= this.b) {
                throw new C2744gq("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.a = i + 1;
            this.a--;
        } while (F(iA));
    }

    public int a(int i) {
        if (i < this.c) {
            return ((ByteBuffer) this.d).getShort(this.b + i);
        }
        return 0;
    }

    public void b() {
        if (((C3780zt) this.d).n != this.c) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract void c(int i);

    public abstract Object d(View view);

    public abstract void e(View view, Object obj);

    public Object f(View view) {
        if (Build.VERSION.SDK_INT >= this.b) {
            return d(view);
        }
        Object tag = view.getTag(this.a);
        if (((Class) this.d).isInstance(tag)) {
            return tag;
        }
        return null;
    }

    public abstract int g();

    public void h() {
        while (true) {
            int i = this.a;
            C3780zt c3780zt = (C3780zt) this.d;
            if (i >= c3780zt.f || c3780zt.c[i] >= 0) {
                return;
            } else {
                this.a = i + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.a < ((C3780zt) this.d).f;
    }

    public abstract boolean i();

    public abstract void j(int i);

    public abstract int k(int i);

    public abstract boolean l();

    public abstract C0519b8 m();

    public abstract double n();

    public abstract int o();

    public abstract int p();

    public abstract long q();

    public abstract float r();

    public void remove() {
        b();
        if (this.b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
        C3780zt c3780zt = (C3780zt) this.d;
        c3780zt.c();
        c3780zt.l(this.b);
        this.b = -1;
        this.c = c3780zt.n;
    }

    public abstract int s();

    public abstract long t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract String y();

    public abstract String z();
}
