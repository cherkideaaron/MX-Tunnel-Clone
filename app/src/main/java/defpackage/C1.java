package defpackage;

import android.os.Looper;
import java.util.List;

/* loaded from: classes2.dex */
public final class C1 {
    public C3125no a(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C3125no(AbstractC3180oo.a(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }

    public int b() {
        return 1073741823;
    }

    public String c() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
