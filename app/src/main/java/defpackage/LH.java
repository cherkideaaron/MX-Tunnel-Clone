package defpackage;

import com.google.firebase.datatransport.TransportRegistrar;

/* loaded from: classes2.dex */
public final /* synthetic */ class LH implements JH, KI, InterfaceC2665fK, InterfaceC2892jb {
    public static final LH b = new LH(2);
    public static final LH c = new LH(3);
    public static final LH d = new LH(4);
    public static final LH e = new LH(5);
    public static final LH f = new LH(6);
    public final /* synthetic */ int a;

    public /* synthetic */ LH(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC2665fK
    public void a(Exception exc) {
    }

    public void b(OJ oj, PJ pj) {
        switch (this.a) {
            case 2:
                oj.d(pj);
                break;
            case 3:
                oj.e(pj);
                break;
            case 4:
                oj.g(pj);
                break;
            case 5:
                oj.b();
                break;
            default:
                oj.f();
                break;
        }
    }

    @Override // defpackage.InterfaceC2892jb
    public Object d(C2811i1 c2811i1) {
        switch (this.a) {
            case 8:
                return TransportRegistrar.lambda$getComponents$0(c2811i1);
            case 9:
                return TransportRegistrar.lambda$getComponents$1(c2811i1);
            default:
                return TransportRegistrar.lambda$getComponents$2(c2811i1);
        }
    }

    @Override // defpackage.JH
    public Object get() {
        throw new IllegalStateException();
    }
}
