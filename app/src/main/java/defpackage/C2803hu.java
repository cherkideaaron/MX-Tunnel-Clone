package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.adservices.topics.TopicsManager;
import android.content.Context;

/* renamed from: hu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2803hu extends AbstractC3400sr implements InterfaceC2631en {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2803hu(Context context, int i) {
        super(1);
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.InterfaceC2631en
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        switch (this.a) {
            case 0:
                AbstractC0500aq.m(context, "it");
                Context context2 = this.b;
                AbstractC0500aq.m(context2, "context");
                MeasurementManager measurementManager = MeasurementManager.get(context2);
                AbstractC0500aq.l(measurementManager, "get(context)");
                return new C2856iu(measurementManager);
            case 1:
                AbstractC0500aq.m(context, "it");
                Context context3 = this.b;
                AbstractC0500aq.m(context3, "context");
                TopicsManager topicsManager = TopicsManager.get(context3);
                AbstractC0500aq.l(topicsManager, "get(context)");
                return new C3591wJ(topicsManager, 0);
            default:
                AbstractC0500aq.m(context, "it");
                Context context4 = this.b;
                AbstractC0500aq.m(context4, "context");
                TopicsManager topicsManager2 = TopicsManager.get(context4);
                AbstractC0500aq.l(topicsManager2, "get(context)");
                return new C3591wJ(topicsManager2, 1);
        }
    }
}
