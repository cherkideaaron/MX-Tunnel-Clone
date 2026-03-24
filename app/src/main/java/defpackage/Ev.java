package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class Ev extends Binder implements IInterface {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public Ev(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    public final void b(String[] strArr, int i) {
        synchronized (this.a.c) {
            try {
                String str = (String) this.a.b.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = this.a.c.beginBroadcast();
                for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                    try {
                        Integer num = (Integer) this.a.c.getBroadcastCookie(i2);
                        int iIntValue = num.intValue();
                        String str2 = (String) this.a.b.get(num);
                        if (i != iIntValue && str.equals(str2)) {
                            try {
                                ((C0316Ro) this.a.c.getBroadcastItem(i2)).b(strArr);
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                    } finally {
                        this.a.c.finishBroadcast();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int c(C0316Ro c0316Ro, String str) {
        if (str == null) {
            return 0;
        }
        synchronized (this.a.c) {
            try {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.a;
                int i = multiInstanceInvalidationService.a + 1;
                multiInstanceInvalidationService.a = i;
                if (multiInstanceInvalidationService.c.register(c0316Ro, Integer.valueOf(i))) {
                    this.a.b.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.a;
                multiInstanceInvalidationService2.a--;
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        C0316Ro c0316Ro = null;
        if (i == 1) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof C0316Ro)) {
                    c0316Ro = new C0316Ro();
                    c0316Ro.a = strongBinder;
                } else {
                    c0316Ro = (C0316Ro) iInterfaceQueryLocalInterface;
                }
            }
            int iC = c(c0316Ro, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(iC);
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            b(parcel.createStringArray(), parcel.readInt());
            return true;
        }
        parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof C0316Ro)) {
                c0316Ro = new C0316Ro();
                c0316Ro.a = strongBinder2;
            } else {
                c0316Ro = (C0316Ro) iInterfaceQueryLocalInterface2;
            }
        }
        int i3 = parcel.readInt();
        synchronized (this.a.c) {
            this.a.c.unregister(c0316Ro);
            this.a.b.remove(Integer.valueOf(i3));
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
