package defpackage;

import android.content.Context;
import com.mxtunnel.pro.R;

/* renamed from: Xh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0411Xh {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public C0411Xh(Context context) {
        boolean zT = AbstractC0069Df.T(context, R.attr.elevationOverlayEnabled, false);
        int iB = AbstractC0500aq.B(context, R.attr.elevationOverlayColor, 0);
        int iB2 = AbstractC0500aq.B(context, R.attr.elevationOverlayAccentColor, 0);
        int iB3 = AbstractC0500aq.B(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = zT;
        this.b = iB;
        this.c = iB2;
        this.d = iB3;
        this.e = f2;
    }
}
