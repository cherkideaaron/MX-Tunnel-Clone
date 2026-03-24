package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class V8 extends PJ {
    public static final String[] H = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final R8 I;
    public static final R8 J;
    public static final R8 K;
    public static final R8 L;
    public static final R8 M;

    static {
        Class<PointF> cls = PointF.class;
        String str = "topLeft";
        I = new R8(str, 0, cls);
        String str2 = "bottomRight";
        J = new R8(str2, 1, cls);
        K = new R8(str2, 2, cls);
        L = new R8(str, 3, cls);
        M = new R8("position", 4, cls);
    }

    public static void K(YJ yj) {
        View view = yj.b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = yj.a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", yj.b.getParent());
    }

    @Override // defpackage.PJ
    public final void e(YJ yj) {
        K(yj);
    }

    @Override // defpackage.PJ
    public final void h(YJ yj) {
        K(yj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0123  */
    @Override // defpackage.PJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator l(android.view.ViewGroup r19, defpackage.YJ r20, defpackage.YJ r21) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.V8.l(android.view.ViewGroup, YJ, YJ):android.animation.Animator");
    }

    @Override // defpackage.PJ
    public final String[] r() {
        return H;
    }
}
