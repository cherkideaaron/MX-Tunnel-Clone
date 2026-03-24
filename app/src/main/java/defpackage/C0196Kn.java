package defpackage;

/* renamed from: Kn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0196Kn implements Vu {
    public static final C0196Kn b = new C0196Kn(0);
    public final /* synthetic */ int a;

    public /* synthetic */ C0196Kn(int i) {
        this.a = i;
    }

    @Override // defpackage.Vu
    public final C2821iB a(Class cls) {
        switch (this.a) {
            case 0:
                if (!AbstractC0247Nn.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C2821iB) AbstractC0247Nn.g(cls.asSubclass(AbstractC0247Nn.class)).f(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.Vu
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return AbstractC0247Nn.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
