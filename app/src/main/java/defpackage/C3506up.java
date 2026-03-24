package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* renamed from: up, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3506up extends View.AccessibilityDelegate {
    public final /* synthetic */ C3560vp a;

    public C3506up(C3560vp c3560vp) {
        this.a = c3560vp;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.a.h.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
