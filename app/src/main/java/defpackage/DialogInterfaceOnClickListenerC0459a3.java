package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: a3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0459a3 implements InterfaceC2703g3, DialogInterface.OnClickListener {
    public DialogInterfaceC3303r1 a;
    public ListAdapter b;
    public CharSequence c;
    public final /* synthetic */ C2758h3 d;

    public DialogInterfaceOnClickListenerC0459a3(C2758h3 c2758h3) {
        this.d = c2758h3;
    }

    @Override // defpackage.InterfaceC2703g3
    public final boolean b() {
        DialogInterfaceC3303r1 dialogInterfaceC3303r1 = this.a;
        if (dialogInterfaceC3303r1 != null) {
            return dialogInterfaceC3303r1.isShowing();
        }
        return false;
    }

    @Override // defpackage.InterfaceC2703g3
    public final int c() {
        return 0;
    }

    @Override // defpackage.InterfaceC2703g3
    public final void dismiss() {
        DialogInterfaceC3303r1 dialogInterfaceC3303r1 = this.a;
        if (dialogInterfaceC3303r1 != null) {
            dialogInterfaceC3303r1.dismiss();
            this.a = null;
        }
    }

    @Override // defpackage.InterfaceC2703g3
    public final void e(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.InterfaceC2703g3
    public final CharSequence f() {
        return this.c;
    }

    @Override // defpackage.InterfaceC2703g3
    public final Drawable g() {
        return null;
    }

    @Override // defpackage.InterfaceC2703g3
    public final void h(CharSequence charSequence) {
        this.c = charSequence;
    }

    @Override // defpackage.InterfaceC2703g3
    public final void j(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.InterfaceC2703g3
    public final void k(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.InterfaceC2703g3
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.InterfaceC2703g3
    public final void m(int i, int i2) {
        if (this.b == null) {
            return;
        }
        C2758h3 c2758h3 = this.d;
        C3249q1 c3249q1 = new C3249q1(c2758h3.getPopupContext());
        CharSequence charSequence = this.c;
        C3084n1 c3084n1 = (C3084n1) c3249q1.c;
        if (charSequence != null) {
            c3084n1.e = charSequence;
        }
        ListAdapter listAdapter = this.b;
        int selectedItemPosition = c2758h3.getSelectedItemPosition();
        c3084n1.p = listAdapter;
        c3084n1.q = this;
        c3084n1.t = selectedItemPosition;
        c3084n1.s = true;
        DialogInterfaceC3303r1 dialogInterfaceC3303r1A = c3249q1.a();
        this.a = dialogInterfaceC3303r1A;
        AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC3303r1A.f.g;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.a.show();
    }

    @Override // defpackage.InterfaceC2703g3
    public final int o() {
        return 0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C2758h3 c2758h3 = this.d;
        c2758h3.setSelection(i);
        if (c2758h3.getOnItemClickListener() != null) {
            c2758h3.performItemClick(null, i, this.b.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.InterfaceC2703g3
    public final void p(ListAdapter listAdapter) {
        this.b = listAdapter;
    }
}
