package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* renamed from: vu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC3565vu implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, Ou {
    public MenuC3511uu a;
    public DialogInterfaceC3303r1 b;
    public C3294qs c;

    @Override // defpackage.Ou
    public final void a(MenuC3511uu menuC3511uu, boolean z) {
        DialogInterfaceC3303r1 dialogInterfaceC3303r1;
        if ((z || menuC3511uu == this.a) && (dialogInterfaceC3303r1 = this.b) != null) {
            dialogInterfaceC3303r1.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C3294qs c3294qs = this.c;
        if (c3294qs.f == null) {
            c3294qs.f = new C3239ps(c3294qs);
        }
        this.a.q(c3294qs.f.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.c.a(this.a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        MenuC3511uu menuC3511uu = this.a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                menuC3511uu.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return menuC3511uu.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.Ou
    public final boolean q(MenuC3511uu menuC3511uu) {
        return false;
    }
}
