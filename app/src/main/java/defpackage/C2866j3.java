package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: j3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2866j3 extends AbstractC3296qu {
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ WeakReference l;
    public final /* synthetic */ C3196p3 m;

    public C2866j3(C3196p3 c3196p3, int i, int i2, WeakReference weakReference) {
        this.m = c3196p3;
        this.j = i;
        this.k = i2;
        this.l = weakReference;
    }

    @Override // defpackage.AbstractC3296qu
    public final void L(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.j) != -1) {
            typeface = AbstractC3141o3.a(typeface, i, (this.k & 2) != 0);
        }
        C3196p3 c3196p3 = this.m;
        if (c3196p3.m) {
            c3196p3.l = typeface;
            TextView textView = (TextView) this.l.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i2 = c3196p3.j;
                if (zIsAttachedToWindow) {
                    textView.post(new RunnableC2921k3(textView, typeface, i2, 0));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    @Override // defpackage.AbstractC3296qu
    public final void K(int i) {
    }
}
