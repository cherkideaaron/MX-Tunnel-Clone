package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.b0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1549b0 {
    public static String[] A07 = {"MaUhfef1XHChQSOAsPU", "01oMUC4JT554rhL", "9TYVZPZrh7WqyaB", "ShOi1FYvFM9bF84GqYiu0GZZ4HOF35Af", "s", "YvdeaQsxQHJ3CZVDgFIjqRdATcpqYXuO", "b384kAccrLIUxrnk6NdGu", "f4PnsWwvvRSNWXAtteJ0H"};
    public final String A00 = C1549b0.class.getSimpleName();
    public final WeakReference<AtomicBoolean> A01;
    public final WeakReference<AtomicBoolean> A02;
    public final WeakReference<InterfaceC1127Lt> A03;
    public final WeakReference<InterfaceC1550b1> A04;
    public final WeakReference<C1846fp> A05;
    public final WeakReference<LV> A06;

    public C1549b0(LV lv, InterfaceC1550b1 interfaceC1550b1, C1846fp c1846fp, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, C1901gi c1901gi) {
        this.A06 = new WeakReference<>(lv);
        this.A04 = new WeakReference<>(interfaceC1550b1);
        this.A05 = new WeakReference<>(c1846fp);
        this.A01 = new WeakReference<>(atomicBoolean);
        this.A02 = new WeakReference<>(atomicBoolean2);
        this.A03 = new WeakReference<>(c1901gi.A0F());
    }

    private InterfaceC1127Lt A00() {
        InterfaceC1127Lt funnel = this.A03.get();
        if (funnel == null) {
            return new C2121kX();
        }
        return funnel;
    }

    @JavascriptInterface
    public void alert(String str) {
        Log.e(this.A00, str);
    }

    @JavascriptInterface
    public String getAnalogInfo() {
        return AbstractC1412Xd.A01(C1323Tn.A02());
    }

    @JavascriptInterface
    public void logFunnel(int i, String str) {
        A00().AKr(i, str);
    }

    @JavascriptInterface
    public void onMainAssetLoaded() {
        A00().AKs();
        if (this.A06.get() != null && this.A01.get() != null && this.A02.get() != null && this.A02.get().get()) {
            this.A01.get().set(true);
            A00().AKt();
            if (this.A06.get().isShown()) {
                A00().AKu();
                new Handler(Looper.getMainLooper()).post(new C1115Lh(this.A05));
            }
            InterfaceC1550b1 interfaceC1550b1 = this.A04.get();
            if (interfaceC1550b1 != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC1548az(this, interfaceC1550b1));
            }
        }
    }

    @JavascriptInterface
    public void onPageInitialized() {
        LV webView = this.A06.get();
        if (webView == null || webView.A0J()) {
            A00().AKv(true);
            return;
        }
        InterfaceC1550b1 interfaceC1550b1 = this.A04.get();
        if (interfaceC1550b1 == null) {
            A00().AKv(true);
            return;
        }
        InterfaceC1127Lt interfaceC1127LtA00 = A00();
        String[] strArr = A07;
        if (strArr[3].charAt(2) == strArr[5].charAt(2)) {
            throw new RuntimeException();
        }
        A07[6] = "MExJxptNjWm815DyzsGP1";
        interfaceC1127LtA00.AKv(false);
        interfaceC1550b1.AF8();
    }
}
