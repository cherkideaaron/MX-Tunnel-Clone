package defpackage;

import java.io.File;
import java.util.Map;

/* renamed from: gk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2738gk extends AbstractC3400sr implements InterfaceC2631en {
    public static final C2738gk b = new C2738gk(1, 0);
    public static final C2738gk c = new C2738gk(1, 1);
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2738gk(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // defpackage.InterfaceC2631en
    public final Object invoke(Object obj) {
        String strValueOf;
        switch (this.a) {
            case 0:
                File file = (File) obj;
                AbstractC0500aq.m(file, "it");
                String absolutePath = file.getCanonicalFile().getAbsolutePath();
                AbstractC0500aq.l(absolutePath, "file.canonicalFile.absolutePath");
                return new C0472aG(absolutePath);
            default:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC0500aq.m(entry, "entry");
                Object value = entry.getValue();
                if (value instanceof byte[]) {
                    byte[] bArr = (byte[]) value;
                    AbstractC0500aq.m(bArr, "<this>");
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) "[");
                    int i = 0;
                    for (byte b2 : bArr) {
                        i++;
                        if (i > 1) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append((CharSequence) String.valueOf((int) b2));
                    }
                    sb.append((CharSequence) "]");
                    strValueOf = sb.toString();
                } else {
                    strValueOf = String.valueOf(entry.getValue());
                }
                return Vs.o(new StringBuilder("  "), ((C3081mz) entry.getKey()).a, " = ", strValueOf);
        }
    }
}
