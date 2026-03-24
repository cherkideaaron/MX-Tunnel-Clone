package defpackage;

import org.lsposed.lsparanoid.DeobfuscatorHelper;

/* renamed from: iB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2821iB {
    public final AbstractC3733z a;
    public final String b;
    public final Object[] c;
    public final int d;

    public C2821iB(AbstractC0247Nn abstractC0247Nn, String str, Object[] objArr) {
        char cCharAt;
        this.a = abstractC0247Nn;
        this.b = str;
        this.c = objArr;
        int iCharAt = str.charAt(0);
        if (iCharAt >= 55296) {
            int i = iCharAt & DeobfuscatorHelper.MAX_CHUNK_LENGTH;
            int i2 = 1;
            int i3 = 13;
            while (true) {
                int i4 = i2 + 1;
                cCharAt = str.charAt(i2);
                if (cCharAt < 55296) {
                    break;
                }
                i |= (cCharAt & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
            iCharAt = i | (cCharAt << i3);
        }
        this.d = iCharAt;
    }

    public final AbstractC3733z a() {
        return this.a;
    }

    public final Object[] b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final int d() {
        int i = this.d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
