package defpackage;

import android.window.BackEvent;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class V1 {
    public static final V1 a = new V1();

    @NotNull
    public final BackEvent a(float f, float f2, float f3, int i) {
        return new BackEvent(f, f2, f3, i);
    }

    public final float b(@NotNull BackEvent backEvent) {
        AbstractC0500aq.m(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(@NotNull BackEvent backEvent) {
        AbstractC0500aq.m(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(@NotNull BackEvent backEvent) {
        AbstractC0500aq.m(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(@NotNull BackEvent backEvent) {
        AbstractC0500aq.m(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
