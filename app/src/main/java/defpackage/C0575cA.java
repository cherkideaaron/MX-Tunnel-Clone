package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: cA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0575cA extends View.BaseSavedState {
    public static final Parcelable.Creator<C0575cA> CREATOR = new L0(24);
    public float a;
    public float b;
    public boolean c;
    public float d;
    public int e;
    public int f;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public boolean q;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o);
        parcel.writeByte(this.p ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.q ? (byte) 1 : (byte) 0);
    }
}
