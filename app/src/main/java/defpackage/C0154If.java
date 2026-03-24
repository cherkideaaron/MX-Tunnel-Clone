package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* renamed from: If, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0154If extends C0108Fk {
    @Override // defpackage.C0108Fk
    public final Signature[] h(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
