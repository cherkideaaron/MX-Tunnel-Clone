package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class FP extends Cv {
    public static final Parcelable.Creator<FP> CREATOR = new C3488uO(8);
    public final List a;
    public final GP b;
    public final String c;
    public final C3382sQ d;
    public final BP e;
    public final List f;

    public FP(ArrayList arrayList, GP gp, String str, C3382sQ c3382sQ, BP bp, ArrayList arrayList2) {
        this.a = (List) Preconditions.checkNotNull(arrayList);
        this.b = (GP) Preconditions.checkNotNull(gp);
        this.c = Preconditions.checkNotEmpty(str);
        this.d = c3382sQ;
        this.e = bp;
        this.f = (List) Preconditions.checkNotNull(arrayList2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.a, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.b, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.c, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.d, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.e, i, false);
        SafeParcelWriter.writeTypedList(parcel, 6, this.f, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
