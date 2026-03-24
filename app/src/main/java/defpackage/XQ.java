package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes2.dex */
public final class XQ extends VP {
    public final /* synthetic */ AbstractC2739gl a;
    public final /* synthetic */ C0428Yh b;
    public final /* synthetic */ FirebaseAuth c;

    public XQ(C3597wP c3597wP, AbstractC2739gl abstractC2739gl, C0428Yh c0428Yh) {
        this.a = abstractC2739gl;
        this.b = c0428Yh;
        this.c = c3597wP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [eQ, zk] */
    @Override // defpackage.VP
    public final Task e(String str) {
        Log.i("FirebaseAuth", TextUtils.isEmpty(str) ? "Linking email account with empty reCAPTCHA token" : "Got reCAPTCHA token for linking email account");
        FirebaseAuth firebaseAuth = this.c;
        return firebaseAuth.e.zza(firebaseAuth.a, this.a, (AbstractC2814i4) this.b, str, (InterfaceC2616eQ) new C3771zk(firebaseAuth, 0));
    }
}
