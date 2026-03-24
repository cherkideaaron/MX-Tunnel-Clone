package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.q;

/* renamed from: Wa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0387Wa extends V0 {
    public final /* synthetic */ AbstractActivityC2619eb h;

    public C0387Wa(q qVar) {
        this.h = qVar;
    }

    @Override // defpackage.V0
    public final void b(int i, O0 o0, Object obj) {
        Bundle bundle;
        AbstractActivityC2619eb abstractActivityC2619eb = this.h;
        C0565c0 c0565c0B = o0.b(abstractActivityC2619eb, obj);
        if (c0565c0B != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC2921k3(this, i, c0565c0B, 2));
            return;
        }
        Intent intentA = o0.a(abstractActivityC2619eb, obj);
        if (intentA.getExtras() != null && intentA.getExtras().getClassLoader() == null) {
            intentA.setExtrasClassLoader(abstractActivityC2619eb.getClassLoader());
        }
        if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
            String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            AbstractC0115Ga.P(abstractActivityC2619eb, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
            abstractActivityC2619eb.startActivityForResult(intentA, i, bundle);
            return;
        }
        C0317Rp c0317Rp = (C0317Rp) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            abstractActivityC2619eb.startIntentSenderForResult(c0317Rp.a, i, c0317Rp.b, c0317Rp.c, c0317Rp.d, 0, bundle);
        } catch (IntentSender.SendIntentException e) {
            new Handler(Looper.getMainLooper()).post(new RunnableC2921k3(this, i, e, 3));
        }
    }
}
