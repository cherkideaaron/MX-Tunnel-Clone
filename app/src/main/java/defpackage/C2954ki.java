package defpackage;

import android.text.Editable;

/* renamed from: ki, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2954ki extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile C2954ki b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new C3480uG(cls, charSequence) : super.newEditable(charSequence);
    }
}
