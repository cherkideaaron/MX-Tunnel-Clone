package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: vc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3547vc extends AbstractC2543d7 {

    @Nullable
    private final InterfaceC0168Jc _context;

    @Nullable
    private transient InterfaceC3493uc intercepted;

    public AbstractC3547vc(InterfaceC3493uc interfaceC3493uc) {
        this(interfaceC3493uc, interfaceC3493uc != null ? interfaceC3493uc.getContext() : null);
    }

    @Override // defpackage.InterfaceC3493uc
    @NotNull
    public InterfaceC0168Jc getContext() {
        InterfaceC0168Jc interfaceC0168Jc = this._context;
        AbstractC0500aq.j(interfaceC0168Jc);
        return interfaceC0168Jc;
    }

    @NotNull
    public final InterfaceC3493uc intercepted() {
        InterfaceC3493uc c0444Zg = this.intercepted;
        if (c0444Zg == null) {
            InterfaceC3601wc interfaceC3601wc = (InterfaceC3601wc) getContext().get(C3397so.b);
            c0444Zg = interfaceC3601wc != null ? new C0444Zg((AbstractC0219Mc) interfaceC3601wc, this) : this;
            this.intercepted = c0444Zg;
        }
        return c0444Zg;
    }

    @Override // defpackage.AbstractC2543d7
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC3493uc interfaceC3493uc = this.intercepted;
        if (interfaceC3493uc != null && interfaceC3493uc != this) {
            InterfaceC0134Hc interfaceC0134Hc = getContext().get(C3397so.b);
            AbstractC0500aq.j(interfaceC0134Hc);
            C0444Zg c0444Zg = (C0444Zg) interfaceC3493uc;
            do {
                atomicReferenceFieldUpdater = C0444Zg.n;
            } while (atomicReferenceFieldUpdater.get(c0444Zg) == AbstractC0500aq.c);
            Object obj = atomicReferenceFieldUpdater.get(c0444Zg);
            B8 b8 = obj instanceof B8 ? (B8) obj : null;
            if (b8 != null) {
                b8.o();
            }
        }
        this.intercepted = C0200La.b;
    }

    public AbstractC3547vc(InterfaceC3493uc interfaceC3493uc, InterfaceC0168Jc interfaceC0168Jc) {
        super(interfaceC3493uc);
        this._context = interfaceC0168Jc;
    }
}
