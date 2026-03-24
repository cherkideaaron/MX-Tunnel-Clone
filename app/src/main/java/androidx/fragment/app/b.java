package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.C0110Fm;
import defpackage.L0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new L0(2);
    public final int[] a;
    public final ArrayList b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final String f;
    public final int m;
    public final int n;
    public final CharSequence o;
    public final int p;
    public final CharSequence q;
    public final ArrayList r;
    public final ArrayList s;
    public final boolean t;

    public b(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.m = parcel.readInt();
        this.n = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.o = (CharSequence) creator.createFromParcel(parcel);
        this.p = parcel.readInt();
        this.q = (CharSequence) creator.createFromParcel(parcel);
        this.r = parcel.createStringArrayList();
        this.s = parcel.createStringArrayList();
        this.t = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        TextUtils.writeToParcel(this.o, parcel, 0);
        parcel.writeInt(this.p);
        TextUtils.writeToParcel(this.q, parcel, 0);
        parcel.writeStringList(this.r);
        parcel.writeStringList(this.s);
        parcel.writeInt(this.t ? 1 : 0);
    }

    public b(a aVar) {
        int size = aVar.a.size();
        this.a = new int[size * 6];
        if (!aVar.g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.b = new ArrayList(size);
        this.c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C0110Fm c0110Fm = (C0110Fm) aVar.a.get(i2);
            int i3 = i + 1;
            this.a[i] = c0110Fm.a;
            ArrayList arrayList = this.b;
            l lVar = c0110Fm.b;
            arrayList.add(lVar != null ? lVar.mWho : null);
            int[] iArr = this.a;
            iArr[i3] = c0110Fm.c ? 1 : 0;
            iArr[i + 2] = c0110Fm.d;
            iArr[i + 3] = c0110Fm.e;
            int i4 = i + 5;
            iArr[i + 4] = c0110Fm.f;
            i += 6;
            iArr[i4] = c0110Fm.g;
            this.c[i2] = c0110Fm.h.ordinal();
            this.d[i2] = c0110Fm.i.ordinal();
        }
        this.e = aVar.f;
        this.f = aVar.h;
        this.m = aVar.r;
        this.n = aVar.i;
        this.o = aVar.j;
        this.p = aVar.k;
        this.q = aVar.l;
        this.r = aVar.m;
        this.s = aVar.n;
        this.t = aVar.o;
    }
}
