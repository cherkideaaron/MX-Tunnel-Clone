package defpackage;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.TopicsManager;

/* renamed from: wJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3591wJ extends AJ {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3591wJ(TopicsManager topicsManager, int i) {
        super(topicsManager);
        this.b = i;
    }

    @Override // defpackage.AJ
    public GetTopicsRequest a(C0417Xn c0417Xn) {
        switch (this.b) {
            case 0:
                AbstractC0500aq.m(c0417Xn, "request");
                GetTopicsRequest getTopicsRequestBuild = AbstractC0434Yn.f().setAdsSdkName(c0417Xn.a).setShouldRecordObservation(c0417Xn.b).build();
                AbstractC0500aq.l(getTopicsRequestBuild, "Builder()\n            .s…ion)\n            .build()");
                return getTopicsRequestBuild;
            case 1:
                AbstractC0500aq.m(c0417Xn, "request");
                GetTopicsRequest getTopicsRequestBuild2 = AbstractC0434Yn.f().setAdsSdkName(c0417Xn.a).setShouldRecordObservation(c0417Xn.b).build();
                AbstractC0500aq.l(getTopicsRequestBuild2, "Builder()\n            .s…ion)\n            .build()");
                return getTopicsRequestBuild2;
            case 2:
                AbstractC0500aq.m(c0417Xn, "request");
                GetTopicsRequest getTopicsRequestBuild3 = AbstractC0434Yn.f().setAdsSdkName(c0417Xn.a).setShouldRecordObservation(c0417Xn.b).build();
                AbstractC0500aq.l(getTopicsRequestBuild3, "Builder()\n            .s…ion)\n            .build()");
                return getTopicsRequestBuild3;
            case 3:
            default:
                return super.a(c0417Xn);
            case 4:
                AbstractC0500aq.m(c0417Xn, "request");
                GetTopicsRequest getTopicsRequestBuild4 = AbstractC0434Yn.f().setAdsSdkName(c0417Xn.a).setShouldRecordObservation(c0417Xn.b).build();
                AbstractC0500aq.l(getTopicsRequestBuild4, "Builder()\n            .s…ion)\n            .build()");
                return getTopicsRequestBuild4;
        }
    }

    @Override // defpackage.AJ
    public C0451Zn b(GetTopicsResponse getTopicsResponse) {
        switch (this.b) {
            case 0:
                AbstractC0500aq.m(getTopicsResponse, "response");
                return AbstractC0498ao.a(getTopicsResponse);
            case 1:
            default:
                return super.b(getTopicsResponse);
            case 2:
                AbstractC0500aq.m(getTopicsResponse, "response");
                return AbstractC0498ao.a(getTopicsResponse);
        }
    }
}
