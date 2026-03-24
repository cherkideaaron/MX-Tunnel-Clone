package com.google.android.gms.internal.ads;

import defpackage.AbstractC0500aq;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class zzifa implements Map.Entry {
    private final /* synthetic */ Map.Entry zza;

    public zzifa(@NotNull Map.Entry entry) {
        AbstractC0500aq.m(entry, "delegate");
        this.zza = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zza.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
