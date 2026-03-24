package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.ref.WeakReference;

/* renamed from: r2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3304r2 {
    public static final ExecutorC3250q2 a = new ExecutorC3250q2(new ExecutorC0342Tg(1));
    public static final int b = -100;
    public static Us c = null;
    public static Us d = null;
    public static Boolean e = null;
    public static boolean f = false;
    public static final C0569c4 m = new C0569c4(0);
    public static final Object n = new Object();
    public static final Object o = new Object();

    public static boolean d(Context context) {
        if (e == null) {
            try {
                int i = L3.a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) L3.class), Build.VERSION.SDK_INT >= 24 ? K3.a() | UserVerificationMethods.USER_VERIFY_PATTERN : 640).metaData;
                if (bundle != null) {
                    e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                e = Boolean.FALSE;
            }
        }
        return e.booleanValue();
    }

    public static void g(AbstractC3304r2 abstractC3304r2) {
        synchronized (n) {
            try {
                C0569c4 c0569c4 = m;
                c0569c4.getClass();
                W3 w3 = new W3(c0569c4);
                while (w3.hasNext()) {
                    AbstractC3304r2 abstractC3304r22 = (AbstractC3304r2) ((WeakReference) w3.next()).get();
                    if (abstractC3304r22 == abstractC3304r2 || abstractC3304r22 == null) {
                        w3.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void c();

    public abstract void e();

    public abstract void f();

    public abstract boolean h(int i);

    public abstract void i(int i);

    public abstract void j(View view);

    public abstract void l(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void m(CharSequence charSequence);
}
