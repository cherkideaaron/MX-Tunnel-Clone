package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;
import java.nio.ByteBuffer;

/* renamed from: mi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3064mi extends InputConnectionWrapper {
    public final TextView a;
    public final C0360Uh b;

    public C3064mi(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        C0360Uh c0360Uh = new C0360Uh(14);
        super(inputConnection, false);
        this.a = editText;
        this.b = c0360Uh;
        if (C2626ei.k != null) {
            C2626ei c2626eiA = C2626ei.a();
            if (c2626eiA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            C3573w1 c3573w1 = c2626eiA.e;
            c3573w1.getClass();
            Bundle bundle = editorInfo.extras;
            C3022lv c3022lv = (C3022lv) ((C3532vE) c3573w1.c).a;
            int iA = c3022lv.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) c3022lv.d).getInt(iA + c3022lv.a) : 0);
            Bundle bundle2 = editorInfo.extras;
            ((C2626ei) c3573w1.a).getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return C0360Uh.y(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return C0360Uh.y(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
