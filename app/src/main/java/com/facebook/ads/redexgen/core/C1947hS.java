package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.hS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1947hS implements InterfaceC1442Yh {
    public static String[] A01 = {"8tOzOPKLz5DDIwqC88XBXxH90bmVDotF", "YCktuRbEMhZaz9U821mncTHWO05lwCqY", "Eq7g3criU65KDBPK", "XEHycrxPk7FQv1FkL381pmPNBNbKujpl", "niYnM4G6gzmxtC7fq", "sRQOtQAi", "8G5qrnHnaOtx52JqPPi", "6arHmIfqlBfM2iqNpfy3RxuQJelIt1eI"};
    public final WeakReference<C1263Re> A00;

    public C1947hS(C1263Re c1263Re) {
        this.A00 = new WeakReference<>(c1263Re);
    }

    private void A00(C1263Re c1263Re) {
        C1749eF c1749eFA07 = c1263Re.A07();
        if (c1749eFA07 != null && c1263Re.A04() != null) {
            c1263Re.A04().bringChildToFront(c1749eFA07);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1442Yh
    public void A44(View view, int i, RelativeLayout.LayoutParams layoutParams) {
        C1263Re c1263Re = this.A00.get();
        if (c1263Re != null && c1263Re.A04() != null) {
            c1263Re.A04().addView(view, i, layoutParams);
            A00(c1263Re);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1442Yh
    public void A45(View view, RelativeLayout.LayoutParams layoutParams) {
        C1263Re c1263Re = this.A00.get();
        if (c1263Re != null && c1263Re.A04() != null) {
            c1263Re.A04().addView(view, layoutParams);
            A00(c1263Re);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1442Yh
    public void A4j(String str) {
        if (this.A00.get() != null) {
            this.A00.get().A0C(str);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1442Yh
    public void A4k(String str, UL ul) {
        if (this.A00.get() != null) {
            this.A00.get().A0E(str, ul);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1442Yh
    public void AAo(String str, C1171Nm c1171Nm) {
        if (this.A00.get() != null) {
            WeakReference<C1263Re> weakReference = this.A00;
            if (A01[4].length() == 0) {
                throw new RuntimeException();
            }
            A01[2] = "IO1gKUYJJG6YtU6JnI8y";
            weakReference.get().A0D(str, c1171Nm);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1442Yh
    public void ADJ(int i) {
        C1263Re activityApi = this.A00.get();
        if (activityApi != null) {
            activityApi.finish(i);
        }
    }
}
