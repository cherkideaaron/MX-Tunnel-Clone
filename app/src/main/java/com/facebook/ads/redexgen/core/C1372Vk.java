package com.facebook.ads.redexgen.core;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Vk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1372Vk {
    public final InterfaceC1370Vi A0B;
    public final boolean A0F;
    public final String A0C = C1372Vk.class.getSimpleName();
    public final int A07 = FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS;
    public final int A0A = FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH;
    public final int A08 = FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT;
    public final int A03 = FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION;
    public final int A09 = FacebookMediationAdapter.ERROR_REQUIRES_UNIFIED_NATIVE_ADS;
    public final int A02 = FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE;
    public final int A04 = FacebookMediationAdapter.ERROR_NULL_CONTEXT;
    public final int A05 = FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS;
    public final int A06 = FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD;
    public final int A01 = FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD;
    public final boolean A0E = false;
    public long A00 = -1;
    public final List<C1371Vj> A0D = new LinkedList();

    public C1372Vk(T8 t8, InterfaceC1370Vi interfaceC1370Vi) {
        int nativeViewabilityHistorySamplingRate = AbstractC1353Ur.A0D(t8);
        if (nativeViewabilityHistorySamplingRate < 1) {
            this.A0F = false;
        } else {
            this.A0F = t8.A09().A00() < 1.0d / ((double) nativeViewabilityHistorySamplingRate);
        }
        this.A0B = interfaceC1370Vi;
    }

    private int A00() {
        return this.A0B.A7d();
    }

    private int A01() {
        if (this.A00 > 0) {
            return (int) (System.currentTimeMillis() - this.A00);
        }
        return -1;
    }

    private void A03(C1371Vj c1371Vj) {
        synchronized (this.A0D) {
            this.A0D.add(c1371Vj);
        }
    }

    public final void A04() {
        if (!this.A0F) {
            return;
        }
        A03(new C1371Vj(A01(), FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD, A00(), null));
    }

    public final void A05() {
        if (!this.A0F) {
            return;
        }
        A03(new C1371Vj(A01(), FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE, A00(), null));
    }

    public final void A06() {
        if (!this.A0F) {
            return;
        }
        A03(new C1371Vj(A01(), FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION, A00(), null));
    }

    public final void A07() {
        if (!this.A0F) {
            return;
        }
        A03(new C1371Vj(A01(), FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD, -1, null));
    }

    public final void A08() {
        if (!this.A0F) {
            return;
        }
        A03(new C1371Vj(A01(), FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS, A00(), null));
    }

    public final void A09() {
        if (!this.A0F) {
            return;
        }
        this.A00 = System.currentTimeMillis();
        A03(new C1371Vj(0, FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS, -1, null));
    }

    public final void A0A() {
        if (!this.A0F) {
            return;
        }
        A03(new C1371Vj(A01(), FacebookMediationAdapter.ERROR_REQUIRES_UNIFIED_NATIVE_ADS, A00(), null));
    }

    public final void A0B() {
        if (!this.A0F) {
            return;
        }
        A03(new C1371Vj(A01(), FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH, A00(), null));
    }

    public final void A0C(T8 t8, String str) {
        if (!this.A0F) {
            return;
        }
        A03(new C1371Vj(A01(), FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT, A00(), null));
        YG.A06.execute(new RunnableC1369Vh(this, str, t8));
    }
}
