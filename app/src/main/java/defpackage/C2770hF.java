package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import com.google.android.gms.common.api.Api;
import java.util.concurrent.Executors;
import org.achartengine.renderer.DefaultRenderer;

/* renamed from: hF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2770hF {
    public static final int[] i = new int[3];
    public static final float[] j = {0.0f, 0.5f, 1.0f};
    public static final int[] k = new int[4];
    public static final float[] l = {0.0f, 0.0f, 0.5f, 1.0f};
    public int a;
    public int b;
    public int c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public C2770hF() {
        this.h = new Path();
        Paint paint = new Paint();
        this.g = paint;
        Paint paint2 = new Paint();
        this.d = paint2;
        this.a = AbstractC0013Aa.d(DefaultRenderer.BACKGROUND_COLOR, 68);
        this.b = AbstractC0013Aa.d(DefaultRenderer.BACKGROUND_COLOR, 20);
        this.c = AbstractC0013Aa.d(DefaultRenderer.BACKGROUND_COLOR, 0);
        paint2.setColor(this.a);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.e = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f = new Paint(paint3);
    }

    public C2770hF(C3397so c3397so) {
        this.d = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC3546vb(false));
        this.e = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC3546vb(true));
        String str = AbstractC3272qO.a;
        this.f = new C3217pO();
        this.g = new C0360Uh(19);
        this.h = new C2524cp(11);
        this.a = 4;
        this.b = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.c = 20;
    }
}
