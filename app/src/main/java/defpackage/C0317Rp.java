package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* renamed from: Rp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0317Rp implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C0317Rp> CREATOR = new L0(10);
    public final IntentSender a;
    public final Intent b;
    public final int c;
    public final int d;

    public C0317Rp(IntentSender intentSender, Intent intent, int i, int i2) {
        AbstractC0500aq.m(intentSender, "intentSender");
        this.a = intentSender;
        this.b = intent;
        this.c = i;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC0500aq.m(parcel, "dest");
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
