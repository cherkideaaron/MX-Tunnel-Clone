package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class BP extends AbstractC2739gl {
    public static final Parcelable.Creator<BP> CREATOR = new C3488uO(3);
    public zzahv a;
    public C3489uP b;
    public String c;
    public String d;
    public List e;
    public List f;
    public String m;
    public Boolean n;
    public EP o;
    public boolean p;
    public C3382sQ q;
    public SP r;
    public List s;

    public BP(C3663xk c3663xk, ArrayList arrayList) {
        Preconditions.checkNotNull(c3663xk);
        c3663xk.a();
        this.c = c3663xk.b;
        this.d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.m = "2";
        e(arrayList);
    }

    @Override // defpackage.WK
    public final String a() {
        return this.b.b;
    }

    @Override // defpackage.AbstractC2739gl
    public final String b() {
        Map map;
        zzahv zzahvVar = this.a;
        if (zzahvVar == null || zzahvVar.zzc() == null || (map = (Map) ((Map) RP.a(this.a.zzc()).b).get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // defpackage.AbstractC2739gl
    public final boolean c() {
        String str;
        Boolean bool = this.n;
        if (bool == null || bool.booleanValue()) {
            zzahv zzahvVar = this.a;
            if (zzahvVar != null) {
                Map map = (Map) ((Map) RP.a(zzahvVar.zzc()).b).get("firebase");
                str = map != null ? (String) map.get("sign_in_provider") : null;
            } else {
                str = "";
            }
            boolean z = true;
            if (this.e.size() > 1 || (str != null && str.equals("custom"))) {
                z = false;
            }
            this.n = Boolean.valueOf(z);
        }
        return this.n.booleanValue();
    }

    @Override // defpackage.AbstractC2739gl
    public final synchronized BP e(List list) {
        try {
            Preconditions.checkNotNull(list);
            this.e = new ArrayList(list.size());
            this.f = new ArrayList(list.size());
            for (int i = 0; i < list.size(); i++) {
                WK wk = (WK) list.get(i);
                if (wk.a().equals("firebase")) {
                    this.b = (C3489uP) wk;
                } else {
                    this.f.add(wk.a());
                }
                this.e.add((C3489uP) wk);
            }
            if (this.b == null) {
                this.b = (C3489uP) this.e.get(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // defpackage.AbstractC2739gl
    public final void f(ArrayList arrayList) {
        SP sp;
        if (arrayList.isEmpty()) {
            sp = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Bv bv = (Bv) it.next();
                if (bv instanceof Ty) {
                    arrayList2.add((Ty) bv);
                } else if (bv instanceof HJ) {
                    arrayList3.add((HJ) bv);
                }
            }
            sp = new SP(arrayList2, arrayList3);
        }
        this.r = sp;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.b, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.c, false);
        SafeParcelWriter.writeString(parcel, 4, this.d, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.e, false);
        SafeParcelWriter.writeStringList(parcel, 6, this.f, false);
        SafeParcelWriter.writeString(parcel, 7, this.m, false);
        SafeParcelWriter.writeBooleanObject(parcel, 8, Boolean.valueOf(c()), false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.o, i, false);
        SafeParcelWriter.writeBoolean(parcel, 10, this.p);
        SafeParcelWriter.writeParcelable(parcel, 11, this.q, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.r, i, false);
        SafeParcelWriter.writeTypedList(parcel, 13, this.s, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
