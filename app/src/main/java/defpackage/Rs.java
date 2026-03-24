package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class Rs extends Ns {
    public final Or a;
    public final Qs b;

    public Rs(Or or, C2667fM c2667fM) {
        this.a = or;
        this.b = (Qs) new C2524cp(c2667fM, Qs.d).r(Qs.class);
    }

    public final void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Qs qs = this.b;
        if (qs.b.c <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String str2 = str + "    ";
        int i = 0;
        while (true) {
            C3534vG c3534vG = qs.b;
            if (i >= c3534vG.c) {
                return;
            }
            Os os = (Os) c3534vG.b[i];
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(qs.b.a[i]);
            printWriter.print(": ");
            printWriter.println(os.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(os.l);
            printWriter.print(" mArgs=");
            printWriter.println(os.m);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println(os.n);
            os.n.dump(AbstractC3264qG.g(str2, "  "), fileDescriptor, printWriter, strArr);
            if (os.p != null) {
                printWriter.print(str2);
                printWriter.print("mCallbacks=");
                printWriter.println(os.p);
                Ps ps = os.p;
                ps.getClass();
                printWriter.print(str2 + "  ");
                printWriter.print("mDeliveredData=");
                printWriter.println(ps.c);
            }
            printWriter.print(str2);
            printWriter.print("mData=");
            Ls ls = os.n;
            Object obj = os.e;
            if (obj == Is.k) {
                obj = null;
            }
            printWriter.println(ls.dataToString(obj));
            printWriter.print(str2);
            printWriter.print("mStarted=");
            printWriter.println(os.c > 0);
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(UserVerificationMethods.USER_VERIFY_PATTERN);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractC0115Ga.f(this.a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
