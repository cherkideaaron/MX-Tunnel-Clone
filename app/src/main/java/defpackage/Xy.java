package defpackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes2.dex */
public final class Xy extends A {
    @Override // defpackage.A
    public final Random a() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        AbstractC0500aq.l(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
