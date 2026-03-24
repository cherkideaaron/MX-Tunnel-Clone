package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: j8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2871j8 implements Parcelable {
    public static final Parcelable.Creator<C2871j8> CREATOR = new L0(4);
    public final C3512uv a;
    public final C3512uv b;
    public final C0018Af c;
    public final C3512uv d;
    public final int e;
    public final int f;
    public final int m;

    public C2871j8(C3512uv c3512uv, C3512uv c3512uv2, C0018Af c0018Af, C3512uv c3512uv3, int i) {
        Objects.requireNonNull(c3512uv, "start cannot be null");
        Objects.requireNonNull(c3512uv2, "end cannot be null");
        Objects.requireNonNull(c0018Af, "validator cannot be null");
        this.a = c3512uv;
        this.b = c3512uv2;
        this.d = c3512uv3;
        this.e = i;
        this.c = c0018Af;
        if (c3512uv3 != null && c3512uv.a.compareTo(c3512uv3.a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c3512uv3 != null && c3512uv3.a.compareTo(c3512uv2.a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > AbstractC0477aL.d(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.m = c3512uv.d(c3512uv2) + 1;
        this.f = (c3512uv2.c - c3512uv.c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2871j8)) {
            return false;
        }
        C2871j8 c2871j8 = (C2871j8) obj;
        return this.a.equals(c2871j8.a) && this.b.equals(c2871j8.b) && Objects.equals(this.d, c2871j8.d) && this.e == c2871j8.e && this.c.equals(c2871j8.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d, Integer.valueOf(this.e), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeInt(this.e);
    }
}
