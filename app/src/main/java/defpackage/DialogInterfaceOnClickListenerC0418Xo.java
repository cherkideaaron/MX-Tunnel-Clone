package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.IPHunterActivity;

/* renamed from: Xo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnClickListenerC0418Xo implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ DialogInterfaceOnClickListenerC0418Xo(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                int i2 = IPHunterActivity.p;
                IPHunterActivity iPHunterActivity = (IPHunterActivity) obj;
                iPHunterActivity.getClass();
                iPHunterActivity.startActivity(new Intent("android.settings.VOICE_INPUT_SETTINGS"));
                break;
            case 1:
                C2646f1 c2646f1 = (C2646f1) obj;
                c2646f1.getClass();
                new C2591e1(c2646f1).filter(Deobfuscator$MHRTUNNELVPN$app.getString(-31232354382778L));
                break;
            default:
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
