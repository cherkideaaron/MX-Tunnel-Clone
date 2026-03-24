package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: f3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2648f3 extends View.BaseSavedState {
    public static final Parcelable.Creator<C2648f3> CREATOR = new L0(1);
    public boolean a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
    }
}
