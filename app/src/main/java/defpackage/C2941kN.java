package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: kN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2941kN extends WindowInsetsAnimation$Callback {
    public final C0147Hp a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public C2941kN(C0147Hp c0147Hp) {
        super(0);
        this.d = new HashMap();
        this.a = c0147Hp;
    }

    public final C3106nN a(WindowInsetsAnimation windowInsetsAnimation) {
        C3106nN c3106nN = (C3106nN) this.d.get(windowInsetsAnimation);
        if (c3106nN == null) {
            c3106nN = new C3106nN(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                c3106nN.a = new C2996lN(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, c3106nN);
        }
        return c3106nN;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C0147Hp c0147Hp = this.a;
        a(windowInsetsAnimation);
        ((View) c0147Hp.d).setTranslationY(0.0f);
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C0147Hp c0147Hp = this.a;
        a(windowInsetsAnimation);
        View view = (View) c0147Hp.d;
        int[] iArr = (int[]) c0147Hp.e;
        view.getLocationOnScreen(iArr);
        c0147Hp.a = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationI = AbstractC2886jN.i(list.get(size));
            C3106nN c3106nNA = a(windowInsetsAnimationI);
            c3106nNA.a.d(windowInsetsAnimationI.getFraction());
            this.c.add(c3106nNA);
        }
        C0147Hp c0147Hp = this.a;
        AN anG = AN.g(null, windowInsets);
        c0147Hp.f(anG, this.b);
        return anG.f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C0147Hp c0147Hp = this.a;
        a(windowInsetsAnimation);
        C0130Gp c0130GpC = C0130Gp.c(bounds.getLowerBound());
        C0130Gp c0130GpC2 = C0130Gp.c(bounds.getUpperBound());
        View view = (View) c0147Hp.d;
        int[] iArr = (int[]) c0147Hp.e;
        view.getLocationOnScreen(iArr);
        int i = c0147Hp.a - iArr[1];
        c0147Hp.b = i;
        view.setTranslationY(i);
        S.p();
        return S.i(c0130GpC.d(), c0130GpC2.d());
    }
}
