package defpackage;

import android.content.Intent;
import rased.vpn.app.service.OpenVPNService;

/* renamed from: jy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2915jy implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ OpenVPNService d;

    public RunnableC2915jy(OpenVPNService openVPNService, String str, Intent intent, boolean z) {
        this.d = openVPNService;
        this.a = str;
        this.b = intent;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = OpenVPNService.E;
        this.d.d(this.a, this.b, this.c);
    }
}
