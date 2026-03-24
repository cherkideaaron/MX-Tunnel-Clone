package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* renamed from: vP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3543vP extends VP {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ AbstractC2739gl b;
    public final /* synthetic */ C0428Yh c;
    public final /* synthetic */ FirebaseAuth d;

    public C3543vP(FirebaseAuth firebaseAuth, boolean z, AbstractC2739gl abstractC2739gl, C0428Yh c0428Yh) {
        this.a = z;
        this.b = abstractC2739gl;
        this.c = c0428Yh;
        Objects.requireNonNull(firebaseAuth);
        this.d = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [eQ, zk] */
    @Override // defpackage.VP
    public final Task e(String str) {
        Log.i("FirebaseAuth", TextUtils.isEmpty(str) ? "Email link login/reauth with empty reCAPTCHA token" : "Got reCAPTCHA token for login/reauth with email link");
        boolean z = this.a;
        FirebaseAuth firebaseAuth = this.d;
        if (z) {
            return firebaseAuth.e.zzb(firebaseAuth.a, (AbstractC2739gl) Preconditions.checkNotNull(this.b), this.c, str, (InterfaceC2616eQ) new C3771zk(firebaseAuth, 0));
        }
        return firebaseAuth.e.zza(firebaseAuth.a, this.c, str, (MQ) new C3717yk(firebaseAuth));
    }
}
