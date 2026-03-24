package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: com.facebook.ads.redexgen.X.0n, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class C0n extends C0q {
    @Override // com.facebook.ads.redexgen.core.C1217Pg
    public final C1232Py A07(View view, C1232Py c1232Py) {
        WindowInsets result = (WindowInsets) C1232Py.A01(c1232Py);
        WindowInsets unwrapped = view.dispatchApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C1232Py.A00(result);
    }

    @Override // com.facebook.ads.redexgen.core.C1217Pg
    public final C1232Py A08(View view, C1232Py c1232Py) {
        WindowInsets result = (WindowInsets) C1232Py.A01(c1232Py);
        WindowInsets unwrapped = view.onApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C1232Py.A00(result);
    }

    @Override // com.facebook.ads.redexgen.core.C1217Pg
    public final void A0A(View view) {
        view.stopNestedScroll();
    }

    @Override // com.facebook.ads.redexgen.core.C1217Pg
    public final void A0E(View view, PR pr) {
        if (pr == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC1216Pf(this, pr));
        }
    }
}
