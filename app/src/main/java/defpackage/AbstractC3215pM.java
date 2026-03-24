package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* renamed from: pM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3215pM {
    public static final C3594wM a;
    public static final R8 b;

    static {
        a = Build.VERSION.SDK_INT >= 29 ? new C3648xM(28) : new C3594wM(28);
        b = new R8("translationAlpha", 6, Float.class);
        new R8("clipBounds", 7, Rect.class);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.R(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        a.K(view, i);
    }
}
