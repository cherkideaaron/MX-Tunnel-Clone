package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.CL;
import defpackage.DL;
import defpackage.L0;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new L0(21);
    public final DL a;

    public ParcelImpl(Parcel parcel) {
        this.a = new CL(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        new CL(parcel).k(this.a);
    }
}
