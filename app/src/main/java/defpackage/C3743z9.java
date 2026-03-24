package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: z9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3743z9 extends AbstractC2644f {
    public static final Parcelable.Creator<C3743z9> CREATOR = new C2589e(2);
    public boolean c;

    public C3743z9(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readInt() == 1;
    }

    @Override // defpackage.AbstractC2644f, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
