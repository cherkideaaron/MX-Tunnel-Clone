package defpackage;

import android.text.Editable;

/* renamed from: Mi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0225Mi extends OI {
    public final /* synthetic */ C0259Oi a;

    public C0225Mi(C0259Oi c0259Oi) {
        this.a = c0259Oi;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.b().a();
    }

    @Override // defpackage.OI, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.b().b();
    }
}
