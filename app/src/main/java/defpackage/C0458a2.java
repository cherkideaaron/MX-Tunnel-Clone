package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* renamed from: a2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0458a2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0458a2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                int i = AppBarLayout.G;
                AppBarLayout appBarLayout = (AppBarLayout) obj;
                appBarLayout.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((C2638eu) this.c).n(fFloatValue);
                Drawable drawable = appBarLayout.C;
                if (drawable instanceof C2638eu) {
                    ((C2638eu) drawable).n(fFloatValue);
                }
                Iterator it = appBarLayout.w.iterator();
                if (it.hasNext()) {
                    Vs.u(it.next());
                    throw null;
                }
                Iterator it2 = appBarLayout.x.iterator();
                if (it2.hasNext()) {
                    Vs.u(it2.next());
                    throw null;
                }
                return;
            default:
                ((View) ((C2668fN) ((C3588wG) obj).a).p.getParent()).invalidate();
                return;
        }
    }
}
