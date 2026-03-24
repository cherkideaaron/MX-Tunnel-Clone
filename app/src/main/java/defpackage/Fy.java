package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class Fy {
    public static final String a = C3130nt.f("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z) {
        String str = a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            C3130nt.d().a(str, cls.getName() + " " + (z ? "enabled" : "disabled"), new Throwable[0]);
        } catch (Exception e) {
            C3130nt.d().a(str, AbstractC3264qG.h(cls.getName(), " could not be ", z ? "enabled" : "disabled"), e);
        }
    }
}
