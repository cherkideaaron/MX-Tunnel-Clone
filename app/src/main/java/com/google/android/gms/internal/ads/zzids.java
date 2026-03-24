package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class zzids implements Iterator {
    private final ArrayDeque zza;
    private zziak zzb;

    public /* synthetic */ zzids(zzian zzianVar, byte[] bArr) {
        zziak zziakVarZzb;
        if (zzianVar instanceof zzidt) {
            zzidt zzidtVar = (zzidt) zzianVar;
            ArrayDeque arrayDeque = new ArrayDeque(zzidtVar.zzp());
            this.zza = arrayDeque;
            arrayDeque.push(zzidtVar);
            zziakVarZzb = zzb(zzidtVar.zzo());
        } else {
            this.zza = null;
            zziakVarZzb = (zziak) zzianVar;
        }
        this.zzb = zziakVarZzb;
    }

    private final zziak zzb(zzian zzianVar) {
        while (zzianVar instanceof zzidt) {
            zzidt zzidtVar = (zzidt) zzianVar;
            this.zza.push(zzidtVar);
            zzianVar = zzidtVar.zzo();
        }
        return (zziak) zzianVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zziak next() {
        zziak zziakVarZzb;
        zziak zziakVar = this.zzb;
        if (zziakVar == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zziakVarZzb = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zziakVarZzb = zzb(((zzidt) arrayDeque.pop()).zzE());
        } while (zziakVarZzb.zzc() == 0);
        this.zzb = zziakVarZzb;
        return zziakVar;
    }
}
