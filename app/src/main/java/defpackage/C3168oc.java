package defpackage;

import android.net.Uri;

/* renamed from: oc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3168oc {
    public final Uri a;
    public final boolean b;

    public C3168oc(Uri uri, boolean z) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3168oc.class != obj.getClass()) {
            return false;
        }
        C3168oc c3168oc = (C3168oc) obj;
        return this.b == c3168oc.b && this.a.equals(c3168oc.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1 : 0);
    }
}
