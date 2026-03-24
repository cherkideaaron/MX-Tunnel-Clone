package defpackage;

import android.view.View;
import java.util.ArrayList;

/* renamed from: Hm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0144Hm {
    public static final C0229Mm a = new C0229Mm();
    public static final AbstractC0263Om b;

    static {
        AbstractC0263Om abstractC0263Om = null;
        try {
            abstractC0263Om = (AbstractC0263Om) C0348Tm.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = abstractC0263Om;
    }

    public static void a(ArrayList arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i);
        }
    }
}
