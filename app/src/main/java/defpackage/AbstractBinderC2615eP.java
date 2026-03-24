package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: eP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2615eP extends XO implements InterfaceC2670fP {
    @Override // defpackage.XO
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            Bundle bundle = (Bundle) YO.a(parcel, Bundle.CREATOR);
            YO.b(parcel);
            e(bundle);
            return true;
        }
        if (i == 3) {
            Bundle bundle2 = (Bundle) YO.a(parcel, Bundle.CREATOR);
            YO.b(parcel);
            c(bundle2);
            return true;
        }
        if (i == 4) {
            Bundle bundle3 = (Bundle) YO.a(parcel, Bundle.CREATOR);
            YO.b(parcel);
            d(bundle3);
            return true;
        }
        if (i != 5) {
            return false;
        }
        Bundle bundle4 = (Bundle) YO.a(parcel, Bundle.CREATOR);
        YO.b(parcel);
        b(bundle4);
        return true;
    }
}
