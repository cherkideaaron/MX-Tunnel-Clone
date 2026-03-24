package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes2.dex */
public final class Yy extends AbstractC2814i4 {
    public static final Parcelable.Creator<Yy> CREATOR = new C3488uO(12);
    public final String a;

    public Yy(String str) {
        this.a = Preconditions.checkNotEmpty(str);
    }

    @Override // defpackage.AbstractC2814i4
    public final String b() {
        return "playgames.google.com";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
