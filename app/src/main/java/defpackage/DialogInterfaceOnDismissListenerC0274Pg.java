package defpackage;

import android.content.DialogInterface;
import androidx.fragment.app.g;

/* renamed from: Pg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0274Pg implements DialogInterface.OnDismissListener {
    public final /* synthetic */ g a;

    public DialogInterfaceOnDismissListenerC0274Pg(g gVar) {
        this.a = gVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        g gVar = this.a;
        if (gVar.mDialog != null) {
            gVar.onDismiss(gVar.mDialog);
        }
    }
}
