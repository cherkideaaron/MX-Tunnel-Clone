package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* renamed from: f7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2652f7 extends C2762h7 {
    public final char[] d;

    public C2652f7(C2597e7 c2597e7) {
        super(c2597e7, (Character) null);
        this.d = new char[512];
        char[] cArr = c2597e7.b;
        if (cArr.length != 16) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.d;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | UserVerificationMethods.USER_VERIFY_HANDPRINT] = cArr[i & 15];
        }
    }
}
