package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final class Zt implements Uw {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public Zt(View view, int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = view;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // defpackage.Uw
    public final AN j(View view, AN an) {
        C0130Gp c0130GpF = an.a.f(7);
        int i = this.a;
        View view2 = this.b;
        if (i >= 0) {
            view2.getLayoutParams().height = i + c0130GpF.b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.c + c0130GpF.a, this.d + c0130GpF.b, this.e + c0130GpF.c, view2.getPaddingBottom());
        return an;
    }
}
