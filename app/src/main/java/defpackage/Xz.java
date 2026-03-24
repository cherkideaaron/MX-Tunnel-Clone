package defpackage;

import androidx.webkit.ProfileStore;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* loaded from: classes.dex */
public final class Xz implements ProfileStore {
    public static Xz b;
    public final ProfileStoreBoundaryInterface a;

    public Xz(ProfileStoreBoundaryInterface profileStoreBoundaryInterface) {
        this.a = profileStoreBoundaryInterface;
    }

    @Override // androidx.webkit.ProfileStore
    public final boolean deleteProfile(String str) {
        if (VM.g.b()) {
            return this.a.deleteProfile(str);
        }
        throw VM.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final List getAllProfileNames() {
        if (VM.g.b()) {
            return this.a.getAllProfileNames();
        }
        throw VM.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final Tz getOrCreateProfile(String str) {
        if (VM.g.b()) {
            return new C2827iH((ProfileBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(ProfileBoundaryInterface.class, this.a.getOrCreateProfile(str)), 23);
        }
        throw VM.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final Tz getProfile(String str) {
        if (!VM.g.b()) {
            throw VM.a();
        }
        InvocationHandler profile = this.a.getProfile(str);
        if (profile != null) {
            return new C2827iH((ProfileBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(ProfileBoundaryInterface.class, profile), 23);
        }
        return null;
    }
}
