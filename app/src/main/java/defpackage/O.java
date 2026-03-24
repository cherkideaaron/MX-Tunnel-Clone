package defpackage;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextPaint;

/* loaded from: classes.dex */
public abstract /* synthetic */ class O {
    public static /* synthetic */ PrecomputedText.Params.Builder k(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ boolean y(Spannable spannable) {
        return spannable instanceof PrecomputedText;
    }
}
