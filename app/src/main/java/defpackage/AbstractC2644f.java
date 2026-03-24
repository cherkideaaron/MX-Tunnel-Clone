package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2644f implements Parcelable {
    public final Parcelable a;
    public static final C2535d b = new C2535d();
    public static final Parcelable.Creator<AbstractC2644f> CREATOR = new C2589e(0);

    public AbstractC2644f() {
        this.a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }

    public AbstractC2644f(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.a = parcelable == null ? b : parcelable;
    }

    public AbstractC2644f(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.a = parcelable == b ? null : parcelable;
    }
}
