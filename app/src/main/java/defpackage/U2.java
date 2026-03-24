package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class U2 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC2948kc c0607co;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c0607co = new C0607co(clipData, 3);
            } else {
                C3003lc c3003lc = new C3003lc();
                c3003lc.b = clipData;
                c3003lc.c = 3;
                c0607co = c3003lc;
            }
            UL.h(textView, c0607co.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC2948kc c0607co;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c0607co = new C0607co(clipData, 3);
        } else {
            C3003lc c3003lc = new C3003lc();
            c3003lc.b = clipData;
            c3003lc.c = 3;
            c0607co = c3003lc;
        }
        UL.h(view, c0607co.build());
        return true;
    }
}
