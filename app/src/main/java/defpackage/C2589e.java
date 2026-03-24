package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2589e implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ C2589e(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC2644f.b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new J7(parcel, (ClassLoader) null);
            case 2:
                return new C3743z9(parcel, null);
            case 3:
                return new C0083Ec(parcel, null);
            case 4:
                return new C3552vh(parcel, null);
            case 5:
                return new C2903jm(parcel, null);
            case 6:
                return new Mt(parcel, null);
            case 7:
                return new DB(parcel, null);
            case 8:
                return new TF(parcel, (ClassLoader) null);
            case 9:
                return new LI(parcel, null);
            default:
                return new C3102nJ(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new AbstractC2644f[i];
            case 1:
                return new J7[i];
            case 2:
                return new C3743z9[i];
            case 3:
                return new C0083Ec[i];
            case 4:
                return new C3552vh[i];
            case 5:
                return new C2903jm[i];
            case 6:
                return new Mt[i];
            case 7:
                return new DB[i];
            case 8:
                return new TF[i];
            case 9:
                return new LI[i];
            default:
                return new C3102nJ[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC2644f.b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new J7(parcel, classLoader);
            case 2:
                return new C3743z9(parcel, classLoader);
            case 3:
                return new C0083Ec(parcel, classLoader);
            case 4:
                return new C3552vh(parcel, classLoader);
            case 5:
                return new C2903jm(parcel, classLoader);
            case 6:
                return new Mt(parcel, classLoader);
            case 7:
                return new DB(parcel, classLoader);
            case 8:
                return new TF(parcel, classLoader);
            case 9:
                return new LI(parcel, classLoader);
            default:
                return new C3102nJ(parcel, classLoader);
        }
    }
}
