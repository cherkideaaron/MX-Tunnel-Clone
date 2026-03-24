package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: nJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3102nJ extends AbstractC2644f {
    public static final Parcelable.Creator<C3102nJ> CREATOR = new C2589e(10);
    public int c;
    public boolean d;

    public C3102nJ(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readInt();
        this.d = parcel.readInt() != 0;
    }

    @Override // defpackage.AbstractC2644f, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
