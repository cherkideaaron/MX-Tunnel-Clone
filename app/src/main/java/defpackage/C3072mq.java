package defpackage;

import java.util.NoSuchElementException;

/* renamed from: mq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3072mq extends HK {
    public boolean a;
    public final /* synthetic */ Object b;

    public C3072mq(Object obj) {
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a) {
            throw new NoSuchElementException();
        }
        this.a = true;
        return this.b;
    }
}
