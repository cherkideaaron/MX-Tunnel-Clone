package defpackage;

import android.view.View;
import android.view.Window;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* loaded from: classes.dex */
public class BN extends VP {
    public final Window a;
    public final C2827iH b;

    public BN(Window window, C2827iH c2827iH) {
        this.a = window;
        this.b = c2827iH;
    }

    @Override // defpackage.VP
    public final void b(boolean z) {
        if (!z) {
            f(8192);
            return;
        }
        Window window = this.a;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }

    @Override // defpackage.VP
    public final void c() {
        for (int i = 1; i <= 256; i <<= 1) {
            if ((8 & i) != 0) {
                if (i == 1) {
                    f(4);
                    this.a.clearFlags(UserVerificationMethods.USER_VERIFY_ALL);
                } else if (i == 2) {
                    f(2);
                } else if (i == 8) {
                    ((C2524cp) this.b.b).w();
                }
            }
        }
    }

    public final void f(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
