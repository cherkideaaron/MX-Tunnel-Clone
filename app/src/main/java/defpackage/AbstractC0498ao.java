package defpackage;

import android.adservices.topics.EncryptedTopic;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ao, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0498ao {
    public static C0451Zn a(GetTopicsResponse getTopicsResponse) {
        AbstractC0500aq.m(getTopicsResponse, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = getTopicsResponse.getTopics().iterator();
        while (it.hasNext()) {
            Topic topicK = AbstractC0434Yn.k(it.next());
            arrayList.add(new C3483uJ(topicK.getTaxonomyVersion(), topicK.getModelVersion(), topicK.getTopicId()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (EncryptedTopic encryptedTopic : getTopicsResponse.getEncryptedTopics()) {
            byte[] encryptedTopic2 = encryptedTopic.getEncryptedTopic();
            AbstractC0500aq.l(encryptedTopic2, "encryptedTopic.encryptedTopic");
            String keyIdentifier = encryptedTopic.getKeyIdentifier();
            AbstractC0500aq.l(keyIdentifier, "encryptedTopic.keyIdentifier");
            byte[] encapsulatedKey = encryptedTopic.getEncapsulatedKey();
            AbstractC0500aq.l(encapsulatedKey, "encryptedTopic.encapsulatedKey");
            arrayList2.add(new C0208Li(encryptedTopic2, keyIdentifier, encapsulatedKey));
        }
        return new C0451Zn(arrayList, arrayList2);
    }
}
