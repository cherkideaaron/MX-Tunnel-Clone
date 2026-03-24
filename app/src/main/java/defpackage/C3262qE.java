package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Set;

/* renamed from: qE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3262qE implements InterfaceC3207pE, InterfaceC2763h8 {
    public final InterfaceC3207pE a;
    public final String b;
    public final Set c;

    public C3262qE(InterfaceC3207pE interfaceC3207pE) {
        AbstractC0500aq.m(interfaceC3207pE, "original");
        this.a = interfaceC3207pE;
        this.b = interfaceC3207pE.a() + '?';
        this.c = AbstractC2883jK.k(interfaceC3207pE);
    }

    @Override // defpackage.InterfaceC3207pE
    public final String a() {
        return this.b;
    }

    @Override // defpackage.InterfaceC2763h8
    public final Set b() {
        return this.c;
    }

    @Override // defpackage.InterfaceC3207pE
    public final boolean c() {
        return true;
    }

    @Override // defpackage.InterfaceC3207pE
    public final int d(String str) {
        AbstractC0500aq.m(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return this.a.d(str);
    }

    @Override // defpackage.InterfaceC3207pE
    public final MO e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3262qE) {
            return AbstractC0500aq.b(this.a, ((C3262qE) obj).a);
        }
        return false;
    }

    @Override // defpackage.InterfaceC3207pE
    public final int f() {
        return this.a.f();
    }

    @Override // defpackage.InterfaceC3207pE
    public final String g(int i) {
        return this.a.g(i);
    }

    @Override // defpackage.InterfaceC3207pE
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // defpackage.InterfaceC3207pE
    public final List h(int i) {
        return this.a.h(i);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // defpackage.InterfaceC3207pE
    public final InterfaceC3207pE i(int i) {
        return this.a.i(i);
    }

    @Override // defpackage.InterfaceC3207pE
    public final boolean isInline() {
        return this.a.isInline();
    }

    @Override // defpackage.InterfaceC3207pE
    public final boolean j(int i) {
        return this.a.j(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
