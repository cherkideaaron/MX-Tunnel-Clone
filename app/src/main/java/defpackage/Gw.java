package defpackage;

import android.app.Notification;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class Gw {
    public final String a;
    public final int b = 1;
    public final String c = null;
    public final Notification d;

    public Gw(String str, Notification notification) {
        this.a = str;
        this.d = notification;
    }

    public final void a(InterfaceC0367Uo interfaceC0367Uo) {
        String str = this.a;
        int i = this.b;
        String str2 = this.c;
        C0333So c0333So = (C0333So) interfaceC0367Uo;
        c0333So.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0367Uo.k);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str2);
            Notification notification = this.d;
            if (notification != null) {
                parcelObtain.writeInt(1);
                notification.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            c0333So.a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.a);
        sb.append(", id:");
        sb.append(this.b);
        sb.append(", tag:");
        return AbstractC3264qG.l(sb, this.c, "]");
    }
}
