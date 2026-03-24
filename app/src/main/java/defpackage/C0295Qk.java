package defpackage;

import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;

/* renamed from: Qk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0295Qk implements OnSuccessListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseMessaging b;

    public /* synthetic */ C0295Qk(FirebaseMessaging firebaseMessaging, int i) {
        this.a = i;
        this.b = firebaseMessaging;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) throws NumberFormatException {
        boolean z;
        switch (this.a) {
            case 0:
                DJ dj = (DJ) obj;
                if (!this.b.e.b() || dj.h.a() == null) {
                    return;
                }
                synchronized (dj) {
                    z = dj.g;
                }
                if (z) {
                    return;
                }
                dj.h(0L);
                return;
            default:
                CloudMessage cloudMessage = (CloudMessage) obj;
                C2524cp c2524cp = FirebaseMessaging.k;
                FirebaseMessaging firebaseMessaging = this.b;
                firebaseMessaging.getClass();
                if (cloudMessage != null) {
                    AbstractC0115Ga.J(cloudMessage.getIntent());
                    ((Rpc) firebaseMessaging.c.c).getProxiedNotificationData().addOnSuccessListener(firebaseMessaging.f, new C0295Qk(firebaseMessaging, 1));
                    return;
                }
                return;
        }
    }
}
