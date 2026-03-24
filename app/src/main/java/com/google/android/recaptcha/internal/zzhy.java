package com.google.android.recaptcha.internal;

import defpackage.AbstractC0500aq;
import defpackage.AbstractC2540d4;
import defpackage.C0055Ci;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzhy {

    @NotNull
    private List zza = C0055Ci.a;

    public final long zza(@NotNull long[] jArr) {
        List list = this.zza;
        List listA0 = AbstractC2540d4.a0(jArr);
        AbstractC0500aq.m(list, "<this>");
        ArrayList arrayList = new ArrayList(listA0.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(listA0);
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Long.valueOf(((Number) next).longValue() ^ ((Number) it.next()).longValue());
        }
        return ((Number) next).longValue();
    }

    public final void zzb(@NotNull long[] jArr) {
        this.zza = AbstractC2540d4.a0(jArr);
    }
}
