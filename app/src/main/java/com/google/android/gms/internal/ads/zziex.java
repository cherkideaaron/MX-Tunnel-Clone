package com.google.android.gms.internal.ads;

import defpackage.AbstractC0500aq;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class zziex implements Iterator {
    private final /* synthetic */ Iterator zza;

    public zziex(@NotNull Iterator it) {
        AbstractC0500aq.m(it, "delegate");
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
