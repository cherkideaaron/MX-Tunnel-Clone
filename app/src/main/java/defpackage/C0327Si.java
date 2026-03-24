package defpackage;

import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;

/* renamed from: Si, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0327Si implements Parcelable {
    public static final Parcelable.Creator<C0327Si> CREATOR = new L0(6);
    public float a;
    public Object b = null;
    public float c;

    public C0327Si(float f, float f2) {
        this.a = f2;
        this.c = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Entry, x: " + this.c + " y: " + this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.a);
        Object obj = this.b;
        if (obj == null) {
            parcel.writeInt(0);
        } else {
            if (!(obj instanceof Parcelable)) {
                throw new ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
            }
            parcel.writeInt(1);
            parcel.writeParcelable((Parcelable) this.b, i);
        }
    }
}
