package defpackage;

import android.os.Build;

/* renamed from: w7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3579w7 extends AbstractC0218Mb {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3579w7(AbstractC0595cc abstractC0595cc, int i) {
        super(abstractC0595cc);
        this.e = i;
    }

    @Override // defpackage.AbstractC0218Mb
    public final boolean a(C2834iO c2834iO) {
        int i = this.e;
        C2675fc c2675fc = c2834iO.j;
        switch (i) {
            case 0:
                return c2675fc.b;
            case 1:
                return c2675fc.d;
            case 2:
                return c2675fc.a == 2;
            case 3:
                int i2 = c2675fc.a;
                return i2 == 3 || (Build.VERSION.SDK_INT >= 30 && i2 == 6);
            default:
                return c2675fc.e;
        }
    }

    @Override // defpackage.AbstractC0218Mb
    public final boolean b(Object obj) {
        switch (this.e) {
            case 0:
                return !((Boolean) obj).booleanValue();
            case 1:
                return !((Boolean) obj).booleanValue();
            case 2:
                C3243pw c3243pw = (C3243pw) obj;
                return Build.VERSION.SDK_INT >= 26 ? (c3243pw.a && c3243pw.b) ? false : true : true ^ c3243pw.a;
            case 3:
                C3243pw c3243pw2 = (C3243pw) obj;
                return !c3243pw2.a || c3243pw2.c;
            default:
                return !((Boolean) obj).booleanValue();
        }
    }
}
