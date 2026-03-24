package defpackage;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* renamed from: yN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3703yN {
    public static final AN b;
    public final AN a;

    static {
        int i = Build.VERSION.SDK_INT;
        b = (i >= 30 ? new C3271qN() : i >= 29 ? new C3216pN() : new C3161oN()).b().a.a().a.b().a.c();
    }

    public C3703yN(AN an) {
        this.a = an;
    }

    public AN a() {
        return this.a;
    }

    public AN b() {
        return this.a;
    }

    public AN c() {
        return this.a;
    }

    public C2571dh e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3703yN)) {
            return false;
        }
        C3703yN c3703yN = (C3703yN) obj;
        return n() == c3703yN.n() && m() == c3703yN.m() && Objects.equals(j(), c3703yN.j()) && Objects.equals(h(), c3703yN.h()) && Objects.equals(e(), c3703yN.e());
    }

    public C0130Gp f(int i) {
        return C0130Gp.e;
    }

    public C0130Gp g() {
        return j();
    }

    public C0130Gp h() {
        return C0130Gp.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public C0130Gp i() {
        return j();
    }

    public C0130Gp j() {
        return C0130Gp.e;
    }

    public C0130Gp k() {
        return j();
    }

    public AN l(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void d(View view) {
    }

    public void o(C0130Gp[] c0130GpArr) {
    }

    public void p(AN an) {
    }

    public void q(C0130Gp c0130Gp) {
    }
}
