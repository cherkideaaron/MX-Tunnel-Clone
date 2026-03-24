package defpackage;

import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: qM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3270qM {
    public static boolean a;
    public static Method b;
    public static final boolean c;

    static {
        c = Build.VERSION.SDK_INT >= 27;
    }
}
