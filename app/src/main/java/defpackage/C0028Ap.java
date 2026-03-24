package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* renamed from: Ap, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0028Ap extends InputConnectionWrapper {
    public final /* synthetic */ C0285Qa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0028Ap(InputConnection inputConnection, C0285Qa c0285Qa) {
        super(inputConnection, false);
        this.a = c0285Qa;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        C2827iH c2827iH = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            c2827iH = new C2827iH(new C0062Cp(inputContentInfo), 18);
        }
        if (this.a.a(c2827iH, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
