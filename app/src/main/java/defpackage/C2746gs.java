package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: gs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2746gs implements Parcelable {
    public static final Parcelable.Creator<C2746gs> CREATOR = new L0(11);
    public int a;
    public int b;
    public boolean c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
