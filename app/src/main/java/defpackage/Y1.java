package defpackage;

import java.util.HashSet;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* loaded from: classes.dex */
public abstract class Y1 implements InterfaceC3384sb {
    public static final HashSet c = new HashSet();
    public final String a;
    public final String b;

    public Y1(String str, String str2) {
        this.a = str;
        this.b = str2;
        c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        return BoundaryInterfaceReflectionUtil.containsFeature(W1.a, this.b);
    }
}
