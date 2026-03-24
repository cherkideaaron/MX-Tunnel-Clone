package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* renamed from: io, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2851io extends View {
    public C2851io(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        C0269Pb c0269Pb = (C0269Pb) getLayoutParams();
        c0269Pb.a = i;
        setLayoutParams(c0269Pb);
    }

    public void setGuidelineEnd(int i) {
        C0269Pb c0269Pb = (C0269Pb) getLayoutParams();
        c0269Pb.b = i;
        setLayoutParams(c0269Pb);
    }

    public void setGuidelinePercent(float f) {
        C0269Pb c0269Pb = (C0269Pb) getLayoutParams();
        c0269Pb.c = f;
        setLayoutParams(c0269Pb);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
