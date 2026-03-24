package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.a;
import rased.vpn.app.service.InjectorService;

/* renamed from: fy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ServiceConnectionC2697fy implements ServiceConnection {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ServiceConnectionC2697fy(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                aVar.b = ((BinderC3407sy) iBinder).a;
                Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-58866173965242L), Deobfuscator$MHRTUNNELVPN$app.getString(-58943483376570L) + aVar.b.toString());
                aVar.b.b(aVar);
                aVar.q();
                break;
            case 1:
                InjectorService injectorService = ((BinderC3776zp) iBinder).a;
                a aVar2 = (a) obj;
                aVar2.d = injectorService;
                injectorService.n = aVar2;
                break;
            default:
                QO qo = (QO) obj;
                qo.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                qo.a().post(new OO(this, iBinder));
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = 0;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-59072332395450L), Deobfuscator$MHRTUNNELVPN$app.getString(-59149641806778L));
                ((a) obj).b = null;
                break;
            case 1:
                ((a) obj).d = null;
                break;
            default:
                QO qo = (QO) obj;
                qo.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                qo.a().post(new PO(this, i));
                break;
        }
    }
}
