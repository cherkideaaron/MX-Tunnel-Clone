package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;

/* renamed from: Ue, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0357Ue extends AbstractC3400sr implements InterfaceC0606cn {
    public final /* synthetic */ int a;
    public final /* synthetic */ C3658xf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0357Ue(C3658xf c3658xf, int i) {
        super(0);
        this.a = i;
        this.b = c3658xf;
    }

    @Override // defpackage.InterfaceC0606cn
    public final Object invoke() throws IOException {
        switch (this.a) {
            case 0:
                return ((C3011lk) this.b.j.getValue()).c;
            default:
                C2847ik c2847ik = (C2847ik) this.b.a;
                File canonicalFile = ((File) c2847ik.c.invoke()).getCanonicalFile();
                synchronized (C2847ik.e) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = C2847ik.d;
                    if (!(!linkedHashSet.contains(absolutePath))) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    AbstractC0500aq.l(absolutePath, "path");
                    linkedHashSet.add(absolutePath);
                }
                return new C3011lk(canonicalFile, c2847ik.a, (InterfaceC0334Sp) c2847ik.b.invoke(canonicalFile), new C2793hk(canonicalFile, 0));
        }
    }
}
