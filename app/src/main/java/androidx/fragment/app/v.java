package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.L0;

/* loaded from: classes.dex */
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new L0(9);
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final int e;
    public final String f;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final Bundle p;
    public final boolean q;
    public final int r;
    public Bundle s;

    public v(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.m = parcel.readInt() != 0;
        this.n = parcel.readInt() != 0;
        this.o = parcel.readInt() != 0;
        this.p = parcel.readBundle();
        this.q = parcel.readInt() != 0;
        this.s = parcel.readBundle();
        this.r = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(UserVerificationMethods.USER_VERIFY_PATTERN);
        sb.append("FragmentState{");
        sb.append(this.a);
        sb.append(" (");
        sb.append(this.b);
        sb.append(")}:");
        if (this.c) {
            sb.append(" fromLayout");
        }
        int i = this.e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.m) {
            sb.append(" retainInstance");
        }
        if (this.n) {
            sb.append(" removing");
        }
        if (this.o) {
            sb.append(" detached");
        }
        if (this.q) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeBundle(this.p);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeBundle(this.s);
        parcel.writeInt(this.r);
    }

    public v(l lVar) {
        this.a = lVar.getClass().getName();
        this.b = lVar.mWho;
        this.c = lVar.mFromLayout;
        this.d = lVar.mFragmentId;
        this.e = lVar.mContainerId;
        this.f = lVar.mTag;
        this.m = lVar.mRetainInstance;
        this.n = lVar.mRemoving;
        this.o = lVar.mDetached;
        this.p = lVar.mArguments;
        this.q = lVar.mHidden;
        this.r = lVar.mMaxState.ordinal();
    }
}
