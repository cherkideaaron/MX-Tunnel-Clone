package defpackage;

import android.transition.Transition;
import androidx.fragment.app.e;
import androidx.fragment.app.l;
import androidx.fragment.app.z;

/* renamed from: hg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2789hg extends e {
    public final Object c;
    public final boolean d;
    public final Object e;

    public C2789hg(z zVar, D8 d8, boolean z, boolean z2) {
        boolean allowReturnTransitionOverlap;
        super(zVar, d8);
        int i = zVar.a;
        l lVar = zVar.c;
        if (i == 2) {
            this.c = z ? lVar.getReenterTransition() : lVar.getEnterTransition();
            allowReturnTransitionOverlap = z ? lVar.getAllowReturnTransitionOverlap() : lVar.getAllowEnterTransitionOverlap();
        } else {
            this.c = z ? lVar.getReturnTransition() : lVar.getExitTransition();
            allowReturnTransitionOverlap = true;
        }
        this.d = allowReturnTransitionOverlap;
        this.e = z2 ? z ? lVar.getSharedElementReturnTransition() : lVar.getSharedElementEnterTransition() : null;
    }

    public final AbstractC0263Om c(Object obj) {
        if (obj == null) {
            return null;
        }
        C0229Mm c0229Mm = AbstractC0144Hm.a;
        if (obj instanceof Transition) {
            return c0229Mm;
        }
        AbstractC0263Om abstractC0263Om = AbstractC0144Hm.b;
        if (abstractC0263Om != null && abstractC0263Om.e(obj)) {
            return abstractC0263Om;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.a.c + " is not a valid framework Transition or AndroidX Transition");
    }
}
