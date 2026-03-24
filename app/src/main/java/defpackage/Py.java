package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes2.dex */
public final class Py extends AbstractC2814i4 implements Cloneable {
    public static final Parcelable.Creator<Py> CREATOR = new C3488uO(9);
    public final String a;
    public final String b;
    public final String c;
    public boolean d;
    public final String e;

    public Py(String str, String str2, String str3, String str4, boolean z) {
        Preconditions.checkArgument(((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) ? false : true, "Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
    }

    @Override // defpackage.AbstractC2814i4
    public final String b() {
        return "phone";
    }

    public final Object clone() {
        boolean z = this.d;
        return new Py(this.a, this.b, this.c, this.e, z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.writeString(parcel, 2, this.b, false);
        SafeParcelWriter.writeString(parcel, 4, this.c, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.d);
        SafeParcelWriter.writeString(parcel, 6, this.e, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
