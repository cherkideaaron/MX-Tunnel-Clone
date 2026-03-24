package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class W9 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractC0276Pi b;

    public /* synthetic */ W9(AbstractC0276Pi abstractC0276Pi, int i) {
        this.a = i;
        this.b = abstractC0276Pi;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.a) {
            case 0:
                Z9 z9 = (Z9) this.b;
                z9.t(z9.u());
                break;
            default:
                C0122Gh c0122Gh = (C0122Gh) this.b;
                c0122Gh.l = z;
                c0122Gh.q();
                if (!z) {
                    c0122Gh.t(false);
                    c0122Gh.m = false;
                    break;
                }
                break;
        }
    }
}
