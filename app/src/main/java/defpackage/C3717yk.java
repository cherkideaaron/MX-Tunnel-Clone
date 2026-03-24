package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;
import org.json.JSONException;

/* renamed from: yk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3717yk implements MQ {
    public final /* synthetic */ FirebaseAuth a;

    public C3717yk(FirebaseAuth firebaseAuth) {
        Objects.requireNonNull(firebaseAuth);
        this.a = firebaseAuth;
    }

    @Override // defpackage.MQ
    public final void a(zzahv zzahvVar, AbstractC2739gl abstractC2739gl) throws JSONException {
        Preconditions.checkNotNull(zzahvVar);
        Preconditions.checkNotNull(abstractC2739gl);
        BP bp = (BP) abstractC2739gl;
        bp.getClass();
        bp.a = (zzahv) Preconditions.checkNotNull(zzahvVar);
        FirebaseAuth firebaseAuth = this.a;
        firebaseAuth.getClass();
        FirebaseAuth.e(firebaseAuth, abstractC2739gl, zzahvVar, true, false);
    }
}
