package defpackage;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* renamed from: aN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0479aN {
    public static boolean a(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    public static ActionMode b(Window.Callback callback, ActionMode.Callback callback2, int i) {
        return callback.onWindowStartingActionMode(callback2, i);
    }
}
