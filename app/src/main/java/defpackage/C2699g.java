package defpackage;

/* renamed from: g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2699g extends Cy {
    public static final C2699g a = new C2699g();

    @Override // defpackage.Cy
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.Cy
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
