package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: gO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2724gO {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(C2724gO.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(C2724gO.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(C2724gO.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(C2724gO.class, "blockingTasksInBuffer$volatile");
    public final AtomicReferenceArray a = new AtomicReferenceArray(UserVerificationMethods.USER_VERIFY_PATTERN);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final AbstractRunnableC3428tI a(AbstractRunnableC3428tI abstractRunnableC3428tI) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return abstractRunnableC3428tI;
        }
        if (abstractRunnableC3428tI.b) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, abstractRunnableC3428tI);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final AbstractRunnableC3428tI b() {
        AbstractRunnableC3428tI abstractRunnableC3428tI;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (abstractRunnableC3428tI = (AbstractRunnableC3428tI) this.a.getAndSet(i2, null)) != null) {
                if (abstractRunnableC3428tI.b) {
                    e.decrementAndGet(this);
                }
                return abstractRunnableC3428tI;
            }
        }
    }

    public final AbstractRunnableC3428tI c(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        AbstractRunnableC3428tI abstractRunnableC3428tI = (AbstractRunnableC3428tI) atomicReferenceArray.get(i2);
        if (abstractRunnableC3428tI != null && abstractRunnableC3428tI.b == z) {
            while (!atomicReferenceArray.compareAndSet(i2, abstractRunnableC3428tI, null)) {
                if (atomicReferenceArray.get(i2) != abstractRunnableC3428tI) {
                }
            }
            if (z) {
                e.decrementAndGet(this);
            }
            return abstractRunnableC3428tI;
        }
        return null;
    }
}
