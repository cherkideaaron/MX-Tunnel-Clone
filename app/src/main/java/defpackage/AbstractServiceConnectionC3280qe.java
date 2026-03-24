package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: qe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceConnectionC3280qe implements ServiceConnection {
    private Context mApplicationContext;

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, AbstractC2950ke abstractC2950ke);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC0248No interfaceC0248No;
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i = AbstractBinderC0231Mo.a;
        if (iBinder == null) {
            interfaceC0248No = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC0248No.j);
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0248No)) {
                C0214Lo c0214Lo = new C0214Lo();
                c0214Lo.a = iBinder;
                interfaceC0248No = c0214Lo;
            } else {
                interfaceC0248No = (InterfaceC0248No) iInterfaceQueryLocalInterface;
            }
        }
        onCustomTabsServiceConnected(componentName, new C3225pe(interfaceC0248No, componentName));
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
