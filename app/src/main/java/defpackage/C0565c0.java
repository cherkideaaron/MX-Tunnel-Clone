package defpackage;

import android.os.Build;
import android.os.Bundle;

/* renamed from: c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0565c0 implements InterfaceC0209Lj, InterfaceC0525bE {
    public final Object a;

    public C0565c0() {
        this.a = Build.VERSION.SDK_INT >= 26 ? new C0511b0(this) : new C0456a0(this);
    }

    public Z a(int i) {
        return null;
    }

    public Z b(int i) {
        return null;
    }

    public boolean c(int i, int i2, Bundle bundle) {
        return false;
    }

    @Override // defpackage.InterfaceC3203pA
    public Object get() {
        return this.a;
    }

    public /* synthetic */ C0565c0(Object obj) {
        this.a = obj;
    }
}
