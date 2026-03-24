package defpackage;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* renamed from: uv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3512uv implements Comparable, Parcelable {
    public static final Parcelable.Creator<C3512uv> CREATOR = new L0(19);
    public final Calendar a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public String m;

    public C3512uv(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarB = AbstractC0477aL.b(calendar);
        this.a = calendarB;
        this.b = calendarB.get(2);
        this.c = calendarB.get(1);
        this.d = calendarB.getMaximum(7);
        this.e = calendarB.getActualMaximum(5);
        this.f = calendarB.getTimeInMillis();
    }

    public static C3512uv a(int i, int i2) {
        Calendar calendarD = AbstractC0477aL.d(null);
        calendarD.set(1, i);
        calendarD.set(2, i2);
        return new C3512uv(calendarD);
    }

    public static C3512uv b(long j) {
        Calendar calendarD = AbstractC0477aL.d(null);
        calendarD.setTimeInMillis(j);
        return new C3512uv(calendarD);
    }

    public final String c() {
        if (this.m == null) {
            long timeInMillis = this.a.getTimeInMillis();
            this.m = Build.VERSION.SDK_INT >= 24 ? AbstractC0477aL.a("yMMMM", Locale.getDefault()).format(new Date(timeInMillis)) : DateUtils.formatDateTime(null, timeInMillis, 8228);
        }
        return this.m;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a.compareTo(((C3512uv) obj).a);
    }

    public final int d(C3512uv c3512uv) {
        if (!(this.a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (c3512uv.b - this.b) + ((c3512uv.c - this.c) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3512uv)) {
            return false;
        }
        C3512uv c3512uv = (C3512uv) obj;
        return this.b == c3512uv.b && this.c == c3512uv.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.b);
    }
}
