package com.google.android.gms.internal.ads;

import defpackage.AbstractC3264qG;

/* loaded from: classes.dex */
public final class zzgjg extends RuntimeException {
    public zzgjg() {
        this(0);
    }

    public zzgjg(int i) {
        super(AbstractC3264qG.k(new StringBuilder(String.valueOf(i).length() + 3), "r: ", i));
    }

    public zzgjg(int i, Throwable th) {
        super("r: 2", th);
    }
}
