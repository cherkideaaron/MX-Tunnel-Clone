package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;
import org.json.JSONException;

/* renamed from: zk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3771zk implements LP, MQ {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseAuth b;

    public C3771zk(FirebaseAuth firebaseAuth, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = firebaseAuth;
                break;
            default:
                Objects.requireNonNull(firebaseAuth);
                this.b = firebaseAuth;
                break;
        }
    }

    @Override // defpackage.MQ
    public final void a(zzahv zzahvVar, AbstractC2739gl abstractC2739gl) throws JSONException {
        switch (this.a) {
            case 0:
                Preconditions.checkNotNull(zzahvVar);
                Preconditions.checkNotNull(abstractC2739gl);
                BP bp = (BP) abstractC2739gl;
                bp.getClass();
                bp.a = (zzahv) Preconditions.checkNotNull(zzahvVar);
                FirebaseAuth firebaseAuth = this.b;
                firebaseAuth.getClass();
                FirebaseAuth.e(firebaseAuth, abstractC2739gl, zzahvVar, true, true);
                break;
            default:
                FirebaseAuth firebaseAuth2 = this.b;
                firebaseAuth2.getClass();
                FirebaseAuth.e(firebaseAuth2, abstractC2739gl, zzahvVar, true, true);
                break;
        }
    }

    @Override // defpackage.LP
    public final void zza(Status status) {
        switch (this.a) {
            case 0:
                if (status.getStatusCode() == 17011 || status.getStatusCode() == 17021 || status.getStatusCode() == 17005 || status.getStatusCode() == 17091) {
                    this.b.c();
                    break;
                }
                break;
            default:
                int statusCode = status.getStatusCode();
                if (statusCode == 17011 || statusCode == 17021 || statusCode == 17005) {
                    this.b.c();
                    break;
                }
                break;
        }
    }
}
