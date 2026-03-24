package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: oR, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3165oR implements SafeParcelable {
    public static final Parcelable.Creator<C3165oR> CREATOR = new C3488uO(21);
    public final String a;
    public final String b;
    public final boolean c;

    public C3165oR(String str, String str2, boolean z) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        this.a = str;
        this.b = str2;
        QP.d(str2);
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.writeString(parcel, 2, this.b, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.c);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public C3165oR(boolean z) {
        this.c = z;
        this.b = null;
        this.a = null;
    }
}
