package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import com.mxtunnel.pro.R;
import java.util.HashMap;

/* renamed from: Nj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0243Nj extends PJ {
    public static final String[] I = {"android:visibility:visibility", "android:visibility:parent"};
    public final int H;

    public C0243Nj() {
        this.H = 3;
    }

    public static void K(YJ yj) {
        int visibility = yj.b.getVisibility();
        HashMap map = yj.a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = yj.b;
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    public static float M(YJ yj, float f) {
        Float f2;
        return (yj == null || (f2 = (Float) yj.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r9 == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r0.e == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
    
        if (r0.c == 0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.DM N(defpackage.YJ r8, defpackage.YJ r9) {
        /*
            DM r0 = new DM
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L33
        L2f:
            r0.c = r3
            r0.e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L4f:
            r0.f = r2
            goto L55
        L52:
            r0.d = r3
            goto L4f
        L55:
            r2 = 1
            if (r8 == 0) goto L7f
            if (r9 == 0) goto L7f
            int r8 = r0.c
            int r9 = r0.d
            if (r8 != r9) goto L67
            android.view.ViewGroup r3 = r0.e
            android.view.ViewGroup r4 = r0.f
            if (r3 != r4) goto L67
            return r0
        L67:
            if (r8 == r9) goto L75
            if (r8 != 0) goto L70
        L6b:
            r0.b = r1
        L6d:
            r0.a = r2
            goto L8d
        L70:
            if (r9 != 0) goto L8d
        L72:
            r0.b = r2
            goto L6d
        L75:
            android.view.ViewGroup r8 = r0.f
            if (r8 != 0) goto L7a
            goto L6b
        L7a:
            android.view.ViewGroup r8 = r0.e
            if (r8 != 0) goto L8d
            goto L72
        L7f:
            if (r8 != 0) goto L86
            int r8 = r0.d
            if (r8 != 0) goto L86
            goto L72
        L86:
            if (r9 != 0) goto L8d
            int r8 = r0.c
            if (r8 != 0) goto L8d
            goto L6b
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0243Nj.N(YJ, YJ):DM");
    }

    public final ObjectAnimator L(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        AbstractC3215pM.a.J(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, AbstractC3215pM.b, f2);
        C0226Mj c0226Mj = new C0226Mj(view);
        objectAnimatorOfFloat.addListener(c0226Mj);
        p().a(c0226Mj);
        return objectAnimatorOfFloat;
    }

    @Override // defpackage.PJ
    public final void e(YJ yj) {
        K(yj);
    }

    @Override // defpackage.PJ
    public final void h(YJ yj) {
        K(yj);
        View view = yj.b;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = Float.valueOf(view.getVisibility() == 0 ? AbstractC3215pM.a.t(view) : 0.0f);
        }
        yj.a.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (N(o(r3, false), s(r3, false)).a != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01fa  */
    @Override // defpackage.PJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator l(android.view.ViewGroup r21, defpackage.YJ r22, defpackage.YJ r23) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0243Nj.l(android.view.ViewGroup, YJ, YJ):android.animation.Animator");
    }

    @Override // defpackage.PJ
    public final String[] r() {
        return I;
    }

    @Override // defpackage.PJ
    public final boolean t(YJ yj, YJ yj2) {
        if (yj == null && yj2 == null) {
            return false;
        }
        if (yj != null && yj2 != null && yj2.a.containsKey("android:visibility:visibility") != yj.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        DM dmN = N(yj, yj2);
        if (dmN.a) {
            return dmN.c == 0 || dmN.d == 0;
        }
        return false;
    }

    public C0243Nj(int i) {
        this();
        this.H = i;
    }
}
