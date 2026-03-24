package defpackage;

import android.content.Context;
import android.widget.Toast;
import xyz.hasnat.sweettoast.SweetToast;

/* renamed from: fL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2666fL implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;

    public /* synthetic */ RunnableC2666fL(Context context, String str, int i) {
        this.a = i;
        this.b = context;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Toast.makeText(this.b, this.c, 0).show();
                break;
            case 1:
                SweetToast.info(this.b, this.c);
                break;
            default:
                SweetToast.error(this.b, this.c);
                break;
        }
    }
}
