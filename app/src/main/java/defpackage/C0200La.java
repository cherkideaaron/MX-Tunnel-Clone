package defpackage;

/* renamed from: La, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0200La implements InterfaceC3493uc {
    public static final C0200La b = new C0200La(0);
    public static final C0200La c = new C0200La(1);
    public final /* synthetic */ int a;

    public /* synthetic */ C0200La(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC3493uc
    public final InterfaceC0168Jc getContext() {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete".toString());
            default:
                return C0021Ai.a;
        }
    }

    @Override // defpackage.InterfaceC3493uc
    public final void resumeWith(Object obj) {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete".toString());
            default:
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void b(Object obj) {
    }
}
