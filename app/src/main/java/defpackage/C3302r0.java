package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: r0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3302r0 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C3302r0> CREATOR = new C3488uO(1);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final boolean m;
    public final String n;
    public int o;
    public final String p;
    public final String q;

    public C3302r0(String str, String str2, String str3, String str4, boolean z, String str5, boolean z2, String str6, int i, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = str5;
        this.m = z2;
        this.n = str6;
        this.o = i;
        this.p = str7;
        this.q = str8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.writeString(parcel, 2, this.b, false);
        SafeParcelWriter.writeString(parcel, 3, this.c, false);
        SafeParcelWriter.writeString(parcel, 4, this.d, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.e);
        SafeParcelWriter.writeString(parcel, 6, this.f, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.m);
        SafeParcelWriter.writeString(parcel, 8, this.n, false);
        SafeParcelWriter.writeInt(parcel, 9, this.o);
        SafeParcelWriter.writeString(parcel, 10, this.p, false);
        SafeParcelWriter.writeString(parcel, 11, this.q, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
