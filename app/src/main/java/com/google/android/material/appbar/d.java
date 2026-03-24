package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.AbstractC2644f;

/* loaded from: classes2.dex */
public final class d extends AbstractC2644f {
    public static final Parcelable.Creator<d> CREATOR = new c();
    public boolean c;
    public boolean d;
    public int e;
    public float f;
    public boolean m;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readByte() != 0;
        this.d = parcel.readByte() != 0;
        this.e = parcel.readInt();
        this.f = parcel.readFloat();
        this.m = parcel.readByte() != 0;
    }

    @Override // defpackage.AbstractC2644f, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.e);
        parcel.writeFloat(this.f);
        parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
    }
}
