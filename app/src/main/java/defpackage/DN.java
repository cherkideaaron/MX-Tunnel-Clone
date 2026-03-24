package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public class DN extends VP {
    public final WindowInsetsController a;
    public final C2827iH b;
    public Window c;

    public DN(WindowInsetsController windowInsetsController, C2827iH c2827iH) {
        this.a = windowInsetsController;
        this.b = c2827iH;
    }

    @Override // defpackage.VP
    public final void a(boolean z) {
        Window window = this.c;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.a.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.a.setSystemBarsAppearance(0, 16);
    }

    @Override // defpackage.VP
    public final void b(boolean z) {
        Window window = this.c;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.a.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.a.setSystemBarsAppearance(0, 8);
    }

    @Override // defpackage.VP
    public final void c() {
        ((C2524cp) this.b.b).w();
        this.a.show(0);
    }
}
