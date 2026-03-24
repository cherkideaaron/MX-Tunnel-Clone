package defpackage;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class HI {
    public float c;
    public final WeakReference e;
    public EI f;
    public final TextPaint a = new TextPaint(1);
    public final G9 b = new G9(this, 1);
    public boolean d = true;

    public HI(GI gi) {
        this.e = new WeakReference(null);
        this.e = new WeakReference(gi);
    }

    public final float a(String str) {
        if (!this.d) {
            return this.c;
        }
        TextPaint textPaint = this.a;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = false;
        return this.c;
    }
}
