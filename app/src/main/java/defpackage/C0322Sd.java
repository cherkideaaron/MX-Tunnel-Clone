package defpackage;

/* renamed from: Sd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0322Sd extends AbstractC0094En implements InterfaceC0606cn {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0322Sd(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.a = i3;
    }

    @Override // defpackage.InterfaceC0606cn
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ((C0339Td) this.receiver).getClass();
                String name = Thread.currentThread().getName();
                AbstractC0500aq.l(name, "<get-threadName>(...)");
                break;
            case 1:
                ((C0339Td) this.receiver).getClass();
                String name2 = Thread.currentThread().getName();
                AbstractC0500aq.l(name2, "<get-threadName>(...)");
                break;
            case 2:
                ((C0339Td) this.receiver).getClass();
                break;
            case 3:
                ((C2532cx) this.receiver).c();
                break;
            default:
                ((C2532cx) this.receiver).c();
                break;
        }
        return DK.a;
    }
}
