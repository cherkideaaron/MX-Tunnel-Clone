package defpackage;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public abstract class AJ {
    public final TopicsManager a;

    public AJ(TopicsManager topicsManager) {
        AbstractC0500aq.m(topicsManager, "mTopicsManager");
        this.a = topicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object d(defpackage.AJ r4, defpackage.C0417Xn r5, defpackage.InterfaceC3493uc r6) {
        /*
            boolean r0 = r6 instanceof defpackage.C3753zJ
            if (r0 == 0) goto L13
            r0 = r6
            zJ r0 = (defpackage.C3753zJ) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            zJ r0 = new zJ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            AJ r4 = r0.a
            defpackage.AbstractC0115Ga.U(r6)
            goto L5f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.AbstractC0115Ga.U(r6)
            android.adservices.topics.GetTopicsRequest r5 = r4.a(r5)
            r0.a = r4
            r0.d = r3
            B8 r6 = new B8
            uc r0 = defpackage.AbstractC0069Df.C(r0)
            r6.<init>(r3, r0)
            r6.s()
            android.adservices.topics.TopicsManager r0 = r4.a
            P3 r2 = new P3
            r3 = 1
            r2.<init>(r3)
            xc r3 = new xc
            r3.<init>(r6)
            defpackage.AbstractC0434Yn.x(r0, r5, r2, r3)
            java.lang.Object r6 = r6.r()
            if (r6 != r1) goto L5f
            return r1
        L5f:
            android.adservices.topics.GetTopicsResponse r5 = defpackage.AbstractC0434Yn.j(r6)
            Zn r4 = r4.b(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AJ.d(AJ, Xn, uc):java.lang.Object");
    }

    public GetTopicsRequest a(C0417Xn c0417Xn) {
        AbstractC0500aq.m(c0417Xn, "request");
        GetTopicsRequest getTopicsRequestBuild = AbstractC0434Yn.f().setAdsSdkName(c0417Xn.a).build();
        AbstractC0500aq.l(getTopicsRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestBuild;
    }

    public C0451Zn b(GetTopicsResponse getTopicsResponse) {
        AbstractC0500aq.m(getTopicsResponse, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = getTopicsResponse.getTopics().iterator();
        while (it.hasNext()) {
            Topic topicK = AbstractC0434Yn.k(it.next());
            arrayList.add(new C3483uJ(topicK.getTaxonomyVersion(), topicK.getModelVersion(), topicK.getTopicId()));
        }
        return new C0451Zn(arrayList);
    }

    @Nullable
    public Object c(@NotNull C0417Xn c0417Xn, @NotNull InterfaceC3493uc interfaceC3493uc) {
        return d(this, c0417Xn, interfaceC3493uc);
    }
}
