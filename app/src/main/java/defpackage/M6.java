package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class M6 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(M6.class, "notCompletedCount$volatile");
    public final InterfaceC3117ng[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public M6(InterfaceC3117ng[] interfaceC3117ngArr) {
        this.a = interfaceC3117ngArr;
        this.notCompletedCount$volatile = interfaceC3117ngArr.length;
    }
}
