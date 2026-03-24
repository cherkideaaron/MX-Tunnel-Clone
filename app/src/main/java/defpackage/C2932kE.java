package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: kE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2932kE implements Iterator, InterfaceC3493uc {
    public int a;
    public Object b;
    public InterfaceC3493uc c;

    public final RuntimeException b() {
        int i = this.a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.a);
    }

    public final void d(InterfaceC3493uc interfaceC3493uc, Object obj) {
        this.b = obj;
        this.a = 3;
        this.c = interfaceC3493uc;
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        AbstractC0500aq.m(interfaceC3493uc, "frame");
    }

    @Override // defpackage.InterfaceC3493uc
    public final InterfaceC0168Jc getContext() {
        return C0021Ai.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.a;
            if (i != 0) {
                break;
            }
            this.a = 5;
            InterfaceC3493uc interfaceC3493uc = this.c;
            AbstractC0500aq.j(interfaceC3493uc);
            this.c = null;
            interfaceC3493uc.resumeWith(DK.a);
        }
        if (i == 1) {
            AbstractC0500aq.j(null);
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw b();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.a = 1;
            AbstractC0500aq.j(null);
            throw null;
        }
        if (i != 3) {
            throw b();
        }
        this.a = 0;
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.InterfaceC3493uc
    public final void resumeWith(Object obj) {
        AbstractC0115Ga.U(obj);
        this.a = 4;
    }
}
