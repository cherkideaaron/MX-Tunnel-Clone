package defpackage;

import java.io.File;
import java.util.Comparator;

/* renamed from: Zc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0440Zc implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ C0440Zc(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 1:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 2:
                String name = ((File) obj).getName();
                int i = C0254Od.f;
                return name.substring(0, i).compareTo(((File) obj2).getName().substring(0, i));
            case 3:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    byte b = bArr[i2];
                    byte b2 = bArr2[i2];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            default:
                return ((C3739z5) ((AbstractC3114nd) obj)).a.compareTo(((C3739z5) ((AbstractC3114nd) obj2)).a);
        }
    }
}
