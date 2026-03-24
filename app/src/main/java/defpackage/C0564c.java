package defpackage;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0564c implements InterfaceC2940kM {
    public boolean a = false;
    public int b;
    public final /* synthetic */ ActionBarContextView c;

    public C0564c(ActionBarContextView actionBarContextView) {
        this.c = actionBarContextView;
    }

    @Override // defpackage.InterfaceC2940kM
    public final void a() {
        this.a = true;
    }

    @Override // defpackage.InterfaceC2940kM
    public final void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.a = false;
    }

    @Override // defpackage.InterfaceC2940kM
    public final void c() {
        if (this.a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.c;
        actionBarContextView.f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.b);
    }
}
