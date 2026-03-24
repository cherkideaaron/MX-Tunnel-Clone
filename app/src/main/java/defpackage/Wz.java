package defpackage;

import androidx.webkit.ProfileStore;

/* loaded from: classes.dex */
public abstract /* synthetic */ class Wz {
    public static ProfileStore a() {
        if (!VM.g.b()) {
            throw VM.a();
        }
        if (Xz.b == null) {
            Xz.b = new Xz(WM.a.getProfileStore());
        }
        return Xz.b;
    }
}
