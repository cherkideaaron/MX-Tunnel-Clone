package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.p002firebaseauthapi.zzac;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;

/* renamed from: sQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3382sQ extends Nw {
    public static final Parcelable.Creator<C3382sQ> CREATOR = new C3488uO(18);
    public final String a;
    public final String b;
    public final String c;
    public final zzajb d;
    public final String e;
    public final String f;
    public final String m;

    public C3382sQ(String str, String str2, String str3, zzajb zzajbVar, String str4, String str5, String str6) {
        this.a = zzac.zzb(str);
        this.b = str2;
        this.c = str3;
        this.d = zzajbVar;
        this.e = str4;
        this.f = str5;
        this.m = str6;
    }

    public static C3382sQ e(zzajb zzajbVar) {
        Preconditions.checkNotNull(zzajbVar, "Must specify a non-null webSignInCredential");
        return new C3382sQ(null, null, null, zzajbVar, null, null, null);
    }

    @Override // defpackage.AbstractC2814i4
    public final String b() {
        return this.a;
    }

    public final AbstractC2814i4 c() {
        return new C3382sQ(this.a, this.b, this.c, this.d, this.e, this.f, this.m);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.writeString(parcel, 2, this.b, false);
        SafeParcelWriter.writeString(parcel, 3, this.c, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.d, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.e, false);
        SafeParcelWriter.writeString(parcel, 6, this.f, false);
        SafeParcelWriter.writeString(parcel, 7, this.m, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
