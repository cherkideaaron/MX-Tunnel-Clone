package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* renamed from: qR, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3275qR extends VP {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ AbstractC2739gl c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ FirebaseAuth f;

    public C3275qR(FirebaseAuth firebaseAuth, String str, boolean z, AbstractC2739gl abstractC2739gl, String str2, String str3) {
        this.a = str;
        this.b = z;
        this.c = abstractC2739gl;
        this.d = str2;
        this.e = str3;
        Objects.requireNonNull(firebaseAuth);
        this.f = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [eQ, zk] */
    @Override // defpackage.VP
    public final Task e(String str) {
        StringBuilder sb;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String str2 = this.a;
        if (zIsEmpty) {
            sb = new StringBuilder("Logging in as ");
            sb.append(str2);
            str2 = " with empty reCAPTCHA token";
        } else {
            sb = new StringBuilder("Got reCAPTCHA token for login with email ");
        }
        sb.append(str2);
        Log.i("FirebaseAuth", sb.toString());
        boolean z = this.b;
        FirebaseAuth firebaseAuth = this.f;
        if (!z) {
            return firebaseAuth.e.zzb(firebaseAuth.a, this.a, this.d, this.e, str, new C3717yk(firebaseAuth));
        }
        return firebaseAuth.e.zzb(firebaseAuth.a, (AbstractC2739gl) Preconditions.checkNotNull(this.c), this.a, this.d, this.e, str, new C3771zk(firebaseAuth, 0));
    }
}
