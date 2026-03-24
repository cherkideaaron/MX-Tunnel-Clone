package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* renamed from: oN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3161oN extends AbstractC3325rN {
    public static Field e = null;
    public static boolean f = false;
    public static Constructor g = null;
    public static boolean h = false;
    public WindowInsets c;
    public C0130Gp d;

    public C3161oN() {
        this.c = i();
    }

    private static WindowInsets i() {
        if (!f) {
            try {
                e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f = true;
        }
        Field field = e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
        }
        if (!h) {
            try {
                g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            h = true;
        }
        Constructor constructor = g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // defpackage.AbstractC3325rN
    public AN b() {
        a();
        AN anG = AN.g(null, this.c);
        C0130Gp[] c0130GpArr = this.b;
        C3703yN c3703yN = anG.a;
        c3703yN.o(c0130GpArr);
        c3703yN.q(this.d);
        return anG;
    }

    @Override // defpackage.AbstractC3325rN
    public void e(C0130Gp c0130Gp) {
        this.d = c0130Gp;
    }

    @Override // defpackage.AbstractC3325rN
    public void g(C0130Gp c0130Gp) {
        WindowInsets windowInsets = this.c;
        if (windowInsets != null) {
            this.c = windowInsets.replaceSystemWindowInsets(c0130Gp.a, c0130Gp.b, c0130Gp.c, c0130Gp.d);
        }
    }

    public C3161oN(AN an) {
        super(an);
        this.c = an.f();
    }
}
