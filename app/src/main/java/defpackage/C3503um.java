package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: um, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3503um implements Parcelable {
    public static final Parcelable.Creator<C3503um> CREATOR = new L0(7);
    public String a;
    public int b;

    public C3503um(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }
}
