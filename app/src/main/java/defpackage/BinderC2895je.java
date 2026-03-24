package defpackage;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;

/* renamed from: je, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC2895je extends Binder implements InterfaceC0197Ko {
    public final Handler a;
    public final /* synthetic */ AbstractC2568de b;

    public BinderC2895je(AbstractC2568de abstractC2568de) {
        this.b = abstractC2568de;
        attachInterface(this, InterfaceC0197Ko.i);
        this.a = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = InterfaceC0197Ko.i;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        switch (i) {
            case 2:
                int i3 = parcel.readInt();
                Bundle bundle = (Bundle) AbstractC3296qu.d(parcel, Bundle.CREATOR);
                if (this.b != null) {
                    this.a.post(new RunnableC2921k3(this, i3, bundle, 4));
                }
                return true;
            case 3:
                String string = parcel.readString();
                Bundle bundle2 = (Bundle) AbstractC3296qu.d(parcel, Bundle.CREATOR);
                if (this.b != null) {
                    this.a.post(new RunnableC2677fe(this, string, bundle2, 0));
                }
                return true;
            case 4:
                Bundle bundle3 = (Bundle) AbstractC3296qu.d(parcel, Bundle.CREATOR);
                if (this.b != null) {
                    this.a.post(new RunnableC2622ee(this, bundle3, 1));
                }
                parcel2.writeNoException();
                return true;
            case 5:
                String string2 = parcel.readString();
                Bundle bundle4 = (Bundle) AbstractC3296qu.d(parcel, Bundle.CREATOR);
                if (this.b != null) {
                    this.a.post(new RunnableC2677fe(this, string2, bundle4, 1));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                int i4 = parcel.readInt();
                Uri uri = (Uri) AbstractC3296qu.d(parcel, Uri.CREATOR);
                boolean z = parcel.readInt() != 0;
                Bundle bundle5 = (Bundle) AbstractC3296qu.d(parcel, Bundle.CREATOR);
                if (this.b != null) {
                    this.a.post(new RunnableC2732ge(this, i4, uri, z, bundle5));
                }
                return true;
            case 7:
                String string3 = parcel.readString();
                Bundle bundle6 = (Bundle) AbstractC3296qu.d(parcel, Bundle.CREATOR);
                AbstractC2568de abstractC2568de = this.b;
                Bundle bundleExtraCallbackWithResult = abstractC2568de == null ? null : abstractC2568de.extraCallbackWithResult(string3, bundle6);
                parcel2.writeNoException();
                if (bundleExtraCallbackWithResult != null) {
                    parcel2.writeInt(1);
                    bundleExtraCallbackWithResult.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 8:
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                Bundle bundle7 = (Bundle) AbstractC3296qu.d(parcel, Bundle.CREATOR);
                if (this.b != null) {
                    this.a.post(new RunnableC2787he(this, i5, i6, bundle7));
                }
                return true;
            case 9:
                Bundle bundle8 = (Bundle) AbstractC3296qu.d(parcel, Bundle.CREATOR);
                if (this.b != null) {
                    this.a.post(new RunnableC2622ee(this, bundle8, 2));
                }
                return true;
            case 10:
                int i7 = parcel.readInt();
                int i8 = parcel.readInt();
                int i9 = parcel.readInt();
                int i10 = parcel.readInt();
                int i11 = parcel.readInt();
                Bundle bundle9 = (Bundle) AbstractC3296qu.d(parcel, Bundle.CREATOR);
                if (this.b != null) {
                    this.a.post(new RunnableC2842ie(this, i7, i8, i9, i10, i11, bundle9));
                }
                return true;
            case 11:
                Bundle bundle10 = (Bundle) AbstractC3296qu.d(parcel, Bundle.CREATOR);
                if (this.b != null) {
                    this.a.post(new RunnableC2622ee(this, bundle10, 3));
                }
                return true;
            case 12:
                Bundle bundle11 = (Bundle) AbstractC3296qu.d(parcel, Bundle.CREATOR);
                if (this.b != null) {
                    this.a.post(new RunnableC2622ee(this, bundle11, 0));
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
