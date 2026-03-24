package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.Vm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1373Vm {
    public final AdErrorType A00;
    public final String A01;

    public C1373Vm(int i, String str) {
        this(AdErrorType.adErrorTypeFromCode(i), str);
    }

    public C1373Vm(AdErrorType adErrorType, String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static C1373Vm A00(AdErrorType adErrorType) {
        return new C1373Vm(adErrorType, (String) null);
    }

    public static C1373Vm A01(AdErrorType adErrorType, String str) {
        return new C1373Vm(adErrorType, str);
    }

    public static C1373Vm A02(C1374Vn c1374Vn) {
        return new C1373Vm(c1374Vn.A00(), c1374Vn.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
