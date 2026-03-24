package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* renamed from: pR, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3220pR implements SafeParcelable {
    public static final Parcelable.Creator<C3220pR> CREATOR = new C3488uO(22);
    public BP a;
    public C3165oR b;
    public C3382sQ c;

    public C3220pR(BP bp) {
        BP bp2 = (BP) Preconditions.checkNotNull(bp);
        this.a = bp2;
        List list = bp2.e;
        this.b = null;
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.isEmpty(((C3489uP) list.get(i)).n)) {
                this.b = new C3165oR(((C3489uP) list.get(i)).b, ((C3489uP) list.get(i)).n, bp.p);
            }
        }
        if (this.b == null) {
            this.b = new C3165oR(bp.p);
        }
        this.c = bp.q;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.c, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
