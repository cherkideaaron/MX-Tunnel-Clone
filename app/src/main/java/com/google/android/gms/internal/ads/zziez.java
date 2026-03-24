package com.google.android.gms.internal.ads;

import defpackage.AbstractC0500aq;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class zziez extends zziew implements Set {

    @NotNull
    private final Set zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziez(@NotNull Set set) {
        super(set);
        AbstractC0500aq.m(set, "delegate");
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zziew, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return super.contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zziew, java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator iterator() {
        return new zziey(this.zza.iterator());
    }
}
