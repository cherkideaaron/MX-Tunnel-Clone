package defpackage;

/* renamed from: yi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3715yi implements InterfaceC3344rp {
    public final boolean a;

    public C3715yi(boolean z) {
        this.a = z;
    }

    @Override // defpackage.InterfaceC3344rp
    public final C3513uw b() {
        return null;
    }

    @Override // defpackage.InterfaceC3344rp
    public final boolean isActive() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
