package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: iK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2830iK extends AbstractC2814i4 {
    public static final Parcelable.Creator<C2830iK> CREATOR = new C3488uO(14);
    public final String a;
    public final String b;

    public C2830iK(String str, String str2) {
        this.a = Preconditions.checkNotEmpty(str);
        this.b = Preconditions.checkNotEmpty(str2);
    }

    @Override // defpackage.AbstractC2814i4
    public final String b() {
        return "twitter.com";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.writeString(parcel, 2, this.b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
