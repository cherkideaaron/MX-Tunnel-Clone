package defpackage;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class CN extends BN {
    @Override // defpackage.VP
    public final void a(boolean z) {
        if (!z) {
            f(16);
            return;
        }
        Window window = this.a;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }
}
