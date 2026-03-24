package defpackage;

import rased.vpn.app.activities.OpenVPNClient;

/* loaded from: classes2.dex */
public final /* synthetic */ class Cx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ OpenVPNClient b;
    public final /* synthetic */ int c;

    public /* synthetic */ Cx(OpenVPNClient openVPNClient, int i, int i2) {
        this.a = i2;
        this.b = openVPNClient;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.r0.setSelection(this.c);
                break;
            case 1:
                this.b.r0.setSelection(this.c);
                break;
            default:
                this.b.r0.setSelection(this.c);
                break;
        }
    }
}
