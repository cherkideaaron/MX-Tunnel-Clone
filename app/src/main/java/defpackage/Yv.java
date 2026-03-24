package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public abstract class Yv {
    public static void a(View view, float f) {
        try {
            view.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }
}
