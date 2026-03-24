package defpackage;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class MN extends Binder {
    public final C2827iH a;

    public MN(C2827iH c2827iH) {
        this.a = c2827iH;
    }

    public final void a(NN nn) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = nn.a;
        AbstractServiceC0293Qi abstractServiceC0293Qi = (AbstractServiceC0293Qi) this.a.b;
        abstractServiceC0293Qi.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        abstractServiceC0293Qi.a.execute(new RunnableC2736gi(abstractServiceC0293Qi, intent, taskCompletionSource, 1));
        taskCompletionSource.getTask().addOnCompleteListener(new P3(1), new C0285Qa(nn, 18));
    }
}
