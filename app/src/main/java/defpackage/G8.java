package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes2.dex */
public final class G8 extends C2801hs {
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G8(int i, Context context, Object obj) {
        super(context);
        this.q = i;
        this.r = obj;
    }

    @Override // defpackage.C2801hs
    public int b(View view, int i) {
        switch (this.q) {
            case 0:
                ((CarouselLayoutManager) this.r).getClass();
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // defpackage.C2801hs
    public int c(View view, int i) {
        switch (this.q) {
            case 0:
                ((CarouselLayoutManager) this.r).getClass();
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // defpackage.C2801hs
    public float d(DisplayMetrics displayMetrics) {
        switch (this.q) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // defpackage.C2801hs
    public int e(int i) {
        switch (this.q) {
            case 1:
                return Math.min(100, super.e(i));
            default:
                return super.e(i);
        }
    }

    @Override // defpackage.C2801hs
    public PointF f(int i) {
        switch (this.q) {
            case 0:
                return ((CarouselLayoutManager) this.r).a(i);
            default:
                return super.f(i);
        }
    }

    @Override // defpackage.C2801hs
    public void h(View view, EB eb) {
        switch (this.q) {
            case 1:
                Hy hy = (Hy) this.r;
                int[] iArrA = hy.a(hy.a.getLayoutManager(), view);
                int i = iArrA[0];
                int i2 = iArrA[1];
                int iCeil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
                if (iCeil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.j;
                    eb.a = i;
                    eb.b = i2;
                    eb.c = iCeil;
                    eb.e = decelerateInterpolator;
                    eb.f = true;
                    break;
                }
                break;
            default:
                super.h(view, eb);
                break;
        }
    }
}
