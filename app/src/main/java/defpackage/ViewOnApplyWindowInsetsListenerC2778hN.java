package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* renamed from: hN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC2778hN implements View.OnApplyWindowInsetsListener {
    public final C0147Hp a;
    public AN b;

    public ViewOnApplyWindowInsetsListenerC2778hN(View view, C0147Hp c0147Hp) {
        AN anB;
        this.a = c0147Hp;
        WeakHashMap weakHashMap = UL.a;
        AN anA = NL.a(view);
        if (anA != null) {
            int i = Build.VERSION.SDK_INT;
            anB = (i >= 30 ? new C3271qN(anA) : i >= 29 ? new C3216pN(anA) : new C3161oN(anA)).b();
        } else {
            anB = null;
        }
        this.b = anB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C3703yN c3703yN;
        if (!view.isLaidOut()) {
            this.b = AN.g(view, windowInsets);
            return C2833iN.i(view, windowInsets);
        }
        AN anG = AN.g(view, windowInsets);
        if (this.b == null) {
            WeakHashMap weakHashMap = UL.a;
            this.b = NL.a(view);
        }
        if (this.b == null) {
            this.b = anG;
            return C2833iN.i(view, windowInsets);
        }
        C0147Hp c0147HpJ = C2833iN.j(view);
        if (c0147HpJ != null && Objects.equals((WindowInsets) c0147HpJ.c, windowInsets)) {
            return C2833iN.i(view, windowInsets);
        }
        AN an = this.b;
        int i = 1;
        int i2 = 0;
        while (true) {
            c3703yN = anG.a;
            if (i > 256) {
                break;
            }
            if (!c3703yN.f(i).equals(an.a.f(i))) {
                i2 |= i;
            }
            i <<= 1;
        }
        if (i2 == 0) {
            return C2833iN.i(view, windowInsets);
        }
        AN an2 = this.b;
        C3106nN c3106nN = new C3106nN(i2, (i2 & 8) != 0 ? c3703yN.f(8).d > an2.a.f(8).d ? C2833iN.e : C2833iN.f : C2833iN.g, 160L);
        c3106nN.a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c3106nN.a.a());
        C0130Gp c0130GpF = c3703yN.f(i2);
        C0130Gp c0130GpF2 = an2.a.f(i2);
        int iMin = Math.min(c0130GpF.a, c0130GpF2.a);
        int i3 = c0130GpF.b;
        int i4 = c0130GpF2.b;
        int iMin2 = Math.min(i3, i4);
        int i5 = c0130GpF.c;
        int i6 = c0130GpF2.c;
        int iMin3 = Math.min(i5, i6);
        int i7 = c0130GpF.d;
        int i8 = i2;
        int i9 = c0130GpF2.d;
        C3178om c3178om = new C3178om(19, C0130Gp.b(iMin, iMin2, iMin3, Math.min(i7, i9)), C0130Gp.b(Math.max(c0130GpF.a, c0130GpF2.a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
        C2833iN.f(view, windowInsets, false);
        duration.addUpdateListener(new C2723gN(c3106nN, anG, an2, i8, view));
        duration.addListener(new MJ(c3106nN, view, 2));
        ViewTreeObserverOnPreDrawListenerC3244px.a(view, new RunnableC0354Ub(view, c3106nN, c3178om, duration));
        this.b = anG;
        return C2833iN.i(view, windowInsets);
    }
}
