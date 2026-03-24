package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.achartengine.chart.TimeChart;

/* renamed from: Xi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0412Xi implements InterfaceC0192Kj, InterfaceC0209Lj {
    public final /* synthetic */ int a;
    public final InterfaceC3203pA b;

    public C0412Xi() {
        this.a = 1;
        this.b = AbstractC0069Df.i;
    }

    @Override // defpackage.InterfaceC3203pA
    public final Object get() {
        InterfaceC3203pA interfaceC3203pA = this.b;
        switch (this.a) {
            case 0:
                return new C0395Wi((InterfaceC3258qA) interfaceC3203pA.get());
            case 1:
                VK vk = (VK) interfaceC3203pA.get();
                HashMap map = new HashMap();
                Bz bz = Bz.a;
                Set setEmptySet = Collections.emptySet();
                if (setEmptySet == null) {
                    throw new NullPointerException("Null flags");
                }
                Long l = 30000L;
                map.put(bz, new C6(l.longValue(), Long.valueOf(TimeChart.DAY).longValue(), setEmptySet));
                Bz bz2 = Bz.c;
                Set setEmptySet2 = Collections.emptySet();
                if (setEmptySet2 == null) {
                    throw new NullPointerException("Null flags");
                }
                Long l2 = 1000L;
                map.put(bz2, new C6(l2.longValue(), Long.valueOf(TimeChart.DAY).longValue(), setEmptySet2));
                Bz bz3 = Bz.b;
                if (Collections.emptySet() == null) {
                    throw new NullPointerException("Null flags");
                }
                Long lValueOf = Long.valueOf(TimeChart.DAY);
                Long lValueOf2 = Long.valueOf(TimeChart.DAY);
                Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(MD.b)));
                if (setUnmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(bz3, new C6(lValueOf.longValue(), lValueOf2.longValue(), setUnmodifiableSet));
                if (vk == null) {
                    throw new NullPointerException("missing required property: clock");
                }
                if (map.keySet().size() < Bz.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new B6(vk, map);
            default:
                return new CE((ME) interfaceC3203pA.get());
        }
    }

    public /* synthetic */ C0412Xi(InterfaceC3148oA interfaceC3148oA, int i) {
        this.a = i;
        this.b = interfaceC3148oA;
    }
}
