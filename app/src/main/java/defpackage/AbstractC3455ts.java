package defpackage;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* renamed from: ts, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3455ts {
    public static void a(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    public static void b(PopupWindow popupWindow, boolean z) {
        popupWindow.setIsClippedToScreen(z);
    }
}
