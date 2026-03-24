package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.app.sdksandbox.sdkprovider.SdkSandboxController;

/* renamed from: Yn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0434Yn {
    public static /* bridge */ /* synthetic */ Class C() {
        return TopicsManager.class;
    }

    public static /* bridge */ /* synthetic */ Class D() {
        return SdkSandboxController.class;
    }

    public static /* bridge */ /* synthetic */ MeasurementManager e(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* synthetic */ GetTopicsRequest.Builder f() {
        return new GetTopicsRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ GetTopicsResponse j(Object obj) {
        return (GetTopicsResponse) obj;
    }

    public static /* bridge */ /* synthetic */ Topic k(Object obj) {
        return (Topic) obj;
    }

    public static /* bridge */ /* synthetic */ TopicsManager m(Object obj) {
        return (TopicsManager) obj;
    }

    public static /* bridge */ /* synthetic */ SdkSandboxController q(Object obj) {
        return (SdkSandboxController) obj;
    }

    public static /* bridge */ /* synthetic */ Class s() {
        return MeasurementManager.class;
    }
}
