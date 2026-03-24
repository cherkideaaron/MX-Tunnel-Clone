package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;

/* loaded from: classes2.dex */
public abstract class LQ {
    public static zzajb a(AbstractC2814i4 abstractC2814i4, String str) {
        Preconditions.checkNotNull(abstractC2814i4);
        if (abstractC2814i4 instanceof C2687fo) {
            C2687fo c2687fo = (C2687fo) abstractC2814i4;
            Preconditions.checkNotNull(c2687fo);
            return new zzajb(c2687fo.a, c2687fo.b, "google.com", null, null, null, str, null, null);
        }
        if (abstractC2814i4 instanceof C0022Aj) {
            C0022Aj c0022Aj = (C0022Aj) abstractC2814i4;
            Preconditions.checkNotNull(c0022Aj);
            return new zzajb(null, c0022Aj.a, "facebook.com", null, null, null, str, null, null);
        }
        if (abstractC2814i4 instanceof C2830iK) {
            C2830iK c2830iK = (C2830iK) abstractC2814i4;
            Preconditions.checkNotNull(c2830iK);
            return new zzajb(null, c2830iK.a, "twitter.com", null, c2830iK.b, null, str, null, null);
        }
        if (abstractC2814i4 instanceof C0553bo) {
            C0553bo c0553bo = (C0553bo) abstractC2814i4;
            Preconditions.checkNotNull(c0553bo);
            return new zzajb(null, c0553bo.a, "github.com", null, null, null, str, null, null);
        }
        if (abstractC2814i4 instanceof Yy) {
            Yy yy = (Yy) abstractC2814i4;
            Preconditions.checkNotNull(yy);
            yy.getClass();
            return new zzajb(null, null, "playgames.google.com", null, null, yy.a, str, null, null);
        }
        if (!(abstractC2814i4 instanceof C3382sQ)) {
            throw new IllegalArgumentException("Unsupported credential type.");
        }
        C3382sQ c3382sQ = (C3382sQ) abstractC2814i4;
        Preconditions.checkNotNull(c3382sQ);
        zzajb zzajbVar = c3382sQ.d;
        if (zzajbVar != null) {
            return zzajbVar;
        }
        return new zzajb(c3382sQ.b, c3382sQ.c, c3382sQ.a, null, c3382sQ.f, null, str, c3382sQ.e, c3382sQ.m);
    }
}
