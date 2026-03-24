package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;

/* loaded from: classes2.dex */
public final class Az implements InterfaceC3207pE {
    public final String a;
    public final AbstractC3786zz b;

    public Az(String str, AbstractC3786zz abstractC3786zz) {
        this.a = str;
        this.b = abstractC3786zz;
    }

    @Override // defpackage.InterfaceC3207pE
    public final String a() {
        return this.a;
    }

    @Override // defpackage.InterfaceC3207pE
    public final boolean c() {
        return false;
    }

    @Override // defpackage.InterfaceC3207pE
    public final int d(String str) {
        AbstractC0500aq.m(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.InterfaceC3207pE
    public final MO e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Az)) {
            return false;
        }
        Az az = (Az) obj;
        if (AbstractC0500aq.b(this.a, az.a)) {
            if (AbstractC0500aq.b(this.b, az.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC3207pE
    public final int f() {
        return 0;
    }

    @Override // defpackage.InterfaceC3207pE
    public final String g(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.InterfaceC3207pE
    public final List getAnnotations() {
        return C0055Ci.a;
    }

    @Override // defpackage.InterfaceC3207pE
    public final List h(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.InterfaceC3207pE
    public final InterfaceC3207pE i(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.InterfaceC3207pE
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.InterfaceC3207pE
    public final boolean j(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return "PrimitiveDescriptor(" + this.a + ')';
    }
}
