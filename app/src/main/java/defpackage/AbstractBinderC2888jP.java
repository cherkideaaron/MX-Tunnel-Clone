package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: jP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2888jP extends XO implements InterfaceC2943kP {
    @Override // defpackage.XO
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        Bundle bundle = (Bundle) YO.a(parcel, Bundle.CREATOR);
        YO.b(parcel);
        b(bundle);
        return true;
    }
}
