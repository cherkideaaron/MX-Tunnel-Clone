package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: bo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0553bo extends AbstractC2814i4 {
    public static final Parcelable.Creator<C0553bo> CREATOR = new C3488uO(5);
    public final String a;

    public C0553bo(String str) {
        this.a = Preconditions.checkNotEmpty(str);
    }

    @Override // defpackage.AbstractC2814i4
    public final String b() {
        return "github.com";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
