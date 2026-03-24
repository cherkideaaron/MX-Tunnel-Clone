package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes2.dex */
public final class DI extends AbstractC0069Df {
    public final /* synthetic */ Context k;
    public final /* synthetic */ TextPaint l;
    public final /* synthetic */ AbstractC0069Df m;
    public final /* synthetic */ EI n;

    public DI(EI ei, Context context, TextPaint textPaint, AbstractC0069Df abstractC0069Df) {
        this.n = ei;
        this.k = context;
        this.l = textPaint;
        this.m = abstractC0069Df;
    }

    @Override // defpackage.AbstractC0069Df
    public final void M(int i) {
        this.m.M(i);
    }

    @Override // defpackage.AbstractC0069Df
    public final void N(Typeface typeface, boolean z) {
        this.n.f(this.k, this.l, typeface);
        this.m.N(typeface, z);
    }
}
