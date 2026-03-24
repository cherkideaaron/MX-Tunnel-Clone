package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.mxtunnel.pro.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class H8 extends AbstractC3421tB {
    public final Paint a;
    public final List b;

    public H8() {
        Paint paint = new Paint();
        this.a = paint;
        this.b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // defpackage.AbstractC3421tB
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float fB;
        float fC;
        float fA;
        Canvas canvas2;
        float fE;
        Paint paint = this.a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        for (AbstractC3238pr abstractC3238pr : this.b) {
            abstractC3238pr.getClass();
            ThreadLocal threadLocal = AbstractC0013Aa.a;
            float f = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).G0()) {
                fE = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.e();
                fA = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.a();
                fC = 0.0f;
                abstractC3238pr.getClass();
                canvas2 = canvas;
                fB = 0.0f;
            } else {
                fB = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.b();
                fC = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.c();
                fA = 0.0f;
                abstractC3238pr.getClass();
                canvas2 = canvas;
                fE = 0.0f;
            }
            canvas2.drawLine(fB, fE, fC, fA, paint);
        }
    }
}
