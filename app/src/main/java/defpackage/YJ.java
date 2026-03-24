package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class YJ {
    public final View b;
    public final HashMap a = new HashMap();
    public final ArrayList c = new ArrayList();

    public YJ(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof YJ)) {
            return false;
        }
        YJ yj = (YJ) obj;
        return this.b == yj.b && this.a.equals(yj.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        String strG = AbstractC3264qG.g(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n", "    values:");
        HashMap map = this.a;
        for (String str : map.keySet()) {
            strG = strG + "    " + str + ": " + map.get(str) + "\n";
        }
        return strG;
    }
}
