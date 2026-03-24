package defpackage;

import java.io.File;

/* renamed from: hk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2793hk extends AbstractC3400sr implements InterfaceC0606cn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2793hk(Object obj, int i) {
        super(0);
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC0606cn
    public final Object invoke() {
        switch (this.a) {
            case 0:
                Object obj = C2847ik.e;
                File file = (File) this.b;
                synchronized (obj) {
                    C2847ik.d.remove(file.getAbsolutePath());
                }
                return DK.a;
            case 1:
                ((InterfaceC2680fh) this.b).c();
                return DK.a;
            default:
                File file2 = (File) ((InterfaceC0606cn) this.b).invoke();
                AbstractC0500aq.m(file2, "<this>");
                String name = file2.getName();
                AbstractC0500aq.l(name, "getName(...)");
                if (AbstractC0500aq.b(AbstractC3481uH.o0(name, ""), "preferences_pb")) {
                    File absoluteFile = file2.getAbsoluteFile();
                    AbstractC0500aq.l(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }
}
