package defpackage;

import android.app.Service;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import rased.vpn.app.service.PsiphonDNSService;
import rased.vpn.app.service.SocksDNSService;
import rased.vpn.app.service.XRayDNSService;

/* renamed from: wA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3582wA extends Binder implements InterfaceC0499ap {
    public final /* synthetic */ int a;
    public final /* synthetic */ Service b;

    public BinderC3582wA(Service service, int i) {
        this.a = i;
        this.b = service;
        attachInterface(this, "rased.vpn.app.aidl.IUltraSSHServiceInternal");
    }

    @Override // defpackage.InterfaceC0499ap
    public final void a() {
        switch (this.a) {
            case 0:
                ((PsiphonDNSService) this.b).g();
                break;
            case 1:
                ((SocksDNSService) this.b).f();
                break;
            default:
                ((XRayDNSService) this.b).f();
                break;
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("rased.vpn.app.aidl.IUltraSSHServiceInternal");
        }
        if (i == 1598968902) {
            parcel2.writeString("rased.vpn.app.aidl.IUltraSSHServiceInternal");
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        a();
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
