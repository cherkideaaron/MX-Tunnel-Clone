package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: vh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3552vh extends AbstractC2644f {
    public static final Parcelable.Creator<C3552vh> CREATOR = new C2589e(4);
    public int c;
    public int d;
    public int e;
    public int f;
    public int m;

    public C3552vh(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = 0;
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.m = parcel.readInt();
    }

    @Override // defpackage.AbstractC2644f, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.m);
    }
}
