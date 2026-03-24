package defpackage;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class Iu implements PopupWindow.OnDismissListener {
    public final /* synthetic */ Ju a;

    public Iu(Ju ju) {
        this.a = ju;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.c();
    }
}
